package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.EquipmentSpeciality;

import java.util.List;
public interface EquipmentSpecialityService{


    //添加模块数据之后根据名称查询返回对象
    EquipmentSpeciality selectEquipmentSpecialityBySpecialityName(String equipmentSpecialityName);


    //添加
    EquipmentSpeciality addEquipmentSpeciality(String equipmentSpecialityName);


	//查询下拉框所有模块名称
    long getEquipmentSpecialityRowCount();

    List<EquipmentSpeciality> selectEquipmentSpeciality();

    //根据模块ID删除相应数据
    int deleteEquipmentSpecialityById(String equipmentSpecialityId);
    //修改
    int updateEquipmentSpecialityById(String equipmentSpecialityId,
                                      String equipmentSpecialityName);

    EquipmentSpeciality selectEquipmentSpecialityById(String id);
}