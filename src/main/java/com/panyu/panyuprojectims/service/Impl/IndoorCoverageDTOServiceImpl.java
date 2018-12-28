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
public class IndoorCoverageDTOServiceImpl implements IndoorCoverageDTOService {

    @Autowired
    private IndoorCoverageDTODao indoorCoverageDTODao;
    @Autowired
    private IndoorCoverageModuleService indoorCoverageModuleService;
    @Autowired
    private IndoorCoverageSubWorkService indoorCoverageSubWorkService;
    @Autowired
    private IndoorCoverageProjectService indoorCoverageProjectService;
    @Autowired
    private IndoorCoverageSpecificationService indoorCoverageSpecificationService;

    //无条件分页查询展示室内覆盖信息数据
    @Override
    public PageHelperUtil selectIndoorCoverageDTO(int page, int rows) {
        int start = (page - 1) * rows + 1;
        int end = page * rows;
        //分页处理
        PageHelper.startPage(start, rows);
        List<IndoorCoverageDTO> indoorCoverageDTOList = indoorCoverageDTODao.selectIndoorCoverageDTO(start, end);
        //System.out.println("indoorCoverageDTOList 1:" + indoorCoverageDTOList);
        //创建对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(indoorCoverageDTOList);
        //设置接收总记录数
        PageInfo<IndoorCoverageDTO> pageInfo = new PageInfo<IndoorCoverageDTO>(indoorCoverageDTOList);
        pageHelperUtil.setTotal(indoorCoverageDTODao.selectIndoorCoverageDTOCount());
        return pageHelperUtil;
    }

    //根据检查项目名模糊匹配搜索查询信息展示
    @Override
    public PageHelperUtil selectFuzzysearchIndoorCoverageDTO(int page, int rows, String indoorProjectName) {
        int start = (page - 1) * rows + 1;
        int end = page * rows;

        if (indoorProjectName != null && !indoorProjectName.equals("")) {
            indoorProjectName = "%" + indoorProjectName + "%";
        } else {
            indoorProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start, rows);
        List<IndoorCoverageDTO> indoorCoverageDTOS = indoorCoverageDTODao.selectFuzzysearchIndoorCoverageDTO(start, end, indoorProjectName);
        //System.out.println("indoorCoverageDTOS 2:" + indoorCoverageDTOS);
        //创建对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(indoorCoverageDTOS);
        //设置接收总记录数
        PageInfo<IndoorCoverageDTO> pageInfo = new PageInfo<IndoorCoverageDTO>(indoorCoverageDTOS);
        pageHelperUtil.setTotal(indoorCoverageDTODao.getFuzzysearchIndoorCoverageDTOCount(indoorProjectName));
        return pageHelperUtil;
    }

    //根据点击下拉框模块名以及搜索框内容模糊匹配查询信息展示
    @Override
    public PageHelperUtil selectIndoorCoverageDTOByIdAndName(
            int page, int rows,
            String indoorCoverageId,
            String indoorProjectName) {
        int start = (page - 1) * rows + 1;
        int end = page * rows;

        if (indoorProjectName != null && !indoorProjectName.equals("")) {
            indoorProjectName = "%" + indoorProjectName + "%";
        } else {
            indoorProjectName = null;
        }
        //分页出来
        PageHelper.startPage(start, rows);
        List<IndoorCoverageDTO> coverageDTOList = indoorCoverageDTODao.selectIndoorCoverageDTOByIdAndName(start, end, indoorCoverageId, indoorProjectName);
        //System.out.println("coverageDTOList 3:" + coverageDTOList);
        //创建对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(coverageDTOList);
        //设置接收总记录数
        PageInfo<IndoorCoverageDTO> pageInfo = new PageInfo<IndoorCoverageDTO>(coverageDTOList);
        pageHelperUtil.setTotal(indoorCoverageDTODao.getIndoorCoverageDTOByIdAndNameCount(indoorCoverageId, indoorProjectName));
        return pageHelperUtil;
    }

    //根据点击下拉框模块名分页查询展示信息数据
    @Override
    public PageHelperUtil selectAllIndoorCoverageDTOById(int page, int rows, String indoorCoverageId) {
        int start = (page - 1) * rows + 1;
        int end = page * rows;
        //分页处理
        PageHelper.startPage(start, rows);
        List<IndoorCoverageDTO> dtoList = indoorCoverageDTODao.selectAllIndoorCoverageDTOById(start, end, indoorCoverageId);
        //System.out.println("dtoList 4:" + dtoList);
        //创建对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(dtoList);
        //设置返回总条数
        PageInfo<IndoorCoverageDTO> pageInfo = new PageInfo<IndoorCoverageDTO>(dtoList);
        pageHelperUtil.setTotal(indoorCoverageDTODao.getIndoorCoverageDTOByIdCount(indoorCoverageId));
        return pageHelperUtil;
    }

    //导出空表格
    @Override
    public List<IndoorCoverageDTO> exportExcelIndoorCoverage() {
        return indoorCoverageDTODao.exportExcelIndoorCoverage();
    }

    //导出模块数据
    @Override
    public List<IndoorCoverageDTO> exportGarrisonIndoorCoverage(String[] ids) {
        return indoorCoverageDTODao.exportIndoorCoverage(ids);
    }




    //导入Excel数据到数据库
    public boolean insertDTO(String indoorCoverageNamedto, String indoorSubWorkNamedto, String indoorProjectNamedto, String indoorSpecificationNamedto) {
        boolean flag = true;
        try {
            if(indoorCoverageNamedto != null && !indoorCoverageNamedto.equals("") && indoorSubWorkNamedto != null && !indoorSubWorkNamedto.equals("") && indoorProjectNamedto != null && !indoorProjectNamedto.equals("") &&  indoorSpecificationNamedto != null && !indoorSpecificationNamedto.equals("")){
                IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleService.addIndoorCoverageModule(indoorCoverageNamedto);
                if(indoorCoverageModule != null){
                    IndoorCoverageSubWork indoorCoverageSubWork = indoorCoverageSubWorkService.addIndoorCoverageSubWork(indoorSubWorkNamedto, indoorCoverageModule.getIndoorCoverageId());
                    if(indoorCoverageSubWork != null){
                        IndoorCoverageProject indoorCoverageProject = indoorCoverageProjectService.addIndoorCoverageProject(indoorProjectNamedto, indoorCoverageSubWork.getIndoorSubWorkId());
                        if(indoorCoverageProject != null){
                            IndoorCoverageSpecification indoorCoverageSpecification = indoorCoverageSpecificationService.addIndoorCoverageSpecification(indoorSpecificationNamedto, indoorCoverageProject.getIndoorProjectId());
                            if(indoorCoverageSpecification != null){
                                System.out.println("成功");
                                flag = true;
                            }else {
                                System.out.println("失败");
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