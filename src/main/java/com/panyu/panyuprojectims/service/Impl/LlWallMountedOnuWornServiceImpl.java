package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.LlWallMountedOnuWornDao;
import com.panyu.panyuprojectims.service.LlWallMountedOnuWornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LlWallMountedOnuWornServiceImpl implements LlWallMountedOnuWornService{
    @Autowired
    private LlWallMountedOnuWornDao llWallMountedOnuWornDao;

    //根据利旧壁挂式光交箱ID删除选中项
    @Override
    public int deleteLlWallMountedOnuWorn(String wornWallMountedOnuId) {
        return llWallMountedOnuWornDao.deleteLlWallMountedOnuWorn(wornWallMountedOnuId);
    }
    //添加
    @Override
    public int insertLlWallMountedOnuWorn(String wornWallMountedOnuId, String wornWallMountedOnuNumber, String wornWallMountedOnuSize) {
        return llWallMountedOnuWornDao.insertLlWallMountedOnuWorn(wornWallMountedOnuId, wornWallMountedOnuNumber, wornWallMountedOnuSize);
    }
}