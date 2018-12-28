package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IcBbuNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IcBbuNumberDao{

    //根据信息id查询室内覆盖BBU对象
    IcBbuNumber selectIcBbuNumberByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);

    //添加
    int insertIcBbuNumber(@Param("bbuNumberId") String bbuNumberId,
                          @Param("centralization") String centralization,
                          @Param("wallHangingWall") String wallHangingWall);

    //根据BBU数量ID删除选中项
    int deleteIcBbuNumberById(@Param("bbuNumberId") String bbuNumberId);
}