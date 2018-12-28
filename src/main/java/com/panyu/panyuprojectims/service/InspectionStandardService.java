package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.InspectionStandard;

import java.util.List;

public interface InspectionStandardService{

	//根据标准规范id和内容查询对象
	InspectionStandard getInspectionStandard(String standardId, String inspectionContent);

    List<InspectionStandard> selectInspectionStandardById(String projectId);

    String selectStandardProjectId(String projectId);

    int deleteInspectionStandardById(String standardId);

    int updateStandard(String standardId, String inspectionContent);

	//添加
	InspectionStandard addInspectionStandard(String inspectionContent, String projectId);
}