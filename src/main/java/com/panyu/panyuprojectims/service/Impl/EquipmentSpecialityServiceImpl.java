package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.EquipmentSpecialityDao;
import com.panyu.panyuprojectims.entity.EquipmentSpeciality;
import com.panyu.panyuprojectims.service.EquipmentSpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EquipmentSpecialityServiceImpl implements EquipmentSpecialityService{
    @Autowired
    private EquipmentSpecialityDao equipmentSpecialityDao;

    //根据名称查询返回对象
    @Override
    public EquipmentSpeciality selectEquipmentSpecialityBySpecialityName(String equipmentSpecialityName) {
        return equipmentSpecialityDao.selectEquipmentSpecialityBySpecialityName(equipmentSpecialityName);
    }

    //添加
    public EquipmentSpeciality addEquipmentSpeciality(String equipmentSpecialityName){
        int count = equipmentSpecialityDao.getCountByEquipmentSpecialityName(equipmentSpecialityName);
        if (count==0){
            int i = equipmentSpecialityDao.insertEquipmentSpeciality(equipmentSpecialityName);
        }
        EquipmentSpeciality equipmentSpeciality = equipmentSpecialityDao.selectEquipmentSpecialityBySpecialityName(equipmentSpecialityName);
        return equipmentSpeciality;
    }


    //查询下拉框所有模块名称
    @Override
    public long getEquipmentSpecialityRowCount(){
        return equipmentSpecialityDao.getEquipmentSpecialityRowCount();
    }
    @Override
    public List<EquipmentSpeciality> selectEquipmentSpeciality(){
        return equipmentSpecialityDao.selectEquipmentSpeciality();
    }
    @Override
    public EquipmentSpeciality selectEquipmentSpecialityById(String id){
        return equipmentSpecialityDao.selectEquipmentSpecialityById(id);
    }
    //修改
    @Override
    public int updateEquipmentSpecialityById(String equipmentSpecialityId,
                                             String equipmentSpecialityName){
        return equipmentSpecialityDao.updateEquipmentSpecialityById(equipmentSpecialityId,
                equipmentSpecialityName);
    }

    //根据模块ID删除相应数据
    @Override
    public int deleteEquipmentSpecialityById(String equipmentSpecialityId){
        return equipmentSpecialityDao.deleteEquipmentSpecialityById(equipmentSpecialityId);
    }

    public EquipmentSpecialityDao getEquipmentSpecialityDao() {
        return this.equipmentSpecialityDao;
    }

    public void setEquipmentSpecialityDao(EquipmentSpecialityDao equipmentSpecialityDao) {
        this.equipmentSpecialityDao = equipmentSpecialityDao;
    }

}