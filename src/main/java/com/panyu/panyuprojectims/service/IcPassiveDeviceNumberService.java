package com.panyu.panyuprojectims.service;
public interface IcPassiveDeviceNumberService{



    //添加
    int insertIcPassiveDeviceNumber(String passiveDeviceNumberId,
                                    String powerDivider,
                                    String coupler,
                                    String roadConnector,
                                    String loadNumber);

    //根据无源器件数量ID删除选中项
    int deleteIcPassiveDeviceNumberById(String passiveDeviceNumberId);
}