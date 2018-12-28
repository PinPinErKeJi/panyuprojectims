package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.EquipmentSubWork;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EquipmentSubWorkDao{

    //根据分项工程id和名字查询对象
    EquipmentSubWork getEquipmentSubWork(@Param("equipmentSubWorkId") String equipmentSubWorkId,
                                         @Param("equipmentSubWorkName") String equipmentSubWorkName);

    //根据名字查询个数
    int getCountByEquipmentSubWorkId(@Param("equipmentSubWorkName") String equipmentSubWorkName,
                                     @Param("equipmentSpecialityId") String equipmentSpecialityId);
    //根据模块ID查询分项工程
    List<EquipmentSubWork> selectAllEquipmentSubWorkByEquipmentSpecialityId(@Param("equipmentSpecialityId") String equipmentSpecialityId);
    //导入设备专业模块信息数据时调用分项工程添加方法
    int insertEquipmentSubWork(
            @Param("equipmentSubWorkName") String equipmentSubWorkName,
            @Param("equipmentSpecialityId") String equipmentSpecialityId);
    //导入设备专业模块信息数据时调用查询方法根据分项工程名称和模块ID查询分项工程ID
    String selectSubWorkIdBySubWorkNameAndSpecialityId(
            @Param("equipmentSubWorkName") String equipmentSubWorkName,
            @Param("equipmentSpecialityId") String equipmentSpecialityId);
    //添加分项工程数据之后根据名称查询返回对象
    EquipmentSubWork selectEquipmentSubWorkBySubWorkName(@Param("equipmentSubWorkName") String equipmentSubWorkName,
                                                         @Param("equipmentSpecialityId") String equipmentSpecialityId);
    //根据moduleID查询subID
    List<String> selectAllSubWorkIdByModuleId(@Param("equipmentSpecialityId") String equipmentSpecialityId);
    //根据检查项目ID删除相应的数据
    int deleteEquipmentSubWorkById(@Param("equipmentSubWorkId") String equipmentSubWorkId);
    //修改
    int updateEquipmentSubWorkById(@Param("equipmentSubWorkId") String equipmentSubWorkId,
                                   @Param("equipmentSubWorkName") String equipmentSubWorkName);
}