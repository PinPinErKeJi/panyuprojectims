package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnCableConnectorBoxNumberDao;
import com.panyu.panyuprojectims.entity.HnCableConnectorBoxNumber;
import com.panyu.panyuprojectims.service.HnCableConnectorBoxNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnCableConnectorBoxNumberServiceImpl implements HnCableConnectorBoxNumberService{
    @Autowired
    private HnCableConnectorBoxNumberDao hnCableConnectorBoxNumberDao;


    //根据光缆交接箱设计数量表ID字段删除数据
    @Override
    public int deleteHnCableConnectorBoxNumberByCableConnectorBoxId(String cableConnectorBoxId) {
        return hnCableConnectorBoxNumberDao.deleteHnCableConnectorBoxNumberByCableConnectorBoxId(cableConnectorBoxId);
    }

    //添加
    @Override
    public int insertHnCableConnectorBoxNumber(String cableConnectorBoxId, String cableFloorType, String cableWallMounted) {
        return hnCableConnectorBoxNumberDao.insertHnCableConnectorBoxNumber(cableConnectorBoxId,cableFloorType,cableWallMounted);
    }
}