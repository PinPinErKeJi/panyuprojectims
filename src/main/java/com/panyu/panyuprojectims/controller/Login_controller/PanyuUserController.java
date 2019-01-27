package com.panyu.panyuprojectims.controller.Login_controller;

import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.entity.ShiroResource;
import com.panyu.panyuprojectims.entity.ShiroRole;
import com.panyu.panyuprojectims.entity.ShiroTreeResource;
import com.panyu.panyuprojectims.service.PanyuUserService;
import com.panyu.panyuprojectims.service.ShiroResourceService;
import com.panyu.panyuprojectims.service.ShiroRoleService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/AM")
public class PanyuUserController {
    @Autowired private PanyuUserService panyuUserService;
    @Autowired private ShiroRoleService shiroRoleService;
    @Autowired private ShiroResourceService shiroResourceService;
    private boolean b;


    //删除功能资源
    @RequestMapping("deleteResource")
    @ResponseBody
    public boolean deleteResource(String id){
        System.out.println("控制类 1  :"+id);
        System.out.println("控制类 2   :"+shiroResourceService.deleteResourceById(id));
        return shiroResourceService.deleteResourceById(id);
    }

    //根据父id查询拥有的资源
    @RequestMapping("selectResourceById")
    @ResponseBody
    public List<ShiroResource> selectResourceById(String parectResourceId) {
        //System.out.println("id:"+parectResourceId);
        //System.out.println("集合:"+shiroResourceService.selectResourceById(parectResourceId));
        return shiroResourceService.selectResourceById(parectResourceId);
    }

    //添加一级菜单
    @RequestMapping("addFirstResource")
    @ResponseBody
    public ShiroResource addFirstResource(ShiroResource resource){

        System.out.println("资源:"+resource);

        ;
        return shiroResourceService.addResource(resource);
    }


    //分页展示权限资源
    @RequestMapping("showAllShiroResource")
    @ResponseBody
    public PageHelperUtil showAllShiroResource(Integer page, Integer rows){
        return shiroResourceService.showAllShiroResource(page,rows);
    }

    //添加角色的时候展示所有的资源
    @RequestMapping("showAllRes")
    public @ResponseBody List<ShiroResource> showAllRes(){
        List<ShiroResource>list=shiroResourceService.queryAllRs();
        return list;
    }

    //根据角色名所拥有的查询资源
    @RequestMapping("showResByRoleName")
    public @ResponseBody List<ShiroResource> showResByRoleName(ShiroRole role){
        //System.out.println("角色:"+role);
        List<ShiroRole> roles=new ArrayList<ShiroRole>();
        roles.add(role);
        return shiroResourceService.selectResourceByRoleName(roles);
    }

    //修改用户
    @RequestMapping("updatePanyuUser")
    public @ResponseBody boolean updatePanyuUser(PanyuUser panyuUser){
        try {
            ByteSource salt = ByteSource.Util.bytes(panyuUser.getUserName());
            String newPs = new SimpleHash("MD5", panyuUser.getUserlogpwd(), salt, 1024).toHex();
            panyuUser.setUserPwd(newPs);
            panyuUserService.updatePanyuuser(panyuUser);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //根据用户名修改角色
    @RequestMapping("updatePanyuUserRole")
    public @ResponseBody boolean updatePanyuUserRole(PanyuUser panyuUser,String[] roleIds){
        try {
            panyuUserService.updatePanyuuserRole(panyuUser,roleIds);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //分页展示角色
    @RequestMapping("showPageRole")
    @ResponseBody
    public PageHelperUtil showPageRole(Integer page, Integer rows) {
        return shiroRoleService.showPageRole(page,rows);
    }

    //修改角色
    @RequestMapping("/updateRole")
    public @ResponseBody boolean updateRole(String[] pIds, String[] sIds, ShiroRole role){
        try {
            shiroRoleService.updateRole(pIds,sIds,role);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //删除角色
    @RequestMapping("deleteRole")
    @ResponseBody
    public boolean deleteRole(String []ids){
        return shiroRoleService.deleteRole(ids);
    }

    //添加角色
    @RequestMapping("addRole")
    @ResponseBody
    public boolean addRole(String roleName,String []ids){
        boolean flag = true;
        try {
            boolean b = shiroRoleService.insertRole(roleName, ids);
            if(b==true){
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return  flag;
    }

    //查询所有的角色
    @RequestMapping("selectAllRole")
    @ResponseBody
    public  List<ShiroTreeResource> showAllRoles(){
        List<ShiroTreeResource> trees=new ArrayList<ShiroTreeResource>();
        Map<String,Object> map=shiroRoleService.selectAllRole();
        List<ShiroRole> roles=(List<ShiroRole>)map.get("rows");
        for (ShiroRole role:roles) {
            ShiroTreeResource tree=new ShiroTreeResource();
            tree.setId(role.getRoleId());
            tree.setText(role.getRoleName());
            trees.add(tree);
        }
        return trees;
    }

    //查询用户拥有的角色
    @RequestMapping("selectAllRoleByUserName")
    @ResponseBody
    public List<ShiroRole> selectAllRoleByUserName(String userName){
        return shiroRoleService.selectRoleByUserName(userName);
    }

    //删除用户
    @RequestMapping("/deletePanyuUser")
    @ResponseBody
    public boolean deletePanyuUser(String[] ids){
        try {
            panyuUserService.deletePanyuUser(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //添加用户
    @RequestMapping("/addPanyuUser")
    @ResponseBody
    public  boolean addPanyuUser(String userName, String userPwd, String userlogpwd,String userTel, String userEmail){
        ByteSource salt = ByteSource.Util.bytes(userName);
        String newPs = new SimpleHash("MD5", userlogpwd, salt, 1024).toHex();
        return  panyuUserService.addPanyuUser(userName,newPs,userlogpwd,userTel,userEmail);
    }



    //分页展示用户
    @RequestMapping("queryAllPanyuUser")
    @ResponseBody
    public PageHelperUtil queryAllPanyuUser(Integer page, Integer rows,String userName) {
        System.out.println("名字:"+userName);
        return panyuUserService.queryAllPanyuUser(page,rows,userName);
    }
}
