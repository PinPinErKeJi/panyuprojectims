package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaPowerNetworkLine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaPowerNetworkLineDao{


    //添加
    int insertFaPowerNetworkLine(@Param("powerNetworkLineId") String powerNetworkLineId,
                                 @Param("powerNumber") String powerNumber,
                                 @Param("cableType") String cableType,
                                 @Param("specificationModel") String specificationModel,
                                 @Param("numberOfBranches") String numberOfBranches,
                                 @Param("singleLength") String singleLength,
                                 @Param("totalLength") String totalLength,
                                 @Param("froms") String froms,
                                 @Param("to1") String to1,
                                 @Param("powerSupplier") String powerSupplier,
                                 @Param("powerContacts") String powerContacts
    );

    //根据电源线,网线,2M线表ID字段删除选中项
    int deleteFaPowerNetworkLineById(@Param("powerNetworkLineId") String powerNetworkLineId);

    //根据设备信息id查询FaPowerNetworkLine
    FaPowerNetworkLine getFaPowerNetworkLine(@Param("equipmentInformationId") String equipmentInformationId);

    int updateFaPowerNetworkLineById(FaPowerNetworkLine enti);
}