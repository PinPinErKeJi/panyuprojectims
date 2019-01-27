package com.panyu.panyuprojectims.utils;


import com.panyu.panyuprojectims.dao.ShiroResourceDao;
import com.panyu.panyuprojectims.entity.ShiroResource;
import com.panyu.panyuprojectims.entity.ShiroRole;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * 资源工具类
 */
public class ResourceUtils {
    /**
     * 去处重复资源
     *
     * @param list
     * @return
     */
    public static List<ShiroResource> removeDuplicate(List<ShiroResource> list){
        List<ShiroResource> resourceList=new ArrayList<>();
        for (ShiroResource res:list
             ) {
            resourceList.add(res);
        }
        return resourceList;
    }

    /**
     * 递归封装资源集合
     * @param resourceDao
     * @param roles
     * @param parentRes
     * @return
     */
    public static List<ShiroResource>
    getResource(ShiroResourceDao resourceDao, List<ShiroRole> roles, List<ShiroResource> parentRes){
        //先查询父类资源
        for (ShiroResource res:parentRes) {
            //根据父类资源编号查询其子类资源
            getSonResources(res,resourceDao,roles);
        }
        return parentRes;
    }
    //根据父类资源编号查询其子类资源
    public static void getSonResources(ShiroResource res,ShiroResourceDao resourceDao,List<ShiroRole> roles){
        // 当角色为 null时，是查询所有资源，不为null时，是根据角色查询资源
        if(roles!=null){
            // 资源去重：当角色不同，资源相同时，去除重复资源
            List<ShiroResource> list = resourceDao.selectResourceByRoleName(roles,res.getId());
            List<ShiroResource> removeDuplicate = removeDuplicate(list);
            if(removeDuplicate!=null&&removeDuplicate.size()>0){
                //将查询出来的资源集合存储在父类对象中
                res.setChildren(removeDuplicate);
                //继续查询子类资源
                for (ShiroResource res2:removeDuplicate
                     ) {
                    getSonResources(res2,resourceDao,roles);
                }
            }
        }else{
            List<ShiroResource> selectAllRes = resourceDao.selectSonResByRoleName(res.getId());
            if(selectAllRes!=null&&selectAllRes.size()>0){
                //将查询到的资源集合存储在资源对象中
                res.setChildren(selectAllRes);
                //继续查询子类的子类资源
                for (ShiroResource res2:selectAllRes
                     ) {
                    res.setChildren(selectAllRes);
                    getSonResources(res2,resourceDao,roles);
                }
            }
        }
    }
}
