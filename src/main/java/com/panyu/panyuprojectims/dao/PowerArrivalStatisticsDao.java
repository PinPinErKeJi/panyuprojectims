package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PowerArrivalStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PowerArrivalStatisticsDao{
	//获取到货统计条数
    long getPowerArrivalStatisticsRowCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("keyword") String siteSupervision,
            @Param("keyword") String projectLeader
    );
	//分页查询展示统计数据
    List<PowerArrivalStatistics> selectPowerArrivalStatistics(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("keyword") String siteSupervision,
            @Param("keyword") String projectLeader
    );

}