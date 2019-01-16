package com.panyu.panyuprojectims.shiroRealm;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class ShiroLogoutFilter extends LogoutFilter {
    /**
     * 自定义登出,登出之后,清理当前用户redis部分缓存信息
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    protected  boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        Subject subject= getSubject(request,response);

        //登出
        subject.logout();
        //获取登出后重定向到的地址
        String redirectUrl=getRedirectUrl(request,response,subject);
        //重定向
        issueRedirect(request,response,redirectUrl);
        return false;
    }
}
