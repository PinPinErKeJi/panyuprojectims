package com.panyu.panyuprojectims.controller.Date_analyze_controller.criticalController;

import com.panyu.panyuprojectims.service.DAnalyzeCriticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/signController")
public class signController {
    @Autowired
    private DAnalyzeCriticalService dAnalyzeCriticalService;
    @RequestMapping("/signInspection")
    @ResponseBody
    public Boolean signInspection(String moduleId){

        System.out.println(moduleId);
        boolean   status= dAnalyzeCriticalService.updatePStatus(moduleId);
       return status;
    }
}
