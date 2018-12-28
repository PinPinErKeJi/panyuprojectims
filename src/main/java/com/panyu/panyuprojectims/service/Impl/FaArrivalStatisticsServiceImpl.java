package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.FaArrivalStatisticsDao;
import com.panyu.panyuprojectims.entity.FaArrivalStatistics;
import com.panyu.panyuprojectims.entity.FaEquipmentInformation;
import com.panyu.panyuprojectims.service.FaArrivalStatisticsService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaArrivalStatisticsServiceImpl implements FaArrivalStatisticsService{
    @Autowired
    private FaArrivalStatisticsDao faArrivalStatisticsDao;

    //数据导出
    @Override
    public List<FaArrivalStatistics> FaArrivalStatisticsExcel(String[] ids) {
        return faArrivalStatisticsDao.FaArrivalStatisticsExcel(ids);
    }

    @Override
    public PageHelperUtil selectFaArrivalStatistics(
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
        List<FaArrivalStatistics> faArrivalStatisticsList = faArrivalStatisticsDao.selectFaArrivalStatistics(page,rows, province, city, county, buildYear, buildingProject, operator,onSiteSupervision,
                 projectLeader
                );
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(faArrivalStatisticsList);
        //设置返回总记录数
        PageInfo<FaArrivalStatistics> info = new PageInfo<FaArrivalStatistics>(faArrivalStatisticsList);
        pageHelperUtil.setTotal(faArrivalStatisticsDao.getFaArrivalStatisticsRowCount(province,city,county,buildYear,buildingProject,operator,onSiteSupervision,
                projectLeader));
        return pageHelperUtil;
    }

}