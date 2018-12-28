package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.HnGarrisonInformation;
import com.panyu.panyuprojectims.entity.PanyuDTO;
import com.panyu.panyuprojectims.entity.ProjectProgress;
import com.panyu.panyuprojectims.poi.*;
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
public class HnGarrisonInformationController {

    @Autowired
    private HnGarrisonInformationService hnGarrisonInformationService;
    @Autowired
    private HnSupervisorUnitService hnSupervisorUnitService;
    @Autowired
    private HnConstructionOrganizationService hnConstructionOrganizationService;
    @Autowired
    private HnDesignUnitService hnDesignUnitService;
    @Autowired
    private HnPrimarySplitterNumberService hnPrimarySplitterNumberService;
    @Autowired
    private HnSecondSplitterNumberService hnSecondSplitterNumberService;
    @Autowired
    private HnPrimarySplitterBoxNumberService hnPrimarySplitterBoxNumberService;
    @Autowired
    private HnSecondSplitterBoxNumberService hnSecondSplitterBoxNumberService;
    @Autowired
    private HnCableConnectorBoxNumberService hnCableConnectorBoxNumberService;
    @Autowired
    private HnCableLengthService hnCableLengthService;



    //添加
    @RequestMapping("insertHnGarrisonInformation")
    public @ResponseBody boolean insertHnGarrisonInformation(String garrisonInformationId,String operator, String buildingProject,  String buildYear,
                                               String singleProjectName, String province, String city, String county, String regionalType,
                                               String garrisonLongitude, String garrisonLatitude, String constructionNature,
                                               String ascriptionEndBureau, String supervisorUnitId, String constructionOrganizationId,
                                               String designUnitId, String primarySplitterNumberId, String secondSplitterNumberId,
                                               String primarySplitterBoxId, String secondSplitterBoxId, String cableConnectorBoxId,
                                               String cableLengthId){
        boolean flag = true;
        garrisonInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        String[] split = operator.split(",");
        String[] split1 = regionalType.split(",");

        //经度，纬度 数据处理
        //①
        int i1 = garrisonLongitude.indexOf(".");
        //System.out.println("i1:"+i1);
        if(i1>0){
            String str = garrisonLongitude.substring(i1);
            //System.out.println("str1:"+str);
            int length = str.length();
            //System.out.println("length1:"+length);
            if(length>6){
                garrisonLongitude = garrisonLongitude.substring(0, i1+7);
                //System.out.println("大于6:"+garrisonLongitude);
            }else {
                garrisonLongitude = garrisonLongitude.substring(0, i1+length);
                //System.out.println("小于6:"+garrisonLongitude);
            }
        }else {
            garrisonLongitude = garrisonLongitude.substring(0)+".000000";
        }
        //②
        int i2 = garrisonLatitude.indexOf(".");
        if(i2>0){
            String str = garrisonLatitude.substring(i2);
            int length = str.length();
            if(length>6){
                garrisonLatitude = garrisonLatitude.substring(0, i2+7);
                //System.out.println("大于6:"+garrisonLatitude);
            }else {
                garrisonLatitude = garrisonLatitude.substring(0, i2 + length);
                //System.out.println("小于6:"+garrisonLatitude);
            }
        }else {
            garrisonLatitude = garrisonLatitude.substring(0)+".000000";
        }


        if(supervisorUnitId !=null &constructionOrganizationId != null
                &designUnitId !=null &primarySplitterNumberId !=null &secondSplitterNumberId !=null
                &primarySplitterBoxId !=null &secondSplitterBoxId !=null &cableConnectorBoxId !=null
                &cableLengthId !=null){
            int i = hnGarrisonInformationService.insertHnGarrisonInformation(garrisonInformationId,split[0],buildingProject,   buildYear,
                    singleProjectName, province, city, county, split1[0],
                    garrisonLongitude, garrisonLatitude, constructionNature,
                    ascriptionEndBureau, supervisorUnitId, constructionOrganizationId,
                    designUnitId, primarySplitterNumberId, secondSplitterNumberId,
                    primarySplitterBoxId, secondSplitterBoxId, cableConnectorBoxId,
                    cableLengthId);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //删除
    //根据ID字段删除驻地网基本信息
    @RequestMapping("deleteHnGarrisonInformationByGarrisonInformationId")
    public @ResponseBody
    boolean deleteHnGarrisonInformationByGarrisonInformationId(String garrisonInformationId){
        //System.out.println("删除id:"+garrisonInformationId);
        boolean flag = true;
        String supervisorUnitId = hnGarrisonInformationService.selectSupervisorUnitIdByGarrisonInformationId(garrisonInformationId);
        String constructionOrganizationId = hnGarrisonInformationService.selectConstructionOrganizationIdByGarrisonInformationId(garrisonInformationId);
        String designUnitId = hnGarrisonInformationService.selectDesignUnitIdByGarrisonInformationId(garrisonInformationId);
        String primarySplitterNumberId = hnGarrisonInformationService.selectPrimarySplitterNumberIdByGarrisonInformationId(garrisonInformationId);
        String secondSplitterNumberId = hnGarrisonInformationService.selectSecondSplitterNumberIdByGarrisonInformationId(garrisonInformationId);
        String primarySplitterBoxId = hnGarrisonInformationService.selectPrimarySplitterBoxIdByGarrisonInformationId(garrisonInformationId);
        String secondSplitterBoxId = hnGarrisonInformationService.selectSecondSplitterBoxIdByGarrisonInformationId(garrisonInformationId);
        String cableConnectorBoxId = hnGarrisonInformationService.selectCableConnectorBoxIdByGarrisonInformationId(garrisonInformationId);
        String cableLengthId = hnGarrisonInformationService.selectCableLengthIdByGarrisonInformationId(garrisonInformationId);

        int i = hnSupervisorUnitService.deleteHnSupervisorUnitBySupervisorUnitId(supervisorUnitId);
        int i1 = hnConstructionOrganizationService.deleteHnConstructionOrganizationByConstructionOrganizationId(constructionOrganizationId);
        int i2 = hnDesignUnitService.deleteHnDesignUnitByDesignUnitId(designUnitId);
        int i3 = hnPrimarySplitterNumberService.deleteHnPrimarySplitterNumberByPrimarySplitterNumberId(primarySplitterNumberId);
        int i4 = hnSecondSplitterNumberService.deleteHnSecondSplitterNumberBySecondSplitterNumberId(secondSplitterNumberId);
        int i5 = hnPrimarySplitterBoxNumberService.deleteHnPrimarySplitterBoxNumberByPrimarySplitterBoxId(primarySplitterBoxId);
        int i6 = hnSecondSplitterBoxNumberService.deleteHnSecondSplitterBoxNumberBySecondSplitterBoxId(secondSplitterBoxId);
        int i7 = hnCableConnectorBoxNumberService.deleteHnCableConnectorBoxNumberByCableConnectorBoxId(cableConnectorBoxId);
        int i8 = hnCableLengthService.deleteHnCableLengthByCableLengthId(cableLengthId);

        if (i>0&i1>0&i2>0&i3>0&i4>0&i5>0&i6>0&i7>0&i8>0){
            int i9 = hnGarrisonInformationService.deleteHnGarrisonInformationByGarrisonInformationId(garrisonInformationId);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }



    //分页模糊匹配查询展示基本信息数据
    @RequestMapping("selectHnGarrisonInformation")
    public @ResponseBody
    PageHelperUtil selectHnGarrisonInformation(
            int page,
            int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String singleProjectName,
            String onSiteSupervision,
            String professionResponsiblePerson,
            String districtHead
    ){
        PageHelperUtil pageHelperUtil = hnGarrisonInformationService.selectHnGarrisonInformation(page, rows, province, city, county, buildYear, buildingProject, operator, singleProjectName, onSiteSupervision, professionResponsiblePerson, districtHead);
        return pageHelperUtil;
    }

    //导出空表格
    @RequestMapping("HnGarrisonInformation_Null_Excel")
    public void importHnGarrisonInformation_Null_Excel(Map listmap,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<HnGarrisonInformation> hnGarrisonInformationList = hnGarrisonInformationService.exportExcel_HnGarrisonInformation();
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet hnGarrisonInformationServiceSheet = wb.createSheet("驻地网基本信息");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            listmap = HN_HnGarrisonInformation_Null_ExportExcel.getMap();
            HN_HnGarrisonInformation_Null_ExportExcel.createExcelToEquipment(listmap,hnGarrisonInformationServiceSheet,wb);
            HN_HnGarrisonInformation_Null_ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导出数据
    @RequestMapping("HnGarrisonInformation_Excel")
    public void HnGarrisonInformationExcel(String[] ids,HttpServletRequest request, HttpServletResponse response) {
        try {
            List<HnGarrisonInformation> hnGarrisonInformationList = hnGarrisonInformationService.export_HnGarrisonInformation(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet hnGarrisonInformationSheet = wb.createSheet("驻地网基本信息数据");
            //System.out.println(hnGarrisonInformationList+":controller里面的数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map listmap = HN_HnGarrisonInformation_ExportExcel.getMap();
            //System.out.println(listmap+"字段数据");
            HN_HnGarrisonInformation_ExportExcel.createExcelHnGarrisonInformation(hnGarrisonInformationList,listmap,hnGarrisonInformationSheet,wb);
            HN_HnGarrisonInformation_ExportExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //导入数据
    @RequestMapping("HnGarrisonInformation_parseExcel")
    public @ResponseBody Map parseExcelHnGarrisonInformation(MultipartFile fileName){
        Map map = new HashMap();
        try {
            InputStream inputStream = fileName.getInputStream();
            String name = fileName.getOriginalFilename();
            HN_HnGarrisonInformation_ParseExcel.parseAndImportHnGarrisonInformation(inputStream,name,hnGarrisonInformationService);
            map.put("isParse","导入成功");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("isParse","导入失败");
        }
        return map;
    }

}
