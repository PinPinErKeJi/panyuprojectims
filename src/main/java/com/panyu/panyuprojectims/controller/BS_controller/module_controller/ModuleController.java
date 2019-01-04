package com.panyu.panyuprojectims.controller.BS_controller.module_controller;

import com.panyu.panyuprojectims.entity.Module;
import com.panyu.panyuprojectims.service.InspectionProjectService;
import com.panyu.panyuprojectims.service.InspectionStandardService;
import com.panyu.panyuprojectims.service.ModuleService;
import com.panyu.panyuprojectims.service.SubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("BS")
public class ModuleController {
    @Autowired
    private ModuleService moduleService;
    @Autowired
    private SubWorkService subWorkService;
    @Autowired
    private InspectionProjectService inspectionProjectService;
    @Autowired
    private InspectionStandardService inspectionStandardService;


    //根据下拉框查询所有模块名称
    @RequestMapping("selectAllModule")
    public @ResponseBody List selectModule(String moduleId,String moduleName){
        List<Module> modules = moduleService.selectModule();
        return modules;
    }

/*------------------------------添加模块选项框开始-----------------------------*/
    @RequestMapping("selectModules")
    public @ResponseBody List selectAllModule(){
        List<Module> moduleList = moduleService.selectAllModule();
        return moduleList;
    }
    @RequestMapping("insertModule")
    public @ResponseBody Module insertModule(@RequestParam("moduleName") String moduleName){
        Module module = moduleService.insertModule(moduleName);
        return module;
    }
/*------------------------------添加模块选项框结束-----------------------------*/

/*------------------------------删除模块选项框开始-----------------------------*/
    @RequestMapping("deleteModuleById")
    public @ResponseBody boolean deleteModuleById(String moduleId){
        boolean flag = true;
        //根据moduleId获取id集合list
        List<String> moduleList = subWorkService.selectSubWorkModuleId(moduleId);
        //根据id删除选中项
        int i = moduleService.deleteModuleById(moduleId);
        //if判断list是否为空，空就return
        if (moduleList.isEmpty()){
            return flag;
        }else {
            for (String s : subWorkService.selectSubWorkModuleId(moduleId)) {
                int i1 = subWorkService.deleteSubWorkById(s);
                List<String> subList = inspectionProjectService.selectProjectSubId(s);
                if (subList.isEmpty()){
                    return flag;
                }else {
                    for (String s1 : inspectionProjectService.selectProjectSubId(s)) {
                        int i2 = inspectionProjectService.deleteInspectionProjectById(s1);

                        String s2 = inspectionStandardService.selectStandardProjectId(s1);
                        if (s2 == null){
                            return flag;
                        }
                        int i3 = inspectionStandardService.deleteInspectionStandardById(s2);
                    };
                }
            };
        }
        return flag;
    }
/*------------------------------删除模块选项框结束-----------------------------*/

/*------------------------------修改模块选项框开始-----------------------------*/
    @RequestMapping("updateMdouel")
    public @ResponseBody Module updateMdouel(String moduleId,@RequestParam("moduleName") String moduleName){
        Module module = null;
        int i = moduleService.updateModule(moduleId,moduleName);
        if(i > 0){
            module = moduleService.selectModuleByName(moduleName);
        }
        return module;
    }
/*------------------------------修改模块选项框结束-----------------------------*/
}
