package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaEquipmentProjectProgress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaEquipmentProjectProgressDao{

    //分页模糊匹配搜索查询
    long getFaEquipmentProjectProgressRowCount(@Param("province") String province,
                                               @Param("city") String city,
                                               @Param("county") String county,
                                               @Param("buildYear") String buildYear,
                                               @Param("buildingProject") String buildingProject,
                                               @Param("operator") String operator,
                                               @Param("keyword") String onSiteSupervision,
                                               @Param("keyword") String projectLeader);

    List<FaEquipmentProjectProgress> selectFaEquipmentProjectProgress(@Param("start") int start,
                                                                      @Param("end") int end,
                                                                      @Param("province") String province,
                                                                      @Param("city") String city,
                                                                      @Param("county") String county,
                                                                      @Param("buildYear") String buildYear,
                                                                      @Param("buildingProject") String buildingProject,
                                                                      @Param("operator") String operator,
                                                                      @Param("keyword") String onSiteSupervision,
                                                                      @Param("keyword") String projectLeader);


    //导出数据
    List<FaEquipmentProjectProgress> FaEquipmentProjectProgressExcel(String[] ids);
}