package com.panyu.panyuprojectims.service;
import java.util.List;
import java.util.Map;

import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.ibatis.annotations.Param;

public interface PanyuUserService{

    //删除用户
    boolean deletePanyuUser(String[] ids);

    //添加用户
    boolean addPanyuUser(String userName,
                         String userPwd,
                         String userlogpwd);
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
                           @Param("userPwd")String userPwd
                           );
    public PanyuUser queryInfoByUsername(String userName);
    public List<String> queryRolesByUsername(String userName);
    public List<String> queryResByUsername(String userName);
}