package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.ProjectProgress;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface ProjectProgressService{

	//根据图片库基本信息分页查询
	PageHelperUtil selectProjectProgressByPhoto(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String planningName,
            String actualName,
            String onSiteSupervision,
            String professionPeople,
            String districtHead,
            String regions);
	//信息数据展示
	PageHelperUtil selectProjectProgress(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
			String operator,
            String buildingProject,
            String planningName,
            String actualName,
            String regions,
            String onSiteSupervision,
            String professionPeople,
            String districtHead
    );

	//基本工程信息添加
	boolean insertProjectProgress(String projectProgressId,
                                  String operator,
                                  String buildYear,
                                  String buildingProject,
                                  String planningName,
                                  String actualName,
                                  String planningLongitude,
                                  String planningLatitude,
                                  String actualLongitude,
                                  String actualLatitudes,
                                  String province,
                                  String city,
                                  String county,
                                  String regions,
                                  String onSiteSupervision,
                                  String professionPeople,
                                  String districtHead,
                                  String overlayScene,
                                  String skyBranchId,
                                  String machineRoomId,
                                  String electricPowerId,
                                  String mainEquipmentId,
                                  String airConditionerId,
                                  String fireId,
                                  String powerMonitoringId);

//-----------------------------------删除方法开始---------------------------------------------//
	String selectProjectProgressBySkyId(String projectProgressId);

	String selectProjectProgressByMachId(String projectProgressId);

	String selectProjectProgressByElectricId(String projectProgressId);

	String selectProjectProgressByMainId(String projectProgressId);

	String selectProjectProgressByAirId(String projectProgressId);

	String selectProjectProgressByFireId(String projectProgressId);

	String selectProjectProgressByPowerId(String projectProgressId);

    int deleteProjectProgressById(String projectProgressId);

//-----------------------------------删除方法结束---------------------------------------------//

//导出Excel空表格
	List<ProjectProgress> importProjectProgressExcel();
//导出数据
	List<ProjectProgress> ProjectProgressExcel(String[] ids);
//导入数据
boolean add(
        String projectProgressId, String powerConstructionMode,
        String powerSupplierName, String powerSupplierContacts, String powerUnitName,
        String powerUnitContacts, String equipmentConstructionMode, String equipmentTypeName,
        String equipmentSupplierName, String equipmentSupplierContacts, String equipmentUnitName,
        String equipmentUnitContacts, String machineRoomConstructionMode, String machineRoomTypeName,
        String machineRoomConstructionName, String civilEngineeringContacts,
        String machineRoomDecorateName, String decorationUnitContacts, String fireConstructionMode,
        String handHeldNumber,
        String sprayingMethodNumber, String fireSupplierName,
        String fireSupplierContacts, String installationUnitName, String installationUnitContacts,
        String electricConstructionMode, String electricType, String electricUnitName, String electricUnitContacts,
        String airConstructionMode, String conditioningBrandName, String specificationTypeName, String airUnitName,
        String airConstructionContacts, String skyBranchId, String constructionMode, String basicType,
        String foundationConstructionName, String basicUnitContacts, String skyBranchTypeName,
        String skyBranchSupplierName, String skyBranchSupplierContacts, String skyBranchUnitName,
        String skyConstructionUnitContacts,
        String skyBranchHeight, String operator, String buildYear, String buildingProject, String planningName,
        String actualName, String planningLongitude, String planningLatitude, String actualLongitude,
        String actualLatitudes, String province, String city, String county, String regions, String onSiteSupervision,
        String professionPeople, String districtHead, String overlayScene,
        String machineRoomId, String electricPowerId, String mainEquipmentId, String airConditionerId, String fireId,
        String powerMonitoringId);

//查询导入信息的模块id
	List<String> selectModuleId(String projectProgressId);
}