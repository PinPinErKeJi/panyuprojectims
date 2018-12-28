package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.FaWalkingFrame;

import java.util.List;
public interface FaWalkingFrameService{



    //添加
    boolean insertFaWalkingFrame(String walkingFrameId,
                                 String walkingNumber,
                                 String walkingDesignLength,
                                 String walkingFrameSupplier,
                                 String walkingFrameContacts);

    //根据走线架表ID字段删除选中项
    int deleteFaWalkingFrameById(String walkingFrameId);

    int updateFaWalkingFrameById(FaWalkingFrame enti);
}