package com.panyu.panyuprojectims.controller.LL_controller.message_controller;

import com.panyu.panyuprojectims.entity.LlCircuitInformation;
import com.panyu.panyuprojectims.poi.FAParseExcelFaEquipmentInformation;
import com.panyu.panyuprojectims.poi.LL_ExportCircuitInformationExcel;
import com.panyu.panyuprojectims.poi.LL_ExportCircuitInformation_NullExcel;
import com.panyu.panyuprojectims.poi.LL_ExportCircuitInformation_ParseExcel;
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
@RequestMapping("LL")
public class LlCircuitInformationController {

    @Autowired
    private LlCircuitInformationService llCircuitInformationService;
    @Autowired
    private LlDesignInstituteService llDesignInstituteService;
    @Autowired
    private LlSupervisionUnitService llSupervisionUnitService;
    @Autowired
    private LlConstructionUnitService llConstructionUnitService;
    @Autowired
    private LlNewLineLengthService llNewLineLengthService;
    @Autowired
    private LlCableLengthDesignService llCableLengthDesignService;
    @Autowired
    private LlFloorStandOnuNewService llFloorStandOnuNewService;
    @Autowired
    private LlFloorStandOnuWornService llFloorStandOnuWornService;
    @Autowired
    private LlWallMountedOnuNewService llWallMountedOnuNewService;
    @Autowired
    private LlWallMountedOnuWornService llWallMountedOnuWornService;

    @RequestMapping("selectAllLlCircuitInformation")
    public @ResponseBody
    PageHelperUtil selectAllLlCircuitInformation(
            Integer page,
            Integer rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String siteLeader,
            String professionResponsiblePerson,
            String districtHead
    ){
        PageHelperUtil pageHelperUtil = llCircuitInformationService.selectAllLlCircuitInformation(page, rows, province, city, county, buildYear, buildingProject, operator, siteLeader, professionResponsiblePerson, districtHead);
        return pageHelperUtil;
    }
    //根据线路基本信息ID删除选中项
    @RequestMapping("deleteLlCircuitInformation")
    public @ResponseBody boolean deleteLlCircuitInformation(String circuitInformationId){
        boolean flag = true;
        String designInstituteId = llCircuitInformationService.selectDesignInstituteId(circuitInformationId);
        String supervisionUnitId = llCircuitInformationService.selectSupervisionUnitId(circuitInformationId);
        String constructionUnitId = llCircuitInformationService.selectConstructionUnitId(circuitInformationId);
        String newLineLengthId = llCircuitInformationService.selectNewLineLengthId(circuitInformationId);
        String cableLengthDesignId = llCircuitInformationService.selectCableLengthDesignId(circuitInformationId);
        String newFloorStandId = llCircuitInformationService.selectNewFloorStandId(circuitInformationId);
        String wornFloorStandId = llCircuitInformationService.selectWornFloorStandId(circuitInformationId);
        String newWallMountedOnuId = llCircuitInformationService.selectNewWallMountedOnuId(circuitInformationId);
        String wornWallMountedOnuId = llCircuitInformationService.selectWornWallMountedOnuId(circuitInformationId);

        int i = llDesignInstituteService.deleteLlDesignInstitute(designInstituteId);
        int i1 = llSupervisionUnitService.deleteLlSupervisionUnit(supervisionUnitId);
        int i2 = llConstructionUnitService.deleteLlConstructionUnit(constructionUnitId);
        int i3 = llNewLineLengthService.deleteLlNewLineLength(newLineLengthId);
        int i4 = llCableLengthDesignService.deleteLlCableLengthDesign(cableLengthDesignId);
        int i5 = llFloorStandOnuNewService.deleteLlFloorStandOnuNew(newFloorStandId);
        int i6 = llFloorStandOnuWornService.deleteLlFloorStandOnuWorn(wornFloorStandId);
        int i7 = llWallMountedOnuNewService.deleteLlWallMountedOnuNew(newWallMountedOnuId);
        int i8 = llWallMountedOnuWornService.deleteLlWallMountedOnuWorn(wornWallMountedOnuId);

        if (i>0&i1>0&i2>0&i3>0&i4>0&i5>0&i6>0&i7>0&i8>0){
            int i9 = llCircuitInformationService.deleteLlCircuitInformation(circuitInformationId);
            if (i9>0){
                flag = true;
            }else {
                flag = false;
            }
        }else {
            flag = false;
        }
        return flag;
    }
    //添加线路基本信息数据
    @RequestMapping("insertLlCircuitInformation")
    public @ResponseBody boolean insertLlCircuitInformation(
            String circuitInformationId,
            String operator,
            String buildingProject,
            String buildYear,
            String hopName,
            String province,
            String city,
            String county,
            String area,
            String subordinateDepartment,
            String designInstituteId,
            String supervisionUnitId,
            String constructionUnitId,
            String newLineLengthId,
            String cableType,
            String cableLengthDesignId,
            String newFloorStandId,
            String wornFloorStandId,
            String newWallMountedOnuId,
            String wornWallMountedOnuId
    ){
        boolean flag = true;
        String[] split = operator.split(",");
        int i = llCircuitInformationService.insertLlCircuitInformation(
                circuitInformationId,
                split[0],
                buildingProject,
                buildYear,
                hopName,
                province,
                city,
                county,
                area,
                subordinateDepartment,
                designInstituteId,
                supervisionUnitId,
                constructionUnitId,
                newLineLengthId,
                cableType,
                cableLengthDesignId,
                newFloorStandId,
                wornFloorStandId,
                newWallMountedOnuId,
                wornWallMountedOnuId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }
    //导出线路基本信息Excel空表格
    @RequestMapping("LLExportLlCircuitInformationNullExcel")
    public @ResponseBody void LLExportLlCircuitInformationNullExcel(Map map, HttpServletRequest request, HttpServletResponse response){
        try {
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet Sheet = wb.createSheet("线路基本信息");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            map = LL_ExportCircuitInformation_NullExcel.getMap();
            LL_ExportCircuitInformation_NullExcel.createExcelToIndoorCoverage(map,Sheet,wb);
            LL_ExportCircuitInformation_NullExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //导出线路基本信息Excel表格数据
    @RequestMapping("LLExportLlCircuitInformationExcel")
    public void LLExportLlCircuitInformationExcel(String[] ids,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<LlCircuitInformation> circuitInformationList = llCircuitInformationService.importLlCircuitInformationExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet Sheet = wb.createSheet("线路基本信息数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map map = LL_ExportCircuitInformationExcel.getMap();
            LL_ExportCircuitInformationExcel.createLlCircuitInformationExcel(circuitInformationList,map,Sheet,wb);
            LL_ExportCircuitInformationExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导入数据
    @RequestMapping("LLparseExcelCircuitInformation")
    public @ResponseBody
    Map LLparseExcelCircuitInformation(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            LL_ExportCircuitInformation_ParseExcel.parseAndImport_LL_CircuitInformation(inputStream,name,llCircuitInformationService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }

}
