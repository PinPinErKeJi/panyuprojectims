package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.PowerSubWork;
import com.panyu.panyuprojectims.service.PowerSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PowerSubWorkController {
    @Autowired private PowerSubWorkService powerSubWorkService;

    //根据模块id查询包含的分项工程
    @RequestMapping("selectAllPowerSubWorkByPowerModuleId")
    public @ResponseBody List<PowerSubWork> selectAllPowerSubWorkByPowerModuleId(String powerModuleId) {
        return powerSubWorkService.selectAllPowerSubWorkByPowerModuleId(powerModuleId);
    }

    //添加
    @RequestMapping("insertPowerSubWork")
    public @ResponseBody PowerSubWork insertPowerSubWork(String powerSubWorkName, String powerModuleId){
        return powerSubWorkService.insertPowerSubWork(powerSubWorkName,powerModuleId);
    }

    //修改
    @RequestMapping("updatePowerSubWork")
    public @ResponseBody PowerSubWork updatePowerSubWork(String powerSubWorkName, String powerSubWorkId){
        return powerSubWorkService.updatePowerSubWork(powerSubWorkName,powerSubWorkId);
    }

    @RequestMapping("deletePowerSubWork")
    public @ResponseBody boolean deletePowerSubWork(String powerSubWorkId){
        return powerSubWorkService.deletePowerSubWork(powerSubWorkId);
    }

}
