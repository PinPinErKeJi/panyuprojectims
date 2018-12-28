package com.panyu.panyuprojectims.poi;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class LL_ExportCircuitInformation_NullExcel {

    public static  Map getMap(){

        Map map=new HashMap();

        map.put(0,"运营商");
        map.put(1,"建设项目名称");
        map.put(2,"建设年份");
        map.put(3,"中继段名称");
        map.put(4,"省");
        map.put(5,"市");
        map.put(6,"区(县)");
        map.put(7,"区域");
        map.put(8,"所属部门");

        map.put(9,"公司名称");
        map.put(10,"设计人员");

        map.put(11,"现场监理");
        map.put(12,"专业负责人");
        map.put(13,"区域负责人");

        map.put(14,"公司名称");
        map.put(15,"负责人");

        map.put(16,"新建杆路");
        map.put(17,"新建管道");
        map.put(18,"直埋光缆");
        map.put(19,"顶管");

        map.put(20,"光缆类型");

        map.put(21,"架空光缆(附挂)");
        map.put(22,"架空光缆(加挂吊线)");
        map.put(23,"管道光缆");
        map.put(24,"直埋光缆");
        map.put(25,"墙壁光缆");
        map.put(26,"桥架内光缆");
        map.put(27,"路面微槽光缆");

        map.put(28,"数量");
        map.put(29,"规格");

        map.put(30,"数量");
        map.put(31,"规格");

        map.put(32,"数量");
        map.put(33,"规格");

        map.put(34,"数量");
        map.put(35,"规格");

        return map;
    }

    static String[] excelSecond= {
            "运营商","建设项目名称","建设年份",
            "中继段名称","省","市","区(县)", "区域","所属部门",
            "设计单位","设计单位",
            "监理单位","监理单位","监理单位",
            "施工单位","施工单位",
            "新建线路长度（km）","新建线路长度（km）","新建线路长度（km）","新建线路长度（km）",
            "光缆类型",
            "光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）",
            "光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）",
            "落地式光交箱（新建）","落地式光交箱（新建）",
            "落地式光交箱（利旧）","落地式光交箱（利旧）",
            "壁挂式光交箱（新建）","壁挂式光交箱（新建）",
            "壁挂式光交箱（利旧）","壁挂式光交箱（利旧）"};

    public static void createExcelToIndoorCoverage(Map map,HSSFSheet sheet,HSSFWorkbook workbook) {

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

            sheet.addMergedRegion(new CellRangeAddress(0,0,9,10));

            sheet.addMergedRegion(new CellRangeAddress(0,0,11,13));

            sheet.addMergedRegion(new CellRangeAddress(0,0,14,15));

            sheet.addMergedRegion(new CellRangeAddress(0,0,16,19));

            sheet.addMergedRegion(new CellRangeAddress(0,1,20,20));

            sheet.addMergedRegion(new CellRangeAddress(0,0,21,27));

            sheet.addMergedRegion(new CellRangeAddress(0,0,28,29));

            sheet.addMergedRegion(new CellRangeAddress(0,0,30,31));

            sheet.addMergedRegion(new CellRangeAddress(0,0,32,33));

            sheet.addMergedRegion(new CellRangeAddress(0,0,34,35));

            row = sheet.createRow(1);
            for (int a = 8;a<10;a++){
                cell = row.createCell((short)a);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("设计单位" +(a-1));
                sheet.autoSizeColumn(a);
            }
            for (int b = 10;b<13;b++){
                cell = row.createCell((short)b);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("监理单位" +(b-1));
                sheet.autoSizeColumn(b);
            }
            for (int c = 13;c<15;c++){
                cell = row.createCell((short)c);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("施工单位" +(c-1));
                sheet.autoSizeColumn(c);
            }
            for (int d = 15;d<19;d++){
                cell = row.createCell((short)d);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("新建线路长度（km）" +(d-1));
            }
            for (int e = 21;e<27;e++){
                cell = row.createCell((short)e);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("光缆设计皮长公里（km）" +(e-1));
                sheet.autoSizeColumn(e);
            }
            for (int f = 27;f<29;f++){
                cell = row.createCell((short)f);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("落地式光交箱（新建）" +(f-1));
                sheet.autoSizeColumn(f);
            }
            for (int g = 29;g<31;g++){
                cell = row.createCell((short)g);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("落地式光交箱（利旧）" +(g-1));
                sheet.autoSizeColumn(g);
            }
            for (int g = 31;g<33;g++){
                cell = row.createCell((short)g);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("壁挂式光交箱（新建）" +(g-1));
                sheet.autoSizeColumn(g);
            }
            for (int h = 33;h<35;h++){
                cell = row.createCell((short)h);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("壁挂式光交箱（利旧）" +(h-1));
                sheet.autoSizeColumn(h);
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
