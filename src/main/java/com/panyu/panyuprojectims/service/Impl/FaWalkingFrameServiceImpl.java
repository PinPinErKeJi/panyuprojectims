package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaWalkingFrameDao;
import com.panyu.panyuprojectims.entity.FaWalkingFrame;
import com.panyu.panyuprojectims.service.FaWalkingFrameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaWalkingFrameServiceImpl implements FaWalkingFrameService{
    @Autowired
    private FaWalkingFrameDao faWalkingFrameDao;


    //添加
    @Override
    public boolean insertFaWalkingFrame(String walkingFrameId,
                                        String walkingNumber,
                                        String walkingDesignLength,
                                        String walkingFrameSupplier,
                                        String walkingFrameContacts){
        //设计长度数据处理
        int i2 = walkingDesignLength.indexOf(".");
        if(i2>0){
            String str = walkingDesignLength.substring(i2);
            int length = str.length();
            if(length>2){
                walkingDesignLength = walkingDesignLength.substring(0, i2+3);
                System.out.println("大于2:"+walkingDesignLength);
            }else {
                walkingDesignLength = walkingDesignLength.substring(0, i2 + length);
                System.out.println("小于2:"+walkingDesignLength);
            }
        }else {
            walkingDesignLength = walkingDesignLength+".00";
        }

        boolean flag = true;
        if(walkingFrameId != null){
            int i = faWalkingFrameDao.insertFaWalkingFrame(walkingFrameId,
                    walkingNumber,
                    walkingDesignLength,
                    walkingFrameSupplier,
                    walkingFrameContacts);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //根据走线架表ID字段删除选中项
    @Override
    public int deleteFaWalkingFrameById(String walkingFrameId){
        return faWalkingFrameDao.deleteFaWalkingFrameById(walkingFrameId);
    }

    @Override
    public int updateFaWalkingFrameById(FaWalkingFrame enti){
        return faWalkingFrameDao.updateFaWalkingFrameById(enti);
    }

    public FaWalkingFrameDao getFaWalkingFrameDao() {
        return this.faWalkingFrameDao;
    }

    public void setFaWalkingFrameDao(FaWalkingFrameDao faWalkingFrameDao) {
        this.faWalkingFrameDao = faWalkingFrameDao;
    }

}