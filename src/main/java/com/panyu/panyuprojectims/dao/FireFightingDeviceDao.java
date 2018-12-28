package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.FireFightingDevice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FireFightingDeviceDao{

	//添加
	int insertFireFightingDevice(@Param("fireId") String fireId,
                                 @Param("fireConstructionMode") String fireConstructionMode,
                                 @Param("handHeldNumber") String handHeldNumber,
                                 @Param("sprayingMethodNumber") String sprayingMethodNumber,
                                 @Param("fireSupplierName") String fireSupplierName,
                                 @Param("fireSupplierContacts") String fireSupplierContacts,
                                 @Param("installationUnitName") String installationUnitName,
                                 @Param("installationUnitContacts") String installationUnitContacts);

//------------------------------删除开始-----------------------------------------------//
    int deleteFireFightingDeviceById(String fireId);
//------------------------------删除结束----------------------------------------------//


//查询消防设施ID
	List<FireFightingDevice> selectByfireId();
//根据消防设施ID查询建设方式
	FireFightingDevice SelectByFireId(String fireId);
}