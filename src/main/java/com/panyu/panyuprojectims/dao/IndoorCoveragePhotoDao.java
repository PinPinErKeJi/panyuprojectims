package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IndoorCoveragePhoto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface IndoorCoveragePhotoDao{

    //根据模块ID和分项工程ID查询检查项目ID集合
    List<String> selectIndoorProjectIdList(@Param("indoorCoverageId") String indoorCoverageId,
                                           @Param("indoorSubWorkId") String indoorSubWorkId);

    //添加图片
    int insertIndoorCoveragePhoto(IndoorCoveragePhoto indoorCoveragePhoto);

    //根据检查项目id查询图片信息个数
    long getCountIndoorCoveragePhotoByIndoorProjectId(@Param("indoorProjectId") String indoorProjectId);

    //根据检查项目ID和导入信息id查询图片资源ID集合
    List<String> selectIndoorPhotoIdList(@Param("indoorProjectId") String indoorProjectId,
                                         @Param("indoorInformationId") String indoorInformationId);

    //根据图片资源ID和导入信息id查询图片对象
    IndoorCoveragePhoto selectIndoorCoveragePhoto(@Param("indoorPhotoId") String indoorPhotoId,
                                                  @Param("indoorProjectId") String indoorProjectId,
                                                  @Param("indoorInformationId") String indoorInformationId);


}