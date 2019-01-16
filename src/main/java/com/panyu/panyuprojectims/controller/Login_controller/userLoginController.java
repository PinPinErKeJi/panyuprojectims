package com.panyu.panyuprojectims.controller.Login_controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.service.Impl.PanyuUserServiceImpl;
import com.panyu.panyuprojectims.service.PanyuUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@RequestMapping("/userLoginController")
@Controller
public class userLoginController {
    @Autowired
    private PanyuUserService panyuUserService;
    @RequestMapping("/userlogin")
   @ResponseBody
    public int userlogin(String userProvince,String userCity,String userCounty, String userCompanyName ,String  userCompanycccNumber,String userName, String userEmail, String userPwd ,String userTel){
       // String md5pwd= DigestUtils.md5DigestAsHex(userPwd.getBytes());
        // 将用户名作为盐值
        ByteSource salt = ByteSource.Util.bytes(userName);
         /* * MD5加密：
          *   使用SimpleHash类对原始密码进行加密。
          *  第一个参数代表使用MD5方式加密
          *  第二个参数为原始密码 *
          *  第三个参数为盐值，即用户名
          * 第四个参数为加密次数 *
          * 最后用toHex()方法将加密后的密码转成String
          *  */
        String newPs = new SimpleHash("MD5", userPwd, salt, 1024).toHex();
        int count=panyuUserService.register(userProvince,userCity,userCounty,userCompanyName,userCompanycccNumber,userName,userEmail,userTel,newPs,userPwd);
        return count;
    }
    @RequestMapping("/startlogin")
    @ResponseBody
    public String startlogin(String userName, String userPwd, @RequestParam(value = "rememberMe",required = false) boolean rememberMe, HttpSession session){
       // String userName=panyuUser.getUserName();
       // String userPwd=panyuUser.getUserPwd();
        String msg="";
        //获取当前的用户
        Subject currentUser = SecurityUtils.getSubject();
        //判断当前的用户是否已经认证（当前是否已经登录）
        if(!currentUser.isAuthenticated()){//如果当前没有登录
            //创建一个登录用户对象，传递用户名和密码
            UsernamePasswordToken token= new UsernamePasswordToken(userName,userPwd);
            //记住密码
            token.setRememberMe(rememberMe);

            try { //执行登录
                currentUser.login(token);
            } catch ( UnknownAccountException uae) {
                System.out.println("------------用户名错误----There is no user with username of " + token.getPrincipal());
                msg="1";
                // return "redirect:/error.html";
            }catch (IncorrectCredentialsException ice) {
                System.out.println("------------密码错误----Password for account " + token.getPrincipal() + " was incorrect!");
                msg="2";
                //  return "redirect:/error.html";
            } catch (LockedAccountException lae) {
                System.out.println("------账号被锁定---The account for username " + token.getPrincipal() + " is locked.  " +
                        "Please contact your administrator to unlock it.");
                msg="3";
              //  return "redirect:/error.html";
            } catch (AuthenticationException ae) {
                //unexpected condition?  error?
              //  return "redirect:/error.html";
            }

        }

        return msg;
    }
}
