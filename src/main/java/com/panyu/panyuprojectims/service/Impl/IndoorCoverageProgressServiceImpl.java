package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.IndoorCoverageProgressDao;
import com.panyu.panyuprojectims.entity.IndoorCoverageProgress;
import com.panyu.panyuprojectims.service.IndoorCoverageProgressService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndoorCoverageProgressServiceImpl implements IndoorCoverageProgressService{
    @Autowired
    private IndoorCoverageProgressDao indoorCoverageProgressDao;


    //导出
    @Override
    public List<IndoorCoverageProgress> export_IndoorCoverageProgress(String[] ids) {
        return indoorCoverageProgressDao.export_IndoorCoverageProgress(ids);
    }



    //分页模糊匹配查询展示室内覆盖工程进度基本信息
    @Override
    public PageHelperUtil selectAllIndoorCoverageProgress(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String professionResponsiblePerson,
            String districtHead,
            String siteLeader) {

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
        if (operator !=null && !operator.equals("")){
            operator = "%"+operator+"%";
        }else {
            operator = null;
        }
        if (buildingProject !=null && !buildingProject.equals("")){
            buildingProject = "%"+buildingProject+"%";
        }else {
            buildingProject = null;
        }
        if (professionResponsiblePerson !=null && !professionResponsiblePerson.equals("")){
            professionResponsiblePerson = "%"+professionResponsiblePerson+"%";
        }else {
            professionResponsiblePerson = null;
        }
        if (districtHead !=null && !districtHead.equals("")){
            districtHead = "%"+districtHead+"%";
        }else {
            districtHead = null;
        }
        if (siteLeader !=null && !siteLeader.equals("")){
            siteLeader = "%"+siteLeader+"%";
        }else {
            siteLeader = null;
        }

        //分页处理
        PageHelper.startPage(start,rows);
        List<IndoorCoverageProgress> indoorCoverageProgressList = indoorCoverageProgressDao.selectAllIndoorCoverageProgress(
                start, end, province, city, county, buildYear, operator,
                buildingProject, professionResponsiblePerson, districtHead, siteLeader);
        //创建对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(indoorCoverageProgressList);
        //设置接收返回值
        PageInfo<IndoorCoverageProgress> pageInfo = new PageInfo<IndoorCoverageProgress>(indoorCoverageProgressList);
        pageHelperUtil.setTotal(indoorCoverageProgressDao.getIndoorCoverageProgressRowCount(
                province, city, county, buildYear, operator, buildingProject, professionResponsiblePerson, districtHead, siteLeader));
        return pageHelperUtil;
    }


}