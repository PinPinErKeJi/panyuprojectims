package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.HnSupervisorUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class HnSupervisorUnitController {
    @Autowired private HnSupervisorUnitService hnSupervisorUnitService;

    //添加
    @RequestMapping("insertHnSupervisorUnit")
    public @ResponseBody String insertHnSupervisorUnit(String supervisorUnitId, String onSiteSupervision, String professionResponsiblePerson, String districtHead) {
       //手动设置id
        supervisorUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        int i = hnSupervisorUnitService.insertHnSupervisorUnit(supervisorUnitId, onSiteSupervision, professionResponsiblePerson, districtHead);
            return supervisorUnitId;
    }
}
