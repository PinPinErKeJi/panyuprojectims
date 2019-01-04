package com.panyu.panyuprojectims.controller.FA_controller.message_controller;

import com.panyu.panyuprojectims.service.FaCabinetPowerFrameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("FA")
public class FaCabinetPowerFrameController {
    @Autowired
    private FaCabinetPowerFrameService faCabinetPowerFrameService;

    //添加
    @RequestMapping("insertFaCabinetPowerFrame")
    public @ResponseBody String insertFaCabinetPowerFrame(String equipmentId,
                                     String equipmentNumber,
                                     String equipmentType,
                                     String equipmentName,
                                     String equipmentModel,
                                     String equipmentDesignQuantity,
                                     String equipmentSize,
                                     String equipmentSupplier,
                                     String equipmentContacts) {
        String[] split = equipmentType.split(",");
        //System.out.println("equipmentDesignQuantity:"+equipmentDesignQuantity);
        equipmentId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        boolean b = faCabinetPowerFrameService.insertFaCabinetPowerFrame(equipmentId,
                equipmentNumber,
                split[0],
                equipmentName,
                equipmentModel,
                equipmentDesignQuantity,
                equipmentSize,
                equipmentSupplier,
                equipmentContacts);
        //System.out.println("split[0]:"+split[0]);
        //System.out.println("equipmentId:"+equipmentId);

        return equipmentId;
    }
}
