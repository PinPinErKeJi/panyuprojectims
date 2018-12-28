package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaCabinetPowerFrame;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaCabinetPowerFrameDao{

    //添加
    int insertFaCabinetPowerFrame(@Param("equipmentId") String equipmentId,
                                  @Param("equipmentNumber") String equipmentNumber,
                                  @Param("equipmentType") String equipmentType,
                                  @Param("equipmentName") String equipmentName,
                                  @Param("equipmentModel") String equipmentModel,
                                  @Param("equipmentDesignQuantity") String equipmentDesignQuantity,
                                  @Param("equipmentSize") String equipmentSize,
                                  @Param("equipmentSupplier") String equipmentSupplier,
                                  @Param("equipmentContacts") String equipmentContacts);

    //根据设备，机柜，电源柜，配线架表ID删除选中项
    int deleteFaCabinetPowerFrameById(@Param("equipmentId") String equipmentId);

    //根据设备信息id查询FaCabinetPowerFrame
    FaCabinetPowerFrame getFaCabinetPowerFrame(@Param("equipmentInformationId") String equipmentInformationId);
}