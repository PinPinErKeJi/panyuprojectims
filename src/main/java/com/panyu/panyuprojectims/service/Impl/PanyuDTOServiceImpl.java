package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.*;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PanyuDTOServiceImpl implements PanyuDTOService {

    @Autowired private PanyuDTODao panyuDTODao;
    @Autowired private ModuleService moduleService;
    @Autowired private SubWorkService subWorkService;
    @Autowired private InspectionProjectService inspectionProjectService;
    @Autowired private InspectionStandardService inspectionStandardService;

/*------------------------------if (moduleId==null&&projectName==null){}开始-----------------------------------------*/
    @Override
    public PageHelperUtil selectAllPanyuDTO(int page,int rows) {
        int start = (page-1)*rows+1;
        int end = page*rows;
        //分页处理
        PageHelper.startPage(start,rows);
        List<PanyuDTO> panyuDTOS = panyuDTODao.selectAllPanyuDTO(start,end);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(panyuDTOS);
        //设置返回总记录数
        PageInfo<PanyuDTO> info = new PageInfo<PanyuDTO>(panyuDTOS);
        pageHelperUtil.setTotal(panyuDTODao.getCount());
        return pageHelperUtil;
    }
/*------------------------------if (moduleId==null&&projectName==null){}结束-----------------------------------------*/


/*------------------------------if (moduleId==null&&projectName!=null){}开始-----------------------------------------*/
    /*
     * 根据输入搜索框内容分页查询模块信息
     *
     */
    @Override
    public PageHelperUtil FuzzyqueryProjectName(int page, int rows, String projectName) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (projectName !=null && !projectName.equals("")){
            projectName = "%"+projectName+"%";
        }else {
            projectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<PanyuDTO> panyuDTOList = panyuDTODao.FuzzyqueryProjectName(start,end, projectName);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(panyuDTOList);
        //设置返回总记录数
        PageInfo<PanyuDTO> info = new PageInfo<PanyuDTO>(panyuDTOList);
        pageHelperUtil.setTotal(panyuDTODao.FuzzyqueryCount(projectName));
        return pageHelperUtil;
    }
/*------------------------------if (moduleId==null&&projectName!=null){}结束-----------------------------------------*/

/*------------------------------if (moduleId!=null&&projectName!=null){}开始-----------------------------------------*/
    @Override
    public PageHelperUtil selectModuleNameAndProjectName(int page, int rows, String projectName, String moduleId) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (projectName !=null && !projectName.equals("")){
            projectName = "%"+projectName+"%";
        }else {
            projectName = null;
        }

        //分页处理
        PageHelper.startPage(start,rows);
        List<PanyuDTO> panyuDTOList = panyuDTODao.selectModuleNameAndProjectName(page, rows, projectName, moduleId);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(panyuDTOList);
        //设置返回总记录数
        PageInfo<PanyuDTO> info = new PageInfo<PanyuDTO>(panyuDTOList);
        pageHelperUtil.setTotal(panyuDTODao.selectModuleAndProjectCount(projectName, moduleId));
        return pageHelperUtil;
    }
/*------------------------------if (moduleId!=null&&projectName!=null){}结束-----------------------------------------*/

/*------------------------------if (moduleId!=null&&projectName==null){}开始-----------------------------------------*/
    @Override
    public PageHelperUtil selectFuzzyqueryModuleId(int page, int rows, String moduleId) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        //分页处理
        PageHelper.startPage(start,rows);
        List<PanyuDTO> panyuDTOList = panyuDTODao.selectFuzzyqueryModuleId(page, rows, moduleId);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(panyuDTOList);
        //设置返回总记录数
        PageInfo<PanyuDTO> info = new PageInfo<PanyuDTO>(panyuDTOList);
        pageHelperUtil.setTotal(panyuDTODao.selectFuzzyqueryModuleIdCount(moduleId));
        return pageHelperUtil;
    }
/*------------------------------if (moduleId!=null&&projectName==null){}结束-----------------------------------------*/

/*------------------------------if (moduleId!=null&&ModuleName!=null){}开始-----------------------------------------*/
    @Override
    public PageHelperUtil selectAllModuleNameByPage(int page, int rows, String moduleId, String moduleName) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        //分页处理
        PageHelper.startPage(start,rows);
        List<PanyuDTO> panyuDTOList = panyuDTODao.selectAllModuleNameByPage(page, rows, moduleId, moduleName);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(panyuDTOList);
        //设置返回总记录数
        PageInfo<PanyuDTO> info = new PageInfo<PanyuDTO>(panyuDTOList);
        pageHelperUtil.setTotal(panyuDTODao.selectAllModuleNameByPageCount(moduleId,moduleName));
        return pageHelperUtil;
    }
/*------------------------------if (moduleId!=null&&ModuleName!=null){}结束-----------------------------------------*/


    @Override
    public List<PanyuDTO> exportExcel() {
        return panyuDTODao.exportExcel();
    }

    @Override
    public List<PanyuDTO> exportModule(String[] ids) {
        return panyuDTODao.exportModule(ids);
    }

    public boolean insertDTO(String moduleNamedto,
                          String subNamedto,
                          String projectNamedto,
                          String inspectionContentdto){
        boolean flag = true;
        try{
            if(moduleNamedto != null && !moduleNamedto.equals("") && subNamedto != null && !subNamedto.equals("") && projectNamedto != null && !projectNamedto.equals("") && inspectionContentdto != null && !inspectionContentdto.equals("")){
                Module module = moduleService.insertModule(moduleNamedto);
                if(module != null ){
                    SubWork subWork = subWorkService.addSubWork(subNamedto, module.getModuleId());
                    if(subWork != null ){
                        InspectionProject inspectionProject = inspectionProjectService.addProject(projectNamedto, subWork.getSubId());
                        if(inspectionProject != null ){
                            InspectionStandard inspectionStandard = inspectionStandardService.addInspectionStandard(inspectionContentdto, inspectionProject.getProjectId());
                            if(inspectionStandard != null ){
                                System.out.println("成功");
                                flag = true;
                            }else {
                                System.out.println("失败");
                                flag = false;
                            }
                        }
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }
}
