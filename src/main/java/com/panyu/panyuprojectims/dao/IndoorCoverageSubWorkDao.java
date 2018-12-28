package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IndoorCoverageSubWork;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface IndoorCoverageSubWorkDao{


    //跟据分项工程id和名字查询分项工程对象
    IndoorCoverageSubWork getIndoorCoverageSubWork(@Param("indoorSubWorkId") String indoorSubWorkId,
                                                   @Param("indoorSubWorkName") String indoorSubWorkName);

    //根据模块信息id查询包含的分项工程
    List<IndoorCoverageSubWork> selectAllIndoorCoverageSubWorkByIndoorCoverageId(@Param("indoorCoverageId") String indoorCoverageId);

    //根据分项工程名字和模块id查询个数
    long getCountByIndoorSubWorkNameAndByIndoorCoverageId(@Param("indoorSubWorkName") String indoorSubWorkName,
                                                          @Param("indoorCoverageId") String indoorCoverageId);
    //添加
    int insertIndoorCoverageSubWork(@Param("indoorSubWorkName") String indoorSubWorkName,
                                    @Param("indoorCoverageId") String indoorCoverageId);
    //根据分项工程名字和模块id查询分项工程
    IndoorCoverageSubWork selectIndoorCoverageSubWorkByIndoorSubWorkNameAndByIndoorCoverageId
    (@Param("indoorSubWorkName") String indoorSubWorkName,
     @Param("indoorCoverageId") String indoorCoverageId);
    //修改
    int updateIndoorCoverageSubWork(@Param("indoorSubWorkId") String indoorSubWorkId,
                                    @Param("indoorSubWorkName") String indoorSubWorkName);
    //删除
    int deleteIndoorCoverageSubWork(@Param("indoorSubWorkId") String indoorSubWorkId);
    //根据模块id查询包含的分项工程id
    List<String> selectIndoorSubWorkIdByIndoorCoverageId(@Param("indoorCoverageId") String indoorCoverageId);

}