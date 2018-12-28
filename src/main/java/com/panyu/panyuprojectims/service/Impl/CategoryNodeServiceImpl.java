package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.CategoryNodeDao;
import com.panyu.panyuprojectims.entity.CategoryNode;
import com.panyu.panyuprojectims.entity.TreeNode;
import com.panyu.panyuprojectims.service.CategoryNodeService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryNodeServiceImpl implements CategoryNodeService{
    @Autowired
    private CategoryNodeDao categoryNodeDao;

    @Override
    public List<String> getTreeNode(String moduleId) {
        List<String> sonTreeNode = categoryNodeDao.getSonTreeNode(moduleId);
        return sonTreeNode;
    }

    @Override
    public String getModuleName(String categoryId) {
        return categoryNodeDao.getModuleName(categoryId);
    }

    @Override
    public String getCategoryName(String id) {
        return categoryNodeDao.getCategoryName(id);
    }


}