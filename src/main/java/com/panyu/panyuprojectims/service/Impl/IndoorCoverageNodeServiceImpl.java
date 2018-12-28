package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.IndoorCoverageNodeDao;
import com.panyu.panyuprojectims.service.IndoorCoverageNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndoorCoverageNodeServiceImpl implements IndoorCoverageNodeService{
    @Autowired
    private IndoorCoverageNodeDao indoorCoverageNodeDao;

    //根据模块ID获取树形菜单ID集合
    @Override
    public List<String> getIndoorCoverageNode(String indoorCoverageId) {
        List<String> indoorCoverageNode = indoorCoverageNodeDao.getIndoorCoverageNode(indoorCoverageId);
        return indoorCoverageNode;
    }
    //根据节点ID查询一级菜单模块名称
    @Override
    public String selectAllFirstIndoorCoverageModuleName(String indoorNodeId) {
        return indoorCoverageNodeDao.selectAllFirstIndoorCoverageModuleName(indoorNodeId);
    }
    //根据节点ID查询二级菜单模块名称
    @Override
    public String selectSecondIndoorCoverageNodeName(String id) {
        return indoorCoverageNodeDao.selectSecondIndoorCoverageNodeName(id);
    }
}