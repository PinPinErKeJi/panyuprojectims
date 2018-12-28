package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.EquipmentDTO;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface EquipmentDTOService {

    //无条件查询展示所有数据
    PageHelperUtil selectAllEquimentDTODao(int start, int end);

    //根据项目名模糊搜索查询
    PageHelperUtil FuzzysearchEquimentDTODao(int start, int end, String equipmentProjectName);

    //根据点击下拉框名称以及搜索框内容都不为空进行模糊分页查询
    PageHelperUtil selectDropdownBoxAndSearch(int start, int end, String equipmentSpecialityId, String equipmentProjectName);

    //当搜索框内容为空根据模块ID点击下拉框进行搜索分页展示数据
    PageHelperUtil selectEquipmentSpecialityIdAndSeach(int start, int end, String equipmentSpecialityId);

    //导出设备专业空Excel表格
    List<EquipmentDTO> ExportNullEquipmentExcel();

    //导出设备专业模块库Excel表格数据
    List<EquipmentDTO> ExportEquipmentExcel(String[] ids);

    //导入设备专业模块库Excel表格数据
    boolean importEquipmentExcel(
            String equipmentSpecialityNamedto,
            String equipmentSubWorkNamedto,
            String equipmentProjectNamedto,
            String equipmentCriterionNamedto);



}
