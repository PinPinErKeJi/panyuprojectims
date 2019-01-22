package com.panyu.panyuprojectims.shiroRealm;

import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.service.PanyuUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    private PanyuUserService panyuUserService;
    /**授权
     * 此方法调用  hasRole,hasPermission的时候才会进行回调.
     *1、如果用户正常退出，缓存自动清空；
     *2、 如果用户非正常退出，缓存自动清空；
     *3、如果我们修改了用户的权限，而用户不退出系统，修改的权限无法立即生效。
     * （需要手动编程进行实现；放在service进行调用）
     * 在权限修改后调用realm中的方法，realm已经由spring管理，所以从spring中获取realm实例，
     *

     * **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("我是授权被调用");
        //获取当前登录的用户名
        String userName = (String) principals.fromRealm(getName()).iterator().next();
        //根据用户名，查询当前登录的用户所拥有的所有角色
        List<String> roleList=panyuUserService.queryRolesByUsername(userName);
        //根据用户名，查询当前登录的用户所拥有的所有权限
        List<String> funList=panyuUserService.queryResByUsername(userName);
        for (String roleName : roleList){
            System.out.println("role----------------"+roleName);
        }
        for (String funName : funList) {
            System.out.println("fun----------------"+funName);
        }

        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //告诉shiro当前用户的角色
        if(roleList!=null && roleList.size()>0){
            info.addRoles(roleList);
        }
        //告诉shiro当前用户的权限
        if(funList!=null && funList.size()>0){
            info.addStringPermissions(funList);
        }
        return info;
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
            //盐值
            ByteSource salt=ByteSource.Util.bytes(userName);
            return  new SimpleAuthenticationInfo(uuserName,password,salt,getName());

        }

    }

}

