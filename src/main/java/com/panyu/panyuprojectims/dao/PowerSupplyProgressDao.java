package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PowerSupplyProgress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PowerSupplyProgressDao{
    //获取进度信息条数
    long getPowerSupplyProgressRowCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("keyword") String siteSupervision,
            @Param("keyword") String projectLeader
    );

    List<PowerSupplyProgress> selectPowerSupplyProgress(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("keyword") String siteSupervision,
            @Param("keyword") String projectLeader
    );
    //导出进度Excel表格数据
    List<PowerSupplyProgress> importPowerSupplyProgressExcel(String[] ids);
}