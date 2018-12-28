package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.FaEquipmentInformation;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface FaEquipmentInformationService{

    PageHelperUtil selectFaEquipmentInformation(int page, int rows,
                                                String province,
                                                String city,
                                                String county,
                                                String buildYear,
                                                String buildingProject,
                                                String operator,
                                                String onSiteSupervision,
                                                String projectLeader);

    FaEquipmentInformation selectFaEquipmentInformationById(String id);

    //添加
    boolean insertFaEquipmentInformation(String equipmentInformationId,
                                         String operator,
                                         String buildYear,
                                         String buildingProject,
                                         String motorRoomName,
                                         String motorRoomLongitude,
                                         String motorRoomLatitude,
                                         String province,
                                         String city,
                                         String county,
                                         String onSiteSupervision,
                                         String projectLeader,
                                         String equipmentId,
                                         String boardCardDilatationId,
                                         String powerNetworkLineId,
                                         String pigtailSkipFiberId,
                                         String walkingFrameId,
                                         String fiberOpticChannelId);

    //根据设备基本工程信息表字段的ID查询关联的其他表ID字段
    String selectFaCabinetPowerFrameIdByEquipmentInformationId(String equipmentInformationId);

    String selectFaBoardcardDilatationIdByEquipmentInformationId(String equipmentInformationId);

    String selectFaPowerNetworkLineIdByEquipmentInformationId(String equipmentInformationId);

    String selectFaPigtailSkipFiberIdByEquipmentInformationId(String equipmentInformationId);

    String selectFaWalkingFrameIdByEquipmentInformationId(String equipmentInformationId);

    String selectFaFiberOpticChannelIdByEquipmentInformationId(String equipmentInformationId);
    //根据设备基本工程信息表字段的ID删除选中项
    int deleteFaEquipmentInformationById(String equipmentInformationId);

    int updateFaEquipmentInformationById(FaEquipmentInformation enti);

    //导出设备基本工程信息空Excel表格
    List<FaEquipmentInformation> FAExportEquipmentNullExcel();
    //导出设备基本工程信息Excel表格
    List<FaEquipmentInformation> FAExportEquipmentInfoExcel(String[] ids);
    //导入数据添加
    boolean add(String fiberOpticChannelId,
                String fiberOpticNumber,
                String fiberOpticDesignLength,
                String fiberOpticSupplier,
                String fiberOpticContacts,
                String pigtailSkipFiberId,
                String pigtailNumber,
                String fiberCableType,
                String fiberSpecificationModel,
                String fiberNumberOfBranches,
                String fiberSingleLength,
                String forms,
                String to2,
                String fiberSupplier,
                String fiberContacts,
                String powerNetworkLineId,
                String powerNumber,
                String cableType,
                String specificationModel,
                String numberOfBranches,
                String singleLength,
                String totalLength,
                String froms,
                String to1,
                String powerSupplier,
                String powerContacts,
                String walkingFrameId,
                String walkingNumber,
                String walkingDesignLength,
                String walkingFrameSupplier,
                String walkingFrameContacts,
                String boardCardDilatationId,
                String boardCardNumber,
                String boardCardName,
                String veneerFunction,
                String placeEquipment,
                String boardCardDesignQuantity,
                String boardCardSupplier,
                String boardCardContacts,
                String equipmentId,
                String equipmentNumber,
                String equipmentType,
                String equipmentName,
                String equipmentModel,
                String equipmentDesignQuantity,
                String equipmentSize,
                String equipmentSupplier,
                String equipmentContacts,
                String equipmentInformationId,
                String operator,
                String buildYear,
                String buildingProject,
                String motorRoomName,
                String motorRoomLongitude,
                String motorRoomLatitude,
                String province,
                String city,
                String county,
                String onSiteSupervision,
                String projectLeader
    );

    //查询对应设备信息包含的设备模块id
    List<String> selectEquipmentSpecialityId(String equipmentInformationId);
}