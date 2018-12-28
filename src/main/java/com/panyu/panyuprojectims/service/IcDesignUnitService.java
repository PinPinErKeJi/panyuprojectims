package com.panyu.panyuprojectims.service;
public interface IcDesignUnitService{


    //添加
    int insertIcDesignUnit(String icDesignUnitId,
                           String designCorporateName,
                           String designPersonInCharge);

    //根据设计单位ID删除选中项
    int deleteIcDesignUnitById(String icDesignUnitId);
}