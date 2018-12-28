package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.IcDesignUnitDao;
import com.panyu.panyuprojectims.service.IcDesignUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IcDesignUnitServiceImpl implements IcDesignUnitService{
    @Autowired
    private IcDesignUnitDao icDesignUnitDao;


    //添加
    @Override
    public int insertIcDesignUnit(String icDesignUnitId, String designCorporateName, String designPersonInCharge) {
        return icDesignUnitDao.insertIcDesignUnit(icDesignUnitId,designCorporateName,designPersonInCharge);
    }

    //根据设计单位ID删除选中项
    @Override
    public int deleteIcDesignUnitById(String icDesignUnitId) {
        return icDesignUnitDao.deleteIcDesignUnitById(icDesignUnitId);
    }
}