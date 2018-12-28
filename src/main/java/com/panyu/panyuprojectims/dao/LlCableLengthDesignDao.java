package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.LlCableLengthDesign;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LlCableLengthDesignDao{

    //根据信息id查询光缆设计长度对象
    LlCableLengthDesign selectLlCableLengthDesignByCircuitInformationId(@Param("circuitInformationId") String circuitInformationId);



    //根据光缆设计皮长公里ID删除选中项
    int deleteLlCableLengthDesign(@Param("cableLengthDesignId") String cableLengthDesignId);
    //添加光缆设计皮长公里
    int insertLlCableLengthDesign(
            @Param("cableLengthDesignId") String cableLengthDesignId,
            @Param("gystsSuspended") String gystsSuspended,
            @Param("gystsSuspensionWire") String gystsSuspensionWire,
            @Param("gysta") String gysta,
            @Param("plowInOpticalCable") String plowInOpticalCable,
            @Param("wallCable") String wallCable,
            @Param("inBridgeCable") String inBridgeCable,
            @Param("gyfxts") String gyfxts
    );

}