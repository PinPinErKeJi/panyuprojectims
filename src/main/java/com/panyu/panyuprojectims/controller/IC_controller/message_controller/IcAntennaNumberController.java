package com.panyu.panyuprojectims.controller.IC_controller.message_controller;

import com.panyu.panyuprojectims.service.IcAntennaNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("IC")
public class IcAntennaNumberController {
    @Autowired private IcAntennaNumberService icAntennaNumberService;



    //添加
    @RequestMapping("insertIcAntennaNumber")
    public @ResponseBody String insertIcAntennaNumber(String antennaNumberId, String indoorAntenna, String outdoorAntenna,
                                 String elevatorAntenna, String gpsAntenna){
        antennaNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = icAntennaNumberService.insertIcAntennaNumber(antennaNumberId, indoorAntenna, outdoorAntenna, elevatorAntenna, gpsAntenna);
        return antennaNumberId;
    }
}
