package com.panyu.panyuprojectims.controller.HN_controller.module_controller;

import com.panyu.panyuprojectims.entity.GarrisonInspectionCriterion;
import com.panyu.panyuprojectims.service.GarrisonInspectionCriterionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("HN")
public class GarrisonInspectionCriterionController {
    @Autowired private GarrisonInspectionCriterionService garrisonInspectionCriterionService;

    //根据检查项目id查询包含的标准规范
    @RequestMapping("selectAllGarrisonInspectionCriterionByGarrisonProjectId")
    public @ResponseBody List<GarrisonInspectionCriterion> selectAllGarrisonInspectionCriterionByGarrisonProjectId(String garrisonProjectId){
        return garrisonInspectionCriterionService.selectAllGarrisonInspectionCriterionByGarrisonProjectId(garrisonProjectId);
    }
    //添加
    @RequestMapping("insertGarrisonInspectionCriterion")
    public @ResponseBody GarrisonInspectionCriterion insertGarrisonInspectionCriterion(String garrisonCriterionName, String garrisonProjectId){
        GarrisonInspectionCriterion garrisonInspectionCriterion = garrisonInspectionCriterionService.addGarrisonInspectionCriterion(garrisonCriterionName, garrisonProjectId);
        return garrisonInspectionCriterion;
    }
    //修改
    @RequestMapping("updateGarrisonInspectionCriterion")
    public @ResponseBody GarrisonInspectionCriterion  updateGarrisonInspectionCriterion(String garrisonCriterionName, String garrisonCriterionId){
        GarrisonInspectionCriterion garrisonInspectionCriterion = null;
        int i = garrisonInspectionCriterionService.updateGarrisonInspectionCriterion(garrisonCriterionName, garrisonCriterionId);
        if(i > 0){
            garrisonInspectionCriterion = garrisonInspectionCriterionService.getGarrisonInspectionCriterion(garrisonCriterionName,garrisonCriterionId);
        }
        return  garrisonInspectionCriterion;
    }
    //删除
    @RequestMapping("deleteGarrisonInspectionCriterion")
    public @ResponseBody int deleteGarrisonInspectionCriterion(String garrisonCriterionId){
        return garrisonInspectionCriterionService.deleteGarrisonInspectionCriterion(garrisonCriterionId);
    }
}
