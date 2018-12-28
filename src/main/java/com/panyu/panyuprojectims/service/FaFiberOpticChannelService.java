package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.FaFiberOpticChannel;

import java.util.List;
public interface FaFiberOpticChannelService{



    //添加
    boolean insertFaFiberOpticChannel(String fiberOpticChannelId,
                                      String fiberOpticNumber,
                                      String fiberOpticDesignLength,
                                      String fiberOpticSupplier,
                                      String fiberOpticContacts);

    //根据光纤槽道表ID字段删除选中项
    int deleteFaFiberOpticChannelById(String fiberOpticChannelId);

}