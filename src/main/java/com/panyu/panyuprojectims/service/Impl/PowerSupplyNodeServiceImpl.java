package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.PowerSupplyNodeDao;
import com.panyu.panyuprojectims.entity.PowerSupplyNode;
import com.panyu.panyuprojectims.service.PowerSupplyNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PowerSupplyNodeServiceImpl implements PowerSupplyNodeService{
    @Autowired
    private PowerSupplyNodeDao powerSupplyNodeDao;


    //根据TreeNodeID查询子级菜单所属父级的ID集合
    @Override
    public List<String> getPowerSupplyTreeNode(String id) {
        return powerSupplyNodeDao.getPowerSupplyTreeNode(id);
    }

    //根据节点ID查询一级菜单模块名称
    @Override
    public String getFirstPowerSupplyNodeName(String powerSupplyNodeId) {
        return powerSupplyNodeDao.getFirstPowerSupplyNodeName(powerSupplyNodeId);
    }

    //根据节点ID查询二级菜单模块名称
    @Override
    public String getSecondPowerSupplyNodeName(String id) {
        return powerSupplyNodeDao.getFirstPowerSupplyNodeName(id);
    }
}