package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.PowerSupplyProgress;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface PowerSupplyProgressService{

    PageHelperUtil selectPowerSupplyProgress(
            int start,
            int end,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String siteSupervision,
            String projectLeader
    );
    //导出进度Excel表格数据
    List<PowerSupplyProgress> importPowerSupplyProgressExcel(String[] ids);
}