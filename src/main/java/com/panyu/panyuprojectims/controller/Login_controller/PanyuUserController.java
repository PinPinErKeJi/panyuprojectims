package com.panyu.panyuprojectims.controller.Login_controller;

import com.panyu.panyuprojectims.controller.SE_controller.NetState;
import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.entity.ShiroResource;
import com.panyu.panyuprojectims.entity.ShiroRole;
import com.panyu.panyuprojectims.entity.ShiroTreeResource;
import com.panyu.panyuprojectims.model.ResponseResult;
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

import java.io.IOException;
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

    //页面跳转BS
    @RequestMapping("skip1")
    public static String skip1(){
        return "BS/BS-module-repository";
    }
    @RequestMapping("skip2")
    public static String skip2(){
        return "BS/BS-project-message";
    }
    @RequestMapping("skip3")
    public static String skip3(){
        return "BS/BS-photo-message";
    }
    @RequestMapping("skip4")
    public static String skip4(){
        return "BS/BS-dataAdd-get";
    }
    @RequestMapping("skip5")
    public static String skip5(){
        return "BS/BS-picture-repository";
    }
    @RequestMapping("skip6")
    public static String skip6(){
        return "BS/BS-project-plan-message";
    }
    //页面跳转FA
    @RequestMapping("skip7")
    public static String skip7(){
        return "FA/FA-module-repository";
    }
    @RequestMapping("skip8")
    public static String skip8(){
        return "FA/FA-project-message";
    }
    @RequestMapping("skip9")
    public static String skip9(){
        return "FA/FA-project-plan-message";
    }
    @RequestMapping("skip10")
    public static String skip10(){
        return "FA/FA-dataAdd-get";
    }
    @RequestMapping("skip11")
    public static String skip11(){
        return "FA/FA-picture-repository";
    }
    @RequestMapping("skip12")
    public static String skip12(){
        return "FA/FA-photo-message";
    }
    @RequestMapping("skip13")
    public static String skip13(){
        return "FA/FA-AOG-message";
    }
    //页面跳转HN
    @RequestMapping("skip14")
    public static String skip14(){
        return "HN/HN-module-repository";
    }
    @RequestMapping("skip15")
    public static String skip15(){
        return "HN/HN-project-message";
    }
    @RequestMapping("skip16")
    public static String skip16(){
        return "HN/HN-photo-message";
    }
    @RequestMapping("skip17")
    public static String skip17(){
        return "HN/HN-dataAdd-get";
    }
    @RequestMapping("skip18")
    public static String skip18(){
        return "HN/HN-picture-repository";
    }
    @RequestMapping("skip19")
    public static String skip19(){
        return "HN/HN-project-plan-message";
    }
    //室内覆盖IC
    @RequestMapping("skip20")
    public static String skip20(){
        return "IC/IC-module-repository";
    }
    @RequestMapping("skip21")
    public static String skip21(){
        return "IC/IC-project-message";
    }
    @RequestMapping("skip22")
    public static String skip22(){
        return "IC/IC-photo-message";
    }
    @RequestMapping("skip23")
    public static String skip23(){
        System.out.println("controller");
        return "IC/IC-dataAdd-get";
    }
    @RequestMapping("skip24")
    public static String skip24(){
        return "IC/IC-picture-repository";
    }
    @RequestMapping("skip25")
    public static String skip25(){
        return "IC/IC-project-plan-message";
    }
    //线路LL
    @RequestMapping("skip26")
    public static String skip26(){
        return "LL/LL-module-repository";
    }
    @RequestMapping("skip27")
    public static String skip27(){
        return "LL/LL-project-message";
    }
    @RequestMapping("skip28")
    public static String skip28(){
        return "LL/LL-photo-message";
    }
    @RequestMapping("skip29")
    public static String skip29(){
        return "LL/LL-dataAdd-get";
    }
    @RequestMapping("skip30")
    public static String skip30(){
        return "LL/LL-picture-repository";
    }
    @RequestMapping("skip31")
    public static String skip31(){
        return "LL/LL-project-plan-message";
    }
    //电源PS
    @RequestMapping("skip32")
    public static String skip32(){
        return "PS/PS-module-repository";
    }
    @RequestMapping("skip33")
    public static String skip33(){
        return "PS/PS-project-message";
    }
    @RequestMapping("skip34")
    public static String skip34(){
        return "PS/PS-project-plan-message";
    }
    @RequestMapping("skip35")
    public static String skip35(){
        return "PS/PS-photo-message";
    }
    @RequestMapping("skip36")
    public static String skip36(){
        return "PS/PS-dataAdd-get";
    }
    @RequestMapping("skip37")
    public static String skip37(){
        return "PS/PS-picture-repository";
    }
    @RequestMapping("skip38")
    public static String skip38(){
        return "PS/PS-AOG-message";
    }
    //权限管理AM
    @RequestMapping("skip39")
    public static String skip39(){
        return "AM/AM-limit";
    }
    @RequestMapping("skip40")
    public static String skip40(){
        return "AM/AM-user";
    }
    @RequestMapping("skip41")
    public static String skip41(){
        return "AM/AM-role";
    }
    @RequestMapping("skip42")
    public static String skip42(){
        return "AM/AM-userinfo";
    }

    //跳转我的桌面
    @RequestMapping("skip43")
    public static String skip43(){
        return "AM/welcome";
    }


    //跳转主页面
    @RequestMapping("skip")
    public static String skip(){
        return "index";
    }

    //删除功能资源
    @RequestMapping("deleteResource")
    @ResponseBody
    public boolean deleteResource(String id){
        return shiroResourceService.deleteResourceById(id);
    }

    //根据父id查询拥有的资源
    @RequestMapping("selectResourceById")
    @ResponseBody
    public List<ShiroResource> selectResourceById(String parectResourceId) {
        return shiroResourceService.selectResourceById(parectResourceId);
    }

    //添加一级菜单
    @RequestMapping("addFirstResource")
    @ResponseBody
    public ShiroResource addFirstResource(ShiroResource resource){

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
        return panyuUserService.queryAllPanyuUser(page,rows,userName);
    }

    //判断邮箱是否存在
    @RequestMapping("selectEmailByUserEmail")
    @ResponseBody
    public ResponseResult selectEmailByUserEmail(String userEmail) throws IOException {
        ResponseResult responseResult = new ResponseResult();
        NetState netState = new NetState();
        boolean connect = netState.isConnect();
        if (connect == true) {
            String email = panyuUserService.selectEmailByUserEmail(userEmail);
            if (email!=null&&userEmail.equals(email)) {
                responseResult.setEmail(email);
            } else {
                responseResult.setMsg("邮箱不存在,请重新输入。");
            }
        } else {
            responseResult.setMsg("网络未连接，请检查网络问题。");
            responseResult.setConnect(false);
        }
        return responseResult;
    }

    //点击发送邮件查询该邮箱关联的手机号
    @RequestMapping("selectTelByEmail")
    @ResponseBody
    public String selectTelByEmail(String userEmail){
        String userTel = panyuUserService.selectTelByEmail(userEmail);
        return userTel;
    }

    //修改明文密码进行加密，然后赋值给暗文密码
    @RequestMapping("updateUserLogpwdAndUserPwd")
    @ResponseBody
    public boolean updateUserLogpwdAndUserPwd(PanyuUser panyuUser){
        boolean flag = true;
        try {
            PanyuUser user = panyuUserService.selectUserLogpwdAndUserPwd(panyuUser.getUserTel());
            ByteSource salt = ByteSource.Util.bytes(user.getUserName());
            String newPs = new SimpleHash("MD5", panyuUser.getUserlogpwd(), salt, 1024).toHex();
            user.setUserPwd(newPs);
            user.setUserlogpwd(panyuUser.getUserlogpwd());
            boolean b = panyuUserService.updateUserLogpwdAndUserPwd(user);
            if (b==true) {
                return flag;
            }else {
                return flag;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return flag;
        }
    }
}
