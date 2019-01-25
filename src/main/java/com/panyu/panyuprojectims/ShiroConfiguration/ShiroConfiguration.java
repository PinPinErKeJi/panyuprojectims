package com.panyu.panyuprojectims.ShiroConfiguration;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.panyu.panyuprojectims.filter.KickoutSessionFilter;
import com.panyu.panyuprojectims.shiroRealm.MyShiroRealm;
import com.panyu.panyuprojectims.shiroRealm.ShiroLogoutFilter;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.CacheManager;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.io.ResourceUtils;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;



@Configuration
public class ShiroConfiguration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new DelegatingFilterProxy("shiroFilterFactoryBean"));
        filterRegistrationBean.setEnabled(true);
        filterRegistrationBean.addUrlPatterns("/*"); //过滤规则，即所有的请求
        filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST);

        return filterRegistrationBean;
    }
    // 1. 配置 SecurityManager!
    @Bean(name = "securityManager")
    public DefaultWebSecurityManager securityManager(@Qualifier(value = "myShiroRealm")MyShiroRealm myShiroRealm,
                                                     @Qualifier(value="cookieRememberMeManage")CookieRememberMeManager cookieRememberMeManage
    ){

        DefaultWebSecurityManager securityManager=new DefaultWebSecurityManager();

        //设置realm
        securityManager.setRealm(myShiroRealm);
        //注入ehcache缓存管理器;
        securityManager.setCacheManager(ehCacheManager());
        //注入session管理器;
        securityManager.setSessionManager(defaultWebSessionManager());
        //设置rememberMe管理器
        securityManager.setRememberMeManager(cookieRememberMeManage);

        return securityManager;
    }
    //realm
    @Bean(name = "myShiroRealm")
    public MyShiroRealm myShiroRealm(@Qualifier("ehCacheManager") EhCacheManager ehCacheManager,
                                     @Qualifier("hashedCredentialsMatcher") HashedCredentialsMatcher matcher){
        MyShiroRealm myShiroRealm=new MyShiroRealm();
        // 设置密码凭证匹配器
        myShiroRealm.setCredentialsMatcher(matcher);
        // 设置缓存管理器
        myShiroRealm.setCacheManager(ehCacheManager);
        return myShiroRealm;
    }
    //缓存管理器

    @Bean(value="ehCacheManager")
    public  EhCacheManager ehCacheManager(){
        EhCacheManager ehCacheManager=new EhCacheManager();
        CacheManager cacheManager = CacheManager.getCacheManager("shiro");
        if(cacheManager == null){
            try {
                cacheManager = CacheManager.create(ResourceUtils.getInputStreamForPath("classpath:ehcache.xml"));
            } catch (CacheException | IOException e) {
                e.printStackTrace();
            }
            //ehCacheManager.setCacheManagerConfigFile("classpath:ehcache.xml");
        }
        ehCacheManager.setCacheManager(cacheManager);
        return ehCacheManager;

    }
    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }

    /**
     * EnterpriseCacheSessionDAO shiro sessionDao层的实现；
     * 提供了缓存功能的会话维护，默认情况下使用MapCache实现，内部使用ConcurrentHashMap保存缓存的会话。
     */
      @Bean
    public EnterpriseCacheSessionDAO enterpriseCacheSessionDAO(){
        EnterpriseCacheSessionDAO enterpriseCacheSessionDAO = new EnterpriseCacheSessionDAO();
        //添加ehcache活跃缓存名称（必须和ehcache缓存名称一致）
        enterpriseCacheSessionDAO.setActiveSessionsCacheName("activeSessionCache");
        return  enterpriseCacheSessionDAO;
    }

    @Bean(name="sessionManager")
    public DefaultWebSessionManager defaultWebSessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setSessionDAO(enterpriseCacheSessionDAO());
        sessionManager.setSessionIdCookie(sessionIdCookie());
        return sessionManager;
    }

    //cookie对象;
    @Bean(name = "rememberMeCookie")
    public SimpleCookie rememberMeCookie(){
        // 这个参数是cookie的名称，对应前端的checkbox 的name = rememberMe
        SimpleCookie simpleCookie=new SimpleCookie("rememberMe");
        /**
         * 设置浏览器cookie过期时间，如果不设置默认为-1，表示关闭浏览器即过期
         * //记住我cookie生效时间30天 ,单位秒  [10天]
         */
        simpleCookie.setMaxAge(864000);
        return simpleCookie;

    }
    //记住我管理器 cookie管理对象;
    @Bean(name = "cookieRememberMeManage")
    public CookieRememberMeManager rememberMeManager(){

        CookieRememberMeManager cookieRememberMeManager=new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());
        return cookieRememberMeManager;
    }
    /*
    自定义cookie中session名称等配置
    */
    @Bean
    public SimpleCookie sessionIdCookie(){
        SimpleCookie simpleCookie = new SimpleCookie();
        //如果在Cookie中设置了"HttpOnly"属性，那么通过程序(JS脚本、Applet等)将无法读取到Cookie信息，这样能有效的防止XSS攻击。
        simpleCookie.setHttpOnly(true);
        simpleCookie.setName("SHRIOSESSIONID");
        //单位秒
        simpleCookie.setMaxAge(86400);
        return simpleCookie;

    }

    //密码匹配凭证管理器
    @Bean(name = "hashedCredentialsMatcher")
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher=new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");// 散列算法:这里使用MD5算法;
        hashedCredentialsMatcher.setHashIterations(1024);// 散列的次数，比如散列两次，
        return hashedCredentialsMatcher;
    }
    /**
     * 开启shiro aop注解支持. 使用代理方式;所以需要开启代码支持; Controller才能使用@RequiresPermissions
     *
    // * @param securityManager
     * @return
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor( @Qualifier(value = "securityManager") DefaultWebSecurityManager securityManager){

        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor=new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager((org.apache.shiro.mgt.SecurityManager) securityManager);
        return authorizationAttributeSourceAdvisor;
    }
    /**
     * 配置LogoutFilter
     * @return
     */
    public ShiroLogoutFilter shiroLogoutFilter(){
        ShiroLogoutFilter shiroLogoutFilter=new ShiroLogoutFilter();
        shiroLogoutFilter.setRedirectUrl("/login");
        return shiroLogoutFilter;
    }
    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        // 必须设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //添加kickout认证
        HashMap<String,Filter> hashMap=new HashMap<String,Filter>();
       // hashMap.put("kickout",kickoutSessionFilter());
        //shiroFilterFactoryBean.setFilters(hashMap);
        //登出
       // LinkedHashMap<String, Filter> filtersMap = new LinkedHashMap<>();
        hashMap.put("logout",shiroLogoutFilter());
        shiroFilterFactoryBean.setFilters(hashMap);
        // 拦截器.
        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        map.put("/static/**","anon");

        map.put("/userLoginController/userlogin","anon");//匿名注册
        map.put("/login.html","anon");
        map.put("/register","anon");
        map.put("/error.html","anon");
        map.put("/logout","logout");
       //map.put("/BS/getItemList", "roles[总监]");
       //map.put("/BS", "roles[总]");

        //对所有用户认证
        map.put("/*", "authc");
        map.put("/*.*", "authc");
        //map.put("/**", "authc");
        // 如果不设置默认会自动寻找Web工程根目录下的"/login"页面
        //shiroFilterFactoryBean.setLoginUrl("/toLogin.html");
        shiroFilterFactoryBean.setLoginUrl("/login.html");
        // 登录成功后要跳转的链接
        shiroFilterFactoryBean.setSuccessUrl("/index");
        // 未授权界面;
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return shiroFilterFactoryBean;
    }
}
