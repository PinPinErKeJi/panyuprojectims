package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaEquipmentNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaEquipmentNodeDao{
    //根据TreeNodeID查询子级菜单所属父级的ID集合
	List<String> getEquipmentTreeNode(@Param("id") String id);

    //根据节点ID查询一级菜单模块名称
    String getFirstEquipmentSpecialityName(@Param("equipmentNodeId") String equipmentNodeId);

    //根据节点ID查询二级菜单模块名称
    String getSecondEquipmentNodeName(@Param("id") String id);

}