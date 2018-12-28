package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.Garrison;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GarrisonDao{


    //查询下拉框模块名称
    List<Garrison> selectGarrison();
    //添加
    int insertGarrison(@Param("garrisonName") String garrisonName);
    //添加前根据名字查询个数，判断要添加的模块名是否存在
    long countByGarrisonName(@Param("garrisonName") String garrisonName);
    //根据模块名查询模块对象
    Garrison selectGarrisonByGarrisonName(@Param("garrisonName") String garrisonName);
    //修改
    int updateGarrison(
            @Param("garrisonId") String garrisonId,
            @Param("garrisonName") String garrisonName);
    //删除
    int deleteGarrison(@Param("garrisonId") String garrisonId);
}