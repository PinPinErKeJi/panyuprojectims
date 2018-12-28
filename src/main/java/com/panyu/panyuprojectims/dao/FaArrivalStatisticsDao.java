package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaArrivalStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaArrivalStatisticsDao{

    //数据导出
    List<FaArrivalStatistics> FaArrivalStatisticsExcel(String[] ids);


    //查询数据总数
    long getFaArrivalStatisticsRowCount(@Param("province") String province,
                                        @Param("city") String city,
                                        @Param("county") String county,
                                        @Param("buildYear") String buildYear,
                                        @Param("buildingProject") String buildingProject,
                                        @Param("operator") String operator,
                                        @Param("keyword") String onSiteSupervision,
                                        @Param("keyword") String projectLeader);
    //数据展示和模糊查询
    List<FaArrivalStatistics> selectFaArrivalStatistics(@Param("start") int start,
                                                        @Param("end") int end,
                                                        @Param("province") String province,
                                                        @Param("city") String city,
                                                        @Param("county") String county,
                                                        @Param("buildYear") String buildYear,
                                                        @Param("buildingProject") String buildingProject,
                                                        @Param("operator") String operator,
                                                        @Param("keyword") String onSiteSupervision,
                                                        @Param("keyword") String projectLeader);

}