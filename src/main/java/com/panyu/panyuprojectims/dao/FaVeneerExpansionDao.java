package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaVeneerExpansion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaVeneerExpansionDao{

    //到货信息表、单板扩容表链表查询 单板扩容到货图片
    String selectVeneerVerifyingPhotos(@Param("arrivalStatisticsId") String arrivalStatisticsId);


}