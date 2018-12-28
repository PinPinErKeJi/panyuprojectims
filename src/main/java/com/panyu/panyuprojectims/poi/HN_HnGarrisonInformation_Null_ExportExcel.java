package com.panyu.panyuprojectims.poi;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class HN_HnGarrisonInformation_Null_ExportExcel {

    public static  Map getMap(){

        Map map=new HashMap();

        map.put(0,"建设项目名称");
        map.put(1,"运营商");
        map.put(2,"建设年份");
        map.put(3,"单项工程名称");
        map.put(4,"省");
        map.put(5,"市");
        map.put(6,"区(县)");
        map.put(7,"区域类型");
        map.put(8,"经度");
        map.put(9,"纬度");
        map.put(10,"建设性质");
        map.put(11,"上联归属端局");

        map.put(12,"现场监理");
        map.put(13,"专业负责人");
        map.put(14,"区域负责人");

        map.put(15,"公司名称");
        map.put(16,"联系人");

        map.put(17,"公司名称");
        map.put(18,"联系人");

        map.put(19,"1:4");
        map.put(20,"1:8");
        map.put(21,"1:16");

        map.put(22,"1:4");
        map.put(23,"1:8");
        map.put(24,"1:16");
        map.put(25,"1:32");
        map.put(26,"1:64");

        map.put(27,"抱箍式");
        map.put(28,"壁挂式");

        map.put(29,"抱箍式");
        map.put(30,"壁挂式");

        map.put(31,"落地式");
        map.put(32,"壁挂式：");

        map.put(33,"架空光缆:");
        map.put(34,"管道光缆");
        map.put(35,"直埋光缆");
        map.put(36,"墙壁光缆");
        map.put(37,"桥架内光缆");
        map.put(38,"路面微槽光缆");


        return map;

    }

    static String[] excelSecond= {
            "建设项目名称","运营商","建设年份","单项工程名称","省","市","区（县）","区域类型","经度","纬度","建设性质","上联归属端局",
            "监理单位","监理单位","监理单位",
            "施工单位","施工单位",
            "设计单位","设计单位",
            "一级分光器设计数量（个）", "一级分光器设计数量（个）", "一级分光器设计数量（个）",
            "二级分光器设计数量（个）","二级分光器设计数量（个）","二级分光器设计数量（个）","二级分光器设计数量（个）","二级分光器设计数量（个）",
            "一级分光器箱设计数量（个）","一级分光器箱设计数量（个）",
            "二级分光器箱设计数量（个）","二级分光器箱设计数量（个）",
            "光缆交接箱设计数量（个）","光缆交接箱设计数量（个）",
            "光缆长度（m）","光缆长度（m）","光缆长度（m）","光缆长度（m）","光缆长度（m）","光缆长度（m）",
            };

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
            sheet.addMergedRegion(new CellRangeAddress(0,1,11,11));

            sheet.addMergedRegion(new CellRangeAddress(0,0,12,14));
            sheet.addMergedRegion(new CellRangeAddress(0,0,15,16));
            sheet.addMergedRegion(new CellRangeAddress(0,0,17,18));
            sheet.addMergedRegion(new CellRangeAddress(0,0,19,21));
            sheet.addMergedRegion(new CellRangeAddress(0,0,22,26));
            sheet.addMergedRegion(new CellRangeAddress(0,0,27,28));
            sheet.addMergedRegion(new CellRangeAddress(0,0,29,30));
            sheet.addMergedRegion(new CellRangeAddress(0,0,31,32));
            sheet.addMergedRegion(new CellRangeAddress(0,0,33,38));


            row = sheet.createRow(1);
            for (int a = 11;a<14;a++){
                cell = row.createCell((short)a);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("监理单位" +(a-1));
                sheet.autoSizeColumn(a);
            }
            for (int b = 14;b<16;b++){
                cell = row.createCell((short)b);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("施工单位" +(b-1));
                sheet.autoSizeColumn(b);
            }
            for (int c = 16;c<18;c++){
                cell = row.createCell((short)c);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("设计单位" +(c-1));
                sheet.autoSizeColumn(c);
            }
            for (int d = 18;d<21;d++){
                cell = row.createCell((short)d);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("一级分光器设计数量（个）" +(d-1));
            }
            for (int e = 21;e<26;e++){
                cell = row.createCell((short)e);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("二级分光器设计数量（个）" +(e-1));
                sheet.autoSizeColumn(e);
            }
            for (int f = 26;f<28;f++){
                cell = row.createCell((short)f);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("一级分光器箱设计数量（个）" +(f-1));
                sheet.autoSizeColumn(f);
            }
            for (int f = 28;f<30;f++){
                cell = row.createCell((short)f);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("二级分光器箱设计数量（个）" +(f-1));
                sheet.autoSizeColumn(f);
            }
            for (int f = 30;f<32;f++){
                cell = row.createCell((short)f);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("光缆交接箱设计数量（个）" +(f-1));
                sheet.autoSizeColumn(f);
            }
            for (int f = 32;f<38;f++){
                cell = row.createCell((short)f);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("光缆长度（m）" +(f-1));
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
