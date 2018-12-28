package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.IcLightDistriputionNumberDao;
import com.panyu.panyuprojectims.service.IcLightDistriputionNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IcLightDistriputionNumberServiceImpl implements IcLightDistriputionNumberService{
    @Autowired
    private IcLightDistriputionNumberDao icLightDistriputionNumberDao;


    //添加
    @Override
    public int insertIcLightDistriputionNumber(String lightNumberId, String easyMacro, String bookrruNotIntegratedAntenna,
                                               String bookrruIntegratedAntenna, String hub, String pruIntegratedAntenna,
                                               String pruNotIntegratedAntenna, String accessUnit, String extensionUnit,
                                               String remoteDeviceIndoor, String remoteDeviceOutdoor) {
        return icLightDistriputionNumberDao.insertIcLightDistriputionNumber(
                                               lightNumberId,  easyMacro,  bookrruNotIntegratedAntenna,
                                               bookrruIntegratedAntenna,  hub,  pruIntegratedAntenna,
                                               pruNotIntegratedAntenna,  accessUnit,  extensionUnit,
                                               remoteDeviceIndoor,  remoteDeviceOutdoor);
    }

    //根据光分布设备数量表ID删除选中项
    @Override
    public int deleteIcLightDistriputionNumberById(String lightNumberId) {
        return icLightDistriputionNumberDao.deleteIcLightDistriputionNumberById(lightNumberId);
    }
}