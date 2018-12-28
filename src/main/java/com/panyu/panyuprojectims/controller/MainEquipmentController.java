package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.MainEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class MainEquipmentController {
    @Autowired private MainEquipmentService mainEquipmentService;

    @RequestMapping("insertMainEquipment")
    public @ResponseBody
    String insertMainEquipment(String mainEquipmentId,
                               String equipmentConstructionMode,
                               String equipmentTypeName,
                               String equipmentSupplierName,
                               String equipmentSupplierContacts,
                               String equipmentUnitName,
                               String equipmentUnitContacts){
        String[] split = equipmentConstructionMode.split(",");
        String[] split1 = equipmentTypeName.split(",");
        mainEquipmentId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        boolean b = mainEquipmentService.insertMainEquipment(
                mainEquipmentId,split[0], split1[0],
                equipmentSupplierName,
                equipmentSupplierContacts,
                equipmentUnitName,
                equipmentUnitContacts);
        return mainEquipmentId;
    }
}
