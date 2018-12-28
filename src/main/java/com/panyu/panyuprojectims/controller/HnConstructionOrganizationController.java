package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.HnConstructionOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class HnConstructionOrganizationController {
    @Autowired private HnConstructionOrganizationService hnConstructionOrganizationService;

    //添加
    @RequestMapping("insertHnConstructionOrganization")
    public @ResponseBody String insertHnConstructionOrganization(String constructionOrganizationId, String constructionCorporateName, String constructionLinkman){
        constructionOrganizationId=UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        int i = hnConstructionOrganizationService.insertHnConstructionOrganization(constructionOrganizationId, constructionCorporateName, constructionLinkman);
            return constructionOrganizationId;
    }
}
