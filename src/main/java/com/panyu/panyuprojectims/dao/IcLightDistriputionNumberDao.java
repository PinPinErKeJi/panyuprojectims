package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IcLightDistriputionNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IcLightDistriputionNumberDao{

    //根据信息id查询光分布设备对象
    IcLightDistriputionNumber selectIcLightDistriputionNumberByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);

    //添加
    int insertIcLightDistriputionNumber(@Param("lightNumberId") String lightNumberId,
                                        @Param("easyMacro") String easyMacro,
                                        @Param("bookrruNotIntegratedAntenna") String bookrruNotIntegratedAntenna,
                                        @Param("bookrruIntegratedAntenna") String bookrruIntegratedAntenna,
                                        @Param("hub") String hub,
                                        @Param("pruIntegratedAntenna") String pruIntegratedAntenna,
                                        @Param("pruNotIntegratedAntenna") String pruNotIntegratedAntenna,
                                        @Param("accessUnit") String accessUnit,
                                        @Param("extensionUnit") String extensionUnit,
                                        @Param("remoteDeviceIndoor") String remoteDeviceIndoor,
                                        @Param("remoteDeviceOutdoor") String remoteDeviceOutdoor);


    //根据光分布设备数量表ID删除选中项
    int deleteIcLightDistriputionNumberById(@Param("lightNumberId") String lightNumberId);
}