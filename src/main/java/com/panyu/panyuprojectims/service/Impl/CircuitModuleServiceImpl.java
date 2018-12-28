package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.panyu.panyuprojectims.dao.CircuitInspectionCriterionDao;
import com.panyu.panyuprojectims.dao.CircuitInspectionProjectDao;
import com.panyu.panyuprojectims.dao.CircuitModuleDao;
import com.panyu.panyuprojectims.dao.CircuitSubWorkDao;
import com.panyu.panyuprojectims.entity.CircuitModule;
import com.panyu.panyuprojectims.service.CircuitModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CircuitModuleServiceImpl implements CircuitModuleService{
    @Autowired
    private CircuitModuleDao circuitModuleDao;
    @Autowired
    private CircuitSubWorkDao circuitSubWorkDao;
    @Autowired
    private CircuitInspectionProjectDao circuitInspectionProjectDao;
    @Autowired
    private CircuitInspectionCriterionDao circuitInspectionCriterionDao;

    //根据模块名查询模块对象
    @Override
    public CircuitModule getCircuitModule(String circuitModuleName) {
        return circuitModuleDao.selectCircuitModuleByCircuitModuleName(circuitModuleName);
    }

    //查询所有的模块信息
    @Override
    public List<CircuitModule> selectAllCircuitModule() {
        return circuitModuleDao.selectAllCircuitModule();
    }

    //添加
    @Override
    public CircuitModule addCircuitModule(String circuitModuleName) {
        long count = circuitModuleDao.getCountByCircuitModuleName(circuitModuleName);
        if(count == 0){
            int i = circuitModuleDao.insertCircuitModule(circuitModuleName);
        }
        CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName(circuitModuleName);
        return circuitModule;
    }

    //修改
    @Override
    public int updateCircuitModule(String circuitModuleId,String circuitModuleName) {
        return circuitModuleDao.updateCircuitModule(circuitModuleId,circuitModuleName);
    }

    //根据模块名查询模块对象
    @Override
    public CircuitModule selectCircuitModuleByCircuitModuleName(String circuitModuleName) {
        return circuitModuleDao.selectCircuitModuleByCircuitModuleName(circuitModuleName);
    }

    //删除
    @Override
    public boolean deleteCircuitModule(String circuitModuleId) {
        boolean flag = true;
        List<String> subWorkIdList = circuitSubWorkDao.selectCircuitSubWorkIdByCircuitModuleId(circuitModuleId);
        int i = circuitModuleDao.deleteCircuitModule(circuitModuleId);
        if(subWorkIdList.isEmpty()){
            return flag;
        }else {
            for (String subWorkId : circuitSubWorkDao.selectCircuitSubWorkIdByCircuitModuleId(circuitModuleId)) {
                List<String> circuitProjectIdList = circuitInspectionProjectDao.selectCircuitProjectIdBySubWorkId(subWorkId);
                int i1 = circuitSubWorkDao.deleteCircuitSubWork(subWorkId);
                if(circuitProjectIdList.isEmpty()){
                    return flag;
                }else {
                    for (String circuitProjectId : circuitInspectionProjectDao.selectCircuitProjectIdBySubWorkId(subWorkId)) {
                        List<String> circuitCriterionIdList = circuitInspectionCriterionDao.selectCircuitCriterionIdByCircuitProjectId(circuitProjectId);
                        int i2 = circuitInspectionProjectDao.deleteCircuitInspectionProject(circuitProjectId);
                        if(circuitCriterionIdList.isEmpty()){
                            return flag;
                        }else {
                            for (String circuitCriterionId : circuitInspectionCriterionDao.selectCircuitCriterionIdByCircuitProjectId(circuitProjectId)) {
                                int i3 = circuitInspectionCriterionDao.deleteCircuitInspectionCriterion(circuitCriterionId);
                            };
                        }
                    }
                }
            }
        }
        return flag;
    }
}