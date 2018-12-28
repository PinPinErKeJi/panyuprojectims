package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.utils.PageHelperUtil;

public interface PowerArrivalStatisticsService{

	//分页查询展示统计数据
	PageHelperUtil selectPowerArrivalStatistics(
            int start,
            int end,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String siteSupervision,
            String projectLeader
    );
}