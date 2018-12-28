package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IcAntennaNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IcAntennaNumberDao{

    //根据信息id查询天线对象
    IcAntennaNumber selectIcAntennaNumberByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);

    //添加
    int insertIcAntennaNumber(@Param("antennaNumberId") String antennaNumberId,
                              @Param("indoorAntenna") String indoorAntenna,
                              @Param("outdoorAntenna") String outdoorAntenna,
                              @Param("elevatorAntenna") String elevatorAntenna,
                              @Param("gpsAntenna") String gpsAntenna);

    //根据天线数量ID删除选中项
    int deleteAntennaNumberId(@Param("antennaNumberId") String antennaNumberId);
}