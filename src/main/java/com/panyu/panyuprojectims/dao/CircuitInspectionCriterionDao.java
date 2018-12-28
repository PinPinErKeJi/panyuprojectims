package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.CircuitInspectionCriterion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CircuitInspectionCriterionDao{

    //根据标准规范id和标准规范内容查询标准规范对象
    CircuitInspectionCriterion getCircuitInspectionCriterion(@Param("circuitCriterionId") String circuitCriterionId,
                                                             @Param("circuitCriterionName") String circuitCriterionName);



    //根据检查项目id查询包含的标准规范
    List<CircuitInspectionCriterion> selectCircuitInspectionCriterionByCircuitProjectId(
            @Param("circuitProjectId") String circuitProjectId);

    //根据标准规范和检查项目id查询标准规范的数量，判断标准规范是否存在
    long getCountCircuitCriterionNameByCircuitCriterionNameAndCircuitProjectId(@Param("circuitCriterionName") String circuitCriterionName,
                                                                               @Param("circuitProjectId") String circuitProjectId);

    //添加
    int insertCircuitInspectionCriterion(@Param("circuitCriterionName") String circuitCriterionName,
                                         @Param("circuitProjectId") String circuitProjectId);

    //根据标准规范和检查项目id查询标准规范对象
    CircuitInspectionCriterion selectCircuitInspectionCriterionByCircuitCriterionNameAndCircuitProjectId(
            @Param("circuitCriterionName") String circuitCriterionName,
            @Param("circuitProjectId") String circuitProjectId);


    //修改
    int updateCircuitInspectionCriterion(@Param("circuitCriterionId") String circuitCriterionId,
                                         @Param("circuitCriterionName") String circuitCriterionName);

    //根据检查项目id查询包含的标准规范id
    List<String> selectCircuitCriterionIdByCircuitProjectId(@Param("circuitProjectId") String circuitProjectId);

    //删除
    int deleteCircuitInspectionCriterion(@Param("circuitCriterionId") String circuitCriterionId);

}