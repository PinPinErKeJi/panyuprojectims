package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.FaArrivalStatistics;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FAExportArrivalStatisticsExcel {

        public static Map getMap(){
            Map map=new HashMap();

            map.put(0,"运营商");
            map.put(1,"建设年份");
            map.put(2,"建设项目名称");
            map.put(3,"机房名称");
            map.put(4,"机房经度");
            map.put(5,"机房纬度");
            map.put(6,"省");
            map.put(7,"市");
            map.put(8,"县（区）");
            map.put(9,"现场监理");
            map.put(10,"项目负责人");

            map.put(11,"编号");
            map.put(12,"类型");
            map.put(13,"设备型号");
            map.put(14,"机柜尺寸");
            map.put(15,"到货时间");
            map.put(16,"验货照片");

            map.put(17,"编号");
            map.put(18,"单板名称");
            map.put(19,"设计数量");
            map.put(20,"到货数量");
            map.put(21,"到货时间");
            map.put(22,"验货照片");

            map.put(23,"编号");
            map.put(24,"线缆类型");
            map.put(25,"规格型号");
            map.put(26,"设计长度(m)");
            map.put(27,"到货长度(m)");
            map.put(28,"到货时间");
            map.put(29,"验货照片");

            map.put(30,"编号");
            map.put(31,"线缆类型");
            map.put(32,"规格型号");
            map.put(33,"设计条数：");
            map.put(34,"设计单条长度(m)：");
            map.put(35,"到货数量");
            map.put(36,"到货单条长度(m)");
            map.put(37,"到货时间");
            map.put(38,"验货照片");

            return map;
        }

        static String[] excelSecond= {
                "运营商","建设年份","建设项目名称",
                "机房名称","机房经度","机房纬度","省", "市","区（县）","现场监理","项目负责人",
                "新增设备","新增设备","新增设备","新增设备","新增设备","新增设备",
                "扩容单板","扩容单板","扩容单板","扩容单板","扩容单板","扩容单板",
                "电源线、网线、2M线","电源线、网线、2M线","电源线、网线、2M线","电源线、网线、2M线","电源线、网线、2M线","电源线、网线、2M线","电源线、网线、2M线",
                "尾纤、跳纤","尾纤、跳纤","尾纤、跳纤","尾纤、跳纤","尾纤、跳纤","尾纤、跳纤","尾纤、跳纤","尾纤、跳纤","尾纤、跳纤",
        };

        public static void createFAExportArrivalStatisticsExcel(List<FaArrivalStatistics> faExportArrivalStatisticsList,
                                                              Map map, HSSFSheet sheet, HSSFWorkbook workbook) {

            HSSFCellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

            cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
            cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);


            HSSFFont font = workbook.createFont();
            font.setFontName("仿宋");
            font.setFontHeightInPoints((short)12);
            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);

            cellStyle.setFont(font);

            HSSFRow row = sheet.createRow((short)0);
            HSSFCell cell;
            for (int i = 0;i<excelSecond.length;i++){
                cell = row.createCell(i);
                cell.setCellValue(excelSecond[i]);
                cell.setCellStyle(cellStyle);
                sheet.autoSizeColumn(i);
            }

            sheet.addMergedRegion(new CellRangeAddress(0,1,0,0));
            sheet.addMergedRegion(new CellRangeAddress(0,1,1,1));
            sheet.addMergedRegion(new CellRangeAddress(0,1,2,2));
            sheet.addMergedRegion(new CellRangeAddress(0,1,3,3));
            sheet.addMergedRegion(new CellRangeAddress(0,1,4,4));
            sheet.addMergedRegion(new CellRangeAddress(0,1,5,5));
            sheet.addMergedRegion(new CellRangeAddress(0,1,6,6));
            sheet.addMergedRegion(new CellRangeAddress(0,1,7,7));
            sheet.addMergedRegion(new CellRangeAddress(0,1,8,8));
            sheet.addMergedRegion(new CellRangeAddress(0,1,9,9));
            sheet.addMergedRegion(new CellRangeAddress(0,1,10,10));


            sheet.addMergedRegion(new CellRangeAddress(0,0,11,16));
            sheet.addMergedRegion(new CellRangeAddress(0,0,17,22));
            sheet.addMergedRegion(new CellRangeAddress(0,0,23,29));
            sheet.addMergedRegion(new CellRangeAddress(0,0,30,38));

            row = sheet.createRow(1);
            for (int j = 10;j<16;j++){
                cell = row.createCell((short)j);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("新增设备" +(j-1));
                sheet.autoSizeColumn(j);
            }
            for (int a = 16;a<22;a++){
                cell = row.createCell((short)a);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("扩容单板" +(a-1));
                sheet.autoSizeColumn(a);
            }
            for (int b = 22;b<29;b++){
                cell = row.createCell((short)b);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("电源线、网线、2M线" +(b-1));
                sheet.autoSizeColumn(b);
            }
            for (int c = 29;c<38;c++){
                cell = row.createCell((short)c);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("新增走线架" +(c-1));
                sheet.autoSizeColumn(c);
            }


            //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256字符宽度
            sheet.setColumnWidth(0,20*256);
            sheet.setColumnWidth(1,20*256);
            sheet.setColumnWidth(2,20*256);
            sheet.setColumnWidth(3,20*256);
            sheet.setColumnWidth(4,20*256);
            sheet.setColumnWidth(5,20*256);
            sheet.setColumnWidth(6,20*256);
            sheet.setColumnWidth(7,20*256);
            sheet.setColumnWidth(8,20*256);
            sheet.setColumnWidth(9,20*256);
            sheet.setColumnWidth(10,20*256);
            sheet.setColumnWidth(11,20*256);
            sheet.setColumnWidth(12,20*256);
            sheet.setColumnWidth(13,20*256);
            sheet.setColumnWidth(14,20*256);
            sheet.setColumnWidth(15,20*256);
            sheet.setColumnWidth(16,20*256);
            sheet.setColumnWidth(17,20*256);
            sheet.setColumnWidth(18,20*256);
            sheet.setColumnWidth(19,20*256);
            sheet.setColumnWidth(20,20*256);
            sheet.setColumnWidth(21,20*256);
            sheet.setColumnWidth(22,20*256);
            sheet.setColumnWidth(23,20*256);
            sheet.setColumnWidth(24,20*256);
            sheet.setColumnWidth(25,20*256);
            sheet.setColumnWidth(26,20*256);
            sheet.setColumnWidth(27,20*256);
            sheet.setColumnWidth(28,20*256);
            sheet.setColumnWidth(29,20*256);
            sheet.setColumnWidth(30,20*256);
            sheet.setColumnWidth(31,20*256);
            sheet.setColumnWidth(32,20*256);
            sheet.setColumnWidth(33,20*256);
            sheet.setColumnWidth(34,20*256);
            sheet.setColumnWidth(35,20*256);
            sheet.setColumnWidth(36,20*256);
            sheet.setColumnWidth(37,20*256);
            sheet.setColumnWidth(38,20*256);

            row.createCell(0).setCellValue((String)map.get(0));
            row.createCell(1).setCellValue((String)map.get(1));
            row.createCell(2).setCellValue((String)map.get(2));
            row.createCell(3).setCellValue((String)map.get(3));
            row.createCell(4).setCellValue((String)map.get(4));
            row.createCell(5).setCellValue((String)map.get(5));
            row.createCell(6).setCellValue((String)map.get(6));
            row.createCell(7).setCellValue((String)map.get(7));
            row.createCell(8).setCellValue((String)map.get(8));
            row.createCell(9).setCellValue((String)map.get(9));
            row.createCell(10).setCellValue((String)map.get(10));
            row.createCell(11).setCellValue((String)map.get(11));
            row.createCell(12).setCellValue((String)map.get(12));
            row.createCell(13).setCellValue((String)map.get(13));
            row.createCell(14).setCellValue((String)map.get(14));
            row.createCell(15).setCellValue((String)map.get(15));
            row.createCell(16).setCellValue((String)map.get(16));
            row.createCell(17).setCellValue((String)map.get(17));
            row.createCell(18).setCellValue((String)map.get(18));
            row.createCell(19).setCellValue((String)map.get(19));
            row.createCell(20).setCellValue((String)map.get(20));
            row.createCell(21).setCellValue((String)map.get(21));
            row.createCell(22).setCellValue((String)map.get(22));
            row.createCell(23).setCellValue((String)map.get(23));
            row.createCell(24).setCellValue((String)map.get(24));
            row.createCell(25).setCellValue((String)map.get(25));
            row.createCell(26).setCellValue((String)map.get(26));
            row.createCell(27).setCellValue((String)map.get(27));
            row.createCell(28).setCellValue((String)map.get(28));
            row.createCell(29).setCellValue((String)map.get(29));
            row.createCell(30).setCellValue((String)map.get(30));
            row.createCell(31).setCellValue((String)map.get(31));
            row.createCell(32).setCellValue((String)map.get(32));
            row.createCell(33).setCellValue((String)map.get(33));
            row.createCell(34).setCellValue((String)map.get(34));
            row.createCell(35).setCellValue((String)map.get(35));
            row.createCell(36).setCellValue((String)map.get(36));
            row.createCell(37).setCellValue((String)map.get(37));
            row.createCell(38).setCellValue((String)map.get(38));


            FaArrivalStatistics faArrivalStatistics = new FaArrivalStatistics();

            // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
            if (faExportArrivalStatisticsList != null) {
                // 8 从集合的最高下标 递减 添加数据
                for (int i = faExportArrivalStatisticsList.size() - 1; i >= 0; i--) {
                    faArrivalStatistics = faExportArrivalStatisticsList.get(i);
                    //运营商
                    String operator = faArrivalStatistics.getOperator();
                    if (operator != null && operator.equals("null")) {
                        operator = "";
                    }
                    //建设年份
                    String buildYear = faArrivalStatistics.getBuildYear();
                    if (buildYear != null && buildYear.equals("null")) {
                        buildYear = "";
                    }
                    //建设项目
                    String buildingProject = faArrivalStatistics.getBuildingProject();
                    if (buildingProject != null && buildingProject.equals("null")) {
                        buildingProject = "";
                    }
                    //机房名称
                    String motorRoomName = faArrivalStatistics.getMotorRoomName();
                    if (motorRoomName != null && motorRoomName.equals("null")) {
                        motorRoomName = "";
                    }
                    //机房经度
                    String motorRoomLongitude = faArrivalStatistics.getMotorRoomLongitude();
                    if (motorRoomLongitude != null && motorRoomLongitude.equals("null")) {
                        motorRoomLongitude = "";
                    }
                    //机房纬度
                    String motorRoomLatitude = faArrivalStatistics.getMotorRoomLatitude();
                    if (motorRoomLatitude != null && motorRoomLatitude.equals("null")) {
                        motorRoomLatitude = "";
                    }
                    //省
                    String province = faArrivalStatistics.getProvince();
                    if(province!=null&&province.equals("null")){
                        province="";
                    }
                    //市
                    String city = faArrivalStatistics.getCity();
                    if(city!=null&&city.equals("null")){
                        city="";
                    }
                    //县（区）
                    String county = faArrivalStatistics.getCounty();
                    if(county!=null&&county.equals("null")){
                        county="";
                    }
                    //现场监理
                    String onSiteSupervision = faArrivalStatistics.getOnSiteSupervision();
                    if(onSiteSupervision!=null&&onSiteSupervision.equals("null")){
                        onSiteSupervision="";
                    }
                    //项目负责人
                    String projectLeader = faArrivalStatistics.getProjectLeader();
                    if(projectLeader!=null&&projectLeader.equals("null")){
                        projectLeader="";
                    }
                    //1.---------------------------------------------------
                    //编号
                    String statisticsEquipmentNumber = faArrivalStatistics.getStatisticsEquipmentNumber();
                    if(statisticsEquipmentNumber!=null&&statisticsEquipmentNumber.equals("null")){
                        statisticsEquipmentNumber="";
                    }
                    //类型
                    String statisticsEquipmentType = faArrivalStatistics.getStatisticsEquipmentType();
                    if(statisticsEquipmentType!=null&&statisticsEquipmentType.equals("null")){
                        statisticsEquipmentType="";
                    }
                    //设备型号
                    String statisticsEquipmentModel = faArrivalStatistics.getStatisticsEquipmentModel();
                    if(statisticsEquipmentModel!=null&&statisticsEquipmentModel.equals("null")){
                        statisticsEquipmentModel="";
                    }
                    //机柜尺寸
                    String equipmentCabinetSize = faArrivalStatistics.getEquipmentCabinetSize();
                    if(equipmentCabinetSize!=null&&equipmentCabinetSize.equals("null")){
                        equipmentCabinetSize="";
                    }
                    //到货时间
                    String equipmentArrivalTime = faArrivalStatistics.getEquipmentArrivalTime();
                    if(equipmentArrivalTime!=null&&equipmentArrivalTime.equals("null")){
                        equipmentArrivalTime="";
                    }
                    //验货照片
                    String equipmentVerifyingPhotos = faArrivalStatistics.getEquipmentVerifyingPhotos();
                    if(equipmentVerifyingPhotos!=null&&equipmentVerifyingPhotos.equals("null")){
                        equipmentVerifyingPhotos="";
                    }
                    //2.--------------------------------------------------------------------------
                    //编号
                    String veneerExpansionNumber = faArrivalStatistics.getVeneerExpansionNumber();
                    if(veneerExpansionNumber!=null&&veneerExpansionNumber.equals("null")){
                        veneerExpansionNumber="";
                    }//单板名称
                    String veneerExpansionName = faArrivalStatistics.getVeneerExpansionName();
                    if(veneerExpansionName!=null&&veneerExpansionName.equals("null")){
                        veneerExpansionName="";
                    }
                    //设计数量
                    String veneerDesignQuantity = faArrivalStatistics.getVeneerDesignQuantity();
                    if(veneerDesignQuantity!=null&&veneerDesignQuantity.equals("null")){
                        veneerDesignQuantity="";
                    }
                    //到货数量
                    String veneerArrivalNumber = faArrivalStatistics.getVeneerArrivalNumber();
                    if(veneerArrivalNumber!=null&&veneerArrivalNumber.equals("null")){
                        veneerArrivalNumber="";
                    }
                    //到货时间
                    String veneerArrivalTime = faArrivalStatistics.getVeneerArrivalTime();
                    if(veneerArrivalTime!=null&&veneerArrivalTime.equals("null")){
                        veneerArrivalTime="";
                    }
                    //验货照片
                    String veneerVerifyingPhotos = faArrivalStatistics.getVeneerVerifyingPhotos();
                    if(veneerVerifyingPhotos!=null&&veneerVerifyingPhotos.equals("null")){
                        veneerVerifyingPhotos="";
                    }
                    //3.--------------------------------------------------------------------------------
                    //编号
                    String arrivalPowerCordNumber = faArrivalStatistics.getArrivalPowerCordNumber();
                    if(arrivalPowerCordNumber!=null&&arrivalPowerCordNumber.equals("null")){
                        arrivalPowerCordNumber="";
                    }
                    //线缆类型
                    String arrivalCableType = faArrivalStatistics.getArrivalCableType();
                    if(arrivalCableType!=null&&arrivalCableType.equals("null")){
                        arrivalCableType="";
                    }
                    //规格型号
                    String arrivalSpecificationModel = faArrivalStatistics.getArrivalSpecificationModel();
                    if(arrivalSpecificationModel!=null&&arrivalSpecificationModel.equals("null")){
                        arrivalSpecificationModel="";
                    }
                    //设计长度(m)
                    String arrivalDesignLength = faArrivalStatistics.getArrivalDesignLength();
                    if(arrivalDesignLength!=null&&arrivalDesignLength.equals("null")){
                        arrivalDesignLength="";
                    }
                    //到货长度(m)
                    String arrivalLength = faArrivalStatistics.getArrivalLength();
                    if(arrivalLength!=null&&arrivalLength.equals("null")){
                        arrivalLength="";
                    }
                    //到货时间
                    String arrivalTime = faArrivalStatistics.getArrivalTime();
                    if(arrivalTime!=null&&arrivalTime.equals("null")){
                        arrivalTime="";
                    }
                    //验货照片
                    String powerCordVerifyingPhotos = faArrivalStatistics.getPowerCordVerifyingPhotos();
                    if(powerCordVerifyingPhotos!=null&&powerCordVerifyingPhotos.equals("null")){
                        powerCordVerifyingPhotos="";
                    }
                    //4.----------------------------------------------------------------------------------------
                    //编号
                    String arrivalPigtailNumber = faArrivalStatistics.getArrivalPigtailNumber();
                    if(arrivalPigtailNumber!=null&&arrivalPigtailNumber.equals("null")){
                        arrivalPigtailNumber="";
                    }
                    //线缆类型
                    String pigtailCableType = faArrivalStatistics.getPigtailCableType();
                    if(pigtailCableType!=null&&pigtailCableType.equals("null")){
                        pigtailCableType="";
                    }
                    //规格型号
                    String pigtailSpecificationModel = faArrivalStatistics.getPigtailSpecificationModel();
                    if(pigtailSpecificationModel!=null&&pigtailSpecificationModel.equals("null")){
                        pigtailSpecificationModel="";
                    }
                    //设计条数
                    String pigtailDesignBars = faArrivalStatistics.getPigtailDesignBars();
                    if(pigtailDesignBars!=null&&pigtailDesignBars.equals("null")){
                        pigtailDesignBars="";
                    }
                    //设计单条长度(m)
                    String designSingleLength = faArrivalStatistics.getDesignSingleLength();
                    if(designSingleLength!=null&&designSingleLength.equals("null")){
                        designSingleLength="";
                    }
                    //到货数量
                    String pigtailArrivalsNumber = faArrivalStatistics.getPigtailArrivalsNumber();
                    if(pigtailArrivalsNumber!=null&&pigtailArrivalsNumber.equals("null")){
                        pigtailArrivalsNumber="";
                    }
                    //到货单条长度(m)
                    String arrivalSingleLength = faArrivalStatistics.getArrivalSingleLength();
                    if(arrivalSingleLength!=null&&arrivalSingleLength.equals("null")){
                        arrivalSingleLength="";
                    }
                    //到货时间
                    String pigtailArrivalTime = faArrivalStatistics.getPigtailArrivalTime();
                    if(pigtailArrivalTime!=null&&pigtailArrivalTime.equals("null")){
                        pigtailArrivalTime="";
                    }
                    //验货照片
                    String pigtailVerifyingPhotos = faArrivalStatistics.getPigtailVerifyingPhotos();
                    if(pigtailVerifyingPhotos!=null&&pigtailVerifyingPhotos.equals("null")){
                        pigtailVerifyingPhotos="";
                    }



                    row = sheet.createRow(i + 2);
                    row.createCell(0).setCellValue(operator);
                    row.createCell(1).setCellValue(buildYear);
                    row.createCell(2).setCellValue(buildingProject);
                    row.createCell(3).setCellValue(motorRoomName);
                    row.createCell(4).setCellValue(motorRoomLongitude);
                    row.createCell(5).setCellValue(motorRoomLatitude);
                    row.createCell(6).setCellValue(province);
                    row.createCell(7).setCellValue(city);
                    row.createCell(8).setCellValue(county);
                    row.createCell(9).setCellValue(onSiteSupervision);
                    row.createCell(10).setCellValue(projectLeader);
                    row.createCell(11).setCellValue(statisticsEquipmentNumber);
                    row.createCell(12).setCellValue(statisticsEquipmentType);
                    row.createCell(13).setCellValue(statisticsEquipmentModel);
                    row.createCell(14).setCellValue(equipmentCabinetSize);
                    row.createCell(15).setCellValue(equipmentArrivalTime);
                    row.createCell(16).setCellValue(equipmentVerifyingPhotos);
                    row.createCell(17).setCellValue(veneerExpansionNumber);
                    row.createCell(18).setCellValue(veneerExpansionName);
                    row.createCell(19).setCellValue(veneerDesignQuantity);
                    row.createCell(20).setCellValue(veneerArrivalNumber);
                    row.createCell(21).setCellValue(veneerArrivalTime);
                    row.createCell(22).setCellValue(veneerVerifyingPhotos);
                    row.createCell(23).setCellValue(arrivalPowerCordNumber);
                    row.createCell(24).setCellValue(arrivalCableType);
                    row.createCell(25).setCellValue(arrivalSpecificationModel);
                    row.createCell(26).setCellValue(arrivalDesignLength);
                    row.createCell(27).setCellValue(arrivalLength);
                    row.createCell(28).setCellValue(arrivalTime);
                    row.createCell(29).setCellValue(powerCordVerifyingPhotos);
                    row.createCell(30).setCellValue(arrivalPigtailNumber);
                    row.createCell(31).setCellValue(pigtailCableType);
                    row.createCell(32).setCellValue(pigtailSpecificationModel);
                    row.createCell(33).setCellValue(pigtailDesignBars);
                    row.createCell(34).setCellValue(designSingleLength);
                    row.createCell(35).setCellValue(pigtailArrivalsNumber);
                    row.createCell(36).setCellValue(arrivalSingleLength);
                    row.createCell(37).setCellValue(pigtailArrivalTime);
                    row.createCell(38).setCellValue(pigtailVerifyingPhotos);
                }
            }
        }
        /**
         * 设置下载文件编码/响应格式
         *
         * @param request
         * @param response
         * @param fileName
         * @throws UnsupportedEncodingException
         */
        public final static void setAttachmentFileName(HttpServletRequest request,
                                                       HttpServletResponse response, String fileName)
                throws UnsupportedEncodingException {
            response.setCharacterEncoding("UTF-8");
            // 下载响应格式
            response.setContentType("application/octet-stream;charset=UTF-8");
            // 防止中文乱码，设置文本的编码格式
            fileName = new String(fileName.getBytes("GBK"), "ISO-8859-1");
            response.setHeader("Content-Disposition", "attachment; filename="+ fileName);
        }


}
