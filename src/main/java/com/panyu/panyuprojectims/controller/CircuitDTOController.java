package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.CircuitDTO;
import com.panyu.panyuprojectims.poi.*;
import com.panyu.panyuprojectims.service.CircuitDTOService;
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
public class CircuitDTOController {
    @Autowired private CircuitDTOService circuitDTOService;



    //模块信息展示及查询
    @RequestMapping("selectAllCircuitDTOList")
    public @ResponseBody
    PageHelperUtil selectAllCircuitDTOList(Integer page, Integer rows, String circuitModuleId, String circuitProjectName){
        PageHelperUtil pageHelperUtil = null;
        if (circuitProjectName == "" && circuitModuleId ==""){
            pageHelperUtil = circuitDTOService.selectAllCircuitDTO(page, rows);
            return pageHelperUtil;
        }
        if (circuitModuleId == "" && circuitProjectName !="" && circuitProjectName != null){
            pageHelperUtil = circuitDTOService.FuzzysearchCircuitDTO(page, rows, circuitProjectName);
            return pageHelperUtil;
        }
        if (circuitModuleId !=null && circuitProjectName !=""){
            pageHelperUtil = circuitDTOService.selectAllDropdownBoxAndSearchCircuitDTO(page, rows, circuitModuleId, circuitProjectName);
            return pageHelperUtil;
        }
        if (circuitModuleId !=null && circuitProjectName ==""){
            pageHelperUtil = circuitDTOService.selectAllCircuitDTOSearchList(page, rows, circuitModuleId);
            return pageHelperUtil;
        }
        return pageHelperUtil;
    }

    //导出空表格
    @RequestMapping("ExportNull_CircuitExcel")
    public void ExportNullCircuitExcel(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<CircuitDTO> equipmentDTOList = circuitDTOService.ExportNullCircuitExcel();
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet CircuitSheet = wb.createSheet("线路专业模块库");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            LL_Circuit_Module_Null_ExportExcel.createExcelOfUser(null,CircuitSheet);
            LL_Circuit_Module_Null_ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出线路专业模块库Excel表格数据
    @RequestMapping("Export_CircuitExcel")
    public void ExportCircuitExcel(String[] ids,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<CircuitDTO> circuitDTOList = circuitDTOService.ExportCircuitExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet CircuitSheet = wb.createSheet("线路专业模块库");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            LL_Circuit_Module_ExportExcel.createExcelOfUser(circuitDTOList,CircuitSheet);
            LL_Circuit_Module_ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //设置Excel表头
    public static void setTitle(HSSFWorkbook workbook, HSSFSheet sheet){
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


    //导入线路数据
    @RequestMapping("parseExcelCircuitDTO")
    public @ResponseBody
    Map parseExcel(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            LL_CircuitDTO_Module_ParseExcel.parseAndImportCircuitDTO(inputStream,name,circuitDTOService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }


}
