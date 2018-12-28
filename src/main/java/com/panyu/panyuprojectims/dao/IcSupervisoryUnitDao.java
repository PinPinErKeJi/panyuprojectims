package com.panyu.panyuprojectims.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IcSupervisoryUnitDao{

    //添加
    int insertIcSupervisoryUnit(@Param("icSupervisoryUnitId") String icSupervisoryUnitId,
                                @Param("professionResponsiblePerson") String professionResponsiblePerson,
                                @Param("districtHead") String districtHead,
                                @Param("siteLeader") String siteLeader);

    //根据监理单位ID删除选中项
    int deleteIcSupervisoryUnitById(@Param("icSupervisoryUnitId") String icSupervisoryUnitId);
}