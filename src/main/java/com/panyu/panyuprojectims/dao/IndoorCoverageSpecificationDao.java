package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IndoorCoverageSpecification;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface IndoorCoverageSpecificationDao{


    //根据标准规范id和标准规范内容查查标准规范对象
    IndoorCoverageSpecification getIndoorCoverageSpecification(@Param("indoorSpecificationName") String indoorSpecificationName,
                                                               @Param("indoorSpecificationId") String indoorSpecificationId);

    //根据检查项目id查询包含的标准规范
    List<IndoorCoverageSpecification> selectIndoorCoverageSpecificationByIndoorProjectId(@Param("indoorProjectId") String indoorProjectId);

    //根据标准规范名和检查项目id查询个数
    long getCountByIndoorSpecificationNameAndIndoorProjectId(@Param("indoorSpecificationName") String indoorSpecificationName,
                                                             @Param("indoorProjectId") String indoorProjectId);
    //添加
    int insertIndoorCoverageSpecification(@Param("indoorSpecificationName") String indoorSpecificationName,
                                          @Param("indoorProjectId") String indoorProjectId);
    //根据标准规范名和检查项目id查询标准规范
    IndoorCoverageSpecification selectIndoorCoverageSpecificationByIndoorSpecificationNameAndIndoorProjectId(
            @Param("indoorSpecificationName") String indoorSpecificationName,
            @Param("indoorProjectId") String indoorProjectId);
    //修改
    int updateIndoorCoverageSpecification(@Param("indoorSpecificationName") String indoorSpecificationName,
                                          @Param("indoorSpecificationId") String indoorSpecificationId);

    //删除
    int deleteIndoorCoverageSpecification(@Param("indoorSpecificationId") String indoorSpecificationId);
    //根据检查项目id查询标准规范的id
    List<String> selectIndoorSpecificationIdByIndoorProjectId(@Param("indoorProjectId") String indoorProjectId);
}