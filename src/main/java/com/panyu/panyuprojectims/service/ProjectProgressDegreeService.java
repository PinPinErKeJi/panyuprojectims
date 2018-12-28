package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.ProjectProgressDegree;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface ProjectProgressDegreeService{

	PageHelperUtil selectProjectProgressDegree(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String onSiteSupervision,
            String professionPeople,
            String districtHead);

//导出数据
	List<ProjectProgressDegree> ProjectProgressDegreeExcel(String[] ids);
}