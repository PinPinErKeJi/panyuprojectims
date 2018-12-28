package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnGarrisonNodeDao;
import com.panyu.panyuprojectims.entity.HnGarrisonNode;
import com.panyu.panyuprojectims.service.HnGarrisonNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnGarrisonNodeServiceImpl implements HnGarrisonNodeService{
    @Autowired
    private HnGarrisonNodeDao hnGarrisonNodeDao;

    //根据TreeNodeID查询子级菜单所属父级的ID集合
    @Override
    public List<String> getGarrisonTreeNode(String garrisonId) {
        return hnGarrisonNodeDao.getGarrisonTreeNode(garrisonId);
    }
    //根据节点ID查询一级菜单模块名称
    @Override
    public String selectFirstGarrisonName(String garrisonNodeId) {
        return hnGarrisonNodeDao.selectFirstGarrisonName(garrisonNodeId);
    }
    //根据节点ID查询二级菜单模块名称
    @Override
    public String selectSecondGarrisonName(String id) {
        return hnGarrisonNodeDao.selectSecondGarrisonName(id);
    }
}