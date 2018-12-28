package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.IcPassiveDeviceNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class IcPassiveDeviceNumberController {
    @Autowired private IcPassiveDeviceNumberService icPassiveDeviceNumberService;



    //添加
    @RequestMapping("insertIcPassiveDeviceNumber")
    public @ResponseBody String insertIcPassiveDeviceNumber(String passiveDeviceNumberId, String powerDivider, String coupler, String roadConnector, String loadNumber){
        passiveDeviceNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = icPassiveDeviceNumberService.insertIcPassiveDeviceNumber(passiveDeviceNumberId, powerDivider, coupler, roadConnector, loadNumber);
        return passiveDeviceNumberId;

    }
}
