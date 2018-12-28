package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.PowerSupplyCriterion;
import com.panyu.panyuprojectims.service.PowerSupplyCriterionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PowerSupplyCriterionController {
    @Autowired private PowerSupplyCriterionService powerSupplyCriterionService;


    //根据检查项目id查询包含的标准规范
    @RequestMapping("selectPowerSupplyCriterionByPowerProjectId")
    public @ResponseBody List<PowerSupplyCriterion> selectPowerSupplyCriterionByPowerProjectId(String powerProjectId){
        return powerSupplyCriterionService.selectPowerSupplyCriterionByPowerProjectId(powerProjectId);
    }

    //添加
    @RequestMapping("insertPowerSupplyCriterion")
    public @ResponseBody PowerSupplyCriterion insertPowerSupplyCriterion(String powerCriterionName, String powerProjectId){
        return powerSupplyCriterionService.insertPowerSupplyCriterion(powerCriterionName,powerProjectId);
    }

    //修改
    @RequestMapping("updatePowerSupplyCriterion")
    public @ResponseBody PowerSupplyCriterion updatePowerSupplyCriterion(String powerCriterionName, String powerCriterionId){
        return powerSupplyCriterionService.updatePowerSupplyCriterion(powerCriterionName,powerCriterionId);
    }

    @RequestMapping("deletePowerSupplyCriterion")
    public @ResponseBody boolean deletePowerSupplyCriterion(String powerCriterionId){
        return powerSupplyCriterionService.deletePowerSupplyCriterion(powerCriterionId);
    }


}
