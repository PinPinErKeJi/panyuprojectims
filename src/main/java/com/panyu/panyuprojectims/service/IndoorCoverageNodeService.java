package com.panyu.panyuprojectims.service;

import java.util.List;

public interface IndoorCoverageNodeService{

    //根据模块ID获取树形菜单ID集合
    List<String> getIndoorCoverageNode(String indoorCoverageId);
    //根据节点ID查询一级菜单模块名称
    String selectAllFirstIndoorCoverageModuleName(String indoorNodeId);
    //根据节点ID查询二级菜单模块名称
    String selectSecondIndoorCoverageNodeName(String id);
}