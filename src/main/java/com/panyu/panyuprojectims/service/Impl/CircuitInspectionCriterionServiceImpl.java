package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.CircuitInspectionCriterionDao;
import com.panyu.panyuprojectims.entity.CircuitInspectionCriterion;
import com.panyu.panyuprojectims.service.CircuitInspectionCriterionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CircuitInspectionCriterionServiceImpl implements CircuitInspectionCriterionService{
    @Autowired
    private CircuitInspectionCriterionDao circuitInspectionCriterionDao;

    //根据标准规范id和标准规范内容查询标准规范对象
    @Override
    public CircuitInspectionCriterion getCircuitInspectionCriterion(String circuitCriterionId, String circuitCriterionName) {
        return circuitInspectionCriterionDao.getCircuitInspectionCriterion(circuitCriterionId,circuitCriterionName);
    }

    //根据检查项目id查询包含的标准规范
    @Override
    public List<CircuitInspectionCriterion> selectCircuitInspectionCriterionByCircuitProjectId(String circuitProjectId) {
        return circuitInspectionCriterionDao.selectCircuitInspectionCriterionByCircuitProjectId(circuitProjectId);
    }

    //添加
    @Override
    public CircuitInspectionCriterion addCircuitInspectionCriterion(String circuitCriterionName, String circuitProjectId) {
        long count = circuitInspectionCriterionDao.getCountCircuitCriterionNameByCircuitCriterionNameAndCircuitProjectId(circuitCriterionName, circuitProjectId);
        if(count == 0){
            int i = circuitInspectionCriterionDao.insertCircuitInspectionCriterion(circuitCriterionName, circuitProjectId);
        }
        CircuitInspectionCriterion circuitInspectionCriterion = circuitInspectionCriterionDao.selectCircuitInspectionCriterionByCircuitCriterionNameAndCircuitProjectId(circuitCriterionName, circuitProjectId);

        return circuitInspectionCriterion;
    }

    //修改
    @Override
    public int updateCircuitInspectionCriterion(String circuitCriterionId, String circuitCriterionName) {
        return circuitInspectionCriterionDao.updateCircuitInspectionCriterion(circuitCriterionId,circuitCriterionName);
    }

    //删除
    @Override
    public boolean deleteCircuitInspectionCriterion(String circuitCriterionId) {
        boolean falg = true;
        int i = circuitInspectionCriterionDao.deleteCircuitInspectionCriterion(circuitCriterionId);
        if(i > 0){
            falg = true;
        }else {
            falg = false;
        }
        return falg;
    }
}