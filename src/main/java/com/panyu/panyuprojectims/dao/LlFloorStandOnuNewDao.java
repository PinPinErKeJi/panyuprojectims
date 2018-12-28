package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.LlFloorStandOnuNew;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LlFloorStandOnuNewDao{

    //根据信息id查询落地式光交箱（新建）对象
    LlFloorStandOnuNew selectLlFloorStandOnuNewByCircuitInformationId(@Param("circuitInformationId") String circuitInformationId);

    //根据落地式光交箱（新建）ID删除选中项
    int deleteLlFloorStandOnuNew(@Param("newFloorStandId") String newFloorStandId);
    //添加
    int insertLlFloorStandOnuNew(
            @Param("newFloorStandId") String newFloorStandId,
            @Param("newFloorStandNumber") String newFloorStandNumber,
            @Param("newFloorStandSize") String newFloorStandSize);
}