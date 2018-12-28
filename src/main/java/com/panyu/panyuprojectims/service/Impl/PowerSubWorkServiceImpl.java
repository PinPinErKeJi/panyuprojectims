package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.PowerSubWorkDao;
import com.panyu.panyuprojectims.dao.PowerSupplyCriterionDao;
import com.panyu.panyuprojectims.dao.PowerSupplyProjectDao;
import com.panyu.panyuprojectims.entity.PowerSubWork;
import com.panyu.panyuprojectims.service.PowerSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PowerSubWorkServiceImpl implements PowerSubWorkService{
    @Autowired
    private PowerSubWorkDao powerSubWorkDao;
    @Autowired
    private PowerSupplyProjectDao powerSupplyProjectDao;
    @Autowired
    private PowerSupplyCriterionDao powerSupplyCriterionDao;


    //根据模块id查询包含的分项工程
    @Override
    public List<PowerSubWork> selectAllPowerSubWorkByPowerModuleId(String powerModuleId) {
        return powerSubWorkDao.selectAllPowerSubWorkByPowerModuleId(powerModuleId);
    }

    //添加
    @Override
    public PowerSubWork insertPowerSubWork(String powerSubWorkName, String powerModuleId) {
        long count = powerSubWorkDao.getCountByPowerSubWorkNameAndPowerModuleId(powerSubWorkName, powerModuleId);
        if(count == 0){
            int i = powerSubWorkDao.insertPowerSubWork(powerSubWorkName, powerModuleId);
        }
        PowerSubWork powerSubWork = powerSubWorkDao.selectPowerSubWorkByPowerSubWorkNameAndPowerModuleId(powerSubWorkName, powerModuleId);
        return powerSubWork;
    }

    //修改
    @Override
    public PowerSubWork updatePowerSubWork(String powerSubWorkName, String powerSubWorkId) {
        PowerSubWork powerSubWork = null;
        int i = powerSubWorkDao.updatePowerSubWork(powerSubWorkName, powerSubWorkId);
        if(i > 0){
            powerSubWork = powerSubWorkDao.selectPowerSubWorkByPowerSubWorkNameAndPowerSubWorkId(powerSubWorkName,powerSubWorkId);
            System.out.println("分项工程:"+powerSubWork);
        }
        return powerSubWork;
    }

    //删除
    @Override
    public boolean deletePowerSubWork(String powerSubWorkId) {
        boolean flag = true;
        List<String> powerProjectIdList = powerSupplyProjectDao.selectPowerProjectId(powerSubWorkId);
        int i =  powerSubWorkDao.deletePowerSubWork(powerSubWorkId);
        if (powerProjectIdList.isEmpty()){
            return flag;
        }else {
            for (String powerProjectId : powerSupplyProjectDao.selectPowerProjectId(powerSubWorkId)) {
                List<String> powerCriterionIdList = powerSupplyCriterionDao.selectPowerCriterionId(powerProjectId);
                int i1 = powerSupplyProjectDao.deletePowerSupplyProject(powerProjectId);
                if (powerCriterionIdList.isEmpty()){
                    return flag;
                }else {
                    for (String powerCriterionId : powerSupplyCriterionDao.selectPowerCriterionId(powerProjectId)) {
                        int i2 = powerSupplyCriterionDao.deletePowerSupplyCriterion(powerCriterionId);
                    }
                }
            }
        }
        return flag;
    }

}