package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.EquipmentInspectionProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EquipmentInspectionProjectDao{


    //根据检查项目id和名字查询对象
    EquipmentInspectionProject getEquipmentInspectionProject(@Param("equipmentProjectId") String equipmentProjectId,
                                                             @Param("equipmentProjectName") String equipmentProjectName);



    //根据名字查询个数
    int getCountByEquipmentProjectName(@Param("equipmentProjectName") String equipmentProjectName,
                                       @Param("equipmentSubWorkId") String equipmentSubWorkId);

    //根据分项工程ID查询检查项目
    List<EquipmentInspectionProject> selectEquipmentInspectionProjectByEquipmentSubWorkId(@Param("equipmentSubWorkId") String equipmentSubWorkId);

    //导入设备专业模块信息数据时调用检查项目添加方法
    int insertEquipmentInspectionProject(@Param("equipmentProjectName") String equipmentProjectName,
                                         @Param("equipmentSubWorkId") String equipmentSubWorkId);

    //导入设备专业模块信息数据时调用查询方法根据分项工程ID和检查项目名称查询检查项目ID
    String selectProjectIdBySubWorkIdAndProjectName(@Param("equipmentProjectName") String equipmentProjectName,
                                                    @Param("equipmentSubWorkId") String equipmentSubWorkId);

    //添加检查项目数据之后根据名称查询返回对象
    EquipmentInspectionProject selectEquipmentInspectionProjectByProjectName(@Param("equipmentProjectName") String equipmentProjectName,
                                                                             @Param("equipmentSubWorkId") String equipmentSubWorkId);

    //根据检查项目ID查询出所有相应的标准规范ID
	List<String> selectAllEquipmentProjectIdBySubWorkId(String equipmentSubWorkId);

    //根据检查项目ID删除相应检查项目数据的同时删除对应的标准规范数据
    int deleteEquipmentInspectionProjectById(String equipmentProjectId);

    //修改
    int updateEquipmentInspectionProjectById(@Param("equipmentProjectId") String equipmentProjectId,
                                             @Param("equipmentProjectName") String equipmentProjectName);

    //数据填报的时候根据检查项目ID查询项目名称通过对象接收
    EquipmentInspectionProject selectEquipmentInspectionProjectByName(@Param("equipmentProjectId") String equipmentProjectId);



}