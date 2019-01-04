package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.ShiroAdminDao;
import com.panyu.panyuprojectims.entity.ShiroAdmin;
import com.panyu.panyuprojectims.service.ShiroAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShiroAdminServiceImpl implements ShiroAdminService{
    @Autowired
    private ShiroAdminDao shiroAdminDao;
   

}