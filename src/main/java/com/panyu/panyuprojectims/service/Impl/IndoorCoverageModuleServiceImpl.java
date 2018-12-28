package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.IndoorCoverageModuleDao;
import com.panyu.panyuprojectims.entity.IndoorCoverageModule;
import com.panyu.panyuprojectims.service.IndoorCoverageModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IndoorCoverageModuleServiceImpl implements IndoorCoverageModuleService{
    @Autowired
    private IndoorCoverageModuleDao indoorCoverageModuleDao;

    //根据模块名查询模块对象
    @Override
    public IndoorCoverageModule getIndoorCoverageModule(String indoorCoverageName) {
        return indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName(indoorCoverageName);
    }

    //添加
    @Override
    public IndoorCoverageModule addIndoorCoverageModule(String indoorCoverageName) {
        long count = indoorCoverageModuleDao.getCountByIndoorCoverageName(indoorCoverageName);
        if(count == 0){
            int i = indoorCoverageModuleDao.insertIndoorCoverageModule(indoorCoverageName);
        }
        IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName(indoorCoverageName);

        return indoorCoverageModule;
    }

    //查询所有的模块信息
    @Override
    public List<IndoorCoverageModule> selectAllIndoorCoverageModule() {
        return indoorCoverageModuleDao.selectAllIndoorCoverageModule();
    }

    //修改
    @Override
    public int updateIndoorCoverageModule(String indoorCoverageId, String indoorCoverageName) {
        return indoorCoverageModuleDao.updateIndoorCoverageModule(indoorCoverageId,indoorCoverageName);
    }

    //删除
    @Override
    public int deleteIndoorCoverageModule(String indoorCoverageId) {
        return indoorCoverageModuleDao.deleteIndoorCoverageModule(indoorCoverageId);
    }

}