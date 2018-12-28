package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaFiberOpticChannel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaFiberOpticChannelDao{


    //添加
    int insertFaFiberOpticChannel(@Param("fiberOpticChannelId") String fiberOpticChannelId,
                                  @Param("fiberOpticNumber") String fiberOpticNumber,
                                  @Param("fiberOpticDesignLength") String fiberOpticDesignLength,
                                  @Param("fiberOpticSupplier") String fiberOpticSupplier,
                                  @Param("fiberOpticContacts") String fiberOpticContacts);

    //根据光纤槽道表ID字段删除选中项
    int deleteFaFiberOpticChannelById(@Param("fiberOpticChannelId") String fiberOpticChannelId);

    //根据设备信息id查询FaFibOpticChannel
    FaFiberOpticChannel getFaFiberOpticChannel(@Param("equipmentInformationId") String equipmentInformationId);
}