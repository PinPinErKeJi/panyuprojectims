package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnSupervisorUnit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnSupervisorUnitDao{



	//根据驻地网监理单位表ID字段删除数据
	int deleteHnSupervisorUnitBySupervisorUnitId(@Param("supervisorUnitId") String supervisorUnitId);

	//添加
	int insertHnSupervisorUnit(@Param("supervisorUnitId") String supervisorUnitId,
                               @Param("onSiteSupervision") String onSiteSupervision,
                               @Param("professionResponsiblePerson") String professionResponsiblePerson,
                               @Param("districtHead") String districtHead);



}