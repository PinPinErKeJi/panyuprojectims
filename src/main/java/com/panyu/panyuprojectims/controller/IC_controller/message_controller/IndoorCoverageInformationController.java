package com.panyu.panyuprojectims.controller.IC_controller.message_controller;

import com.panyu.panyuprojectims.entity.IndoorCoverageInformation;
import com.panyu.panyuprojectims.poi.IC_ExportIndoorCoverageExcel;
import com.panyu.panyuprojectims.poi.IC_ExportIndoorCoverageNullExcel;
import com.panyu.panyuprojectims.poi.IC_IndoorCoverage_ParseExcel;
import com.panyu.panyuprojectims.poi.ParseExcelForPanyuProjectims;
import com.panyu.panyuprojectims.service.*;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
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
@RequestMapping("IC")
public class IndoorCoverageInformationController {

    @Autowired
    private IndoorCoverageInformationService indoorCoverageInformationService;
    @Autowired
    private IcSupervisoryUnitService icSupervisoryUnitService;
    @Autowired
    private IcConstructionOrganizationService icConstructionOrganizationService;
    @Autowired
    private IcDesignUnitService icDesignUnitService;
    @Autowired
    private IcBbuNumberService icBbuNumberService;
    @Autowired
    private IcLightDistriputionNumberService icLightDistriputionNumberService;
    @Autowired
    private IcPassiveDeviceNumberService icPassiveDeviceNumberService;
    @Autowired
    private IcAntennaNumberService icAntennaNumberService;
    @Autowired
    private IcCableLengthService icCableLengthService;


    //添加
    @RequestMapping("insertIndoorCoverageInformation")
    public @ResponseBody boolean insertIndoorCoverageInformation(String indoorInformationId,
                                                    String operator,
                                                    String buildingProject,
                                                    String buildYear,
                                                    String planStationName,
                                                    String actualStationName,
                                                    String indoorLongitude,
                                                    String indoorLatitude,
                                                    String province,
                                                    String city,
                                                    String county,
                                                    String subordinateDepartment,
                                                    String coverType,
                                                    String icSupervisoryUnitId,
                                                    String icConstructionId,
                                                    String icDesignUnitId,
                                                    String bbuNumberId,
                                                    String rruNumber,
                                                    String lightNumberId,
                                                    String passiveDeviceNumberId,
                                                    String antennaNumberId,
                                                    String cableLengthId,
                                                    String ammeterNumber){
        boolean flag = true;
        String[] split = operator.split(",");
        int i = indoorCoverageInformationService.insertIndoorCoverageInformation(indoorInformationId,
                                                                                    split[0],
                                                                                    buildingProject,
                                                                                    buildYear,
                                                                                    planStationName,
                                                                                    actualStationName,
                                                                                    indoorLongitude,
                                                                                    indoorLatitude,
                                                                                    province,
                                                                                    city,
                                                                                    county,
                                                                                    subordinateDepartment,
                                                                                    coverType,
                                                                                    icSupervisoryUnitId,
                                                                                    icConstructionId,
                                                                                    icDesignUnitId,
                                                                                    bbuNumberId,
                                                                                    rruNumber,
                                                                                    lightNumberId,
                                                                                    passiveDeviceNumberId,
                                                                                    antennaNumberId,
                                                                                    cableLengthId,
                                                                                    ammeterNumber);
        if(i > 0){
            System.out.println("成功");
            flag = true;
        }else {
            System.out.println("失败");
            flag = false;
        }
        return flag;
    }




    @RequestMapping("selectAllIndoorCoverageInformation")
    public @ResponseBody
    PageHelperUtil selectAllIndoorCoverageInformation(
            Integer page,
            Integer rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String professionResponsiblePerson,
            String districtHead,
            String siteLeader
    ){
        PageHelperUtil pageHelperUtil = indoorCoverageInformationService.selectAllIndoorCoverageInformation(
                page, rows, province, city, county, buildYear, buildingProject, operator,
                professionResponsiblePerson, districtHead, siteLeader);
        return pageHelperUtil;
    }
    //根据室内覆盖基本信息ID删除选中项
    @RequestMapping("deleteIndoorCoverageInformationByIndoorInformationId")
    public @ResponseBody boolean deleteIndoorCoverageInformationByIndoorInformationId(String indoorInformationId){
        boolean flag = true;
        String icSupervisoryUnitId = indoorCoverageInformationService.selectIcSupervisoryUnitIdByIndoorInformationId(indoorInformationId);
        String icConstructionId = indoorCoverageInformationService.selectIcConstructionIdByIndoorInformationId(indoorInformationId);
        String icDesignUnitId = indoorCoverageInformationService.selectIcDesignUnitIdByIndoorInformationId(indoorInformationId);
        String bbuNumberId = indoorCoverageInformationService.selectBbuNumberIdByIndoorInformationId(indoorInformationId);
        String lightNumberId = indoorCoverageInformationService.selectLightNumberIdByIndoorInformationId(indoorInformationId);
        String passiveDeviceNumberId = indoorCoverageInformationService.selectPassiveDeviceNumberIdByIndoorInformationId(indoorInformationId);
        String antennaNumberId = indoorCoverageInformationService.selectAntennaNumberIdByIndoorInformationId(indoorInformationId);
        String cableLengthId = indoorCoverageInformationService.selectCableLengthIdByIndoorInformationId(indoorInformationId);

        int i = icSupervisoryUnitService.deleteIcSupervisoryUnitById(icSupervisoryUnitId);
        int i1 = icConstructionOrganizationService.deleteIcConstructionOrganizationById(icConstructionId);
        int i2 = icDesignUnitService.deleteIcDesignUnitById(icDesignUnitId);
        int i3 = icBbuNumberService.deleteIcBbuNumberById(bbuNumberId);
        int i4 = icLightDistriputionNumberService.deleteIcLightDistriputionNumberById(lightNumberId);
        int i5 = icPassiveDeviceNumberService.deleteIcPassiveDeviceNumberById(passiveDeviceNumberId);
        int i6 = icAntennaNumberService.deleteAntennaNumberId(antennaNumberId);
        int i7 = icCableLengthService.deleteIcCableLengthById(cableLengthId);

        if (i>0&i1>0&i2>0&i3>0&i4>0&i5>0&i6>0&i7>0){
            int i8 = indoorCoverageInformationService.deleteIndoorCoverageInformationByIndoorInformationId(indoorInformationId);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }
    //导出室内覆盖专业基本信息空Excel表格
    @RequestMapping("ICExportIndoorCoverageNullExcel")
    public @ResponseBody void ICExportIndoorCoverageNullExcel(Map map, HttpServletRequest request, HttpServletResponse response){
        try {
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet Sheet = wb.createSheet("室内覆盖专业基本信息");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            map = IC_ExportIndoorCoverageNullExcel.getMap();
            IC_ExportIndoorCoverageNullExcel.createExcelToIndoorCoverage(map,Sheet,wb);
            IC_ExportIndoorCoverageNullExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //导出室内覆盖专业基本信息空Excel表格
    @RequestMapping("ICExportIndoorCoverageExcel")
    public void ICExportIndoorCoverageExcel(String[] ids,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<IndoorCoverageInformation> indoorCoverageInformationList = indoorCoverageInformationService.importIndoorCoverInformationExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet IndoorCoverageInformationSheet = wb.createSheet("室内覆盖基本信息数据");
            System.out.println(indoorCoverageInformationList+":controller里面的数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map map = IC_ExportIndoorCoverageExcel.getMap();
            IC_ExportIndoorCoverageExcel.createIndoorCoverageExcel(indoorCoverageInformationList,map,IndoorCoverageInformationSheet,wb);
            IC_ExportIndoorCoverageExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导入数据
    @RequestMapping("IndoorCoverage_parseExcel")
    public @ResponseBody Map parseExcelIndoorCoverage(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            IC_IndoorCoverage_ParseExcel.parseAndImport_IC_IndoorCoverage(inputStream,name,indoorCoverageInformationService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }
}
