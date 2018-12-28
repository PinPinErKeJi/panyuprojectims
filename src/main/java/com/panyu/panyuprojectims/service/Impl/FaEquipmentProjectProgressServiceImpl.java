package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.FaEquipmentProjectProgressDao;
import com.panyu.panyuprojectims.entity.FaEquipmentProjectProgress;
import com.panyu.panyuprojectims.service.FaEquipmentProjectProgressService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaEquipmentProjectProgressServiceImpl implements FaEquipmentProjectProgressService{
    @Autowired
    private FaEquipmentProjectProgressDao faEquipmentProjectProgressDao;
    @Override
    public List<FaEquipmentProjectProgress> FaEquipmentProjectProgressExcel(String[] ids) {
        return faEquipmentProjectProgressDao.FaEquipmentProjectProgressExcel(ids);
    }
    @Override
    public PageHelperUtil selectFaEquipmentProjectProgress(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String onSiteSupervision,
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
        if (onSiteSupervision !=null && !onSiteSupervision.equals("")){
            onSiteSupervision = "%"+onSiteSupervision+"%";
        }else {
            onSiteSupervision = null;
        }
        if (projectLeader !=null && !projectLeader.equals("")){
            projectLeader = "%"+projectLeader+"%";
        }else {
            projectLeader = null;
        }

        //分页处理
        PageHelper.startPage(start,rows);
        List<FaEquipmentProjectProgress> faEquipmentProjectProgressList = faEquipmentProjectProgressDao.selectFaEquipmentProjectProgress(page, rows, province, city, county, buildYear, buildingProject, operator,  onSiteSupervision,
                 projectLeader);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(faEquipmentProjectProgressList);
        //设置返回总记录数
        PageInfo<FaEquipmentProjectProgress> info = new PageInfo<FaEquipmentProjectProgress>(faEquipmentProjectProgressList);
        pageHelperUtil.setTotal(faEquipmentProjectProgressDao.getFaEquipmentProjectProgressRowCount(province, city, county, buildYear, buildingProject, operator,  onSiteSupervision,
                 projectLeader));
        return pageHelperUtil;
    }
}