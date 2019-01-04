package com.panyu.panyuprojectims.controller.FA_controller.AOG_controller;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.poi.FAExportArrivalStatisticsExcel;
import com.panyu.panyuprojectims.poi.FAExportEquipmentDegreeExcel;
import com.panyu.panyuprojectims.service.*;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("FA")
public class FaArrivalStatisticsController {
    @Autowired private FaArrivalStatisticsService faArrivalStatisticsService;
    @Autowired private FaStatisticsNewEquipmentService faStatisticsNewEquipmentService;
    @Autowired private FaVeneerExpansionService faVeneerExpansionService;
    @Autowired private FaArrivalPowerCordService faArrivalPowerCordService;
    @Autowired private FaArrivalPigtailService faArrivalPigtailService;

    FileOutputStream fileOut = null;
    BufferedImage bufferImg1 = null;//图片一
    BufferedImage bufferImg2 = null;//图片二
    BufferedImage bufferImg3 = null;//图片三
    BufferedImage bufferImg4 = null;//图片四
    //数据导出
    @RequestMapping("FaArrivalStatisticsExcel")
    public void FaArrivalStatisticsExcel(String[] ids, HttpServletRequest request, HttpServletResponse response) {

        try {

            List<FaArrivalStatistics> faArrivalStatisticsList = faArrivalStatisticsService.FaArrivalStatisticsExcel(ids);
            for (FaArrivalStatistics fa:faArrivalStatisticsList
                 ) {
                //获取图片
               /* String equipmentVerifyingPhotos = faStatisticsNewEquipmentService.selectEquipmentVerifyingPhotos(fa.getArrivalStatisticsId());
                String veneerVerifyingPhotos = faVeneerExpansionService.selectVeneerVerifyingPhotos(fa.getArrivalStatisticsId());
                String powerCordVerifyingPhotos = faArrivalPowerCordService.selectPowerCordVerifyingPhotos(fa.getArrivalStatisticsId());
                String pigtailVerifyingPhotos = faArrivalPigtailService.selectPigtailVerifyingPhotos(fa.getArrivalStatisticsId());

                //System.out.println("equipmentVerifyingPhotos:"+equipmentVerifyingPhotos);
                // 先把读进来的图片放到一个ByteArrayOutputStream中，以便产生ByteArray
                ByteArrayOutputStream byteArrayOut1 = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOut2 = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOut3 = new ByteArrayOutputStream();
                ByteArrayOutputStream byteArrayOut4 = new ByteArrayOutputStream();


                //将两张图片读到BufferedImage
                bufferImg1 = ImageIO.read(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo\\"+equipmentVerifyingPhotos));
                bufferImg2 = ImageIO.read(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo\\"+veneerVerifyingPhotos));
                bufferImg3 = ImageIO.read(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo\\"+powerCordVerifyingPhotos));
                bufferImg4 = ImageIO.read(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo\\"+pigtailVerifyingPhotos));

                ImageIO.write(bufferImg1, "jpg", byteArrayOut1);
                ImageIO.write(bufferImg2, "jpg", byteArrayOut2);
                ImageIO.write(bufferImg3, "jpg", byteArrayOut3);
                ImageIO.write(bufferImg4, "jpg", byteArrayOut4);*/

                // 1、创建一个Excel表格
                HSSFWorkbook wb = new HSSFWorkbook();
                // 2、创建工作薄
                HSSFSheet FAArrivalStatisticsSheet = wb.createSheet("导出设备到货信息");

               /* HSSFPatriarch patriarch = FAArrivalStatisticsSheet.createDrawingPatriarch();

                //图片一导出到单元格B2中
                HSSFClientAnchor anchor1 = new HSSFClientAnchor(14, 14, 0, 0,
                        (short) 16, 2, (short) 17, 3);
                //图片二导出到单元格C3到E5中，且图片的left和top距离边框50
                HSSFClientAnchor anchor2 = new HSSFClientAnchor(14, 14, 0, 0,
                        (short) 22, 2, (short) 23, 3);
                //图片三导出到单元格C3到E5中，且图片的left和top距离边框50
                HSSFClientAnchor anchor3 = new HSSFClientAnchor(14, 14, 0, 0,
                        (short) 29, 2, (short) 30, 3);
                //图片四导出到单元格C3到E5中，且图片的left和top距离边框50
                HSSFClientAnchor anchor4 = new HSSFClientAnchor(14, 14, 0, 0,
                        (short) 38, 2, (short) 39, 3);



                // 插入图片
                patriarch.createPicture(anchor1, wb.addPicture(byteArrayOut1
                        .toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
                patriarch.createPicture(anchor2, wb.addPicture(byteArrayOut2
                        .toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
                patriarch.createPicture(anchor3, wb.addPicture(byteArrayOut3
                        .toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));
                patriarch.createPicture(anchor4, wb.addPicture(byteArrayOut4
                        .toByteArray(), HSSFWorkbook.PICTURE_TYPE_JPEG));

*/

                //System.out.println(faArrivalStatisticsList+":controller里面的数据");
                // 创建一个文件名
                Date currentTime = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
                String dateString = formatter.format(currentTime);
                String fileName = "用户"+dateString+".xls";
             /*   fileOut = new FileOutputStream("'用户'+dateString+'.xls'");*/

                Map listmap = FAExportArrivalStatisticsExcel.getMap();
                //System.out.println(listmap+"字段数据");
                FAExportArrivalStatisticsExcel.createFAExportArrivalStatisticsExcel(faArrivalStatisticsList,listmap,FAArrivalStatisticsSheet,wb);
                FAExportArrivalStatisticsExcel.setAttachmentFileName(request,response,fileName);
                OutputStream os = response.getOutputStream();
                wb.write(os);
                os.flush();
                os.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //数据展示和模糊查询
    @RequestMapping("selectFaArrivalStatistics")
    public @ResponseBody
    PageHelperUtil selectFaArrivalStatistics(Integer page, Integer rows,
                                                String province,
                                                String city,
                                                String county,
                                                String buildYear,
                                                String buildingProject,
                                                String operator,
                                                String onSiteSupervision,
                                                String projectLeader){
        PageHelperUtil pageHelperUtil = faArrivalStatisticsService.selectFaArrivalStatistics(
                page, rows, province, city, county, buildYear, buildingProject, operator, onSiteSupervision,
                 projectLeader);
        return pageHelperUtil;
    }
}
