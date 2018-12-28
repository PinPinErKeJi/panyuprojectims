package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PsNewPowerCable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PsNewPowerCableDao{

    //根据信息id查询对应的新增电力电缆对象
    PsNewPowerCable selectPsNewPowerCableByPowerInformationId(@Param("powerInformationId") String powerInformationId);

    //添加
    int insertPsNewPowerCable(
            @Param("newPowerCableId") String newPowerCableId,
            @Param("newPowerCableNumber") String newPowerCableNumber,
            @Param("newPowerCableModel") String newPowerCableModel,
            @Param("newPowerCableRow") String newPowerCableRow,
            @Param("powerSingleLength") String powerSingleLength,
            @Param("powerTotalLength") String powerTotalLength,
            @Param("beFrom") String beFrom,
            @Param("beTo") String beTo,
            @Param("cableEquipmentSupplier") String cableEquipmentSupplier,
            @Param("cableEquipmentLinkman") String cableEquipmentLinkman);

    //删除
    int deletePsNewPowerCable(@Param("newPowerCableId") String newPowerCableId);



}