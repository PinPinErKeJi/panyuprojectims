package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.GarrisonSubWork;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GarrisonSubWorkDao{

    //根据分项工程id和名字查询分项工程对象
    GarrisonSubWork getGarrisonSubWork(@Param("garrisonSubWorkId") String garrisonSubWorkId,
                                       @Param("garrisonSubWorkName") String garrisonSubWorkName);

    //根据模块id查询他包含的分项工程
    List<GarrisonSubWork> selectAllGarrisonSubWorkByGarrisonId(
            @Param("garrisonId") String garrisonId);
    //添加
    int insertGarrisonSubWork(
            @Param("garrisonSubWorkName") String garrisonSubWorkName,
            @Param("garrisonId") String garrisonId);
    //添加前根据名字查询个数，判断这个名字是否存在
    long countByGarrisonSubWorkName(
            @Param("garrisonSubWorkName") String garrisonSubWorkName,
            @Param("garrisonId") String garrisonId);
    //根据分项工程的名字查询分项工程
    GarrisonSubWork selectGarrisonSubWorkByGarrisonSubWorkName(
            @Param("garrisonSubWorkName") String garrisonSubWorkName,
            @Param("garrisonId") String garrisonId);
    //修改
    int updateGarrisonSubWork(@Param("garrisonSubWorkId") String garrisonSubWorkId,
                              @Param("garrisonSubWorkName") String garrisonSubWorkName);
    //删除
    int deleteGarrisonSubWork(@Param("garrisonSubWorkId") String garrisonSubWorkId);
    //根据模块id查询包含的分项工程的id
    List<String> selectAllGarrisonSubWorkIdByGarrisonId(@Param("garrisonId") String garrisonId);
}