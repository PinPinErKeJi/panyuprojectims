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
public class GarrisonDTOServiceImpl implements GarrisonDTOService {

    @Autowired
    private GarrisonDTODao garrisonDTODao;
    @Autowired
    private GarrisonSubWorkService garrisonSubWorkService;
    @Autowired
    private GarrisonService garrisonService;
    @Autowired
    private GarrisonInspectionProjectService garrisonInspectionProjectService;
    @Autowired
    private GarrisonInspectionCriterionService garrisonInspectionCriterionService;

    //无条件分页查询展示模块数据
    @Override
    public PageHelperUtil selectAllGarrisonDTO(int page, int rows) {
        int start = (page-1)*rows+1;
        int end = page*rows;
        //分页处理
        PageHelper.startPage(start,rows);
        List<GarrisonDTO> garrisonDTOList = garrisonDTODao.selectAllGarrisonDTO(start,end);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(garrisonDTOList);
        //设置返回总记录数
        PageInfo<GarrisonDTO> pageInfo = new PageInfo<GarrisonDTO>(garrisonDTOList);
        pageHelperUtil.setTotal(garrisonDTODao.selectAllGarrisonDTOCount());
        //System.out.println("1:"+pageHelperUtil);
        return pageHelperUtil;
    }
    //根据检查项目名分页模糊匹配查询
    @Override
    public PageHelperUtil FuzzysearchGarrisonDTO(int page, int rows, String garrisonProjectName) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (garrisonProjectName !=null && !garrisonProjectName.equals("")){
            garrisonProjectName = "%"+garrisonProjectName+"%";
        }else {
            garrisonProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<GarrisonDTO> garrisonDTOS = garrisonDTODao.FuzzysearchGarrisonDTO(start,end, garrisonProjectName);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(garrisonDTOS);
        //设置返回总记录数
        PageInfo<GarrisonDTO> pageInfo = new PageInfo<GarrisonDTO>(garrisonDTOS);
        pageHelperUtil.setTotal(garrisonDTODao.getFuzzysearchGarrisonDTOCount(garrisonProjectName));
        //System.out.println("2:"+pageHelperUtil);
        return pageHelperUtil;
    }

    //根据点击下拉框获取模块名称以及搜索框中的内容进行分页模糊匹配查询
    @Override
    public PageHelperUtil selectAllDropdownBoxAndSearchGarrisonDTO(int page,int rows,String garrisonId, String garrisonProjectName) {

        int start = (page-1)*rows+1;
        int end = page*rows;

        if (garrisonProjectName !=null && !garrisonProjectName.equals("")){
            garrisonProjectName = "%"+garrisonProjectName+"%";
        }else {
            garrisonProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<GarrisonDTO> dtoList = garrisonDTODao.selectAllDropdownBoxAndSearchGarrisonDTO(start,end, garrisonId, garrisonProjectName);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(dtoList);
        //设置返回总计录数
        PageInfo<GarrisonDTO> pageInfo = new PageInfo<GarrisonDTO>();
        pageHelperUtil.setTotal(garrisonDTODao.selectDropdownBoxAndSearchCount(garrisonId,garrisonProjectName));
        //System.out.println("3:"+pageHelperUtil);
        return pageHelperUtil;
    }

    //根据模块名为空以及搜索框内容进行分页模糊匹配查询
    @Override
    public PageHelperUtil selectAllGarrisonDTOSearchList(int page, int rows, String garrisonId) {

        int start = (page-1)*rows+1;
        int end = page*rows;

        //分页处理
        PageHelper.startPage(start,rows);
        List<GarrisonDTO> list = garrisonDTODao.selectAllGarrisonDTOSearchList(start,end, garrisonId);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(list);
        //设置返回总记录数
        PageInfo<GarrisonDTO> pageInfo = new PageInfo<GarrisonDTO>(list);
        pageHelperUtil.setTotal(garrisonDTODao.selectAllGarrisonDTOSearchCount(garrisonId));
        //System.out.println("4:"+pageHelperUtil);
        return pageHelperUtil;
    }

    //导出空表格
    @Override
    public List<GarrisonDTO> exportExcel() {
        return garrisonDTODao.exportExcel();
    }

    //导出模块数据
    @Override
    public List<GarrisonDTO> exportGarrison(String[] ids) {
        return garrisonDTODao.exportGarrison(ids);
    }

    //导入Excel数据到数据库
    @Override
    public boolean insertDTO(String garrisonNamedto, String garrisonSubWorkNamedto, String garrisonProjectNamedto, String garrisonCriterionNamedto) {
        boolean flag = true;
       try {
           if(garrisonNamedto != null && !garrisonNamedto.equals("") && garrisonSubWorkNamedto != null && !garrisonSubWorkNamedto.equals("") && garrisonProjectNamedto != null && !garrisonProjectNamedto.equals("") &&  garrisonCriterionNamedto != null && !garrisonCriterionNamedto.equals("")){
               Garrison garrison = garrisonService.addGarrison(garrisonNamedto);
               //System.out.println(garrison);
               if(garrison != null){
                   GarrisonSubWork garrisonSubWork = garrisonSubWorkService.addGarrisonSubWork(garrisonSubWorkNamedto, garrison.getGarrisonId());
                   if(garrisonSubWork != null){
                       GarrisonInspectionProject garrisonInspectionProject = garrisonInspectionProjectService.addGarrisonInspectionProject(garrisonProjectNamedto, garrisonSubWork.getGarrisonSubWorkId());
                       if(garrisonInspectionProject != null){
                           GarrisonInspectionCriterion garrisonInspectionCriterion = garrisonInspectionCriterionService.addGarrisonInspectionCriterion(garrisonCriterionNamedto, garrisonInspectionProject.getGarrisonProjectId());
                           if(garrisonInspectionCriterion != null){
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
       }catch (Exception e){
           e.printStackTrace();
       }
        return flag;
    }
}
