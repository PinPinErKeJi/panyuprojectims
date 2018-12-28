package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnDesignUnit;
public interface HnDesignUnitService{

	//根据驻地网设计单位表ID字段删除数据
	int deleteHnDesignUnitByDesignUnitId(String designUnitId);

	//添加
	int insertHnDesignUnit(String designUnitId,
                           String designCorporateName,
                           String designConstructionLinkman);
}