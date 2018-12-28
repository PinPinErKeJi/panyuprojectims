package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaEquipmentNodeDao;
import com.panyu.panyuprojectims.entity.FaEquipmentNode;
import com.panyu.panyuprojectims.service.FaEquipmentNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaEquipmentNodeServiceImpl implements FaEquipmentNodeService{
    @Autowired
    private FaEquipmentNodeDao faEquipmentNodeDao;

    //根据模块ID获取树形菜单ID集合
    @Override
    public List<String> getEquipmentTreeNode(String equipmentSpecialityId) {
        List<String> treeNode = faEquipmentNodeDao.getEquipmentTreeNode(equipmentSpecialityId);
        return treeNode;
    }

    @Override
    public String getFirstEquipmentSpecialityName(String equipmentNodeId) {
        return faEquipmentNodeDao.getFirstEquipmentSpecialityName(equipmentNodeId);
    }

    @Override
    public String getSecondEquipmentNodeName(String id) {
        return faEquipmentNodeDao.getSecondEquipmentNodeName(id);
    }

}