package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.CircuitInspectionCriterion;
import com.panyu.panyuprojectims.service.CircuitInspectionCriterionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CircuitInspectionCriterionController {
    @Autowired private CircuitInspectionCriterionService circuitInspectionCriterionService;

    //根据检查项目id查询包含的标准规范
    @RequestMapping("selectCircuitInspectionCriterionByCircuitProjectId")
    public @ResponseBody List<CircuitInspectionCriterion> selectCircuitInspectionCriterionByCircuitProjectId(String circuitProjectId){
        return circuitInspectionCriterionService.selectCircuitInspectionCriterionByCircuitProjectId(circuitProjectId);
    }

    //添加
    @RequestMapping("addCircuitInspectionCriterion")
    public @ResponseBody CircuitInspectionCriterion addCircuitInspectionCriterion(String circuitCriterionName, String circuitProjectId){
        return circuitInspectionCriterionService.addCircuitInspectionCriterion(circuitCriterionName,circuitProjectId);
    }

    //修改
    @RequestMapping("updateCircuitInspectionCriterion")
    public @ResponseBody CircuitInspectionCriterion updateCircuitInspectionCriterion(String circuitCriterionId, String circuitCriterionName){
        CircuitInspectionCriterion circuitInspectionCriterion = null;
        int i = circuitInspectionCriterionService.updateCircuitInspectionCriterion(circuitCriterionId, circuitCriterionName);
        if(i > 0 ){
            circuitInspectionCriterion = circuitInspectionCriterionService.getCircuitInspectionCriterion(circuitCriterionId,circuitCriterionName);
        }
        return circuitInspectionCriterion;
    }

    //删除
    @RequestMapping("deleteCircuitInspectionCriterion")
    public @ResponseBody boolean deleteCircuitInspectionCriterion(String circuitCriterionId){
        return circuitInspectionCriterionService.deleteCircuitInspectionCriterion(circuitCriterionId);
    }
}
