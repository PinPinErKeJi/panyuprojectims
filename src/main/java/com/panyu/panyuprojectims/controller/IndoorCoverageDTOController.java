package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.GarrisonDTO;
import com.panyu.panyuprojectims.entity.IndoorCoverageDTO;
import com.panyu.panyuprojectims.poi.*;
import com.panyu.panyuprojectims.service.IndoorCoverageDTOService;
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
public class IndoorCoverageDTOController {

    @Autowired
    private IndoorCoverageDTOService indoorCoverageDTOService;

    @RequestMapping("selectIndoorCoverageDTOList")
    public @ResponseBody
    PageHelperUtil selectIndoorCoverageDTOList(Integer page,Integer rows,String indoorCoverageId,String indoorProjectName){
        PageHelperUtil pageHelperUtil = null;
        //无条件分页查询展示室内覆盖信息数据
        if (indoorCoverageId == "" && indoorProjectName == ""){
            pageHelperUtil = indoorCoverageDTOService.selectIndoorCoverageDTO(page, rows);
            return pageHelperUtil;
        }
        //根据检查项目名模糊匹配搜索查询信息展示
        if (indoorCoverageId =="" && indoorProjectName !=null && indoorProjectName !=""){
            pageHelperUtil = indoorCoverageDTOService.selectFuzzysearchIndoorCoverageDTO(page, rows, indoorProjectName);
            return pageHelperUtil;
        }
        //根据点击下拉框模块名以及搜索框内容模糊匹配查询信息展示
        if (indoorCoverageId !="" && indoorProjectName !=""){
            pageHelperUtil = indoorCoverageDTOService.selectIndoorCoverageDTOByIdAndName(page, rows, indoorCoverageId, indoorProjectName);
            return pageHelperUtil;
        }
        //根据点击下拉框模块名分页查询展示信息数据
        if (indoorCoverageId !="" && indoorProjectName ==""){
            pageHelperUtil = indoorCoverageDTOService.selectAllIndoorCoverageDTOById(page, rows, indoorCoverageId);
            return pageHelperUtil;
        }
        return pageHelperUtil;
    }

    //导出空表格
    @RequestMapping("exportExcel_IndoorCoverage")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<IndoorCoverageDTO> indoorCoverageDTOList= indoorCoverageDTOService.exportExcelIndoorCoverage();
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet indoorCoverageSheet = wb.createSheet("室内覆盖模块Excel");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            IC_IndoorCoverage_Module_ExportExcel.createExcelOfUser(null,indoorCoverageSheet);
            IC_IndoorCoverage_Module_ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出
    @RequestMapping("exportIndoorCoverage")
    public void exportUser(String[] ids, HttpServletRequest request, HttpServletResponse response) {
        //System.out.println("ids:"+ids);
        try {
            List<IndoorCoverageDTO> indoorCoverageDTOList= indoorCoverageDTOService.exportGarrisonIndoorCoverage(ids);
            //System.out.println("导出的数据:"+indoorCoverageDTOList);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet indoorCoverageSheet = wb.createSheet("室内覆盖模块");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";

            IC_IndoorCoverage_Module_Null_ExportExcel.createExcelOfUser(indoorCoverageDTOList,indoorCoverageSheet);
            IC_IndoorCoverage_Module_Null_ExportExcel.setAttachmentFileName(request,response,fileName);
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
    @RequestMapping("parseExcel_IndoorCoverage")
    public @ResponseBody
    Map parseExcel(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            IC_IndoorCoverage_Module_ParseExcel.parseAndImportIndoorCoverage(inputStream,name,indoorCoverageDTOService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }

}
