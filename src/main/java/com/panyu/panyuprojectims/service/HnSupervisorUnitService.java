package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnSupervisorUnit;
public interface HnSupervisorUnitService{

	//根据驻地网监理单位表ID字段删除数据
	int deleteHnSupervisorUnitBySupervisorUnitId(String supervisorUnitId);

	//添加
	int insertHnSupervisorUnit(String supervisorUnitId,
                               String onSiteSupervision,
                               String professionResponsiblePerson,
                               String districtHead);

}