package com.panyu.panyuprojectims.shiroRealm;

import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.service.PanyuUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    private PanyuUserService panyuUserService;
    /**授权**/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {


        return null;

    }
    /**认证**/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取界面上输入的当前登录人的信息（用户名密码）
        UsernamePasswordToken curtoken= (UsernamePasswordToken) token;
        String userName=curtoken.getUsername();
        //根据当前登录的用户名从数据库查询，获取用户对象
        PanyuUser panyuUser= panyuUserService.queryInfoByUsername(userName);

        if(panyuUser==null){
            System.out.println("用户名不正确");
            return null;
        }else{
            String uuserName =panyuUser.getUserName();
            String password=panyuUser.getUserPwd();

            //System.out.println(uuserName);
            //盐值
            ByteSource salt=ByteSource.Util.bytes(userName);
            return  new SimpleAuthenticationInfo(uuserName,password,salt,getName());

        }

    }

}

