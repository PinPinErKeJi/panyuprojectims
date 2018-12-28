package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnSupervisorUnitDao;
import com.panyu.panyuprojectims.entity.HnSupervisorUnit;
import com.panyu.panyuprojectims.service.HnSupervisorUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnSupervisorUnitServiceImpl implements HnSupervisorUnitService{
    @Autowired
    private HnSupervisorUnitDao hnSupervisorUnitDao;

    //根据驻地网监理单位表ID字段删除数据
    @Override
    public int deleteHnSupervisorUnitBySupervisorUnitId(String supervisorUnitId) {
        return hnSupervisorUnitDao.deleteHnSupervisorUnitBySupervisorUnitId(supervisorUnitId);
    }

    //添加
    @Override
    public int insertHnSupervisorUnit(String supervisorUnitId, String onSiteSupervision, String professionResponsiblePerson, String districtHead) {
        return hnSupervisorUnitDao.insertHnSupervisorUnit(supervisorUnitId,onSiteSupervision,professionResponsiblePerson,districtHead);
    }
}