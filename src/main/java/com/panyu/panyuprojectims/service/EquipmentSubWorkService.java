package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.EquipmentSubWork;

import java.util.List;
public interface EquipmentSubWorkService{


    //根据分项工程id和名字查询对象
    EquipmentSubWork getEquipmentSubWork(String equipmentSubWorkId, String equipmentSubWorkName);

    //添加
    EquipmentSubWork addEquipmentSubWork(String equipmentSubWorkName, String equipmentSpecialityId);

    //根据模块ID查询分项工程
    List<EquipmentSubWork> selectAllEquipmentSubWorkByEquipmentSpecialityId(String equipmentSpecialityId);

    //根据moduleID查询subID
    List<String> selectAllSubWorkIdByModuleId(String equipmentSpecialityId);
	//根据检查项目ID删除相应的数据
    int deleteEquipmentSubWorkById(String equipmentSubWorkId);
    //修改
    int updateEquipmentSubWorkById(String equipmentSubWorkId, String equipmentSubWorkName);
}