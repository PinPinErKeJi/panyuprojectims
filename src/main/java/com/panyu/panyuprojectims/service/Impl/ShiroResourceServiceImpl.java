package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.ShiroResourceDao;
import com.panyu.panyuprojectims.entity.ShiroResource;
import com.panyu.panyuprojectims.service.ShiroResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShiroResourceServiceImpl implements ShiroResourceService{
    @Autowired
    private ShiroResourceDao shiroResourceDao;
   

}