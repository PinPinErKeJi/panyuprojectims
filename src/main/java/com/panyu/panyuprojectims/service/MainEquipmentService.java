package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.MainEquipment;

import java.util.List;

public interface MainEquipmentService{

	//添加
	boolean insertMainEquipment(String mainEquipmentId,
                                String equipmentConstructionMode,
                                String equipmentTypeName,
                                String equipmentSupplierName,
                                String equipmentSupplierContacts,
                                String equipmentUnitName,
                                String equipmentUnitContacts);
//-----------------------------删除开始---------------------------------------------------//
    boolean deleteMainEquipmentById(String mainEquipmentId);
//-----------------------------删除结束--------------------------------------------------//


//查询主设备ID
	List<MainEquipment> selectmainEquipmentId();
//根据主设备ID查询建设方式、主设备类型
	MainEquipment SelectByMainEquipmentId(String mainEquipmentId);
}