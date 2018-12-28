package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PowerSupplyModule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PowerSupplyModuleDao{

    //查询所有的模块信息
    List<PowerSupplyModule> selectAllPowerSupplyModule();

    //添加之前根据名字查询个数判断模块是否存在
    long getCountByPowerModuleName(@Param("powerModuleName") String powerModuleName);
    //添加模块
    int insertPowerSupplyModule(@Param("powerModuleName") String powerModuleName);
    //根据模块名字查询模块对象
    PowerSupplyModule selectPowerSupplyModuleByPowerModuleName(@Param("powerModuleName") String powerModuleName);

    //修改
    int updatePowerSupplyModule(@Param("powerModuleId") String powerModuleId, @Param("powerModuleName") String powerModuleName);

    //删除
    int deletePowerSupplyModule(@Param("powerModuleId") String powerModuleId);



}