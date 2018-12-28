package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import java.util.UUID;

import com.panyu.panyuprojectims.dao.PsNewCablingRackDao;
import com.panyu.panyuprojectims.entity.PsNewCablingRack;
import com.panyu.panyuprojectims.service.PsNewCablingRackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PsNewCablingRackServiceImpl implements PsNewCablingRackService{
    @Autowired
    private PsNewCablingRackDao psNewCablingRackDao;


    //添加
    @Override
    public int insertPsNewCablingRack(String newCablingRackId, String newCablingRackNumber, String rackDesignStart, String rackEquipmentSupplier, String rackEquipmentLinkman) {

        int i1 = rackDesignStart.indexOf(".");
        if(i1>0){
            String str = rackDesignStart.substring(i1);
            int length = str.length();
            if(length>2){
                rackDesignStart = rackDesignStart.substring(0, i1+3);
                System.out.println("大于2:"+rackDesignStart);
            }else {
                rackDesignStart = rackDesignStart.substring(0, i1 + length);
                System.out.println("小于2:"+rackDesignStart);
            }
        }else {
            rackDesignStart = rackDesignStart+".00";
        }
        return psNewCablingRackDao.insertPsNewCablingRack(newCablingRackId,newCablingRackNumber,rackDesignStart,rackEquipmentSupplier,rackEquipmentLinkman);
    }

    //删除
    @Override
    public int deletePsNewCablingRack(String newCablingRackId) {
        return psNewCablingRackDao.deletePsNewCablingRack(newCablingRackId);
    }


}


