package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.GarrisonPhotoResourcesDao;
import com.panyu.panyuprojectims.entity.GarrisonPhotoResources;
import com.panyu.panyuprojectims.service.GarrisonPhotoResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarrisonPhotoResourcesServiceImpl implements GarrisonPhotoResourcesService{
    @Autowired
    private GarrisonPhotoResourcesDao garrisonPhotoResourcesDao;

    //根据模块ID和分项工程ID查询检查项目ID集合
    @Override
    public List<String> selectGarrisonInspectionProjectList(String garrisonId, String garrisonSubWorkId) {
        return garrisonPhotoResourcesDao.selectGarrisonInspectionProjectList(garrisonId, garrisonSubWorkId);
    }
    //添加数据
    @Override
    public int insertGarrisonPhotoResources(GarrisonPhotoResources garrisonPhotoResources) {
        return garrisonPhotoResourcesDao.insertGarrisonPhotoResources(garrisonPhotoResources);
    }
    //根据parentID查询对应的图片信息个数
    @Override
    public long getGarrisonPhotoResourcesCountByProjectId(String garrisonProjectId) {
        return garrisonPhotoResourcesDao.getGarrisonPhotoResourcesCountByProjectId(garrisonProjectId);
    }
    //根据检查项目ID查询图片资源ID集合
    @Override
    public List<String> selectGarrisonPhotoResourcesByPhotoId(String garrisonProjectId,String garrisonInformationId) {
        return garrisonPhotoResourcesDao.selectGarrisonPhotoResourcesByPhotoId(garrisonProjectId,garrisonInformationId);
    }
    //根据图片资源ID查询图片资源
    @Override
    public GarrisonPhotoResources selectAllGarrisonPhotoResources(String garrisonPhotoId,String garrisonProjectId,String garrisonInformationId) {
        return garrisonPhotoResourcesDao.selectAllGarrisonPhotoResources(garrisonPhotoId,garrisonProjectId,garrisonInformationId);
    }
}