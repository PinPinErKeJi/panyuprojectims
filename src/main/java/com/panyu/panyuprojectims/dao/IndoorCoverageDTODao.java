package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.IndoorCoverageDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface IndoorCoverageDTODao {

    //查询室内覆盖信息总条数
    long selectIndoorCoverageDTOCount();
    //无条件分页查询展示室内覆盖信息数据
    List<IndoorCoverageDTO> selectIndoorCoverageDTO(
            @Param("start") int start, @Param("end") int end);
    //根据检查项目名模糊匹配搜索查询信息总条数
    long getFuzzysearchIndoorCoverageDTOCount(
            @Param("indoorProjectName") String indoorProjectName);
    //根据检查项目名模糊匹配搜索查询信息展示
    List<IndoorCoverageDTO> selectFuzzysearchIndoorCoverageDTO(
            @Param("start") int start,
            @Param("end") int end,
            @Param("indoorProjectName") String indoorProjectName);
    //根据点击下拉框模块名以及搜索框内容模糊匹配查询信息总条数
    long getIndoorCoverageDTOByIdAndNameCount(
            @Param("indoorCoverageId") String indoorCoverageId,
            @Param("indoorProjectName") String indoorProjectName);
    //根据点击下拉框模块名以及搜索框内容模糊匹配查询信息展示
    List<IndoorCoverageDTO> selectIndoorCoverageDTOByIdAndName(
            @Param("start") int start,
            @Param("end") int end,
            @Param("indoorCoverageId") String indoorCoverageId,
            @Param("indoorProjectName") String indoorProjectName
    );
    //根据点击下拉框模块名分页查询总条数
    long getIndoorCoverageDTOByIdCount(
            @Param("indoorCoverageId") String indoorCoverageId
    );
    //根据点击下拉框模块名分页查询展示信息数据
    List<IndoorCoverageDTO> selectAllIndoorCoverageDTOById(
            @Param("start") int start,
            @Param("end") int end,
            @Param("indoorCoverageId") String indoorCoverageId
    );


    //导出Excel空表格
    List<IndoorCoverageDTO> exportExcelIndoorCoverage();

    //导出Excel表格数据
    List<IndoorCoverageDTO> exportIndoorCoverage(String[] ids);
}
