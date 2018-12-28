package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.IndoorCoverageSubWork;
public interface IndoorCoverageSubWorkService{


    //跟据分项工程id和名字查询分项工程对象
    IndoorCoverageSubWork getIndoorCoverageSubWork(String indoorSubWorkId, String indoorSubWorkName);


    //添加
    IndoorCoverageSubWork addIndoorCoverageSubWork(String indoorSubWorkName,
                                                   String indoorCoverageId);



    //根据模块信息id查询包含的分项工程
    List<IndoorCoverageSubWork> selectAllIndoorCoverageSubWorkByIndoorCoverageId(String indoorCoverageId);

    //修改
    int updateIndoorCoverageSubWork(String indoorSubWorkId,
                                    String indoorSubWorkName);
    //删除
    int deleteIndoorCoverageSubWork(String indoorSubWorkId);
    //根据模块id查询包含的分项工程id
    List<String> selectIndoorSubWorkIdByIndoorCoverageId(String indoorCoverageId);

}