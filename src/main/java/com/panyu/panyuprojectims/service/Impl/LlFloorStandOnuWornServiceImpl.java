package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.LlFloorStandOnuWornDao;
import com.panyu.panyuprojectims.service.LlFloorStandOnuWornService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LlFloorStandOnuWornServiceImpl implements LlFloorStandOnuWornService{
    @Autowired
    private LlFloorStandOnuWornDao llFloorStandOnuWornDao;

    //根据落地式光交箱（利旧）ID删除选中项
    @Override
    public int deleteLlFloorStandOnuWorn(String wornFloorStandId) {
        return llFloorStandOnuWornDao.deleteLlFloorStandOnuWorn(wornFloorStandId);
    }
    //添加
    @Override
    public int insertLlFloorStandOnuWorn(String wornFloorStandId, String wornFloorStandNumber, String wornFloorStandSize) {
        return llFloorStandOnuWornDao.insertLlFloorStandOnuWorn(wornFloorStandId, wornFloorStandNumber, wornFloorStandSize);
    }
}