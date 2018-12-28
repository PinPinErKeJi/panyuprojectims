package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.FaPowerNetworkLine;

import java.util.List;
public interface FaPowerNetworkLineService{


    //添加
    boolean insertFaPowerNetworkLine(String powerNetworkLineId,
                                     String powerNumber,
                                     String cableType,
                                     String specificationModel,
                                     String numberOfBranches,
                                     String singleLength,
                                     String totalLength,
                                     String froms,
                                     String to1,
                                     String powerSupplier,
                                     String powerContacts);

    //根据电源线,网线,2M线表ID字段删除选中项
    int deleteFaPowerNetworkLineById(String powerNetworkLineId);

    int updateFaPowerNetworkLineById(FaPowerNetworkLine enti);
}