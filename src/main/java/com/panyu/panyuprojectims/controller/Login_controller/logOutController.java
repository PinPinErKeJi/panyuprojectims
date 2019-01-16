package com.panyu.panyuprojectims.controller.Login_controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@RequestMapping("/logOutController")
@Controller
public class logOutController {

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        Subject subject= SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login.html";
    }


}
