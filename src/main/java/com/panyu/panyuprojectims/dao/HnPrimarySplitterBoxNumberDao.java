package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnPrimarySplitterBoxNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnPrimarySplitterBoxNumberDao{

	//根据驻地网信息id查询对应的一级分光器箱设计数量 对象
	HnPrimarySplitterBoxNumber selectHnPrimarySplitterBoxNumberByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);


	//根据一级分光器箱设计数量表ID字段删除数据
	int deleteHnPrimarySplitterBoxNumberByPrimarySplitterBoxId(@Param("primarySplitterBoxId") String primarySplitterBoxId);

	//添加
	int insertHnPrimarySplitterBoxNumber(@Param("primarySplitterBoxId") String primarySplitterBoxId,
                                         @Param("primaryAnchorearType") String primaryAnchorearType,
                                         @Param("primaryWallMounted") String primaryWallMounted);
}