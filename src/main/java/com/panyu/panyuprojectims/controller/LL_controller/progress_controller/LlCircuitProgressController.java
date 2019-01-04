package com.panyu.panyuprojectims.controller.LL_controller.progress_controller;

import com.panyu.panyuprojectims.entity.LlCircuitProgress;
import com.panyu.panyuprojectims.poi.LL_ExportLlCircuitProgress_Excel;
import com.panyu.panyuprojectims.service.LlCircuitProgressService;
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
@RequestMapping("LL")
public class LlCircuitProgressController {
    @Autowired private LlCircuitProgressService llCircuitProgressService;


    //数据展示和模糊查询
    @RequestMapping("selectAllLlCircuitProgress")
    public @ResponseBody
    PageHelperUtil selectAllLlCircuitProgress(
            Integer page,
            Integer rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String siteLeader,
            String professionResponsiblePerson,
            String districtHead
    ){
        PageHelperUtil pageHelperUtil = llCircuitProgressService.selectLlCircuitProgress(
         page,
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
        return pageHelperUtil;
    }

    //导出数据
    @RequestMapping("LLExportLlCircuitProgressExcel")
    public void LLExportLlCircuitProgressExcel(String[] ids, HttpServletRequest request, HttpServletResponse response) {
        try {
            List<LlCircuitProgress> llCircuitProgressList = llCircuitProgressService.importLlCircuitProgressExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet Sheet = wb.createSheet("线路进度信息数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map map = LL_ExportLlCircuitProgress_Excel.getMap();
            LL_ExportLlCircuitProgress_Excel.createLlCircuitProgressExcel(llCircuitProgressList,map,Sheet,wb);
            LL_ExportLlCircuitProgress_Excel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
