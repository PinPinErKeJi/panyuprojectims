package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.PowerSupplyDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PowerSupplyDTODao {

    //查询模块总数
    long selectAllPowerSupplyDTOCount();
    //无条件分页查询展示模块数据
    List<PowerSupplyDTO> selectAllPowerSupplyDTO(@Param("start") int start,
                                                 @Param("end") int end);

    //根据检查项目名模糊匹配查询条数
    long getFuzzysearchPowerSupplyDTOCount(@Param("powerProjectName") String powerProjectName);
    //根据检查项目名分页模糊匹配查询
    List<PowerSupplyDTO> FuzzysearchPowerSupplyDTO(
            @Param("start") int start, @Param("end") int end,
            @Param("powerProjectName") String powerProjectName);


    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询条数
    long selectDropdownBoxAndSearchCount(
            @Param("powerModuleId") String powerModuleId,
            @Param("powerProjectName") String powerProjectName);
    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询
    List<PowerSupplyDTO> selectAllDropdownBoxAndSearchPowerSupplyDTO(
            @Param("start") int start, @Param("end") int end,
            @Param("powerModuleId") String powerModuleId,
            @Param("powerProjectName") String powerProjectName);


    //根据模块名为空以及搜索框内容进行分页模糊匹配查询条数
    long selectAllPowerSupplyDTOSearchCount(@Param("powerModuleId") String powerModuleId);
    //根据模块名为空以及搜索框内容进行分页模糊匹配查询
    List<PowerSupplyDTO> selectAllPowerSupplyDTOSearchList(@Param("start") int start, @Param("end") int end,
                                                           @Param("powerModuleId") String powerModuleId);

    //导出空表格
    List<PowerSupplyDTO> ExportNullPowerSupplyExcel();

    //导出线路专业模块库Excel表格数据
    List<PowerSupplyDTO> ExportPowerSupplyExcel(String[] ids);

}
