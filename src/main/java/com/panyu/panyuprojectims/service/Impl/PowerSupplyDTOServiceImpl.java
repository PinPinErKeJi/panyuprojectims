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
public class PowerSupplyDTOServiceImpl implements PowerSupplyDTOService {

    @Autowired
    private PowerSupplyDTODao powerSupplyDTODao;
    @Autowired
    private PowerSupplyModuleService powerSupplyModuleService;
    @Autowired
    private PowerSubWorkService powerSubWorkService;
    @Autowired
    private PowerSupplyProjectService powerSupplyProjectService;
    @Autowired
    private PowerSupplyCriterionService powerSupplyCriterionService;

    //1.
    @Override
    public PageHelperUtil selectAllPowerSupplyDTO(int page, int rows) {
        int start = (page-1)*rows+1;
        int end = page*rows;
        //分页处理
        PageHelper.startPage(start,rows);
        List<PowerSupplyDTO> powerSupplyDTOList = powerSupplyDTODao.selectAllPowerSupplyDTO(start,end);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(powerSupplyDTOList);
        //设置返回总记录数
        PageInfo<PowerSupplyDTO> pageInfo = new PageInfo<PowerSupplyDTO>(powerSupplyDTOList);
        pageHelperUtil.setTotal(powerSupplyDTODao.selectAllPowerSupplyDTOCount());
        //System.out.println("1:"+pageHelperUtil);
        return pageHelperUtil;
    }

    //2.
    @Override
    public PageHelperUtil FuzzysearchPowerSupplyDTO(int page, int rows, String powerProjectName) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (powerProjectName !=null && !powerProjectName.equals("")){
            powerProjectName = "%"+powerProjectName+"%";
        }else {
            powerProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<PowerSupplyDTO> powerSupplyDTO = powerSupplyDTODao.FuzzysearchPowerSupplyDTO(start,end, powerProjectName);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(powerSupplyDTO);
        //设置返回总记录数
        PageInfo<PowerSupplyDTO> pageInfo = new PageInfo<PowerSupplyDTO>(powerSupplyDTO);
        pageHelperUtil.setTotal(powerSupplyDTODao.getFuzzysearchPowerSupplyDTOCount(powerProjectName));
        //System.out.println("2:"+pageHelperUtil);
        return pageHelperUtil;
    }

    //3.
    @Override
    public PageHelperUtil selectAllDropdownBoxAndSearchPowerSupplyDTO(int page, int rows, String powerModuleId, String powerProjectName) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (powerProjectName !=null && !powerProjectName.equals("")){
            powerProjectName = "%"+powerProjectName+"%";
        }else {
            powerProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<PowerSupplyDTO> dtoList = powerSupplyDTODao.selectAllDropdownBoxAndSearchPowerSupplyDTO(start,end, powerModuleId, powerProjectName);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(dtoList);
        //设置返回总计录数
        PageInfo<PowerSupplyDTO> pageInfo = new PageInfo<PowerSupplyDTO>();
        pageHelperUtil.setTotal(powerSupplyDTODao.selectDropdownBoxAndSearchCount(powerModuleId,powerProjectName));
        //System.out.println("3:"+pageHelperUtil);
        return pageHelperUtil;
    }

    //4.
    @Override
    public PageHelperUtil selectAllPowerSupplyDTOSearchList(int page, int rows, String powerModuleId) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        //分页处理
        PageHelper.startPage(start,rows);
        List<PowerSupplyDTO> list = powerSupplyDTODao.selectAllPowerSupplyDTOSearchList(start,end, powerModuleId);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(list);
        //设置返回总记录数
        PageInfo<PowerSupplyDTO> pageInfo = new PageInfo<PowerSupplyDTO>(list);
        pageHelperUtil.setTotal(powerSupplyDTODao.selectAllPowerSupplyDTOSearchCount(powerModuleId));
        //System.out.println("4:"+pageHelperUtil);
        return pageHelperUtil;
    }

    //导出空表格
    @Override
    public List<PowerSupplyDTO> ExportNullPowerSupplyExcel() {
        return powerSupplyDTODao.ExportNullPowerSupplyExcel();
    }

    //导出数据
    @Override
    public List<PowerSupplyDTO> ExportPowerSupplyExcel(String[] ids) {
        return powerSupplyDTODao.ExportPowerSupplyExcel(ids);
    }

    //导入数据
    @Override
    public boolean importPowerSupplyDTO(String powerModuleName, String powerSubWorkName, String powerProjectName, String powerCriterionName) {
        boolean flag = true;
        try {
            if(powerModuleName != null && !powerModuleName.equals("") && powerSubWorkName != null && !powerSubWorkName.equals("") && powerProjectName != null && !powerProjectName.equals("") && powerCriterionName != null && !powerCriterionName.equals("")){
                PowerSupplyModule powerSupplyModule = powerSupplyModuleService.insertPowerSupplyModule(powerModuleName);
                if(powerSupplyModule != null){
                    PowerSubWork powerSubWork = powerSubWorkService.insertPowerSubWork(powerSubWorkName, powerSupplyModule.getPowerModuleId());
                    if(powerSubWork != null){
                        PowerSupplyProject powerSupplyProject = powerSupplyProjectService.insertPowerSupplyProject(powerProjectName, powerSubWork.getPowerSubWorkId());
                        if(powerSupplyProject != null){
                            PowerSupplyCriterion powerSupplyCriterion = powerSupplyCriterionService.insertPowerSupplyCriterion(powerCriterionName, powerSupplyProject.getPowerProjectId());
                            if(powerSupplyCriterion != null){
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
