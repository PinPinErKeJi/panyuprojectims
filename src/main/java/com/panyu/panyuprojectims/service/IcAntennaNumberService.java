package com.panyu.panyuprojectims.service;
public interface IcAntennaNumberService{


    //添加
    int insertIcAntennaNumber(String antennaNumberId,
                              String indoorAntenna,
                              String outdoorAntenna,
                              String elevatorAntenna,
                              String gpsAntenna);

    //根据天线数量ID删除选中项
    int deleteAntennaNumberId(String antennaNumberId);
}