package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.HnGarrisonJobProgress;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface HnGarrisonJobProgressService{

    //分页模糊匹配查询展示驻地网工程进度信息数据
    PageHelperUtil selectHnGarrisonJobProgress(
            int page,
            int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String singleProjectName,
            String onSiteSupervision,
            String professionResponsiblePerson,
            String districtHead
    );
    //导出工程进度Excel表格数据
    List<HnGarrisonJobProgress> HnGarrisonJobProgressExcel(String[] ids);
}