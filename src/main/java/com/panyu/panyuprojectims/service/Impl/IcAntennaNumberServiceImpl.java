package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.IcAntennaNumberDao;
import com.panyu.panyuprojectims.service.IcAntennaNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IcAntennaNumberServiceImpl implements IcAntennaNumberService{
    @Autowired
    private IcAntennaNumberDao icAntennaNumberDao;


    //添加
    @Override
    public int insertIcAntennaNumber(String antennaNumberId, String indoorAntenna, String outdoorAntenna,
                                     String elevatorAntenna, String gpsAntenna) {
        return icAntennaNumberDao.insertIcAntennaNumber(antennaNumberId,indoorAntenna,outdoorAntenna,
                                                            elevatorAntenna,gpsAntenna);
    }

    //根据天线数量ID删除选中项
    @Override
    public int deleteAntennaNumberId(String antennaNumberId) {
        return icAntennaNumberDao.deleteAntennaNumberId(antennaNumberId);
    }
}