package com.panyu.panyuprojectims.filter;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.entity.ResponseResult;
import com.panyu.panyuprojectims.utils.IStatusMessage;
import com.panyu.panyuprojectims.utils.ShiroFilterUtils;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.DefaultSessionKey;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Deque;

/*
* 自定义过滤器，进行用户访问控制
*/
public class KickoutSessionFilter extends AccessControlFilter {

    private final static ObjectMapper objectMapper = new ObjectMapper();
    private String kickoutUrl;//踢出后的地址
    private boolean kickoutAfter = false; //默认踢出之前的用户
    private int maxSession = 1; //同一个账号最大回话数量 1
    private SessionManager sessionManager;
    private Cache<String, Deque<Serializable>> cache;

    public void setKickoutUrl(String kickoutUrl) {
        this.kickoutUrl = kickoutUrl;
    }

    public void setKickoutAfter(boolean kickoutAfter) {
        this.kickoutAfter = kickoutAfter;
    }

    public void setMaxSession(int maxSession) {
        this.maxSession = maxSession;
    }

    public void setSessionManager(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    // 设置Cache的key的前缀
    public void setCacheManager(CacheManager cacheManager) {
        //必须和ehcache缓存配置中的缓存name一致
        this.cache = cacheManager.getCache("shiro-activeSessionCache");
    }

    /**
     * 是否允许访问，返回true表示允许
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        return false;
    }

    /**
     * 表示访问拒绝时是否自己处理，如果返回true表示自己不处理且继续拦截器链执行，返回false表示自己已经处理了（比如重定向到另一个页面）。
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {

        Subject subject = getSubject(request, response);
        //检查登录授权并且没有记住我
        if (!subject.isAuthenticated() && !subject.isRemembered()) {
            //如果没有登录的话，按流程执行如果是就响应未登录
            //判断是否是ajax请求，
            ResponseResult responseResult = new ResponseResult();
            if (ShiroFilterUtils.isaAjax(request)) {
                System.out.println("当用户在其他地方登录，并且是ajax请求");
                responseResult.setCode(IStatusMessage.SystemStatus.MANY_LOGINS.getCode());
                responseResult.setMessage("您已经在别处登录，请修改密码或重新登录");
                out(response, responseResult);
                return false;
            } else {
                return true;
            }
        }
        //获取用户请求的uri
        HttpServletRequest req = (HttpServletRequest) request;
        String path = req.getRequestURI();
        System.out.println("当前请求的uri" + path);

        //执行登录
        if (path.equals("/toLogin")) {
            return true;
        }
        Session session = subject.getSession();
        //session.getTimeout();//session时间设置

        try {
            //当前用户
            PanyuUser panyuUser = (PanyuUser) subject.getPrincipal();
            String userName = panyuUser.getUserName();
            System.out.println("当前用户" + userName);
            Serializable sessionid = session.getId();
            System.out.println("当前用户sessionid" + sessionid);
            //读取缓存用户 没有就存入
            Deque<Serializable> deque = cache.get(userName);
            System.out.println("当前的deque" + deque);
            if (deque == null) {
                deque = new ArrayDeque<Serializable>();
            }
            // 如果队列没有此sessionid，用户没有被踢出就放入队列
            if (!deque.contains(sessionid) && session.getAttribute("kickout") == null) {
                //将sessionid存入队列
                deque.push(sessionid);
                //将用户的sessionid存入缓存
                cache.put(userName, deque);

            }

            //如果队列里的sessionId数超出最大会话数，开始踢人
            while (deque.size() > maxSession) {
                Serializable kickoutSessioniId = null;
                //是否踢出后天来登录的，默认是false ；即后者登录用户踢出前者登录的用户
                if (kickoutAfter) {
                    kickoutSessioniId = deque.removeFirst();//踢出后者
                } else {// 否则踢出前者
                    kickoutSessioniId = deque.removeLast();//踢出前者
                }
                //踢出后再更新缓存
                cache.put(userName, deque);

                try {
                    //获取被踢出的sessionid和session对象
                    Session kickoutSession = sessionManager.getSession(new DefaultSessionKey(kickoutSessioniId));
                    if (kickoutSession != null) {
                        //设置回话的kickout属性表示被踢出了
                        kickoutSession.setAttribute("kickout", true);
                    }
                } catch (Exception e) {
                }
            }

            // 如果被踢出了 直接退出，重定向到踢出后的地址
            if ((Boolean) session.getAttribute("kickout") != null && (Boolean) session.getAttribute("kickout") == true) {
                //回话被踢出了
                try {
                    subject.logout();
                } catch (Exception e) {
                }
                saveRequest(request);
                //重定向
                //WebUtils.issueRedirect(request, response, kickoutUrl);
                return isAjaxResponse(request, response);
            }
            return true;
        }catch(Exception e){

            return isAjaxResponse(request,response);
        }

    }
    /**
     * response输出json
     */
    public static void out(ServletResponse response,ResponseResult result){
        PrintWriter out = null;
        response.setCharacterEncoding("UTF-8");//设置编码
        response.setContentType("application/json");
        try {
            out = response.getWriter();
            out.println(objectMapper.writeValueAsString(result));//输出
            System.out.println("用户在线数量限制,响应json信息成功");
        } catch (IOException e) {
            System.out.println("用户在线数量限制,响应json信息出错");
            e.printStackTrace();
        }finally {
            if(null != out){
                out.flush();
                out.close();
            }
        }
    }
    public boolean isAjaxResponse(ServletRequest request,ServletResponse response) throws IOException {
        // ajax请求
        /**
         * 判断是否已经踢出
         * 1.如果是Ajax 访问，那么给予json返回值提示。
         * 2.如果是普通请求，直接跳转到登录页
         */
        //判断是不是ajax请求
        ResponseResult responseResult = new ResponseResult();
        if(ShiroFilterUtils.isaAjax(request)){
            responseResult.setCode(IStatusMessage.SystemStatus.MANY_LOGINS.getCode());
            responseResult.setMessage("您已在别处登录，请您修改密码或重新登录");
            out(response,responseResult);
        }else{
            // 重定向
            WebUtils.issueRedirect(request, response, kickoutUrl);
        }
        return false;
    }
}
