package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.IndoorCoverageModule;
public interface IndoorCoverageModuleService{


    //根据模块名查询模块对象
    IndoorCoverageModule getIndoorCoverageModule(String indoorCoverageName);


    //添加
    IndoorCoverageModule addIndoorCoverageModule(String indoorCoverageName);


    //查询所有的室内覆盖模块信息
    List<IndoorCoverageModule> selectAllIndoorCoverageModule();

    //修改
    int updateIndoorCoverageModule(String indoorCoverageId,
                                   String indoorCoverageName);

    //删除
    int deleteIndoorCoverageModule(String indoorCoverageId);




}