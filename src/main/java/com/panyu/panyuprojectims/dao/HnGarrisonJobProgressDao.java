package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnGarrisonJobProgress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnGarrisonJobProgressDao{

    //查询驻地网工程进度信息总条数
    long getHnGarrisonJobProgressRowCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("singleProjectName") String singleProjectName,
            @Param("keyword") String onSiteSupervision,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead
    );
    //分页模糊匹配查询展示驻地网工程进度信息数据
    List<HnGarrisonJobProgress> selectHnGarrisonJobProgress(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("singleProjectName") String singleProjectName,
            @Param("keyword") String onSiteSupervision,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead
    );
    //导出工程进度Excel表格数据
    List<HnGarrisonJobProgress> HnGarrisonJobProgressExcel(String[] ids);
}