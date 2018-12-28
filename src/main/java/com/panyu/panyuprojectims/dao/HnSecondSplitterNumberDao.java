package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnSecondSplitterNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnSecondSplitterNumberDao{


	//根据二级分光器设计数量表ID字段删除数据
	int deleteHnSecondSplitterNumberBySecondSplitterNumberId(@Param("secondSplitterNumberId") String secondSplitterNumberId);

	//添加
	int insertHnSecondSplitterNumber(@Param("secondSplitterNumberId") String secondSplitterNumberId,
                                     @Param("secondOneToFour") String secondOneToFour,
                                     @Param("secondOneToEight") String secondOneToEight,
                                     @Param("secondOneToSixteen") String secondOneToSixteen,
                                     @Param("oneToThirtyTwo") String oneToThirtyTwo,
                                     @Param("oneToSixtyFour") String oneToSixtyFour);
}