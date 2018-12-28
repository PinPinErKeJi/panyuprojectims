package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.InspectionStandard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface InspectionStandardDao{

	//根据标准规范id和内容查询对象
	InspectionStandard getInspectionStandard(@Param("standardId") String standardId, @Param("inspectionContent") String inspectionContent);

	//根据名字和父级id查询个数
	int getCountByInspectionContentAndProjectId(@Param("inspectionContent") String inspectionContent, @Param("projectId") String projectId);

	/*--------------------------------------添加检查规范选项框开始----------------------------------------------*/
    List<InspectionStandard> selectInspectionStandardById(String projectId);
	/**
	 * 插入InspectionStandard到数据库,包括null值
	 * @return
	 */
    int insertInspectionStandard(@Param("inspectionContent") String inspectionContent, @Param("projectId") String projectId);

    InspectionStandard selectInspectionStandardByContent(@Param("inspectionContent") String inspectionContent, @Param("projectId") String projectId);

/*--------------------------------------添加检查规范选项框结束----------------------------------------------*/

/*--------------------------------------删除检查规范选项框开始----------------------------------------------*/
	String selectStandardProjectId(String projectId);

	int deleteInspectionStandardById(String standardId);
/*--------------------------------------删除检查规范选项框结束----------------------------------------------*/

/*--------------------------------------删除检查规范选项框结束----------------------------------------------*/
	int updateStandard(@Param("standardId") String standardId, @Param("inspectionContent") String inspectionContent);
/*--------------------------------------删除检查规范选项框结束----------------------------------------------*/
}