package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.EquipmentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EquipmentDTODao {

    //查询模块总数
    long getEquimentDTOCount();
    //无条件查询展示所有数据
    List<EquipmentDTODao> selectAllEquimentDTODao(@Param("start") int start,
                                                  @Param("end") int end);

    //根据项目名模糊搜索查询
    long getFuzzysearchEquimentDTODaoCount(@Param("equipmentProjectName") String equipmentProjectName);

    List<EquipmentDTODao> FuzzysearchEquimentDTODao(@Param("start") int start,
                                                    @Param("end") int end,
                                                    @Param("equipmentProjectName") String equipmentProjectName);

    //根据点击下拉框名称以及搜索框内容都不为空进行模糊分页查询
    long getDropdownBoxAndSearch(@Param("equipmentSpecialityId") String equipmentSpecialityId,
                                 @Param("equipmentProjectName") String equipmentProjectName);

    List<EquipmentDTODao> selectDropdownBoxAndSearch(@Param("start") int start,
                                                     @Param("end") int end,
                                                     @Param("equipmentSpecialityId") String equipmentSpecialityId,
                                                     @Param("equipmentProjectName") String equipmentProjectName);

    //当搜索框内容为空根据模块ID点击下拉框进行搜索分页展示数据
    long getEquipmentSpecialityIdAndSeachCount(@Param("equipmentSpecialityId") String equipmentSpecialityId);

    List<EquipmentDTODao> selectEquipmentSpecialityIdAndSeach(@Param("start") int start,
                                                              @Param("end") int end,
                                                              @Param("equipmentSpecialityId") String equipmentSpecialityId);

    //导出设备专业空Excel表格
    List<EquipmentDTO> ExportNullEquipmentExcel();
    //导出设备专业模块库Excel表格数据
    List<EquipmentDTO> ExportEquipmentExcel(String[] ids);
}
