package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.IndoorCoverageProject;
public interface IndoorCoverageProjectService{


    //根据检查项目id和名字查询检查项目对象
    IndoorCoverageProject getIndoorCoverageProject(String indoorProjectId, String indoorProjectName);



    //根据分项工程id查询分项工程名和标准规范
    IndoorCoverageProject selectIndoorProjectNameAndIndoorSpecificationName(String indoorProjectId);


    //添加
    IndoorCoverageProject addIndoorCoverageProject(String indoorProjectName,
                                                   String indoorSubWorkId);



    //根据分项工程id查询包含的检查项目
    List<IndoorCoverageProject> selectAllIndoorCoverageProjectByIndoorSubWorkId(String indoorSubWorkId);

    //修改
    int updateIndoorCoverageProject(String indoorProjectId,
                                    String indoorProjectName);

    //删除
    int deleteIndoorCoverageProject(String indoorProjectId);

    //根据分项工程id查询检查项目id
    List<String> selectIndoorProjectIdByIndoorSubWorkId(String indoorSubWorkId);

}