package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.PsNewPowerCable;
public interface PsNewPowerCableService{


    //添加
    int insertPsNewPowerCable(
            String newPowerCableId,
            String newPowerCableNumber,
            String newPowerCableModel,
            String newPowerCableRow,
            String powerSingleLength,
            String powerTotalLength,
            String beFrom,
            String beTo,
            String cableEquipmentSupplier,
            String cableEquipmentLinkman);

    //删除
    int deletePsNewPowerCable(String newPowerCableId);


}