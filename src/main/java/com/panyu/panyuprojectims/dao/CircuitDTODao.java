package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.CircuitDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CircuitDTODao {

    //查询模块总数
    long selectAllCircuitDTOCount();
    //无条件分页查询展示模块数据
    List<CircuitDTO> selectAllCircuitDTO(@Param("start") int start,
                                         @Param("end") int end);



    //根据检查项目名模糊匹配查询条数
    long getFuzzysearchCircuitDTOCount(@Param("circuitProjectName") String circuitProjectName);
    //根据检查项目名分页模糊匹配查询
    List<CircuitDTO> FuzzysearchCircuitDTO(
            @Param("start") int start, @Param("end") int end,
            @Param("circuitProjectName") String circuitProjectName);


    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询条数
    long selectDropdownBoxAndSearchCount(
            @Param("circuitModuleId") String circuitModuleId,
            @Param("circuitProjectName") String circuitProjectName);
    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询
    List<CircuitDTO> selectAllDropdownBoxAndSearchCircuitDTO(
            @Param("start") int start, @Param("end") int end,
            @Param("circuitModuleId") String circuitModuleId,
            @Param("circuitProjectName") String circuitProjectName);


    //根据模块名为空以及搜索框内容进行分页模糊匹配查询条数
    long selectAllCircuitDTOSearchCount(@Param("circuitModuleId") String circuitModuleId);
    //根据模块名为空以及搜索框内容进行分页模糊匹配查询
    List<CircuitDTO> selectAllCircuitDTOSearchList(@Param("start") int start, @Param("end") int end,
                                                   @Param("circuitModuleId") String circuitModuleId);

    //导出空表格
    List<CircuitDTO> ExportNullCircuitExcel();

    //导出线路专业模块库Excel表格数据
    List<CircuitDTO> ExportCircuitExcel(String[] ids);



}
