package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.PowerSupplyModule;
import com.panyu.panyuprojectims.service.PowerSupplyModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PowerSupplyModuleController {
    @Autowired private PowerSupplyModuleService powerSupplyModuleService;


    //查询所有的模块信息
    @RequestMapping("selectAllPowerSupplyModule")
    public @ResponseBody List<PowerSupplyModule> selectAllPowerSupplyModule() {
        return powerSupplyModuleService.selectAllPowerSupplyModule();
    }

    //添加
    @RequestMapping("insertPowerSupplyModule")
    public @ResponseBody PowerSupplyModule insertPowerSupplyModule(String powerModuleName) {
        return powerSupplyModuleService.insertPowerSupplyModule(powerModuleName);
    }

    //修改
    @RequestMapping("updatePowerSupplyModule")
    public @ResponseBody PowerSupplyModule updatePowerSupplyModule(String powerModuleId, String powerModuleName){
        return powerSupplyModuleService.updatePowerSupplyModule(powerModuleId,powerModuleName);
    }

    @RequestMapping("deletePowerSupplyModule")
    public @ResponseBody boolean deletePowerSupplyModule(String powerModuleId){
        return powerSupplyModuleService.deletePowerSupplyModule(powerModuleId);
    }

}
