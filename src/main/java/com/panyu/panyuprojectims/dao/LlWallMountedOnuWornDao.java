package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.LlWallMountedOnuWorn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LlWallMountedOnuWornDao{


    //根据信息id查询壁挂式光交箱（利旧）对象
    LlWallMountedOnuWorn selectLlWallMountedOnuWornDByCircuitInformationId(@Param("circuitInformationId") String circuitInformationId);

    //根据利旧壁挂式光交箱ID删除选中项
    int deleteLlWallMountedOnuWorn(@Param("wornWallMountedOnuId") String wornWallMountedOnuId);
    //添加
    int insertLlWallMountedOnuWorn(
            @Param("wornWallMountedOnuId") String wornWallMountedOnuId,
            @Param("wornWallMountedOnuNumber") String wornWallMountedOnuNumber,
            @Param("wornWallMountedOnuSize") String wornWallMountedOnuSize);
}