package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.LlCircuitNode;
public interface LlCircuitNodeService{

    //根据treenode的id查询子级菜单的父级id
    List<String> selectCircuitTreeNode(String id);

    //根据节点id查询一级菜单对应的模块名
    String selectFirstCircuitName(String circuitNodeId);

    //根据节点id查询二级菜单对应的分型工程名
    String selectSecondSubWorkName(String id);


}