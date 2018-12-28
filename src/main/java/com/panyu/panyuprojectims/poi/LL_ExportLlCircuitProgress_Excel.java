package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.LlCircuitInformation;
import com.panyu.panyuprojectims.entity.LlCircuitProgress;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LL_ExportLlCircuitProgress_Excel {

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

        map.put(8,"公司名称");
        map.put(9,"设计人员");

        map.put(10,"现场监理");
        map.put(11,"专业负责人");
        map.put(12,"区域负责人");

        map.put(13,"公司名称");
        map.put(14,"负责人");
//新建线路长度（km）  设计长度   完工长度
        map.put(15,"新建杆路");//新建杆路
        map.put(16,"新建杆路");
        map.put(17,"新建管道");//新建管道
        map.put(18,"新建管道");
        map.put(19,"直埋光缆");//直埋光缆
        map.put(20,"直埋光缆");
        map.put(21,"顶管");//顶管
        map.put(22,"顶管");

        map.put(23,"光缆类型");
//光缆设计皮长公里（km）设计长度   敷设长度
        map.put(24,"架空光缆（附挂）");//架空光缆（附挂）
        map.put(25,"架空光缆（附挂）");

        map.put(26,"架空光缆（加挂吊线）");//架空光缆（加挂吊线）
        map.put(27,"架空光缆（加挂吊线）");

        map.put(28,"管道光缆");//管道光缆
        map.put(29,"管道光缆");

        map.put(30,"直埋光缆");//直埋光缆
        map.put(31,"直埋光缆");

        map.put(32,"墙壁光缆");//墙壁光缆
        map.put(33,"墙壁光缆");

        map.put(34,"桥架内光缆");//桥架内光缆
        map.put(35,"桥架内光缆");

        map.put(36,"路面微槽光缆");//路面微槽光缆
        map.put(37,"路面微槽光缆");
//落地式光交箱（新建）
        map.put(38,"设计数量");
        map.put(39,"规格");
        map.put(40,"安装数量");
//落地式光交箱（利旧）
        map.put(41,"设计数量");
        map.put(42,"规格");
        map.put(43,"安装数量");
//壁挂式光交箱（新建）
        map.put(44,"设计数量");
        map.put(45,"规格");
        map.put(46,"安装数量");
//壁挂式光交箱（利旧）
        map.put(47,"设计数量");
        map.put(48,"规格");
        map.put(49,"安装数量");


        return map;
    }



    static String[] excelSecond= {
            "运营商","建设项目名称","建设年份",
            "中继段名称","省","市","区(县)", "区域",
            "设计单位","设计单位",
            "监理单位","监理单位","监理单位",
            "施工单位","施工单位",

            "新建线路长度（km）","新建线路长度（km）","新建线路长度（km）","新建线路长度（km）","新建线路长度（km）","新建线路长度（km）","新建线路长度（km）","新建线路长度（km）",

            "光缆类型",

            "光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）","光缆设计皮长公里（km）",

            "落地式光交箱（新建）","落地式光交箱（新建）","落地式光交箱（新建）",
            "落地式光交箱（利旧）","落地式光交箱（利旧）","落地式光交箱（利旧）",
            "壁挂式光交箱（新建）","壁挂式光交箱（新建）","壁挂式光交箱（新建）",
            "壁挂式光交箱（利旧）","壁挂式光交箱（利旧）","壁挂式光交箱（利旧）",
    };

    static String[] excelSecond1= {
            /* "新建杆路","新建杆路",
            "新建管道","新建管道",
            "直埋光缆","直埋光缆",
            "顶管","顶管",

            "架空光缆（附挂）","架空光缆（附挂）",
            "架空光缆（加挂吊线）","架空光缆（加挂吊线）",
            "管道光缆","管道光缆",
            "直埋光缆","直埋光缆",
            "墙壁光缆","墙壁光缆",
            "桥架内光缆","桥架内光缆",
            "路面微槽光缆","路面微槽光缆",*/
    };

	public static void createLlCircuitProgressExcel(List<LlCircuitProgress> llCircuitProgressList,
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

        HSSFRow row1 = sheet.createRow((short)2);
        for (int i = 0;i<excelSecond1.length;i++){
            cell = row1.createCell(i);
            sheet.autoSizeColumn(i);
        }


        sheet.addMergedRegion(new CellRangeAddress(0,2,0,0));
        sheet.addMergedRegion(new CellRangeAddress(0,2,1,1));
        sheet.addMergedRegion(new CellRangeAddress(0,2,2,2));
        sheet.addMergedRegion(new CellRangeAddress(0,2,3,3));
        sheet.addMergedRegion(new CellRangeAddress(0,2,4,4));
        sheet.addMergedRegion(new CellRangeAddress(0,2,5,5));
        sheet.addMergedRegion(new CellRangeAddress(0,2,6,6));
        sheet.addMergedRegion(new CellRangeAddress(0,2,7,7));

        sheet.addMergedRegion(new CellRangeAddress(0,0,8,9));
        sheet.addMergedRegion(new CellRangeAddress(1,2,8,8));
        sheet.addMergedRegion(new CellRangeAddress(1,2,9,9));

        sheet.addMergedRegion(new CellRangeAddress(0,0,10,12));
        sheet.addMergedRegion(new CellRangeAddress(1,2,10,10));
        sheet.addMergedRegion(new CellRangeAddress(1,2,11,11));
        sheet.addMergedRegion(new CellRangeAddress(1,2,12,12));

        sheet.addMergedRegion(new CellRangeAddress(0,0,13,14));
        sheet.addMergedRegion(new CellRangeAddress(1,2,13,13));
        sheet.addMergedRegion(new CellRangeAddress(1,2,14,14));
        sheet.addMergedRegion(new CellRangeAddress(0,0,15,22));

        sheet.addMergedRegion(new CellRangeAddress(0,2,23,23));

        sheet.addMergedRegion(new CellRangeAddress(0,0,24,37));

        sheet.addMergedRegion(new CellRangeAddress(0,0,38,40));
        sheet.addMergedRegion(new CellRangeAddress(1,2,38,38));
        sheet.addMergedRegion(new CellRangeAddress(1,2,39,39));
        sheet.addMergedRegion(new CellRangeAddress(1,2,40,40));

        sheet.addMergedRegion(new CellRangeAddress(0,0,41,43));
        sheet.addMergedRegion(new CellRangeAddress(1,2,41,41));
        sheet.addMergedRegion(new CellRangeAddress(1,2,42,42));
        sheet.addMergedRegion(new CellRangeAddress(1,2,43,43));

        sheet.addMergedRegion(new CellRangeAddress(0,0,44,46));
        sheet.addMergedRegion(new CellRangeAddress(1,2,44,44));
        sheet.addMergedRegion(new CellRangeAddress(1,2,45,45));
        sheet.addMergedRegion(new CellRangeAddress(1,2,46,46));

        sheet.addMergedRegion(new CellRangeAddress(0,0,47,49));
        sheet.addMergedRegion(new CellRangeAddress(1,2,47,47));
        sheet.addMergedRegion(new CellRangeAddress(1,2,48,48));
        sheet.addMergedRegion(new CellRangeAddress(1,2,49,49));

// ---------------------------------------------------------
        //三层属性
        row1 = sheet.createRow(2);
        for (int a = 15;a<16;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 16;a<17;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("完工长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 17;a<18;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 18;a<19;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("完工长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 19;a<20;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 20;a<21;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("完工长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 21;a<22;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 22;a<23;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("完工长度");
            sheet.autoSizeColumn(a);
        }
        // 设计长度   敷设长度
        for (int a = 24;a<25;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }

        for (int a = 25;a<26;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("敷设长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 26;a<27;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 27;a<28;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("敷设长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 28;a<29;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 29;a<30;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("敷设长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 30;a<31;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 31;a<32;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("敷设长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 32;a<33;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 33;a<34;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("敷设长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 34;a<35;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 35;a<36;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("敷设长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 36;a<37;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("设计长度");
            sheet.autoSizeColumn(a);
        }
        for (int a = 37;a<38;a++){
            cell = row1.createCell((short)a);
            cell.setCellValue("敷设长度");
            sheet.autoSizeColumn(a);
        }
//------------------------------------------------------
        //一层表头
        row = sheet.createRow(1);
        for (int a = 7;a<9;a++){
            cell = row.createCell((short)a);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("设计单位" +(a-1));
            sheet.autoSizeColumn(a);
        }
        for (int b = 9;b<12;b++){
            cell = row.createCell((short)b);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("监理单位" +(b-1));
            sheet.autoSizeColumn(b);
        }
        for (int c = 12;c<14;c++){
            cell = row.createCell((short)c);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("施工单位" +(c-1));
            sheet.autoSizeColumn(c);
        }
        for (int d = 14;d<22;d++){
            cell = row.createCell((short)d);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("新建线路长度（km）" +(d-1));
        }
        for (int e = 23;e<37;e++){
            cell = row.createCell((short)e);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("光缆设计皮长公里（km）" +(e-1));
            sheet.autoSizeColumn(e);
        }
        for (int f = 37;f<40;f++){
            cell = row.createCell((short)f);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("落地式光交箱（新建）" +(f-1));
            sheet.autoSizeColumn(f);
        }
        for (int g = 40;g<43;g++){
            cell = row.createCell((short)g);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("落地式光交箱（利旧）" +(g-1));
            sheet.autoSizeColumn(g);
        }
//
        for (int g = 43;g<46;g++){
            cell = row.createCell((short)g);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("壁挂式光交箱（新建）" +(g-1));
            sheet.autoSizeColumn(g);
        }
        for (int h = 46;h<49;h++){
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

        LlCircuitProgress llCircuitProgress = new LlCircuitProgress();

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (llCircuitProgressList != null) {
			// 8 从集合的最高下标 递减 添加数据
			for (int i = llCircuitProgressList.size() - 1; i >= 0; i--) {
                llCircuitProgress = llCircuitProgressList.get(i);

                //1.运营商
				String operator = llCircuitProgress.getOperator();
				if (operator != null && operator.equals("null")) {
                    operator = "";
				}

                //2.建设项目名称
                String buildingProject = llCircuitProgress.getBuildingProject();
                if (buildingProject != null && buildingProject.equals("null")) {
                    buildingProject = "";
                }

                //3.建设年份
                String buildYear = llCircuitProgress.getBuildYear();
                if (buildYear != null && buildYear.equals("null")) {
                    buildYear = "";
				}

                //4.中继段名称
                String hopName = llCircuitProgress.getHopName();
                if (hopName != null && hopName.equals("null")) {
                    hopName = "";
				}

                //5.省
                String province = llCircuitProgress.getProvince();
                if(province!=null && province.equals("null")){
                    province="";
				}

                //6.市
                String city = llCircuitProgress.getCity();
                if(city!=null && city.equals("null")){
                    city="";
				}

                //7.区(县)
                String county = llCircuitProgress.getCounty();
                if(county!=null && county.equals("null")){
                    county="";
                }

                //8.区域
                String area = llCircuitProgress.getArea();
                if(area!=null&&area.equals("null")){
                    area="";
                }

                //9.公司名称
                String companyName = llCircuitProgress.getCompanyName();
                if(companyName!=null&&companyName.equals("null")){
                    companyName="";
                }

                //10.设计人员
                String designPersonnel = llCircuitProgress.getDesignPersonnel();
                if(designPersonnel!=null&&designPersonnel.equals("null")){
                    designPersonnel="";
                }

                //11.现场监理
                String siteLeader = llCircuitProgress.getSiteLeader();
                if(siteLeader!=null&&siteLeader.equals("null")){
                    siteLeader="";
                }

                //12.专业负责人
                String professionResponsiblePerson = llCircuitProgress.getProfessionResponsiblePerson();
                if(professionResponsiblePerson!=null&&professionResponsiblePerson.equals("null")){
                    professionResponsiblePerson="";
                }

                //13.区域负责人
                String districtHead = llCircuitProgress.getDistrictHead();
                if(districtHead!=null&&districtHead.equals("null")){
                    districtHead="";
                }

                //14.公司名称
                String corporateName = llCircuitProgress.getCorporateName();
                if(corporateName!=null&&corporateName.equals("null")){
                    corporateName="";
                }

                //15.负责人
                String personInCharge = llCircuitProgress.getPersonInCharge();
                if(personInCharge!=null&&personInCharge.equals("null")){
                    personInCharge="";
                }

                //16.设计长度
                String poleDesignLength = llCircuitProgress.getPoleDesignLength();
                if(poleDesignLength!=null&&poleDesignLength.equals("null")){
                    poleDesignLength="";
                }

                //17.完工长度
                String poleCompletionLength = llCircuitProgress.getPoleCompletionLength();
                if(poleCompletionLength!=null&&poleCompletionLength.equals("null")){
                    poleCompletionLength="";
                }

                //18.设计长度
                String pipelineDesignLength = llCircuitProgress.getPipelineDesignLength();
                if(pipelineDesignLength!=null&&pipelineDesignLength.equals("null")){
                    pipelineDesignLength="";
                }

                //19.完工长度
                String pipelineCompletionLength = llCircuitProgress.getPipelineCompletionLength();
                if(pipelineCompletionLength!=null&&pipelineCompletionLength.equals("null")){
                    pipelineCompletionLength="";
                }

                //20.设计长度
                String buriedDesignLength = llCircuitProgress.getBuriedDesignLength();
                if(buriedDesignLength!=null&&buriedDesignLength.equals("null")){
                    buriedDesignLength="";
                }

                //21.完工长度
                String buriedCompletionLength = llCircuitProgress.getBuriedCompletionLength();
                if(buriedCompletionLength!=null&&buriedCompletionLength.equals("null")){
                    buriedCompletionLength="";
                }

                //22.设计长度
                String pushDesignLength = llCircuitProgress.getPushDesignLength();
                if(pushDesignLength!=null&&pushDesignLength.equals("null")){
                    pushDesignLength="";
                }

                //23.完工长度
                String pushCompletionLength = llCircuitProgress.getPushCompletionLength();
                if(pushCompletionLength!=null&&pushCompletionLength.equals("null")){
                    pushCompletionLength="";
                }

                //24.光缆类型
                String cableType = llCircuitProgress.getCableType();
                if(cableType!=null&&cableType.equals("null")){
                    cableType="";
                }

                //25.设计长度
                String suspendedDesignLength = llCircuitProgress.getSuspendedDesignLength();
                if(suspendedDesignLength!=null&&suspendedDesignLength.equals("null")){
                    suspendedDesignLength="";
                }

                //26.敷设长度
                String suspendedLaidLength = llCircuitProgress.getSuspendedLaidLength();
                if(suspendedLaidLength!=null&&suspendedLaidLength.equals("null")){
                    suspendedLaidLength="";
                }

                //27.设计长度
                String messengerDesignLength = llCircuitProgress.getMessengerDesignLength();
                if(messengerDesignLength!=null&&messengerDesignLength.equals("null")){
                    messengerDesignLength="";
                }

                //28.敷设长度
                String messengerLaidLength = llCircuitProgress.getMessengerLaidLength();
                if(messengerLaidLength!=null&&messengerLaidLength.equals("null")){
                    messengerLaidLength="";
                }

                //29.设计长度
                String gystaDesignLength = llCircuitProgress.getGystaDesignLength();
                if(gystaDesignLength!=null&&gystaDesignLength.equals("null")){
                    gystaDesignLength="";
                }

                //30.敷设长度
                String gystaLaidLength = llCircuitProgress.getGystaLaidLength();
                if(gystaLaidLength!=null&&gystaLaidLength.equals("null")){
                    gystaLaidLength="";
                }

                //31.设计长度
                String lightguideDesignLength = llCircuitProgress.getLightguideDesignLength();
                if(lightguideDesignLength!=null&&lightguideDesignLength.equals("null")){
                    lightguideDesignLength="";
                }

                //32.敷设长度
                String lightguideLaidLength = llCircuitProgress.getLightguideLaidLength();
                if(lightguideLaidLength!=null&&lightguideLaidLength.equals("null")){
                    lightguideLaidLength="";
                }

                //33.设计长度
                String wallDesignLength = llCircuitProgress.getWallDesignLength();
                if(wallDesignLength!=null&&wallDesignLength.equals("null")){
                    wallDesignLength="";
                }

                //34.敷设长度
                String wallLaidLength = llCircuitProgress.getWallLaidLength();
                if(wallLaidLength!=null&&wallLaidLength.equals("null")){
                    wallLaidLength="";
                }

                //35.设计长度
                String bridgeDesignLength = llCircuitProgress.getBridgeDesignLength();
                if(bridgeDesignLength!=null&&bridgeDesignLength.equals("null")){
                    bridgeDesignLength="";
                }

                //36.敷设长度
                String bridgeLaidLength = llCircuitProgress.getBridgeLaidLength();
                if(bridgeLaidLength!=null&&bridgeLaidLength.equals("null")){
                    bridgeLaidLength="";
                }

                //37.设计长度
                String gyfxtsDesignLength = llCircuitProgress.getGyfxtsDesignLength();
                if(gyfxtsDesignLength!=null&&gyfxtsDesignLength.equals("null")){
                    gyfxtsDesignLength="";
                }
                //38.敷设长度
                String gyfxtsLaidLength = llCircuitProgress.getGyfxtsLaidLength();
                if(gyfxtsLaidLength!=null&&gyfxtsLaidLength.equals("null")){
                    gyfxtsLaidLength="";
                }

                //39.设计数量
                String newOnuDesignStart = llCircuitProgress.getNewOnuDesignStart();
                if(newOnuDesignStart!=null&&newOnuDesignStart.equals("null")){
                    newOnuDesignStart="";
                }
                //40.规格
                String newModelOnuSize = llCircuitProgress.getNewModelOnuSize();
                if(newModelOnuSize!=null&&newModelOnuSize.equals("null")){
                    newModelOnuSize="";
                }
                //41.安装数量
                String newOnuInstallationNumber = llCircuitProgress.getNewOnuInstallationNumber();
                if(newOnuInstallationNumber!=null&&newOnuInstallationNumber.equals("null")){
                    newOnuInstallationNumber="";
                }
                //42.设计数量
                String wornOnuDesignStart = llCircuitProgress.getWornOnuDesignStart();
                if(wornOnuDesignStart!=null&&wornOnuDesignStart.equals("null")){
                    wornOnuDesignStart="";
                }
                //43.规格
                String wornModelOnuSize = llCircuitProgress.getWornModelOnuSize();
                if(wornModelOnuSize!=null&&wornModelOnuSize.equals("null")){
                    wornModelOnuSize="";
                }
                //44.安装数量
                String wornOnuInstallationNumber = llCircuitProgress.getWornOnuInstallationNumber();
                if(wornOnuInstallationNumber!=null&&wornOnuInstallationNumber.equals("null")){
                    wornOnuInstallationNumber="";
                }
                //45.设计数量
                String newWallDesignStart = llCircuitProgress.getNewWallDesignStart();
                if(newWallDesignStart!=null&&newWallDesignStart.equals("null")){
                    newWallDesignStart="";
                }
                //46.规格
                String newWallOnuSize = llCircuitProgress.getNewWallOnuSize();
                if(newWallOnuSize!=null&&newWallOnuSize.equals("null")){
                    newWallOnuSize="";
                }
                //47.安装数量
                String newWallInstallationNumber = llCircuitProgress.getNewWallInstallationNumber();
                if(newWallInstallationNumber!=null&&newWallInstallationNumber.equals("null")){
                    newWallInstallationNumber="";
                }
                //48.设计数量
                String wornWallDesignStart = llCircuitProgress.getWornWallDesignStart();
                if(wornWallDesignStart!=null&&wornWallDesignStart.equals("null")){
                    wornWallDesignStart="";
                }
                // 49.规格
                String wornWallOnuSize = llCircuitProgress.getWornWallOnuSize();
                if(wornWallOnuSize!=null&&wornWallOnuSize.equals("null")){
                    wornWallOnuSize="";
                }
                //50.安装数量
                String wornWallInstallationNumber = llCircuitProgress.getWornWallInstallationNumber();
                if(wornWallInstallationNumber!=null&&wornWallInstallationNumber.equals("null")){
                    wornWallInstallationNumber="";
                }



                row = sheet.createRow(i + 3);
                row.createCell(0).setCellValue(operator);
                row.createCell(1).setCellValue(buildingProject);
                row.createCell(2).setCellValue(buildYear);
                row.createCell(3).setCellValue(hopName);
                row.createCell(4).setCellValue(province);
                row.createCell(5).setCellValue(city);
                row.createCell(6).setCellValue(county);
                row.createCell(7).setCellValue(area);
                row.createCell(8).setCellValue(companyName);
                row.createCell(9).setCellValue(designPersonnel);
                row.createCell(10).setCellValue(siteLeader);
                row.createCell(11).setCellValue(professionResponsiblePerson);
                row.createCell(12).setCellValue(districtHead);
                row.createCell(13).setCellValue(corporateName);
                row.createCell(14).setCellValue(personInCharge);
                row.createCell(15).setCellValue(poleDesignLength);
                row.createCell(16).setCellValue(poleCompletionLength);
                row.createCell(17).setCellValue(pipelineDesignLength);
                row.createCell(18).setCellValue(pipelineCompletionLength);
                row.createCell(19).setCellValue(buriedDesignLength);
                row.createCell(20).setCellValue(buriedCompletionLength);
                row.createCell(21).setCellValue(pushDesignLength);
                row.createCell(22).setCellValue(pushCompletionLength);
                row.createCell(23).setCellValue(cableType);
                row.createCell(24).setCellValue(suspendedDesignLength);
                row.createCell(25).setCellValue(suspendedLaidLength);
                row.createCell(26).setCellValue(messengerDesignLength);
                row.createCell(27).setCellValue(messengerLaidLength);
                row.createCell(28).setCellValue(gystaDesignLength);
                row.createCell(29).setCellValue(gystaLaidLength);
                row.createCell(30).setCellValue(lightguideDesignLength);
                row.createCell(31).setCellValue(lightguideLaidLength);
                row.createCell(32).setCellValue(wallDesignLength);
                row.createCell(33).setCellValue(wallLaidLength);
                row.createCell(34).setCellValue(bridgeDesignLength);
                row.createCell(35).setCellValue(bridgeLaidLength);
                row.createCell(36).setCellValue(gyfxtsDesignLength);
                row.createCell(37).setCellValue(gyfxtsLaidLength);
                row.createCell(38).setCellValue(newOnuDesignStart);
                row.createCell(39).setCellValue(newModelOnuSize);
                row.createCell(40).setCellValue(newOnuInstallationNumber);
                row.createCell(41).setCellValue(wornOnuDesignStart);
                row.createCell(42).setCellValue(wornModelOnuSize);
                row.createCell(43).setCellValue(wornOnuInstallationNumber);
                row.createCell(44).setCellValue(newWallDesignStart);
                row.createCell(45).setCellValue(newWallOnuSize);
                row.createCell(46).setCellValue(newWallInstallationNumber);
                row.createCell(47).setCellValue(wornWallDesignStart);
                row.createCell(48).setCellValue(wornWallOnuSize);
                row.createCell(49).setCellValue(wornWallInstallationNumber);




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
