package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.IndoorCoverageSpecification;
public interface IndoorCoverageSpecificationService{

    //根据标准规范id和标准规范内容查查标准规范对象
    IndoorCoverageSpecification getIndoorCoverageSpecification(String indoorSpecificationName,
                                                               String indoorSpecificationId);



    //添加
    IndoorCoverageSpecification addIndoorCoverageSpecification(String indoorSpecificationName,
                                                               String indoorProjectId);

    //根据检查项目id查询包含的标准规范
    List<IndoorCoverageSpecification> selectIndoorCoverageSpecificationByIndoorProjectId(String indoorProjectId);

    //修改
    int updateIndoorCoverageSpecification(String indoorSpecificationName,
                                          String indoorSpecificationId);

    //删除
    int deleteIndoorCoverageSpecification(String indoorSpecificationId);
    //根据检查项目id查询标准规范的id
    List<String> selectIndoorSpecificationIdByIndoorProjectId(String indoorProjectId);


}