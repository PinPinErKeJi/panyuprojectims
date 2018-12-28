package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.ProjectProgressDegree;
import com.panyu.panyuprojectims.poi.ProjectProgressDegreeExcel;
import com.panyu.panyuprojectims.service.ProjectProgressDegreeService;
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
public class ProjectProgressDegreeController {

    @Autowired
    private ProjectProgressDegreeService projectProgressDegreeService;

    @RequestMapping("selectProjectProgressDegree")
    public @ResponseBody PageHelperUtil selectProjectProgressDegree(Integer page, Integer rows,
                                                                    String province,
                                                                    String city,
                                                                    String county,
                                                                    String buildYear,
                                                                    String buildingProject,
                                                                    String operator,
                                                                    String onSiteSupervision,
                                                                    String professionPeople,
                                                                    String districtHead){
        //System.out.println("监理:"+onSiteSupervision);
        PageHelperUtil pageHelperUtil = projectProgressDegreeService.selectProjectProgressDegree(
                page, rows,
                province,
                city,
                county,
                buildYear,
                buildingProject,
                operator,
                onSiteSupervision,
                professionPeople,
                districtHead);
        return pageHelperUtil;
    }


    @RequestMapping("ProjectProgressDegreeExcel")
    public void ProjectProgressDegreeExcel(String[] ids, HttpServletRequest request, HttpServletResponse response) {
        try {
            List<ProjectProgressDegree> projectProgressDegreeList = projectProgressDegreeService.ProjectProgressDegreeExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet ProjectProgressDegreeSheet = wb.createSheet("ProjectProgressDegree");
            //System.out.println(projectProgressDegreeList+":controller里面的数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map listmap = ProjectProgressDegreeExcel.getListmap();
            //System.out.println(listmap+"字段数据");
            ProjectProgressDegreeExcel.createExcelOfProjectDegree(projectProgressDegreeList,listmap,ProjectProgressDegreeSheet,wb);
            ProjectProgressDegreeExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
