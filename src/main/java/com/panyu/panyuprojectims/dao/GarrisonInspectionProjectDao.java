package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.GarrisonInspectionProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GarrisonInspectionProjectDao{

    //根据检查项目id和名字查询检查项目对象
    GarrisonInspectionProject getGarrisonInspectionProject(@Param("garrisonProjectName") String garrisonProjectName,
                                                           @Param("garrisonProjectId") String garrisonProjectId);

    //根据分项工程id查询包含的检查项目
    List<GarrisonInspectionProject> selectAllGarrisonInspectionProjectByGarrisonSubWorkId(
            @Param("garrisonSubWorkId") String garrisonSubWorkId);
    //添加
    int insertGarrisonInspectionProject(@Param("garrisonProjectName") String garrisonProjectName,
                                        @Param("garrisonSubWorkId") String garrisonSubWorkId);
    //根据检查项目名字查询个数，判断名字是否存在
    long countByGarrisonProjectName(@Param("garrisonProjectName") String garrisonProjectName,
                                    @Param("garrisonSubWorkId") String garrisonSubWorkId);
    //根据检查项目名字查询检查项目
    GarrisonInspectionProject selectGarrisonInspectionProjectByGarrisonProjectName(
            @Param("garrisonProjectName") String garrisonProjectName,
            @Param("garrisonSubWorkId") String garrisonSubWorkId);
    //修改
    int updateGarrisonInspectionProject(@Param("garrisonProjectName") String garrisonProjectName,
                                        @Param("garrisonProjectId") String garrisonProjectId);
    //删除
    int deleteGarrisonInspectionProject(@Param("garrisonProjectId") String garrisonProjectId);
    //根据分项工程id查询包含的检查项目id 集合
    List<String> selectAllGarrisonProjectIdByGarrisonSubWorkId(@Param("garrisonSubWorkId") String garrisonSubWorkId);
    //数据填报的时候根据检查项目ID查询项目名称通过对象接收
    GarrisonInspectionProject selectGarrisonInspectionProjectByProjectName(@Param("garrisonProjectId") String garrisonProjectId);
}