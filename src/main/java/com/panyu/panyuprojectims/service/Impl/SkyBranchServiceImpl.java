package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.SkyBranch;
import com.panyu.panyuprojectims.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkyBranchServiceImpl implements SkyBranchService{
    @Autowired
    private SkyBranchDao skyBranchDao;

    //添加
    @Override
    public boolean insertSkyBranch(String skyBranchId, String constructionMode, String basicType, String foundationConstructionName, String basicUnitContacts, String skyBranchTypeName, String skyBranchSupplierName, String skyBranchSupplierContacts, String skyBranchUnitName, String skyConstructionUnitContacts, String skyBranchHeight) {
        int i2 = skyBranchHeight.indexOf(".");
        if(i2>0){
            String str = skyBranchHeight.substring(i2);
            int length = str.length();
            if(length>2){
                skyBranchHeight = skyBranchHeight.substring(0, i2+3);
                System.out.println("大于2:"+skyBranchHeight);
            }else {
                skyBranchHeight = skyBranchHeight.substring(0, i2 + length);
                System.out.println("小于2:"+skyBranchHeight);
            }
        }else {
            skyBranchHeight = skyBranchHeight+".00";
        }

        boolean flag = true;
        if (skyBranchId !=null){
            int i = skyBranchDao.insertSkyBranch(
                    skyBranchId, constructionMode,
                    basicType, foundationConstructionName,
                    basicUnitContacts, skyBranchTypeName,
                    skyBranchSupplierName, skyBranchSupplierContacts,
                    skyBranchUnitName, skyConstructionUnitContacts, skyBranchHeight);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

//------------------------------------删除开始------------------------------------------------------//
    @Override
    public boolean deleteSkyBranchById(String skyBranchId){
        boolean flag = true;
        int i = skyBranchDao.deleteSkyBranchById(skyBranchId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }
//----------------------------------删除结束------------------------------------------------------//

//根据天支ID查询建设方式、天支类型、基础类型
    @Override
    public SkyBranch selectByskyBranchId(String skyBranchId) {
        return skyBranchDao.selectByskyBranchId(skyBranchId);
    }
}