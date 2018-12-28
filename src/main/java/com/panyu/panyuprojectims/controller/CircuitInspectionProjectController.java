package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.CircuitInspectionProject;
import com.panyu.panyuprojectims.service.CircuitInspectionProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CircuitInspectionProjectController {
    @Autowired private CircuitInspectionProjectService circuitInspectionProjectService;


    //根据分项工程id查询包含的检查项目
    @RequestMapping("selectCircuitInspectionProjectBySubWorkId")
    public @ResponseBody List<CircuitInspectionProject> selectCircuitInspectionProjectBySubWorkId(String circuitSubWorkId){
        return circuitInspectionProjectService.selectCircuitInspectionProjectBySubWorkId(circuitSubWorkId);
    }

    //添加
    @RequestMapping("addCircuitInspectionProject")
    public @ResponseBody CircuitInspectionProject addCircuitInspectionProject(String circuitProjectName, String circuitSubWorkId){
        return circuitInspectionProjectService.addCircuitInspectionProject(circuitProjectName,circuitSubWorkId);
    }

    //修改
    @RequestMapping("updateCircuitInspectionProject")
    public @ResponseBody CircuitInspectionProject updateCircuitInspectionProject(String circuitProjectId, String circuitProjectName){
        CircuitInspectionProject circuitInspectionProject = null;
        int i = circuitInspectionProjectService.updateCircuitInspectionProject(circuitProjectId, circuitProjectName);
        if(i > 0){
            circuitInspectionProject = circuitInspectionProjectService.getCircuitInspectionProject(circuitProjectId,circuitProjectName);
        }
        return circuitInspectionProject;
    }

    //删除
    @RequestMapping("deleteCircuitInspectionProject")
    public @ResponseBody boolean deleteCircuitInspectionProject(String circuitProjectId){
        return circuitInspectionProjectService.deleteCircuitInspectionProject(circuitProjectId);
    }

}
