package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.ShiroResource;
import com.panyu.panyuprojectims.entity.ShiroRole;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

public interface ShiroResourceService{
    //删除功能资源
    boolean deleteResourceById(String id);
    //根据父id查询拥有的资源
    List<ShiroResource> selectResourceById(String parectResourceId);
    //添加权限资源
    ShiroResource addResource(ShiroResource resource);
    //获取父类资源
    List<ShiroResource> queryAllRs();
    //获取子类资源
    void getSonResource(ShiroResource res);
    //根据角色名查询拥有的权限
    List<ShiroResource> selectResourceByRoleName(List<ShiroRole> roles);
    //分页展示权限资源
    PageHelperUtil showAllShiroResource(int page, int rows);
}