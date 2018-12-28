package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaPigtailSkipFiber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaPigtailSkipFiberDao{


    //添加
    int insertFaPigtailSkipFiber(@Param("pigtailSkipFiberId") String pigtailSkipFiberId,
                                 @Param("pigtailNumber") String pigtailNumber,
                                 @Param("fiberCableType") String fiberCableType,
                                 @Param("fiberSpecificationModel") String fiberSpecificationModel,
                                 @Param("fiberNumberOfBranches") String fiberNumberOfBranches,
                                 @Param("fiberSingleLength") String fiberSingleLength,
                                 @Param("forms") String forms,
                                 @Param("to2") String to2,
                                 @Param("fiberSupplier") String fiberSupplier,
                                 @Param("fiberContacts") String fiberContacts
    );

    //根据尾纤,跳纤ID删除选中项
    int deleteFaPigtailSkipFiberById(@Param("pigtailSkipFiberId") String pigtailSkipFiberId);

    //根据设备信息id查询FaPigtailSkipFiber
    FaPigtailSkipFiber getFaPigtailSkipFiber(@Param("equipmentInformationId") String equipmentInformationId);
    int updateFaPigtailSkipFiberById(FaPigtailSkipFiber enti);
}