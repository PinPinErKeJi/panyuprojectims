package com.panyu.panyuprojectims.controller.PS_controller.progress_controller;

import com.panyu.panyuprojectims.entity.PowerSupplyProgress;
import com.panyu.panyuprojectims.poi.PS_ExportPowerSupplyProgress_Excel;
import com.panyu.panyuprojectims.service.PowerSupplyProgressService;
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
@RequestMapping("PS")
public class PowerSupplyProgressController {

    @Autowired
    private PowerSupplyProgressService powerSupplyProgressService;

    @RequestMapping("selectPowerSupplyProgress")
    public @ResponseBody
    PageHelperUtil selectPowerSupplyProgress(
            Integer page, Integer rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String siteSupervision,
            String projectLeader
    ){
        PageHelperUtil pageHelperUtil = powerSupplyProgressService.selectPowerSupplyProgress(page, rows, province, city, county, buildYear, buildingProject, operator, siteSupervision, projectLeader);
        return pageHelperUtil;
    }
    @RequestMapping("importPowerSupplyProgressExcel")
    public void importPowerSupplyProgressExcel(String[] ids, HttpServletRequest request, HttpServletResponse response) {
        try {
            List<PowerSupplyProgress> powerSupplyProgressList = powerSupplyProgressService.importPowerSupplyProgressExcel(ids);
            // 1、创建一个Excel表格
            HSSFWorkbook wb = new HSSFWorkbook();
            // 2、创建工作薄
            HSSFSheet Sheet = wb.createSheet("电源进度信息数据");
            // 创建一个文件名
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            String dateString = formatter.format(currentTime);
            String fileName = "用户"+dateString+".xls";
            Map map = PS_ExportPowerSupplyProgress_Excel.getMap();
            PS_ExportPowerSupplyProgress_Excel.createPowerSupplyProgressExcel(powerSupplyProgressList,map,Sheet,wb);
            PS_ExportPowerSupplyProgress_Excel.setAttachmentFileName(request,response,fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
