package com.panyu.panyuprojectims.service;
public interface IcSupervisoryUnitService{

    //添加
    int insertIcSupervisoryUnit(String icSupervisoryUnitId,
                                String professionResponsiblePerson,
                                String districtHead,
                                String siteLeader);


    //根据监理单位ID删除选中项
    int deleteIcSupervisoryUnitById(String icSupervisoryUnitId);
}