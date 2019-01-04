package com.panyu.panyuprojectims.controller.IC_controller.message_controller;

import com.panyu.panyuprojectims.service.IcBbuNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("IC")
public class IcBbuNumberController {
    @Autowired private IcBbuNumberService icBbuNumberService;


    //添加
    @RequestMapping("insertIcBbuNumber")
    public @ResponseBody String insertIcBbuNumber(String bbuNumberId, String centralization, String wallHangingWall){
        bbuNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = icBbuNumberService.insertIcBbuNumber(bbuNumberId, centralization, wallHangingWall);
        return bbuNumberId;
    }
}


