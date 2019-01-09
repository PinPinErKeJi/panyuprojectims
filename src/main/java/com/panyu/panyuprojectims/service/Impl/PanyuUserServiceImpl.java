package com.panyu.panyuprojectims.service.Impl;
import com.panyu.panyuprojectims.dao.PanyuUserDao;
import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.service.PanyuUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PanyuUserServiceImpl implements PanyuUserService{
    @Autowired
    private PanyuUserDao panyuUserDao;



    @Override
    public int register(String userProvince, String userCity, String userCounty, String userCompanyName, String userCompanycccNumber, String userName, String userEmail, String userTel, String userPwd) {

        return panyuUserDao.register( userProvince,  userCity,  userCounty,  userCompanyName,  userCompanycccNumber,  userName,  userEmail,  userTel,  userPwd);
    }
}