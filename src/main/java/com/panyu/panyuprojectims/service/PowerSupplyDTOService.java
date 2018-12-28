package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.CircuitDTO;
import com.panyu.panyuprojectims.entity.PowerSupplyDTO;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PowerSupplyDTOService {

    //无条件分页查询展示模块数据
    PageHelperUtil selectAllPowerSupplyDTO(int start, int end);

    //根据检查项目名分页模糊匹配查询
    PageHelperUtil FuzzysearchPowerSupplyDTO(int start, int end, String powerProjectName);

    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询
    PageHelperUtil selectAllDropdownBoxAndSearchPowerSupplyDTO(
            int start, int end, String powerModuleId, String powerProjectName);


    //根据模块名为空以及搜索框内容进行分页模糊匹配查询
    PageHelperUtil selectAllPowerSupplyDTOSearchList(int start, int end, String powerModuleId);

    //导出空表格
    List<PowerSupplyDTO> ExportNullPowerSupplyExcel();

    //导出线路专业模块库Excel表格数据
    List<PowerSupplyDTO> ExportPowerSupplyExcel(String[] ids);

    //导入设备专业模块库Excel表格数据
    boolean importPowerSupplyDTO(
            String powerModuleName,
            String powerSubWorkName,
            String powerProjectName,
            String powerCriterionName
    );
}
