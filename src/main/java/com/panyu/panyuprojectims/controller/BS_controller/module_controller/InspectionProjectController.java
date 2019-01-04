package com.panyu.panyuprojectims.controller.BS_controller.module_controller;

import com.panyu.panyuprojectims.entity.InspectionProject;
import com.panyu.panyuprojectims.service.InspectionProjectService;
import com.panyu.panyuprojectims.service.InspectionStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("BS")
public class InspectionProjectController {

    @Autowired
    private InspectionProjectService inspectionProjectService;
    @Autowired
    private InspectionStandardService inspectionStandardService;

    @RequestMapping("selectInspectionProjectById")
    public @ResponseBody List selectInspectionProjectById(String subId){
        List<InspectionProject> projectList = inspectionProjectService.selectInspectionProjectById(subId);
        return projectList;
    }
    @RequestMapping("insertInspectionProject")
    public @ResponseBody InspectionProject insertInspectionProject(@RequestParam("projectName") String projectName, String subId){
        InspectionProject inspectionProject = inspectionProjectService.addProject(projectName, subId);

        return inspectionProject;
    }
    @RequestMapping("deleteInspectionProjectById")
    public @ResponseBody boolean deleteInspectionProjectById(String projectId){
        boolean flag = true;
        int i = inspectionProjectService.deleteInspectionProjectById(projectId);
        String s = inspectionStandardService.selectStandardProjectId(projectId);
        if(s!=null){
            //删除检查规范
            int i1 = inspectionStandardService.deleteInspectionStandardById(s);
            if (i1>0){
                flag = true;
            }else {
                flag = false;
            }
            return flag;
        }
        return flag;
    }

    @RequestMapping("updateProject")
    public @ResponseBody InspectionProject updateProject(String projectId,@RequestParam("projectName") String projectName){
        InspectionProject inspectionProject = null;
        int i = inspectionProjectService.updateProject(projectId, projectName);
        if (i>0){
            inspectionProject = inspectionProjectService.getInspectionProject(projectId,projectName);
        }
        return inspectionProject;
    }
}
