package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.EquipmentDTO;
import com.panyu.panyuprojectims.poi.EquipmentExportNullExcel;
import com.panyu.panyuprojectims.poi.ExportExcelForEquipment;
import com.panyu.panyuprojectims.poi.ParseExcelForEquipment;
import com.panyu.panyuprojectims.service.EquipmentDTOService;
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
public class EquimentDTOController {

    @Autowired
    private EquipmentDTOService equimentDTOService;

    @RequestMapping("selectAllEquimentDTOList")
    public @ResponseBody
    PageHelperUtil selectAllEquimentDTOList(String equipmentSpecialityId,Integer page,Integer rows,String equipmentProjectName) {
        //System.out.println(equipmentSpecialityId+equipmentProjectName);
        PageHelperUtil pageHelperUtil = null;
        if (equipmentSpecialityId==""&&equipmentProjectName==""){
            pageHelperUtil = equimentDTOService.selectAllEquimentDTODao(page, rows);
            return pageHelperUtil;
        }
        if (equipmentSpecialityId==""&&equipmentProjectName!=null&&equipmentProjectName!=""){
            pageHelperUtil = equimentDTOService.FuzzysearchEquimentDTODao(page, rows, equipmentProjectName);
            return pageHelperUtil;
        }
        if (equipmentSpecialityId!=""&&equipmentProjectName!=""){
            pageHelperUtil = equimentDTOService.selectDropdownBoxAndSearch(page, rows, equipmentSpecialityId, equipmentProjectName);
            return pageHelperUtil;
        }
        if (equipmentSpecialityId!=""&&equipmentProjectName==""){
            pageHelperUtil = equimentDTOService.selectEquipmentSpecialityIdAndSeach(page, rows, equipmentSpecialityId);
            return pageHelperUtil;
        }
        return pageHelperUtil;
    }

    //导出设备专业空Excel表格
    @RequestMapping("ExportNullEquipmentExcel")
    public void ExportNullEquipmentExcel(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<EquipmentDTO> equipmentDTOList = equimentDTOService.ExportNullEquipmentExcel();
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet EquipmentSheet = wb.createSheet("设备专业模块库");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            EquipmentExportNullExcel.createExcelOfEquipment(null,EquipmentSheet);
            EquipmentExportNullExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出设备专业模块库Excel表格数据
    @RequestMapping("ExportEquipmentExcel")
    public void ExportEquipmentExcel(String[] ids,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<EquipmentDTO> equipmentDTOList = equimentDTOService.ExportEquipmentExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet EquipmentSheet = wb.createSheet("设备专业模块库");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            ExportExcelForEquipment.createExcelOfEquipment(equipmentDTOList,EquipmentSheet);
            ExportExcelForEquipment.setAttachmentFileName(request,response,fileName);
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


    //导入数据
    @RequestMapping("parseEquipmentExcel")
    public @ResponseBody Map parseExcel(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            ParseExcelForEquipment.importEquipmentExcel(inputStream,name,equimentDTOService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }
}
