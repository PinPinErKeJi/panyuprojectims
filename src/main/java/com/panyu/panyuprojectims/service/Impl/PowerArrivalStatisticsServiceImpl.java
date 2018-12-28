package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.PowerArrivalStatisticsDao;
import com.panyu.panyuprojectims.entity.PowerArrivalStatistics;
import com.panyu.panyuprojectims.service.PowerArrivalStatisticsService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerArrivalStatisticsServiceImpl implements PowerArrivalStatisticsService{
    @Autowired
    private PowerArrivalStatisticsDao powerArrivalStatisticsDao;

    //分页查询展示统计数据
    @Override
    public PageHelperUtil selectPowerArrivalStatistics(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
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
        List<PowerArrivalStatistics> powerArrivalStatisticsList = powerArrivalStatisticsDao.selectPowerArrivalStatistics(page, rows, province, city, county, buildYear, operator, buildingProject, siteSupervision, projectLeader);
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(powerArrivalStatisticsList);
        PageInfo<PowerArrivalStatistics> pageInfo = new PageInfo<PowerArrivalStatistics>(powerArrivalStatisticsList);
        pageHelperUtil.setTotal(powerArrivalStatisticsDao.getPowerArrivalStatisticsRowCount(province, city, county, buildYear, operator, buildingProject, siteSupervision, projectLeader));
        return pageHelperUtil;
    }
}