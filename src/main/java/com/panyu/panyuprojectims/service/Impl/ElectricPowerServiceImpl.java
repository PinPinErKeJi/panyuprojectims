package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.ElectricPowerDao;
import com.panyu.panyuprojectims.entity.ElectricPower;
import com.panyu.panyuprojectims.service.ElectricPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ElectricPowerServiceImpl implements ElectricPowerService{
    @Autowired
    private ElectricPowerDao electricPowerDao;


    //添加
    @Override
    public boolean insertElectricPower(String electricPowerId, String electricConstructionMode, String electricType, String electricUnitName, String electricUnitContacts) {
        boolean flag = true;
        if(electricPowerId != null){
            int i = electricPowerDao.insertElectricPower(electricPowerId,electricConstructionMode, electricType, electricUnitName,electricUnitContacts);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }




    @Override
    public boolean deleteElectricPowerById(String electricPowerId){

        boolean flag = true;
        int i = electricPowerDao.deleteElectricPowerById(electricPowerId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

//查询动力监控ID
    @Override
    public List<ElectricPower> selectByelectricPowerId() {
        return electricPowerDao.selectByelectricPowerId();
    }
//根据外电ID查询建设方式、外电类型
    @Override
    public ElectricPower SelectByElectricPowerId(String electricPowerId) {
        return electricPowerDao.SelectByElectricPowerId(electricPowerId);
    }
}