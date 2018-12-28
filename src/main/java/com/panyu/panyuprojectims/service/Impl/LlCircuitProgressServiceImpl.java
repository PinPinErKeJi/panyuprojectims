package com.panyu.panyuprojectims.service.Impl;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.LlCircuitProgressDao;
import com.panyu.panyuprojectims.entity.FaEquipmentInformation;
import com.panyu.panyuprojectims.entity.LlCircuitProgress;
import com.panyu.panyuprojectims.service.LlCircuitProgressService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LlCircuitProgressServiceImpl implements LlCircuitProgressService{
    @Autowired
    private LlCircuitProgressDao llCircuitProgressDao;

    //数据展示和模糊查询
    @Override
    public PageHelperUtil selectLlCircuitProgress(
                                                    int page,
                                                    int rows,
                                                    String province,
                                                    String city,
                                                    String county,
                                                    String buildYear,
                                                    String operator,
                                                    String buildingProject,
                                                    String siteLeader,
                                                    String professionResponsiblePerson,
                                                    String districtHead){

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
        if (siteLeader !=null && !siteLeader.equals("")){
            siteLeader = "%"+siteLeader+"%";
        }else {
            siteLeader = null;
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
        //分页处理
        PageHelper.startPage(start,rows);
        List<LlCircuitProgress> llCircuitProgressList = llCircuitProgressDao.selectLlCircuitProgress( page,
         rows,
         province,
         city,
         county,
         buildYear,
         operator,
         buildingProject,
         siteLeader,
         professionResponsiblePerson,
         districtHead);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(llCircuitProgressList);
        //设置返回总记录数
        PageInfo<LlCircuitProgress> info = new PageInfo<LlCircuitProgress>(llCircuitProgressList);
        pageHelperUtil.setTotal(llCircuitProgressDao.getLlCircuitProgressRowCount(
                province,
                city,
                county,
                buildYear,
                operator,
                buildingProject,
                siteLeader,
                professionResponsiblePerson,
                districtHead));
        return pageHelperUtil;
    }

    //导出数据
    @Override
    public List<LlCircuitProgress> importLlCircuitProgressExcel(String[] ids) {
        return llCircuitProgressDao.importLlCircuitProgressExcel(ids);
    }
}