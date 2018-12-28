package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.IndoorCoverageDTO;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface IndoorCoverageDTOService {

    //无条件分页查询展示室内覆盖信息数据
    PageHelperUtil selectIndoorCoverageDTO(int start, int end);
    //根据检查项目名模糊匹配搜索查询信息展示
    PageHelperUtil selectFuzzysearchIndoorCoverageDTO(int start, int end, String indoorProjectName);
    //根据点击下拉框模块名以及搜索框内容模糊匹配查询信息展示
    PageHelperUtil selectIndoorCoverageDTOByIdAndName(int start, int end, String indoorCoverageId, String indoorProjectName);
    //根据点击下拉框模块名分页查询展示信息数据
    PageHelperUtil selectAllIndoorCoverageDTOById(int start, int end, String indoorCoverageId);


    //导出模块空的Excel表格
    List<IndoorCoverageDTO> exportExcelIndoorCoverage();

    //导出模块Excel表格信息数据
    List<IndoorCoverageDTO> exportGarrisonIndoorCoverage(String[] ids);

    //添加导入Excel表格数据
    boolean insertDTO(
            String indoorCoverageNamedto,
            String indoorSubWorkNamedto,
            String indoorProjectNamedto,
            String indoorSpecificationNamedto);
}
