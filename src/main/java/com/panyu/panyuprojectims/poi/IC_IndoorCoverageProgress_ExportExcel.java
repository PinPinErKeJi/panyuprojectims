package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.HnGarrisonJobProgress;
import com.panyu.panyuprojectims.entity.IndoorCoverageProgress;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IC_IndoorCoverageProgress_ExportExcel {

	public static Map getMap(){
	    Map map=new HashMap();

		map.put(0,"运营商");
		map.put(1,"建设项目名称");
		map.put(2,"建设年份");
		map.put(3,"规划站名");
		map.put(4,"实际站名");
		map.put(5,"经度");
        map.put(6,"纬度");
        map.put(7,"省");
		map.put(8,"市");
		map.put(9,"县(区)");
		map.put(10,"所属部门");
		map.put(11,"覆盖类型");
//监理单位
		map.put(12,"现场责任人");
		map.put(13,"专业负责人");
		map.put(14,"区域负责人");
//施工单位
		map.put(15,"名称");
		map.put(16,"负责人");
//设计单位
		map.put(17,"名称");
		map.put(18,"负责人");
//BBU
		map.put(19,"安装方式");
		map.put(20,"集中放置");
		map.put(21,"小区挂墙");
//RRU
		map.put(22,"设计数量");
		map.put(23,"安装数量");
//光分布设备
		map.put(24,"类型");
		map.put(25,"EasyMacro");
		map.put(26,"BOOK RRU（不集成天线）");
		map.put(27,"BOOK RRU（集成天线）");
		map.put(28,"HUB");
		map.put(29,"PRU(不集成天线)");
		map.put(30,"PRU(集成天线)");
		map.put(31,"接入单元（近端）");
		map.put(32,"扩展单元");
		map.put(33,"远端设备（室内）");
		map.put(34,"远端设备（室外）");
//无源器件
		map.put(35,"类型");
		map.put(36,"功分器");
		map.put(37,"耦合器");
		map.put(38,"合路器");
		map.put(39,"负载");
//天线
		map.put(40,"类型");
		map.put(41,"室内天线");
		map.put(42,"室外天线");
		map.put(43,"电梯天线");
		map.put(44,"GPS天线");
//线缆
        map.put(45,"类型");
        map.put(46,"网线");
        map.put(47,"光电复合缆");
        map.put(48,"7/8馈线");
        map.put(49,"1/2馈线");
//电表
        map.put(50,"设计数量");
        map.put(51,"安装数量");



		return map;
	}

	static String[] GarrisonExcel= {
			"运营商","建设项目名称","建设年份","规划站名","实际站名","经度","纬度","省","市","县(区)","所属部门","覆盖类型",
            "监理单位","监理单位","监理单位",
            "施工单位","施工单位",
            "设计单位","设计单位",
            "BBU","BBU","BBU",
            "RRU","RRU",
            "光分布设备","光分布设备","光分布设备","光分布设备","光分布设备","光分布设备","光分布设备","光分布设备","光分布设备","光分布设备","光分布设备",
            "无源器件","无源器件","无源器件","无源器件","无源器件",
            "天线","天线","天线","天线","天线",
            "线缆","线缆","线缆","线缆","线缆",
            "电表","电表",
			};

	public static void createIndoorCoverageProgressExcel(List<IndoorCoverageProgress> indoorCoverageProgressList,
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
		for (int l = 0;l<GarrisonExcel.length;l++){
			cell = row.createCell(l);
			cell.setCellValue(GarrisonExcel[l]);
			cell.setCellStyle(cellStyle);
			sheet.autoSizeColumn(l);
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
		sheet.addMergedRegion(new CellRangeAddress(0,0,22,23));
        sheet.addMergedRegion(new CellRangeAddress(0,0,24,34));
        sheet.addMergedRegion(new CellRangeAddress(0,0,35,39));
        sheet.addMergedRegion(new CellRangeAddress(0,0,40,44));
        sheet.addMergedRegion(new CellRangeAddress(0,0,45,49));
        sheet.addMergedRegion(new CellRangeAddress(0,0,50,51));

		row = sheet.createRow(1);

		for (int j = 11;j<14;j++){
			cell = row.createCell((short)j);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("监理单位" +(j-1));
			sheet.autoSizeColumn(j);
		}
		for (int a = 15;a<16;a++){
			cell = row.createCell((short)a);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("施工单位" +(a-1));
			sheet.autoSizeColumn(a);
		}
		for (int b = 17;b<18;b++){
			cell = row.createCell((short)b);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("设计单位" +(b-1));
			sheet.autoSizeColumn(b);
		}
		for (int c = 19;c<21;c++){
			cell = row.createCell((short)c);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("BBU" +(c-1));
			sheet.autoSizeColumn(c);
		}
		for (int d = 22;d<23;d++){
			cell = row.createCell((short)d);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("RRU" +(d-1));
		}

		for (int e = 24;e<34;e++){
			cell = row.createCell((short)e);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("光分布设备" +(e-1));
		}
		for (int f = 35;f<39;f++){
			cell = row.createCell((short)f);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("无源器件" +(f-1));
		}
		for (int g = 40;g<44;g++){
			cell = row.createCell((short)g);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("天线" +(g-1));
		}
		for (int h = 45;h<49;h++){
			cell = row.createCell((short)h);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("线缆" +(h-1));
		}
		for (int i = 50;i<51;i++){
			cell = row.createCell((short)i);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("电表" +(i-1));
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



        IndoorCoverageProgress in = new IndoorCoverageProgress();
        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (indoorCoverageProgressList != null) {
			// 8 从集合的最高下标 递减 添加数据
			for (int i = indoorCoverageProgressList.size() - 1; i >= 0; i--) {
                in = indoorCoverageProgressList.get(i);
                //运营商
				String operator = in.getOperator();
				if (operator != null && operator.equals("null")) {
                    operator = "";
				}
				//建设项目名称
				String buildingProject = in.getBuildingProject();
				if (buildingProject != null && buildingProject.equals("null")) {
					buildingProject = "";
				}
				//建设年份
                String buildYear = in.getBuildYear();
                if (buildYear != null && buildYear.equals("null")) {
                    buildYear = "";
				}
                //规划站名
                String planStationName = in.getPlanStationName();
                if (planStationName != null && planStationName.equals("null")) {
                    planStationName = "";
                }
                //实际站名
                String actualStationName = in.getActualStationName();
                if(actualStationName!=null&&actualStationName.equals("null")){
                    actualStationName="";
                }
                ;//经度
                String indoorLongitude = in.getIndoorLongitude();
                if(indoorLongitude!=null&&indoorLongitude.equals("null")){
                    indoorLongitude="";
                }
                ;//纬度
                String indoorLatitude = in.getIndoorLatitude();
                if(indoorLatitude!=null&&indoorLatitude.equals("null")){
                    indoorLatitude="";
                }
                //省
                String province = in.getProvince();
                if(province!=null&&province.equals("null")){
                    province="";
                }
                //市
                String city = in.getCity();
                if(city!=null&&city.equals("null")){
                    city="";
                }
                //区（县）
                String county = in.getCounty();
                if(county!=null&&county.equals("null")){
                    county="";
                }

                ;//所属部门
                String subordinateDepartment = in.getSubordinateDepartment();
                if(subordinateDepartment!=null&&subordinateDepartment.equals("null")){
                    subordinateDepartment="";
                }
                ;//覆盖类型
                String coverType = in.getCoverType();
                if(coverType!=null&&coverType.equals("null")){
                    coverType="";
                }
                ;//专业负责人
                String professionResponsiblePerson =in.getProfessionResponsiblePerson();
                if(professionResponsiblePerson!=null&&professionResponsiblePerson.equals("null")){
                    professionResponsiblePerson="";
                }
                ;//区域负责人
                String districtHead = in.getDistrictHead();
                if(districtHead!=null&&districtHead.equals("null")){
                    districtHead="";
                }
                ;//现场负责人
                String siteLeader = in.getSiteLeader();
                if(siteLeader!=null&&siteLeader.equals("null")){
                    siteLeader="";
                }
                ;//公司名称
                String icCorporateName = in.getIcCorporateName();
                if(icCorporateName!=null&&icCorporateName.equals("null")){
                    icCorporateName="";
                }
                ;//负责人
                String personInCharge = in.getPersonInCharge();
                if(personInCharge!=null&&personInCharge.equals("null")){
                    personInCharge="";
                }
                ;//公司名称
                String designCorporateName = in.getDesignCorporateName();
                if(designCorporateName!=null&&designCorporateName.equals("null")){
                    designCorporateName="";
                }
                ;//负责人
                String designPersonInCharge = in.getDesignPersonInCharge();
                if(designPersonInCharge!=null&&designPersonInCharge.equals("null")){
                    designPersonInCharge="";
                }
                ;//安装方式
                String installation = in.getInstallation();
                if(installation!=null&&installation.equals("null")){
                    installation="";
                }
                ;//集中放置
                String centralization = in.getCentralization();
                if(centralization!=null&&centralization.equals("null")){
                    centralization="";
                }
                ;//小区挂墙
                String wallHangingWall = in.getWallHangingWall();
                if(wallHangingWall!=null&&wallHangingWall.equals("null")){
                    wallHangingWall="";
                }
                ;//设计数量
                String designStart = in.getDesignStart();
                if(designStart!=null&&designStart.equals("null")){
                    designStart="";
                }
                ;//安装数量
                String dramInstalledDram = in.getDramInstalledDram();
                if(dramInstalledDram!=null&&dramInstalledDram.equals("null")){
                    dramInstalledDram="";
                }
                ;//类型
                String lightDistriputionType = in.getLightDistriputionType();
                if(lightDistriputionType!=null&&lightDistriputionType.equals("null")){
                    lightDistriputionType="";
                }
                ;//EasyMacro
                String easyMacro = in.getEasyMacro();
                if(easyMacro!=null&&easyMacro.equals("null")){
                    easyMacro="";
                }
                ;//BOOK RRU(不集成天线)
                String bookrruNotIntegratedAntenna = in.getBookrruNotIntegratedAntenna();
                if(bookrruNotIntegratedAntenna!=null&&bookrruNotIntegratedAntenna.equals("null")){
                    bookrruNotIntegratedAntenna="";
                }
                ;//BOOK RRU(集成天线)
                String bookrruIntegratedAntenna = in.getBookrruIntegratedAntenna();
                if(bookrruIntegratedAntenna!=null&&bookrruIntegratedAntenna.equals("null")){
                    bookrruIntegratedAntenna="";
                }
                ;//HUB
                String hub = in.getHub();
                if(hub!=null&&hub.equals("null")){
                    hub="";
                }
                ;//PRU（集成天线）
                String pruIntegratedAntenna = in.getPruIntegratedAntenna();
                if(pruIntegratedAntenna!=null&&pruIntegratedAntenna.equals("null")){
                    pruIntegratedAntenna="";
                }
                ;//PRU（不集成天线）
                String pruNotIntegratedAntenna = in.getPruNotIntegratedAntenna();
                if(pruNotIntegratedAntenna!=null&&pruNotIntegratedAntenna.equals("null")){
                    pruNotIntegratedAntenna="";
                }
                ;//接入单元（近端）
                String accessUnit = in.getAccessUnit();
                if(accessUnit!=null&&accessUnit.equals("null")){
                    accessUnit="";
                }
                ;//扩展单元
                String extensionUnit =in.getExtensionUnit();
                if(extensionUnit!=null&&extensionUnit.equals("null")){
                    extensionUnit="";
                }
                ;//远端设备（室内）
                String remoteDeviceIndoor = in.getRemoteDeviceIndoor();
                if(remoteDeviceIndoor!=null&&remoteDeviceIndoor.equals("null")){
                    remoteDeviceIndoor="";
                }
                ;//远端设备（室外）
                String remoteDeviceOutdoor = in.getRemoteDeviceOutdoor();
                if(remoteDeviceOutdoor!=null&&remoteDeviceOutdoor.equals("null")){
                    remoteDeviceOutdoor="";
                }
                ;//类型
                String passiveDeviceType = in.getPassiveDeviceType();
                if(passiveDeviceType!=null&&passiveDeviceType.equals("null")){
                    passiveDeviceType="";
                }
                ;//功分器
                String powerDivider = in.getPowerDivider();
                if(powerDivider!=null&&powerDivider.equals("null")){
                    powerDivider="";
                }
                ;//耦合器
                String coupler = in.getCoupler();
                if(coupler!=null&&coupler.equals("null")){
                    coupler="";
                }
                ;//合路器
                String roadConnector = in.getRoadConnector();
                if(roadConnector!=null&&roadConnector.equals("null")){
                    roadConnector="";
                }
                ;//负载
                String loadNumber = in.getLoadNumber();
                if(loadNumber!=null&&loadNumber.equals("null")){
                    loadNumber="";
                }
                ;//类型
                String antennaType = in.getAntennaType();
                if(antennaType!=null&&antennaType.equals("null")){
                    antennaType="";
                }
                ;//室内天线
                String indoorAntenna = in.getIndoorAntenna();
                if(indoorAntenna!=null&&indoorAntenna.equals("null")){
                    indoorAntenna="";
                }
                ;//室外天线
                String outdoorAntenna = in.getOutdoorAntenna();
                if(outdoorAntenna!=null&&outdoorAntenna.equals("null")){
                    outdoorAntenna="";
                }

                ;//电梯天线
                String elevatorAntenna = in.getElevatorAntenna();
                if(elevatorAntenna!=null&&elevatorAntenna.equals("null")){
                    elevatorAntenna="";
                }

                ;//GPS天线
                String gpsAntenna = in.getGpsAntenna();
                if(gpsAntenna!=null&&gpsAntenna.equals("null")){
                    gpsAntenna="";
                }

                ;//类型
                String cableType = in.getCableType();
                if(cableType!=null&&cableType.equals("null")){
                    cableType="";
                }

                ;//网线
                String networkLine = in.getNetworkLine();
                if(networkLine!=null&&networkLine.equals("null")){
                    networkLine="";
                }

                ;//光电复合缆
                String photoelectricCompositeCable = in.getPhotoelectricCompositeCable();
                if(photoelectricCompositeCable!=null&&photoelectricCompositeCable.equals("null")){
                    photoelectricCompositeCable="";
                }

                ;//八分之七馈线
                String sevenEighthsFeeder = in.getSevenEighthsFeeder();
                if(sevenEighthsFeeder!=null&&sevenEighthsFeeder.equals("null")){
                    sevenEighthsFeeder="";
                }

                ;//二分之一馈线
                String ahalfFeeder = in.getAhalfFeeder();
                if(ahalfFeeder!=null&&ahalfFeeder.equals("null")){
                    ahalfFeeder="";
                }

                ;//设计数量
                String electricDesignStart = in.getElectricDesignStart();
                if(electricDesignStart!=null&&electricDesignStart.equals("null")){
                    electricDesignStart="";
                }

                ;//安装数量
                String electricInstalledDram = in.getElectricInstalledDram();
                if(electricInstalledDram!=null&&electricInstalledDram.equals("null")){
                    electricInstalledDram="";
                }

                row = sheet.createRow(i + 2);
                row.createCell(0).setCellValue(operator);
                row.createCell(1).setCellValue(buildingProject);
                row.createCell(2).setCellValue(buildYear);
                row.createCell(3).setCellValue(planStationName);
                row.createCell(4).setCellValue(actualStationName);
                row.createCell(5).setCellValue(indoorLongitude);
                row.createCell(6).setCellValue(indoorLatitude);
                row.createCell(7).setCellValue(province);
                row.createCell(8).setCellValue(city);
                row.createCell(9).setCellValue(county);
                row.createCell(10).setCellValue(subordinateDepartment);
                row.createCell(11).setCellValue(coverType);
                row.createCell(12).setCellValue(professionResponsiblePerson);
                row.createCell(13).setCellValue(districtHead);
                row.createCell(14).setCellValue(siteLeader);
                row.createCell(15).setCellValue(icCorporateName);
                row.createCell(16).setCellValue(personInCharge);
                row.createCell(17).setCellValue(designCorporateName);
                row.createCell(18).setCellValue(designPersonInCharge);
                row.createCell(19).setCellValue(installation);
                row.createCell(20).setCellValue(centralization);
                row.createCell(21).setCellValue(wallHangingWall);
                row.createCell(22).setCellValue(designStart);
                row.createCell(23).setCellValue(dramInstalledDram);
                row.createCell(24).setCellValue(lightDistriputionType);
                row.createCell(25).setCellValue(easyMacro);
                row.createCell(26).setCellValue(bookrruNotIntegratedAntenna);
                row.createCell(27).setCellValue(bookrruIntegratedAntenna);
                row.createCell(28).setCellValue(hub);
                row.createCell(29).setCellValue(pruIntegratedAntenna);
                row.createCell(30).setCellValue(pruNotIntegratedAntenna);
                row.createCell(31).setCellValue(accessUnit);
                row.createCell(32).setCellValue(extensionUnit);
                row.createCell(33).setCellValue(remoteDeviceIndoor);
                row.createCell(34).setCellValue(remoteDeviceOutdoor);
                row.createCell(35).setCellValue(passiveDeviceType);
                row.createCell(36).setCellValue(powerDivider);
                row.createCell(37).setCellValue(coupler);
                row.createCell(38).setCellValue(roadConnector);
                row.createCell(39).setCellValue(loadNumber);
                row.createCell(40).setCellValue(antennaType);
                row.createCell(41).setCellValue(indoorAntenna);
                row.createCell(42).setCellValue(outdoorAntenna);
                row.createCell(43).setCellValue(elevatorAntenna);
                row.createCell(44).setCellValue(gpsAntenna);
                row.createCell(45).setCellValue(cableType);
                row.createCell(46).setCellValue(networkLine);
                row.createCell(47).setCellValue(photoelectricCompositeCable);
                row.createCell(48).setCellValue(sevenEighthsFeeder);
                row.createCell(49).setCellValue(ahalfFeeder);
                row.createCell(50).setCellValue(electricDesignStart);
                row.createCell(51).setCellValue(electricInstalledDram);

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
