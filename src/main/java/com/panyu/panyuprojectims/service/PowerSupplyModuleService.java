package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.PowerSupplyModule;
public interface PowerSupplyModuleService{

    //查询所有的模块信息
    List<PowerSupplyModule> selectAllPowerSupplyModule();

    //添加
    PowerSupplyModule insertPowerSupplyModule(String powerModuleName);

    //修改
    PowerSupplyModule updatePowerSupplyModule(String powerModuleId, String powerModuleName);

    //删除
    boolean deletePowerSupplyModule(String powerModuleId);



}