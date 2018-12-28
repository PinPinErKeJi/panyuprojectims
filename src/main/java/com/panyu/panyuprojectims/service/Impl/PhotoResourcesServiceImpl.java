package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.PhotoResourcesDao;
import com.panyu.panyuprojectims.entity.PhotoResources;
import com.panyu.panyuprojectims.service.PhotoResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class


PhotoResourcesServiceImpl implements PhotoResourcesService{
    @Autowired
    private PhotoResourcesDao photoResourcesDao;

    @Override
    public List<String> selectProjectByIdList(String moduleId, String subId) {
        return photoResourcesDao.selectProjectByIdList(moduleId,subId);
    }

    @Override
    public List<String> selectPhotoResourcesIds(String parentId,String projectProgressId) {
        return photoResourcesDao.selectPhotoResourcesIds(parentId,projectProgressId);
    }

    @Override
    public PhotoResources selectPhotoResourcesByPhotoId(String photoResourcesId,String projectProgressId) {
        return photoResourcesDao.selectPhotoResourcesByPhotoId(photoResourcesId,projectProgressId);
    }

    @Override
    public long getCountPhotoResourcesByParentId(String parentId) {
        return photoResourcesDao.getCountPhotoResourcesByParentId(parentId);
    }

    @Override
    public int insertPhotoResourcesData(PhotoResources photoResources) {
      return photoResourcesDao.insertPhotoResourcesData(photoResources);
    }



}