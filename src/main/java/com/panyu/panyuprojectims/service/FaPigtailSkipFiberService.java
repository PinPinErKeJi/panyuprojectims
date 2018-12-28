package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.FaPigtailSkipFiber;

import java.util.List;
public interface FaPigtailSkipFiberService{


    //添加
    boolean insertFaPigtailSkipFiber(String pigtailSkipFiberId,
                                     String pigtailNumber,
                                     String fiberCableType,
                                     String fiberSpecificationModel,
                                     String fiberNumberOfBranches,
                                     String fiberSingleLength,
                                     String forms,
                                     String to2,
                                     String fiberSupplier,
                                     String fiberContacts);

    //根据尾纤,跳纤ID删除选中项
    int deleteFaPigtailSkipFiberById(String pigtailSkipFiberId);

    int updateFaPigtailSkipFiberById(FaPigtailSkipFiber enti);
}