package com.panyu.panyuprojectims.controller.BS_controller.message_controller;

import com.panyu.panyuprojectims.service.PowerMonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("BS")
public class PowerMonitoringController {
    @Autowired private PowerMonitoringService powerMonitoringService;

    @RequestMapping("insertPowerMonitoring")
    public @ResponseBody
    String insertPowerMonitoring(String powerMonitoringId,
                                 String powerConstructionMode,
                                 String powerSupplierName,
                                 String powerSupplierContacts,
                                 String powerUnitName,
                                 String powerUnitContacts){
        powerMonitoringId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        String[] split = powerConstructionMode.split(",");
        boolean b = powerMonitoringService.insertPowerMonitoring(
                powerMonitoringId,split[0],
                powerSupplierName,
                powerSupplierContacts,
                powerUnitName,
                powerUnitContacts);
        return powerMonitoringId;
    }
}
