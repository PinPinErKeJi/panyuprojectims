package com.panyu.panyuprojectims.service;
public interface LlCableLengthDesignService{

    //根据光缆设计皮长公里ID删除选中项
    int deleteLlCableLengthDesign(String cableLengthDesignId);
    //添加光缆设计皮长公里
    int insertLlCableLengthDesign(
            String cableLengthDesignId,
            String gystsSuspended,
            String gystsSuspensionWire,
            String gysta,
            String plowInOpticalCable,
            String wallCable,
            String inBridgeCable,
            String gyfxts
    );
}