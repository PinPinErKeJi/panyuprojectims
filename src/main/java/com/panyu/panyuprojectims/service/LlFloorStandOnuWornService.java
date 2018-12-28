package com.panyu.panyuprojectims.service;
public interface LlFloorStandOnuWornService{

    //根据落地式光交箱（利旧）ID删除选中项
    int deleteLlFloorStandOnuWorn(String wornFloorStandId);
    //添加
    int insertLlFloorStandOnuWorn(
            String wornFloorStandId,
            String wornFloorStandNumber,
            String wornFloorStandSize
    );
}