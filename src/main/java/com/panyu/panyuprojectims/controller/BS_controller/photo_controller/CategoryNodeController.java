package com.panyu.panyuprojectims.controller.BS_controller.photo_controller;

import com.panyu.panyuprojectims.entity.TreeNode;
import com.panyu.panyuprojectims.service.CategoryNodeService;
import com.panyu.panyuprojectims.service.ProjectProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("BS")
public class CategoryNodeController {

    @Autowired
    private CategoryNodeService categoryNodeService;
    @Autowired
    private ProjectProgressService projectProgressService;


    @RequestMapping("getTree")
    public @ResponseBody
    List<TreeNode> getTreeNode(String projectProgressId){
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
        //根据站点ID查询所包含的模块ID集合
        //for循环此模块ID集合
        for (String moduleId : projectProgressService.selectModuleId(projectProgressId)) {
            List<String> nodeList = new ArrayList<>();
            //根据模块ID查询子节点ID集合
            String moduleName = categoryNodeService.getModuleName(moduleId);
            nodeList = categoryNodeService.getTreeNode(moduleId);
            //内层for循环此节点ID集合
            List<TreeNode> list = new ArrayList<>();
            for (String id:nodeList){
                String categoryName = categoryNodeService.getCategoryName(id);
                //创建节点对象,set(text),set(id)等节点属性
                TreeNode tree = new TreeNode();
                tree.setId(id);
                tree.setText(categoryName);
                //把此对象放入集合childrenList中
                list.add(tree);
            }
            //在外层for循环创建节点对象,set(text),set(id),set(childrenList)等节点属性
            TreeNode treeNode = new TreeNode();
            treeNode.setId(moduleId);
            treeNode.setText(moduleName);
            treeNode.setChildren(list);
            //zuotian
            //把此对象放入moduleList集合中,并返回此集合
            treeNodeList.add(treeNode);
        }
        return treeNodeList;
    }
}
