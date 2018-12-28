package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.EquipmentSubWorkDao;
import com.panyu.panyuprojectims.entity.EquipmentSubWork;
import com.panyu.panyuprojectims.service.EquipmentSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EquipmentSubWorkServiceImpl implements EquipmentSubWorkService{
    @Autowired
    private EquipmentSubWorkDao equipmentSubWorkDao;

    //根据分项工程id和名字查询对象
    @Override
    public EquipmentSubWork getEquipmentSubWork(String equipmentSubWorkId, String equipmentSubWorkName) {
        return equipmentSubWorkDao.getEquipmentSubWork(equipmentSubWorkId,equipmentSubWorkName);
    }

    //添加
    @Override
    public EquipmentSubWork addEquipmentSubWork(String equipmentSubWorkName, String equipmentSpecialityId) {
        int count = equipmentSubWorkDao.getCountByEquipmentSubWorkId(equipmentSubWorkName,equipmentSpecialityId);
        if (count==0){
            int i = equipmentSubWorkDao.insertEquipmentSubWork(equipmentSubWorkName, equipmentSpecialityId);
        }
        EquipmentSubWork equipmentSubWork = equipmentSubWorkDao.selectEquipmentSubWorkBySubWorkName(equipmentSubWorkName,equipmentSpecialityId);
        return equipmentSubWork;
    }

    //根据模块ID查询分项工程
    @Override
    public List<EquipmentSubWork> selectAllEquipmentSubWorkByEquipmentSpecialityId(String equipmentSpecialityId) {
        return equipmentSubWorkDao.selectAllEquipmentSubWorkByEquipmentSpecialityId(equipmentSpecialityId);
    }

    //根据moduleID查询subID
    @Override
    public List<String> selectAllSubWorkIdByModuleId(String equipmentSpecialityId) {
        return equipmentSubWorkDao.selectAllSubWorkIdByModuleId(equipmentSpecialityId);
    }
    //根据检查项目ID删除相应的数据
    @Override
    public int deleteEquipmentSubWorkById(String equipmentSubWorkId){
        return equipmentSubWorkDao.deleteEquipmentSubWorkById(equipmentSubWorkId);
    }
    //修改
    @Override
    public int updateEquipmentSubWorkById(String equipmentSubWorkId,
                                          String equipmentSubWorkName){
        return equipmentSubWorkDao.updateEquipmentSubWorkById( equipmentSubWorkId,
                equipmentSubWorkName);
    }
    public EquipmentSubWorkDao getEquipmentSubWorkDao() {
        return this.equipmentSubWorkDao;
    }

    public void setEquipmentSubWorkDao(EquipmentSubWorkDao equipmentSubWorkDao) {
        this.equipmentSubWorkDao = equipmentSubWorkDao;
    }

}