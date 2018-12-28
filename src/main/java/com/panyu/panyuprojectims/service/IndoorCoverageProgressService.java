package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.IndoorCoverageProgress;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface IndoorCoverageProgressService{

    //分页模糊匹配查询展示室内覆盖工程进度基本信息
    PageHelperUtil selectAllIndoorCoverageProgress(
            int start, int end,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String professionResponsiblePerson,
            String districtHead,
            String siteLeader
    );

    //导出
    List<IndoorCoverageProgress> export_IndoorCoverageProgress(String[] ids);
}