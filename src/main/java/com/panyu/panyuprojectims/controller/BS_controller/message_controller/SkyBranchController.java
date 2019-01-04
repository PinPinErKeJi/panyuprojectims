package com.panyu.panyuprojectims.controller.BS_controller.message_controller;

import com.panyu.panyuprojectims.service.SkyBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("BS")
public class SkyBranchController {
    @Autowired private SkyBranchService skyBranchService;

    @RequestMapping("insertSkyBranch")
    public @ResponseBody String insertSkyBranch(
            String skyBranchId,
            String constructionMode,
            String basicType,
            String foundationConstructionName,
            String basicUnitContacts,
            String skyBranchTypeName,
            String skyBranchSupplierName,
            String skyBranchSupplierContacts,
            String skyBranchUnitName,
            String skyConstructionUnitContacts,
            String skyBranchHeight){

        String[] str1=constructionMode.split(",");
        String[] split = basicType.split(",");
        String[] split1 = skyBranchTypeName.split(",");
        skyBranchId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        //System.out.println("天支表skyBranchId："+skyBranchId);

        boolean b = skyBranchService.insertSkyBranch(
                skyBranchId,str1[0], split[0],
                foundationConstructionName,
                basicUnitContacts,
                split1[0],
                skyBranchSupplierName,
                skyBranchSupplierContacts,
                skyBranchUnitName,
                skyConstructionUnitContacts,
                skyBranchHeight);
        //System.out.println("天支id："+skyBranchId);
        return skyBranchId;
    }
}
