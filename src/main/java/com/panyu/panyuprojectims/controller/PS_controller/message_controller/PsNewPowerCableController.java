package com.panyu.panyuprojectims.controller.PS_controller.message_controller;

import com.panyu.panyuprojectims.service.PsNewPowerCableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("PS")
public class PsNewPowerCableController {
    @Autowired private PsNewPowerCableService psNewPowerCableService;


    //添加
    @RequestMapping("insertPsNewPowerCable")
    public @ResponseBody String insertPsNewPowerCable(String newPowerCableId, String newPowerCableNumber, String newPowerCableModel,
                                 String newPowerCableRow, String powerSingleLength, String powerTotalLength,
                                 String beFrom, String beTo, String cableEquipmentSupplier, String cableEquipmentLinkman){
        newPowerCableId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        int i = psNewPowerCableService.insertPsNewPowerCable(newPowerCableId,newPowerCableNumber,newPowerCableModel,
                newPowerCableRow,powerSingleLength,powerTotalLength,
                beFrom,beTo,cableEquipmentSupplier,cableEquipmentLinkman);
        return newPowerCableId;
    }


}
