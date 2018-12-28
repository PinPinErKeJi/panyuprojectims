package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.LlCircuitNodeDao;
import com.panyu.panyuprojectims.entity.LlCircuitNode;
import com.panyu.panyuprojectims.service.LlCircuitNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LlCircuitNodeServiceImpl implements LlCircuitNodeService{
    @Autowired
    private LlCircuitNodeDao llCircuitNodeDao;


    //根据treenode的id查询子级菜单的父级id
    @Override
    public List<String> selectCircuitTreeNode(String id) {
        return llCircuitNodeDao.selectCircuitTreeNode(id);
    }

    //根据节点id查询一级菜单对应的模块名
    @Override
    public String selectFirstCircuitName(String circuitNodeId) {
        return llCircuitNodeDao.selectFirstCircuitName(circuitNodeId);
    }

    //根据节点id查询二级菜单对应的分型工程名
    @Override
    public String selectSecondSubWorkName(String id) {
        return llCircuitNodeDao.selectSecondSubWorkName(id);
    }
}