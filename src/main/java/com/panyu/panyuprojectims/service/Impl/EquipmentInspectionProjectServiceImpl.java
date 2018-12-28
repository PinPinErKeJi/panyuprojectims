package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.EquipmentInspectionProjectDao;
import com.panyu.panyuprojectims.entity.EquipmentInspectionProject;
import com.panyu.panyuprojectims.service.EquipmentInspectionProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EquipmentInspectionProjectServiceImpl implements EquipmentInspectionProjectService{
    @Autowired
    private EquipmentInspectionProjectDao equipmentInspectionProjectDao;

    //根据检查项目id和名字查询对象
    @Override
    public EquipmentInspectionProject getEquipmentInspectionProject(String equipmentProjectId, String equipmentProjectName) {
        return equipmentInspectionProjectDao.getEquipmentInspectionProject(equipmentProjectId,equipmentProjectName);
    }

    //添加
    @Override
    public EquipmentInspectionProject addEquipmentInspectionProject(String equipmentProjectName, String equipmentSubWorkId) {
        int count = equipmentInspectionProjectDao.getCountByEquipmentProjectName(equipmentProjectName, equipmentSubWorkId);
        if (count==0){
            int i = equipmentInspectionProjectDao.insertEquipmentInspectionProject(equipmentProjectName, equipmentSubWorkId);
        }
        EquipmentInspectionProject equipmentInspectionProject = equipmentInspectionProjectDao.selectEquipmentInspectionProjectByProjectName(equipmentProjectName, equipmentSubWorkId);
        return equipmentInspectionProject;

    }


    @Override
    public EquipmentInspectionProject selectEquipmentInspectionProjectByName(String equipmentProjectId) {
        return equipmentInspectionProjectDao.selectEquipmentInspectionProjectByName(equipmentProjectId);
    }

    //根据分项工程ID查询检查项目
    @Override
    public List<EquipmentInspectionProject> selectEquipmentInspectionProjectByEquipmentSubWorkId(String equipmentSubWorkId) {
        return equipmentInspectionProjectDao.selectEquipmentInspectionProjectByEquipmentSubWorkId(equipmentSubWorkId);
    }

    //根据检查项目ID查询出所有相应的标准规范ID
    @Override
    public List<String> selectAllEquipmentProjectIdBySubWorkId(String equipmentSubWorkId) {
        return equipmentInspectionProjectDao.selectAllEquipmentProjectIdBySubWorkId(equipmentSubWorkId);
    }
    //根据检查项目ID删除相应检查项目数据的同时删除对应的标准规范数据
    @Override
    public int deleteEquipmentInspectionProjectById(String equipmentProjectId){
        return equipmentInspectionProjectDao.deleteEquipmentInspectionProjectById(equipmentProjectId);
    }
    //修改
    @Override
    public int updateEquipmentInspectionProjectById(String equipmentProjectId,
                                                    String equipmentProjectName){
        return equipmentInspectionProjectDao.updateEquipmentInspectionProjectById(equipmentProjectId,
                equipmentProjectName);
    }

    public EquipmentInspectionProjectDao getEquipmentInspectionProjectDao() {
        return this.equipmentInspectionProjectDao;
    }

    public void setEquipmentInspectionProjectDao(EquipmentInspectionProjectDao equipmentInspectionProjectDao) {
        this.equipmentInspectionProjectDao = equipmentInspectionProjectDao;
    }

}