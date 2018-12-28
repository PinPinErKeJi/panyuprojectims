package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.EquipmentInspectionCriterion;

import java.util.List;
public interface EquipmentInspectionCriterionService{

    //根据标准规范id和内容查询对象
    EquipmentInspectionCriterion getEquipmentInspectionCriterion(String equipmentCriterionId,
                                                                 String equipmentCriterionName);




    //添加
    EquipmentInspectionCriterion addEquipmentInspectionCriterion(String equipmentCriterionName,
                                                                 String equipmentProjectId);



    long getEquipmentInspectionCriterionRowCount();

    List<EquipmentInspectionCriterion> selectEquipmentInspectionCriterion();

    EquipmentInspectionCriterion selectEquipmentInspectionCriterionById(String id);

    //根据检查项目ID查询标准规范
    List<EquipmentInspectionCriterion> selectEquipmentInspectionCriterionByEquipmentProjectId(String equipmentProjectId);

    //根据检查项目ID查询出所有相应的标准规范ID
    String selectAllEquipmentCriterionIdByProjectId(String equipmentProjectId);
    //根据标准规范ID删除相应的数据
    int deleteEquipmentInspectionCriterionById(String equipmentCriterionId);
    //修改
    int updateEquipmentInspectionCriterionById(String equipmentCriterionId,
                                               String equipmentCriterionName);
}