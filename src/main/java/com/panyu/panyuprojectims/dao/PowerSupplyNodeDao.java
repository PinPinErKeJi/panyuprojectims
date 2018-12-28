package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PowerSupplyNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PowerSupplyNodeDao{

    //根据TreeNodeID查询子级菜单所属父级的ID集合
    List<String> getPowerSupplyTreeNode(@Param("id") String id);

    //根据节点ID查询一级菜单模块名称
    String getFirstPowerSupplyNodeName(@Param("powerSupplyNodeId") String powerSupplyNodeId);

    //根据节点ID查询二级菜单模块名称
    String getSecondPowerSupplyNodeName(@Param("id") String id);
}