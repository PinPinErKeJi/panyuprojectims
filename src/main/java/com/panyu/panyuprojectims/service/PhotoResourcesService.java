package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.PhotoResources;

import java.util.List;
public interface PhotoResourcesService{

	//根据moduleID和subID查询出projectID的list集合数据
	List<String> selectProjectByIdList(String moduleId, String subId);

    //根据检查项目ID查询图片资源ID
    List<String> selectPhotoResourcesIds(String projectId, String projectProgressId);

    //根据photoResourcesId查询图片资源对象
   PhotoResources selectPhotoResourcesByPhotoId(String photoResourcesId, String projectProgressId);
    //根据parentID查询对应的图片信息个数
    long getCountPhotoResourcesByParentId(String parentId);
    //数据填报信息添加
    int insertPhotoResourcesData(PhotoResources photoResources);



}