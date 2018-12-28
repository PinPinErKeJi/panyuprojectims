package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.LlCircuitInformation;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface LlCircuitInformationService{


    //查询导入信息包含的模块id集合
    List<String> selectCircuitModuleIdList(String circuitInformationId);


    PageHelperUtil selectAllLlCircuitInformation(
            int start,
            int end,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String siteLeader,
            String professionResponsiblePerson,
            String districtHead
    );
    //根据线路基本信息ID查询关联的小表ID（基于删除大表必须先删除小表的规则）
    String selectDesignInstituteId(String circuitInformationId);
    String selectSupervisionUnitId(String circuitInformationId);
    String selectConstructionUnitId(String circuitInformationId);
    String selectNewLineLengthId(String circuitInformationId);
    String selectCableLengthDesignId(String circuitInformationId);
    String selectNewFloorStandId(String circuitInformationId);
    String selectWornFloorStandId(String circuitInformationId);
    String selectNewWallMountedOnuId(String circuitInformationId);
    String selectWornWallMountedOnuId(String circuitInformationId);
    //根据线路基本信息ID删除选中项
    int deleteLlCircuitInformation(String circuitInformationId);
    //添加线路基本信息数据
    int insertLlCircuitInformation(
            String circuitInformationId,
            String operator,
            String buildingProject,
            String buildYear,
            String hopName,
            String province,
            String city,
            String county,
            String area,
            String subordinateDepartment,
            String designInstituteId,
            String supervisionUnitId,
            String constructionUnitId,
            String newLineLengthId,
            String cableType,
            String cableLengthDesignId,
            String newFloorStandId,
            String wornFloorStandId,
            String newWallMountedOnuId,
            String wornWallMountedOnuId
    );
    //导出线路基本信息Excel空表格
    List<LlCircuitInformation> importLlCircuitInformationNullExcel();
    //导出线路基本信息Excel表格数据
    List<LlCircuitInformation> importLlCircuitInformationExcel(String[] ids);
    //导入添加
    boolean add(String circuitInformationId,
                String operator,
                String buildingProject,
                String buildYear,
                String hopName,
                String province,
                String city,
                String county,
                String area,
                String subordinateDepartment,
                String designInstituteId,
                String supervisionUnitId,
                String constructionUnitId,
                String newLineLengthId,
                String cableType,
                String cableLengthDesignId,
                String newFloorStandId,
                String wornFloorStandId,
                String newWallMountedOnuId,
                String wornWallMountedOnuId,
                String companyName,
                String designPersonnel,
                String siteLeader,
                String professionResponsiblePerson,
                String districtHead,
                String corporateName,
                String personInCharge,
                String newPoleLine,
                String newPipe,
                String directBurialOpticalCable,
                String pushPipe,
                String gystsSuspended,
                String gystsSuspensionWire,
                String gysta,
                String plowInOpticalCable,
                String wallCable,
                String inBridgeCable,
                String gyfxts,
                String newFloorStandNumber,
                String newFloorStandSize,
                String wornFloorStandNumber,
                String wornFloorStandSize,
                String newWallMountedOnuNumber,
                String newWallMountedOnuSize,
                String wornWallMountedOnuNumber,
                String wornWallMountedOnuSize);
}