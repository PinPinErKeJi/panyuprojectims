package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.ShiroResourceDao;
import com.panyu.panyuprojectims.entity.ShiroResource;
import com.panyu.panyuprojectims.entity.ShiroRole;
import com.panyu.panyuprojectims.service.ShiroResourceService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import com.panyu.panyuprojectims.utils.ResourceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShiroResourceServiceImpl implements ShiroResourceService{
    @Autowired
    private ShiroResourceDao shiroResourceDao;


    //删除功能资源
    @Override
    public boolean deleteResourceById(String id) {
        int i = shiroResourceDao.deleteResourceById(id);
        System.out.println("业务层  id  :"+id);
        System.out.println("业务层  i :"+i);
        if(i > 0){
            return true;
        }else {
            return false;
        }
    }

    //根据父id查询拥有的资源
    @Override
    public List<ShiroResource> selectResourceById(String parectResourceId) {
        return shiroResourceDao.selectResourceById(parectResourceId);
    }

    //添加权限资源
    @Override
    public ShiroResource addResource(ShiroResource resource) {
        long count = shiroResourceDao.countResourceByResourceName(resource.getText());
        if(count == 0){
            //resource.setParectResourceId(resource.getId());
            shiroResourceDao.insertResource(resource);
        }
        resource = shiroResourceDao.selectResourceByResourceName(resource.getText());
        return resource;
    }

    //根据角色名所拥有的查询资源
    @Override
    public List<ShiroResource> selectResourceByRoleName(List<ShiroRole> roles) {
        //查询当前角色所拥有的的所有一级资源
        List<ShiroResource> shiroResourcesFirst = shiroResourceDao.selectResourceByRoleName(roles, null);
        //去除重复资源
        List<ShiroResource> treeSet = ResourceUtils.removeDuplicate(shiroResourcesFirst);
        //获取所有的菜单资源，包括一级，二级，三级
        List<ShiroResource> resources = ResourceUtils.getResource(shiroResourceDao, roles, treeSet);
        return resources;
    }

    //分页展示权限资源
    @Override
    public PageHelperUtil showAllShiroResource(int page, int rows) {
        int start = (page-1) * rows+1;
        int end = page * rows;
        //分页处理
        PageHelper.startPage(start, rows);
        List<ShiroResource> panyuUser = shiroResourceDao.showAllShiroResource(start, end);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(panyuUser);
        //设置返回总记录数
        PageInfo<ShiroResource> info = new PageInfo<ShiroResource>();
        pageHelperUtil.setTotal(shiroResourceDao.countAllShiroResource());
        return pageHelperUtil;
    }

    //获取所有的资源
    public List<ShiroResource> queryAllRs() {
        List<ShiroResource>resourceList=shiroResourceDao.selectAllResource();
        for (ShiroResource p:resourceList) {
            getSonResource(p);
        }
        return resourceList;
    }
    //根据父级Id 查询角色对应的子级资源
    public void getSonResource(ShiroResource res) {
        List<ShiroResource> sonResList = shiroResourceDao.selectSonResByRoleName(res.getId());
        if(sonResList !=null && sonResList.size()>0){
            res.setChildren(sonResList);
            for (ShiroResource s: sonResList) {
                getSonResource(s);
            }
        }
    }
   

}