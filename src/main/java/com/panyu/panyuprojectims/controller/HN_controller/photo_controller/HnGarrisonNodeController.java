package com.panyu.panyuprojectims.controller.HN_controller.photo_controller;

import com.panyu.panyuprojectims.entity.TreeNode;
import com.panyu.panyuprojectims.service.HnGarrisonInformationService;
import com.panyu.panyuprojectims.service.HnGarrisonNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("HN")
public class HnGarrisonNodeController {

    @Autowired
    private HnGarrisonNodeService hnGarrisonNodeService;
    @Autowired
    private HnGarrisonInformationService hnGarrisonInformationService;

    @RequestMapping("getGarrisonTreeNode")
    public @ResponseBody
    List<TreeNode> getGarrisonTreeNode(String garrisonInformationId){
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
        //根据站点ID查询所包含的模块ID集合，并for循环此模块ID集合
        for (String garrisonId : hnGarrisonInformationService.selectGarrisonIdList(garrisonInformationId)) {
            List<String> nodeList = new ArrayList<>();
            //根据模块ID查询出父级菜单名称
            String garrisonName = hnGarrisonNodeService.selectFirstGarrisonName(garrisonId);
            //根据模块ID查询子节点ID集合
            nodeList = hnGarrisonNodeService.getGarrisonTreeNode(garrisonId);
            //内层for循环此节点ID集合
            List<TreeNode> list = new ArrayList<>();
            for (String id:nodeList){
                //根据内层循环的ID查询二级菜单名称
                String garrisonNodeName = hnGarrisonNodeService.selectSecondGarrisonName(id);
                //创建节点对象,set(text),set(id)等节点属性
                TreeNode treeNode = new TreeNode();
                treeNode.setId(id);
                treeNode.setText(garrisonNodeName);
                list.add(treeNode);
            }
            //在外层for循环创建节点对象,set(text),set(id),set(childrenList)等节点属性
            TreeNode node = new TreeNode();
            node.setId(garrisonId);
            node.setText(garrisonName);
            node.setChildren(list);
            treeNodeList.add(node);
        }
        return treeNodeList;
    }
}
