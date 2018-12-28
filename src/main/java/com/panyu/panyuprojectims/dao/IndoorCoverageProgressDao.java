package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.IndoorCoverageProgress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IndoorCoverageProgressDao{


    //导出
    List<IndoorCoverageProgress> export_IndoorCoverageProgress(String[] ids);

    //获取室内覆盖工程进度基本信息总条数
    long getIndoorCoverageProgressRowCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead,
            @Param("keyword") String siteLeader);
    //分页模糊匹配查询展示室内覆盖工程进度基本信息
    List<IndoorCoverageProgress> selectAllIndoorCoverageProgress(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead,
            @Param("keyword") String siteLeader);

}