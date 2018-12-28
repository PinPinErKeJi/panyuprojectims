package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.ProjectProgressDegree;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProjectProgressDegreeExcel {

	public static Map getListmap(){
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
		map.put(21,"基础施工进度");
		map.put(22,"基础养护开始日期");
		map.put(23,"天支类型");
		map.put(24,"天支供货厂家");
		map.put(25,"天支供货厂家联系人");
		map.put(26,"天支施工单位");
		map.put(27,"天支施工单位联系人");
		map.put(28,"天支高度（m）");
		map.put(29,"天支施工进度");
		map.put(30,"天支完工日期");

		map.put(31,"建设方式");
		map.put(32,"机房类型");
		map.put(33,"土建单位");
		map.put(34,"土建单位联系人");
		map.put(35,"机房施工进度");
		map.put(36,"机房完工日期");
		map.put(37,"装修单位");
		map.put(38,"装修单位联系人");
		map.put(39,"机房装修进度");
		map.put(40,"装修完工日期");

		map.put(41,"建设方式");
		map.put(42,"外电类型");
		map.put(43,"施工单位");
		map.put(44,"施工单位联系人");
		map.put(45,"施工进度");
		map.put(46,"完工日期");

		map.put(47,"建设方式");
		map.put(48,"主设备类型");
		map.put(49,"供货厂家");
		map.put(50,"供货厂家联系人");
		map.put(51,"施工单位");
		map.put(52,"施工单位联系人");
        map.put(53,"施工进度");
        map.put(54,"完工日期");

		map.put(55,"建设方式");
		map.put(56,"空调品牌");
		map.put(57,"规格型号");
		map.put(58,"施工单位");
		map.put(59,"施工单位联系人");
        map.put(60,"施工进度");
        map.put(61,"完工日期");

		map.put(62,"建设方式");
		map.put(63,"手提式灭火器数量（个）");
		map.put(64,"喷淋式灭火器数量（个）");
		map.put(65,"供货厂家");
		map.put(66,"供货厂家联系人");
		map.put(67,"安装单位");
		map.put(68,"安装单位联系人");
        map.put(69,"施工进度");
        map.put(70,"完工日期");

		map.put(71,"建设方式");
		map.put(72,"供货厂家");
		map.put(73,"供货厂家联系人");
		map.put(74,"施工单位");
		map.put(75,"施工单位联系人");
		map.put(76,"施工进度");
		map.put(77,"完工日期");

		map.put(78,"备注");
		return map;
	}

	static String[] excelSecond= {
			"运营商","建设年份","建设项目名称",
			"基站名称","基站名称",
			"规划经度","实际经度","规划纬度","实际纬度","省", "市","县（区）","区域","现场监理","专业负责人","区域负责人","覆盖场景",
			"天支","天支","天支","天支","天支","天支","天支","天支","天支","天支","天支","天支","天支","天支",
			"机房","机房","机房","机房","机房","机房","机房","机房","机房","机房",
			"外电引入","外电引入","外电引入","外电引入","外电引入","外电引入",
			"主设备","主设备","主设备","主设备","主设备","主设备","主设备","主设备",
			"空调","空调","空调","空调","空调","空调","空调",
			"消防设施","消防设施","消防设施","消防设施","消防设施","消防设施","消防设施","消防设施","消防设施",
			"动力环境监控","动力环境监控","动力环境监控","动力环境监控","动力环境监控","动力环境监控","动力环境监控",
			"备注"};

	public static void createExcelOfProjectDegree(List<ProjectProgressDegree> projectProgressDegreeList,
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

		sheet.addMergedRegion(new CellRangeAddress(0,0,17,30));
		sheet.addMergedRegion(new CellRangeAddress(0,0,31,40));
		sheet.addMergedRegion(new CellRangeAddress(0,0,41,46));
		sheet.addMergedRegion(new CellRangeAddress(0,0,47,54));
		sheet.addMergedRegion(new CellRangeAddress(0,0,55,61));
		sheet.addMergedRegion(new CellRangeAddress(0,0,62,70));
		sheet.addMergedRegion(new CellRangeAddress(0,0,71,77));

        sheet.addMergedRegion(new CellRangeAddress(0,1,78,78));
		row = sheet.createRow(1);
		for (int j = 3;j<5;j++){
			cell = row.createCell((short)j);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("基站名称" +(j-1));
			sheet.autoSizeColumn(j);
		}
		for (int a = 16;a<30;a++){
			cell = row.createCell((short)a);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("天支" +(a-1));
			sheet.autoSizeColumn(a);
		}
		for (int b = 30;b<40;b++){
			cell = row.createCell((short)b);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("机房" +(b-1));
			sheet.autoSizeColumn(b);
		}
		for (int c = 40;c<46;c++){
			cell = row.createCell((short)c);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("外电引入" +(c-1));
			sheet.autoSizeColumn(c);
		}
		for (int d = 46;d<54;d++){
			cell = row.createCell((short)d);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("主设备" +(d-1));
		}
		for (int e = 54;e<61;e++){
			cell = row.createCell((short)e);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("空调" +(e-1));
			sheet.autoSizeColumn(e);
		}
		for (int f = 61;f<70;f++){
			cell = row.createCell((short)f);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("消防设施" +(f-1));
			sheet.autoSizeColumn(f);
		}
		for (int g = 70;g<77;g++){
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
        sheet.setColumnWidth(60,20*256);
        sheet.setColumnWidth(61,20*256);
        sheet.setColumnWidth(62,20*256);
        sheet.setColumnWidth(63,20*256);
        sheet.setColumnWidth(64,20*256);
        sheet.setColumnWidth(65,20*256);
        sheet.setColumnWidth(66,20*256);
        sheet.setColumnWidth(67,20*256);
        sheet.setColumnWidth(68,20*256);
        sheet.setColumnWidth(69,20*256);
        sheet.setColumnWidth(70,20*256);
        sheet.setColumnWidth(71,20*256);
        sheet.setColumnWidth(72,20*256);
        sheet.setColumnWidth(73,20*256);
        sheet.setColumnWidth(74,20*256);
        sheet.setColumnWidth(75,20*256);
        sheet.setColumnWidth(76,20*256);
        sheet.setColumnWidth(77,20*256);
        sheet.setColumnWidth(78,20*256);

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
        row.createCell(60).setCellValue((String)map.get(60));
        row.createCell(61).setCellValue((String)map.get(61));
        row.createCell(62).setCellValue((String)map.get(62));
        row.createCell(63).setCellValue((String)map.get(63));
        row.createCell(64).setCellValue((String)map.get(64));
        row.createCell(65).setCellValue((String)map.get(65));
        row.createCell(66).setCellValue((String)map.get(66));
        row.createCell(67).setCellValue((String)map.get(67));
        row.createCell(68).setCellValue((String)map.get(68));
        row.createCell(69).setCellValue((String)map.get(69));
        row.createCell(70).setCellValue((String)map.get(70));
        row.createCell(71).setCellValue((String)map.get(71));
        row.createCell(72).setCellValue((String)map.get(72));
        row.createCell(73).setCellValue((String)map.get(73));
        row.createCell(74).setCellValue((String)map.get(74));
        row.createCell(75).setCellValue((String)map.get(75));
        row.createCell(76).setCellValue((String)map.get(76));
        row.createCell(77).setCellValue((String)map.get(77));
        row.createCell(78).setCellValue((String)map.get(78));

		ProjectProgressDegree projectProgressDegree = new ProjectProgressDegree();

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (projectProgressDegreeList != null) {
			// 8 从集合的最高下标 递减 添加数据
			for (int i = projectProgressDegreeList.size() - 1; i >= 0; i--) {
                projectProgressDegree = projectProgressDegreeList.get(i);
                //运营商
				String operator = projectProgressDegree.getOperator();
				if (operator != null && operator.equals("null")) {
                    operator = "";
				}
				//建设年份
                String buildYear = projectProgressDegree.getBuildYear();
                if (buildYear != null && buildYear.equals("null")) {
                    buildYear = "";
				}
                //建设项目名称
                String buildingProject = projectProgressDegree.getBuildingProject();
                if (buildingProject != null && buildingProject.equals("null")) {
                    buildingProject = "";
				}
                //规划名称
                String planningName = projectProgressDegree.getPlanningName();
                if (planningName != null && planningName.equals("null")) {
                    planningName = "";
				}
                //实际名称
                String actualName = projectProgressDegree.getActualName();
                if(actualName!=null && actualName.equals("null")){
                    actualName="";
				}
                //规划经度
                String planningLongitude = projectProgressDegree.getPlanningLongitude();
                if(planningLongitude!=null && planningLongitude.equals("null")){
                    planningLongitude="";
				}
                //实际经度
                String actualLongitude = projectProgressDegree.getActualLongitude();
                if(actualLongitude!=null&&actualLongitude.equals("null")){
                    actualLongitude="";
                }
                //实际纬度
                String actualLatitudes = projectProgressDegree.getActualLatitudes();
                if(actualLatitudes!=null&&actualLatitudes.equals("null")){
                    actualLatitudes="";
                }
				//规划纬度
                String planningLatitude = projectProgressDegree.getPlanningLatitude();
                if(planningLatitude!=null&&planningLatitude.equals("null")){
                    planningLatitude="";
				}
                //省
                String province = projectProgressDegree.getProvince();
                if(province!=null&&province.equals("null")){
                    province="";
                }
                //市
                String city = projectProgressDegree.getCity();
                if(city!=null&&city.equals("null")){
                    city="";
                }
                //县（区）
                String county = projectProgressDegree.getCounty();
                if(county!=null&&county.equals("null")){
                    county="";
                }
                //区域
                String regions = projectProgressDegree.getRegions();
                if(regions!=null&&regions.equals("null")){
                    regions="";
                }
                //现场监理
                String onSiteSupervision = projectProgressDegree.getOnSiteSupervision();
                if(onSiteSupervision!=null&&onSiteSupervision.equals("null")){
                    onSiteSupervision="";
                }
                //专业负责人
                String professionPeople = projectProgressDegree.getProfessionPeople();
                if(professionPeople!=null&&professionPeople.equals("null")){
                    professionPeople="";
                }
                //区域负责人
                String districtHead = projectProgressDegree.getDistrictHead();
                if(districtHead!=null&&districtHead.equals("null")){
                    districtHead="";
                }
                //覆盖场景
                String overlayScene = projectProgressDegree.getOverlayScene();
                if(overlayScene!=null&&overlayScene.equals("null")){
                    overlayScene="";
                }
                //天支建设方式
                String constructionMode = projectProgressDegree.getConstructionMode();
                if(constructionMode!=null&&constructionMode.equals("null")){
                    constructionMode="";
                }
                //天支基础类型
                String basicType = projectProgressDegree.getBasicType();
                if(basicType!=null&&basicType.equals("null")){
                    basicType="";
                }
                //天支基础施工单位
                String foundationConstructionName = projectProgressDegree.getFoundationConstructionName();
                if(foundationConstructionName!=null&&foundationConstructionName.equals("null")){
                    foundationConstructionName="";
                }
                //天支基础施工单位联系人
                String basicUnitContacts = projectProgressDegree.getBasicUnitContacts();
                if(basicUnitContacts!=null&&basicUnitContacts.equals("null")){
                    basicUnitContacts="";
                }
                //基础施工进度
                String foundationProgressName = projectProgressDegree.getFoundationProgressName();
                if (foundationProgressName!=null&&foundationProgressName.equals("null")){
                    foundationProgressName="";
                }
                //基础养护开始日期
                String curingStartDate = projectProgressDegree.getCuringStartDate();
                if (curingStartDate!=null&&curingStartDate.equals("null")){
                    curingStartDate="";
                }
                //天支类型
                String skyBranchTypeName = projectProgressDegree.getSkyBranchTypeName();
                if(skyBranchTypeName!=null&&skyBranchTypeName.equals("null")){
                    skyBranchTypeName="";
                }
                //天支供货厂家
                String skyBranchSupplierName = projectProgressDegree.getSkyBranchSupplierName();
                if(skyBranchSupplierName!=null&&skyBranchSupplierName.equals("null")){
                    skyBranchSupplierName="";
                }
                //天支供货厂家联系人
                String skyBranchSupplierContacts = projectProgressDegree.getSkyBranchSupplierContacts();
                if(skyBranchSupplierContacts!=null&&skyBranchSupplierContacts.equals("null")){
                    skyBranchSupplierContacts="";
                }
                //天支施工单位
                String skyBranchUnitName = projectProgressDegree.getSkyBranchUnitName();
                if(skyBranchUnitName!=null&&skyBranchUnitName.equals("null")){
                    skyBranchUnitName="";
                }
                //天支施工单位联系人
                String skyConstructionUnitContacts = projectProgressDegree.getSkyConstructionUnitContacts();
                if(skyConstructionUnitContacts!=null&&skyConstructionUnitContacts.equals("null")){
                    skyConstructionUnitContacts="";
                }
                //天支高度
                String skyBranchHeight = projectProgressDegree.getSkyBranchHeight();
                if(skyBranchHeight!=null&&skyBranchHeight.equals("null")){
                    skyBranchHeight="";
                }
                //天支施工进度
                String skyBranchProgressName = projectProgressDegree.getSkyBranchProgressName();
                if(skyBranchProgressName!=null&&skyBranchProgressName.equals("null")){
                    skyBranchProgressName="";
                }
                //天支完工日期
                String skyBranchCompletionDate = projectProgressDegree.getSkyBranchCompletionDate();
                if(skyBranchCompletionDate!=null&&skyBranchCompletionDate.equals("null")){
                    skyBranchCompletionDate="";
                }
                //机房建设方式
                String machineRoomConstructionMode = projectProgressDegree.getMachineRoomConstructionMode();
                if(machineRoomConstructionMode!=null&&machineRoomConstructionMode.equals("null")){
                    machineRoomConstructionMode="";
                }
                //机房类型
                String machineRoomTypeName = projectProgressDegree.getMachineRoomTypeName();
                if(machineRoomTypeName!=null&&machineRoomTypeName.equals("null")){
                    machineRoomTypeName="";
                }
                //机房土建单位
                String machineRoomConstructionName = projectProgressDegree.getMachineRoomConstructionName();
                if(machineRoomConstructionName!=null&&machineRoomConstructionName.equals("null")){
                    machineRoomConstructionName="";
                }
                //机房土建单位联系人
                String civilEngineeringContacts = projectProgressDegree.getCivilEngineeringContacts();
                if(civilEngineeringContacts!=null&&civilEngineeringContacts.equals("null")){
                    civilEngineeringContacts="";
                }
                //机房施工进度
                String machineRoomSchedule = projectProgressDegree.getMachineRoomSchedule();
                if(machineRoomSchedule!=null&&machineRoomSchedule.equals("null")){
                    machineRoomSchedule="";
                }
                //机房完工日期
                String machineRoomEndTime = projectProgressDegree.getMachineRoomEndTime();
                if(machineRoomEndTime!=null&&machineRoomEndTime.equals("null")){
                    machineRoomEndTime="";
                }
                //机房装修单位
                String machineRoomDecorateName = projectProgressDegree.getMachineRoomDecorateName();
                if(machineRoomDecorateName!=null&&machineRoomDecorateName.equals("null")){
                    machineRoomDecorateName="";
                }
                //机房装修单位联系人
                String decorationUnitContacts = projectProgressDegree.getDecorationUnitContacts();
                if(decorationUnitContacts!=null&&decorationUnitContacts.equals("null")){
                    decorationUnitContacts="";
                }
                //机房装修进度
                String machineRoomAdorn = projectProgressDegree.getMachineRoomAdorn();
                if(machineRoomAdorn!=null&&machineRoomAdorn.equals("null")){
                    machineRoomAdorn="";
                }
                //装修完工日期
                String machineRoomDecorateEndTime = projectProgressDegree.getMachineRoomDecorateEndTime();
                if(machineRoomDecorateEndTime!=null&&machineRoomDecorateEndTime.equals("null")){
                    machineRoomDecorateEndTime="";
                }
                //外电引入建设方式
                String electricConstructionMode = projectProgressDegree.getElectricConstructionMode();
                if(electricConstructionMode!=null&&electricConstructionMode.equals("null")){
                    electricConstructionMode="";
                }
                //外电类型
                String electricType = projectProgressDegree.getElectricType();
                if(electricType!=null&&electricType.equals("null")){
                    electricType="";
                }
                //外电施工单位
                String electricUnitName = projectProgressDegree.getElectricUnitName();
                if(electricUnitName!=null&&electricUnitName.equals("null")){
                    electricUnitName="";
                }
                //外电施工单位联系人
                String electricUnitContacts = projectProgressDegree.getElectricUnitContacts();
                if(electricUnitContacts!=null&&electricUnitContacts.equals("null")){
                    electricUnitContacts="";
                }
                //外电施工进度
                String electricProgress = projectProgressDegree.getElectricProgress();
                if(electricProgress!=null&&electricProgress.equals("null")){
                    electricProgress="";
                }
                //外电完工日期
                String electricCompletionDate = projectProgressDegree.getElectricCompletionDate();
                if(electricCompletionDate!=null&&electricCompletionDate.equals("null")){
                    electricCompletionDate="";
                }
                //主设备建设方式
                String equipmentConstructionMode = projectProgressDegree.getEquipmentConstructionMode();
                if(equipmentConstructionMode!=null&&equipmentConstructionMode.equals("null")){
                    equipmentConstructionMode="";
                }
                //主设备类型
                String equipmentTypeName = projectProgressDegree.getEquipmentTypeName();
                if(equipmentTypeName!=null&&equipmentTypeName.equals("null")){
                    equipmentTypeName="";
                }
                //主设备供货厂家
                String equipmentSupplierName = projectProgressDegree.getEquipmentSupplierName();
                if(equipmentSupplierName!=null&&equipmentSupplierName.equals("null")){
                    equipmentSupplierName="";
                }
                //主设备供货厂家联系人
                String equipmentSupplierContacts = projectProgressDegree.getEquipmentSupplierContacts();
                if(equipmentSupplierContacts!=null&&equipmentSupplierContacts.equals("null")){
                    equipmentSupplierContacts="";
                }
                //主设备施工单位
                String equipmentUnitName = projectProgressDegree.getEquipmentUnitName();
                if(equipmentUnitName!=null&&equipmentUnitName.equals("null")){
                    equipmentUnitName="";
                }
                //主设备施工单位联系人
                String equipmentUnitContacts = projectProgressDegree.getEquipmentUnitContacts();
                if(equipmentUnitContacts!=null&&equipmentUnitContacts.equals("null")){
                    equipmentUnitContacts="";
                }
                //主设备施工进度
                String equipmentProgress = projectProgressDegree.getEquipmentProgress();
                if(equipmentProgress!=null&&equipmentProgress.equals("null")){
                    equipmentProgress="";
                }
                //主设备完工日期
                String equipmentCompletionDate = projectProgressDegree.getEquipmentCompletionDate();
                if(equipmentCompletionDate!=null&&equipmentCompletionDate.equals("null")){
                    equipmentCompletionDate="";
                }
                //空调建设方式
                String airConstructionMode = projectProgressDegree.getAirConstructionMode();
                if(airConstructionMode!=null&&airConstructionMode.equals("null")){
                    airConstructionMode="";
                }
                //空调品牌
                String conditioningBrandName = projectProgressDegree.getConditioningBrandName();
                if(conditioningBrandName!=null&&conditioningBrandName.equals("null")){
                    conditioningBrandName="";
                }
                //空调规格类型
                String specificationTypeName = projectProgressDegree.getSpecificationTypeName();
                if(specificationTypeName!=null&&specificationTypeName.equals("null")){
                    specificationTypeName="";
                }
                //空调施工单位
                String airUnitName = projectProgressDegree.getAirUnitName();
                if(airUnitName!=null&&airUnitName.equals("null")){
                    airUnitName="";
                }
                //空调施工单位联系人
                String airConstructionContacts = projectProgressDegree.getAirConstructionContacts();
                if(airConstructionContacts!=null&&airConstructionContacts.equals("null")){
                    airConstructionContacts="";
                }
                //空调施工进度
                String airProgress = projectProgressDegree.getAirProgress();
                if(airProgress!=null&&airProgress.equals("null")){
                    airProgress="";
                }
                //空调完工日期
                String airCompletionDate = projectProgressDegree.getAirCompletionDate();
                if(airCompletionDate!=null&&airCompletionDate.equals("null")){
                    airCompletionDate="";
                }
                //消防设施建设方式
                String fireConstructionMode = projectProgressDegree.getFireConstructionMode();
                if(fireConstructionMode!=null&&fireConstructionMode.equals("null")){
                    fireConstructionMode="";
                }
                //消防设施手提式数量
                String handHeldNumber = projectProgressDegree.getHandHeldNumber();
                if(handHeldNumber!=null&&handHeldNumber.equals("null")){
                    handHeldNumber="";
                }
                //消防设施喷淋式数量
                String sprayingMethodNumber = projectProgressDegree.getSprayingMethodNumber();
                if(sprayingMethodNumber!=null&&sprayingMethodNumber.equals("null")){
                    sprayingMethodNumber="";
                }
                //消防设施供货厂家
                String fireSupplierName = projectProgressDegree.getFireSupplierName();
                if(fireSupplierName!=null&&fireSupplierName.equals("null")){
                    fireSupplierName="";
                }
                //消防设施供货厂家联系人
                String fireSupplierContacts = projectProgressDegree.getFireSupplierContacts();
                if(fireSupplierContacts!=null&&fireSupplierContacts.equals("null")){
                    fireSupplierContacts="";
                }
                //消防设施安装单位
                String installationUnitName = projectProgressDegree.getInstallationUnitName();
                if(installationUnitName!=null&&installationUnitName.equals("null")){
                    installationUnitName="";
                }
                //消防设施安装单位联系人
                String installationUnitContacts = projectProgressDegree.getInstallationUnitContacts();
                if(installationUnitContacts!=null&&installationUnitContacts.equals("null")){
                    installationUnitContacts="";
                }
                //消防施工进度
                String fireProgress = projectProgressDegree.getFireProgress();
                if(fireProgress!=null&&fireProgress.equals("null")){
                    fireProgress="";
                }
                //消防完工日期
                String fireCompletionDate = projectProgressDegree.getFireCompletionDate();
                if(fireCompletionDate!=null&&fireCompletionDate.equals("null")){
                    fireCompletionDate="";
                }
                //动力监控建设方式
                String powerConstructionMode = projectProgressDegree.getPowerConstructionMode();
                if(powerConstructionMode!=null&&powerConstructionMode.equals("null")){
                    powerConstructionMode="";
                }
                //动力监控供货厂家
                String powerSupplierName = projectProgressDegree.getPowerSupplierName();
                if(powerSupplierName!=null&&powerSupplierName.equals("null")){
                    powerSupplierName="";
                }
                //动力监控供货厂家联系人
                String powerSupplierContacts = projectProgressDegree.getPowerSupplierContacts();
                if(powerSupplierContacts!=null&&powerSupplierContacts.equals("null")){
                    powerSupplierContacts="";
                }
                //动力监控施工单位
                String powerUnitName = projectProgressDegree.getPowerUnitName();
                if(powerUnitName!=null&&powerUnitName.equals("null")){
                    powerUnitName="";
                }
                //动力监控施工单位联系人
                String powerUnitContacts = projectProgressDegree.getPowerUnitContacts();
                if(powerUnitContacts!=null&&powerUnitContacts.equals("null")){
                    powerUnitContacts="";
                }
                //动力施工进度
                String powerProgress = projectProgressDegree.getPowerProgress();
                if(powerProgress!=null&&powerProgress.equals("null")){
                    powerProgress="";
                }
                //动力完工日期
                String powerCompletionDate = projectProgressDegree.getPowerCompletionDate();
                if(powerCompletionDate!=null&&powerCompletionDate.equals("null")){
                    powerCompletionDate="";
                }
                //备注
                String remake = projectProgressDegree.getRemake();
                if(remake!=null&&remake.equals("null")){
                    remake="";
                }

                row = sheet.createRow(i + 2);
                row.createCell(0).setCellValue(operator);
                row.createCell(1).setCellValue(buildYear);
                row.createCell(2).setCellValue(buildingProject);
                row.createCell(3).setCellValue(planningName);
                row.createCell(4).setCellValue(actualName);
                row.createCell(5).setCellValue(planningLongitude);
                row.createCell(6).setCellValue(actualLongitude);
                row.createCell(7).setCellValue(planningLatitude);
                row.createCell(8).setCellValue(actualLatitudes);
                row.createCell(9).setCellValue(province);
                row.createCell(10).setCellValue(city);
                row.createCell(11).setCellValue(county);
                row.createCell(12).setCellValue(regions);
                row.createCell(13).setCellValue(onSiteSupervision);
                row.createCell(14).setCellValue(professionPeople);
                row.createCell(15).setCellValue(districtHead);
                row.createCell(16).setCellValue(overlayScene);
                row.createCell(17).setCellValue(constructionMode);
                row.createCell(18).setCellValue(basicType);
                row.createCell(19).setCellValue(foundationConstructionName);
                row.createCell(20).setCellValue(basicUnitContacts);
                row.createCell(21).setCellValue(foundationProgressName);
                row.createCell(22).setCellValue(curingStartDate);
                row.createCell(23).setCellValue(skyBranchTypeName);
                row.createCell(24).setCellValue(skyBranchSupplierName);
                row.createCell(25).setCellValue(skyBranchSupplierContacts);
                row.createCell(26).setCellValue(skyBranchUnitName);
                row.createCell(27).setCellValue(skyConstructionUnitContacts);
                row.createCell(28).setCellValue(skyBranchHeight);
                row.createCell(29).setCellValue(skyBranchProgressName);
                row.createCell(30).setCellValue(skyBranchCompletionDate);
                row.createCell(31).setCellValue(machineRoomConstructionMode);
                row.createCell(32).setCellValue(machineRoomTypeName);
                row.createCell(33).setCellValue(machineRoomConstructionName);
                row.createCell(34).setCellValue(civilEngineeringContacts);
                row.createCell(35).setCellValue(machineRoomSchedule);
                row.createCell(36).setCellValue(machineRoomEndTime);
                row.createCell(37).setCellValue(machineRoomDecorateName);
                row.createCell(38).setCellValue(decorationUnitContacts);
                row.createCell(39).setCellValue(machineRoomAdorn);
                row.createCell(40).setCellValue(machineRoomDecorateEndTime);
                row.createCell(41).setCellValue(electricConstructionMode);
                row.createCell(42).setCellValue(electricType);
                row.createCell(43).setCellValue(electricUnitName);
                row.createCell(44).setCellValue(electricUnitContacts);
                row.createCell(45).setCellValue(electricProgress);
                row.createCell(46).setCellValue(electricCompletionDate);
                row.createCell(47).setCellValue(equipmentConstructionMode);
                row.createCell(48).setCellValue(equipmentTypeName);
                row.createCell(49).setCellValue(equipmentSupplierName);
                row.createCell(50).setCellValue(equipmentSupplierContacts);
                row.createCell(51).setCellValue(equipmentUnitName);
                row.createCell(52).setCellValue(equipmentUnitContacts);
                row.createCell(53).setCellValue(equipmentProgress);
                row.createCell(54).setCellValue(equipmentCompletionDate);
                row.createCell(55).setCellValue(airConstructionMode);
                row.createCell(56).setCellValue(conditioningBrandName);
                row.createCell(57).setCellValue(specificationTypeName);
                row.createCell(58).setCellValue(airUnitName);
                row.createCell(59).setCellValue(airConstructionContacts);
                row.createCell(60).setCellValue(airProgress);
                row.createCell(61).setCellValue(airCompletionDate);
                row.createCell(62).setCellValue(fireConstructionMode);
                row.createCell(63).setCellValue(handHeldNumber);
                row.createCell(64).setCellValue(sprayingMethodNumber);
                row.createCell(65).setCellValue(fireSupplierName);
                row.createCell(66).setCellValue(fireSupplierContacts);
                row.createCell(67).setCellValue(installationUnitName);
                row.createCell(68).setCellValue(installationUnitContacts);
                row.createCell(69).setCellValue(fireProgress);
                row.createCell(70).setCellValue(fireCompletionDate);
                row.createCell(71).setCellValue(powerConstructionMode);
                row.createCell(72).setCellValue(powerSupplierName);
                row.createCell(73).setCellValue(powerSupplierContacts);
                row.createCell(74).setCellValue(powerUnitName);
                row.createCell(75).setCellValue(powerUnitContacts);
                row.createCell(76).setCellValue(powerProgress);
                row.createCell(77).setCellValue(powerCompletionDate);
                row.createCell(78).setCellValue(remake);
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
