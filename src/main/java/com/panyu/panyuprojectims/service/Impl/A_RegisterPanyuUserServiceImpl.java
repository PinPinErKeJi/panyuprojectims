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
    public int selectUserEmail(String userEmail) {
        return a_registerPanyuUserDao.selectUserEmail(userEmail);
    }

    @Override
    public int register(
            String userProvince,
            String userCity,
            String userCounty,
            String userCompanyName,
            String userCompanycccNumber,
            String userName,
            String userEmail,
            String userTel,
            String userPwd
    ) {
        int result = 0;
        try {
                result = a_registerPanyuUserDao.register(
                        userProvince, userCity, userCounty,
                        userCompanyName, userCompanycccNumber, userName, userEmail, userTel, userPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public PanyuUser queryInfoByUsername(String userName) {
        return a_registerPanyuUserDao.queryInfoByUsername(userName);
    }
}
