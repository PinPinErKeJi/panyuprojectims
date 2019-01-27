package com.panyu.panyuprojectims.service.Impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.CircuitDTODao;
import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.*;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CircuitDTOServiceImpl implements CircuitDTOService {
    @Autowired private CircuitDTODao circuitDTODao;
    @Autowired
    private CircuitModuleService circuitModuleService;
    @Autowired
    private CircuitSubWorkService circuitSubWorkService;
    @Autowired
    private CircuitInspectionProjectService circuitInspectionProjectService;
    @Autowired
    private CircuitInspectionCriterionService circuitInspectionCriterionService;




    // 1.无条件分页查询展示模块数据
    @Override
    public PageHelperUtil selectAllCircuitDTO(int page, int rows) {
        int start = (page-1)*rows+1;
        int end = page*rows;
        //分页处理
        PageHelper.startPage(start,rows);
        List<CircuitDTO> circuitDTOList = circuitDTODao.selectAllCircuitDTO(start,end);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(circuitDTOList);
        //设置返回总记录数
        PageInfo<CircuitDTO> pageInfo = new PageInfo<CircuitDTO>(circuitDTOList);
        pageHelperUtil.setTotal(circuitDTODao.selectAllCircuitDTOCount());
        //System.out.println("1:"+pageHelperUtil);
        return pageHelperUtil;
    }

    // 2.根据检查项目名分页模糊匹配查询
    @Override
    public PageHelperUtil FuzzysearchCircuitDTO(int page, int rows, String circuitProjectName) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (circuitProjectName !=null && !circuitProjectName.equals("")){
            circuitProjectName = "%"+circuitProjectName+"%";
        }else {
            circuitProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<CircuitDTO> circuitDTOS = circuitDTODao.FuzzysearchCircuitDTO(start,end, circuitProjectName);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(circuitDTOS);
        //设置返回总记录数
        PageInfo<CircuitDTO> pageInfo = new PageInfo<CircuitDTO>(circuitDTOS);
        pageHelperUtil.setTotal(circuitDTODao.getFuzzysearchCircuitDTOCount(circuitProjectName));
        //System.out.println("2:"+pageHelperUtil);
        return pageHelperUtil;
    }


    // 3.根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询
    @Override
    public PageHelperUtil selectAllDropdownBoxAndSearchCircuitDTO(int page,int rows,String circuitModuleId, String circuitProjectName) {

        int start = (page-1)*rows+1;
        int end = page*rows;

        if (circuitProjectName !=null && !circuitProjectName.equals("")){
            circuitProjectName = "%"+circuitProjectName+"%";
        }else {
            circuitProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<CircuitDTO> dtoList = circuitDTODao.selectAllDropdownBoxAndSearchCircuitDTO(start,end, circuitModuleId, circuitProjectName);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(dtoList);
        //设置返回总计录数
        PageInfo<CircuitDTO> pageInfo = new PageInfo<CircuitDTO>();
        pageHelperUtil.setTotal(circuitDTODao.selectDropdownBoxAndSearchCount(circuitModuleId,circuitProjectName));
        //System.out.println("3:"+pageHelperUtil);
        return pageHelperUtil;
    }

    // 4 .根据模块名为空以及搜索框内容进行分页模糊匹配查询
    @Override
    public PageHelperUtil selectAllCircuitDTOSearchList(int page, int rows, String circuitModuleId) {

        int start = (page-1)*rows+1;
        int end = page*rows;

        //分页处理
        PageHelper.startPage(start,rows);
        List<CircuitDTO> list = circuitDTODao.selectAllCircuitDTOSearchList(start,end, circuitModuleId);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(list);
        //设置返回总记录数
        PageInfo<CircuitDTO> pageInfo = new PageInfo<CircuitDTO>(list);
        pageHelperUtil.setTotal(circuitDTODao.selectAllCircuitDTOSearchCount(circuitModuleId));
        //System.out.println("4:"+pageHelperUtil);
        return pageHelperUtil;
    }

    //导出空表格
    @Override
    public List<CircuitDTO> ExportNullCircuitExcel() {
        return circuitDTODao.ExportNullCircuitExcel();
    }


    //导出线路专业模块库Excel表格数据
    @Override
    public List<CircuitDTO> ExportCircuitExcel(String[] ids) {
        return circuitDTODao.ExportCircuitExcel(ids);
    }

    //导入线路专业数据
    @Override
    public boolean importCircuitDTO(
            String circuitModuleNamedto,
            String circuitSubWorkNamedto,
            String circuitProjectNamedto,
            String circuitCriterionNamedto) {
        boolean flag = true;
        try {
            if (circuitModuleNamedto !=null && !circuitModuleNamedto.equals("") && circuitSubWorkNamedto !=null && !circuitSubWorkNamedto.equals("")&& circuitProjectNamedto !=null && !circuitProjectNamedto.equals("")&& circuitCriterionNamedto !=null && !circuitCriterionNamedto.equals("")){
                CircuitModule circuitModule = circuitModuleService.addCircuitModule(circuitModuleNamedto);
                if (circuitModule != null){
                    CircuitSubWork circuitSubWork = circuitSubWorkService.addCircuitSubWork(circuitSubWorkNamedto, circuitModule.getCircuitModuleId());
                    if (circuitSubWork !=null){
                        CircuitInspectionProject circuitInspectionProject = circuitInspectionProjectService.addCircuitInspectionProject(circuitProjectNamedto, circuitSubWork.getCircuitSubWorkId());
                        if (circuitInspectionProject != null){
                            CircuitInspectionCriterion circuitInspectionCriterion = circuitInspectionCriterionService.addCircuitInspectionCriterion(circuitCriterionNamedto, circuitInspectionProject.getCircuitProjectId());
                            if (circuitInspectionCriterion !=null){
                                System.out.println("导入成功");
                                flag = true;
                            }else {
                                System.out.println("导入失败");
                                flag = false;
                            }
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }


}
