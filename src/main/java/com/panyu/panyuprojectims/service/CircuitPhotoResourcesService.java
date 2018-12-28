package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.CircuitPhotoResources;
public interface CircuitPhotoResourcesService{

    //根据模块ID和分项工程ID查询检查项目ID集合
    List<String> selectCircuitInspectionProjectList(String circuitModuleId, String circuitSubWorkId);

    //添加数据
    int insertCircuitPhotoResources(CircuitPhotoResources circuitPhotoResources);

    //根据parentID查询对应的图片信息个数
    long getCircuitPhotoResourcesCountByProjectId(String circuitProjectId);

    //根据检查项目ID和信息id查询图片资源ID集合
    List<String> selectCircuitPhotoResourcesByPhotoId(String circuitProjectId,
                                                      String circuitInformationId);

    //根据图片资源ID，检查项目id和信息id查询图片资源
    CircuitPhotoResources selectAllCircuitPhotoResources(String circuitPhotoId,
                                                         String circuitProjectId,
                                                         String circuitInformationId);

}