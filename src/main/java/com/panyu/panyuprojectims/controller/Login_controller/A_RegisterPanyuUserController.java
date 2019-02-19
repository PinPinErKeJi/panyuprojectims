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
}
