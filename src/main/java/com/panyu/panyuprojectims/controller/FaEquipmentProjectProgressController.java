package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.FaEquipmentProjectProgress;
import com.panyu.panyuprojectims.poi.FAExportEquipmentDegreeExcel;
import com.panyu.panyuprojectims.service.FaEquipmentProjectProgressService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class FaEquipmentProjectProgressController {

    @Autowired
    private FaEquipmentProjectProgressService faEquipmentProjectProgressService;

    @RequestMapping("selectFaEquipmentProjectProgress")
    public @ResponseBody
    PageHelperUtil selectFaEquipmentProjectProgress(Integer page, Integer rows,
                                                    String province,
                                                    String city,
                                                    String county,
                                                    String buildYear,
                                                    String buildingProject,
                                                    String operator,
                                                    String onSiteSupervision,
                                                    String projectLeader){
        PageHelperUtil pageHelperUtil = faEquipmentProjectProgressService.selectFaEquipmentProjectProgress(
                page, rows, province, city, county, buildYear, buildingProject, operator,  onSiteSupervision,
                 projectLeader);
        return pageHelperUtil;
    }

    //导出数据
    @RequestMapping("FAEquipmentProgressDegreeExcel")
    public void FAEquipmentProgressDegreeExcel(String[] ids, HttpServletRequest request, HttpServletResponse response) {
        try {
            List<FaEquipmentProjectProgress> faEquipmentProjectProgressList = faEquipmentProjectProgressService.FaEquipmentProjectProgressExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet FAEquipmentProgressDegreeSheet = wb.createSheet("FAEquipmentProgress");
            //System.out.println(faEquipmentProjectProgressList+":controller里面的数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map listmap = FAExportEquipmentDegreeExcel.getMap();
            //System.out.println(listmap+"字段数据");
            FAExportEquipmentDegreeExcel.createFAExportEquipmentDegreeExcel(faEquipmentProjectProgressList,listmap,FAEquipmentProgressDegreeSheet,wb);
            FAExportEquipmentDegreeExcel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
