package com.panyu.panyuprojectims.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LlConstructionUnitDao{

    //根据线路施工单位表ID删除选中项
    int deleteLlConstructionUnit(@Param("constructionUnitId") String constructionUnitId);
    //添加线路施工单位表
    int insertLlConstructionUnit(
            @Param("constructionUnitId") String constructionUnitId,
            @Param("corporateName") String corporateName,
            @Param("personInCharge") String personInCharge);
}