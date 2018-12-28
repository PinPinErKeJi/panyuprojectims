package com.panyu.panyuprojectims.service;
public interface IcBbuNumberService{

    //添加
    int insertIcBbuNumber(String bbuNumberId,
                          String centralization,
                          String wallHangingWall);

    //根据BBU数量ID删除选中项
    int deleteIcBbuNumberById(String bbuNumberId);
}