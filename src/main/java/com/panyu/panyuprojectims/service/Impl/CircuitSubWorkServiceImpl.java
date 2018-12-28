package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.panyu.panyuprojectims.dao.CircuitInspectionCriterionDao;
import com.panyu.panyuprojectims.dao.CircuitInspectionProjectDao;
import com.panyu.panyuprojectims.dao.CircuitSubWorkDao;
import com.panyu.panyuprojectims.entity.CircuitSubWork;
import com.panyu.panyuprojectims.service.CircuitSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CircuitSubWorkServiceImpl implements CircuitSubWorkService{
    @Autowired
    private CircuitSubWorkDao circuitSubWorkDao;
    @Autowired
    private CircuitInspectionProjectDao circuitInspectionProjectDao;
    @Autowired
    private CircuitInspectionCriterionDao circuitInspectionCriterionDao;

    //根据分项工程id和名字查询分项工程对象
    @Override
    public CircuitSubWork getCircuitSubWork(String circuitSubWorkId, String circuitSubWorkName) {
        return circuitSubWorkDao.getCircuitSubWork(circuitSubWorkId,circuitSubWorkName);
    }

    //根据模块id查询包含的分项工程信息
    @Override
    public List<CircuitSubWork> selectCircuitSubWorkByModuleId(String circuitModuleId) {
        return circuitSubWorkDao.selectCircuitSubWorkByModuleId(circuitModuleId);
    }

    //添加
    @Override
    public CircuitSubWork addCircuitSubWork(String circuitSubWorkName, String circuitModuleId) {
        long count = circuitSubWorkDao.getCountCircuitSubWorkNameByCircuitSubWorkNameAndCircuitModuleId(circuitSubWorkName, circuitModuleId);
        if(count == 0){
            int i = circuitSubWorkDao.insertCircuitSubWork(circuitSubWorkName, circuitModuleId);
        }
        CircuitSubWork circuitSubWork = circuitSubWorkDao.selectCircuitSubWorkByCircuitSubWorkNameAndCircuitModuleId(circuitSubWorkName, circuitModuleId);

        return circuitSubWork;
    }

    //修改
    @Override
    public int updateCircuitSubWork(String circuitSubWorkId, String circuitSubWorkName) {
        return circuitSubWorkDao.updateCircuitSubWork(circuitSubWorkId,circuitSubWorkName);
    }

    //删除
    @Override
    public boolean deleteCircuitSubWork(String circuitSubWorkId) {
        boolean flag = true;
        List<String> circuitProjectIdList = circuitInspectionProjectDao.selectCircuitProjectIdBySubWorkId(circuitSubWorkId);
        int i = circuitSubWorkDao.deleteCircuitSubWork(circuitSubWorkId);
        if(circuitProjectIdList.isEmpty()){
            return flag;
        }else {
            for (String circuitProjectId : circuitInspectionProjectDao.selectCircuitProjectIdBySubWorkId(circuitSubWorkId)) {
                List<String> circuitCriterionIdList = circuitInspectionCriterionDao.selectCircuitCriterionIdByCircuitProjectId(circuitProjectId);
                int i1 = circuitInspectionProjectDao.deleteCircuitInspectionProject(circuitProjectId);
                if(circuitCriterionIdList.isEmpty()){
                    return flag;
                }else {
                    for (String circuitCriterionId : circuitInspectionCriterionDao.selectCircuitCriterionIdByCircuitProjectId(circuitProjectId)) {
                        int i2 = circuitInspectionCriterionDao.deleteCircuitInspectionCriterion(circuitCriterionId);
                    }
                }
            }
        }
        return flag;
    }
}