package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.LlCircuitInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface LlCircuitInformationDao{

    //模糊匹配查询展示线路基本信息总条数
    long getCircuitInformationCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("keyword") String siteLeader,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead
    );
    //分页模糊匹配查询展示线路基本信息数据
    List<LlCircuitInformation> selectAllLlCircuitInformation(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("keyword") String siteLeader,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead
    );
    //根据线路基本信息ID查询关联的小表ID（基于删除大表必须先删除小表的规则）
    String selectDesignInstituteId(@Param("circuitInformationId") String circuitInformationId);
    String selectSupervisionUnitId(@Param("circuitInformationId") String circuitInformationId);
    String selectConstructionUnitId(@Param("circuitInformationId") String circuitInformationId);
    String selectNewLineLengthId(@Param("circuitInformationId") String circuitInformationId);
    String selectCableLengthDesignId(@Param("circuitInformationId") String circuitInformationId);
    String selectNewFloorStandId(@Param("circuitInformationId") String circuitInformationId);
    String selectWornFloorStandId(@Param("circuitInformationId") String circuitInformationId);
    String selectNewWallMountedOnuId(@Param("circuitInformationId") String circuitInformationId);
    String selectWornWallMountedOnuId(@Param("circuitInformationId") String circuitInformationId);
    //根据线路基本信息ID删除选中项
    int deleteLlCircuitInformation(@Param("circuitInformationId") String circuitInformationId);
    //添加线路基本信息数据
    int insertLlCircuitInformation(
            @Param("circuitInformationId") String circuitInformationId,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("buildYear") String buildYear,
            @Param("hopName") String hopName,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("area") String area,
            @Param("subordinateDepartment") String subordinateDepartment,
            @Param("designInstituteId") String designInstituteId,
            @Param("supervisionUnitId") String supervisionUnitId,
            @Param("constructionUnitId") String constructionUnitId,
            @Param("newLineLengthId") String newLineLengthId,
            @Param("cableType") String cableType,
            @Param("cableLengthDesignId") String cableLengthDesignId,
            @Param("newFloorStandId") String newFloorStandId,
            @Param("wornFloorStandId") String wornFloorStandId,
            @Param("newWallMountedOnuId") String newWallMountedOnuId,
            @Param("wornWallMountedOnuId") String wornWallMountedOnuId
    );
    //导出线路基本信息Excel空表格
    List<LlCircuitInformation> importLlCircuitInformationNullExcel();
    //导出线路基本信息Excel表格数据
    List<LlCircuitInformation> importLlCircuitInformationExcel(String[] ids);
}