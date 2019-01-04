package com.panyu.panyuprojectims.controller.LL_controller.module_controller;

import com.panyu.panyuprojectims.entity.CircuitSubWork;
import com.panyu.panyuprojectims.service.CircuitSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("LL")
public class CircuitSubWorkController {
    @Autowired private CircuitSubWorkService circuitSubWorkService;


    //根据模块id查询包含的分项工程信息
    @RequestMapping("selectCircuitSubWorkByModuleId")
    public @ResponseBody List<CircuitSubWork> selectCircuitSubWorkByModuleId(String circuitModuleId){
        return circuitSubWorkService.selectCircuitSubWorkByModuleId(circuitModuleId);
    }

    //添加
    @RequestMapping("addCircuitSubWork")
    public @ResponseBody CircuitSubWork addCircuitSubWork(String circuitSubWorkName, String circuitModuleId){
        return circuitSubWorkService.addCircuitSubWork(circuitSubWorkName,circuitModuleId);
    }

    //修改
    @RequestMapping("updateCircuitSubWork")
    public @ResponseBody CircuitSubWork updateCircuitSubWork(String circuitSubWorkId, String circuitSubWorkName){
        CircuitSubWork circuitSubWork = null;
        int i = circuitSubWorkService.updateCircuitSubWork(circuitSubWorkId, circuitSubWorkName);
        if(i > 0){
            circuitSubWork = circuitSubWorkService.getCircuitSubWork(circuitSubWorkId,circuitSubWorkName);
        }
        return circuitSubWork;
    }

    //删除
    @RequestMapping("deleteCircuitSubWork")
    public @ResponseBody boolean deleteCircuitSubWork(String circuitSubWorkId){
        return circuitSubWorkService.deleteCircuitSubWork(circuitSubWorkId);
    }
}
