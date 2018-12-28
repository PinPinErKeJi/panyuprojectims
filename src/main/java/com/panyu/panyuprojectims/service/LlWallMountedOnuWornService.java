package com.panyu.panyuprojectims.service;
public interface LlWallMountedOnuWornService{

    //根据利旧壁挂式光交箱ID删除选中项
    int deleteLlWallMountedOnuWorn(String wornWallMountedOnuId);
    //添加
    int insertLlWallMountedOnuWorn(
            String wornWallMountedOnuId,
            String wornWallMountedOnuNumber,
            String wornWallMountedOnuSize
    );
}