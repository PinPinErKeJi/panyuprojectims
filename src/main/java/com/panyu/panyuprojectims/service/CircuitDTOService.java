package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.CircuitDTO;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CircuitDTOService {

    //无条件分页查询展示模块数据
    PageHelperUtil selectAllCircuitDTO(int start, int end);

    //根据检查项目名分页模糊匹配查询
    PageHelperUtil FuzzysearchCircuitDTO(int start, int end, String circuitProjectName);

    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询
    PageHelperUtil selectAllDropdownBoxAndSearchCircuitDTO(
            int start, int end, String circuitModuleId, String circuitProjectName);


    //根据模块名为空以及搜索框内容进行分页模糊匹配查询
    PageHelperUtil selectAllCircuitDTOSearchList(int start, int end, String circuitModuleId);

    //导出空表格
    List<CircuitDTO> ExportNullCircuitExcel();

    //导出线路专业模块库Excel表格数据
    List<CircuitDTO> ExportCircuitExcel(String[] ids);

    //导入设备专业模块库Excel表格数据
    boolean importCircuitDTO(
            String circuitModuleNamedto,
            String circuitSubWorkNamedto,
            String circuitProjectNamedto,
            String circuitCriterionNamedto
    );


}
