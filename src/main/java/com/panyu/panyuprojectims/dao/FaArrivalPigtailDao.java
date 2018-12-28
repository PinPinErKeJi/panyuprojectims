package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaArrivalPigtail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaArrivalPigtailDao{

   //到货信息表、尾纤，跳纤表链表查询 到货图片
    String selectPigtailVerifyingPhotos(@Param("arrivalStatisticsId") String arrivalStatisticsId);
}