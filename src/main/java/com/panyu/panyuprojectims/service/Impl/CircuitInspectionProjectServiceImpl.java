package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.panyu.panyuprojectims.dao.CircuitInspectionCriterionDao;
import com.panyu.panyuprojectims.dao.CircuitInspectionProjectDao;
import com.panyu.panyuprojectims.entity.CircuitInspectionProject;
import com.panyu.panyuprojectims.service.CircuitInspectionProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CircuitInspectionProjectServiceImpl implements CircuitInspectionProjectService{
    @Autowired
    private CircuitInspectionProjectDao circuitInspectionProjectDao;
    @Autowired
    private CircuitInspectionCriterionDao circuitInspectionCriterionDao;

    //根据检查项目id和名字查询检查项目对象
    @Override
    public CircuitInspectionProject getCircuitInspectionProject(String circuitProjectId, String circuitProjectName) {
        return circuitInspectionProjectDao.getCircuitInspectionProject(circuitProjectId,circuitProjectName);
    }

    //根据分项工程id查询包含的检查项目
    @Override
    public List<CircuitInspectionProject> selectCircuitInspectionProjectBySubWorkId(String circuitSubWorkId) {
        return circuitInspectionProjectDao.selectCircuitInspectionProjectBySubWorkId(circuitSubWorkId);
    }

    //添加
    @Override
    public CircuitInspectionProject addCircuitInspectionProject(String circuitProjectName, String circuitSubWorkId) {
        long count = circuitInspectionProjectDao.getCountCircuitProjectNameByCircuitProjectNameAndCircuitSubWorkId(circuitProjectName, circuitSubWorkId);
        if(count == 0){
            int i = circuitInspectionProjectDao.insertCircuitInspectionProject(circuitProjectName, circuitSubWorkId);
        }
        CircuitInspectionProject circuitInspectionProject = circuitInspectionProjectDao.selectCircuitInspectionProjectByCircuitProjectNameAndCircuitSubWorkId(circuitProjectName, circuitSubWorkId);

        return circuitInspectionProject;
    }

    //修改
    @Override
    public int updateCircuitInspectionProject(String circuitProjectId, String circuitProjectName) {
        return circuitInspectionProjectDao.updateCircuitInspectionProject(circuitProjectId,circuitProjectName);
    }

    //删除
    @Override
    public boolean deleteCircuitInspectionProject(String circuitProjectId) {
        boolean flag = true;
        List<String> criterionIdList = circuitInspectionCriterionDao.selectCircuitCriterionIdByCircuitProjectId(circuitProjectId);
        //System.out.println("criterionIdList:"+criterionIdList);
        int i = circuitInspectionProjectDao.deleteCircuitInspectionProject(circuitProjectId);
        if(criterionIdList.isEmpty()){
            return flag;
        }else {
            for (String circuitCriterionId : circuitInspectionCriterionDao.selectCircuitCriterionIdByCircuitProjectId(circuitProjectId)) {
                int i1 = circuitInspectionCriterionDao.deleteCircuitInspectionCriterion(circuitCriterionId);
            };
        }
        return flag;
    }

    //根据检查项目id查询检查项目对象
    @Override
    public CircuitInspectionProject selectCircuitInspectionProjectBycircuitProjectId(String circuitProjectId) {
        return circuitInspectionProjectDao.selectCircuitInspectionProjectBycircuitProjectId(circuitProjectId);
    }
}