package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnCableConnectorBoxNumber;
public interface HnCableConnectorBoxNumberService{

	//根据光缆交接箱设计数量表ID字段删除数据
	int deleteHnCableConnectorBoxNumberByCableConnectorBoxId(String cableConnectorBoxId);

	//添加
	int insertHnCableConnectorBoxNumber(String cableConnectorBoxId,
                                        String cableFloorType,
                                        String cableWallMounted);
}