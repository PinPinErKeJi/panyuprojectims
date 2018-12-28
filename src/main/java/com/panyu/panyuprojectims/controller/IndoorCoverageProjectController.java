package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.IndoorCoverageProject;
import com.panyu.panyuprojectims.entity.IndoorCoverageSpecification;
import com.panyu.panyuprojectims.service.IndoorCoverageProjectService;
import com.panyu.panyuprojectims.service.IndoorCoverageSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndoorCoverageProjectController {
    @Autowired private IndoorCoverageProjectService indoorCoverageProjectService;
    @Autowired private IndoorCoverageSpecificationService indoorCoverageSpecificationService;



    //根据分项工程id查询包含的检查项目
    @RequestMapping("selectAllIndoorCoverageProjectByIndoorSubWorkId")
    public @ResponseBody List<IndoorCoverageProject> selectAllIndoorCoverageProjectByIndoorSubWorkId(String indoorSubWorkId) {
        return indoorCoverageProjectService.selectAllIndoorCoverageProjectByIndoorSubWorkId(indoorSubWorkId);
    }

    //添加
    @RequestMapping("insertIndoorCoverageProject")
    public @ResponseBody IndoorCoverageProject  insertIndoorCoverageProject(String indoorProjectName, String indoorSubWorkId){
        IndoorCoverageProject indoorCoverageProject = indoorCoverageProjectService.addIndoorCoverageProject(indoorProjectName, indoorSubWorkId);
        return indoorCoverageProject;
    }

    //修改
    @RequestMapping("updateIndoorCoverageProject")
    public @ResponseBody IndoorCoverageProject updateIndoorCoverageProject(String indoorProjectId, String indoorProjectName){
        IndoorCoverageProject indoorCoverageProject = null;
        int i = indoorCoverageProjectService.updateIndoorCoverageProject(indoorProjectId, indoorProjectName);
        if(i > 0){
            indoorCoverageProject = indoorCoverageProjectService.getIndoorCoverageProject(indoorProjectId,indoorProjectName);
        }
        return indoorCoverageProject;
    }

    //删除
    @RequestMapping("deleteIndoorCoverageProject")
    public @ResponseBody boolean deleteIndoorCoverageProject(String indoorProjectId){
        boolean flag = true;
        List<String> indoorSpecificationIdList = indoorCoverageSpecificationService.selectIndoorSpecificationIdByIndoorProjectId(indoorProjectId);
        int i = indoorCoverageProjectService.deleteIndoorCoverageProject(indoorProjectId);
        if(indoorSpecificationIdList.isEmpty()){
            return flag;
        }else {
            for (String indoorSpecificationId : indoorCoverageSpecificationService.selectIndoorSpecificationIdByIndoorProjectId(indoorProjectId)) {
                int i1 = indoorCoverageSpecificationService.deleteIndoorCoverageSpecification(indoorSpecificationId);
            };
        }
        return flag;
    }
}
