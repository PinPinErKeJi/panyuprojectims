package com.panyu.panyuprojectims.controller.IC_controller.progress_controller;

import com.panyu.panyuprojectims.entity.IndoorCoverageProgress;
import com.panyu.panyuprojectims.entity.ProjectProgressDegree;
import com.panyu.panyuprojectims.poi.IC_IndoorCoverageProgress_ExportExcel;
import com.panyu.panyuprojectims.poi.ProjectProgressDegreeExcel;
import com.panyu.panyuprojectims.service.IndoorCoverageProgressService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("IC")
public class IndoorCoverageProgressController {

    @Autowired
    private IndoorCoverageProgressService indoorCoverageProgressService;

    @RequestMapping("selectAllIndoorCoverageProgress")
    public @ResponseBody
    PageHelperUtil selectAllIndoorCoverageProgress(
            Integer page,
            Integer rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String professionResponsiblePerson,
            String districtHead,
            String siteLeader
    ){
        PageHelperUtil pageHelperUtil = indoorCoverageProgressService.selectAllIndoorCoverageProgress(
                page, rows, province, city, county, buildYear, operator,
                buildingProject, professionResponsiblePerson, districtHead, siteLeader);
        return pageHelperUtil;
    }


    //导出数据
    @RequestMapping("IndoorCoverageProgress_Excel")
    public void IndoorCoverageProgressExcel(String[] ids, HttpServletRequest request, HttpServletResponse response) {
        try {
            List<IndoorCoverageProgress> indoorCoverageProgressList = indoorCoverageProgressService.export_IndoorCoverageProgress(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet IndoorCoverageProgressSheet = wb.createSheet("室内覆盖工程进度Excel");
            //System.out.println(indoorCoverageProgressList+":controller里面的数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map listmap = IC_IndoorCoverageProgress_ExportExcel.getMap();
            //System.out.println(listmap+"字段数据");
            IC_IndoorCoverageProgress_ExportExcel.createIndoorCoverageProgressExcel(indoorCoverageProgressList,listmap,IndoorCoverageProgressSheet,wb);
            IC_IndoorCoverageProgress_ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

