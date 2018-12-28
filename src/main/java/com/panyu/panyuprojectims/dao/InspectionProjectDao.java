package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.InspectionProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InspectionProjectDao{


	//根据检查项目id和名字查询对象
	InspectionProject getInspectionProject(@Param("projectId") String projectId, @Param("projectName") String projectName);

	InspectionProject selectProjectName(@Param("projectId") String projectId);

	//根据名字和父级id查个数
	int getCountByProjectNameAndSubId(@Param("projectName") String projectName, @Param("subId") String subId);

	/*------------------------------添加检查项目选项框内容开始-----------------------------------------------*/

	List<InspectionProject> selectInspectionProjectById(String subId);

	InspectionProject selectInspectionProjectByName(@Param("projectName") String projectName, @Param("subId") String subId);

	int insertInspectionProject(@Param("projectName") String projectName, @Param("subId") String subId);
/*------------------------------添加检查项目选项框内容结束----------------------------------------------*/


/*------------------------------删除检查项目选项框内容开始----------------------------------------------*/
	List<String> selectProjectSubId(String subId);

	int deleteInspectionProjectById(String projectId);
/*------------------------------删除检查项目选项框内容结束----------------------------------------------*/

/*------------------------------修改检查项目选项框内容开始----------------------------------------------*/
	int updateProject(@Param("projectId") String projectId, @Param("projectName") String projectName);
/*------------------------------修改检查项目选项框内容结束----------------------------------------------*/

//根据projectName 和 subId 查询projectId
	String selectProjectIdByProjectNameAndSubId(@Param("projectName") String projectName, @Param("subId") String subId);

}