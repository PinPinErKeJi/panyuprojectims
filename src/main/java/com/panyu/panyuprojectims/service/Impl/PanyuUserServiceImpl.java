package com.panyu.panyuprojectims.service.Impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.PanyuUserDao;

import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.service.PanyuUserService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PanyuUserServiceImpl implements PanyuUserService{
    @Autowired
    private PanyuUserDao panyuUserDao;

    //删除用户
    @Override
    public boolean deletePanyuUser(String[] ids) {
        return panyuUserDao.deletePanyuUser(ids);
    }

    //添加用户
    @Override
    public boolean addPanyuUser(String userName, String userPwd, String userlogpwd) {
        return panyuUserDao.addPanyuUser(userName,userPwd,userlogpwd);
    }

    //分页展示用户数据
    @Override
    public PageHelperUtil queryAllPanyuUser(int page, int rows, String userNmae) {
        int start = (page - 1) * rows + 1;
        int end = page * rows;
        if (userNmae !=null && !userNmae.equals("")){
            userNmae = "%"+userNmae+"%";
        }else {
            userNmae = null;
        }
        //分页处理
        PageHelper.startPage(start, rows);
        List<PanyuUser> panyuUser = panyuUserDao.queryPanyuUserList(start, end,userNmae);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(panyuUser);
        //设置返回总记录数
        PageInfo<PanyuUser> info = new PageInfo<PanyuUser>(panyuUser);
        pageHelperUtil.setTotal(panyuUserDao.queryCountPanyuUser(userNmae));
        return pageHelperUtil;
    }

    @Override
    public int register(String userProvince, String userCity, String userCounty, String userCompanyName, String userCompanycccNumber, String userName, String userEmail, String userTel, String userPwd
            ) {

        return panyuUserDao.register( userProvince,  userCity,  userCounty,  userCompanyName,  userCompanycccNumber,  userName,  userEmail,  userTel,  userPwd);
    }

    @Override
    public PanyuUser queryInfoByUsername(String userName) {
        return panyuUserDao.queryInfoByUsername(userName);
    }

    @Override
    public List<String> queryRolesByUsername(String userName) {
        return panyuUserDao.queryRolesByUsername(userName);
    }

    @Override
    public List<String> queryResByUsername(String userName) {
        return panyuUserDao.queryResByUsername(userName);
    }


}