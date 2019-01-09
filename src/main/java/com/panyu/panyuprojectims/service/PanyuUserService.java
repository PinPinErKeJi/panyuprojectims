package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.PanyuUser;
import org.apache.ibatis.annotations.Param;

public interface PanyuUserService{
    public int register(   @Param("userProvince")String userProvince,
                           @Param("userCity")String userCity,
                           @Param("userCounty")String userCounty,
                           @Param("userCompanyName")String userCompanyName,
                           @Param("userCompanycccNumber")String userCompanycccNumber,
                           @Param("userName")String userName,
                           @Param("userEmail")String userEmail,
                           @Param("userTel")String userTel,
                           @Param("userPwd")String userPwd
                           );
}