package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.ShiroRoleDao;
import com.panyu.panyuprojectims.entity.ShiroRole;
import com.panyu.panyuprojectims.service.ShiroRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShiroRoleServiceImpl implements ShiroRoleService{
    @Autowired
    private ShiroRoleDao shiroRoleDao;
   

}