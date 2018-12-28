package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaEquipmentInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FaEquipmentInformationDao{
    //分页模糊匹配搜索查询
    long getFaEquipmentInformationRowCount(@Param("province") String province,
                                           @Param("city") String city,
                                           @Param("county") String county,
                                           @Param("buildYear") String buildYear,
                                           @Param("buildingProject") String buildingProject,
                                           @Param("operator") String operator,
                                           @Param("keyword") String onSiteSupervision,
                                           @Param("keyword") String projectLeader);

    List<FaEquipmentInformation> selectFaEquipmentInformation(@Param("start") int start,
                                                              @Param("end") int end,
                                                              @Param("province") String province,
                                                              @Param("city") String city,
                                                              @Param("county") String county,
                                                              @Param("buildYear") String buildYear,
                                                              @Param("buildingProject") String buildingProject,
                                                              @Param("operator") String operator,
                                                              @Param("keyword") String onSiteSupervision,
                                                              @Param("keyword") String projectLeader);

    FaEquipmentInformation selectFaEquipmentInformationById(String id);

    //添加
    int insertFaEquipmentInformation(@Param("equipmentInformationId") String equipmentInformationId,
                                     @Param("operator") String operator,
                                     @Param("buildYear") String buildYear,
                                     @Param("buildingProject") String buildingProject,
                                     @Param("motorRoomName") String motorRoomName,
                                     @Param("motorRoomLongitude") String motorRoomLongitude,
                                     @Param("motorRoomLatitude") String motorRoomLatitude,
                                     @Param("province") String province,
                                     @Param("city") String city,
                                     @Param("county") String county,
                                     @Param("onSiteSupervision") String onSiteSupervision,
                                     @Param("projectLeader") String projectLeader,
                                     @Param("equipmentId") String equipmentId,
                                     @Param("boardCardDilatationId") String boardCardDilatationId,
                                     @Param("powerNetworkLineId") String powerNetworkLineId,
                                     @Param("pigtailSkipFiberId") String pigtailSkipFiberId,
                                     @Param("walkingFrameId") String walkingFrameId,
                                     @Param("fiberOpticChannelId") String fiberOpticChannelId);

    //根据设备基本工程信息表字段的ID查询关联的其他表ID字段
    String selectFaCabinetPowerFrameIdByEquipmentInformationId(@Param("equipmentInformationId") String equipmentInformationId);

    String selectFaBoardcardDilatationIdByEquipmentInformationId(@Param("equipmentInformationId") String equipmentInformationId);

    String selectFaPowerNetworkLineIdByEquipmentInformationId(@Param("equipmentInformationId") String equipmentInformationId);

    String selectFaPigtailSkipFiberIdByEquipmentInformationId(@Param("equipmentInformationId") String equipmentInformationId);

    String selectFaWalkingFrameIdByEquipmentInformationId(@Param("equipmentInformationId") String equipmentInformationId);

    String selectFaFiberOpticChannelIdByEquipmentInformationId(@Param("equipmentInformationId") String equipmentInformationId);

    //根据设备基本工程信息表字段的ID删除选中项
    int deleteFaEquipmentInformationById(@Param("equipmentInformationId") String equipmentInformationId);

    int updateFaEquipmentInformationById(FaEquipmentInformation enti);

    //导出设备基本工程信息空Excel表格
    List<FaEquipmentInformation> FAExportEquipmentNullExcel();
    //导出设备基本工程信息Excel表格
    List<FaEquipmentInformation> FAExportEquipmentInfoExcel(String[] ids);
}