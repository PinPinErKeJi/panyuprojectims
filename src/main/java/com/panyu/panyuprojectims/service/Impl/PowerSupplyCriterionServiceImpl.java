package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.PowerSupplyCriterionDao;
import com.panyu.panyuprojectims.entity.PowerSupplyCriterion;
import com.panyu.panyuprojectims.service.PowerSupplyCriterionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PowerSupplyCriterionServiceImpl implements PowerSupplyCriterionService{
    @Autowired
    private PowerSupplyCriterionDao powerSupplyCriterionDao;

    //根据检查项目id查询包含的标准规范
    @Override
    public List<PowerSupplyCriterion> selectPowerSupplyCriterionByPowerProjectId(String powerProjectId) {
        return powerSupplyCriterionDao.selectPowerSupplyCriterionByPowerProjectId(powerProjectId);
    }

    //添加
    @Override
    public PowerSupplyCriterion insertPowerSupplyCriterion(String powerCriterionName, String powerProjectId) {
        long count = powerSupplyCriterionDao.getCountByPowerCriterionNameAndPowerProjectId(powerCriterionName, powerProjectId);
        if(count == 0){
            int i = powerSupplyCriterionDao.insertPowerSupplyCriterion(powerCriterionName, powerProjectId);
        }
        PowerSupplyCriterion powerSupplyCriterion = powerSupplyCriterionDao.selectPowerSupplyCriterionByPowerCriterionNameAndPowerProjectId(powerCriterionName, powerProjectId);
        return powerSupplyCriterion;
    }

    //修改
    @Override
    public PowerSupplyCriterion updatePowerSupplyCriterion(String powerCriterionName, String powerCriterionId) {
        PowerSupplyCriterion powerSupplyCriterion = null;
        int i = powerSupplyCriterionDao.updatePowerSupplyCriterion(powerCriterionName, powerCriterionId);
        if(i > 0){
            powerSupplyCriterion = powerSupplyCriterionDao.selectPowerSupplyCriterionByPowerCriterionNameAndPowerCriterionId(powerCriterionName,powerCriterionId);
        }
        return powerSupplyCriterion;
    }

    //删除
    @Override
    public boolean deletePowerSupplyCriterion(String powerCriterionId) {
        boolean flag = true;
        int i = powerSupplyCriterionDao.deletePowerSupplyCriterion(powerCriterionId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

}