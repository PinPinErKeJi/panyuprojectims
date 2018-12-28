package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.LlWallMountedOnuNewDao;
import com.panyu.panyuprojectims.service.LlWallMountedOnuNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LlWallMountedOnuNewServiceImpl implements LlWallMountedOnuNewService{
    @Autowired
    private LlWallMountedOnuNewDao llWallMountedOnuNewDao;

    //根据新建壁挂式光交箱ID删除选中项
    @Override
    public int deleteLlWallMountedOnuNew(String newWallMountedOnuId) {
        return llWallMountedOnuNewDao.deleteLlWallMountedOnuNew(newWallMountedOnuId);
    }
    //添加
    @Override
    public int insertLlWallMountedOnuNew(String newWallMountedOnuId, String newWallMountedOnuNumber, String newWallMountedOnuSize) {
        return llWallMountedOnuNewDao.insertLlWallMountedOnuNew(newWallMountedOnuId, newWallMountedOnuNumber, newWallMountedOnuSize);
    }
}