package com.panyu.panyuprojectims.controller.PS_controller.module_controller;

import com.panyu.panyuprojectims.entity.PowerSupplyProject;
import com.panyu.panyuprojectims.service.PowerSupplyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("PS")
public class PowerSupplyProjectController {
    @Autowired private PowerSupplyProjectService powerSupplyProjectService;


    //根据分项工程id查询包含的检查项目
    @RequestMapping("selectPowerSupplyProjectByPowerSubWorkId")
    public @ResponseBody List<PowerSupplyProject> selectPowerSupplyProjectByPowerSubWorkId(String powerSubWorkId) {
        return powerSupplyProjectService.selectPowerSupplyProjectByPowerSubWorkId(powerSubWorkId);
    }

    //添加
    @RequestMapping("insertPowerSupplyProject")
    public @ResponseBody PowerSupplyProject insertPowerSupplyProject(String powerProjectName, String powerSubWorkId){
        return powerSupplyProjectService.insertPowerSupplyProject(powerProjectName,powerSubWorkId);
    }

    //修改
    @RequestMapping("updatePowerSupplyProject")
    public @ResponseBody PowerSupplyProject updatePowerSupplyProject(String powerProjectName, String powerProjectId){
        return powerSupplyProjectService.updatePowerSupplyProject(powerProjectName,powerProjectId);
    }

    @RequestMapping("deletePowerSupplyProject")
    public @ResponseBody boolean deletePowerSupplyProject(String powerProjectId){
        return powerSupplyProjectService.deletePowerSupplyProject(powerProjectId);
    }


}
