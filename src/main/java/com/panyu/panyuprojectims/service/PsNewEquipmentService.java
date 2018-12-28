package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.PsNewEquipment;
public interface PsNewEquipmentService{

    //添加
    int insertPsNewEquipment(
            String powerEquipmentId,
            String powerEquipmentNumber,
            String powerEquipmentType,
            String powerEquipmentModel,
            String equipmentDesignStart,
            String powerEquipmentSize,
            String powerEquipmentSupplier,
            String powerEquipmentLinkman);

    //删除
    int deletePsNewEquipment(String powerEquipmentId);


}