package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.PowerSupplyCriterion;
public interface PowerSupplyCriterionService{

    //根据检查项目id查询包含的标准规范
    List<PowerSupplyCriterion> selectPowerSupplyCriterionByPowerProjectId(String powerProjectId);

    //添加
    PowerSupplyCriterion insertPowerSupplyCriterion(String powerCriterionName, String powerProjectId);

    //修改
    PowerSupplyCriterion updatePowerSupplyCriterion(String powerCriterionName, String powerCriterionId);

    //删除
    boolean deletePowerSupplyCriterion(String powerCriterionId);
}