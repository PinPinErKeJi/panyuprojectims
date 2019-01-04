package com.panyu.panyuprojectims.controller.BS_controller.module_controller;

import com.panyu.panyuprojectims.entity.PanyuDTO;
import com.panyu.panyuprojectims.poi.ExportExcel;
import com.panyu.panyuprojectims.poi.ExportExcelForModule;
import com.panyu.panyuprojectims.poi.ParseExcelForModule;
import com.panyu.panyuprojectims.service.*;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("BS")
public class PanyuDTOController {
    @Autowired
    private PanyuDTOService panyuDTOService;

    @RequestMapping("getItemList")
    public @ResponseBody
    PageHelperUtil getItemList(String moduleId,@RequestParam("projectName") String projectName,Integer page, Integer rows) {
        //System.out.println(moduleId+projectName);
        PageHelperUtil pageHelperUtil = null;
        if (moduleId==""&&projectName==""){
            pageHelperUtil = panyuDTOService.selectAllPanyuDTO(page, rows);
            return pageHelperUtil;
        }
        if (moduleId==""&&projectName!=null&&projectName!=""){
            pageHelperUtil = panyuDTOService.FuzzyqueryProjectName(page, rows, projectName);
            return pageHelperUtil;
        }
        if (moduleId!=""&&projectName!=""){
            pageHelperUtil = panyuDTOService.selectModuleNameAndProjectName(page, rows, projectName, moduleId);
            return pageHelperUtil;
        }
        if (moduleId!=""&&projectName==""){
            pageHelperUtil = panyuDTOService.selectFuzzyqueryModuleId(page, rows, moduleId);
            return pageHelperUtil;
        }
        return pageHelperUtil;
    }

    //导出空表格
    @RequestMapping("exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<PanyuDTO> panyuDTOList= panyuDTOService.exportExcel();
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet moduleSheet = wb.createSheet("module");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            ExportExcel.createExcelOfUser(null,moduleSheet);
            ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出
    @RequestMapping("exportModule")
    public void exportUser(String[] ids, HttpServletRequest request, HttpServletResponse response) {
        try {
            List<PanyuDTO> panyuDTOList= panyuDTOService.exportModule(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet moduleSheet = wb.createSheet("module");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";

            ExportExcelForModule.createExcelOfUser(panyuDTOList,moduleSheet);
            ExportExcelForModule.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //设置Excel表头
    public void setTitle(HSSFWorkbook workbook,HSSFSheet sheet){
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256字符宽度
        sheet.setColumnWidth(0,10*256);
        sheet.setColumnWidth(1,20*256);
        sheet.setColumnWidth(2,20*256);
        sheet.setColumnWidth(3,200*256);
        sheet.setColumnWidth(4,20*256);
        sheet.setColumnWidth(5,200*256);
        sheet.setColumnWidth(6,100*256);
    }

    //导入
    @RequestMapping("parseExcel")
    public @ResponseBody Map parseExcel(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            ParseExcelForModule.parseAndImportModule(inputStream,name,panyuDTOService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }
}

