package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.IndoorCoverageSpecificationDao;
import com.panyu.panyuprojectims.entity.IndoorCoverageSpecification;
import com.panyu.panyuprojectims.service.IndoorCoverageSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IndoorCoverageSpecificationServiceImpl implements IndoorCoverageSpecificationService{
    @Autowired
    private IndoorCoverageSpecificationDao indoorCoverageSpecificationDao;

    //根据标准规范id和标准规范内容查查标准规范对象
    @Override
    public IndoorCoverageSpecification getIndoorCoverageSpecification(String indoorSpecificationName, String indoorSpecificationId) {
        return indoorCoverageSpecificationDao.getIndoorCoverageSpecification(indoorSpecificationName,indoorSpecificationId);
    }

    //添加
    @Override
    public IndoorCoverageSpecification addIndoorCoverageSpecification(String indoorSpecificationName, String indoorProjectId) {
        long count = indoorCoverageSpecificationDao.getCountByIndoorSpecificationNameAndIndoorProjectId(indoorSpecificationName, indoorProjectId);
        if(count == 0){
            int i = indoorCoverageSpecificationDao.insertIndoorCoverageSpecification(indoorSpecificationName, indoorProjectId);
        }
        IndoorCoverageSpecification indoorCoverageSpecification = indoorCoverageSpecificationDao.selectIndoorCoverageSpecificationByIndoorSpecificationNameAndIndoorProjectId(indoorSpecificationName, indoorProjectId);
        return indoorCoverageSpecification;
    }

    //根据检查项目id查询包含的标准规范
    @Override
    public List<IndoorCoverageSpecification> selectIndoorCoverageSpecificationByIndoorProjectId(String indoorProjectId) {
        return indoorCoverageSpecificationDao.selectIndoorCoverageSpecificationByIndoorProjectId(indoorProjectId);
    }

    //修改
    @Override
    public int updateIndoorCoverageSpecification(String indoorSpecificationName, String indoorSpecificationId) {
        return indoorCoverageSpecificationDao.updateIndoorCoverageSpecification(indoorSpecificationName,indoorSpecificationId);
    }

    //删除
    @Override
    public int deleteIndoorCoverageSpecification(String indoorSpecificationId) {
        return indoorCoverageSpecificationDao.deleteIndoorCoverageSpecification(indoorSpecificationId);
    }

    //根据检查项目id查询标准规范的id
    @Override
    public List<String> selectIndoorSpecificationIdByIndoorProjectId(String indoorProjectId) {
        return indoorCoverageSpecificationDao.selectIndoorSpecificationIdByIndoorProjectId(indoorProjectId);
    }


}