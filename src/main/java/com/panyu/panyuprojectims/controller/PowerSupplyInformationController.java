package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.PowerSupplyInformation;
import com.panyu.panyuprojectims.poi.*;
import com.panyu.panyuprojectims.service.PowerSupplyInformationService;
import com.panyu.panyuprojectims.service.PsNewCablingRackService;
import com.panyu.panyuprojectims.service.PsNewEquipmentService;
import com.panyu.panyuprojectims.service.PsNewPowerCableService;
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
public class PowerSupplyInformationController {
    @Autowired private PowerSupplyInformationService powerSupplyInformationService;
    @Autowired
    private PsNewEquipmentService psNewEquipmentService;
    @Autowired
    private PsNewPowerCableService psNewPowerCableService;
    @Autowired
    private PsNewCablingRackService psNewCablingRackService;


    @RequestMapping("selectPowerSupplyInformation")
    public @ResponseBody
    PageHelperUtil selectPowerSupplyInformation(
            Integer page, Integer rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String motorRoomName,
            String siteSupervision,
            String projectLeader){
        PageHelperUtil pageHelperUtil = powerSupplyInformationService.selectPowerSupplyInformation(
                page,rows,province,city,county,buildYear,operator,buildingProject,motorRoomName, siteSupervision,projectLeader);
        return pageHelperUtil;
    }

    //添加
    @RequestMapping("insertSupplyInformation")
    public @ResponseBody boolean insertSupplyInformation(String powerInformationId,
                                                         String operator,
                                                         String buildYear,
                                                         String buildingProject,
                                                         String motorRoomName,
                                                         String motorRoomLongitude,
                                                         String motorRoomLatitude,
                                                         String province,
                                                         String city,
                                                         String county,
                                                         String siteSupervision,
                                                         String projectLeader,
                                                         String powerEquipmentId,
                                                         String newPowerCableId,
                                                         String newCablingRackId){

        String[] split = operator.split(",");
        return  powerSupplyInformationService.insertPowerSupplyInformation(powerInformationId, split[0], buildYear, buildingProject, motorRoomName, motorRoomLongitude,motorRoomLatitude, province, city, county, siteSupervision,projectLeader,powerEquipmentId, newPowerCableId, newCablingRackId);
    }

    //删除
    @RequestMapping("deletePowerSupplyInformation")
    public @ResponseBody boolean deletePowerSupplyInformation(String powerInformationId){
        boolean flag = true;
        String powerEquipmentId = powerSupplyInformationService.selectPowerEquipmentId(powerInformationId);
        String newPowerCableId = powerSupplyInformationService.selectNewPowerCableId(powerInformationId);
        String newCablingRackId = powerSupplyInformationService.selectNewCablingRackId(powerInformationId);

        int i = psNewEquipmentService.deletePsNewEquipment(powerEquipmentId);
        int i1 = psNewPowerCableService.deletePsNewPowerCable(newPowerCableId);
        int i2 = psNewCablingRackService.deletePsNewCablingRack(newCablingRackId);

        if (i>0&i1>0&i2>0){
            int i3 = powerSupplyInformationService.deletePowerSupplyInformation(powerInformationId);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }



    //导出空表格
    @RequestMapping("importPowerSupplyInformationExcel")
    public void importPowerSupplyInformationExcel(Map listmap, HttpServletRequest request, HttpServletResponse response) {
        try {
            List<PowerSupplyInformation> powerSupplyInformationList = powerSupplyInformationService.importPowerSupplyInformationExcel();
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet powerSupplyInformationSheet = wb.createSheet("电源信息Excel");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            listmap = PS_PowerSupplyInformation_Null_ExportExcel.getMap();
            PS_PowerSupplyInformation_Null_ExportExcel.createExcelToPowerSupplyInformation(listmap,powerSupplyInformationSheet,wb);
            PS_PowerSupplyInformation_Null_ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出数据
    @RequestMapping("PowerSupplyInformationExcel")
    public void PowerSupplyInformationExcel(String[] ids,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<PowerSupplyInformation> powerSupplyInformationList = powerSupplyInformationService.powerSupplyInformationExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet powerSupplyInformationSheet = wb.createSheet("电源信息数据导出Excel");
            //System.out.println(powerSupplyInformationList+":controller里面的数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map listmap = PS_PowerSupplyInformation_ExportExcel.getMap();
            //System.out.println(listmap+"字段数据");
            PS_PowerSupplyInformation_ExportExcel.createExcelPowerSupplyInformation(powerSupplyInformationList,listmap,powerSupplyInformationSheet,wb);
            PS_PowerSupplyInformation_ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导入数据
    @RequestMapping("parseExcelPowerSupplyInformation")
    public @ResponseBody Map parseExcelPowerSupplyInformation(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            PS_PowerSupplyInformation_ParseExcel.parseAndImportPowerSupplyInformation(inputStream,name,powerSupplyInformationService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }


}
