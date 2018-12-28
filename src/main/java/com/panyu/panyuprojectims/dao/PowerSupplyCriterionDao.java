package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PowerSupplyCriterion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PowerSupplyCriterionDao{

    //根据检查项目id查询包含的标准规范
    List<PowerSupplyCriterion> selectPowerSupplyCriterionByPowerProjectId(@Param("powerProjectId") String powerProjectId);

    //根据标准规范和检查项目id查询个数
    long getCountByPowerCriterionNameAndPowerProjectId(@Param("powerCriterionName") String powerCriterionName,
                                                       @Param("powerProjectId") String powerProjectId);
    //添加
    int insertPowerSupplyCriterion(@Param("powerCriterionName") String powerCriterionName,
                                   @Param("powerProjectId") String powerProjectId);
    //根据标准规范和检查项目id查询标准规范
    PowerSupplyCriterion selectPowerSupplyCriterionByPowerCriterionNameAndPowerProjectId(
            @Param("powerCriterionName") String powerCriterionName,
            @Param("powerProjectId") String powerProjectId);

    //修改
    int updatePowerSupplyCriterion(@Param("powerCriterionName") String powerCriterionName,
                                   @Param("powerCriterionId") String powerCriterionId);
    //根据标准规范和id查询标准规范
    PowerSupplyCriterion selectPowerSupplyCriterionByPowerCriterionNameAndPowerCriterionId(
            @Param("powerCriterionName") String powerCriterionName,
            @Param("powerCriterionId") String powerCriterionId);

    //根据检查项目ID查询检查标准规范ID
    List<String> selectPowerCriterionId(@Param("powerProjectId") String powerProjectId);
    //删除
    int deletePowerSupplyCriterion(@Param("powerCriterionId") String powerCriterionId);
}