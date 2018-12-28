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
public class EquipmentDTOServiceImpl implements EquipmentDTOService {

    @Autowired
    private EquipmentDTODao equimentDTODao;
    @Autowired
    private EquipmentSpecialityService equipmentSpecialityService;
    @Autowired
    private EquipmentSubWorkService equipmentSubWorkService;
    @Autowired
    private EquipmentInspectionProjectService equipmentInspectionProjectService;
    @Autowired
    private EquipmentInspectionCriterionService equipmentInspectionCriterionService;


    @Override
    public PageHelperUtil selectAllEquimentDTODao(int page, int rows) {
        int start = (page-1)*rows+1;
        int end = page*rows;
        //分页处理
        PageHelper.startPage(start,rows);
        List<EquipmentDTODao> equimentDTODaoList = equimentDTODao.selectAllEquimentDTODao(start, end);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(equimentDTODaoList);
        //设置返回总记录数
        PageInfo<EquipmentDTODao> info = new PageInfo<EquipmentDTODao>(equimentDTODaoList);
        pageHelperUtil.setTotal(equimentDTODao.getEquimentDTOCount());
        return pageHelperUtil;
    }

    //根据项目名模糊搜索查询
    @Override
    public PageHelperUtil FuzzysearchEquimentDTODao(int page, int rows, String equipmentProjectName) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (equipmentProjectName !=null && !equipmentProjectName.equals("")){
            equipmentProjectName = "%"+equipmentProjectName+"%";
        }else {
            equipmentProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<EquipmentDTODao> equimentDTODaos = equimentDTODao.FuzzysearchEquimentDTODao(start, end, equipmentProjectName);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(equimentDTODaos);
        //设置返回总记录数
        PageInfo<EquipmentDTODao> info = new PageInfo<EquipmentDTODao>(equimentDTODaos);
        pageHelperUtil.setTotal(equimentDTODao.getFuzzysearchEquimentDTODaoCount(equipmentProjectName));
        return pageHelperUtil;
    }

    //根据点击下拉框名称以及搜索框内容都不为空进行模糊分页查询
    @Override
    public PageHelperUtil selectDropdownBoxAndSearch(int page, int rows, String equipmentSpecialityId, String equipmentProjectName) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (equipmentProjectName !=null && !equipmentProjectName.equals("")){
            equipmentProjectName = "%"+equipmentProjectName+"%";
        }else {
            equipmentProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<EquipmentDTODao> boxAndSearch = equimentDTODao.selectDropdownBoxAndSearch(start, end, equipmentSpecialityId, equipmentProjectName);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(boxAndSearch);
        //设置返回总记录数
        PageInfo<EquipmentDTODao> info = new PageInfo<EquipmentDTODao>(boxAndSearch);
        pageHelperUtil.setTotal(equimentDTODao.getDropdownBoxAndSearch(equipmentSpecialityId,equipmentProjectName));
        return pageHelperUtil;
    }

    //当搜索框内容为空根据模块ID点击下拉框进行搜索分页展示数据
    @Override
    public PageHelperUtil selectEquipmentSpecialityIdAndSeach(int page, int rows, String equipmentSpecialityId) {
        int start = (page-1)*rows+1;
        int end = page*rows;
        //分页处理
        PageHelper.startPage(start,rows);
        List<EquipmentDTODao> list = equimentDTODao.selectEquipmentSpecialityIdAndSeach(start, end, equipmentSpecialityId);
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(list);
        //设置返回总记录数
        PageInfo<EquipmentDTODao> info = new PageInfo<EquipmentDTODao>(list);
        pageHelperUtil.setTotal(equimentDTODao.getEquipmentSpecialityIdAndSeachCount(equipmentSpecialityId));
        return pageHelperUtil;
    }

    //导出设备专业空Excel表格
    @Override
    public List<EquipmentDTO> ExportNullEquipmentExcel() {
        return equimentDTODao.ExportNullEquipmentExcel();
    }
    //导出设备专业模块库Excel表格数据
    @Override
    public List<EquipmentDTO> ExportEquipmentExcel(String[] ids) {
        return equimentDTODao.ExportEquipmentExcel(ids);
    }

    //导入设备专业模块库Excel表格数据
    @Override
    public boolean importEquipmentExcel(
            String equipmentSpecialityNamedto,
            String equipmentSubWorkNamedto,
            String equipmentProjectNamedto,
            String equipmentCriterionNamedto) {
        boolean flag = true;
       try {
          if(equipmentSpecialityNamedto != null && !equipmentSpecialityNamedto.equals("") && equipmentSubWorkNamedto != null && !equipmentSubWorkNamedto.equals("") && equipmentProjectNamedto != null && !equipmentProjectNamedto.equals("") && equipmentCriterionNamedto != null && !equipmentCriterionNamedto.equals("")){
              EquipmentSpeciality equipmentSpeciality = equipmentSpecialityService.addEquipmentSpeciality(equipmentSpecialityNamedto);
              if(equipmentSpeciality != null){
                  EquipmentSubWork equipmentSubWork = equipmentSubWorkService.addEquipmentSubWork(equipmentSubWorkNamedto, equipmentSpeciality.getEquipmentSpecialityId());
                  if(equipmentSubWork != null){
                      EquipmentInspectionProject equipmentInspectionProject = equipmentInspectionProjectService.addEquipmentInspectionProject(equipmentProjectNamedto, equipmentSubWork.getEquipmentSubWorkId());
                      if(equipmentInspectionProject != null) {
                          EquipmentInspectionCriterion equipmentInspectionCriterion = equipmentInspectionCriterionService.addEquipmentInspectionCriterion(equipmentCriterionNamedto, equipmentInspectionProject.getEquipmentProjectId());
                          if (equipmentInspectionCriterion != null) {
                              System.out.println("导入成功");
                              flag = true;
                          } else {
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
