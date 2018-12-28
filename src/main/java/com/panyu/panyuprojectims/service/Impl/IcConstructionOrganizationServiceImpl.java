package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.IcConstructionOrganizationDao;
import com.panyu.panyuprojectims.service.IcConstructionOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class
IcConstructionOrganizationServiceImpl implements IcConstructionOrganizationService{
    @Autowired
    private IcConstructionOrganizationDao icConstructionOrganizationDao;


    //添加
    @Override
    public int insertIcConstructionOrganization(String icConstructionId, String icCorporateName, String personInCharge) {
        return icConstructionOrganizationDao.insertIcConstructionOrganization(icConstructionId,icCorporateName,personInCharge);
    }

    //根据施工单位ID删除选中项
    @Override
    public int deleteIcConstructionOrganizationById(String icConstructionId) {
        return icConstructionOrganizationDao.deleteIcConstructionOrganizationById(icConstructionId);
    }
}