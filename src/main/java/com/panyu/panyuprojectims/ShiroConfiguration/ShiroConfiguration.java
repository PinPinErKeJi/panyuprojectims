package com.panyu.panyuprojectims.ShiroConfiguration;

import com.panyu.panyuprojectims.shiroRealm.MyShiroRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


@Configuration
public class ShiroConfiguration {
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
    //cookie对象;
    @Bean
    public SimpleCookie rememberMeCookie(){
        // 这个参数是cookie的名称，对应前端的checkbox 的name = rememberMe
        SimpleCookie simpleCookie=new SimpleCookie("rememberMe");
        simpleCookie.setMaxAge(300);
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
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        // 必须设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 拦截器.
        Map<String, String> map = new HashMap<String, String>();



        map.put("/static/**","anon");
        map.put("/css/**","anon");
        map.put("/js/**","anon");
        map.put("/img/**","anon");
        map.put("/bootstrap/**","anon");
        map.put("/easyui/**","anon");
        map.put("/pages/**","anon");
        map.put("/login/**","anon");

        map.put("/userLoginController/userlogin","anon");//匿名注册
       // map.put("/userLoginController/userlogin","anon");
        map.put("/login.html","anon");
        map.put("/register","anon");
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
