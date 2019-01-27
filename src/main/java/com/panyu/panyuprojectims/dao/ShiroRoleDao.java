package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.ShiroRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ShiroRoleDao{
    //分页展示角色
    List<ShiroRole> showPageRole(@Param("start")int start, @Param("end")int end);
    //查询角色的总数
    long countAllRole();
    //修改角色
    void updateRole(ShiroRole role);
    //删除角色
    boolean deleteRole(@Param("ids")String ids);
    //删除角色前先删除中间表的信息
    boolean deleteRoleAndResource(@Param("ids")String ids);
    //添加角色
    boolean insertRole(@Param("roleName")String roleName);
    //根据角色名查询角色对象
    ShiroRole selectRoleByRoleName(@Param("roleName")String roleName);
    //根据角色名查询个数
    long countByRoleName(@Param("roleName")String roleName);
    //查询所有的角色
    List<ShiroRole> selectAllRole();
    //根据用户名查询拥有的角色
    List<ShiroRole> selectRoleByUserName(@Param("userName")String userName);
}