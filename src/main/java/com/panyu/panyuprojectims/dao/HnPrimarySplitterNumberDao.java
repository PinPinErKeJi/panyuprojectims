package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnPrimarySplitterNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnPrimarySplitterNumberDao{


	//根据一级分光器设计数量表ID字段删除数据
	int deleteHnPrimarySplitterNumberByPrimarySplitterNumberId(@Param("primarySplitterNumberId") String primarySplitterNumberId);


	//添加
	int insertHnPrimarySplitterNumber(@Param("primarySplitterNumberId") String primarySplitterNumberId,
                                      @Param("primaryOneToFour") String primaryOneToFour,
                                      @Param("primaryOneToEight") String primaryOneToEight,
                                      @Param("primaryOneToSixteen") String primaryOneToSixteen);
}