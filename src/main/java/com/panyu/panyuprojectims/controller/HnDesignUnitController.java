package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.HnDesignUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class HnDesignUnitController {
    @Autowired private HnDesignUnitService hnDesignUnitService;

    //添加
    @RequestMapping("insertHnDesignUnit")
    public @ResponseBody String insertHnDesignUnit(String designUnitId, String designCorporateName, String designConstructionLinkman){
        designUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i = hnDesignUnitService.insertHnDesignUnit(designUnitId, designCorporateName, designConstructionLinkman);
        return designUnitId;
    }
}
