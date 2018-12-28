package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.AirConditioner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AirConditionerDao{





    long getAirConditionerRowCount();

    List<AirConditioner> selectAirConditioner();

    AirConditioner selectAirConditionerByObj(AirConditioner obj);

	//添加
	int insertAirConditioner(@Param("airConditionerId") String airConditionerId,
                             @Param("airConstructionMode") String airConstructionMode,
                             @Param("conditioningBrandName") String conditioningBrandName,
                             @Param("specificationTypeName") String specificationTypeName,
                             @Param("airUnitName") String airUnitName,
                             @Param("airConstructionContacts") String airConstructionContacts);
	/**
	 * 插入AirConditioner中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyAirConditioner(AirConditioner value);
//----------------------------删除开始---------------------------------------------//
	/*String selectAirConditionerByBrandId(String airConditionerId);

	String selectAirConditionerByTypeId(String airConditionerId);

	String selectAirConditionerByConstructionId(String airConditionerId);*/

    int deleteAirConditionerById(String airConditionerId);
//----------------------------删除结束--------------------------------------------//

//查询空调ID
	List<AirConditioner> selectByairConditionerId();
//根据空调ID查询建设方式
	AirConditioner SelectByAirConditionerId(String airConditionerId);
}