package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.EquipmentInspectionCriterion;
import com.panyu.panyuprojectims.service.EquipmentInspectionCriterionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EquipmentInspectionCriterionController {

    @Autowired
    private EquipmentInspectionCriterionService equipmentInspectionCriterionService;

    //根据标准规范ID删除相应的数据
    @RequestMapping("deleteEquipmentInspectionCriterionById")
    public @ResponseBody boolean deleteEquipmentInspectionCriterionById(String equipmentCriterionId){
        boolean flag = true;
        int i = equipmentInspectionCriterionService.deleteEquipmentInspectionCriterionById(equipmentCriterionId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    @RequestMapping("insertEquipmentInspectionCriterion")
    public @ResponseBody
    EquipmentInspectionCriterion insertEquipmentInspectionCriterion(String equipmentCriterionName,String equipmentProjectId){
        EquipmentInspectionCriterion equipmentInspectionCriterion = equipmentInspectionCriterionService.addEquipmentInspectionCriterion(equipmentCriterionName, equipmentProjectId);
        return equipmentInspectionCriterion;
    }

    @RequestMapping("selectEquipmentInspectionCriterionByEquipmentProjectId")
    public @ResponseBody
    List<EquipmentInspectionCriterion> selectEquipmentInspectionCriterionByEquipmentProjectId(String equipmentProjectId){
        List<EquipmentInspectionCriterion> equipmentInspectionCriterionList = equipmentInspectionCriterionService.selectEquipmentInspectionCriterionByEquipmentProjectId(equipmentProjectId);
        return equipmentInspectionCriterionList;
    }

    //修改
    @RequestMapping("updateEquipmentInspectionCriterion")
    public @ResponseBody EquipmentInspectionCriterion updateEquipmentInspectionCriterion(String equipmentCriterionId,
                                                                    @RequestParam("equipmentCriterionName")String equipmentCriterionName){
        EquipmentInspectionCriterion equipmentInspectionCriterion = null;
        int i = equipmentInspectionCriterionService.updateEquipmentInspectionCriterionById(equipmentCriterionId, equipmentCriterionName);
        if(i > 0){
            equipmentInspectionCriterion = equipmentInspectionCriterionService.getEquipmentInspectionCriterion(equipmentCriterionId,equipmentCriterionName);
        }
        return equipmentInspectionCriterion;
    }
}
