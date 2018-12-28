package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnDesignUnitDao;
import com.panyu.panyuprojectims.entity.HnDesignUnit;
import com.panyu.panyuprojectims.service.HnDesignUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnDesignUnitServiceImpl implements HnDesignUnitService{
    @Autowired
    private HnDesignUnitDao hnDesignUnitDao;


    //根据驻地网设计单位表ID字段删除数据
    @Override
    public int deleteHnDesignUnitByDesignUnitId(String designUnitId) {
        return hnDesignUnitDao.deleteHnDesignUnitByDesignUnitId(designUnitId);
    }

    //添加
    @Override
    public int insertHnDesignUnit(String designUnitId, String designCorporateName, String designConstructionLinkman) {
        return hnDesignUnitDao.insertHnDesignUnit(designUnitId,designCorporateName,designConstructionLinkman);
    }
}