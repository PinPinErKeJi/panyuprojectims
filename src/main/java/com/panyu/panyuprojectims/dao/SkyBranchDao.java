package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.SkyBranch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface SkyBranchDao{


	//添加
	int insertSkyBranch(@Param("skyBranchId") String skyBranchId,
                        @Param("constructionMode") String constructionMode,
                        @Param("basicType") String basicType,
                        @Param("foundationConstructionName") String foundationConstructionName,
                        @Param("basicUnitContacts") String basicUnitContacts,
                        @Param("skyBranchTypeName") String skyBranchTypeName,
                        @Param("skyBranchSupplierName") String skyBranchSupplierName,
                        @Param("skyBranchSupplierContacts") String skyBranchSupplierContacts,
                        @Param("skyBranchUnitName") String skyBranchUnitName,
                        @Param("skyConstructionUnitContacts") String skyConstructionUnitContacts,
                        @Param("skyBranchHeight") String skyBranchHeight);

//-----------------------------------删除方法开始-----------------------------------------------//

    int deleteSkyBranchById(String skyBranchId);

//-----------------------------------删除方法结束-----------------------------------------------//

//根据天支表ID查询建设方式、基础类型和天支类型
	SkyBranch selectByskyBranchId(String skyBranchId);
}