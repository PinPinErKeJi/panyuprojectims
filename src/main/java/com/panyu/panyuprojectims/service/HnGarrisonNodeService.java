package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.HnGarrisonNode;
public interface HnGarrisonNodeService{
    //根据TreeNodeID查询子级菜单所属父级的ID集合
    List<String> getGarrisonTreeNode(String garrisonId);
    //根据节点ID查询一级菜单模块名称
    String selectFirstGarrisonName(String garrisonNodeId);
    //根据节点ID查询二级菜单模块名称
    String selectSecondGarrisonName(String id);
}