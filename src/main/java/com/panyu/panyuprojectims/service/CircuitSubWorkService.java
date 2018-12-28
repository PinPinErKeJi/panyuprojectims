package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.CircuitSubWork;

public interface CircuitSubWorkService{


    //根据分项工程id和名字查询分项工程对象
    CircuitSubWork getCircuitSubWork(String circuitSubWorkId, String circuitSubWorkName);


    //根据模块id查询包含的分项工程信息
    List<CircuitSubWork> selectCircuitSubWorkByModuleId(String circuitModuleId);

    //添加
    CircuitSubWork addCircuitSubWork(String circuitSubWorkName, String circuitModuleId);

    //修改
    int updateCircuitSubWork(String circuitSubWorkId, String circuitSubWorkName);

    //删除
    boolean deleteCircuitSubWork(String circuitSubWorkId);

}