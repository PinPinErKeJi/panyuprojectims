package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.CircuitSubWork;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CircuitSubWorkDao{


    //根据分项工程id和名字查询分项工程对象
    CircuitSubWork getCircuitSubWork(@Param("circuitSubWorkId") String circuitSubWorkId,
                                     @Param("circuitSubWorkName") String circuitSubWorkName);



    //根据模块id查询包含的分项工程信息
    List<CircuitSubWork> selectCircuitSubWorkByModuleId(@Param("circuitModuleId") String circuitModuleId);

    //根据分项工程名和模块id查询分项工程数量，判断分项工程名是否存在
    long getCountCircuitSubWorkNameByCircuitSubWorkNameAndCircuitModuleId(@Param("circuitSubWorkName") String circuitSubWorkName,
                                                                          @Param("circuitModuleId") String circuitModuleId);

    //添加
    int insertCircuitSubWork(@Param("circuitSubWorkName") String circuitSubWorkName,
                             @Param("circuitModuleId") String circuitModuleId);

    //根据分项工程名和模块id查查询分项工程
    CircuitSubWork selectCircuitSubWorkByCircuitSubWorkNameAndCircuitModuleId(@Param("circuitSubWorkName") String circuitSubWorkName,
                                                                              @Param("circuitModuleId") String circuitModuleId);

    //修改
    int updateCircuitSubWork(@Param("circuitSubWorkId") String circuitSubWorkId,
                             @Param("circuitSubWorkName") String circuitSubWorkName);

    //根据模块id查询包含的分项工程id
    List<String> selectCircuitSubWorkIdByCircuitModuleId(@Param("circuitModuleId") String circuitModuleId);

    //删除
    int deleteCircuitSubWork(@Param("circuitSubWorkId") String circuitSubWorkId);
}