package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.GarrisonSubWork;

import java.util.List;
public interface GarrisonSubWorkService{


    //根据分项工程id和名字查询分项工程对象
    GarrisonSubWork getGarrisonSubWork(String garrisonSubWorkId, String garrisonSubWorkName);



    //添加
    GarrisonSubWork addGarrisonSubWork(String garrisonSubWorkName, String garrisonId);



    //根据模块id查询他包含的分项工程
    List<GarrisonSubWork> selectAllGarrisonSubWorkByGarrisonId(String garrisonId);

    //修改
    int updateGarrisonSubWork(String garrisonSubWorkId, String garrisonSubWorkName);
    //删除
    int deleteGarrisonSubWork(String garrisonSubWorkId);
    //根据模块id查询包含的分项工程的id
    List<String> selectAllGarrisonSubWorkIdByGarrisonId(String garrisonId);
}