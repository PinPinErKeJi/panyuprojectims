package com.panyu.panyuprojectims.controller.LL_controller.module_controller;

import com.panyu.panyuprojectims.entity.CircuitModule;
import com.panyu.panyuprojectims.service.CircuitModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("LL")
public class CircuitModuleController {
    @Autowired private CircuitModuleService circuitModuleService;

    //查询所有模块信息
    @RequestMapping("selectAllCircuitModule")
    public @ResponseBody List<CircuitModule> selectAllCircuitModule(){
        return circuitModuleService.selectAllCircuitModule();
    }

    //添加
    @RequestMapping("addCircuitModule")
    public @ResponseBody CircuitModule addCircuitModule(String circuitModuleName){
        return circuitModuleService.addCircuitModule(circuitModuleName);
    }

    //修改
    @RequestMapping("updateCircuitModule")
    public @ResponseBody CircuitModule updateCircuitModule(String circuitModuleId,String circuitModuleName){
        CircuitModule circuitModule = null;
        int i = circuitModuleService.updateCircuitModule(circuitModuleId, circuitModuleName);
        if(i > 0){
             circuitModule = circuitModuleService.selectCircuitModuleByCircuitModuleName(circuitModuleName);
        }
        return circuitModule;
    }

    //删除
    @RequestMapping("deleteCircuitModule")
    public @ResponseBody boolean deleteCircuitModule(String circuitModuleId){
     return circuitModuleService.deleteCircuitModule(circuitModuleId);
    }

}
