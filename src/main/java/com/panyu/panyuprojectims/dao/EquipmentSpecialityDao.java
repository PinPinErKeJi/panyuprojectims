package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.EquipmentSpeciality;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EquipmentSpecialityDao{
	//查询下拉框所有模块名称
    long getEquipmentSpecialityRowCount();

    List<EquipmentSpeciality> selectEquipmentSpeciality();

    //根据模块ID删除相应数据
    int deleteEquipmentSpecialityById(@Param("equipmentSpecialityId") String equipmentSpecialityId);
    //根据名字查询个数
    int getCountByEquipmentSpecialityName(@Param("equipmentSpecialityName") String equipmentSpecialityName);
    //添加模块数据之后根据名称查询返回对象
    EquipmentSpeciality selectEquipmentSpecialityBySpecialityName(@Param("equipmentSpecialityName") String equipmentSpecialityName);
    //导入设备专业模块信息数据时调用模块添加方法
    int insertEquipmentSpeciality(@Param("equipmentSpecialityName") String equipmentSpecialityName);
    //导入设备专业模块信息数据时调用查询方法根据模块名称查询模块ID
    String selectEquipmentSpecialityByName(@Param("equipmentSpecialityName") String equipmentSpecialityName);
    //修改
    int updateEquipmentSpecialityById(@Param("equipmentSpecialityId") String equipmentSpecialityId,
                                      @Param("equipmentSpecialityName") String equipmentSpecialityName);

    EquipmentSpeciality selectEquipmentSpecialityById(String id);

    //根据设备模块名查询设备模块id
    String selectEquipmentSpecialityId(@Param("equipmentSpecialityName") String equipmentSpecialityName);
}