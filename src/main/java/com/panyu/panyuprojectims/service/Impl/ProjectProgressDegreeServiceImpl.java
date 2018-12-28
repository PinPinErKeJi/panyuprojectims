package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.ProjectProgressDegreeDao;
import com.panyu.panyuprojectims.entity.ProjectProgress;
import com.panyu.panyuprojectims.entity.ProjectProgressDegree;
import com.panyu.panyuprojectims.service.ProjectProgressDegreeService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectProgressDegreeServiceImpl implements ProjectProgressDegreeService{
    @Autowired
    private ProjectProgressDegreeDao projectProgressDegreeDao;

    @Override
    public PageHelperUtil selectProjectProgressDegree(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String onSiteSupervision,
            String professionPeople,
            String districtHead) {

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
        if (professionPeople !=null && !professionPeople.equals("")){
            professionPeople = "%"+professionPeople+"%";
        }else {
            professionPeople = null;
        }
        if (districtHead !=null && !districtHead.equals("")){
            districtHead = "%"+districtHead+"%";
        }else {
            districtHead = null;
        }

        //分页处理
        PageHelper.startPage(start,rows);

        List<ProjectProgressDegree> projectProgressDegreeList = projectProgressDegreeDao.selectProjectProgressDegree(page, rows, province, city, county, buildYear, buildingProject, operator, onSiteSupervision,
                 professionPeople,
                 districtHead);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(projectProgressDegreeList);
        //设置返回总记录数
        PageInfo<ProjectProgressDegree> info = new PageInfo<ProjectProgressDegree>(projectProgressDegreeList);
        pageHelperUtil.setTotal(projectProgressDegreeDao.getProjectProgressDegreeRowCount(province,city,county,buildYear,buildingProject,operator, onSiteSupervision,
                 professionPeople,
                 districtHead));
        return pageHelperUtil;
    }

//导出数据
    @Override
    public List<ProjectProgressDegree> ProjectProgressDegreeExcel(String[] ids) {
        return projectProgressDegreeDao.ProjectProgressDegreeExcel(ids);
    }

}