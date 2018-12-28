package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.PowerPhotoResources;

import java.util.List;

public interface PowerPhotoResourcesService{

	//添加图片
	int insertPowerPhotoResources(PowerPhotoResources powerPhotoResources);
	//根据parentID查询对应的图片信息个数
	long getPowerPhotoResourcesCountByProjectId(String powerProjectId);
	//根据模块ID和分项工程ID查询检查项目ID集合
	List<String> selectPowerSupplyProjectList(String powerModuleId, String powerSubWorkId);
	//根据检查项目ID和信息id查询图片资源ID集合
	List<String> selectPowerPhotoResourcesIdList(String powerProjectId, String powerInformationId);
	//根据图片资源ID，检查项目id和信息id查询图片资源
	PowerPhotoResources selectAllPowerPhotoResources(
            String powerPhotoId,
            String powerProjectId,
            String powerInformationId
    );
}