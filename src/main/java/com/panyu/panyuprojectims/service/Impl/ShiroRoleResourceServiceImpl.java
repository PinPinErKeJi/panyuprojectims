package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.ShiroRoleResourceDao;
import com.panyu.panyuprojectims.entity.ShiroRoleResource;
import com.panyu.panyuprojectims.service.ShiroRoleResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShiroRoleResourceServiceImpl implements ShiroRoleResourceService{
    @Autowired
    private ShiroRoleResourceDao shiroRoleResourceDao;
    

}