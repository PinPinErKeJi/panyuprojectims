package com.panyu.panyuprojectims.controller.LL_controller.message_controller;

import com.panyu.panyuprojectims.service.LlSupervisionUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("LL")
public class LlSupervisionUnitController {

    @Autowired
    private LlSupervisionUnitService llSupervisionUnitService;

    @RequestMapping("insertLlSupervisionUnit")
    public @ResponseBody String insertLlSupervisionUnit(
            String supervisionUnitId,
            String siteLeader,
            String professionResponsiblePerson,
            String districtHead
    ){
        supervisionUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = llSupervisionUnitService.insertLlSupervisionUnit(supervisionUnitId, siteLeader, professionResponsiblePerson, districtHead);
        return supervisionUnitId;
    }
}
