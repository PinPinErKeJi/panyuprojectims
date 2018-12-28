package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.GarrisonDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GarrisonDTODao {

    //查询模块总数
    long selectAllGarrisonDTOCount();
    //无条件分页查询展示模块数据
    List<GarrisonDTO> selectAllGarrisonDTO(@Param("start") int start,
                                           @Param("end") int end);

    //根据检查项目名模糊匹配查询条数
    long getFuzzysearchGarrisonDTOCount(@Param("garrisonProjectName") String garrisonProjectName);
    //根据检查项目名分页模糊匹配查询
    List<GarrisonDTO> FuzzysearchGarrisonDTO(
            @Param("start") int start, @Param("end") int end,
            @Param("garrisonProjectName") String garrisonProjectName);

    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询条数
    long selectDropdownBoxAndSearchCount(
            @Param("garrisonId") String garrisonId,
            @Param("garrisonProjectName") String garrisonProjectName);
    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询
    List<GarrisonDTO> selectAllDropdownBoxAndSearchGarrisonDTO(
            @Param("start") int start, @Param("end") int end,
            @Param("garrisonId") String garrisonId,
            @Param("garrisonProjectName") String garrisonProjectName);

    //根据模块名为空以及搜索框内容进行分页模糊匹配查询条数
    long selectAllGarrisonDTOSearchCount(@Param("garrisonId") String garrisonId);
    //根据模块名为空以及搜索框内容进行分页模糊匹配查询
    List<GarrisonDTO> selectAllGarrisonDTOSearchList(@Param("start") int start, @Param("end") int end,
                                                     @Param("garrisonId") String garrisonId);



    //导出Excel空表格
    List<GarrisonDTO> exportExcel();

    //导出Excel表格数据
    List<GarrisonDTO> exportGarrison(String[] ids);
}
