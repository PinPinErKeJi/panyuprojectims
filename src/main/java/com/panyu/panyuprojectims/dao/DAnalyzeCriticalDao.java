package com.panyu.panyuprojectims.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/*
    关键工序到位率
 */
@Mapper
public interface DAnalyzeCriticalDao {
    //修改关键工序状态
    Boolean  updatePStatus(@Param("projectStatus")String projectStatus);
}
