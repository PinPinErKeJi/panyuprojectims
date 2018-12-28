package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.Garrison;
import com.panyu.panyuprojectims.service.GarrisonInspectionCriterionService;
import com.panyu.panyuprojectims.service.GarrisonInspectionProjectService;
import com.panyu.panyuprojectims.service.GarrisonService;
import com.panyu.panyuprojectims.service.GarrisonSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GarrisonController {

    @Autowired
    private GarrisonService garrisonService;
    @Autowired
    private GarrisonSubWorkService garrisonSubWorkService;
    @Autowired
    private GarrisonInspectionProjectService garrisonInspectionProjectService;
    @Autowired
    private GarrisonInspectionCriterionService garrisonInspectionCriterionService;

    //查询下拉框模块名称
    @RequestMapping("selectGarrison")
    public @ResponseBody
    List<Garrison> selectGarrison(){
        List<Garrison> garrisons = garrisonService.selectGarrison();
        return garrisons;
    }

    //添加
    @RequestMapping("insertGarrison")
    public @ResponseBody Garrison insertGarrison(String garrisonName){
        Garrison garrison = garrisonService.addGarrison(garrisonName);
        return garrison;
    }
    //修改
    @RequestMapping("updateGarrison")
    public @ResponseBody Garrison updateGarrison(String garrisonId,String garrisonName){
        Garrison garrison = null;
        int i = garrisonService.updateGarrison(garrisonId, garrisonName);
        if(i > 0){
            garrison = garrisonService.getGarrison(garrisonName);
        }
        return garrison;
    }
    //删除
    @RequestMapping("deleteGarrison")
    public @ResponseBody boolean deleteGarrison(String garrisonId){
        boolean flag = true;
        List<String> subWorkIdByGarrisonIdList = garrisonSubWorkService.selectAllGarrisonSubWorkIdByGarrisonId(garrisonId);
        int i = garrisonService.deleteGarrison(garrisonId);
        if(subWorkIdByGarrisonIdList.isEmpty()){
            return flag ;
        }else {
            for (String subWorkIdByGarrisonId : garrisonSubWorkService.selectAllGarrisonSubWorkIdByGarrisonId(garrisonId)) {
                int i1 = garrisonSubWorkService.deleteGarrisonSubWork(subWorkIdByGarrisonId);
                List<String> garrisonProjectIdList = garrisonInspectionProjectService.selectAllGarrisonProjectIdByGarrisonSubWorkId(subWorkIdByGarrisonId);
                if(garrisonProjectIdList.isEmpty()){
                    return flag;
                }else {
                    for (String garrisonProjectId : garrisonInspectionProjectService.selectAllGarrisonProjectIdByGarrisonSubWorkId(subWorkIdByGarrisonId)) {
                        int i2 = garrisonInspectionProjectService.deleteGarrisonInspectionProject(garrisonProjectId);
                        List<String> garrisonCriterionIdList = garrisonInspectionCriterionService.selectGarrisonCriterionIdByGarrisonProjectId(garrisonProjectId);
                        if(garrisonCriterionIdList.isEmpty()){
                            return flag;
                        }else {
                            for (String garrisonCriterionId : garrisonInspectionCriterionService.selectGarrisonCriterionIdByGarrisonProjectId(garrisonProjectId)) {
                                int i3 = garrisonInspectionCriterionService.deleteGarrisonInspectionCriterion(garrisonCriterionId);
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }
}
