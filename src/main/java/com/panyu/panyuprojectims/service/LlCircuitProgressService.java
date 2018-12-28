package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.LlCircuitProgress;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

public interface LlCircuitProgressService{

    //数据展示和模糊查询
    PageHelperUtil selectLlCircuitProgress(int page,
                                           int rows,
                                           String province,
                                           String city,
                                           String county,
                                           String buildYear,
                                           String operator,
                                           String buildingProject,
                                           String siteLeader,
                                           String professionResponsiblePerson,
                                           String districtHead);

    //导出数据
    List<LlCircuitProgress> importLlCircuitProgressExcel(String[] ids);

}