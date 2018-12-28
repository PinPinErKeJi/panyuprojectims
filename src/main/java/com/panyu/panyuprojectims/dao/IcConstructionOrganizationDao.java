package com.panyu.panyuprojectims.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IcConstructionOrganizationDao{


    //添加
    int insertIcConstructionOrganization(@Param("icConstructionId") String icConstructionId,
                                         @Param("icCorporateName") String icCorporateName,
                                         @Param("personInCharge") String personInCharge);

    //根据施工单位ID删除选中项
    int deleteIcConstructionOrganizationById(@Param("icConstructionId") String icConstructionId);
}