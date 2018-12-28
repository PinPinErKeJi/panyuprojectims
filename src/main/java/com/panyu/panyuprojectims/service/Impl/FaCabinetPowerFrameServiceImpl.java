package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaCabinetPowerFrameDao;
import com.panyu.panyuprojectims.entity.FaCabinetPowerFrame;
import com.panyu.panyuprojectims.service.FaCabinetPowerFrameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaCabinetPowerFrameServiceImpl implements FaCabinetPowerFrameService{
    @Autowired
    private FaCabinetPowerFrameDao faCabinetPowerFrameDao;


    //添加
    @Override
    public boolean insertFaCabinetPowerFrame(String equipmentId,
                                             String equipmentNumber,
                                             String equipmentType,
                                             String equipmentName,
                                             String equipmentModel,
                                             String equipmentDesignQuantity,
                                             String equipmentSize,
                                             String equipmentSupplier,
                                             String equipmentContacts){
        //设计数量----》数据处理
        int i1 = equipmentDesignQuantity.indexOf(".");
        if(i1>0){
            equipmentDesignQuantity = equipmentDesignQuantity.substring(0, i1);
        }else {
            equipmentDesignQuantity = equipmentDesignQuantity.substring(0);
        }

        boolean flag = true;
        if(equipmentId != null){
            int i = faCabinetPowerFrameDao.insertFaCabinetPowerFrame(equipmentId,
                    equipmentNumber,
                    equipmentType,
                    equipmentName,
                    equipmentModel,
                    equipmentDesignQuantity,
                    equipmentSize,
                    equipmentSupplier,
                    equipmentContacts);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //根据设备，机柜，电源柜，配线架表ID删除选中项
    @Override
    public int deleteFaCabinetPowerFrameById(String equipmentId){
        return faCabinetPowerFrameDao.deleteFaCabinetPowerFrameById(equipmentId);
    }

}