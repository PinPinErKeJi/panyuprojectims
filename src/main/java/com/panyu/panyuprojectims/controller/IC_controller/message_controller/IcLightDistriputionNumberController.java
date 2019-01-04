package com.panyu.panyuprojectims.controller.IC_controller.message_controller;

import com.panyu.panyuprojectims.service.IcLightDistriputionNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("IC")
public class IcLightDistriputionNumberController {
    @Autowired private IcLightDistriputionNumberService icLightDistriputionNumberService;


    //添加
    @RequestMapping("insertIcLightDistriputionNumber")
    public @ResponseBody String insertIcLightDistriputionNumber(String lightNumberId, String easyMacro, String bookrruNotIntegratedAntenna,
                                           String bookrruIntegratedAntenna, String hub, String pruIntegratedAntenna,
                                           String pruNotIntegratedAntenna, String accessUnit, String extensionUnit,
                                           String remoteDeviceIndoor, String remoteDeviceOutdoor){
        lightNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = icLightDistriputionNumberService.insertIcLightDistriputionNumber(lightNumberId, easyMacro, bookrruNotIntegratedAntenna,
                bookrruIntegratedAntenna, hub, pruIntegratedAntenna,
                pruNotIntegratedAntenna, accessUnit, extensionUnit,
                remoteDeviceIndoor, remoteDeviceOutdoor);
        return lightNumberId;

    }
}
