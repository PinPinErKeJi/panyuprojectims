package com.panyu.panyuprojectims.service;
public interface LlConstructionUnitService{

    //根据线路施工单位表ID删除选中项
    int deleteLlConstructionUnit(String constructionUnitId);
    //添加线路施工单位表
    int insertLlConstructionUnit(
            String constructionUnitId,
            String corporateName,
            String personInCharge
    );
}