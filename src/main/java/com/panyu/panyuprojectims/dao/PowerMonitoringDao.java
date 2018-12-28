package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.PowerMonitoring;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PowerMonitoringDao{

	//添加
	int insertPowerMonitoring(@Param("powerMonitoringId") String powerMonitoringId,
                              @Param("powerConstructionMode") String powerConstructionMode,
                              @Param("powerSupplierName") String powerSupplierName,
                              @Param("powerSupplierContacts") String powerSupplierContacts,
                              @Param("powerUnitName") String powerUnitName,
                              @Param("powerUnitContacts") String powerUnitContacts);

//--------------------------------删除开始--------------------------------------------------//

    int deletePowerMonitoringById(String powerMonitoringId);
//--------------------------------删除结束-------------------------------------------------//


//查询动力监控ID
	List<PowerMonitoring> selectBypowerMonitoringId();
//根据动力监控表ID查询建设方式
	PowerMonitoring SelectByPowerMonitoringId(String powerMonitoringId);
}