package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnConstructionOrganization;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnConstructionOrganizationDao{

	//根据驻地网施工单位表ID字段删除数据
	int deleteHnConstructionOrganizationByConstructionOrganizationId(@Param("constructionOrganizationId") String constructionOrganizationId);

	//添加
	int insertHnConstructionOrganization(@Param("constructionOrganizationId") String constructionOrganizationId,
                                         @Param("constructionCorporateName") String constructionCorporateName,
                                         @Param("constructionLinkman") String constructionLinkman);
}