package com.panyu.panyuprojectims.controller.FA_controller.message_controller;

import com.panyu.panyuprojectims.entity.FaEquipmentInformation;
import com.panyu.panyuprojectims.poi.FAExportEquipmentInfoExcel;
import com.panyu.panyuprojectims.poi.FAExportEquipmentNullExcel;
import com.panyu.panyuprojectims.poi.FAParseExcelFaEquipmentInformation;
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
@RequestMapping("FA")
public class FaEquipmentInformationController {

    @Autowired
    private FaEquipmentInformationService faEquipmentInformationService;
    @Autowired
    private FaCabinetPowerFrameService faCabinetPowerFrameService;
    @Autowired
    private FaBoardcardDilatationService faBoardcardDilatationService;
    @Autowired
    private FaPowerNetworkLineService faPowerNetworkLineService;
    @Autowired
    private FaPigtailSkipFiberService faPigtailSkipFiberService;
    @Autowired
    private FaWalkingFrameService faWalkingFrameService;
    @Autowired
    private FaFiberOpticChannelService faFiberOpticChannelService;

    @RequestMapping("selectFaEquipmentInformation")
    public @ResponseBody
    PageHelperUtil selectFaEquipmentInformation(Integer page, Integer rows,
                                                String province,
                                                String city,
                                                String county,
                                                String buildYear,
                                                String buildingProject,
                                                String operator,
                                                String onSiteSupervision,
                                                String projectLeader){
        PageHelperUtil pageHelperUtil = faEquipmentInformationService.selectFaEquipmentInformation(
                page, rows, province, city, county, buildYear, buildingProject, operator,onSiteSupervision,
                projectLeader);
        return pageHelperUtil;
    }

    @RequestMapping("deleteFaEquipmentInformationById")
    public @ResponseBody boolean deleteFaEquipmentInformationById(String equipmentInformationId){
        boolean flag = true;
        String equipmentId = faEquipmentInformationService.selectFaCabinetPowerFrameIdByEquipmentInformationId(equipmentInformationId);
        String boardCardDilatationId = faEquipmentInformationService.selectFaBoardcardDilatationIdByEquipmentInformationId(equipmentInformationId);
        String powerNetworkLineId = faEquipmentInformationService.selectFaPowerNetworkLineIdByEquipmentInformationId(equipmentInformationId);
        String pigtailSkipFiberId = faEquipmentInformationService.selectFaPigtailSkipFiberIdByEquipmentInformationId(equipmentInformationId);
        String walkingFrameId = faEquipmentInformationService.selectFaWalkingFrameIdByEquipmentInformationId(equipmentInformationId);
        String fiberOpticChannelId = faEquipmentInformationService.selectFaFiberOpticChannelIdByEquipmentInformationId(equipmentInformationId);

        int i = faCabinetPowerFrameService.deleteFaCabinetPowerFrameById(equipmentId);
        int i1 = faBoardcardDilatationService.deleteFaBoardcardDilatationById(boardCardDilatationId);
        int i2 = faPowerNetworkLineService.deleteFaPowerNetworkLineById(powerNetworkLineId);
        int i3 = faPigtailSkipFiberService.deleteFaPigtailSkipFiberById(pigtailSkipFiberId);
        int i4 = faWalkingFrameService.deleteFaWalkingFrameById(walkingFrameId);
        int i5 = faFiberOpticChannelService.deleteFaFiberOpticChannelById(fiberOpticChannelId);

        if (i>0&i1>0&i2>0&i3>0&i4>0&i5>0){
            int i6 = faEquipmentInformationService.deleteFaEquipmentInformationById(equipmentInformationId);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //添加
    @RequestMapping("insertFaEquipmentInformation")
    public @ResponseBody boolean insertFaEquipmentInformation(String equipmentInformationId,
                                                              String operator,
                                                              String buildYear,
                                                              String buildingProject,
                                                              String motorRoomName,
                                                              String motorRoomLongitude,
                                                              String motorRoomLatitude,
                                                              String province,
                                                              String city,
                                                              String county,
                                                              String onSiteSupervision,
                                                              String projectLeader,
                                                              String equipmentId,
                                                              String boardCardDilatationId,
                                                              String powerNetworkLineId,
                                                              String pigtailSkipFiberId,
                                                              String walkingFrameId,
                                                              String fiberOpticChannelId){
        String[] split = operator.split(",");
        return faEquipmentInformationService.insertFaEquipmentInformation( equipmentInformationId,
                split[0],
                buildYear,
                buildingProject,
                motorRoomName,
                motorRoomLongitude,
                motorRoomLatitude,
                province,
                city,
                county,
                onSiteSupervision,
                projectLeader,
                equipmentId,
                boardCardDilatationId,
                powerNetworkLineId,
                pigtailSkipFiberId,
                walkingFrameId,
                fiberOpticChannelId);
    }


    //导出设备专业模块库空Excel表格
    @RequestMapping("FAExportEquipmentNullExcel")
    public @ResponseBody void FAExportEquipmentNullExcel(Map map, HttpServletRequest request, HttpServletResponse response){
        try {
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet Sheet = wb.createSheet("设备专业基本信息");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            map = FAExportEquipmentNullExcel.getMap();
            FAExportEquipmentNullExcel.createExcelToEquipment(map,Sheet,wb);
            FAExportEquipmentNullExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出设备专业模块库Excel数据表格
    @RequestMapping("FAExportEquipmentInfoExcel")
    public void FAExportEquipmentInfoExcel(String[] ids,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<FaEquipmentInformation> faEquipmentInformationList = faEquipmentInformationService.FAExportEquipmentInfoExcel(ids);

            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet Sheet = wb.createSheet("设备专业模块库");
            //System.out.println(faEquipmentInformationList+":controller里面的数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map map = FAExportEquipmentInfoExcel.getMap();
            FAExportEquipmentInfoExcel.createExcelToEquipments(faEquipmentInformationList,map,Sheet,wb);
            FAExportEquipmentInfoExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导入数据
    @RequestMapping("FAparseExcelFaEquipmentInformation")
    public @ResponseBody
    Map FAparseExcelFaEquipmentInformation(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            FAParseExcelFaEquipmentInformation.parseAndImportModule(inputStream,name,faEquipmentInformationService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }
}
