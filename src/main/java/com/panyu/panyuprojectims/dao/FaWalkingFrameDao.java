package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaWalkingFrame;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaWalkingFrameDao{



    //添加
    int insertFaWalkingFrame(@Param("walkingFrameId") String walkingFrameId,
                             @Param("walkingNumber") String walkingNumber,
                             @Param("walkingDesignLength") String walkingDesignLength,
                             @Param("walkingFrameSupplier") String walkingFrameSupplier,
                             @Param("walkingFrameContacts") String walkingFrameContacts);

    //根据走线架表ID字段删除选中项
    int deleteFaWalkingFrameById(@Param("walkingFrameId") String walkingFrameId);

    //根据设备信息id查询FaWalkingFrame
    FaWalkingFrame getFaWalkingFrame(@Param("equipmentInformationId") String equipmentInformationId);

    int updateFaWalkingFrameById(FaWalkingFrame enti);
}