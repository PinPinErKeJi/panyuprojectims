package com.panyu.panyuprojectims.controller.Login_controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.service.Impl.PanyuUserServiceImpl;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/userLoginController")
@Controller
public class userLoginController {
    @Autowired
    private PanyuUserServiceImpl panyuUserService;
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
        int count=panyuUserService.register(userProvince,userCity,userCounty,userCompanyName,userCompanycccNumber,userName,userEmail,userTel,newPs);
        return count;
    }
}
