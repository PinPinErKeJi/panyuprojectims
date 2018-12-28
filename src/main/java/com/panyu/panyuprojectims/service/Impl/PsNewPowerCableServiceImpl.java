package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import java.util.UUID;

import com.panyu.panyuprojectims.dao.PsNewPowerCableDao;
import com.panyu.panyuprojectims.entity.PsNewPowerCable;
import com.panyu.panyuprojectims.service.PsNewPowerCableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PsNewPowerCableServiceImpl implements PsNewPowerCableService{
    @Autowired
    private PsNewPowerCableDao psNewPowerCableDao;



    //添加
    @Override
    public int insertPsNewPowerCable(String newPowerCableId, String newPowerCableNumber, String newPowerCableModel,
                                     String newPowerCableRow, String powerSingleLength, String powerTotalLength,
                                     String beFrom, String beTo, String cableEquipmentSupplier, String cableEquipmentLinkman) {
        int i1 = powerSingleLength.indexOf(".");
        if(i1>0){
            String str = powerSingleLength.substring(i1);
            int length = str.length();
            if(length>2){
                powerSingleLength = powerSingleLength.substring(0, i1+3);
                System.out.println("大于2:"+powerSingleLength);
            }else {
                powerSingleLength = powerSingleLength.substring(0, i1 + length);
                System.out.println("小于2:"+powerSingleLength);
            }
        }else {
            powerSingleLength = powerSingleLength+".00";
        }
        int i2 = powerTotalLength.indexOf(".");
        if(i2>0){
            String str = powerTotalLength.substring(i2);
            int length = str.length();
            if(length>2){
                powerTotalLength = powerTotalLength.substring(0, i2+3);
                System.out.println("大于2:"+powerTotalLength);
            }else {
                powerTotalLength = powerTotalLength.substring(0, i2 + length);
                System.out.println("小于2:"+powerTotalLength);
            }
        }else {
            powerTotalLength = powerTotalLength+".00";
        }

        return psNewPowerCableDao.insertPsNewPowerCable(newPowerCableId,newPowerCableNumber,newPowerCableModel,
                                                           newPowerCableRow,powerSingleLength,powerTotalLength,
                                                           beFrom,beTo,cableEquipmentSupplier,cableEquipmentLinkman);
    }

    //删除
    @Override
    public int deletePsNewPowerCable(String newPowerCableId) {
        return psNewPowerCableDao.deletePsNewPowerCable(newPowerCableId);
    }



}