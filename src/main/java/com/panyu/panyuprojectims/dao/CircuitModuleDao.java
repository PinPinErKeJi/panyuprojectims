package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.CircuitModule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CircuitModuleDao{

    //查询所有模块
    List<CircuitModule> selectAllCircuitModule();

    //根据名字插询总数，判断是否存在
    long getCountByCircuitModuleName(@Param("circuitModuleName") String circuitModuleName);
    //添加模块
    int insertCircuitModule(@Param("circuitModuleName") String circuitModuleName);
    //根据模块名字查询模块对象
    CircuitModule selectCircuitModuleByCircuitModuleName(@Param("circuitModuleName") String circuitModuleName);

    //修改
    int updateCircuitModule(@Param("circuitModuleId") String circuitModuleId, @Param("circuitModuleName") String circuitModuleName);

    //删除
    int deleteCircuitModule(@Param("circuitModuleId") String circuitModuleId);
}