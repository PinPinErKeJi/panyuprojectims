package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.IcSupervisoryUnitDao;
import com.panyu.panyuprojectims.service.IcSupervisoryUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IcSupervisoryUnitServiceImpl implements IcSupervisoryUnitService{
    @Autowired
    private IcSupervisoryUnitDao icSupervisoryUnitDao;


    //添加
    @Override
    public int insertIcSupervisoryUnit(String icSupervisoryUnitId, String professionResponsiblePerson, String districtHead, String siteLeader) {
        return icSupervisoryUnitDao.insertIcSupervisoryUnit(icSupervisoryUnitId,professionResponsiblePerson,districtHead,siteLeader);
    }

    //根据监理单位ID删除选中项
    @Override
    public int deleteIcSupervisoryUnitById(String icSupervisoryUnitId) {
        return icSupervisoryUnitDao.deleteIcSupervisoryUnitById(icSupervisoryUnitId);
    }
}