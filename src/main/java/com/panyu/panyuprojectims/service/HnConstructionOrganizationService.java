package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnConstructionOrganization;
public interface HnConstructionOrganizationService{


	//根据驻地网施工单位表ID字段删除数据
	int deleteHnConstructionOrganizationByConstructionOrganizationId(String constructionOrganizationId);

	//添加
	int insertHnConstructionOrganization(String constructionOrganizationId,
                                         String constructionCorporateName,
                                         String constructionLinkman);
}