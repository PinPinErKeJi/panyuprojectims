package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.PowerMonitoring;

import java.util.List;

public interface PowerMonitoringService{

	//添加
	boolean insertPowerMonitoring(String powerMonitoringId,
                                  String powerConstructionMode,
                                  String powerSupplierName,
                                  String powerSupplierContacts,
                                  String powerUnitName,
                                  String powerUnitContacts);

    boolean deletePowerMonitoringById(String powerMonitoringId);

//查询动力监控ID
	List<PowerMonitoring> selectBypowerMonitoringId();
//根据动力监控表ID查询建设方式
	PowerMonitoring SelectByPowerMonitoringId(String powerMonitoringId);
}