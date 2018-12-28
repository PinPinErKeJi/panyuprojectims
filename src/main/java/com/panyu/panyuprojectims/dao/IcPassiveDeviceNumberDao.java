package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IcPassiveDeviceNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IcPassiveDeviceNumberDao{


    //根据信息ID查询无源器件对象
    IcPassiveDeviceNumber selectIcPassiveDeviceNumberByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);

    //添加
    int insertIcPassiveDeviceNumber(@Param("passiveDeviceNumberId") String passiveDeviceNumberId,
                                    @Param("powerDivider") String powerDivider,
                                    @Param("coupler") String coupler,
                                    @Param("roadConnector") String roadConnector,
                                    @Param("loadNumber") String loadNumber);

    //根据无源器件数量ID删除选中项
    int deleteIcPassiveDeviceNumberById(@Param("passiveDeviceNumberId") String passiveDeviceNumberId);
}