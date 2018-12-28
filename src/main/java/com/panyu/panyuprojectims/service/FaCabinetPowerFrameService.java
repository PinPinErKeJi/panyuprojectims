package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.FaCabinetPowerFrame;

import java.util.List;
public interface FaCabinetPowerFrameService{



    //添加
    boolean insertFaCabinetPowerFrame(String equipmentId,
                                      String equipmentNumber,
                                      String equipmentType,
                                      String equipmentName,
                                      String equipmentModel,
                                      String equipmentDesignQuantity,
                                      String equipmentSize,
                                      String equipmentSupplier,
                                      String equipmentContacts);

    //根据设备，机柜，电源柜，配线架表ID删除选中项
    int deleteFaCabinetPowerFrameById(String equipmentId);

}