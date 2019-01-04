package com.panyu.panyuprojectims.controller.LL_controller.message_controller;

import com.panyu.panyuprojectims.service.LlConstructionUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("LL")
public class LlConstructionUnitController {

    @Autowired
    private LlConstructionUnitService llConstructionUnitService;

    @RequestMapping("insertLlConstructionUnit")
    public @ResponseBody String insertLlConstructionUnit(
            String constructionUnitId,
            String corporateName,
            String personInCharge
    ){
        constructionUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = llConstructionUnitService.insertLlConstructionUnit(constructionUnitId, corporateName, personInCharge);
        return constructionUnitId;
    }
}
