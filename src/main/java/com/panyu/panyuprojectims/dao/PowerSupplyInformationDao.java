package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PowerSupplyInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PowerSupplyInformationDao{

    //查询基站信息总数---------------------------------------------------------------------------------
    long getPowerSupplyInformationRowCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("motorRoomName") String motorRoomName,
            @Param("keyword") String siteSupervision,
            @Param("keyword") String projectLeader);
    //分页查询基站信息和搜索
    List<PowerSupplyInformation> selectPowerSupplyInformation(
            @Param("start") int start,
            @Param("end") int end,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("motorRoomName") String motorRoomName,
            @Param("keyword") String siteSupervision,
            @Param("keyword") String projectLeader);


    //添加
    int insertPowerSupplyInformation(
            @Param("powerInformationId") String powerInformationId,
            @Param("operator") String operator,
            @Param("buildYear") String buildYear,
            @Param("buildingProject") String buildingProject,
            @Param("motorRoomName") String motorRoomName,
            @Param("motorRoomLongitude") String motorRoomLongitude,
            @Param("motorRoomLatitude") String motorRoomLatitude,
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("siteSupervision") String siteSupervision,
            @Param("projectLeader") String projectLeader,
            @Param("powerEquipmentId") String powerEquipmentId,
            @Param("newPowerCableId") String newPowerCableId,
            @Param("newCablingRackId") String newCablingRackId);

    //根据信息ID查询关联的小表的ID
    String selectPowerEquipmentId(@Param("powerInformationId") String powerInformationId);
    String selectNewPowerCableId(@Param("powerInformationId") String powerInformationId);
    String selectNewCablingRackId(@Param("powerInformationId") String powerInformationId);
    //删除
    int deletePowerSupplyInformation(@Param("powerInformationId") String powerInformationId);

    //导出空表格
    List<PowerSupplyInformation> importPowerSupplyInformationExcel();
    //导出数据
    List<PowerSupplyInformation> powerSupplyInformationExcel(String[] ids);




}