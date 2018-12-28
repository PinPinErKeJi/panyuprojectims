package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnSecondSplitterBoxNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnSecondSplitterBoxNumberDao{

	//根据驻地网信息id查询 二级分光器箱设计数量对象
	HnSecondSplitterBoxNumber selectHnSecondSplitterBoxNumberByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);


	//根据二级分光器箱设计数量表ID字段删除数据
	int deleteHnSecondSplitterBoxNumberBySecondSplitterBoxId(@Param("secondSplitterBoxId") String secondSplitterBoxId);

	//添加
	int insertHnSecondSplitterBoxNumber(@Param("secondSplitterBoxId") String secondSplitterBoxId,
                                        @Param("secondAnchorearType") String secondAnchorearType,
                                        @Param("secondWallMounted") String secondWallMounted);
}