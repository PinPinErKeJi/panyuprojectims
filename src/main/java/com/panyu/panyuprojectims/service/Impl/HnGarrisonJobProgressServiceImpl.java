package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.HnGarrisonJobProgressDao;
import com.panyu.panyuprojectims.entity.HnGarrisonJobProgress;
import com.panyu.panyuprojectims.service.HnGarrisonJobProgressService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnGarrisonJobProgressServiceImpl implements HnGarrisonJobProgressService{
    @Autowired
    private HnGarrisonJobProgressDao hnGarrisonJobProgressDao;

    //分页模糊匹配查询展示驻地网工程进度信息数据
    @Override
    public PageHelperUtil selectHnGarrisonJobProgress(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String singleProjectName,
            String onSiteSupervision,
            String professionResponsiblePerson,
            String districtHead) {
        int start = (page-1)*rows-1;
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
        if (singleProjectName !=null && !singleProjectName.equals("")){
            singleProjectName = "%"+singleProjectName+"%";
        }else {
            singleProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<HnGarrisonJobProgress> hnGarrisonJobProgressList = hnGarrisonJobProgressDao.selectHnGarrisonJobProgress(
                start, end,
                province, city, county, buildYear, buildingProject,
                operator, singleProjectName, onSiteSupervision,
                professionResponsiblePerson, districtHead);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(hnGarrisonJobProgressList);
        //设置返回总记录数
        PageInfo<HnGarrisonJobProgress> pageInfo = new PageInfo<HnGarrisonJobProgress>(hnGarrisonJobProgressList);
        pageHelperUtil.setTotal(hnGarrisonJobProgressDao.getHnGarrisonJobProgressRowCount(
                province,city,county,buildYear,buildingProject,
                operator,singleProjectName,onSiteSupervision,professionResponsiblePerson,districtHead));
        return pageHelperUtil;
    }
    //导出工程进度Excel表格数据
    @Override
    public List<HnGarrisonJobProgress> HnGarrisonJobProgressExcel(String[] ids) {
        return hnGarrisonJobProgressDao.HnGarrisonJobProgressExcel(ids);
    }
}