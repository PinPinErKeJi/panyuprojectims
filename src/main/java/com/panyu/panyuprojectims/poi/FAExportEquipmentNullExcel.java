package com.panyu.panyuprojectims.poi;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class FAExportEquipmentNullExcel {

    public static  Map getMap(){

        Map map=new HashMap();

        map.put(0,"运营商");
        map.put(1,"建设年份");
        map.put(2,"建设项目名称");
        map.put(3,"机房名称");
        map.put(4,"机房经度");
        map.put(5,"机房纬度");
        map.put(6,"省");
        map.put(7,"市");
        map.put(8,"区（县）");
        map.put(9,"现场监理");
        map.put(10,"项目负责人");
        map.put(11,"编号");
        map.put(12,"类型");
        map.put(13,"名称");
        map.put(14,"型号");
        map.put(15,"设计数量");
        map.put(16,"尺寸");
        map.put(17,"供货厂家");
        map.put(18,"联系人");
        map.put(19,"编号");
        map.put(20,"板卡名称");
        map.put(21,"单板功能");
        map.put(22,"所在设备");
        map.put(23,"设计数量");
        map.put(24,"供货厂家");
        map.put(25,"联系人");
        map.put(26,"编号");
        map.put(27,"线缆类型");
        map.put(28,"规格型号");
        map.put(29,"条数");
        map.put(30,"单条长度（m）");
        map.put(31,"总长度（m）");
        map.put(32,"From：");
        map.put(33,"To:");
        map.put(34,"供货厂家");
        map.put(35,"联系人");
        map.put(36,"编号");
        map.put(37,"线缆类型");
        map.put(38,"规格型号");
        map.put(39,"条数");
        map.put(40,"单条长度（m）");
        map.put(41,"From：");
        map.put(42,"To:");
        map.put(43,"供货厂家");
        map.put(44,"联系人");
        map.put(45,"编号");
        map.put(46,"设计长度（m）");
        map.put(47,"供货厂家");
        map.put(48,"联系人");
        map.put(49,"编号");
        map.put(50,"设计长度（m）");
        map.put(51,"供货厂家");
        map.put(52,"联系人");

        return map;

    }

    static String[] excelSecond= {
            "运营商","建设年份","建设项目名称",
            "机房名称","机房经度","机房纬度","省", "市","区（县）","现场监理","项目负责人",
            "设备,机柜,电源柜,配线架","设备,机柜,电源柜,配线架","设备,机柜,电源柜,配线架","设备,机柜,电源柜,配线架","设备,机柜,电源柜,配线架","设备,机柜,电源柜,配线架","设备,机柜,电源柜,配线架","设备,机柜,电源柜,配线架",
            "板卡扩容","板卡扩容","板卡扩容","板卡扩容","板卡扩容","板卡扩容","板卡扩容",
            "电源线,网线,2M线","电源线,网线,2M线","电源线,网线,2M线","电源线,网线,2M线",
            "电源线,网线,2M线","电源线,网线,2M线","电源线,网线,2M线","电源线,网线,2M线","电源线,网线,2M线","电源线,网线,2M线",
            "尾纤,跳纤","尾纤,跳纤","尾纤,跳纤","尾纤,跳纤","尾纤,跳纤",
            "尾纤,跳纤","尾纤,跳纤","尾纤,跳纤","尾纤,跳纤",
            "走线架","走线架","走线架","走线架",
            "光纤槽道","光纤槽道","光纤槽道","光纤槽道"};

    public static void createExcelToEquipment(Map map,HSSFSheet sheet,HSSFWorkbook workbook) {

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

            sheet.addMergedRegion(new CellRangeAddress(0,0,11,18));
            sheet.addMergedRegion(new CellRangeAddress(0,0,19,25));
            sheet.addMergedRegion(new CellRangeAddress(0,0,26,35));
            sheet.addMergedRegion(new CellRangeAddress(0,0,36,44));
            sheet.addMergedRegion(new CellRangeAddress(0,0,45,48));
            sheet.addMergedRegion(new CellRangeAddress(0,0,49,52));


            row = sheet.createRow(1);
            for (int a = 10;a<18;a++){
                cell = row.createCell((short)a);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("设备,机柜,电源柜,配线架" +(a-1));
                sheet.autoSizeColumn(a);
            }
            for (int b = 18;b<25;b++){
                cell = row.createCell((short)b);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("板卡扩容" +(b-1));
                sheet.autoSizeColumn(b);
            }
            for (int c = 25;c<35;c++){
                cell = row.createCell((short)c);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("电源线,网线,2M线" +(c-1));
                sheet.autoSizeColumn(c);
            }
            for (int d = 35;d<44;d++){
                cell = row.createCell((short)d);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("尾纤,跳纤" +(d-1));
            }
            for (int e = 44;e<48;e++){
                cell = row.createCell((short)e);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("走线架" +(e-1));
                sheet.autoSizeColumn(e);
            }
            for (int f = 48;f<52;f++){
                cell = row.createCell((short)f);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("光纤槽道" +(f-1));
                sheet.autoSizeColumn(f);
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
        sheet.setColumnWidth(39,20*256);
        sheet.setColumnWidth(40,20*256);
        sheet.setColumnWidth(41,20*256);
        sheet.setColumnWidth(42,20*256);
        sheet.setColumnWidth(43,20*256);
        sheet.setColumnWidth(44,20*256);
        sheet.setColumnWidth(45,20*256);
        sheet.setColumnWidth(46,20*256);
        sheet.setColumnWidth(47,20*256);
        sheet.setColumnWidth(48,20*256);
        sheet.setColumnWidth(49,20*256);
        sheet.setColumnWidth(50,20*256);
        sheet.setColumnWidth(51,20*256);
        sheet.setColumnWidth(52,20*256);

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
        row.createCell(39).setCellValue((String)map.get(39));
        row.createCell(40).setCellValue((String)map.get(40));
        row.createCell(41).setCellValue((String)map.get(41));
        row.createCell(42).setCellValue((String)map.get(42));
        row.createCell(43).setCellValue((String)map.get(43));
        row.createCell(44).setCellValue((String)map.get(44));
        row.createCell(45).setCellValue((String)map.get(45));
        row.createCell(46).setCellValue((String)map.get(46));
        row.createCell(47).setCellValue((String)map.get(47));
        row.createCell(48).setCellValue((String)map.get(48));
        row.createCell(49).setCellValue((String)map.get(49));
        row.createCell(50).setCellValue((String)map.get(50));
        row.createCell(51).setCellValue((String)map.get(51));
        row.createCell(52).setCellValue((String)map.get(52));
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
