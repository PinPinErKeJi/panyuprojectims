package com.panyu.panyuprojectims.controller.HN_controller.module_controller;

import com.panyu.panyuprojectims.entity.GarrisonSubWork;
import com.panyu.panyuprojectims.service.GarrisonInspectionCriterionService;
import com.panyu.panyuprojectims.service.GarrisonInspectionProjectService;
import com.panyu.panyuprojectims.service.GarrisonSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("HN")
public class GarrisonSubWorkController {
    @Autowired
    private GarrisonSubWorkService garrisonSubWorkService;
    @Autowired
    private GarrisonInspectionProjectService garrisonInspectionProjectService;
    @Autowired
    private GarrisonInspectionCriterionService garrisonInspectionCriterionService;

    //根据模块id查询包含的分项工程
    @RequestMapping("selectAllGarrisonSubWorkByGarrisonId")
    public @ResponseBody List<GarrisonSubWork> selectAllGarrisonSubWorkByGarrisonId(String garrisonId){
        return garrisonSubWorkService.selectAllGarrisonSubWorkByGarrisonId(garrisonId);
    }
    //添加
    @RequestMapping("insertGarrisonSubWork")
    public @ResponseBody GarrisonSubWork insertGarrisonSubWork(
            String garrisonSubWorkName,String garrisonId){
        GarrisonSubWork garrisonSubWork = garrisonSubWorkService.addGarrisonSubWork(garrisonSubWorkName, garrisonId);
        return garrisonSubWork;
    }
    //修改
    @RequestMapping("updateGarrisonSubWork")
    public @ResponseBody GarrisonSubWork updateGarrisonSubWork(String garrisonSubWorkId,String garrisonSubWorkName){
        GarrisonSubWork GarrisonSubWork = null;
        int i = garrisonSubWorkService.updateGarrisonSubWork(garrisonSubWorkId, garrisonSubWorkName);
        if(i > 0){
            GarrisonSubWork = garrisonSubWorkService.getGarrisonSubWork(garrisonSubWorkId,garrisonSubWorkName);
        }
        return GarrisonSubWork;
    }
    //删除
    @RequestMapping("deleteGarrisonSubWork")
    public @ResponseBody boolean deleteGarrisonSubWork(String garrisonSubWorkId){
        boolean flag = true;
        //System.out.println("分项工程id:"+garrisonSubWorkId);
        List<String> garrisonProjectIdList = garrisonInspectionProjectService.selectAllGarrisonProjectIdByGarrisonSubWorkId(garrisonSubWorkId);
        //System.out.println("garrisonProjectIdList:"+garrisonProjectIdList);
        int i = garrisonSubWorkService.deleteGarrisonSubWork(garrisonSubWorkId);
        if(garrisonProjectIdList.isEmpty()){
            return  flag;
        }else {
            for (String garrisonProjectId : garrisonInspectionProjectService.selectAllGarrisonProjectIdByGarrisonSubWorkId(garrisonSubWorkId)) {
                int i1 = garrisonInspectionProjectService.deleteGarrisonInspectionProject(garrisonProjectId);
                List<String> garrisonCriterionIdList = garrisonInspectionCriterionService.selectGarrisonCriterionIdByGarrisonProjectId(garrisonProjectId);
                if(garrisonCriterionIdList.isEmpty()){
                    return flag;
                }else {
                    for (String garrisonCriterionId : garrisonInspectionCriterionService.selectGarrisonCriterionIdByGarrisonProjectId(garrisonProjectId)) {
                        int i2 = garrisonInspectionCriterionService.deleteGarrisonInspectionCriterion(garrisonCriterionId);
                    }
                }
            }
        }
        return flag;
    }
}
