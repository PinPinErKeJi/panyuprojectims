package com.panyu.panyuprojectims.controller.LL_controller.photo_controller;

import com.panyu.panyuprojectims.entity.TreeNode;
import com.panyu.panyuprojectims.service.LlCircuitInformationService;
import com.panyu.panyuprojectims.service.LlCircuitNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("LL")
public class LlCircuitNodeController {
    @Autowired private LlCircuitNodeService llCircuitNodeService;
    @Autowired
    private LlCircuitInformationService llCircuitInformationService;


    //属性菜单展示
    @RequestMapping("getCircuitNode")
    public @ResponseBody
    List<TreeNode> getCircuitNode(String circuitInformationId){
        List<TreeNode> treeNodeList = new ArrayList<>();
            //根据信息id查询信息数据中包含的模块id
        for (String circuitModuleId : llCircuitInformationService.selectCircuitModuleIdList(circuitInformationId)) {
            //一级菜单名字集合
            List<String> nodeList = new ArrayList<>();
            String circuitName = llCircuitNodeService.selectFirstCircuitName(circuitModuleId);
            nodeList = llCircuitNodeService.selectCircuitTreeNode(circuitModuleId);
            //内层for循环此节点ID集合
            List<TreeNode> list = new ArrayList<>();
            for (String id:nodeList) {
                String subWorkName= llCircuitNodeService.selectSecondSubWorkName(id);
                //创建节点对象,set(text),set(id)等节点属性
                TreeNode treeNode = new TreeNode();
                treeNode.setId(id);
                treeNode.setText(subWorkName);
                list.add(treeNode);
            }
            //在外层for循环创建节点对象
            TreeNode treeNode = new TreeNode();
            treeNode.setId(circuitModuleId);
            treeNode.setText(circuitName);
            treeNode.setChildren(list);
            treeNodeList.add(treeNode);
            }
        return treeNodeList;
    }
}
