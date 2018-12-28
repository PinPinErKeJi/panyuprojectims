package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaStatisticsNewEquipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaStatisticsNewEquipmentDao{

    //根据到货信息id关联到货统计新增设备表 查询新增设备图片
    String selectEquipmentVerifyingPhotos(@Param("arrivalStatisticsId") String arrivalStatisticsId);





}