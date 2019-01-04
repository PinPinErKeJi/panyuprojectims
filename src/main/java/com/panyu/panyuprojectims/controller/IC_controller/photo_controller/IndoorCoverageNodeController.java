package com.panyu.panyuprojectims.controller.IC_controller.photo_controller;

import com.panyu.panyuprojectims.entity.TreeNode;
import com.panyu.panyuprojectims.service.IndoorCoverageInformationService;
import com.panyu.panyuprojectims.service.IndoorCoverageNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("IC")
public class IndoorCoverageNodeController {

    @Autowired
    private IndoorCoverageNodeService indoorCoverageNodeService;
    @Autowired
    private IndoorCoverageInformationService indoorCoverageInformationService;

    @RequestMapping("getIndoorCoverageNode")
    public @ResponseBody
    List<TreeNode> getIndoorCoverageNode(String indoorInformationId){
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
        for (String indoorCoverageId : indoorCoverageInformationService.selectIndoorCoverageIdList(indoorInformationId)) {
            List<String> nodeList = new ArrayList<>();
            //根据模块ID查询出父级菜单名称
            String indoorCoverageName = indoorCoverageNodeService.selectAllFirstIndoorCoverageModuleName(indoorCoverageId);
            //根据模块ID查询子节点ID集合
            nodeList = indoorCoverageNodeService.getIndoorCoverageNode(indoorCoverageId);
            //内层for循环此节点ID集合
            List<TreeNode> list = new ArrayList<>();
            for (String id:nodeList){
                //根据内层循环的ID查询二级菜单名称
                String indoorCoverageNodeName = indoorCoverageNodeService.selectSecondIndoorCoverageNodeName(id);
                //创建节点对象,set(text),set(id)等节点属性
                TreeNode treeNode = new TreeNode();
                treeNode.setId(id);
                treeNode.setText(indoorCoverageNodeName);
                list.add(treeNode);
            }
            //在外层for循环创建节点对象,set(text),set(id),set(childrenList)等节点属性
            TreeNode node = new TreeNode();
            node.setId(indoorCoverageId);
            node.setText(indoorCoverageName);
            node.setChildren(list);
            //把此对象放入moduleList集合中,并返回此集合
            treeNodeList.add(node);
        }
        return treeNodeList;
    }
}
