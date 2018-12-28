package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.panyu.panyuprojectims.dao.PowerSupplyCriterionDao;
import com.panyu.panyuprojectims.dao.PowerSupplyProjectDao;
import com.panyu.panyuprojectims.entity.PowerSupplyProject;
import com.panyu.panyuprojectims.service.PowerSupplyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PowerSupplyProjectServiceImpl implements PowerSupplyProjectService{
    @Autowired
    private PowerSupplyProjectDao powerSupplyProjectDao;
    @Autowired
    private PowerSupplyCriterionDao powerSupplyCriterionDao;


    //根据分项工程id查询包含的检查项目
    @Override
    public List<PowerSupplyProject> selectPowerSupplyProjectByPowerSubWorkId(String powerSubWorkId) {
        return powerSupplyProjectDao.selectPowerSupplyProjectByPowerSubWorkId(powerSubWorkId);
    }

    //添加
    @Override
    public PowerSupplyProject insertPowerSupplyProject(String powerProjectName, String powerSubWorkId) {
        long count = powerSupplyProjectDao.getCountByPowerProjectNameAndPowerSubWorkId(powerProjectName,powerSubWorkId);
        if(count == 0){
            int i = powerSupplyProjectDao.insertPowerSupplyProject(powerProjectName, powerSubWorkId);
        }
        PowerSupplyProject powerSupplyProject = powerSupplyProjectDao.selectPowerSupplyProjectByPowerProjectNameAndPowerSubWorkId(powerProjectName,powerSubWorkId);
        return powerSupplyProject;
    }

    //修改
    @Override
    public PowerSupplyProject updatePowerSupplyProject(String powerProjectName, String powerProjectId) {
        PowerSupplyProject powerSupplyProject = null;
        int i = powerSupplyProjectDao.updatePowerSupplyProject(powerProjectName, powerProjectId);
        if(i > 0){
            powerSupplyProject = powerSupplyProjectDao.selectPowerSupplyProjectByPowerProjectNameAndPowerProjectId(powerProjectName,powerProjectId);
        }
        return powerSupplyProject;
    }

    //删除
    @Override
    public boolean deletePowerSupplyProject(String powerProjectId) {
        boolean flag = true;
        List<String> powerCriterionIdList = powerSupplyCriterionDao.selectPowerCriterionId(powerProjectId);
        int i = powerSupplyProjectDao.deletePowerSupplyProject(powerProjectId);
        if (powerCriterionIdList.isEmpty()){
            return flag;
        }else {
            for (String powerCriterionId : powerSupplyCriterionDao.selectPowerCriterionId(powerProjectId)) {
                int i1 = powerSupplyCriterionDao.deletePowerSupplyCriterion(powerCriterionId);
            }
        }
        return flag;
    }
    //根据检查项目id查询检查项目对象
    @Override
    public PowerSupplyProject selectPowerSupplyProjectByProjectId(String powerProjectId) {
        return powerSupplyProjectDao.selectPowerSupplyProjectByProjectId(powerProjectId);
    }
}