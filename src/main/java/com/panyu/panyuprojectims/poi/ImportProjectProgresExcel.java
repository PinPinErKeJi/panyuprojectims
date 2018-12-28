package com.panyu.panyuprojectims.poi;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class ImportProjectProgresExcel {

    public static  Map getListmap(){

        Map map=new HashMap();

        map.put(0,"运营商");
        map.put(1,"建设年份");
        map.put(2,"建设项目名称");
        map.put(3,"规划名称");
        map.put(4,"实际名称");
        map.put(5,"规划经度");
        map.put(6,"实际经度");
        map.put(7,"规划纬度");
        map.put(8,"实际纬度");
        map.put(9,"省");
        map.put(10,"市");
        map.put(11,"县（区）");
        map.put(12,"区域");
        map.put(13,"现场监理");
        map.put(14,"专业负责人");
        map.put(15,"区域负责人");
        map.put(16,"覆盖场景");
        map.put(17,"建设方式");
        map.put(18,"基础类型");
        map.put(19,"基础施工单位");
        map.put(20,"基础施工单位联系人");
        map.put(21,"天支类型");
        map.put(22,"天支供货厂家");
        map.put(23,"天支供货厂家联系人");
        map.put(24,"天支施工单位");
        map.put(25,"天支施工单位联系人");
        map.put(26,"天支高度（m）");
        map.put(27,"建设方式");
        map.put(28,"机房类型");
        map.put(29,"土建单位");
        map.put(30,"土建单位联系人");
        map.put(31,"装修单位");
        map.put(32,"装修单位联系人");
        map.put(33,"建设方式");
        map.put(34,"外电类型");
        map.put(35,"施工单位");
        map.put(36,"施工单位联系人");
        map.put(37,"建设方式");
        map.put(38,"主设备类型");
        map.put(39,"供货厂家");
        map.put(40,"供货厂家联系人");
        map.put(41,"施工单位");
        map.put(42,"施工单位联系人");
        map.put(43,"建设方式");
        map.put(44,"空调品牌");
        map.put(45,"规格型号");
        map.put(46,"施工单位");
        map.put(47,"施工单位联系人");
        map.put(48,"建设方式");
        map.put(49,"手提式灭火器数量（个）");
        map.put(50,"喷淋式灭火器数量（个）");
        map.put(51,"供货厂家");
        map.put(52,"供货厂家联系人");
        map.put(53,"安装单位");
        map.put(54,"安装单位联系人");
        map.put(55,"建设方式");
        map.put(56,"供货厂家");
        map.put(57,"供货厂家联系人");
        map.put(58,"施工单位");
        map.put(59,"施工单位联系人");

        return map;

    }

    static String[] excelHeader= {
            "运营商","建设年份","建设项目名称",
            "基站名称","基站名称",
            "规划经度","实际经度","规划纬度","实际纬度","省", "市","县（区）","区域","现场监理","专业负责人","区域负责人","覆盖场景",
            "天支","天支","天支","天支","天支","天支","天支","天支","天支","天支",
            "机房","机房","机房","机房","机房","机房",
            "外电引入","外电引入","外电引入","外电引入",
            "主设备","主设备","主设备","主设备","主设备","主设备",
            "空调","空调","空调","空调","空调",
            "消防设施","消防设施","消防设施","消防设施","消防设施","消防设施","消防设施",
            "动力环境监控","动力环境监控","动力环境监控","动力环境监控","动力环境监控"};

    /*static String[] excelSecond= {
            "规划名称","实际名称",
            "建设方式","基础类型","基础施工单位","基础施工单位联系人","天支类型", "天支供货厂家","天支供货厂家联系人","天支施工单位","天支施工单位联系人","天支高度（m）",
            "建设方式","机房类型","土建单位","土建单位联系人","装修单位","装修单位联系人",
            "建设方式","外电类型","施工单位","施工单位联系人",
            "建设方式","主设备类型","供货厂家","供货厂家联系人","施工单位","施工单位联系人",
            "建设方式","空调品牌","规格型号","施工单位","施工单位联系人",
            "建设方式","手提式灭火器数量（个）","喷淋式灭火器数量（个）","供货厂家","供货厂家联系人","安装单位","安装单位联系人",
            "建设方式","供货厂家","供货厂家联系人","施工单位","施工单位联系人"
            };*/
    public static void createExcelOfProject(Map map,HSSFSheet sheet,HSSFWorkbook workbook) {

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
            for (int i = 0;i<excelHeader.length;i++){
                cell = row.createCell(i);
                cell.setCellValue(excelHeader[i]);
                cell.setCellStyle(cellStyle);
                sheet.autoSizeColumn(i);
            }

            sheet.addMergedRegion(new CellRangeAddress(0,1,0,0));
            sheet.addMergedRegion(new CellRangeAddress(0,1,1,1));
            sheet.addMergedRegion(new CellRangeAddress(0,1,2,2));

            sheet.addMergedRegion(new CellRangeAddress(0,0,3,4));

            sheet.addMergedRegion(new CellRangeAddress(0,1,5,5));
            sheet.addMergedRegion(new CellRangeAddress(0,1,6,6));
            sheet.addMergedRegion(new CellRangeAddress(0,1,7,7));
            sheet.addMergedRegion(new CellRangeAddress(0,1,8,8));
            sheet.addMergedRegion(new CellRangeAddress(0,1,9,9));
            sheet.addMergedRegion(new CellRangeAddress(0,1,10,10));
            sheet.addMergedRegion(new CellRangeAddress(0,1,11,11));
            sheet.addMergedRegion(new CellRangeAddress(0,1,12,12));
            sheet.addMergedRegion(new CellRangeAddress(0,1,13,13));
            sheet.addMergedRegion(new CellRangeAddress(0,1,14,14));
            sheet.addMergedRegion(new CellRangeAddress(0,1,15,15));
            sheet.addMergedRegion(new CellRangeAddress(0,1,16,16));

            sheet.addMergedRegion(new CellRangeAddress(0,0,17,26));
            sheet.addMergedRegion(new CellRangeAddress(0,0,27,32));
            sheet.addMergedRegion(new CellRangeAddress(0,0,33,36));
            sheet.addMergedRegion(new CellRangeAddress(0,0,37,42));
            sheet.addMergedRegion(new CellRangeAddress(0,0,43,47));
            sheet.addMergedRegion(new CellRangeAddress(0,0,48,54));
            sheet.addMergedRegion(new CellRangeAddress(0,0,55,59));

            row = sheet.createRow(1);
            for (int j = 3;j<5;j++){
                cell = row.createCell((short)j);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("基站名称" +(j-1));
                sheet.autoSizeColumn(j);
            }
            for (int a = 16;a<26;a++){
                cell = row.createCell((short)a);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("天支" +(a-1));
                sheet.autoSizeColumn(a);
            }
            for (int b = 26;b<32;b++){
                cell = row.createCell((short)b);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("机房" +(b-1));
                sheet.autoSizeColumn(b);
            }
            for (int c = 32;c<36;c++){
                cell = row.createCell((short)c);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("外电引入" +(c-1));
                sheet.autoSizeColumn(c);
            }
            for (int d = 36;d<42;d++){
                cell = row.createCell((short)d);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("主设备" +(d-1));
            }
            for (int e = 42;e<47;e++){
                cell = row.createCell((short)e);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("空调" +(e-1));
                sheet.autoSizeColumn(e);
            }
            for (int f = 47;f<54;f++){
                cell = row.createCell((short)f);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("消防设施" +(f-1));
                sheet.autoSizeColumn(f);
            }
            for (int g = 54;g<59;g++){
                cell = row.createCell((short)g);
                cell.setCellStyle(cellStyle);
                cell.setCellValue("动力环境监控" +(g-1));
                sheet.autoSizeColumn(g);
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
        sheet.setColumnWidth(53,20*256);
        sheet.setColumnWidth(54,20*256);
        sheet.setColumnWidth(55,20*256);
        sheet.setColumnWidth(56,20*256);
        sheet.setColumnWidth(57,20*256);
        sheet.setColumnWidth(58,20*256);
        sheet.setColumnWidth(59,20*256);

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
        row.createCell(53).setCellValue((String)map.get(53));
        row.createCell(54).setCellValue((String)map.get(54));
        row.createCell(55).setCellValue((String)map.get(55));
        row.createCell(56).setCellValue((String)map.get(56));
        row.createCell(57).setCellValue((String)map.get(57));
        row.createCell(58).setCellValue((String)map.get(58));
        row.createCell(59).setCellValue((String)map.get(59));
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
