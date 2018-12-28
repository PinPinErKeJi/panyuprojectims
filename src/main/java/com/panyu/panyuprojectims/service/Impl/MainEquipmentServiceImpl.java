package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.MainEquipmentDao;
import com.panyu.panyuprojectims.entity.MainEquipment;
import com.panyu.panyuprojectims.service.MainEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MainEquipmentServiceImpl implements MainEquipmentService{
    @Autowired
    private MainEquipmentDao mainEquipmentDao;


    //添加
    @Override
    public boolean insertMainEquipment(String mainEquipmentId, String equipmentConstructionMode, String equipmentTypeName, String equipmentSupplierName, String equipmentSupplierContacts, String equipmentUnitName, String equipmentUnitContacts) {
        boolean flag = true;
        if(mainEquipmentId !=null){
            int i = mainEquipmentDao.insertMainEquipment(mainEquipmentId,equipmentConstructionMode,
                    equipmentTypeName,equipmentSupplierName,equipmentSupplierContacts,equipmentUnitName,equipmentUnitContacts);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean deleteMainEquipmentById(String mainEquipmentId){
        boolean flag = true;
        int i = mainEquipmentDao.deleteMainEquipmentById(mainEquipmentId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }
   //查询主设备ID
    @Override
    public List<MainEquipment> selectmainEquipmentId() {
        return mainEquipmentDao.selectmainEquipmentId();
    }
    //根据主设备ID查询建设方式、主设备类型
    @Override
    public MainEquipment SelectByMainEquipmentId(String mainEquipmentId) {
        return mainEquipmentDao.SelectByMainEquipmentId(mainEquipmentId);
    }
}