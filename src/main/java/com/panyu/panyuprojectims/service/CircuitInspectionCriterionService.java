package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.CircuitInspectionCriterion;
public interface CircuitInspectionCriterionService{


    //根据标准规范id和标准规范内容查询标准规范对象
    CircuitInspectionCriterion getCircuitInspectionCriterion(String circuitCriterionId, String circuitCriterionName);


    //根据检查项目id查询包含的标准规范
    List<CircuitInspectionCriterion> selectCircuitInspectionCriterionByCircuitProjectId(String circuitProjectId);

    //添加
    CircuitInspectionCriterion addCircuitInspectionCriterion(String circuitCriterionName,
                                                             String circuitProjectId);

    //修改
    int updateCircuitInspectionCriterion(String circuitCriterionId,
                                         String circuitCriterionName);

    //删除
    boolean deleteCircuitInspectionCriterion(String circuitCriterionId);

}