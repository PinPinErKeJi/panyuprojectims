package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.PowerSubWork;

import java.util.List;
public interface PowerSubWorkService{

    //根据模块id查询包含的分项工程
    List<PowerSubWork> selectAllPowerSubWorkByPowerModuleId(String powerModuleId);


    //添加
    PowerSubWork insertPowerSubWork(String powerSubWorkName, String powerModuleId);


    //修改
    PowerSubWork updatePowerSubWork(String powerSubWorkName, String powerSubWorkId);

    //删除
    boolean deletePowerSubWork(String powerSubWorkId);
}