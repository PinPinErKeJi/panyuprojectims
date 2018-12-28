package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.IndoorCoveragePhoto;
public interface IndoorCoveragePhotoService{

    //根据模块ID和分项工程ID查询检查项目ID集合
    List<String> selectIndoorProjectIdList(String indoorCoverageId,
                                           String indoorSubWorkId);

    //添加图片
    int insertIndoorCoveragePhoto(IndoorCoveragePhoto indoorCoveragePhoto);

    //根据检查项目id查询图片信息个数
    long getCountIndoorCoveragePhotoByIndoorProjectId(String indoorProjectId);

    //根据检查项目ID和导入信息id查询图片资源ID集合
    List<String> selectIndoorPhotoIdList(String indoorProjectId,
                                         String indoorInformationId);

    //根据图片资源ID和导入信息id查询图片对象
    IndoorCoveragePhoto selectIndoorCoveragePhoto(String indoorPhotoId,
                                                  String indoorProjectId,
                                                  String indoorInformationId);

}