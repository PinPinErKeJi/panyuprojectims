package com.panyu.panyuprojectims.controller.FA_controller.module_controller;

import com.panyu.panyuprojectims.entity.EquipmentInspectionProject;
import com.panyu.panyuprojectims.service.EquipmentInspectionCriterionService;
import com.panyu.panyuprojectims.service.EquipmentInspectionProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("FA")
public class EquipmentInspectionProjectController {

    @Autowired
    private EquipmentInspectionProjectService equipmentInspectionProjectService;
    @Autowired
    private EquipmentInspectionCriterionService equipmentInspectionCriterionService;

    @RequestMapping("deleteEquipmentInspectionProjectById")
    public @ResponseBody
    boolean deleteEquipmentInspectionProjectById(String equipmentProjectId){
        boolean flag = true;
        int i = equipmentInspectionProjectService.deleteEquipmentInspectionProjectById(equipmentProjectId);
        String equipmentCriterionId = equipmentInspectionCriterionService.selectAllEquipmentCriterionIdByProjectId(equipmentProjectId);
        if (equipmentCriterionId != null){
            int i1 = equipmentInspectionCriterionService.deleteEquipmentInspectionCriterionById(equipmentCriterionId);
            if (i1>0){
                flag = true;
            }else {
                flag = false;
            }
            return flag;
        }
        return flag;
    }

    @RequestMapping("insertEquipmentInspectionProject")
    public @ResponseBody
    EquipmentInspectionProject insertEquipmentInspectionProject(String equipmentProjectName,String equipmentSubWorkId){
        EquipmentInspectionProject equipmentInspectionProject = equipmentInspectionProjectService.addEquipmentInspectionProject(equipmentProjectName, equipmentSubWorkId);
        return equipmentInspectionProject;
    }

    @RequestMapping("selectEquipmentInspectionProjectByEquipmentSubWorkId")
    public @ResponseBody
    List<EquipmentInspectionProject> selectEquipmentInspectionProjectByEquipmentSubWorkId(String equipmentSubWorkId){
        List<EquipmentInspectionProject> equipmentInspectionProjectList = equipmentInspectionProjectService.selectEquipmentInspectionProjectByEquipmentSubWorkId(equipmentSubWorkId);
        return equipmentInspectionProjectList;
    }

    //修改
    @RequestMapping("updateEquipmentInspectionProject")
    public @ResponseBody EquipmentInspectionProject updateEquipmentInspectionProject(String equipmentProjectId,
                                                                  @RequestParam("equipmentProjectName")String equipmentProjectName){
        EquipmentInspectionProject equipmentInspectionProject = null;
        int i = equipmentInspectionProjectService.updateEquipmentInspectionProjectById(equipmentProjectId, equipmentProjectName);
        if(i > 0){
            equipmentInspectionProject = equipmentInspectionProjectService.getEquipmentInspectionProject(equipmentProjectId,equipmentProjectName);
        }
        return equipmentInspectionProject;
    }
}
