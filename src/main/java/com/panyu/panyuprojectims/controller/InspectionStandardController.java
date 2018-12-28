package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.InspectionStandard;
import com.panyu.panyuprojectims.service.InspectionStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class InspectionStandardController {

    @Autowired
    private InspectionStandardService inspectionStandardService;

    @RequestMapping("selectInspectionStandardById")
    public @ResponseBody List selectInspectionStandardById(String projectId){
        List<InspectionStandard> inspectionStandardList = inspectionStandardService.selectInspectionStandardById(projectId);
        return inspectionStandardList;
    }
    @RequestMapping("insertInspectionStandard")
    public @ResponseBody InspectionStandard insertInspectionStandard(@RequestParam("inspectionContent") String inspectionContent, String projectId){
        InspectionStandard inspectionStandard = inspectionStandardService.addInspectionStandard(inspectionContent, projectId);
        return inspectionStandard;
    }

    @RequestMapping("deleteInspectionStandardById")
    public @ResponseBody boolean deleteInspectionStandardById(String standardId){
        boolean flag;
        int i = inspectionStandardService.deleteInspectionStandardById(standardId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    @RequestMapping("updateStandard")
    public @ResponseBody InspectionStandard updateStandard(String standardId,@RequestParam("inspectionContent") String inspectionContent){
        InspectionStandard inspectionStandard = null;
        int i = inspectionStandardService.updateStandard(standardId, inspectionContent);
        if (i>0){
            inspectionStandard = inspectionStandardService.getInspectionStandard(standardId,inspectionContent);
        }
        return inspectionStandard;
    }
}
