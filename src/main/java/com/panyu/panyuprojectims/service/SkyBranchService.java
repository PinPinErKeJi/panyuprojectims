package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.SkyBranch;
import java.util.List;

public interface SkyBranchService{

	//添加
	boolean insertSkyBranch(String skyBranchId,
                            String constructionMode,
                            String basicType,
                            String foundationConstructionName,
                            String basicUnitContacts,
                            String skyBranchTypeName,
                            String skyBranchSupplierName,
                            String skyBranchSupplierContacts,
                            String skyBranchUnitName,
                            String skyConstructionUnitContacts,
                            String skyBranchHeight);

//---------------------------------删除开始-----------------------------------------------------------//
    boolean deleteSkyBranchById(String skyBranchId);
//---------------------------------删除结束-----------------------------------------------------------//

//根据天支ID查询建设方式、天支类型、基础类型
	SkyBranch selectByskyBranchId(String skyBranchId);
}