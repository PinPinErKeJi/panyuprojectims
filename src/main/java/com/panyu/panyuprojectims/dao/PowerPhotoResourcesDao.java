package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.PowerPhotoResources;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PowerPhotoResourcesDao{

	//添加图片
	int insertPowerPhotoResources(PowerPhotoResources powerPhotoResources);
	//根据parentID查询对应的图片信息个数
	long getPowerPhotoResourcesCountByProjectId(@Param("powerProjectId") String powerProjectId);
	//根据模块ID和分项工程ID查询检查项目ID集合
	List<String> selectPowerSupplyProjectList(
            @Param("powerModuleId") String powerModuleId,
            @Param("powerSubWorkId") String powerSubWorkId);
	//根据检查项目ID和信息id查询图片资源ID集合
	List<String> selectPowerPhotoResourcesIdList(
            @Param("powerProjectId") String powerProjectId,
            @Param("powerInformationId") String powerInformationId
    );
	//根据图片资源ID，检查项目id和信息id查询图片资源
	PowerPhotoResources selectAllPowerPhotoResources(
            @Param("powerPhotoId") String powerPhotoId,
            @Param("powerProjectId") String powerProjectId,
            @Param("powerInformationId") String powerInformationId
    );
}