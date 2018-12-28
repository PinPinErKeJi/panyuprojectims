package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.PowerSupplyDTO;
import com.panyu.panyuprojectims.poi.*;
import com.panyu.panyuprojectims.service.PowerSupplyDTOService;
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
public class PowerSupplyDTOController {
    @Autowired private PowerSupplyDTOService powerSupplyDTOService;

    //模块信息展示及查询
    @RequestMapping("selectAllPowerSupplyDTOList")
    public @ResponseBody
    PageHelperUtil selectAllPowerSupplyDTOList(Integer page, Integer rows, String powerModuleId, String powerProjectName){
        PageHelperUtil pageHelperUtil = null;
        if (powerProjectName == "" && powerModuleId ==""){
            pageHelperUtil = powerSupplyDTOService.selectAllPowerSupplyDTO(page, rows);
            return pageHelperUtil;
        }
        if (powerModuleId == "" && powerProjectName !="" && powerProjectName != null){
            pageHelperUtil = powerSupplyDTOService.FuzzysearchPowerSupplyDTO(page, rows, powerProjectName);
            return pageHelperUtil;
        }
        if (powerModuleId !=null && powerProjectName !=""){
            pageHelperUtil = powerSupplyDTOService.selectAllDropdownBoxAndSearchPowerSupplyDTO(page, rows, powerModuleId, powerProjectName);
            return pageHelperUtil;
        }
        if (powerModuleId !=null && powerProjectName ==""){
            pageHelperUtil = powerSupplyDTOService.selectAllPowerSupplyDTOSearchList(page, rows, powerModuleId);
            return pageHelperUtil;
        }
        return pageHelperUtil;
    }

    //导出设备专业空Excel表格
    @RequestMapping("ExportNullPowerSupplyExcel")
    public void ExportNullPowerSupplyExcel(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<PowerSupplyDTO> powerSupplyDTOList = powerSupplyDTOService.ExportNullPowerSupplyExcel();
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet PowerSupplySheet = wb.createSheet("电源专业模块库");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            PS_PowerSupply_Module_Null_ExportExcel.createExcelOfUser(null,PowerSupplySheet);
            PS_PowerSupply_Module_Null_ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出设备专业模块库Excel表格数据
    @RequestMapping("ExportPowerSupplyExcel")
    public void ExportPowerSupplyExcel(String[] ids,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<PowerSupplyDTO> powerSupplyDTOList = powerSupplyDTOService.ExportPowerSupplyExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet PowerSupplySheet = wb.createSheet("电源专业模块库");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            PS_PowerSupply_Module_ExportExcel.createExcelOfUser(powerSupplyDTOList,PowerSupplySheet);
            PS_PowerSupply_Module_ExportExcel.setAttachmentFileName(request,response,fileName);
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

    //导入
    @RequestMapping("parseExcel_PowerSupply")
    public @ResponseBody
    Map parseExcel(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            PS_PowerSupplyDTO_Module_ParseExcel.parseAndImportPowerSupplyDTO(inputStream,name,powerSupplyDTOService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }

}
