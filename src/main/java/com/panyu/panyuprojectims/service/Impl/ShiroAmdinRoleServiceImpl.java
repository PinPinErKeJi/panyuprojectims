package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.ShiroAmdinRoleDao;
import com.panyu.panyuprojectims.entity.ShiroAmdinRole;
import com.panyu.panyuprojectims.service.ShiroAmdinRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShiroAmdinRoleServiceImpl implements ShiroAmdinRoleService{
    @Autowired
    private ShiroAmdinRoleDao shiroAmdinRoleDao;
}