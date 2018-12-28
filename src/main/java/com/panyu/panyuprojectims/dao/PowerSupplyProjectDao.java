package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PowerSupplyProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PowerSupplyProjectDao{

    //根据分项工程id查询包含的检查项目
    List<PowerSupplyProject> selectPowerSupplyProjectByPowerSubWorkId(@Param("powerSubWorkId") String powerSubWorkId);

    //根据检查项目名和分项工程id查询数量
    long getCountByPowerProjectNameAndPowerSubWorkId(@Param("powerProjectName") String powerProjectName,
                                                     @Param("powerSubWorkId") String powerSubWorkId);
    //添加
    int insertPowerSupplyProject(@Param("powerProjectName") String powerProjectName,
                                 @Param("powerSubWorkId") String powerSubWorkId);
    //根据检查项目名和分项工程id查询检查项目
    PowerSupplyProject selectPowerSupplyProjectByPowerProjectNameAndPowerSubWorkId(
            @Param("powerProjectName") String powerProjectName,
            @Param("powerSubWorkId") String powerSubWorkId);

    //修改
    int updatePowerSupplyProject(@Param("powerProjectName") String powerProjectName,
                                 @Param("powerProjectId") String powerProjectId);
    //根据检查项目名和id查询检查项目
    PowerSupplyProject selectPowerSupplyProjectByPowerProjectNameAndPowerProjectId(
            @Param("powerProjectName") String powerProjectName,
            @Param("powerProjectId") String powerProjectId);

    //根据分项工程ID查询检查项目ID
    List<String> selectPowerProjectId(@Param("powerSubWorkId") String powerSubWorkId);
    //删除
    int deletePowerSupplyProject(@Param("powerProjectId") String powerProjectId);
    //根据检查项目id查询检查项目对象
    PowerSupplyProject selectPowerSupplyProjectByProjectId(@Param("powerProjectId") String powerProjectId);
}