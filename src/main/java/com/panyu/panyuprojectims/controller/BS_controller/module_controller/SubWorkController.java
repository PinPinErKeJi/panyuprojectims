package com.panyu.panyuprojectims.controller.BS_controller.module_controller;

import com.panyu.panyuprojectims.entity.SubWork;
import com.panyu.panyuprojectims.service.InspectionProjectService;
import com.panyu.panyuprojectims.service.InspectionStandardService;
import com.panyu.panyuprojectims.service.SubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("BS")
public class SubWorkController {

    @Autowired
    private SubWorkService subWorkService;
    @Autowired
    private InspectionProjectService inspectionProjectService;
    @Autowired
    private InspectionStandardService inspectionStandardService;

    @RequestMapping("selectSubWorkById")
    public @ResponseBody List selectSubWorkById(String moduleId){
        List<SubWork> subWorks = subWorkService.selectSubWorkById(moduleId);
        return subWorks;
    }
    @RequestMapping("insertSubWork")
    public @ResponseBody SubWork insertSubWork(@RequestParam("subName") String subName,String moduleId){
        SubWork subWork = subWorkService.addSubWork(subName, moduleId);

        return subWork;
    }
    @RequestMapping("deleteSubWorkById")
    public @ResponseBody boolean deleteSubWorkById(String subId){
        boolean flag = true;
        //根据subId获取子Id集合list
        List<String> stringList = inspectionProjectService.selectProjectSubId(subId);
        //根据subId删除当前选中的项
        int i = subWorkService.deleteSubWorkById(subId);
        //if判断list是否为空，空就return
        if (stringList.isEmpty()){
            return flag;
        }else {
            //不空就for循环删除，同时获取当前的子ID，并删除
            for (String s : inspectionProjectService.selectProjectSubId(subId)) {

                int i1 = inspectionProjectService.deleteInspectionProjectById(s);

                String s1 = inspectionStandardService.selectStandardProjectId(s);
                if (s1 == null){
                    return flag;
                }else {
                    int i2 = inspectionStandardService.deleteInspectionStandardById(s1);
                }
            }
        }
        return flag;
    }

    @RequestMapping("updateSubWork")
    public @ResponseBody SubWork updateSubWork(String subId,String subName){
        SubWork subWork = null;
        int i = subWorkService.updateSubWork(subId, subName);
        if(i > 0){
            subWork = subWorkService.getSubWork(subId,subName);
        }
        return subWork;
    }
}
