package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.MachineRoom;

import java.util.List;

public interface MachineRoomService{


	//添加
	boolean insertMachineRoom(String machineRoomId,
                              String machineRoomConstructionMode,
                              String machineRoomTypeName,
                              String machineRoomConstructionName,
                              String civilEngineeringContacts,
                              String machineRoomDecorateName,
                              String decorationUnitContacts);

//---------------------------删除开始--------------------------------------//
    boolean deleteMachineRoomById(String machineRoomId);
//---------------------------删除结束--------------------------------------//


//查询机房ID
	List<MachineRoom> selectBymachineRoomId();
//根据机房ID查询建设方式、机房类型
	MachineRoom SelectByMachineRoomId(String machineRoomId);
}