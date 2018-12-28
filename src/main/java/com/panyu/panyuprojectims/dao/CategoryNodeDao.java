package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.CategoryNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CategoryNodeDao{
    //查询展示子级树形菜单数据
    List<String> getSonTreeNode(@Param("id") String id);

    //根据模块ID查询模块名称
    String getModuleName(@Param("categoryId") String categoryId);

    //根据模块ID查询模块名称
    String getCategoryName(@Param("id") String id);



}