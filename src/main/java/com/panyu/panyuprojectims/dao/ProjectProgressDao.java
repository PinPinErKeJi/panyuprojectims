package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.ProjectProgress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProjectProgressDao{

	//查询图片基本信息相关的数据条数
	long getPhotoCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("basename") String planningName,
            @Param("basename") String actualName,
            @Param("keyword") String onSiteSupervision,
            @Param("keyword") String professionPeople,
            @Param("keyword") String districtHead,
            @Param("regions") String regions);
	//根据图片库基本信息分页查询
	List<ProjectProgress> selectProjectProgressByPhoto(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("basename") String planningName,
            @Param("basename") String actualName,
            @Param("keyword") String onSiteSupervision,
            @Param("keyword") String professionPeople,
            @Param("keyword") String districtHead,
            @Param("regions") String regions);
	//查询基站信息总数---------------------------------------------------------------------------------
    long getProjectProgressRowCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("basename") String planningName,
            @Param("basename") String actualName,
            @Param("regions") String regions,
            @Param("keyword") String onSiteSupervision,
            @Param("keyword") String professionPeople,
            @Param("keyword") String districtHead
    );
	//分页查询基站信息和搜索
    List<ProjectProgress> selectProjectProgress(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
			@Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("basename") String planningName,
            @Param("basename") String actualName,
            @Param("regions") String regions,
            @Param("keyword") String onSiteSupervision,
            @Param("keyword") String professionPeople,
            @Param("keyword") String districtHead
    );



	//工程基本信息添加
	int insertProjectProgress(@Param("projectProgressId") String projectProgressId,
                              @Param("operator") String operator,
                              @Param("buildYear") String buildYear,
                              @Param("buildingProject") String buildingProject,
                              @Param("planningName") String planningName,
                              @Param("actualName") String actualName,
                              @Param("planningLongitude") String planningLongitude,
                              @Param("planningLatitude") String planningLatitude,
                              @Param("actualLongitude") String actualLongitude,
                              @Param("actualLatitudes") String actualLatitudes,
                              @Param("province") String province,
                              @Param("city") String city,
                              @Param("county") String county,
                              @Param("regions") String regions,
                              @Param("onSiteSupervision") String onSiteSupervision,
                              @Param("professionPeople") String professionPeople,
                              @Param("districtHead") String districtHead,
                              @Param("overlayScene") String overlayScene,
                              @Param("skyBranchId") String skyBranchId,
                              @Param("machineRoomId") String machineRoomId,
                              @Param("electricPowerId") String electricPowerId,
                              @Param("mainEquipmentId") String mainEquipmentId,
                              @Param("airConditionerId") String airConditionerId,
                              @Param("fireId") String fireId,
                              @Param("powerMonitoringId") String powerMonitoringId
    );
//-----------------------------------删除方法开始---------------------------------------------//
	String selectProjectProgressBySkyId(String projectProgressId);

	String selectProjectProgressByMachId(String projectProgressId);

	String selectProjectProgressByElectricId(String projectProgressId);

	String selectProjectProgressByMainId(String projectProgressId);

	String selectProjectProgressByAirId(String projectProgressId);

	String selectProjectProgressByFireId(String projectProgressId);

	String selectProjectProgressByPowerId(String projectProgressId);

    int deleteProjectProgressById(@Param("projectProgressId") String projectProgressId);

//-----------------------------------删除方法开始---------------------------------------------//

//导出空表格
	List<ProjectProgress> importProjectProgressExcel();
//导出数据
	List<ProjectProgress> ProjectProgressExcel(String[] ids);
//查询所有的基站信息
	List<ProjectProgress> selectAllProjectProgressIdList();
}