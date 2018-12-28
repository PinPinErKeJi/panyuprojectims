package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.GarrisonDTO;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface GarrisonDTOService {

    //无条件分页查询展示模块数据
    PageHelperUtil selectAllGarrisonDTO(int start, int end);

    //根据检查项目名分页模糊匹配查询
    PageHelperUtil FuzzysearchGarrisonDTO(int start, int end, String garrisonProjectName);

    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询
    PageHelperUtil selectAllDropdownBoxAndSearchGarrisonDTO(
            int start, int end, String garrisonId, String garrisonProjectName);

    //根据模块名为空以及搜索框内容进行分页模糊匹配查询
    PageHelperUtil selectAllGarrisonDTOSearchList(int start, int end, String garrisonId);


    /*
   * 导出模块空的Excel表格
   * */
    List<GarrisonDTO> exportExcel();

    /*
    * 导出模块Excel表格信息数据
    * */
    List<GarrisonDTO> exportGarrison(String[] ids);

    /*
    * t添加导入Excel表格数据
    * */
    boolean insertDTO(
            String garrisonNamedto,
            String garrisonSubWorkNamedto,
            String garrisonProjectNamedto,
            String garrisonCriterionNamedto);
}
