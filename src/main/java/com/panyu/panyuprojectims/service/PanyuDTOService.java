package com.panyu.panyuprojectims.service;

import com.panyu.panyuprojectims.entity.PanyuDTO;
import com.panyu.panyuprojectims.utils.PageHelperUtil;

import java.util.List;

public interface PanyuDTOService {

/*------------------------------if (moduleId==null&&projectName==null){}开始-----------------------------------------*/
    /*
    * 查询所有模块信息以及模糊查询分页条件查询
    * */
    public PageHelperUtil selectAllPanyuDTO(int page, int rows);
/*------------------------------if (moduleId==null&&projectName==null){}结束-----------------------------------------*/


/*------------------------------if (moduleId==null&&projectName!=null){}开始-----------------------------------------*/
    /*
     * 根据输入搜索框内容分页查询模块信息
     *
     */
    public PageHelperUtil FuzzyqueryProjectName(int page, int rows, String projectName);
/*------------------------------if (moduleId==null&&projectName!=null){}结束-----------------------------------------*/


/*------------------------------if (moduleId!=null&&projectName!=null){}开始-----------------------------------------*/
    /*
     * 根据输入搜索框内容以及下拉框模块名称进行分页查询模块信息
     *
     */
    public PageHelperUtil selectModuleNameAndProjectName(int page, int rows, String projectName, String moduleId);
/*------------------------------if (moduleId!=null&&projectName!=null){}结束-----------------------------------------*/


/*------------------------------if (moduleId!=null&&projectName==null){}开始-----------------------------------------*/
    public PageHelperUtil selectFuzzyqueryModuleId(int page, int rows, String moduleId);
/*------------------------------if (moduleId!=null&&projectName==null){}结束-----------------------------------------*/


/*------------------------------if (moduleId!=null&&ModuleName!=null){}开始-----------------------------------------*/
    public PageHelperUtil selectAllModuleNameByPage(int page, int rows, String moduleId, String moduleName);
/*------------------------------if (moduleId!=null&&ModuleName!=null){}结束-----------------------------------------*/
    /*
    * 导出模块空的Excel表格
    * */
    List<PanyuDTO> exportExcel();

    /*
    * 导出模块Excel表格信息数据
    * */
    List<PanyuDTO> exportModule(String[] ids);

    /*
    * t添加导入Excel表格数据
    * */
    boolean insertDTO(
            String moduleNamedto,
            String subNamedto,
            String projectNamedto,
            String inspectionContentdto);
}
