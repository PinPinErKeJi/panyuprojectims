package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PsNewEquipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PsNewEquipmentDao{

    //根据信息id查询新增设备对象
    PsNewEquipment selectPsNewEquipmentByPowerInformationId(@Param("powerInformationId") String powerInformationId);

    //添加
    int insertPsNewEquipment(
            @Param("powerEquipmentId") String powerEquipmentId,
            @Param("powerEquipmentNumber") String powerEquipmentNumber,
            @Param("powerEquipmentType") String powerEquipmentType,
            @Param("powerEquipmentModel") String powerEquipmentModel,
            @Param("equipmentDesignStart") String equipmentDesignStart,
            @Param("powerEquipmentSize") String powerEquipmentSize,
            @Param("powerEquipmentSupplier") String powerEquipmentSupplier,
            @Param("powerEquipmentLinkman") String powerEquipmentLinkman);

    //删除
    int deletePsNewEquipment(@Param("powerEquipmentId") String powerEquipmentId);



}