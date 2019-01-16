package com.panyu.panyuprojectims.controller.Login_controller;

import com.panyu.panyuprojectims.entity.ShiroRole;
import com.panyu.panyuprojectims.service.PanyuUserService;
import com.panyu.panyuprojectims.service.ShiroRoleService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/AM")
public class PanyuUserController {
    @Autowired private PanyuUserService panyuUserService;
    @Autowired private ShiroRoleService shiroRoleService;



    //删除用户
    @RequestMapping("/deletePanyuUser")
    @ResponseBody
    public boolean deletePanyuUser(String[] ids){
        System.out.println("删除:"+panyuUserService.deletePanyuUser(ids));
        System.out.println("用户:"+ids.toString());
        return panyuUserService.deletePanyuUser(ids);
    }

    //添加用户
    @RequestMapping("/addPanyuUser")
    @ResponseBody
   public  boolean addPanyuUser(String userName, String userPwd, String userlogpwd){
        ByteSource salt = ByteSource.Util.bytes(userName);
        String newPs = new SimpleHash("MD5", userlogpwd, salt, 1024).toHex();
        return  panyuUserService.addPanyuUser(userName,newPs,userlogpwd);
    }

    //分页展示用户
    @RequestMapping("queryAllPanyuUser")
    @ResponseBody
    public PageHelperUtil queryAllPanyuUser(Integer page, Integer rows,String userName) {
        System.out.println("名字:"+userName);
        return panyuUserService.queryAllPanyuUser(page,rows,userName);
    }
}
