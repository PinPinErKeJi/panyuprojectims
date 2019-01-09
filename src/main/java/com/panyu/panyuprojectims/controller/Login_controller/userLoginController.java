package com.panyu.panyuprojectims.controller.Login_controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.service.Impl.PanyuUserServiceImpl;
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
        String md5pwd= DigestUtils.md5DigestAsHex(userPwd.getBytes());

        int count=panyuUserService.register(userProvince,userCity,userCounty,userCompanyName,userCompanycccNumber,userName,userEmail,userTel,md5pwd);


        return count;
    }
}
