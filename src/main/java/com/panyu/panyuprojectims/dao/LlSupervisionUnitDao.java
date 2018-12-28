package com.panyu.panyuprojectims.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LlSupervisionUnitDao{

    //根据线路监理单位表ID删除选中项
    int deleteLlSupervisionUnit(@Param("supervisionUnitId") String supervisionUnitId);
    //添加
    int insertLlSupervisionUnit(
            @Param("supervisionUnitId") String supervisionUnitId,
            @Param("siteLeader") String siteLeader,
            @Param("professionResponsiblePerson") String professionResponsiblePerson,
            @Param("districtHead") String districtHead);
}