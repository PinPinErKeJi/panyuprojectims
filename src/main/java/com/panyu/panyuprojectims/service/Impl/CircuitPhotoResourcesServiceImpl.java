package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.CircuitPhotoResourcesDao;
import com.panyu.panyuprojectims.entity.CircuitPhotoResources;
import com.panyu.panyuprojectims.service.CircuitPhotoResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CircuitPhotoResourcesServiceImpl implements CircuitPhotoResourcesService{
    @Autowired
    private CircuitPhotoResourcesDao circuitPhotoResourcesDao;


    //根据模块ID和分项工程ID查询检查项目ID集合
    @Override
    public List<String> selectCircuitInspectionProjectList(String circuitModuleId, String circuitSubWorkId) {
        return circuitPhotoResourcesDao.selectCircuitInspectionProjectList(circuitModuleId,circuitSubWorkId);
    }

    //添加数据
    @Override
    public int insertCircuitPhotoResources(CircuitPhotoResources circuitPhotoResources) {
        return circuitPhotoResourcesDao.insertCircuitPhotoResources(circuitPhotoResources);
    }

    //根据parentID查询对应的图片信息个数
    @Override
    public long getCircuitPhotoResourcesCountByProjectId(String circuitProjectId) {
        return circuitPhotoResourcesDao.getCircuitPhotoResourcesCountByProjectId(circuitProjectId);
    }

    //根据检查项目ID和信息id查询图片资源ID集合
    @Override
    public List<String> selectCircuitPhotoResourcesByPhotoId(String circuitProjectId, String circuitInformationId) {
        return circuitPhotoResourcesDao.selectCircuitPhotoResourcesByPhotoId(circuitProjectId,circuitInformationId);
    }

    //根据图片资源ID，检查项目id和信息id查询图片资源
    @Override
    public CircuitPhotoResources selectAllCircuitPhotoResources(String circuitPhotoId, String circuitProjectId, String circuitInformationId) {
        return circuitPhotoResourcesDao.selectAllCircuitPhotoResources(circuitPhotoId,circuitProjectId,circuitInformationId);
    }
}