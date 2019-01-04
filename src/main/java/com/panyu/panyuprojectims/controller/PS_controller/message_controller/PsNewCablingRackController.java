package com.panyu.panyuprojectims.controller.PS_controller.message_controller;

import com.panyu.panyuprojectims.service.PsNewCablingRackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("PS")
public class PsNewCablingRackController {
    @Autowired private PsNewCablingRackService psNewCablingRackService;


    //添加
    @RequestMapping("insertPsNewCablingRack")
    public @ResponseBody String insertPsNewCablingRack(String newCablingRackId, String newCablingRackNumber, String rackDesignStart, String rackEquipmentSupplier, String rackEquipmentLinkman){
        newCablingRackId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        int i = psNewCablingRackService.insertPsNewCablingRack(newCablingRackId, newCablingRackNumber, rackDesignStart, rackEquipmentSupplier, rackEquipmentLinkman);
        //System.out.println("1:"+newCablingRackId);
        return newCablingRackId;
    }


}
