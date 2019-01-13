package com.panyu.panyuprojectims.controller.Login_controller;

import com.panyu.panyuprojectims.service.A_RegisterPanyuUserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("userRegisterController")
public class A_RegisterPanyuUserController {

    @Autowired
    private A_RegisterPanyuUserService a_registerPanyuUserService;

    @RequestMapping("selectUserName")
    @ResponseBody
    public Map selectUserName(String userName){
        Map<String,String> map = new HashMap<>();
        int count = a_registerPanyuUserService.selectUserName(userName);
        if (count == 0){
            map.put("msg","1");
        }else {
            map.put("msg","2");
        }
        return map;
    }

    /*@RequestMapping("register")
    @ResponseBody
    public int userlogin(String userProvince, String userCity, String userCounty, String userCompanyName , String  userCompanycccNumber, String userName, String userEmail, String userPwd , String userTel){
        // 将用户名作为盐值
        ByteSource salt = ByteSource.Util.bytes(userName);
        *//* * MD5加密：
         *   使用SimpleHash类对原始密码进行加密。
         *  第一个参数代表使用MD5方式加密
         *  第二个参数为原始密码 *
         *  第三个参数为盐值，即用户名
         * 第四个参数为加密次数 *
         * 最后用toHex()方法将加密后的密码转成String
         *  *//*
        int result = 0;
        int count = a_registerPanyuUserService.selectUserEmail(userEmail);
        System.out.println("数量:"+count);
        String newPs = new SimpleHash("MD5", userPwd, salt, 1024).toHex();

        if (count == 0){
            result = a_registerPanyuUserService.register(userProvince,userCity,userCounty,userCompanyName,userCompanycccNumber,userName,userEmail,userTel,newPs);
            System.out.println("注册成功");
        }else {
            System.out.println("该用户已经存在");
        }
        return result;
    }*/
}
