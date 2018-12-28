package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.PowerSupplyNode;
public interface PowerSupplyNodeService{

    //根据TreeNodeID查询子级菜单所属父级的ID集合
    List<String> getPowerSupplyTreeNode(String id);

    //根据节点ID查询一级菜单模块名称
    String getFirstPowerSupplyNodeName(String powerSupplyNodeId);

    //根据节点ID查询二级菜单模块名称
    String getSecondPowerSupplyNodeName(String id);
}