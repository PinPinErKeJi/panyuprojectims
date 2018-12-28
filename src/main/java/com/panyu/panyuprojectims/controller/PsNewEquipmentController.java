package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.PsNewEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class PsNewEquipmentController {
    @Autowired private PsNewEquipmentService psNewEquipmentService;


    //添加
    @RequestMapping("insertPsNewEquipment")
    public @ResponseBody String insertPsNewEquipment(String powerEquipmentId, String powerEquipmentNumber, String powerEquipmentType, String powerEquipmentModel, String equipmentDesignStart, String powerEquipmentSize, String powerEquipmentSupplier, String powerEquipmentLinkman){
        powerEquipmentId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        int i = psNewEquipmentService.insertPsNewEquipment(powerEquipmentId,
                powerEquipmentNumber,
                powerEquipmentType,
                powerEquipmentModel,
                equipmentDesignStart,
                powerEquipmentSize,
                powerEquipmentSupplier,
                powerEquipmentLinkman);

        return powerEquipmentId;
    }
}
