package com.panyu.panyuprojectims.service;

public interface A_RegisterPanyuUserService {

    //注册账号之前查询改用户是否存在
    int selectUserName(String userName);
    /*
    注册用户
    int register( @Param("userProvince")String userProvince,
                          @Param("userCity")String userCity,
                          @Param("userCounty")String userCounty,
                          @Param("userCompanyName")String userCompanyName,
                          @Param("userCompanycccNumber")String userCompanycccNumber,
                          @Param("userName")String userName,
                          @Param("userEmail")String userEmail,
                          @Param("userTel")String userTel,
                          @Param("userPwd")String userPwd
    );

    PanyuUser queryInfoByUsername(String userName);*/
}
