package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnCableConnectorBoxNumber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnCableConnectorBoxNumberDao{

	//根据驻地网信息id查询 光缆交接箱设计数量对象
	HnCableConnectorBoxNumber selectHnCableConnectorBoxNumberByGarrisonInformationId(@Param("garrisonInformationId") String garrisonInformationId);

	//根据光缆交接箱设计数量表ID字段删除数据
	int deleteHnCableConnectorBoxNumberByCableConnectorBoxId(@Param("cableConnectorBoxId") String cableConnectorBoxId);

	//添加
	int insertHnCableConnectorBoxNumber(@Param("cableConnectorBoxId") String cableConnectorBoxId,
                                        @Param("cableFloorType") String cableFloorType,
                                        @Param("cableWallMounted") String cableWallMounted);
}