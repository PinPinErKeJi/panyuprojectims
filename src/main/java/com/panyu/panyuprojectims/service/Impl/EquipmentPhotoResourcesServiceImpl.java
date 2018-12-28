package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.EquipmentPhotoResourcesDao;
import com.panyu.panyuprojectims.entity.EquipmentPhotoResources;
import com.panyu.panyuprojectims.service.EquipmentPhotoResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EquipmentPhotoResourcesServiceImpl implements EquipmentPhotoResourcesService{

    @Autowired
    private EquipmentPhotoResourcesDao equipmentPhotoResourcesDao;

    //根据模块ID和分项工程ID查询检查项目ID集合
    @Override
    public List<String> selectEquipmentInspectionProjectList(String equipmentSpecialityId, String equipmentSubWorkId) {
        return equipmentPhotoResourcesDao.selectEquipmentInspectionProjectList(equipmentSpecialityId,equipmentSubWorkId);
    }

    //添加图片
    @Override
    public int insertEmptyEquipmentPhotoResources(EquipmentPhotoResources equipmentPhotoResources){
        return equipmentPhotoResourcesDao.insertEquipmentPhotoResources(equipmentPhotoResources);
    }
    //根据parentID查询对应的图片信息个数
    @Override
    public long getCountEquipmentPhotoResourcesByParentId(String equipmentProjectId) {
        return equipmentPhotoResourcesDao.getCountEquipmentPhotoResourcesByParentId(equipmentProjectId);
    }

    //根据检查项目ID查询图片资源ID集合
    @Override
    public List<String> selectEquipmentPhotoResourcesIds(String equipmentProjectId,String equipmentInformationId) {
        return equipmentPhotoResourcesDao.selectEquipmentPhotoResourcesIds(equipmentProjectId, equipmentInformationId);
    }
    //根据图片资源ID查询图片对象
    @Override
    public EquipmentPhotoResources selectEquipmentPhotoResourcesById(String equipmentPhotoId,String equipmentProjectId,String equipmentInformationId){
        return equipmentPhotoResourcesDao.selectEquipmentPhotoResourcesById(equipmentPhotoId, equipmentProjectId, equipmentInformationId);
    }



}