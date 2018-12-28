package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.FaArrivalStatistics;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

public interface FaArrivalStatisticsService{

    //数据导出
    List<FaArrivalStatistics> FaArrivalStatisticsExcel(String[] ids);


    //数据展示和模糊查询
    PageHelperUtil selectFaArrivalStatistics(int page, int rows,
                                             String province,
                                             String city,
                                             String county,
                                             String buildYear,
                                             String buildingProject,
                                             String operator,
                                             String onSiteSupervision,
                                             String projectLeader);


}