package com.panyu.panyuprojectims.service;
import java.util.List;
import java.util.Map;

import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.ibatis.annotations.Param;

public interface PanyuUserService{

    //根据用户名修改角色
    void updatePanyuuserRole(PanyuUser panyuUser,String[] roleIds);

    //修改用户信息
    void updatePanyuuser(PanyuUser panyuUser);

    //删除用户
    void deletePanyuUser(String[] ids);

    //添加用户
    boolean addPanyuUser(String userName,
                         String userPwd,
                         String userlogpwd,
                         String userTel,
                         String userEmail
    );
    //分页展示用户
    PageHelperUtil queryAllPanyuUser(int page, int rows, String userName);

    public int register(  @Param("userProvince")String userProvince,
                           @Param("userCity")String userCity,
                           @Param("userCounty")String userCounty,
                           @Param("userCompanyName")String userCompanyName,
                           @Param("userCompanycccNumber")String userCompanycccNumber,
                           @Param("userName")String userName,
                           @Param("userEmail")String userEmail,
                           @Param("userTel")String userTel,
                           @Param("userPwd")String userPwd,
                            @Param("userlogpwd")String userlogpwd
                           );
    public PanyuUser queryInfoByUsername(String userName);
    public List<String> queryRolesByUsername(String userName);
    public List<String> queryResByUsername(String userName);
}