package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnDesignUnit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnDesignUnitDao{

	//根据驻地网设计单位表ID字段删除数据
	int deleteHnDesignUnitByDesignUnitId(@Param("designUnitId") String designUnitId);

	//添加
	int insertHnDesignUnit(@Param("designUnitId") String designUnitId,
                           @Param("designCorporateName") String designCorporateName,
                           @Param("designConstructionLinkman") String designConstructionLinkman);
}