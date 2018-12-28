package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.LlFloorStandOnuNewDao;
import com.panyu.panyuprojectims.service.LlFloorStandOnuNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LlFloorStandOnuNewServiceImpl implements LlFloorStandOnuNewService{
    @Autowired
    private LlFloorStandOnuNewDao llFloorStandOnuNewDao;

    //根据落地式光交箱（新建）ID删除选中项
    @Override
    public int deleteLlFloorStandOnuNew(String newFloorStandId) {
        return llFloorStandOnuNewDao.deleteLlFloorStandOnuNew(newFloorStandId);
    }
    //添加
    @Override
    public int insertLlFloorStandOnuNew(String newFloorStandId, String newFloorStandNumber, String newFloorStandSize) {
        return llFloorStandOnuNewDao.insertLlFloorStandOnuNew(newFloorStandId, newFloorStandNumber, newFloorStandSize);
    }
}