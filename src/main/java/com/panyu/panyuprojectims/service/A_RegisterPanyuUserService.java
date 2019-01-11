package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.PanyuUser;

public interface A_RegisterPanyuUserService {

    //注册账号之前查询改用户是否存在
    PanyuUser selectUserEmail(String userEmail);
}
