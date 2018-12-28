package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PowerSubWork;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PowerSubWorkDao{

    //根据模块id查询包含的分项工程
    List<PowerSubWork> selectAllPowerSubWorkByPowerModuleId(@Param("powerModuleId") String powerModuleId);

    //根据分项工程名字和模块id查询分项工程个数
    long getCountByPowerSubWorkNameAndPowerModuleId(@Param("powerSubWorkName") String powerSubWorkName,
                                                    @Param("powerModuleId") String powerModuleId);
    //添加
    int insertPowerSubWork(@Param("powerSubWorkName") String powerSubWorkName,
                           @Param("powerModuleId") String powerModuleId);
    //根据分项工程名字和模块id查询分项工程
    PowerSubWork selectPowerSubWorkByPowerSubWorkNameAndPowerModuleId(@Param("powerSubWorkName") String powerSubWorkName,
                                                                      @Param("powerModuleId") String powerModuleId);
    //修改
    int updatePowerSubWork(@Param("powerSubWorkName") String powerSubWorkName,
                           @Param("powerSubWorkId") String powerSubWorkId);
    //根据分项工程名字和id查询分项工程
    PowerSubWork selectPowerSubWorkByPowerSubWorkNameAndPowerSubWorkId(@Param("powerSubWorkName") String powerSubWorkName,
                                                                       @Param("powerSubWorkId") String powerSubWorkId);
    //根据模块ID查询分项工程ID集合
    List<String> selectPowerSubWorkId(@Param("powerModuleId") String powerModuleId);
    //删除
    int deletePowerSubWork(@Param("powerSubWorkId") String powerSubWorkId);


}