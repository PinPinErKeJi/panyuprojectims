package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.EquipmentPhotoResources;

import java.util.List;

public interface EquipmentPhotoResourcesService{

    //根据模块ID和分项工程ID查询检查项目ID集合
    List<String> selectEquipmentInspectionProjectList(String equipmentSpecialityId, String equipmentSubWorkId);

    //添加图片
    int insertEmptyEquipmentPhotoResources(EquipmentPhotoResources equipmentPhotoResources);

    //根据parentID查询对应的图片信息个数
    long getCountEquipmentPhotoResourcesByParentId(String equipmentProjectId);

    //根据检查项目ID查询图片资源ID集合
    List<String> selectEquipmentPhotoResourcesIds(String equipmentProjectId, String equipmentInformationId);

    //根据图片资源ID查询图片对象
    EquipmentPhotoResources selectEquipmentPhotoResourcesById(String equipmentPhotoId, String equipmentProjectId, String equipmentInformationId);

}