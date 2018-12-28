package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.CircuitPhotoResources;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CircuitPhotoResourcesDao{

    //根据模块ID和分项工程ID查询检查项目ID集合
    List<String> selectCircuitInspectionProjectList(
            @Param("circuitModuleId") String circuitModuleId,
            @Param("circuitSubWorkId") String circuitSubWorkId);

    //添加数据
    int insertCircuitPhotoResources(CircuitPhotoResources circuitPhotoResources);

    //根据parentID查询对应的图片信息个数
    long getCircuitPhotoResourcesCountByProjectId(@Param("circuitProjectId") String circuitProjectId);

    //根据检查项目ID和信息id查询图片资源ID集合
    List<String> selectCircuitPhotoResourcesByPhotoId(@Param("circuitProjectId") String circuitProjectId,
                                                      @Param("circuitInformationId") String circuitInformationId);

    //根据图片资源ID，检查项目id和信息id查询图片资源
    CircuitPhotoResources selectAllCircuitPhotoResources(@Param("circuitPhotoId") String circuitPhotoId,
                                                         @Param("circuitProjectId") String circuitProjectId,
                                                         @Param("circuitInformationId") String circuitInformationId);


}