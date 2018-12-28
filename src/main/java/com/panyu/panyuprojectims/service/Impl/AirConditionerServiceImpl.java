package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.AirConditionerDao;
import com.panyu.panyuprojectims.entity.AirConditioner;
import com.panyu.panyuprojectims.service.AirConditionerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AirConditionerServiceImpl implements AirConditionerService{
    @Autowired
    private AirConditionerDao airConditionerDao;

    @Override
    public long getAirConditionerRowCount(){
        return airConditionerDao.getAirConditionerRowCount();
    }
    @Override
    public List<AirConditioner> selectAirConditioner(){
        return airConditionerDao.selectAirConditioner();
    }
    @Override
    public AirConditioner selectAirConditionerByObj(AirConditioner obj){
        return airConditionerDao.selectAirConditionerByObj(obj);
    }

    //添加
    @Override
    public boolean insertAirConditioner(String airConditionerId, String airConstructionMode, String conditioningBrandName, String specificationTypeName, String airUnitName, String airConstructionContacts) {
        boolean flag = true;
        if(airConditionerId !=null){
            int i = airConditionerDao.insertAirConditioner(airConditionerId,airConstructionMode,
                    conditioningBrandName,specificationTypeName,airUnitName,airConstructionContacts);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    @Override
    public int insertNonEmptyAirConditioner(AirConditioner value){
        return airConditionerDao.insertNonEmptyAirConditioner(value);
    }

    @Override
    public boolean deleteAirConditionerById(String airConditionerId){

        boolean flag = true;
        int i = airConditionerDao.deleteAirConditionerById(airConditionerId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

//查询空调ID
    @Override
    public List<AirConditioner> selectByairConditionerId() {
        return airConditionerDao.selectByairConditionerId();
    }
//根据空调ID查询建设方式
    @Override
    public AirConditioner SelectByAirConditionerId(String airConditionerId) {
        return airConditionerDao.SelectByAirConditionerId(airConditionerId);
    }
}