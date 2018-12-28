package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IndoorCoverageInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IndoorCoverageInformationDao{

    //根据信息id查询室内覆盖信息对象
    IndoorCoverageInformation selectIndoorCoverageInformationByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);

    //添加
    int insertIndoorCoverageInformation(@Param("indoorInformationId") String indoorInformationId,
                                        @Param("operator") String operator,
                                        @Param("buildingProject") String buildingProject,
                                        @Param("buildYear") String buildYear,
                                        @Param("planStationName") String planStationName,
                                        @Param("actualStationName") String actualStationName,
                                        @Param("indoorLongitude") String indoorLongitude,
                                        @Param("indoorLatitude") String indoorLatitude,
                                        @Param("province") String province,
                                        @Param("city") String city,
                                        @Param("county") String county,
                                        @Param("subordinateDepartment") String subordinateDepartment,
                                        @Param("coverType") String coverType,
                                        @Param("icSupervisoryUnitId") String icSupervisoryUnitId,
                                        @Param("icConstructionId") String icConstructionId,
                                        @Param("icDesignUnitId") String icDesignUnitId,
                                        @Param("bbuNumberId") String bbuNumberId,
                                        @Param("rruNumber") String rruNumber,
                                        @Param("lightNumberId") String lightNumberId,
                                        @Param("passiveDeviceNumberId") String passiveDeviceNumberId,
                                        @Param("antennaNumberId") String antennaNumberId,
                                        @Param("cableLengthId") String cableLengthId,
                                        @Param("ammeterNumber") String ammeterNumber
    );

    //模糊匹配查询展示室内覆盖基本信息总条数
    long getIndoorCoverageInformationCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead,
            @Param("keyword") String siteLeader
    );
    //模糊匹配查询展示室内覆盖基本信息数据
    List<IndoorCoverageInformation> selectAllIndoorCoverageInformation(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("operator") String operator,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead,
            @Param("keyword") String siteLeader
    );
    //根据室内覆盖基本信息ID查询关联的小表ID（基于删除大表必须先删除小表的规则）
    String selectIcSupervisoryUnitIdByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);
    String selectIcConstructionIdByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);
    String selectIcDesignUnitIdByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);
    String selectBbuNumberIdByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);
    String selectLightNumberIdByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);
    String selectPassiveDeviceNumberIdByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);
    String selectAntennaNumberIdByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);
    String selectCableLengthIdByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);
    //根据室内覆盖基本信息ID删除选中项
    int deleteIndoorCoverageInformationByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);
    //导出室内覆盖Excel空表格
    List<IndoorCoverageInformation> importIndoorCoverInformationNullExcel();
    //导出室内覆盖Excel表格数据
    List<IndoorCoverageInformation> importIndoorCoverInformationExcel(String[] ids);
}