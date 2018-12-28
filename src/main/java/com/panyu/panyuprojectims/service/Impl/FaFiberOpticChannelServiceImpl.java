package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaFiberOpticChannelDao;
import com.panyu.panyuprojectims.entity.FaFiberOpticChannel;
import com.panyu.panyuprojectims.service.FaFiberOpticChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaFiberOpticChannelServiceImpl implements FaFiberOpticChannelService{
    @Autowired
    private FaFiberOpticChannelDao faFiberOpticChannelDao;


    //添加
    @Override
    public boolean insertFaFiberOpticChannel(String fiberOpticChannelId,
                                             String fiberOpticNumber,
                                             String fiberOpticDesignLength,
                                             String fiberOpticSupplier,
                                             String fiberOpticContacts){
        //设计长度数据处理
        int i2 = fiberOpticDesignLength.indexOf(".");
        if(i2>0){
            String str = fiberOpticDesignLength.substring(i2);
            int length = str.length();
            if(length>2){
                fiberOpticDesignLength = fiberOpticDesignLength.substring(0, i2+3);
                System.out.println("大于2:"+fiberOpticDesignLength);
            }else {
                fiberOpticDesignLength = fiberOpticDesignLength.substring(0, i2 + length);
                System.out.println("小于2:"+fiberOpticDesignLength);
            }
        }else {
            fiberOpticDesignLength = fiberOpticDesignLength+".00";
        }
        boolean flag = true;
        if(fiberOpticChannelId != null){
            int i = faFiberOpticChannelDao.insertFaFiberOpticChannel(fiberOpticChannelId,
                    fiberOpticNumber,
                    fiberOpticDesignLength,
                    fiberOpticSupplier,
                    fiberOpticContacts);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //根据光纤槽道表ID字段删除选中项
    @Override
    public int deleteFaFiberOpticChannelById(String fiberOpticChannelId){
        return faFiberOpticChannelDao.deleteFaFiberOpticChannelById(fiberOpticChannelId);
    }

}