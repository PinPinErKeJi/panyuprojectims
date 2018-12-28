package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.ElectricPower;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ElectricPowerDao{

	//添加
	int insertElectricPower(@Param("electricPowerId") String electricPowerId,
                            @Param("electricConstructionMode") String electricConstructionMode,
                            @Param("electricType") String electricType,
                            @Param("electricUnitName") String electricUnitName,
                            @Param("electricUnitContacts") String electricUnitContacts);

//----------------------------删除开始-------------------------------------------//
	//String selectElectricPowerByConstructionId(String electricPowerId);

    int deleteElectricPowerById(String electricPowerId);
//---------------------------删除结束--------------------------------------------//


//查询外电引入ID
	List<ElectricPower> selectByelectricPowerId();
//根据外电引入ID查询建设方式、外电类型
	ElectricPower SelectByElectricPowerId(String electricPowerId);
}