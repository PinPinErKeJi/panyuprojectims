package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnCableLength;
public interface HnCableLengthService{



	//根据光缆长度表ID字段删除数据
	int deleteHnCableLengthByCableLengthId(String cableLengthId);

	//添加
	int insertHnCableLength(String cableLengthId,
                            String gysts,
                            String gysta,
                            String buriedServiceLightguide,
                            String wallCable,
                            String inBridgeCable,
                            String gyfxts);

}