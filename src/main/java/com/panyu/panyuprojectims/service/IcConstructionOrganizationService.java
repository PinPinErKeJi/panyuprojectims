package com.panyu.panyuprojectims.service;
public interface IcConstructionOrganizationService{


    //添加
    int insertIcConstructionOrganization(String icConstructionId,
                                         String icCorporateName,
                                         String personInCharge);


    //根据施工单位ID删除选中项
    int deleteIcConstructionOrganizationById(String icConstructionId);
}