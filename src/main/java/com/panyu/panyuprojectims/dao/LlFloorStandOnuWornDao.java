package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.LlFloorStandOnuWorn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LlFloorStandOnuWornDao{

    //根据信息id查询落地式光交箱（利旧）
    LlFloorStandOnuWorn selectLlFloorStandOnuWornByCircuitInformationId(@Param("circuitInformationId") String circuitInformationId);

    //根据落地式光交箱（利旧）ID删除选中项
    int deleteLlFloorStandOnuWorn(@Param("wornFloorStandId") String wornFloorStandId);
    //添加
    int insertLlFloorStandOnuWorn(
            @Param("wornFloorStandId") String wornFloorStandId,
            @Param("wornFloorStandNumber") String wornFloorStandNumber,
            @Param("wornFloorStandSize") String wornFloorStandSize
    );
}