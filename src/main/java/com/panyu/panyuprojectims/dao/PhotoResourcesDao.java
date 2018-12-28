package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PhotoResources;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PhotoResourcesDao{

//根据moduleID和subID查询出projectID的list集合数据
	List<String> selectProjectByIdList(
            @Param("moduleId") String moduleId,
            @Param("subId") String subId);

//根据检查项目ID查询图片资源ID
	List<String> selectPhotoResourcesIds(@Param("projectId") String parentId,
                                         @Param("projectProgressId") String projectProgressId);

//根据photoResourcesId查询图片资源对象
	PhotoResources selectPhotoResourcesByPhotoId(@Param("photoResourcesId") String photoResourcesId,
                                                 @Param("projectProgressId") String projectProgressId);

//根据parentID查询对应的图片信息个数
	long getCountPhotoResourcesByParentId(@Param("parentId") String parentId);
//数据填报信息添加
	int insertPhotoResourcesData(PhotoResources photoResources);

}