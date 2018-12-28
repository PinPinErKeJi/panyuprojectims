package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.HnGarrisonNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HnGarrisonNodeDao{
    //根据TreeNodeID查询子级菜单所属父级的ID集合
    List<String> getGarrisonTreeNode(@Param("id") String id);
    //根据节点ID查询一级菜单模块名称
    String selectFirstGarrisonName(@Param("garrisonNodeId") String garrisonNodeId);
    //根据节点ID查询二级菜单模块名称
    String selectSecondGarrisonName(@Param("id") String id);
}