package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import java.util.UUID;

import com.panyu.panyuprojectims.dao.PsNewEquipmentDao;
import com.panyu.panyuprojectims.entity.PsNewEquipment;
import com.panyu.panyuprojectims.service.PsNewEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PsNewEquipmentServiceImpl implements PsNewEquipmentService{
    @Autowired
    private PsNewEquipmentDao psNewEquipmentDao;

    //添加
    @Override
    public int insertPsNewEquipment(String powerEquipmentId, String powerEquipmentNumber, String powerEquipmentType, String powerEquipmentModel, String equipmentDesignStart, String powerEquipmentSize, String powerEquipmentSupplier, String powerEquipmentLinkman) {
        String[] split = powerEquipmentType.split(",");
        int i1 = powerEquipmentSize.indexOf(".");
        return psNewEquipmentDao.insertPsNewEquipment(powerEquipmentId,powerEquipmentNumber,split[0],powerEquipmentModel,equipmentDesignStart,powerEquipmentSize,powerEquipmentSupplier,powerEquipmentLinkman);
    }

    //删除
    @Override
    public int deletePsNewEquipment(String powerEquipmentId) {
        return psNewEquipmentDao.deletePsNewEquipment(powerEquipmentId);
    }

}