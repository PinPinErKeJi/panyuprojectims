package com.panyu.panyuprojectims.service;
public interface IcCableLengthService{


    //添加
    int insertIcCableLength(String cableLengthId,
                            String networkLine,
                            String photoelectricCompositeCable,
                            String sevenEighthsFeeder,
                            String ahalfFeeder);

    //根据线缆长度表ID删除选中项
    int deleteIcCableLengthById(String cableLengthId);
}