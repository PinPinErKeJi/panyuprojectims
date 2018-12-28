package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.PowerSupplyInformation;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface PowerSupplyInformationService{



    //信息数据展示
    PageHelperUtil selectPowerSupplyInformation(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String motorRoomName,
            String siteSupervision,
            String projectLeader);


    //添加
    boolean insertPowerSupplyInformation(String powerInformationId,
                                         String operator,
                                         String buildYear,
                                         String buildingProject,
                                         String motorRoomName,
                                         String motorRoomLongitude,
                                         String motorRoomLatitude,
                                         String province,
                                         String city,
                                         String county,
                                         String siteSupervision,
                                         String projectLeader,
                                         String powerEquipmentId,
                                         String newPowerCableId,
                                         String newCablingRackId);

    //根据信息ID查询关联的小表的ID
    String selectPowerEquipmentId(String powerInformationId);
    String selectNewPowerCableId(String powerInformationId);
    String selectNewCablingRackId(String powerInformationId);
    //删除
    int deletePowerSupplyInformation(String powerInformationId);

    //导出空表格
    List<PowerSupplyInformation> importPowerSupplyInformationExcel();
    //导出数据
    List<PowerSupplyInformation> powerSupplyInformationExcel(String[] ids);

    //导入数据
    boolean addPowerSupplyInformation(String powerInformationId,
                                      String operator,
                                      String buildYear,
                                      String buildingProject,
                                      String motorRoomName,
                                      String motorRoomLongitude,
                                      String motorRoomLatitude,
                                      String province,
                                      String city,
                                      String county,
                                      String siteSupervision,
                                      String projectLeader,
                                      String powerEquipmentId,
                                      String newPowerCableId,
                                      String newCablingRackId,
                                      String powerEquipmentNumber,
                                      String powerEquipmentType,
                                      String powerEquipmentModel,
                                      String equipmentDesignStart,
                                      String powerEquipmentSize,
                                      String powerEquipmentSupplier,
                                      String powerEquipmentLinkman,
                                      String newPowerCableNumber,
                                      String newPowerCableModel,
                                      String newPowerCableRow,
                                      String powerSingleLength,
                                      String powerTotalLength,
                                      String beFrom,
                                      String beTo,
                                      String cableEquipmentSupplier,
                                      String cableEquipmentLinkman,
                                      String newCablingRackNumber,
                                      String rackDesignStart,
                                      String rackEquipmentSupplier,
                                      String rackEquipmentLinkman);

    //根据信息id查询包含的模块id
    List<String> selectPowerModuleIdList(String powerInformationId);


}