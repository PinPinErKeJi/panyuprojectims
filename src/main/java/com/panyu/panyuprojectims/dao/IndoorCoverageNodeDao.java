package com.panyu.panyuprojectims.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IndoorCoverageNodeDao{

    //根据TreeNodeID查询子级菜单所属父级的ID集合
    List<String> getIndoorCoverageNode(@Param("id") String id);
    //根据节点ID查询一级菜单模块名称
    String selectAllFirstIndoorCoverageModuleName(@Param("indoorNodeId") String indoorNodeId);
    //根据节点ID查询二级菜单模块名称
    String selectSecondIndoorCoverageNodeName(@Param("id") String id);
}