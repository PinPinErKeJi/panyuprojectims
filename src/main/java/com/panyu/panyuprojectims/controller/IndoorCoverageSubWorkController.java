package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.IndoorCoverageProject;
import com.panyu.panyuprojectims.entity.IndoorCoverageSpecification;
import com.panyu.panyuprojectims.entity.IndoorCoverageSubWork;
import com.panyu.panyuprojectims.service.IndoorCoverageProjectService;
import com.panyu.panyuprojectims.service.IndoorCoverageSpecificationService;
import com.panyu.panyuprojectims.service.IndoorCoverageSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndoorCoverageSubWorkController {
    @Autowired private IndoorCoverageSubWorkService indoorCoverageSubWorkService;
    @Autowired private IndoorCoverageProjectService indoorCoverageProjectService;
    @Autowired private IndoorCoverageSpecificationService indoorCoverageSpecificationService;


    //根据模块信息id查询包含的分项工程
    @RequestMapping("selectAllIndoorCoverageSubWorkByIndoorCoverageId")
    public @ResponseBody List<IndoorCoverageSubWork> selectAllIndoorCoverageSubWorkByIndoorCoverageId(String indoorCoverageId){
       return indoorCoverageSubWorkService.selectAllIndoorCoverageSubWorkByIndoorCoverageId(indoorCoverageId);
    }

    //添加
    @RequestMapping("insertIndoorCoverageSubWork")
    public @ResponseBody IndoorCoverageSubWork insertIndoorCoverageSubWork(String indoorSubWorkName, String indoorCoverageId){
        IndoorCoverageSubWork indoorCoverageSubWork = indoorCoverageSubWorkService.addIndoorCoverageSubWork(indoorSubWorkName, indoorCoverageId);
        return indoorCoverageSubWork;
    }

    //修改
    @RequestMapping("updateIndoorCoverageSubWork")
    public @ResponseBody IndoorCoverageSubWork updateIndoorCoverageSubWork(String indoorSubWorkId, String indoorSubWorkName){
        IndoorCoverageSubWork indoorCoverageSubWork = null;
        int i = indoorCoverageSubWorkService.updateIndoorCoverageSubWork(indoorSubWorkId, indoorSubWorkName);
        if(i > 0){
            indoorCoverageSubWork = indoorCoverageSubWorkService.getIndoorCoverageSubWork(indoorSubWorkId,indoorSubWorkName);
        }
        return indoorCoverageSubWork;
    }

    //删除
    @RequestMapping("deleteIndoorCoverageSubWork")
    public @ResponseBody boolean deleteIndoorCoverageSubWork(String indoorSubWorkId){
        boolean flag = true;
        List<IndoorCoverageProject> indoorCoverageProjectList = indoorCoverageProjectService.selectAllIndoorCoverageProjectByIndoorSubWorkId(indoorSubWorkId);
        int i = indoorCoverageSubWorkService.deleteIndoorCoverageSubWork(indoorSubWorkId);
        if(indoorCoverageProjectList.isEmpty()){
            return flag;
        }else {
            for (IndoorCoverageProject indoorCoverageProject : indoorCoverageProjectService.selectAllIndoorCoverageProjectByIndoorSubWorkId(indoorSubWorkId)) {
                List<String> indoorSpecificationIdList = indoorCoverageSpecificationService.selectIndoorSpecificationIdByIndoorProjectId(indoorCoverageProject.getIndoorProjectId());
                int i1 = indoorCoverageProjectService.deleteIndoorCoverageProject(indoorCoverageProject.getIndoorProjectId());
                if(indoorSpecificationIdList.isEmpty()){
                    return flag;
                }else {
                    for (String indoorSpecificationId : indoorCoverageSpecificationService.selectIndoorSpecificationIdByIndoorProjectId(indoorCoverageProject.getIndoorProjectId())) {
                        int i2 = indoorCoverageSpecificationService.deleteIndoorCoverageSpecification(indoorSpecificationId);
                    };
                };
            }
        };
        return flag;
    }
}
