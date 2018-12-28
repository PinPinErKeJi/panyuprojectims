package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PsNewCablingRack;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PsNewCablingRackDao{

    //根据信息id查询新增走线架对象
    PsNewCablingRack selectPsNewCablingRackByPowerInformationId(@Param("powerInformationId") String powerInformationId);

    //添加
    int insertPsNewCablingRack(
            @Param("newCablingRackId") String newCablingRackId,
            @Param("newCablingRackNumber") String newCablingRackNumber,
            @Param("rackDesignStart") String rackDesignStart,
            @Param("rackEquipmentSupplier") String rackEquipmentSupplier,
            @Param("rackEquipmentLinkman") String rackEquipmentLinkman);

    //删除
    int deletePsNewCablingRack(@Param("newCablingRackId") String newCablingRackId);

}