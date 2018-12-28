package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.FireFightingDevice;

import java.util.List;

public interface FireFightingDeviceService{

	//添加
	boolean insertFireFightingDevice(String fireId,
                                     String fireConstructionMode,
                                     String handHeldNumber,
                                     String sprayingMethodNumber,
                                     String fireSupplierName,
                                     String fireSupplierContacts,
                                     String installationUnitName,
                                     String installationUnitContacts);

//-------------------------------删除开始-------------------------------------------------//
    boolean deleteFireFightingDeviceById(String fireId);
//-------------------------------删除结束-------------------------------------------------//

//查询消防设施ID
	List<FireFightingDevice> selectByfireId();
//根据消防设施ID查询建设方式
	FireFightingDevice SelectByFireId(String fireId);
}