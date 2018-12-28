package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.LlCircuitNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface LlCircuitNodeDao{

    //根据treenode的id查询子级菜单的父级id
    List<String> selectCircuitTreeNode(@Param("id") String id);

    //根据节点id查询一级菜单对应的模块名
    String selectFirstCircuitName(@Param("circuitNodeId") String circuitNodeId);

    //根据节点id查询二级菜单对应的分型工程名
    String selectSecondSubWorkName(@Param("id") String id);
}