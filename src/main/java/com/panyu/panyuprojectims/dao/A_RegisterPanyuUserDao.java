package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.PanyuUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface A_RegisterPanyuUserDao {

    //注册账号之前查询改用户是否存在
    PanyuUser selectUserEmail(@Param("userEmail") String userEmail);
}
