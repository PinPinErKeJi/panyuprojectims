package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaArrivalPowerCord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaArrivalPowerCordDao{

    //到货信息表、电源表、网线、2M线表链表查询 到货图片
    String selectPowerCordVerifyingPhotos(@Param("arrivalStatisticsId") String arrivalStatisticsId);

}