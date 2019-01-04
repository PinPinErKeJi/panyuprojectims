package com.panyu.panyuprojectims.controller.IC_controller.message_controller;

import com.panyu.panyuprojectims.service.IcCableLengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("IC")
public class IcCableLengthController {
    @Autowired private IcCableLengthService icCableLengthService;


    //添加
    @RequestMapping("insertIcCableLength")
    public @ResponseBody String insertIcCableLength(String cableLengthId, String networkLine, String photoelectricCompositeCable,
                               String sevenEighthsFeeder, String ahalfFeeder){
        cableLengthId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = icCableLengthService.insertIcCableLength(cableLengthId, networkLine, photoelectricCompositeCable,
                                                            sevenEighthsFeeder, ahalfFeeder);
        return cableLengthId;
    }
}
