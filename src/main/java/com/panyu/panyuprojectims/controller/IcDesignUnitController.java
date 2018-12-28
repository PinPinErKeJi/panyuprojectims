package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.IcDesignUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class IcDesignUnitController {
    @Autowired private IcDesignUnitService icDesignUnitService;


    //添加
    @RequestMapping("insertIcDesignUnit")
    public @ResponseBody String insertIcDesignUnit(String icDesignUnitId, String designCorporateName, String designPersonInCharge){
        icDesignUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = icDesignUnitService.insertIcDesignUnit(icDesignUnitId, designCorporateName, designPersonInCharge);
        return icDesignUnitId;
    }
}
