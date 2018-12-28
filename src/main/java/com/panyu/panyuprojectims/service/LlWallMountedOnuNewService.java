package com.panyu.panyuprojectims.service;
public interface LlWallMountedOnuNewService{

    //根据新建壁挂式光交箱ID删除选中项
    int deleteLlWallMountedOnuNew(String newWallMountedOnuId);
    //添加
    int insertLlWallMountedOnuNew(
            String newWallMountedOnuId,
            String newWallMountedOnuNumber,
            String newWallMountedOnuSize
    );
}