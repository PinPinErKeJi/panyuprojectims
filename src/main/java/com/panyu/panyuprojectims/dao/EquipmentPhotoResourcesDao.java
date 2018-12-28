package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.EquipmentPhotoResources;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EquipmentPhotoResourcesDao{

    //根据模块ID和分项工程ID查询检查项目ID集合
    List<String> selectEquipmentInspectionProjectList(
            @Param("equipmentSpecialityId") String equipmentSpecialityId,
            @Param("equipmentSubWorkId") String equipmentSubWorkId);
    //添加图片
    int insertEquipmentPhotoResources(EquipmentPhotoResources equipmentPhotoResources);
    //根据parentID查询对应的图片信息个数
    long getCountEquipmentPhotoResourcesByParentId(@Param("equipmentProjectId") String equipmentProjectId);

    //根据检查项目ID查询图片资源ID集合
    List<String> selectEquipmentPhotoResourcesIds(@Param("equipmentProjectId") String equipmentProjectId,
                                                  @Param("equipmentInformationId") String equipmentInformationId);
    //根据图片资源ID查询图片对象
    EquipmentPhotoResources selectEquipmentPhotoResourcesById(@Param("equipmentPhotoId") String equipmentPhotoId,
                                                              @Param("equipmentProjectId") String equipmentProjectId,
                                                              @Param("equipmentInformationId") String equipmentInformationId);


}