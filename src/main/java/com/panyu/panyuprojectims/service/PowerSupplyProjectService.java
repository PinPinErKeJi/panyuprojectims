package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.PowerSupplyProject;

import java.util.List;

public interface PowerSupplyProjectService{

    //根据分项工程id查询包含的检查项目
    List<PowerSupplyProject> selectPowerSupplyProjectByPowerSubWorkId(String powerSubWorkId);

    //添加
    PowerSupplyProject insertPowerSupplyProject(String powerProjectName, String powerSubWorkId);

    //修改
    PowerSupplyProject updatePowerSupplyProject(String powerProjectName, String powerProjectId);

    //删除
    boolean deletePowerSupplyProject(String powerProjectId);

    //根据检查项目id查询检查项目对象
    PowerSupplyProject selectPowerSupplyProjectByProjectId(String powerProjectId);
}