package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.PowerMonitoringDao;
import com.panyu.panyuprojectims.entity.PowerMonitoring;
import com.panyu.panyuprojectims.service.PowerMonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PowerMonitoringServiceImpl implements PowerMonitoringService{
    @Autowired
    private PowerMonitoringDao powerMonitoringDao;



    //添加
    @Override
    public boolean insertPowerMonitoring(String powerMonitoringId, String powerConstructionMode, String powerSupplierName, String powerSupplierContacts, String powerUnitName, String powerUnitContacts) {
        boolean flag = true;
        if(powerMonitoringId != null){
            int i = powerMonitoringDao.insertPowerMonitoring(powerMonitoringId,powerConstructionMode,powerSupplierName,powerSupplierContacts,powerUnitName,powerUnitContacts);
            flag = true;
        }else {
            flag = false;
        }
        return false;
    }

    @Override
    public boolean deletePowerMonitoringById(String powerMonitoringId){
        boolean flag = true;
        int i = powerMonitoringDao.deletePowerMonitoringById(powerMonitoringId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //查询动力监控ID
    @Override
    public List<PowerMonitoring> selectBypowerMonitoringId() {
        return powerMonitoringDao.selectBypowerMonitoringId();
    }
    //根据动力监控表ID查询建设方式
    @Override
    public PowerMonitoring SelectByPowerMonitoringId(String powerMonitoringId) {
        return powerMonitoringDao.SelectByPowerMonitoringId(powerMonitoringId);
    }
}