package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.LlSupervisionUnitDao;
import com.panyu.panyuprojectims.service.LlSupervisionUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LlSupervisionUnitServiceImpl implements LlSupervisionUnitService{
    @Autowired
    private LlSupervisionUnitDao llSupervisionUnitDao;

    //根据线路监理单位表ID删除选中项
    @Override
    public int deleteLlSupervisionUnit(String supervisionUnitId) {
        return llSupervisionUnitDao.deleteLlSupervisionUnit(supervisionUnitId);
    }
    //添加
    @Override
    public int insertLlSupervisionUnit(String supervisionUnitId, String siteLeader, String professionResponsiblePerson, String districtHead) {
        return llSupervisionUnitDao.insertLlSupervisionUnit(supervisionUnitId, siteLeader, professionResponsiblePerson, districtHead);
    }
}