package com.panyu.panyuprojectims.service;
public interface LlSupervisionUnitService{

    //根据线路监理单位表ID删除选中项
    int deleteLlSupervisionUnit(String supervisionUnitId);
    //添加
    int insertLlSupervisionUnit(
            String supervisionUnitId,
            String siteLeader,
            String professionResponsiblePerson,
            String districtHead
    );
}