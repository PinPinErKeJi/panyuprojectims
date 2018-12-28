package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IndoorCoverageProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface IndoorCoverageProjectDao{

    //根据检查项目id和名字查询检查项目对象
    IndoorCoverageProject getIndoorCoverageProject(@Param("indoorProjectId") String indoorProjectId,
                                                   @Param("indoorProjectName") String indoorProjectName);

    //根据分项工程id查询包含的检查项目
    List<IndoorCoverageProject> selectAllIndoorCoverageProjectByIndoorSubWorkId(@Param("indoorSubWorkId") String indoorSubWorkId);

    //根据检查项目名和分项工程id查询个数
    long getCountByIndoorProjectNameAndIndoorSubWorkId(@Param("indoorProjectName") String indoorProjectName,
                                                       @Param("indoorSubWorkId") String indoorSubWorkId);
    //添加
    int insertIndoorCoverageProject(@Param("indoorProjectName") String indoorProjectName,
                                    @Param("indoorSubWorkId") String indoorSubWorkId);
    //根据检查项目名和分项工程id查询检查项目
    IndoorCoverageProject selectIndoorCoverageProjectByIndoorProjectNameAndIndoorSubWorkId(
            @Param("indoorProjectName") String indoorProjectName,
            @Param("indoorSubWorkId") String indoorSubWorkId);
    //修改
    int updateIndoorCoverageProject(@Param("indoorProjectId") String indoorProjectId,
                                    @Param("indoorProjectName") String indoorProjectName);

    //删除
    int deleteIndoorCoverageProject(@Param("indoorProjectId") String indoorProjectId);

    //根据分项工程id查询检查项目id
    List<String> selectIndoorProjectIdByIndoorSubWorkId(@Param("indoorSubWorkId") String indoorSubWorkId);

    //根据分项工程id查询分项工程名和标准规范
    IndoorCoverageProject selectIndoorProjectNameAndIndoorSpecificationName(@Param("indoorProjectId") String indoorProjectId);

}