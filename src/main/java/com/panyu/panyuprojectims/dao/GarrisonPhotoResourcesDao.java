package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.GarrisonPhotoResources;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GarrisonPhotoResourcesDao{

    //根据模块ID和分项工程ID查询检查项目ID集合
    List<String> selectGarrisonInspectionProjectList(
            @Param("garrisonId") String garrisonId,
            @Param("garrisonSubWorkId") String garrisonSubWorkId);
    //添加数据
    int insertGarrisonPhotoResources(GarrisonPhotoResources garrisonPhotoResources);
    //根据parentID查询对应的图片信息个数
    long getGarrisonPhotoResourcesCountByProjectId(@Param("garrisonProjectId") String garrisonProjectId);
    //根据检查项目ID查询图片资源ID集合
    List<String> selectGarrisonPhotoResourcesByPhotoId(@Param("garrisonProjectId") String garrisonProjectId,
                                                       @Param("garrisonInformationId") String garrisonInformationId);
    //根据图片资源ID查询图片资源
    GarrisonPhotoResources selectAllGarrisonPhotoResources(@Param("garrisonPhotoId") String garrisonPhotoId,
                                                           @Param("garrisonProjectId") String garrisonProjectId,
                                                           @Param("garrisonInformationId") String garrisonInformationId);
}