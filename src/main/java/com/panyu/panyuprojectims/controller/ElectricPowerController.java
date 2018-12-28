package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.ElectricPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class ElectricPowerController {
    @Autowired private ElectricPowerService electricPowerService;
    @RequestMapping("insertElectricPower")
    public @ResponseBody String insertElectricPower(String electricPowerId,
                                                    String electricConstructionMode,
                                                    String electricType,
                                                    String electricUnitName,
                                                    String electricUnitContacts){
        String[] split = electricConstructionMode.split(",");
        String[] split1 = electricType.split(",");
        electricPowerId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        boolean b = electricPowerService.insertElectricPower(electricPowerId,split[0], split1[0],
                electricUnitName,electricUnitContacts);
        return electricPowerId;
    }
}
