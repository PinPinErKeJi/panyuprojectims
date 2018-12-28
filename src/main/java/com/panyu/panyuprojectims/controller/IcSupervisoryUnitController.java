package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.IcSupervisoryUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class IcSupervisoryUnitController {
    @Autowired private IcSupervisoryUnitService icSupervisoryUnitService;


    //添加
    @RequestMapping("insertIcSupervisoryUnit")
    public @ResponseBody String insertIcSupervisoryUnit(String icSupervisoryUnitId, String professionResponsiblePerson, String districtHead, String siteLeader){
        //手动设置id，方便后续信息表的添加
        icSupervisoryUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = icSupervisoryUnitService.insertIcSupervisoryUnit(icSupervisoryUnitId, professionResponsiblePerson, districtHead, siteLeader);
        return icSupervisoryUnitId;
    }
}
