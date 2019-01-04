package com.panyu.panyuprojectims.controller.HN_controller.module_controller;

import com.panyu.panyuprojectims.entity.GarrisonInspectionProject;
import com.panyu.panyuprojectims.service.GarrisonInspectionCriterionService;
import com.panyu.panyuprojectims.service.GarrisonInspectionProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("HN")
public class GarrisonInspectionProjectController {
    @Autowired
    private GarrisonInspectionProjectService garrisonInspectionProjectService;
    @Autowired
    private GarrisonInspectionCriterionService garrisonInspectionCriterionService;


    //根据分项工程id查询包含的检查项目
    @RequestMapping("selectAllGarrisonInspectionProjectByGarrisonSubWorkId")
    public @ResponseBody
    List<GarrisonInspectionProject> selectAllGarrisonInspectionProjectByGarrisonSubWorkId(
            String garrisonSubWorkId){
        return garrisonInspectionProjectService.selectAllGarrisonInspectionProjectByGarrisonSubWorkId(garrisonSubWorkId);
    }
    //添加
    @RequestMapping("insertGarrisonInspectionProject")
    public @ResponseBody GarrisonInspectionProject insertGarrisonInspectionProject(String garrisonProjectName, String garrisonSubWorkId){
        GarrisonInspectionProject garrisonInspectionProject = garrisonInspectionProjectService.addGarrisonInspectionProject(garrisonProjectName, garrisonSubWorkId);

        return garrisonInspectionProject;
    }
    //修改
    @RequestMapping("updateGarrisonInspectionProject")
    public @ResponseBody GarrisonInspectionProject updateGarrisonInspectionProject(String garrisonProjectName,String garrisonProjectId){
        GarrisonInspectionProject garrisonInspectionProject = null;
        int i = garrisonInspectionProjectService.updateGarrisonInspectionProject(garrisonProjectName, garrisonProjectId);
        if(i > 0 ){
            garrisonInspectionProject = garrisonInspectionProjectService.getGarrisonInspectionProject(garrisonProjectName,garrisonProjectId);
        }
        return garrisonInspectionProject;
    }
    //删除
    @RequestMapping("deleteGarrisonInspectionProject")
    public @ResponseBody boolean deleteGarrisonInspectionProject(String garrisonProjectId){
        boolean flag = true;
        List<String> garrisonCriterionIdList = garrisonInspectionCriterionService.selectGarrisonCriterionIdByGarrisonProjectId(garrisonProjectId);
        int i = garrisonInspectionProjectService.deleteGarrisonInspectionProject(garrisonProjectId);
        if(garrisonCriterionIdList.isEmpty()){
            return flag;
        }else {
            for (String garrisonCriterionId : garrisonInspectionCriterionService.selectGarrisonCriterionIdByGarrisonProjectId(garrisonProjectId)) {
                int i1 = garrisonInspectionCriterionService.deleteGarrisonInspectionCriterion(garrisonCriterionId);
            }
        }
        return flag;
    }
}
