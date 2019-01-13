package com.panyu.panyuprojectims.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface A_RegisterPanyuUserDao {

    //注册账号之前查询改用户是否存在
    int selectUserName(@Param("userName") String userName);
    /*注册
    int register(
            @Param("userProvince")String userProvince,
            @Param("userCity")String userCity,
            @Param("userCounty")String userCounty,
            @Param("userCompanyName")String userCompanyName,
            @Param("userCompanycccNumber")String userCompanycccNumber,
            @Param("userName")String userName,
            @Param("userEmail")String userEmail,
            @Param("userTel")String userTel,
            @Param("userPwd")String userPwd
    );

    PanyuUser queryInfoByUsername(@Param("userName")String userName);*/
}
