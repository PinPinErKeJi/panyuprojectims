package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.ProjectProgress;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProjectProgressExcel {

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

	public static void createExcelOfProjects(List<ProjectProgress> projectProgressList,
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

		ProjectProgress projectProgress = new ProjectProgress();

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (projectProgressList != null) {
			// 8 从集合的最高下标 递减 添加数据
			for (int i = projectProgressList.size() - 1; i >= 0; i--) {
				projectProgress = projectProgressList.get(i);
				//运营商
				String operator = projectProgress.getOperator();
				if (operator != null && operator.equals("null")) {
                    operator = "";
				}
				//建设年份
                String buildYear = projectProgress.getBuildYear();
                if (buildYear != null && buildYear.equals("null")) {
                    buildYear = "";
				}
                //建设项目名称
                String buildingProject = projectProgress.getBuildingProject();
                if (buildingProject != null && buildingProject.equals("null")) {
                    buildingProject = "";
				}
                //规划名称
                String planningName = projectProgress.getPlanningName();
                if (planningName != null && planningName.equals("null")) {
                    planningName = "";
				}
                //实际名称
                String actualName = projectProgress.getActualName();
                if(actualName!=null && actualName.equals("null")){
                    actualName="";
				}
                //规划经度
                String planningLongitude = projectProgress.getPlanningLongitude();
                if(planningLongitude!=null && planningLongitude.equals("null")){
                    planningLongitude="";
				}
                //实际经度
                String actualLongitude = projectProgress.getActualLongitude();
                if(actualLongitude!=null&&actualLongitude.equals("null")){
                    actualLongitude="";
                }
                //实际纬度
                String actualLatitudes = projectProgress.getActualLatitudes();
                if(actualLatitudes!=null&&actualLatitudes.equals("null")){
                    actualLatitudes="";
                }
				//规划纬度
                String planningLatitude = projectProgress.getPlanningLatitude();
                if(planningLatitude!=null&&planningLatitude.equals("null")){
                    planningLatitude="";
				}
                //省
                String province = projectProgress.getProvince();
                if(province!=null&&province.equals("null")){
                    province="";
                }
                //市
                String city = projectProgress.getCity();
                if(city!=null&&city.equals("null")){
                    city="";
                }
                //县（区）
                String county = projectProgress.getCounty();
                if(county!=null&&county.equals("null")){
                    county="";
                }
                //区域
                String regions = projectProgress.getRegions();
                if(regions!=null&&regions.equals("null")){
                    regions="";
                }
                //现场监理
                String onSiteSupervision = projectProgress.getOnSiteSupervision();
                if(onSiteSupervision!=null&&onSiteSupervision.equals("null")){
                    onSiteSupervision="";
                }
                //专业负责人
                String professionPeople = projectProgress.getProfessionPeople();
                if(professionPeople!=null&&professionPeople.equals("null")){
                    professionPeople="";
                }
                //区域负责人
                String districtHead = projectProgress.getDistrictHead();
                if(districtHead!=null&&districtHead.equals("null")){
                    districtHead="";
                }
                //覆盖场景
                String overlayScene = projectProgress.getOverlayScene();
                if(overlayScene!=null&&overlayScene.equals("null")){
                    overlayScene="";
                }
                //天支建设方式
                String constructionMode = projectProgress.getConstructionMode();
                if(constructionMode!=null&&constructionMode.equals("null")){
                    constructionMode="";
                }
                //天支基础类型
                String basicType = projectProgress.getBasicType();
                if(basicType!=null&&basicType.equals("null")){
                    basicType="";
                }
                //天支基础施工单位
                String foundationConstructionName = projectProgress.getFoundationConstructionName();
                if(foundationConstructionName!=null&&foundationConstructionName.equals("null")){
                    foundationConstructionName="";
                }
                //天支基础施工单位联系人
                String basicUnitContacts = projectProgress.getBasicUnitContacts();
                if(basicUnitContacts!=null&&basicUnitContacts.equals("null")){
                    basicUnitContacts="";
                }
                //天支类型
                String skyBranchTypeName = projectProgress.getSkyBranchTypeName();
                if(skyBranchTypeName!=null&&skyBranchTypeName.equals("null")){
                    skyBranchTypeName="";
                }
                //天支供货厂家
                String skyBranchSupplierName = projectProgress.getSkyBranchSupplierName();
                if(skyBranchSupplierName!=null&&skyBranchSupplierName.equals("null")){
                    skyBranchSupplierName="";
                }
                //天支供货厂家联系人
                String skyBranchSupplierContacts = projectProgress.getSkyBranchSupplierContacts();
                if(skyBranchSupplierContacts!=null&&skyBranchSupplierContacts.equals("null")){
                    skyBranchSupplierContacts="";
                }
                //天支施工单位
                String skyBranchUnitName = projectProgress.getSkyBranchUnitName();
                if(skyBranchUnitName!=null&&skyBranchUnitName.equals("null")){
                    skyBranchUnitName="";
                }
                //天支施工单位联系人
                String skyConstructionUnitContacts = projectProgress.getSkyConstructionUnitContacts();
                if(skyConstructionUnitContacts!=null&&skyConstructionUnitContacts.equals("null")){
                    skyConstructionUnitContacts="";
                }
                //天支高度
                String skyBranchHeight = projectProgress.getSkyBranchHeight();
                if(skyBranchHeight!=null&&skyBranchHeight.equals("null")){
                    skyBranchHeight="";
                }
                //机房建设方式
                String machineRoomConstructionMode = projectProgress.getMachineRoomConstructionMode();
                if(machineRoomConstructionMode!=null&&machineRoomConstructionMode.equals("null")){
                    machineRoomConstructionMode="";
                }
                //机房类型
                String machineRoomTypeName = projectProgress.getMachineRoomTypeName();
                if(machineRoomTypeName!=null&&machineRoomTypeName.equals("null")){
                    machineRoomTypeName="";
                }
                //机房土建单位
                String machineRoomConstructionName = projectProgress.getMachineRoomConstructionName();
                if(machineRoomConstructionName!=null&&machineRoomConstructionName.equals("null")){
                    machineRoomConstructionName="";
                }
                //机房土建单位联系人
                String civilEngineeringContacts = projectProgress.getCivilEngineeringContacts();
                if(civilEngineeringContacts!=null&&civilEngineeringContacts.equals("null")){
                    civilEngineeringContacts="";
                }
                //机房装修单位
                String machineRoomDecorateName = projectProgress.getMachineRoomDecorateName();
                if(machineRoomDecorateName!=null&&machineRoomDecorateName.equals("null")){
                    machineRoomDecorateName="";
                }
                //机房装修单位联系人
                String decorationUnitContacts = projectProgress.getDecorationUnitContacts();
                if(decorationUnitContacts!=null&&decorationUnitContacts.equals("null")){
                    decorationUnitContacts="";
                }
                //外电引入建设方式
                String electricConstructionMode = projectProgress.getElectricConstructionMode();
                if(electricConstructionMode!=null&&electricConstructionMode.equals("null")){
                    electricConstructionMode="";
                }
                //外电类型
                String electricType = projectProgress.getElectricType();
                if(electricType!=null&&electricType.equals("null")){
                    electricType="";
                }
                //外电施工单位
                String electricUnitName = projectProgress.getElectricUnitName();
                if(electricUnitName!=null&&electricUnitName.equals("null")){
                    electricUnitName="";
                }
                //外电施工单位联系人
                String electricUnitContacts = projectProgress.getElectricUnitContacts();
                if(electricUnitContacts!=null&&electricUnitContacts.equals("null")){
                    electricUnitContacts="";
                }
                //主设备建设方式
                String equipmentConstructionMode = projectProgress.getEquipmentConstructionMode();
                if(equipmentConstructionMode!=null&&equipmentConstructionMode.equals("null")){
                    equipmentConstructionMode="";
                }
                //主设备类型
                String equipmentTypeName = projectProgress.getEquipmentTypeName();
                if(equipmentTypeName!=null&&equipmentTypeName.equals("null")){
                    equipmentTypeName="";
                }
                //主设备供货厂家
                String equipmentSupplierName = projectProgress.getEquipmentSupplierName();
                if(equipmentSupplierName!=null&&equipmentSupplierName.equals("null")){
                    equipmentSupplierName="";
                }
                //主设备供货厂家联系人
                String equipmentSupplierContacts = projectProgress.getEquipmentSupplierContacts();
                if(equipmentSupplierContacts!=null&&equipmentSupplierContacts.equals("null")){
                    equipmentSupplierContacts="";
                }
                //主设备施工单位
                String equipmentUnitName = projectProgress.getEquipmentUnitName();
                if(equipmentUnitName!=null&&equipmentUnitName.equals("null")){
                    equipmentUnitName="";
                }
                //主设备施工单位联系人
                String equipmentUnitContacts = projectProgress.getEquipmentUnitContacts();
                if(equipmentUnitContacts!=null&&equipmentUnitContacts.equals("null")){
                    equipmentUnitContacts="";
                }
                //空调建设方式
                String airConstructionMode = projectProgress.getAirConstructionMode();
                if(airConstructionMode!=null&&airConstructionMode.equals("null")){
                    airConstructionMode="";
                }
                //空调品牌
                String conditioningBrandName = projectProgress.getConditioningBrandName();
                if(conditioningBrandName!=null&&conditioningBrandName.equals("null")){
                    conditioningBrandName="";
                }
                //空调规格类型
                String specificationTypeName = projectProgress.getSpecificationTypeName();
                if(specificationTypeName!=null&&specificationTypeName.equals("null")){
                    specificationTypeName="";
                }
                //空调施工单位
                String airUnitName = projectProgress.getAirUnitName();
                if(airUnitName!=null&&airUnitName.equals("null")){
                    airUnitName="";
                }
                //空调施工单位联系人
                String airConstructionContacts = projectProgress.getAirConstructionContacts();
                if(airConstructionContacts!=null&&airConstructionContacts.equals("null")){
                    airConstructionContacts="";
                }
                //消防设施建设方式
                String fireConstructionMode = projectProgress.getFireConstructionMode();
                if(fireConstructionMode!=null&&fireConstructionMode.equals("null")){
                    fireConstructionMode="";
                }
                //消防设施手提式数量
                String handHeldNumber = projectProgress.getHandHeldNumber();
                if(handHeldNumber!=null&&handHeldNumber.equals("null")){
                    handHeldNumber="";
                }
                //消防设施喷淋式数量
                String sprayingMethodNumber = projectProgress.getSprayingMethodNumber();
                if(sprayingMethodNumber!=null&&sprayingMethodNumber.equals("null")){
                    sprayingMethodNumber="";
                }
                //消防设施供货厂家
                String fireSupplierName = projectProgress.getFireSupplierName();
                if(fireSupplierName!=null&&fireSupplierName.equals("null")){
                    fireSupplierName="";
                }
                //消防设施供货厂家联系人
                String fireSupplierContacts = projectProgress.getFireSupplierContacts();
                if(fireSupplierContacts!=null&&fireSupplierContacts.equals("null")){
                    fireSupplierContacts="";
                }
                //消防设施安装单位
                String installationUnitName = projectProgress.getInstallationUnitName();
                if(installationUnitName!=null&&installationUnitName.equals("null")){
                    installationUnitName="";
                }
                //消防设施安装单位联系人
                String installationUnitContacts = projectProgress.getInstallationUnitContacts();
                if(installationUnitContacts!=null&&installationUnitContacts.equals("null")){
                    installationUnitContacts="";
                }
                //动力监控建设方式
                String powerConstructionMode = projectProgress.getPowerConstructionMode();
                if(powerConstructionMode!=null&&powerConstructionMode.equals("null")){
                    powerConstructionMode="";
                }
                //动力监控供货厂家
                String powerSupplierName = projectProgress.getPowerSupplierName();
                if(powerSupplierName!=null&&powerSupplierName.equals("null")){
                    powerSupplierName="";
                }
                //动力监控供货厂家联系人
                String powerSupplierContacts = projectProgress.getPowerSupplierContacts();
                if(powerSupplierContacts!=null&&powerSupplierContacts.equals("null")){
                    powerSupplierContacts="";
                }
                //动力监控施工单位
                String powerUnitName = projectProgress.getPowerUnitName();
                if(powerUnitName!=null&&powerUnitName.equals("null")){
                    powerUnitName="";
                }
                //动力监控施工单位联系人
                String powerUnitContacts = projectProgress.getPowerUnitContacts();
                if(powerUnitContacts!=null&&powerUnitContacts.equals("null")){
                    powerUnitContacts="";
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
                row.createCell(21).setCellValue(skyBranchTypeName);
                row.createCell(22).setCellValue(skyBranchSupplierName);
                row.createCell(23).setCellValue(skyBranchSupplierContacts);
                row.createCell(24).setCellValue(skyBranchUnitName);
                row.createCell(25).setCellValue(skyConstructionUnitContacts);
                row.createCell(26).setCellValue(skyBranchHeight);
                row.createCell(27).setCellValue(machineRoomConstructionMode);
                row.createCell(28).setCellValue(machineRoomTypeName);
                row.createCell(29).setCellValue(machineRoomConstructionName);
                row.createCell(30).setCellValue(civilEngineeringContacts);
                row.createCell(31).setCellValue(machineRoomDecorateName);
                row.createCell(32).setCellValue(decorationUnitContacts);
                row.createCell(33).setCellValue(electricConstructionMode);
                row.createCell(34).setCellValue(electricType);
                row.createCell(35).setCellValue(electricUnitName);
                row.createCell(36).setCellValue(electricUnitContacts);
                row.createCell(37).setCellValue(equipmentConstructionMode);
                row.createCell(38).setCellValue(equipmentTypeName);
                row.createCell(39).setCellValue(equipmentSupplierName);
                row.createCell(40).setCellValue(equipmentSupplierContacts);
                row.createCell(41).setCellValue(equipmentUnitName);
                row.createCell(42).setCellValue(equipmentUnitContacts);
                row.createCell(43).setCellValue(airConstructionMode);
                row.createCell(44).setCellValue(conditioningBrandName);
                row.createCell(45).setCellValue(specificationTypeName);
                row.createCell(46).setCellValue(airUnitName);
                row.createCell(47).setCellValue(airConstructionContacts);
                row.createCell(48).setCellValue(fireConstructionMode);
                row.createCell(49).setCellValue(handHeldNumber);
                row.createCell(50).setCellValue(sprayingMethodNumber);
                row.createCell(51).setCellValue(fireSupplierName);
                row.createCell(52).setCellValue(fireSupplierContacts);
                row.createCell(53).setCellValue(installationUnitName);
                row.createCell(54).setCellValue(installationUnitContacts);
                row.createCell(55).setCellValue(powerConstructionMode);
                row.createCell(56).setCellValue(powerSupplierName);
                row.createCell(57).setCellValue(powerSupplierContacts);
                row.createCell(58).setCellValue(powerUnitName);
                row.createCell(59).setCellValue(powerUnitContacts);
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
