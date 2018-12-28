package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.PowerPhotoResourcesDao;
import com.panyu.panyuprojectims.entity.PowerPhotoResources;
import com.panyu.panyuprojectims.service.PowerPhotoResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerPhotoResourcesServiceImpl implements PowerPhotoResourcesService{
    @Autowired
    private PowerPhotoResourcesDao powerPhotoResourcesDao;

    //添加图片
    @Override
    public int insertPowerPhotoResources(PowerPhotoResources powerPhotoResources) {
        return powerPhotoResourcesDao.insertPowerPhotoResources(powerPhotoResources);
    }
    //根据parentID查询对应的图片信息个数
    @Override
    public long getPowerPhotoResourcesCountByProjectId(String powerProjectId) {
        return powerPhotoResourcesDao.getPowerPhotoResourcesCountByProjectId(powerProjectId);
    }
    //根据模块ID和分项工程ID查询检查项目ID集合
    @Override
    public List<String> selectPowerSupplyProjectList(String powerModuleId, String powerSubWorkId) {
        return powerPhotoResourcesDao.selectPowerSupplyProjectList(powerModuleId,powerSubWorkId);
    }
    //根据检查项目ID和信息id查询图片资源ID集合
    @Override
    public List<String> selectPowerPhotoResourcesIdList(String powerProjectId, String powerInformationId) {
        return powerPhotoResourcesDao.selectPowerPhotoResourcesIdList(powerProjectId,powerInformationId);
    }
    //根据图片资源ID，检查项目id和信息id查询图片资源
    @Override
    public PowerPhotoResources selectAllPowerPhotoResources(
            String powerPhotoId, String powerProjectId, String powerInformationId) {
        return powerPhotoResourcesDao.selectAllPowerPhotoResources(powerPhotoId,powerProjectId,powerInformationId);
    }
}