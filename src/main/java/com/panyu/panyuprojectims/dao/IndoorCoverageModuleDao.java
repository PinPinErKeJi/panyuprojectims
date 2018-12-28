package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IndoorCoverageModule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface IndoorCoverageModuleDao{

    //查询所有的室内覆盖模块信息
    List<IndoorCoverageModule> selectAllIndoorCoverageModule();

    //根据名字查询个数
    long getCountByIndoorCoverageName(@Param("indoorCoverageName") String indoorCoverageName);
    //添加模块信息
    int insertIndoorCoverageModule(@Param("indoorCoverageName") String indoorCoverageName);
    //根据模块名字查询模块对象
    IndoorCoverageModule selectIndoorCoverageModuleByIndoorCoverageName(@Param("indoorCoverageName") String indoorCoverageName);

    //修改
    int updateIndoorCoverageModule(@Param("indoorCoverageId") String indoorCoverageId,
                                   @Param("indoorCoverageName") String indoorCoverageName);

    //删除
    int deleteIndoorCoverageModule(@Param("indoorCoverageId") String indoorCoverageId);

}