package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnPrimarySplitterBoxNumber;
public interface HnPrimarySplitterBoxNumberService{

	//根据一级分光器箱设计数量表ID字段删除数据
	int deleteHnPrimarySplitterBoxNumberByPrimarySplitterBoxId(String primarySplitterBoxId);

	//添加
	int insertHnPrimarySplitterBoxNumber(String primarySplitterBoxId,
                                         String primaryAnchorearType,
                                         String primaryWallMounted);
}