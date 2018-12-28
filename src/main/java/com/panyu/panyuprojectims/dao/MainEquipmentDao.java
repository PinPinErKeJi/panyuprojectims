package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.MainEquipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface MainEquipmentDao{

	//添加
	int insertMainEquipment(@Param("mainEquipmentId") String mainEquipmentId,
                            @Param("equipmentConstructionMode") String equipmentConstructionMode,
                            @Param("equipmentTypeName") String equipmentTypeName,
                            @Param("equipmentSupplierName") String equipmentSupplierName,
                            @Param("equipmentSupplierContacts") String equipmentSupplierContacts,
                            @Param("equipmentUnitName") String equipmentUnitName,
                            @Param("equipmentUnitContacts") String equipmentUnitContacts);

//-------------------------------删除开始----------------------------------------------//

    int deleteMainEquipmentById(String mainEquipmentId);
//-------------------------------删除结束----------------------------------------------//

//查询主设备ID
	List<MainEquipment> selectmainEquipmentId();
//根据主设备ID查询建设方式、主设备类型
	MainEquipment SelectByMainEquipmentId(String mainEquipmentId);
}