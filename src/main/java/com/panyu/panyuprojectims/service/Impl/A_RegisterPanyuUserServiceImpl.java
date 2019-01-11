package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.A_RegisterPanyuUserDao;
import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.service.A_RegisterPanyuUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A_RegisterPanyuUserServiceImpl implements A_RegisterPanyuUserService {

    @Autowired
    private A_RegisterPanyuUserDao a_registerPanyuUserDao;

    @Override
    public PanyuUser selectUserEmail(String userEmail) {
        return a_registerPanyuUserDao.selectUserEmail(userEmail);
    }

}
