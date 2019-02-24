package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.panyu.panyuprojectims.dao.ModuleDao;
import com.panyu.panyuprojectims.entity.Module;
import com.panyu.panyuprojectims.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ModuleServiceImpl implements ModuleService{

    @Autowired
    private ModuleDao moduleDao;

    @Override
    public List<Module> selectModule(){ 
        return moduleDao.selectModule();
    }

/*------------------------------添加选项框开始-----------------------------*/
    @Override
    public List<Module> selectAllModule() {
        return moduleDao.selectAllModule();
    }
    @Override
    public Module insertModule(String moduleName){
        int count = moduleDao.getCountModuleName(moduleName);
        if (count == 0){
            int i = moduleDao.insertModule(moduleName);
        }

        Module module = moduleDao.selectModuleByName(moduleName);
        return module;
    }
/*------------------------------添加选项框结束-----------------------------*/

/*------------------------------删除选项框开始-----------------------------*/
    @Override
    public int deleteModuleById(String moduleId){
        return moduleDao.deleteModuleById(moduleId);
    }
/*------------------------------删除选项框结束-----------------------------*/

/*------------------------------修改选项框开始-----------------------------*/
    //根据名字查询对象
    @Override
    public Module selectModuleByName(String moduleName) {
        return moduleDao.selectModuleByName(moduleName);
    }

    @Override
    public int updateModule(String moduleId,String moduleName) {
        return moduleDao.updateModule(moduleId,moduleName);
    }
/*------------------------------修改选项框结束-----------------------------*/
    //根据名字查id
    @Override
    public String selectModuleId(String moduleName) {
        return moduleDao.selectModuleId(moduleName);
    }
}