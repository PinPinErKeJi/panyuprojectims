package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.IcConstructionOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class IcConstructionOrganizationController {
    @Autowired private IcConstructionOrganizationService icConstructionOrganizationService;


    //添加
    @RequestMapping("insertIcConstructionOrganization")
    public @ResponseBody String insertIcConstructionOrganization(String icConstructionId, String icCorporateName, String personInCharge){
        icConstructionId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = icConstructionOrganizationService.insertIcConstructionOrganization(icConstructionId, icCorporateName, personInCharge);
        return icConstructionId;
    }
}
