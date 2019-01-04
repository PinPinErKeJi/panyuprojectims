package com.panyu.panyuprojectims.controller.FA_controller.photo_controller;

import com.panyu.panyuprojectims.entity.TreeNode;
import com.panyu.panyuprojectims.service.FaEquipmentInformationService;
import com.panyu.panyuprojectims.service.FaEquipmentNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("FA")
public class FaEquipmentNodeController {

    @Autowired
    private FaEquipmentNodeService faEquipmentNodeService;
    @Autowired
    private FaEquipmentInformationService faEquipmentInformationService;

    @RequestMapping("getEquipmentTreeNode")
    public @ResponseBody
    List<TreeNode> getTreeNode(String equipmentInformationId){
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
        //根据站点ID查询所包含的模块ID集合，并for循环此模块ID集合
        for (String equipmentSpecialityId : faEquipmentInformationService.selectEquipmentSpecialityId(equipmentInformationId)) {
            List<String> nodeList = new ArrayList<>();
            //根据模块ID查询出父级菜单名称
            String equipmentSpecialityName = faEquipmentNodeService.getFirstEquipmentSpecialityName(equipmentSpecialityId);
            //根据模块ID查询子节点ID集合
            nodeList = faEquipmentNodeService.getEquipmentTreeNode(equipmentSpecialityId);
            //内层for循环此节点ID集合
            List<TreeNode> list = new ArrayList<>();
            for (String id:nodeList){
                //根据内层循环的ID查询二级菜单名称
                String equipmentNodeName = faEquipmentNodeService.getSecondEquipmentNodeName(id);
                //创建节点对象,set(text),set(id)等节点属性
                TreeNode treeNode = new TreeNode();
                treeNode.setId(id);
                treeNode.setText(equipmentNodeName);
                list.add(treeNode);
            }
            //在外层for循环创建节点对象,set(text),set(id),set(childrenList)等节点属性
            TreeNode node = new TreeNode();
            node.setId(equipmentSpecialityId);
            node.setText(equipmentSpecialityName);
            node.setChildren(list);
            //把此对象放入moduleList集合中,并返回此集合
            treeNodeList.add(node);
        }
        return treeNodeList;
    }
}
