package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.ShiroResource;
import com.panyu.panyuprojectims.entity.ShiroRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ShiroResourceDao{
    //功能资源删除
    int deleteResourceById(@Param("id")String id);

    //根据父id查询拥有的资源
    List<ShiroResource> selectResourceById(@Param("id")String id);
    //添加权限资源
    void insertResource(ShiroResource resource);
    //根据资源名查询个数
    long countResourceByResourceName(@Param("text")String text);
    //根据资源名查询资源对象
    ShiroResource selectResourceByResourceName(@Param("text")String text);
    //添加角色并分配权限
    boolean insertRoleAndResource(@Param("roleId")String roleId,@Param("id")String id);
    //根据角色名查询拥有的权限
    List<ShiroResource> selectResourceByRoleName(@Param("list") List<ShiroRole> roles, @Param("id") String id);
    //查询父id为空的资源
    List<ShiroResource> selectAllResource();
    //根据父id查询拥有的资源
    List<ShiroResource> selectSonResByRoleName(@Param("id")String id);
    //分页展示权限资源
    List<ShiroResource> showAllShiroResource(@Param("start")int start,@Param("end")int end);
    //查询权限的总数
    long countAllShiroResource();
}