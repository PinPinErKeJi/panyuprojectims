package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.IcPassiveDeviceNumberDao;
import com.panyu.panyuprojectims.service.IcPassiveDeviceNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class
IcPassiveDeviceNumberServiceImpl implements IcPassiveDeviceNumberService{
    @Autowired
    private IcPassiveDeviceNumberDao icPassiveDeviceNumberDao;


    //添加
    @Override
    public int insertIcPassiveDeviceNumber(String passiveDeviceNumberId, String powerDivider, String coupler, String roadConnector, String loadNumber) {
        return icPassiveDeviceNumberDao.insertIcPassiveDeviceNumber(passiveDeviceNumberId,powerDivider,coupler,roadConnector,loadNumber);
    }

    //根据无源器件数量ID删除选中项
    @Override
    public int deleteIcPassiveDeviceNumberById(String passiveDeviceNumberId) {
        return icPassiveDeviceNumberDao.deleteIcPassiveDeviceNumberById(passiveDeviceNumberId);
    }
}