package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.GarrisonPhotoResources;

import java.util.List;

public interface GarrisonPhotoResourcesService{

    //根据模块ID和分项工程ID查询检查项目ID集合
    List<String> selectGarrisonInspectionProjectList(String garrisonId, String garrisonSubWorkId);
    //添加数据
    int insertGarrisonPhotoResources(GarrisonPhotoResources garrisonPhotoResources);
    //根据parentID查询对应的图片信息个数
    long getGarrisonPhotoResourcesCountByProjectId(String garrisonProjectId);
    //根据检查项目ID查询图片资源ID集合
    List<String> selectGarrisonPhotoResourcesByPhotoId(String garrisonProjectId, String garrisonInformationId);
    //根据图片资源ID查询图片资源
    GarrisonPhotoResources selectAllGarrisonPhotoResources(String garrisonPhotoId, String garrisonProjectId, String garrisonInformationId);
}