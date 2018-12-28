package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.EquipmentSpeciality;
import com.panyu.panyuprojectims.service.EquipmentInspectionCriterionService;
import com.panyu.panyuprojectims.service.EquipmentInspectionProjectService;
import com.panyu.panyuprojectims.service.EquipmentSpecialityService;
import com.panyu.panyuprojectims.service.EquipmentSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EquipmentSpecialityController {

    @Autowired
    private EquipmentSpecialityService equipmentSpecialityService;
    @Autowired
    private EquipmentSubWorkService equipmentSubWorkService;
    @Autowired
    private EquipmentInspectionProjectService equipmentInspectionProjectService;
    @Autowired
    private EquipmentInspectionCriterionService equipmentInspectionCriterionService;

    @RequestMapping("selectEquipmentSpeciality")
    public @ResponseBody
    List selectEquipmentSpeciality(String equipmentSpecialityId,String equipmentSpecialityName){
        List<EquipmentSpeciality> equipmentSpecialityList = equipmentSpecialityService.selectEquipmentSpeciality();
        return equipmentSpecialityList;
    }

    @RequestMapping("deleteEquipmentSpecialityById")
    public @ResponseBody
    boolean deleteEquipmentSpecialityById(String equipmentSpecialityId){
        boolean flag = true;
        //根据moduleID查询检查项目ID集合
        List<String> list = equipmentSubWorkService.selectAllSubWorkIdByModuleId(equipmentSpecialityId);
        //根据ID删除选中项
        int i = equipmentSpecialityService.deleteEquipmentSpecialityById(equipmentSpecialityId);
        //if判断list是否为空，空就return
        if (list.isEmpty()){
            return flag;
        }else {
            for (String equipmentSubWorkId : equipmentSubWorkService.selectAllSubWorkIdByModuleId(equipmentSpecialityId)) {
                int i1 = equipmentSubWorkService.deleteEquipmentSubWorkById(equipmentSubWorkId);
                List<String> stringList = equipmentInspectionProjectService.selectAllEquipmentProjectIdBySubWorkId(equipmentSubWorkId);
                if (stringList.isEmpty()){
                    return flag;
                }else {
                    for (String equipmentProjectId : equipmentInspectionProjectService.selectAllEquipmentProjectIdBySubWorkId(equipmentSubWorkId)) {
                        int i2 = equipmentInspectionProjectService.deleteEquipmentInspectionProjectById(equipmentProjectId);

                        String equipmentCriterionId = equipmentInspectionCriterionService.selectAllEquipmentCriterionIdByProjectId(equipmentProjectId);
                        if (equipmentCriterionId == null){
                            return flag;
                        }else {
                            int i3 = equipmentInspectionCriterionService.deleteEquipmentInspectionCriterionById(equipmentCriterionId);
                        }
                    }
                }
            }
            return flag;
        }
    }

    //添加方法
    @RequestMapping("insertEquipmentSpeciality")
    public @ResponseBody
    EquipmentSpeciality insertEquipmentSpeciality(String equipmentSpecialityName){
        EquipmentSpeciality equipmentSpeciality = equipmentSpecialityService.addEquipmentSpeciality(equipmentSpecialityName);
        return equipmentSpeciality;

    }

    //修改
    @RequestMapping("updateEquipmentSpeciality")
    public @ResponseBody EquipmentSpeciality updateEquipmentSpeciality(String equipmentSpecialityId,@RequestParam("equipmentSpecialityName")String equipmentSpecialityName){
        EquipmentSpeciality equipmentSpeciality = null;
        int i = equipmentSpecialityService.updateEquipmentSpecialityById(equipmentSpecialityId, equipmentSpecialityName);
        if(i > 0){
             equipmentSpeciality = equipmentSpecialityService.selectEquipmentSpecialityBySpecialityName(equipmentSpecialityName);
        }
        return equipmentSpeciality;
    }
}
