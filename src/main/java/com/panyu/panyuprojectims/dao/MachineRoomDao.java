package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.MachineRoom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MachineRoomDao{

	//添加
	int insertMachineRoom(@Param("machineRoomId") String machineRoomId,
                          @Param("machineRoomConstructionMode") String machineRoomConstructionMode,
                          @Param("machineRoomTypeName") String machineRoomTypeName,
                          @Param("machineRoomConstructionName") String machineRoomConstructionName,
                          @Param("civilEngineeringContacts") String civilEngineeringContacts,
                          @Param("machineRoomDecorateName") String machineRoomDecorateName,
                          @Param("decorationUnitContacts") String decorationUnitContacts);

//--------------------------删除开始----------------------------------------------//


    int deleteMachineRoomById(String machineRoomId);
//--------------------------删除结束---------------------------------------------//

//查询机房ID
	List<MachineRoom> selectBymachineRoomId();
//根据机房ID查询建设方式、机房类型
	MachineRoom SelectByMachineRoomId(String machineRoomId);
}