package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.LlWallMountedOnuNew;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LlWallMountedOnuNewDao{

    //跟据信息id查询壁挂式光交箱（新建）对象
    LlWallMountedOnuNew selectLlWallMountedOnuNewByCircuitInformationId(@Param("circuitInformationId") String circuitInformationId);

    //根据新建壁挂式光交箱ID删除选中项
    int deleteLlWallMountedOnuNew(@Param("newWallMountedOnuId") String newWallMountedOnuId);
    //添加
    int insertLlWallMountedOnuNew(
            @Param("newWallMountedOnuId") String newWallMountedOnuId,
            @Param("newWallMountedOnuNumber") String newWallMountedOnuNumber,
            @Param("newWallMountedOnuSize") String newWallMountedOnuSize);
}