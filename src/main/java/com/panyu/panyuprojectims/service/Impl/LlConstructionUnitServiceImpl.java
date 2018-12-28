package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.LlConstructionUnitDao;
import com.panyu.panyuprojectims.service.LlConstructionUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LlConstructionUnitServiceImpl implements LlConstructionUnitService{
    @Autowired
    private LlConstructionUnitDao llConstructionUnitDao;

    //根据线路施工单位表ID删除选中项
    @Override
    public int deleteLlConstructionUnit(String constructionUnitId) {
        return llConstructionUnitDao.deleteLlConstructionUnit(constructionUnitId);
    }
    //添加线路施工单位表
    @Override
    public int insertLlConstructionUnit(String constructionUnitId, String corporateName, String personInCharge) {
        return llConstructionUnitDao.insertLlConstructionUnit(constructionUnitId, corporateName, personInCharge);
    }
}