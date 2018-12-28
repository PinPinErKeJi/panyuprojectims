package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.FaEquipmentProjectProgress;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface FaEquipmentProjectProgressService{

    PageHelperUtil selectFaEquipmentProjectProgress(int page, int rows,
                                                    String province,
                                                    String city,
                                                    String county,
                                                    String buildYear,
                                                    String buildingProject,
                                                    String operator,
                                                    String onSiteSupervision,
                                                    String projectLeader);
    //导出数据
    List<FaEquipmentProjectProgress> FaEquipmentProjectProgressExcel(String[] ids);
}