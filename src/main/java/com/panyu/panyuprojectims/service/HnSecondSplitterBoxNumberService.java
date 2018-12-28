package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnSecondSplitterBoxNumber;
public interface HnSecondSplitterBoxNumberService{


	//根据二级分光器箱设计数量表ID字段删除数据
	int deleteHnSecondSplitterBoxNumberBySecondSplitterBoxId(String secondSplitterBoxId);

	//添加
	int insertHnSecondSplitterBoxNumber(String secondSplitterBoxId,
                                        String secondAnchorearType,
                                        String secondWallMounted);
}