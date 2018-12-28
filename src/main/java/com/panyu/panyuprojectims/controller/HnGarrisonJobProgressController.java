package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.HnGarrisonJobProgress;
import com.panyu.panyuprojectims.poi.HN_ExportGarrisonJobProgressExcel;
import com.panyu.panyuprojectims.service.HnGarrisonJobProgressService;
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
public class HnGarrisonJobProgressController {

    @Autowired
    private HnGarrisonJobProgressService hnGarrisonJobProgressService;

    @RequestMapping("selectHnGarrisonJobProgress")
    public @ResponseBody
    PageHelperUtil selectHnGarrisonJobProgress(
            int page,
            int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String singleProjectName,
            String onSiteSupervision,
            String professionResponsiblePerson,
            String districtHead
    ){
        PageHelperUtil pageHelperUtil = hnGarrisonJobProgressService.selectHnGarrisonJobProgress(
                page, rows, province, city, county, buildYear, buildingProject,
                operator, singleProjectName, onSiteSupervision, professionResponsiblePerson, districtHead);
        return pageHelperUtil;
    }

    //导出数据
    @RequestMapping("HnGarrisonJobProgressExcel")
    public void HnGarrisonJobProgressExcel(String[] ids, HttpServletRequest request, HttpServletResponse response) {
        try {
            List<HnGarrisonJobProgress> hnGarrisonJobProgressList = hnGarrisonJobProgressService.HnGarrisonJobProgressExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet HnGarrisonJobProgressSheet = wb.createSheet("驻地网工程进度信息表");
            //System.out.println(hnGarrisonJobProgressList+":controller里面的数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map listmap = HN_ExportGarrisonJobProgressExcel.getMap();
            //System.out.println(listmap+"字段数据");
            HN_ExportGarrisonJobProgressExcel.createHnGarrisonJobProgressExcel(hnGarrisonJobProgressList,listmap,HnGarrisonJobProgressSheet,wb);
            HN_ExportGarrisonJobProgressExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
