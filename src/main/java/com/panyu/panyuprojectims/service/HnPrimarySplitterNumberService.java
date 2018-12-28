package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnPrimarySplitterNumber;
public interface HnPrimarySplitterNumberService{


	//根据一级分光器设计数量表ID字段删除数据
	int deleteHnPrimarySplitterNumberByPrimarySplitterNumberId(String primarySplitterNumberId);

	//添加
	int insertHnPrimarySplitterNumber(String primarySplitterNumberId,
                                      String primaryOneToFour,
                                      String primaryOneToEight,
                                      String primaryOneToSixteen);
}