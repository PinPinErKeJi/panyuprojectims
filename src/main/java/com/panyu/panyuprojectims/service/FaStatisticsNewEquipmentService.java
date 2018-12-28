package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.FaStatisticsNewEquipment;
public interface FaStatisticsNewEquipmentService{

    //根据到货信息id关联到货统计新增设备表 查询新增设备图片
    String selectEquipmentVerifyingPhotos(String arrivalStatisticsId);


}