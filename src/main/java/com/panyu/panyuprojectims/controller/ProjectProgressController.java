package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.poi.ImportProjectProgresExcel;
import com.panyu.panyuprojectims.poi.ParseExcelForPanyuProjectims;
import com.panyu.panyuprojectims.poi.ProjectProgressExcel;
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
import java.util.*;


@Controller
public class ProjectProgressController {

    @Autowired
    private ProjectProgressService projectProgressService;
    @Autowired
    private SkyBranchService skyBranchService;
    @Autowired
    private MachineRoomService machineRoomService;
    @Autowired
    private ElectricPowerService electricPowerService;
    @Autowired
    private MainEquipmentService mainEquipmentService;
    @Autowired
    private AirConditionerService airConditionerService;
    @Autowired
    private FireFightingDeviceService fireFightingDeviceService;
    @Autowired
    private PowerMonitoringService powerMonitoringService;

    @RequestMapping("selectModuleId")
    public @ResponseBody List<String> selectModuleId(String projectProgressId){
        return projectProgressService.selectModuleId(projectProgressId);
    }

    @RequestMapping("selectProjectProgressByPhoto")
    public @ResponseBody
    PageHelperUtil selectProjectProgressByPhoto(
            Integer page, Integer rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String planningName,
            String actualName,
            String onSiteSupervision,
            String professionPeople,
            String districtHead,
            String regions){

        PageHelperUtil pageHelperUtil = projectProgressService.selectProjectProgressByPhoto(
                page,rows,province,city,county,buildYear,operator,buildingProject,planningName,actualName,onSiteSupervision,professionPeople,districtHead,regions);
        return pageHelperUtil;
    }

    @RequestMapping("selectProjectProgress")
    public @ResponseBody
    PageHelperUtil selectProjectProgress(
            Integer page, Integer rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String planningName,
            String actualName,
            String regions,
            String onSiteSupervision,
            String professionPeople,
            String districtHead){

        //System.out.println("项目名:"+buildingProject);
        PageHelperUtil pageHelperUtil = projectProgressService.selectProjectProgress(
                page,rows,province,city,county,buildYear,operator,buildingProject,planningName,actualName,regions,onSiteSupervision,
                professionPeople,districtHead);
        return pageHelperUtil;
    }

    @RequestMapping("deleteProjectProgressById")
    public @ResponseBody boolean deleteProjectProgressById(String projectProgressId){
        boolean flag = true;
        String s = projectProgressService.selectProjectProgressBySkyId(projectProgressId);
        String s1 = projectProgressService.selectProjectProgressByMachId(projectProgressId);
        String s2 = projectProgressService.selectProjectProgressByElectricId(projectProgressId);
        String s3 = projectProgressService.selectProjectProgressByMainId(projectProgressId);
        String s4 = projectProgressService.selectProjectProgressByAirId(projectProgressId);
        String s5 = projectProgressService.selectProjectProgressByFireId(projectProgressId);
        String s6 = projectProgressService.selectProjectProgressByPowerId(projectProgressId);
        boolean b = skyBranchService.deleteSkyBranchById(s);
        boolean b1 = machineRoomService.deleteMachineRoomById(s1);
        boolean b2 = electricPowerService.deleteElectricPowerById(s2);
        boolean b3 = mainEquipmentService.deleteMainEquipmentById(s3);
        boolean b4 = airConditionerService.deleteAirConditionerById(s4);
        boolean b5 = fireFightingDeviceService.deleteFireFightingDeviceById(s5);
        boolean b6 = powerMonitoringService.deletePowerMonitoringById(s6);
        if (b==true&b1==true&b2==true&b3==true&b4==true&b5==true&b6==true){
            int i = projectProgressService.deleteProjectProgressById(projectProgressId);
        }else {
            flag = false;
        }
        return flag;
    }
    @RequestMapping("insertProjectProgress")
    public @ResponseBody boolean insertProjectProgress(String projectProgressId,
                                                       String operator,
                                                       String buildYear,
                                                       String buildingProject,
                                                       String planningName,
                                                       String actualName,
                                                       String planningLongitude,
                                                       String planningLatitude,
                                                       String actualLongitude,
                                                       String actualLatitudes,
                                                       String province,
                                                       String city,
                                                       String county,
                                                       String regions,
                                                       String onSiteSupervision,
                                                       String professionPeople,
                                                       String districtHead,
                                                       String overlayScene,
                                                       String skyBranchId,
                                                       String machineRoomId,
                                                       String electricPowerId,
                                                       String mainEquipmentId,
                                                       String airConditionerId,
                                                       String fireId,
                                                       String powerMonitoringId){

        String[] split = operator.split(",");
        return  projectProgressService.insertProjectProgress(
                projectProgressId,
                split[0],
                buildYear,
                buildingProject,
                planningName,
                actualName,
                planningLongitude,
                planningLatitude,
                actualLongitude,
                actualLatitudes,
                province,
                city,
                county,
                regions,
                onSiteSupervision,
                professionPeople,
                districtHead,
                overlayScene,
                skyBranchId,
                machineRoomId,
                electricPowerId,mainEquipmentId,airConditionerId,fireId,powerMonitoringId);
    }

    //导出空表格
    @RequestMapping("importProjectProgressExcel")
    public void importProjectProgressExcel(Map listmap,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<ProjectProgress> projectProgressList = projectProgressService.importProjectProgressExcel();
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet projectprogressSheet = wb.createSheet("ProjectProgress");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            listmap = ImportProjectProgresExcel.getListmap();
            ImportProjectProgresExcel.createExcelOfProject(listmap,projectprogressSheet,wb);
            ImportProjectProgresExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出数据
    @RequestMapping("ProjectProgressExcel")
    public void ProjectProgressExcel(String[] ids,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<ProjectProgress> projectProgressList = projectProgressService.ProjectProgressExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet projectprogressSheet = wb.createSheet("ProjectProgress");
            //System.out.println(projectProgressList+":controller里面的数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map listmap = ImportProjectProgresExcel.getListmap();
            //System.out.println(listmap+"字段数据");
            ProjectProgressExcel.createExcelOfProjects(projectProgressList,listmap,projectprogressSheet,wb);
            ProjectProgressExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导入数据
    @RequestMapping("parseExcelProjectProgress")
    public @ResponseBody Map parseExcelProjectProgress(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            ParseExcelForPanyuProjectims.parseAndImportModule(inputStream,name,projectProgressService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }
}
