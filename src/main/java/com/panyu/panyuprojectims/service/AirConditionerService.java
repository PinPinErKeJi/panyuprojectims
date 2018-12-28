package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.AirConditioner;

import java.util.List;

public interface AirConditionerService{
	/**
	 * 获得AirConditioner数据的总行数
	 * @return
	 */
    long getAirConditionerRowCount();
	/**
	 * 获得AirConditioner数据集合
	 * @return
	 */
    List<AirConditioner> selectAirConditioner();
	/**
	 * 获得一个AirConditioner对象,以参数AirConditioner对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    AirConditioner selectAirConditionerByObj(AirConditioner obj);

	//添加
	boolean insertAirConditioner(String airConditionerId,
                                 String airConstructionMode,
                                 String conditioningBrandName,
                                 String specificationTypeName,
                                 String airUnitName,
                                 String airConstructionContacts);
	/**
	 * 插入AirConditioner中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyAirConditioner(AirConditioner value);
//----------------------------删除开始------------------------------------------------//
    boolean deleteAirConditionerById(String airConditionerId);
//----------------------------删除结束------------------------------------------------//

//查询空调ID
	List<AirConditioner> selectByairConditionerId();
//根据空调ID查询建设方式
	AirConditioner SelectByAirConditionerId(String airConditionerId);
}