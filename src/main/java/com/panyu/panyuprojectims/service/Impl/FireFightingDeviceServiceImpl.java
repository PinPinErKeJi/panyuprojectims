package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.FireFightingDeviceDao;
import com.panyu.panyuprojectims.entity.FireFightingDevice;
import com.panyu.panyuprojectims.service.FireFightingDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FireFightingDeviceServiceImpl implements FireFightingDeviceService{
    @Autowired
    private FireFightingDeviceDao fireFightingDeviceDao;


    //添加
    @Override
    public boolean insertFireFightingDevice(String fireId, String fireConstructionMode, String handHeldNumber, String sprayingMethodNumber, String fireSupplierName, String fireSupplierContacts, String installationUnitName, String installationUnitContacts) {

        int i1 = handHeldNumber.indexOf(".");
        int i2 = handHeldNumber.indexOf(".");

        boolean flag = true;
        if(fireId != null){
            int i = fireFightingDeviceDao.insertFireFightingDevice(fireId,fireConstructionMode,
                    handHeldNumber,
                    sprayingMethodNumber,fireSupplierName,fireSupplierContacts,installationUnitName,installationUnitContacts);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean deleteFireFightingDeviceById(String fireId){
        boolean flag = true;
        int i = fireFightingDeviceDao.deleteFireFightingDeviceById(fireId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }
//查询消防设施ID
    @Override
    public List<FireFightingDevice> selectByfireId() {
        return fireFightingDeviceDao.selectByfireId();
    }
//根据消防设施ID查询建设方式
    @Override
    public FireFightingDevice SelectByFireId(String fireId) {
        return fireFightingDeviceDao.SelectByFireId(fireId);
    }
}