package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.CategoryNode;

import java.util.List;

public interface CategoryNodeService{

	//查询展示树形菜单数据
    List<String> getTreeNode(String moduleId);

    //根据模块ID查询模块名称
    String getModuleName(String categoryId);

    //根据模块ID查询模块名称
    String getCategoryName(String id);

}