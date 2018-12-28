package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.CircuitInspectionProject;
public interface CircuitInspectionProjectService{

    //根据检查项目id和名字查询检查项目对象
    CircuitInspectionProject getCircuitInspectionProject(String circuitProjectId, String circuitProjectName);

    //根据分项工程id查询包含的检查项目
    List<CircuitInspectionProject> selectCircuitInspectionProjectBySubWorkId(String circuitSubWorkId);

    //添加
    CircuitInspectionProject addCircuitInspectionProject(String circuitProjectName, String circuitSubWorkId);

    //修改
    int updateCircuitInspectionProject(String circuitProjectId, String circuitProjectName);

    //删除
    boolean deleteCircuitInspectionProject(String circuitProjectId);

    //根据检查项目id查询检查项目对象
    CircuitInspectionProject selectCircuitInspectionProjectBycircuitProjectId(String circuitProjectId);

}