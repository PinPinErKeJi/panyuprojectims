package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.PowerSupplyProgressDao;
import com.panyu.panyuprojectims.entity.PowerSupplyProgress;
import com.panyu.panyuprojectims.service.PowerSupplyProgressService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerSupplyProgressServiceImpl implements PowerSupplyProgressService{
    @Autowired
    private PowerSupplyProgressDao powerSupplyProgressDao;

    @Override
    public PageHelperUtil selectPowerSupplyProgress(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String siteSupervision,
            String projectLeader) {

        int start = (page-1)*rows+1;
        int end = page*rows;

        if (province !=null && !province.equals("")){
            province = "%"+province+"%";
        }else {
            province = null;
        }
        if (city !=null && !city.equals("")){
            city = "%"+city+"%";
        }else {
            city = null;
        }
        if (county !=null && !county.equals("")){
            county = "%"+county+"%";
        }else {
            county = null;
        }
        if (buildYear !=null && !buildYear.equals("")){
            buildYear = "%"+buildYear+"%";
        }else {
            buildYear = null;
        }
        if (buildingProject !=null && !buildingProject.equals("")){
            buildingProject = "%"+buildingProject+"%";
        }else {
            buildingProject = null;
        }
        if (operator !=null && !operator.equals("")){
            operator = "%"+operator+"%";
        }else {
            operator = null;
        }
        if (siteSupervision !=null && !siteSupervision.equals("")){
            siteSupervision = "%"+siteSupervision+"%";
        }else {
            siteSupervision = null;
        }
        if (projectLeader !=null && !projectLeader.equals("")){
            projectLeader = "%"+projectLeader+"%";
        }else {
            projectLeader = null;
        }

        PageHelper.startPage(start,rows);
        List<PowerSupplyProgress> powerSupplyProgressList = powerSupplyProgressDao.selectPowerSupplyProgress(page, rows, province, city, county, buildYear, buildingProject, operator, siteSupervision, projectLeader);
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(powerSupplyProgressList);
        PageInfo<PowerSupplyProgress> pageInfo = new PageInfo<PowerSupplyProgress>(powerSupplyProgressList);
        pageHelperUtil.setTotal(powerSupplyProgressDao.getPowerSupplyProgressRowCount(province, city, county, buildYear, buildingProject, operator, siteSupervision, projectLeader));
        return pageHelperUtil;
    }
    //导出进度Excel表格数据
    @Override
    public List<PowerSupplyProgress> importPowerSupplyProgressExcel(String[] ids) {
        return powerSupplyProgressDao.importPowerSupplyProgressExcel(ids);
    }
}