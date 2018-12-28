package com.panyu.panyuprojectims.service;
public interface IcLightDistriputionNumberService{


    //添加
    int insertIcLightDistriputionNumber(String lightNumberId,
                                        String easyMacro,
                                        String bookrruNotIntegratedAntenna,
                                        String bookrruIntegratedAntenna,
                                        String hub,
                                        String pruIntegratedAntenna,
                                        String pruNotIntegratedAntenna,
                                        String accessUnit,
                                        String extensionUnit,
                                        String remoteDeviceIndoor,
                                        String remoteDeviceOutdoor);

    //根据光分布设备数量表ID删除选中项
    int deleteIcLightDistriputionNumberById(String lightNumberId);
}