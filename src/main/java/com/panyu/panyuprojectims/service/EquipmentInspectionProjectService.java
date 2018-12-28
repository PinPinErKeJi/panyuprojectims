package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.EquipmentInspectionProject;

import java.util.List;
public interface EquipmentInspectionProjectService{

    //根据检查项目id和名字查询对象
    EquipmentInspectionProject getEquipmentInspectionProject(String equipmentProjectId,
                                                             String equipmentProjectName);



    //添加
    EquipmentInspectionProject addEquipmentInspectionProject(String equipmentProjectName,
                                                             String equipmentSubWorkId);

    //根据分项工程ID查询检查项目
    List<EquipmentInspectionProject> selectEquipmentInspectionProjectByEquipmentSubWorkId(String equipmentSubWorkId);

    //根据检查项目ID查询出所有相应的标准规范ID
    List<String> selectAllEquipmentProjectIdBySubWorkId(String equipmentSubWorkId);
	//根据检查项目ID删除相应检查项目数据的同时删除对应的标准规范数据
    int deleteEquipmentInspectionProjectById(String equipmentProjectId);
    //修改
    int updateEquipmentInspectionProjectById(String equipmentProjectId,
                                             String equipmentProjectName);

    //数据填报的时候根据检查项目ID查询项目名称通过对象接收
    EquipmentInspectionProject selectEquipmentInspectionProjectByName(String equipmentProjectId);
}