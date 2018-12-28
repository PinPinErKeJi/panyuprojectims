package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnSecondSplitterNumber;
public interface HnSecondSplitterNumberService{

	//根据二级分光器设计数量表ID字段删除数据
	int deleteHnSecondSplitterNumberBySecondSplitterNumberId(String secondSplitterNumberId);

	//添加
	int insertHnSecondSplitterNumber(String secondSplitterNumberId,
                                     String secondOneToFour,
                                     String secondOneToEight,
                                     String secondOneToSixteen,
                                     String oneToThirtyTwo,
                                     String oneToSixtyFour);
}