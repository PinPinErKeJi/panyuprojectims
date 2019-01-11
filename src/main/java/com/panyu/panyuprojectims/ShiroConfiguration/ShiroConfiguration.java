package com.panyu.panyuprojectims.ShiroConfiguration;

import com.panyu.panyuprojectims.shiroRealm.MyShiroRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
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
import java.util.HashMap;
import java.util.Map;


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
        ehCacheManager.setCacheManagerConfigFile("classpath:ehcache.xml");
        return ehCacheManager;

    }

    @Bean(name="sessionManager")
    public DefaultWebSessionManager defaultWebSessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();

        sessionManager.setGlobalSessionTimeout(1800000);
        sessionManager.setDeleteInvalidSessions(true);
        sessionManager.setSessionValidationSchedulerEnabled(true);
        sessionManager.setDeleteInvalidSessions(true);
        sessionManager.setSessionIdCookie(rememberMeCookie());
        return sessionManager;
    }

    //cookie对象;
    @Bean(name = "rememberMeCookie")
    public SimpleCookie rememberMeCookie(){
        // 这个参数是cookie的名称，对应前端的checkbox 的name = rememberMe
        SimpleCookie simpleCookie=new SimpleCookie("rememberMe");
        //HttpOnly标志的引入是为了防止设置了该标志的cookie被JavaScript读取，
        simpleCookie.setHttpOnly(true);
        /**
         * 设置浏览器cookie过期时间，如果不设置默认为-1，表示关闭浏览器即过期
         * cookie的单位为秒 比如60*60为1小时
         */
        simpleCookie.setMaxAge(-1);
        return simpleCookie;

    }
    //记住我管理器 cookie管理对象;
    @Bean(name = "cookieRememberMeManage")
    public CookieRememberMeManager rememberMeManager(){

        CookieRememberMeManager cookieRememberMeManager=new CookieRememberMeManager();
        cookieRememberMeManager.setCookie(rememberMeCookie());
        return cookieRememberMeManager;
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
    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();

        // 必须设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 拦截器.
        Map<String, String> map = new HashMap<String, String>();

        map.put("/static/**","anon");
        map.put("/login/**","anon");

        map.put("/userLoginController/userlogin","anon");//匿名注册
        map.put("/login.html","anon");
        map.put("/register","anon");
        map.put("/error.html","anon");
        map.put("/logout", "logout");
        //对所有用户认证
        map.put("/*", "authc");
        map.put("/*.*", "authc");
       // map.put("/**", "authc");
        // 如果不设置默认会自动寻找Web工程根目录下的"/login"页面
        shiroFilterFactoryBean.setLoginUrl("/login.html");
        // 登录成功后要跳转的链接
        shiroFilterFactoryBean.setSuccessUrl("/index");
        // 未授权界面;
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

        return shiroFilterFactoryBean;
    }


}
