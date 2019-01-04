package com.panyu.panyuprojectims.controller.BS_controller.message_controller;

import com.panyu.panyuprojectims.service.AirConditionerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("BS")
public class AirConditionerController {
    @Autowired private AirConditionerService airConditionerService;
    @RequestMapping("insertAirConditioner")
    public @ResponseBody
    String insertAirConditioner(String airConditionerId,
                                String airConstructionMode,
                                String conditioningBrandName,
                                String specificationTypeName,
                                String airUnitName,
                                String airConstructionContacts){


        String[] split = airConstructionMode.split(",");
        airConditionerId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        airConditionerService.insertAirConditioner(airConditionerId,split[0],conditioningBrandName,specificationTypeName,airUnitName,airConstructionContacts);
        return airConditionerId;
    }
}
