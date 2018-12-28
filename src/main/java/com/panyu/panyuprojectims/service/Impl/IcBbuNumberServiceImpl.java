package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.IcBbuNumberDao;
import com.panyu.panyuprojectims.service.IcBbuNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IcBbuNumberServiceImpl implements IcBbuNumberService{
    @Autowired
    private IcBbuNumberDao icBbuNumberDao;


    //添加
    @Override
    public int insertIcBbuNumber(String bbuNumberId, String centralization, String wallHangingWall) {
        return icBbuNumberDao.insertIcBbuNumber( bbuNumberId,  centralization,  wallHangingWall);
    }

    //根据BBU数量ID删除选中项
    @Override
    public int deleteIcBbuNumberById(String bbuNumberId) {
        return icBbuNumberDao.deleteIcBbuNumberById(bbuNumberId);
    }
}