package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.ProjectProgressDegree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ProjectProgressDegreeDao{
//分页模糊查询
    long getProjectProgressDegreeRowCount(@Param("province") String province,
                                          @Param("city") String city,
                                          @Param("county") String county,
                                          @Param("buildYear") String buildYear,
                                          @Param("buildingProject") String buildingProject,
                                          @Param("operator") String operator,
                                          @Param("keyword") String onSiteSupervision,
                                          @Param("keyword") String professionPeople,
                                          @Param("keyword") String districtHead);

    List<ProjectProgressDegree> selectProjectProgressDegree(@Param("start") int start,
                                                            @Param("end") int end,
                                                            @Param("province") String province,
                                                            @Param("city") String city,
                                                            @Param("county") String county,
                                                            @Param("buildYear") String buildYear,
                                                            @Param("buildingProject") String buildingProject,
                                                            @Param("operator") String operator,
                                                            @Param("keyword") String onSiteSupervision,
                                                            @Param("keyword") String professionPeople,
                                                            @Param("keyword") String districtHead);
//导出数据
	List<ProjectProgressDegree> ProjectProgressDegreeExcel(String[] ids);

}