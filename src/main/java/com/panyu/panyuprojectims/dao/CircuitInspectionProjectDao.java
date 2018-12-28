package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.CircuitInspectionProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CircuitInspectionProjectDao{

    //根据检查项目id和名字查询检查项目对象
    CircuitInspectionProject getCircuitInspectionProject(@Param("circuitProjectId") String circuitProjectId,
                                                         @Param("circuitProjectName") String circuitProjectName);



    //根据分项工程id查询包含的检查项目
    List<CircuitInspectionProject> selectCircuitInspectionProjectBySubWorkId(@Param("circuitSubWorkId") String circuitSubWorkId);

    //根据检查项目名和分项工程id查询检查项目数量，判断检查项目是否存在
    long getCountCircuitProjectNameByCircuitProjectNameAndCircuitSubWorkId(@Param("circuitProjectName") String circuitProjectName,
                                                                           @Param("circuitSubWorkId") String circuitSubWorkId);

    //添加
    int insertCircuitInspectionProject(@Param("circuitProjectName") String circuitProjectName,
                                       @Param("circuitSubWorkId") String circuitSubWorkId);

    //根据检查项目名和分项工程id查询检查项目
    CircuitInspectionProject selectCircuitInspectionProjectByCircuitProjectNameAndCircuitSubWorkId(
            @Param("circuitProjectName") String circuitProjectName,
            @Param("circuitSubWorkId") String circuitSubWorkId);

    //修改
    int updateCircuitInspectionProject(@Param("circuitProjectId") String circuitProjectId,
                                       @Param("circuitProjectName") String circuitProjectName);

    //根据分项工程id查询包含的检查项目id
    List<String> selectCircuitProjectIdBySubWorkId(@Param("circuitSubWorkId") String circuitSubWorkId);

    //删除
    int deleteCircuitInspectionProject(@Param("circuitProjectId") String circuitProjectId);

    //根据检查项目id查询检查项目对象
    CircuitInspectionProject selectCircuitInspectionProjectBycircuitProjectId(@Param("circuitProjectId") String circuitProjectId);
}