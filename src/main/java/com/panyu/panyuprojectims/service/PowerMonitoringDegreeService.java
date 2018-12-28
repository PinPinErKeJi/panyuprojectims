package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.PowerMonitoringDegree;
public interface PowerMonitoringDegreeService{
	/**
	 * 获得PowerMonitoringDegree数据的总行数
	 * @return
	 */
    long getPowerMonitoringDegreeRowCount();
	/**
	 * 获得PowerMonitoringDegree数据集合
	 * @return
	 */
    List<PowerMonitoringDegree> selectPowerMonitoringDegree();
	/**
	 * 获得一个PowerMonitoringDegree对象,以参数PowerMonitoringDegree对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    PowerMonitoringDegree selectPowerMonitoringDegreeByObj(PowerMonitoringDegree obj);
	/**
	 * 通过PowerMonitoringDegree的id获得PowerMonitoringDegree对象
	 * @param id
	 * @return
	 */
    PowerMonitoringDegree selectPowerMonitoringDegreeById(String id);
	/**
	 * 插入PowerMonitoringDegree到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertPowerMonitoringDegree(PowerMonitoringDegree value);
	/**
	 * 插入PowerMonitoringDegree中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyPowerMonitoringDegree(PowerMonitoringDegree value);
	/**
	 * 通过PowerMonitoringDegree的id删除PowerMonitoringDegree
	 * @param id
	 * @return
	 */
    int deletePowerMonitoringDegreeById(String id);
	/**
	 * 通过PowerMonitoringDegree的id更新PowerMonitoringDegree中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updatePowerMonitoringDegreeById(PowerMonitoringDegree enti);
	/**
	 * 通过PowerMonitoringDegree的id更新PowerMonitoringDegree中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyPowerMonitoringDegreeById(PowerMonitoringDegree enti);
}