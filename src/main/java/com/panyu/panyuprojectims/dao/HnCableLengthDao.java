package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnCableLength;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnCableLengthDao{

	//根据驻地网信息id查询 光缆长度对象
	HnCableLength selectHnCableLengthByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);

	//根据光缆长度表ID字段删除数据
	int deleteHnCableLengthByCableLengthId(@Param("cableLengthId") String cableLengthId);

	//添加
	int insertHnCableLength(@Param("cableLengthId") String cableLengthId,
                            @Param("gysts") String gysts,
                            @Param("gysta") String gysta,
                            @Param("buriedServiceLightguide") String buriedServiceLightguide,
                            @Param("wallCable") String wallCable,
                            @Param("inBridgeCable") String inBridgeCable,
                            @Param("gyfxts") String gyfxts);
}