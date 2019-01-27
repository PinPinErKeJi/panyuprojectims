package com.panyu.panyuprojectims.service;
import java.util.List;
import java.util.Map;

import com.panyu.panyuprojectims.entity.ShiroRole;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

public interface ShiroRoleService{
    //分页展示角色
    PageHelperUtil showPageRole(int page, int rows);
    //修改角色
    void updateRole(String[] pIds, String[] sIds, ShiroRole role);
    //删除角色
    boolean deleteRole(String[] ids);
    //添加角色
    boolean insertRole(String roleName,String[] ids);
    //查询所有的角色
    Map<String,Object> selectAllRole();
    //根据用户名查询拥有的角色
    List<ShiroRole> selectRoleByUserName(String userName);
}