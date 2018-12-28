package com.panyu.panyuprojectims.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IcDesignUnitDao{


    //添加
    int insertIcDesignUnit(@Param("icDesignUnitId") String icDesignUnitId,
                           @Param("designCorporateName") String designCorporateName,
                           @Param("designPersonInCharge") String designPersonInCharge);

    //根据设计单位ID删除选中项
    int deleteIcDesignUnitById(@Param("icDesignUnitId") String icDesignUnitId);
}