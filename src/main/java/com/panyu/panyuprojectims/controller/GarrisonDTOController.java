package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.GarrisonDTO;
import com.panyu.panyuprojectims.entity.PanyuDTO;
import com.panyu.panyuprojectims.poi.*;
import com.panyu.panyuprojectims.service.GarrisonDTOService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class GarrisonDTOController {

    @Autowired
    private GarrisonDTOService garrisonDTOService;

    @RequestMapping("selectAllGarrisonDTOList")
    public @ResponseBody
    PageHelperUtil selectAllGarrisonDTOList(Integer page,Integer rows,String garrisonId,String garrisonProjectName){
        PageHelperUtil pageHelperUtil = null;
        if (garrisonProjectName == "" && garrisonId ==""){
            pageHelperUtil = garrisonDTOService.selectAllGarrisonDTO(page, rows);
            return pageHelperUtil;
        }
        if (garrisonId == "" && garrisonProjectName !="" && garrisonProjectName != null){
            pageHelperUtil = garrisonDTOService.FuzzysearchGarrisonDTO(page, rows, garrisonProjectName);
            return pageHelperUtil;
        }
        if (garrisonId !=null && garrisonProjectName !=""){
            pageHelperUtil = garrisonDTOService.selectAllDropdownBoxAndSearchGarrisonDTO(page, rows, garrisonId, garrisonProjectName);
            return pageHelperUtil;
        }
        if (garrisonId !=null && garrisonProjectName ==""){
            pageHelperUtil = garrisonDTOService.selectAllGarrisonDTOSearchList(page, rows, garrisonId);
            return pageHelperUtil;
        }
        return pageHelperUtil;
    }

    //导出空表格
    @RequestMapping("exportExcel_Garrison")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<GarrisonDTO> garrisonDTOList= garrisonDTOService.exportExcel();
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet garrisonSheet = wb.createSheet("驻地网模块Excel");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            ExportExcel_Garrison.createExcelOfUser(null,garrisonSheet);
            ExportExcel_Garrison.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出
    @RequestMapping("exportGarrison")
    public void exportUser(String[] ids, HttpServletRequest request, HttpServletResponse response) {
        //System.out.println("ids:"+ids);
        try {
            List<GarrisonDTO> garrisonDTOList= garrisonDTOService.exportGarrison(ids);
            //System.out.println("导出的数据:"+garrisonDTOList);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet garrisonSheet = wb.createSheet("驻地网模块");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";

            ExportExcelFor_Garrison.createExcelOfUser(garrisonDTOList,garrisonSheet);
            ExportExcelFor_Garrison.setAttachmentFileName(request,response,fileName);
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
    @RequestMapping("parseExcel_Garrison")
    public @ResponseBody
    Map parseExcel(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            ParseExcelFor_Garrison.parseAndImportGarrison(inputStream,name,garrisonDTOService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }
}
