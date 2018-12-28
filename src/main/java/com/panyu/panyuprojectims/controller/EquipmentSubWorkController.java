package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.EquipmentSubWork;
import com.panyu.panyuprojectims.service.EquipmentInspectionCriterionService;
import com.panyu.panyuprojectims.service.EquipmentInspectionProjectService;
import com.panyu.panyuprojectims.service.EquipmentSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EquipmentSubWorkController {

    @Autowired
    private EquipmentSubWorkService equipmentSubWorkService;
    @Autowired
    private EquipmentInspectionProjectService equipmentInspectionProjectService;
    @Autowired
    private EquipmentInspectionCriterionService equipmentInspectionCriterionService;

    @RequestMapping("deleteEquipmentSubWorkById")
    public @ResponseBody
    boolean deleteEquipmentSubWorkById(String equipmentSubWorkId){
        boolean flag = true;
        //根据分项工程ID查询检查项目集合
        List<String> list = equipmentInspectionProjectService.selectAllEquipmentProjectIdBySubWorkId(equipmentSubWorkId);
        //根据分项工程ID删除选中的内容
        int i = equipmentSubWorkService.deleteEquipmentSubWorkById(equipmentSubWorkId);
        //if判断list是否为空，空就return
        if (list.isEmpty()){
            return flag;
        }else {
            //不空就for循环删除，同时获取当前的子ID，并删除
            for (String s : equipmentInspectionProjectService.selectAllEquipmentProjectIdBySubWorkId(equipmentSubWorkId)) {
                int i1 = equipmentInspectionProjectService.deleteEquipmentInspectionProjectById(s);
                if (i1>0){
                    String s1 = equipmentInspectionCriterionService.selectAllEquipmentCriterionIdByProjectId(s);
                    if (s1 == null){
                        return flag;
                    }else {
                        int i2 = equipmentInspectionCriterionService.deleteEquipmentInspectionCriterionById(s1);
                    }
                }
            }
        return flag;
        }
    }

    @RequestMapping("insertEquipmentSubWork")
    public @ResponseBody
    EquipmentSubWork insertEquipmentSubWork(String equipmentSubWorkName,String equipmentSpecialityId){
        EquipmentSubWork equipmentSubWork = equipmentSubWorkService.addEquipmentSubWork(equipmentSubWorkName, equipmentSpecialityId);

        return equipmentSubWork;
    }

    @RequestMapping("selectAllEquipmentSubWorkByEquipmentSpecialityId")
    public @ResponseBody
    List<EquipmentSubWork> selectAllEquipmentSubWorkByEquipmentSpecialityId(String equipmentSpecialityId){
        List<EquipmentSubWork> list = equipmentSubWorkService.selectAllEquipmentSubWorkByEquipmentSpecialityId(equipmentSpecialityId);
        return list;
    }

    //修改
    @RequestMapping("updateEquipmentSubWork")
    public @ResponseBody EquipmentSubWork updateEquipmentSubWork(String equipmentSubWorkId,
                                                                    String equipmentSubWorkName){
        EquipmentSubWork equipmentSubWork = null;
        int i = equipmentSubWorkService.updateEquipmentSubWorkById(equipmentSubWorkId, equipmentSubWorkName);
        if(i > 0){
            equipmentSubWork = equipmentSubWorkService.getEquipmentSubWork(equipmentSubWorkId,equipmentSubWorkName);
            //System.out.println(equipmentSubWork);
        }
        return equipmentSubWork;
    }
}
