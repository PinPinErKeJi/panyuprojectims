package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.FaEquipmentNode;

import java.util.List;
public interface FaEquipmentNodeService{

    //根据模块ID获取树形菜单ID集合
    List<String> getEquipmentTreeNode(String equipmentSpecialityId);

    //根据节点ID获取一级菜单名称
    String getFirstEquipmentSpecialityName(String equipmentNodeId);

    //根据节点ID获取二级菜单名称
    String getSecondEquipmentNodeName(String id);

}