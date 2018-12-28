package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.EquipmentInspectionCriterion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EquipmentInspectionCriterionDao{

    //根据标准规范id和内容查询对象
    EquipmentInspectionCriterion getEquipmentInspectionCriterion(@Param("equipmentCriterionId") String equipmentCriterionId,
                                                                 @Param("equipmentCriterionName") String equipmentCriterionName);




    long getEquipmentInspectionCriterionRowCount();

    List<EquipmentInspectionCriterion> selectEquipmentInspectionCriterion();

    EquipmentInspectionCriterion selectEquipmentInspectionCriterionById(String id);

    //根据名字查询个数
    int getCountByEquipmentCriterionName(@Param("equipmentCriterionName") String equipmentCriterionName,
                                         @Param("equipmentProjectId") String equipmentProjectId);
    //根据检查项目ID查询标准规范
    List<EquipmentInspectionCriterion> selectEquipmentInspectionCriterionByEquipmentProjectId(@Param("equipmentProjectId") String equipmentProjectId);
    //导入设备专业模块信息数据时调用标准规范添加方法
    int insertEquipmentInspectionCriterion(@Param("equipmentCriterionName") String equipmentCriterionName,
                                           @Param("equipmentProjectId") String equipmentProjectId);
    //添加标准规范数据之后根据名称查询返回对象
    EquipmentInspectionCriterion selectInspectionCriterionByCriterionName(@Param("equipmentCriterionName") String equipmentCriterionName,
                                                                          @Param("equipmentProjectId") String equipmentProjectId);
    //根据检查项目ID查询出所有相应的标准规范ID
    String selectAllEquipmentCriterionIdByProjectId(String equipmentProjectId);
    //根据标准规范ID删除相应的数据
    int deleteEquipmentInspectionCriterionById(String equipmentCriterionId);
    //修改
    int updateEquipmentInspectionCriterionById(@Param("equipmentCriterionId") String equipmentCriterionId,
                                               @Param("equipmentCriterionName") String equipmentCriterionName);
}