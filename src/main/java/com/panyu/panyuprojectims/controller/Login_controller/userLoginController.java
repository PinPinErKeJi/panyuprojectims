package com.panyu.panyuprojectims.controller.Login_controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/userLoginController")
@Controller
public class userLoginController {

    @RequestMapping("/userlogin")
    @ResponseBody
    public Object userlogin(String userCompanyName ,String userName, String  userCompanycccNumber,String userEmail, String userPwd ,String user_tel){

        System.out.println("我是conroller");
        System.out.println(userCompanyName);

        return null;
    }
}
