package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.InspectionProject;

import java.util.List;

public interface InspectionProjectService{

	//根据检查项目id和名字查询对象
	InspectionProject getInspectionProject(String projectId, String projectName);

	InspectionProject selectProjectName(String projectId);

/*----------------------------------------------添加检查项目选项框开始----------------------------------------------*/

	List<InspectionProject> selectInspectionProjectById(String subId);

/*----------------------------------------------添加检查项目选项框结束----------------------------------------------*/

/*----------------------------------------------删除检查项目选项框结束----------------------------------------------*/
	List<String> selectProjectSubId(String subId);

	int deleteInspectionProjectById(String projectId);
/*----------------------------------------------删除检查项目选项框结束----------------------------------------------*/

/*----------------------------------------------修改检查项目选项框开始----------------------------------------------*/
	int updateProject(String projectId, String projectName);
/*----------------------------------------------修改检查项目选项框结束----------------------------------------------*/

	//添加
	InspectionProject addProject(String projectName, String subId);
}