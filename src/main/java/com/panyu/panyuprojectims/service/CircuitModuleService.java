package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.CircuitModule;
public interface CircuitModuleService{


    //根据模块名查询模块对象
    CircuitModule getCircuitModule(String circuitModuleName);


    //查询所有模块
    List<CircuitModule> selectAllCircuitModule();

    //添加
    CircuitModule addCircuitModule(String circuitModuleName);

    //修改
    int updateCircuitModule(String circuitModuleId, String circuitModuleName);

    //根据模块名查询模块对象
    CircuitModule selectCircuitModuleByCircuitModuleName(String circuitModuleName);

    //删除
    boolean deleteCircuitModule(String circuitModuleId);

}