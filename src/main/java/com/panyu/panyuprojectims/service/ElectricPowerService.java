package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.ElectricPower;

import java.util.List;

public interface ElectricPowerService{


	//添加
	boolean insertElectricPower(String electricPowerId,
                                String electricConstructionMode,
                                String electricType,
                                String electricUnitName,
                                String electricUnitContacts);

//-------------------------------删除开始-----------------------------------------------//
    boolean deleteElectricPowerById(String electricPowerId);
//-------------------------------删除结束-----------------------------------------------//


//查询动力监控ID
	List<ElectricPower> selectByelectricPowerId();
//根据外电引入ID查询建设方式、外电类型
	ElectricPower SelectByElectricPowerId(String electricPowerId);
}