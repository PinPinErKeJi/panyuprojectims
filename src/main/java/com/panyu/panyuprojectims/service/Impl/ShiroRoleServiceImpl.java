package com.panyu.panyuprojectims.service.Impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.ShiroResourceDao;
import com.panyu.panyuprojectims.dao.ShiroRoleDao;
import com.panyu.panyuprojectims.entity.ShiroRole;
import com.panyu.panyuprojectims.service.ShiroRoleService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShiroRoleServiceImpl implements ShiroRoleService{
    @Autowired private ShiroRoleDao shiroRoleDao;
    @Autowired private ShiroResourceDao shiroResourceDao;

    //分页展示角色数据
    @Override
    public PageHelperUtil showPageRole(int page, int rows) {
        int start = (page - 1) * rows + 1;
        int end = page * rows;

        //分页处理
        PageHelper.startPage(start, rows);
        List<ShiroRole> panyuUser = shiroRoleDao.showPageRole(start, end);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(panyuUser);
        //设置返回总记录数
        PageInfo<ShiroRole> info = new PageInfo<ShiroRole>();
        pageHelperUtil.setTotal(shiroRoleDao.countAllRole());
        return pageHelperUtil;
    }

    //修改角色
    @Override
    public void updateRole(String[] pIds, String[] sIds, ShiroRole role) {
        //修改角色
        shiroRoleDao.updateRole(role);
        //修改中间表的关系,先删除此角色的关系，在添加关系
        shiroRoleDao.deleteRoleAndResource(role.getRoleId());
        //添加当前角色的现有资源
        for (String  pId:pIds
                ) {
            shiroResourceDao.insertRoleAndResource(role.getRoleId(),pId);
        }
        for (String sId:sIds
                ) {
            shiroResourceDao.insertRoleAndResource(role.getRoleId(),sId);
        }
    }

    //删除角色
    @Override
    public boolean deleteRole(String[] ids) {
        boolean flag=true;
        for (String id:ids) {
            boolean b1 = shiroRoleDao.deleteRole(id);
            boolean b = shiroRoleDao.deleteRoleAndResource(id);
            if(b1 == true){
                flag = true;
            }else {
                flag = false;
            }
        }
        return flag;
    }


    //添加角色
    @Override
    public boolean insertRole(String roleName,String[] ids) {
        boolean flag = true;
        try {
            long count = shiroRoleDao.countByRoleName(roleName);
            if(count == 0){
                boolean b = shiroRoleDao.insertRole(roleName);
                ShiroRole shiroRole = shiroRoleDao.selectRoleByRoleName(roleName);
                for(int i=0;i<ids.length;i++){
                    boolean b1 = shiroResourceDao.insertRoleAndResource(shiroRole.getRoleId(), ids[i]);
                    if(b1 == true){
                        flag = true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }



    //查询所有的角色
    @Override
    public Map<String, Object> selectAllRole() {
        Map<String, Object> map=new HashMap<String, Object>();
        List<ShiroRole> list=shiroRoleDao.selectAllRole();
        map.put("rows",list);
        return map;
    }
    //根据用户名查询角色
    @Override
    public List<ShiroRole> selectRoleByUserName(String userName) {
        return shiroRoleDao.selectRoleByUserName(userName);
    }
}