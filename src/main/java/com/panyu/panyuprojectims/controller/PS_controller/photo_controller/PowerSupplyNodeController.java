package com.panyu.panyuprojectims.controller.PS_controller.photo_controller;

import com.panyu.panyuprojectims.entity.TreeNode;
import com.panyu.panyuprojectims.service.PowerSupplyInformationService;
import com.panyu.panyuprojectims.service.PowerSupplyNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("PS")
public class PowerSupplyNodeController {
    @Autowired private PowerSupplyNodeService powerSupplyNodeService;
    @Autowired private PowerSupplyInformationService powerSupplyInformationService;

    //树形菜单展示
    @RequestMapping("getPowerSupplyTreeNode")
    public @ResponseBody
    List<TreeNode> getPowerSupplyTreeNode(String powerInformationId) {
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
        for (String moduleId : powerSupplyInformationService.selectPowerModuleIdList(powerInformationId)) {
            List<String> nodeList = new ArrayList<>();
            String firstPowerSupplyNodeName = powerSupplyNodeService.getFirstPowerSupplyNodeName(moduleId);
            nodeList = powerSupplyNodeService.getPowerSupplyTreeNode(moduleId);
            List<TreeNode> list = new ArrayList<>();
            for (String id : nodeList) {
                String secondPowerSupplyNodeName = powerSupplyNodeService.getSecondPowerSupplyNodeName(id);
                TreeNode tree = new TreeNode();
                tree.setId(id);
                tree.setText(secondPowerSupplyNodeName);
                list.add(tree);
            }
            TreeNode treeNode = new TreeNode();
            treeNode.setId(moduleId);
            treeNode.setText(firstPowerSupplyNodeName);
            treeNode.setChildren(list);
            treeNodeList.add(treeNode);
        }
        return  treeNodeList;
    }
}
