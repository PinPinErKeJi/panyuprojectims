package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.FireFightingDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class FireFightingDeviceController {
    @Autowired private FireFightingDeviceService fireFightingDeviceService;

    @RequestMapping("insertFireFightingDevice")
    public @ResponseBody
    String insertFireFightingDevice(String fireId,
                                    String fireConstructionMode,
                                    String handHeldNumber,
                                    String sprayingMethodNumber,
                                    String fireSupplierName,
                                    String fireSupplierContacts,
                                    String installationUnitName,
                                    String installationUnitContacts){

        String[] split = fireConstructionMode.split(",");
        fireId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        boolean b = fireFightingDeviceService.insertFireFightingDevice(fireId,split[0],
                handHeldNumber,
                sprayingMethodNumber,
                fireSupplierName,fireSupplierContacts,installationUnitName,installationUnitContacts);
        return fireId;
    }
}