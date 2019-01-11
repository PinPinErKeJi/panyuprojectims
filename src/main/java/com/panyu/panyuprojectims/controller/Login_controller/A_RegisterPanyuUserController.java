package com.panyu.panyuprojectims.controller.Login_controller;

import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.service.A_RegisterPanyuUserService;
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

    @RequestMapping("selectUserEmail")
    @ResponseBody
    public Map selectUserEmail(String userEmail){
        Map<String,String> map = new HashMap<>();
        PanyuUser panyuUser = a_registerPanyuUserService.selectUserEmail(userEmail);
        if (panyuUser == null){
            map.put("msg","1");
        }else {
            map.put("msg","2");
        }
        return map;
    }

    /*@RequestMapping("insertPanyuUser")
    public @ResponseBody PanyuUser insertPanyuUser(
            String userProvince,
            String userCity,
            String userCounty,
            String userCompanyName,
            String userCompanycccNumber,
            String userName,
            String userEmail,
            String userTel,
            String userPwd,
            String userState){

        int result = 0;
        PanyuUser panyuUser = panyuUserDao.selectUserEmail(userEmail);

        result= panyuUserService.insertPanyuUser(userProvince, userCity, userCounty, userCompanyName, userCompanycccNumber, userName, userEmail, userTel, userPwd, userState);
        if (result == 1){
            System.out.println("注册成功");
        }

        if (panyuUser !=null){
            System.out.println("该用户已经存在");
        }
        return panyuUser;
    }*/
}
