package com.panyu.panyuprojectims.poi;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class PS_PowerSupplyInformation_Null_ExportExcel {

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
        map.put(8,"区(县)");
        map.put(9,"现场监理");
        map.put(10,"项目负责人");

        map.put(11,"编号");
        map.put(12,"类型");
        map.put(13,"型号");
        map.put(14,"设计数量");
        map.put(15,"尺寸");
        map.put(16,"供货厂家");
        map.put(17,"联系人");

        map.put(18,"编号");
        map.put(19,"规格型号");
        map.put(20,"条数");
        map.put(21,"单条长度(m)");
        map.put(22,"总长度(m)");
        map.put(23,"From");
        map.put(24,"To");
        map.put(25,"供货厂家");
        map.put(26,"联系人");

        map.put(27,"编号");
        map.put(28,"设计长度(m)");
        map.put(29,"供货厂家");
        map.put(30,"联系人");

        return map;

    }

    static String[] excelSecond= {
            "运营商","建设年份","建设项目名称","机房名称","机房经度","机房纬度","省","市","区（县）","现场监理","项目负责人",
            "新增设备","新增设备","新增设备","新增设备","新增设备","新增设备","新增设备",
            "新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆",
            "新增走线架","新增走线架","新增走线架","新增走线架",
    };

    public static void createExcelToPowerSupplyInformation(Map map,HSSFSheet sheet,HSSFWorkbook workbook) {

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

            sheet.addMergedRegion(new CellRangeAddress(0,0,11,17));
            sheet.addMergedRegion(new CellRangeAddress(0,0,18,26));
            sheet.addMergedRegion(new CellRangeAddress(0,0,27,30));



            row = sheet.createRow(1);
            for (int a = 10;a<17;a++){
                cell = row.createCell((short)a);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("新增设备" +(a-1));
                sheet.autoSizeColumn(a);
            }
            for (int b = 17;b<26;b++){
                cell = row.createCell((short)b);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("新增电力电缆" +(b-1));
                sheet.autoSizeColumn(b);
            }
            for (int c = 26;c<30;c++){
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
