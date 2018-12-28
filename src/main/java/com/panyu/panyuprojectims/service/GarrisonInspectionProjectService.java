package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.GarrisonInspectionProject;

import java.util.List;
public interface GarrisonInspectionProjectService{


    //根据检查项目id和名字查询检查项目对象
    GarrisonInspectionProject getGarrisonInspectionProject(String garrisonProjectName,
                                                           String garrisonProjectId);



    //添加
    GarrisonInspectionProject addGarrisonInspectionProject(String garrisonProjectName,
                                                           String garrisonSubWorkId);


    //根据分项工程id查询包含的检查项目
    List<GarrisonInspectionProject> selectAllGarrisonInspectionProjectByGarrisonSubWorkId(String garrisonSubWorkId);

    //修改
    int updateGarrisonInspectionProject(String garrisonProjectName,
                                        String garrisonProjectId);
    //删除
    int deleteGarrisonInspectionProject(String garrisonProjectId);
    //根据分项工程id查询包含的检查项目id 集合
    List<String> selectAllGarrisonProjectIdByGarrisonSubWorkId(String garrisonSubWorkId);
    //数据填报的时候根据检查项目ID查询项目名称通过对象接收
    GarrisonInspectionProject selectGarrisonInspectionProjectByProjectName(String garrisonProjectId);
}