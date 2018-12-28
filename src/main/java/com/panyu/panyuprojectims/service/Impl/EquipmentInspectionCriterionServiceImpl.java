package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.EquipmentInspectionCriterionDao;
import com.panyu.panyuprojectims.entity.EquipmentInspectionCriterion;
import com.panyu.panyuprojectims.service.EquipmentInspectionCriterionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EquipmentInspectionCriterionServiceImpl implements EquipmentInspectionCriterionService{
    @Autowired
    private EquipmentInspectionCriterionDao equipmentInspectionCriterionDao;

    //根据标准规范id和内容查询对象
    @Override
    public EquipmentInspectionCriterion getEquipmentInspectionCriterion(String equipmentCriterionId, String equipmentCriterionName) {
        return equipmentInspectionCriterionDao.getEquipmentInspectionCriterion(equipmentCriterionId,equipmentCriterionName);
    }

    //添加
    @Override
    public EquipmentInspectionCriterion addEquipmentInspectionCriterion(String equipmentCriterionName, String equipmentProjectId) {
        int count = equipmentInspectionCriterionDao.getCountByEquipmentCriterionName(equipmentCriterionName, equipmentProjectId);
        if (count==0){
            int i = equipmentInspectionCriterionDao.insertEquipmentInspectionCriterion(equipmentCriterionName, equipmentProjectId);
        }
        EquipmentInspectionCriterion equipmentInspectionCriterion = equipmentInspectionCriterionDao.selectInspectionCriterionByCriterionName(equipmentCriterionName, equipmentProjectId);
        return equipmentInspectionCriterion;
    }

    @Override
    public long getEquipmentInspectionCriterionRowCount(){
        return equipmentInspectionCriterionDao.getEquipmentInspectionCriterionRowCount();
    }
    @Override
    public List<EquipmentInspectionCriterion> selectEquipmentInspectionCriterion(){
        return equipmentInspectionCriterionDao.selectEquipmentInspectionCriterion();
    }
    @Override
    public EquipmentInspectionCriterion selectEquipmentInspectionCriterionById(String id){
        return equipmentInspectionCriterionDao.selectEquipmentInspectionCriterionById(id);
    }
    //根据名字查询个数

    //根据检查项目ID查询标准规范
    @Override
    public List<EquipmentInspectionCriterion> selectEquipmentInspectionCriterionByEquipmentProjectId(String equipmentProjectId) {
        return equipmentInspectionCriterionDao.selectEquipmentInspectionCriterionByEquipmentProjectId(equipmentProjectId);
    }

    //根据检查项目ID查询出所有相应的标准规范ID
    @Override
    public String selectAllEquipmentCriterionIdByProjectId(String equipmentProjectId) {
        return equipmentInspectionCriterionDao.selectAllEquipmentCriterionIdByProjectId(equipmentProjectId);
    }
    //根据标准规范ID删除相应的数据
    @Override
    public int deleteEquipmentInspectionCriterionById(String equipmentCriterionId){
        return equipmentInspectionCriterionDao.deleteEquipmentInspectionCriterionById(equipmentCriterionId);
    }
    //修改
    @Override
    public int updateEquipmentInspectionCriterionById(String equipmentCriterionId,
                                                      String equipmentCriterionName){
        return equipmentInspectionCriterionDao.updateEquipmentInspectionCriterionById( equipmentCriterionId,
                equipmentCriterionName);
    }
    public EquipmentInspectionCriterionDao getEquipmentInspectionCriterionDao() {
        return this.equipmentInspectionCriterionDao;
    }
    public void setEquipmentInspectionCriterionDao(EquipmentInspectionCriterionDao equipmentInspectionCriterionDao) {
        this.equipmentInspectionCriterionDao = equipmentInspectionCriterionDao;
    }

}