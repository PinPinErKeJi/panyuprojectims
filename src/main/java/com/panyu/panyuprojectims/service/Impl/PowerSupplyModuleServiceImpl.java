package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.panyu.panyuprojectims.dao.PowerSubWorkDao;
import com.panyu.panyuprojectims.dao.PowerSupplyCriterionDao;
import com.panyu.panyuprojectims.dao.PowerSupplyModuleDao;
import com.panyu.panyuprojectims.dao.PowerSupplyProjectDao;
import com.panyu.panyuprojectims.entity.PowerSupplyModule;
import com.panyu.panyuprojectims.service.PowerSupplyModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PowerSupplyModuleServiceImpl implements PowerSupplyModuleService{
    @Autowired
    private PowerSupplyModuleDao powerSupplyModuleDao;
    @Autowired
    private PowerSubWorkDao powerSubWorkDao;
    @Autowired
    private PowerSupplyProjectDao powerSupplyProjectDao;
    @Autowired
    private PowerSupplyCriterionDao powerSupplyCriterionDao;


    //查询所有的模块信息
    @Override
    public List<PowerSupplyModule> selectAllPowerSupplyModule() {
        return powerSupplyModuleDao.selectAllPowerSupplyModule();
    }


    //添加
    @Override
    public PowerSupplyModule insertPowerSupplyModule(String powerModuleName) {
        long count = powerSupplyModuleDao.getCountByPowerModuleName(powerModuleName);
        if(count == 0){
            int i = powerSupplyModuleDao.insertPowerSupplyModule(powerModuleName);
        }
        PowerSupplyModule powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerModuleName);
        return powerSupplyModule;
    }

    //修改
    @Override
    public PowerSupplyModule updatePowerSupplyModule(String powerModuleId, String powerModuleName) {
        PowerSupplyModule powerSupplyModule = null;
        int i = powerSupplyModuleDao.updatePowerSupplyModule(powerModuleId, powerModuleName);
        if(i > 0){
             powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerModuleName);
        }
        return powerSupplyModule;
    }

    //删除
    @Override
    public boolean deletePowerSupplyModule(String powerModuleId) {
        boolean flag = true;
        List<String> powerSubWorkIdList = powerSubWorkDao.selectPowerSubWorkId(powerModuleId);
        int i = powerSupplyModuleDao.deletePowerSupplyModule(powerModuleId);
        if (powerSubWorkIdList.isEmpty()){
            return flag;
        }else {
            for (String powerSubWorkId : powerSubWorkDao.selectPowerSubWorkId(powerModuleId)) {
                List<String> powerProjectIdList = powerSupplyProjectDao.selectPowerProjectId(powerSubWorkId);
                int i1 = powerSubWorkDao.deletePowerSubWork(powerSubWorkId);
                if (powerProjectIdList.isEmpty()){
                    return flag;
                }else {
                    for (String powerProjectId : powerSupplyProjectDao.selectPowerProjectId(powerSubWorkId)) {
                        List<String> powerCriterionIdList = powerSupplyCriterionDao.selectPowerCriterionId(powerProjectId);
                        int i2 = powerSupplyProjectDao.deletePowerSupplyProject(powerProjectId);
                        if (powerCriterionIdList.isEmpty()){
                            for (String powerCriterionId : powerSupplyCriterionDao.selectPowerCriterionId(powerProjectId)) {
                                int i3 = powerSupplyCriterionDao.deletePowerSupplyCriterion(powerCriterionId);
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }
}