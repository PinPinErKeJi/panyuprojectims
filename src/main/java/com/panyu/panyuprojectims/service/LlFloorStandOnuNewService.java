package com.panyu.panyuprojectims.service;
public interface LlFloorStandOnuNewService{

    //根据落地式光交箱（新建）ID删除选中项
    int deleteLlFloorStandOnuNew(String newFloorStandId);
    //添加
    int insertLlFloorStandOnuNew(
            String newFloorStandId,
            String newFloorStandNumber,
            String newFloorStandSize
    );
}