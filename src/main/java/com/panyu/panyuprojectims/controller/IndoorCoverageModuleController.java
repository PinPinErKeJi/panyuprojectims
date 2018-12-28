package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.IndoorCoverageModule;
import com.panyu.panyuprojectims.entity.IndoorCoverageProject;
import com.panyu.panyuprojectims.entity.IndoorCoverageSpecification;
import com.panyu.panyuprojectims.entity.IndoorCoverageSubWork;
import com.panyu.panyuprojectims.service.IndoorCoverageModuleService;
import com.panyu.panyuprojectims.service.IndoorCoverageProjectService;
import com.panyu.panyuprojectims.service.IndoorCoverageSpecificationService;
import com.panyu.panyuprojectims.service.IndoorCoverageSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndoorCoverageModuleController {
    @Autowired private IndoorCoverageModuleService indoorCoverageModuleService;
    @Autowired private IndoorCoverageSubWorkService indoorCoverageSubWorkService;
    @Autowired private IndoorCoverageProjectService indoorCoverageProjectService;
    @Autowired private IndoorCoverageSpecificationService indoorCoverageSpecificationService;


    //查询所有的模块信息
    @RequestMapping("selectAllIndoorCoverageModule")
    public @ResponseBody List<IndoorCoverageModule> selectAllIndoorCoverageModule(){
       return indoorCoverageModuleService.selectAllIndoorCoverageModule();
    }

    //添加
    @RequestMapping("insertIndoorCoverageModule")
    public @ResponseBody IndoorCoverageModule insertIndoorCoverageModule(String indoorCoverageName){
        IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleService.addIndoorCoverageModule(indoorCoverageName);
        return indoorCoverageModule;
    }

    //修改
    @RequestMapping("updateIndoorCoverageModule")
    public @ResponseBody IndoorCoverageModule updateIndoorCoverageModule(String indoorCoverageId, String indoorCoverageName){
        IndoorCoverageModule indoorCoverageModule = null;
        int i = indoorCoverageModuleService.updateIndoorCoverageModule(indoorCoverageId, indoorCoverageName);
        if(i > 0){
            indoorCoverageModule = indoorCoverageModuleService.getIndoorCoverageModule(indoorCoverageName);
        }
        return indoorCoverageModule;
    }

    //删除
    @RequestMapping("deleteIndoorCoverageModule")
    public @ResponseBody boolean deleteIndoorCoverageModule(String indoorCoverageId){
        boolean flag = true;
        List<IndoorCoverageSubWork> indoorCoverageSubWorkList = indoorCoverageSubWorkService.selectAllIndoorCoverageSubWorkByIndoorCoverageId(indoorCoverageId);
        int i = indoorCoverageModuleService.deleteIndoorCoverageModule(indoorCoverageId);
        if(indoorCoverageSubWorkList.isEmpty()){
            return flag;
        }else {
            for (IndoorCoverageSubWork indoorCoverageSubWork : indoorCoverageSubWorkService.selectAllIndoorCoverageSubWorkByIndoorCoverageId(indoorCoverageId)) {
                List<IndoorCoverageProject> indoorCoverageProjectList = indoorCoverageProjectService.selectAllIndoorCoverageProjectByIndoorSubWorkId(indoorCoverageSubWork.getIndoorSubWorkId());
                int i1 = indoorCoverageSubWorkService.deleteIndoorCoverageSubWork(indoorCoverageSubWork.getIndoorSubWorkId());
                if(indoorCoverageProjectList.isEmpty()){
                    return flag;
                }else {
                        for (IndoorCoverageProject indoorCoverageProject : indoorCoverageProjectService.selectAllIndoorCoverageProjectByIndoorSubWorkId(indoorCoverageSubWork.getIndoorSubWorkId())) {
                            List<String> indoorSpecificationIdList = indoorCoverageSpecificationService.selectIndoorSpecificationIdByIndoorProjectId(indoorCoverageProject.getIndoorProjectId());
                            int i2 = indoorCoverageProjectService.deleteIndoorCoverageProject(indoorCoverageProject.getIndoorProjectId());
                                if(indoorSpecificationIdList.isEmpty()){
                                    return flag;
                                }else {
                                    for (String indoorSpecificationId : indoorCoverageSpecificationService.selectIndoorSpecificationIdByIndoorProjectId(indoorCoverageProject.getIndoorProjectId())) {
                                        int i3 = indoorCoverageSpecificationService.deleteIndoorCoverageSpecification(indoorSpecificationId);
                                    };
                                }
                        }
                    }
                }
            }
        return flag;
    }

}
