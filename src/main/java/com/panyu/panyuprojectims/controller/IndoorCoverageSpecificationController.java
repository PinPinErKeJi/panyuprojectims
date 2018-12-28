package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.IndoorCoverageSpecification;
import com.panyu.panyuprojectims.service.IndoorCoverageSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndoorCoverageSpecificationController {
    @Autowired private IndoorCoverageSpecificationService indoorCoverageSpecificationService;



    //根据检查项目id查询包含的标准规范
    @RequestMapping("selectIndoorCoverageSpecificationByIndoorProjectId")
    public @ResponseBody
    List<IndoorCoverageSpecification> selectIndoorCoverageSpecificationByIndoorProjectId(String indoorProjectId) {
        System.out.println("检查项目id:"+indoorProjectId);
        System.out.println("***:"+indoorCoverageSpecificationService.selectIndoorCoverageSpecificationByIndoorProjectId(indoorProjectId));
        return indoorCoverageSpecificationService.selectIndoorCoverageSpecificationByIndoorProjectId(indoorProjectId);
    }

    //添加
    @RequestMapping("insertIndoorCoverageSpecification")
    public @ResponseBody IndoorCoverageSpecification insertIndoorCoverageSpecification(String indoorSpecificationName, String indoorProjectId){
        IndoorCoverageSpecification indoorCoverageSpecification = indoorCoverageSpecificationService.addIndoorCoverageSpecification(indoorSpecificationName, indoorProjectId);
        return indoorCoverageSpecification;
    }

    //修改
    @RequestMapping("updateIndoorCoverageSpecification")
    public @ResponseBody IndoorCoverageSpecification updateIndoorCoverageSpecification(String indoorSpecificationName,String indoorSpecificationId){
        IndoorCoverageSpecification indoorCoverageSpecification = null;
        int i = indoorCoverageSpecificationService.updateIndoorCoverageSpecification(indoorSpecificationName, indoorSpecificationId);
        if(i > 0){
            indoorCoverageSpecification = indoorCoverageSpecificationService.getIndoorCoverageSpecification(indoorSpecificationName,indoorSpecificationId);
        }
        return indoorCoverageSpecification;
    }

    //删除
    @RequestMapping("deleteIndoorCoverageSpecification")
    public @ResponseBody boolean deleteIndoorCoverageSpecification(String indoorSpecificationId){
        boolean falg = true;
        int i = indoorCoverageSpecificationService.deleteIndoorCoverageSpecification(indoorSpecificationId);
        if(i > 0){
             falg = true;
        }else {
            falg = false;
        }
        return falg;
    }


}
