package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.FaEquipmentInformation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FAExportEquipmentInfoExcel {

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

	public static void createExcelToEquipments(List<FaEquipmentInformation> faEquipmentInformationList,
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

		//ProjectProgress projectProgress = new ProjectProgress();
        FaEquipmentInformation faEquipmentInformation = new FaEquipmentInformation();
        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (faEquipmentInformationList != null) {
			// 8 从集合的最高下标 递减 添加数据
			for (int i = faEquipmentInformationList.size() - 1; i >= 0; i--) {
                faEquipmentInformation = faEquipmentInformationList.get(i);
				//运营商
				String operator = faEquipmentInformation.getOperator();
				if (operator != null && operator.equals("null")) {
                    operator = "";
				}
				//建设年份
                String buildYear = faEquipmentInformation.getBuildYear();
                if (buildYear != null && buildYear.equals("null")) {
                    buildYear = "";
				}
                //建设项目名称
                String buildingProject = faEquipmentInformation.getBuildingProject();
                if (buildingProject != null && buildingProject.equals("null")) {
                    buildingProject = "";
				}
                //机房名称
                String motorRoomName = faEquipmentInformation.getMotorRoomName();
                if (motorRoomName != null && motorRoomName.equals("null")) {
                    motorRoomName = "";
				}
                //机房经度
                String motorRoomLongitude = faEquipmentInformation.getMotorRoomLongitude();
                if(motorRoomLongitude!=null && motorRoomLongitude.equals("null")){
                    motorRoomLongitude="";
				}
                //机房纬度
                String motorRoomLatitude = faEquipmentInformation.getMotorRoomLatitude();
                if(motorRoomLatitude!=null && motorRoomLatitude.equals("null")){
                    motorRoomLatitude="";
				}
                //省
                String province = faEquipmentInformation.getProvince();
                if(province!=null&&province.equals("null")){
                    province="";
                }
                //市
                String city = faEquipmentInformation.getCity();
                if(city!=null&&city.equals("null")){
                    city="";
                }
                //县（区）
                String county = faEquipmentInformation.getCounty();
                if(county!=null&&county.equals("null")){
                    county="";
                }
                //现场监理
                String onSiteSupervision = faEquipmentInformation.getOnSiteSupervision();
                if(onSiteSupervision!=null&&onSiteSupervision.equals("null")){
                    onSiteSupervision="";
                }
                //项目负责人
                String projectLeader = faEquipmentInformation.getProjectLeader();
                if(projectLeader!=null&&projectLeader.equals("null")){
                    projectLeader="";
                }
                //设备编号
                String equipmentNumber = faEquipmentInformation.getEquipmentNumber();
                if(equipmentNumber!=null&&equipmentNumber.equals("null")){
                    equipmentNumber="";
                }
                //设备,机柜,电源柜,配线架类型
                String equipmentType = faEquipmentInformation.getEquipmentType();
                if(equipmentType!=null&&equipmentType.equals("null")){
                    equipmentType="";
                }
                //设备,机柜,电源柜,配线架名称
                String equipmentName = faEquipmentInformation.getEquipmentName();
                if(equipmentName!=null&&equipmentName.equals("null")){
                    equipmentName="";
                }
                //设备,机柜,电源柜,配线架型号
                String equipmentModel = faEquipmentInformation.getEquipmentModel();
                if(equipmentModel!=null&&equipmentModel.equals("null")){
                    equipmentModel="";
                }
                //设计数量
                String equipmentDesignQuantity = faEquipmentInformation.getEquipmentDesignQuantity();
                if(equipmentDesignQuantity!=null&&equipmentDesignQuantity.equals("null")){
                    equipmentDesignQuantity="";
                }
                //尺寸
                String equipmentSize = faEquipmentInformation.getEquipmentSize();
                if(equipmentSize!=null&&equipmentSize.equals("null")){
                    equipmentSize="";
                }
                //供货厂家
                String equipmentSupplier = faEquipmentInformation.getEquipmentSupplier();
                if(equipmentSupplier!=null&&equipmentSupplier.equals("null")){
                    equipmentSupplier="";
                }
                //联系人
                String equipmentContacts = faEquipmentInformation.getEquipmentContacts();
                if(equipmentContacts!=null&&equipmentContacts.equals("null")){
                    equipmentContacts="";
                }
                //板卡编号
                String boardCardNumber = faEquipmentInformation.getBoardCardNumber();
                if(boardCardNumber!=null&&boardCardNumber.equals("null")){
                    boardCardNumber="";
                }
                //板卡名称
                String boardCardName = faEquipmentInformation.getBoardCardName();
                if(boardCardName!=null&&boardCardName.equals("null")){
                    boardCardName="";
                }
                //单板功能
                String veneerFunction = faEquipmentInformation.getVeneerFunction();
                if(veneerFunction!=null&&veneerFunction.equals("null")){
                    veneerFunction="";
                }
                //所在设备
                String placeEquipment = faEquipmentInformation.getPlaceEquipment();
                if(placeEquipment!=null&&placeEquipment.equals("null")){
                    placeEquipment="";
                }
                //设计数量
                String boardCardDesignQuantity = faEquipmentInformation.getBoardCardDesignQuantity();
                if(boardCardDesignQuantity!=null&&boardCardDesignQuantity.equals("null")){
                    boardCardDesignQuantity="";
                }
                //供货厂家
                String boardCardSupplier = faEquipmentInformation.getBoardCardSupplier();
                if(boardCardSupplier!=null&&boardCardSupplier.equals("null")){
                    boardCardSupplier="";
                }
                //联系人
                String boardCardContacts = faEquipmentInformation.getBoardCardContacts();
                if(boardCardContacts!=null&&boardCardContacts.equals("null")){
                    boardCardContacts="";
                }
                //电源编号
                String powerNumber = faEquipmentInformation.getPowerNumber();
                if(powerNumber!=null&&powerNumber.equals("null")){
                    powerNumber="";
                }
                //线缆类型
                String cableType = faEquipmentInformation.getCableType();
                if(cableType!=null&&cableType.equals("null")){
                    cableType="";
                }
                //规格型号
                String specificationModel = faEquipmentInformation.getSpecificationModel();
                if(specificationModel!=null&&specificationModel.equals("null")){
                    specificationModel="";
                }
                //条数
                String numberOfBranches = faEquipmentInformation.getNumberOfBranches();
                if(numberOfBranches!=null&&numberOfBranches.equals("null")){
                    numberOfBranches="";
                }
                //单条长度（m）
                String singleLength = faEquipmentInformation.getSingleLength();
                if(singleLength!=null&&singleLength.equals("null")){
                    singleLength="";
                }
                //总长度（m）
                String totalLength = faEquipmentInformation.getTotalLength();
                if(totalLength!=null&&totalLength.equals("null")){
                    totalLength="";
                }
                //来自哪
                String froms = faEquipmentInformation.getFroms();
                if(froms!=null&&froms.equals("null")){
                    froms="";
                }
                //到哪去
                String to1 = faEquipmentInformation.getTo1();
                if(to1!=null&&to1.equals("null")){
                    to1="";
                }
                //供货厂家
                String powerSupplier = faEquipmentInformation.getPowerSupplier();
                if(powerSupplier!=null&&powerSupplier.equals("null")){
                    powerSupplier="";
                }
                //联系人
                String powerContacts = faEquipmentInformation.getPowerContacts();
                if(powerContacts!=null&&powerContacts.equals("null")){
                    powerContacts="";
                }
                //尾纤编号
                String pigtailNumber = faEquipmentInformation.getPigtailNumber();
                if(pigtailNumber!=null&&pigtailNumber.equals("null")){
                    pigtailNumber="";
                }
                //线缆类型
                String fiberCableType = faEquipmentInformation.getFiberCableType();
                if(fiberCableType!=null&&fiberCableType.equals("null")){
                    fiberCableType="";
                }
                //规格型号
                String fiberSpecificationModel = faEquipmentInformation.getFiberSpecificationModel();
                if(fiberSpecificationModel!=null&&fiberSpecificationModel.equals("null")){
                    fiberSpecificationModel="";
                }
                //条数
                String fiberNumberOfBranches = faEquipmentInformation.getFiberNumberOfBranches();
                if(fiberNumberOfBranches!=null&&fiberNumberOfBranches.equals("null")){
                    fiberNumberOfBranches="";
                }
                //单条长度
                String fiberSingleLength = faEquipmentInformation.getFiberSingleLength();
                if(fiberSingleLength!=null&&fiberSingleLength.equals("null")){
                    fiberSingleLength="";
                }
                //来自哪
                String froms1 = faEquipmentInformation.getFroms();
                if(froms!=null&&froms.equals("null")){
                    froms="";
                }
                //到哪去
                String to2 = faEquipmentInformation.getTo2();
                if(to2!=null&&to2.equals("null")){
                    to2="";
                }
                //供货厂家
                String fiberSupplier = faEquipmentInformation.getFiberSupplier();
                if(fiberSupplier!=null&&fiberSupplier.equals("null")){
                    fiberSupplier="";
                }
                //联系人
                String fiberContacts = faEquipmentInformation.getFiberContacts();
                if(fiberContacts!=null&&fiberContacts.equals("null")){
                    fiberContacts="";
                }
                //走线架编号
                String walkingNumber = faEquipmentInformation.getWalkingNumber();
                if(walkingNumber!=null&&walkingNumber.equals("null")){
                    walkingNumber="";
                }
                //设计长度（m）
                String walkingDesignLength = faEquipmentInformation.getWalkingDesignLength();
                if(walkingDesignLength!=null&&walkingDesignLength.equals("null")){
                    walkingDesignLength="";
                }
                //供货厂家
                String walkingFrameSupplier = faEquipmentInformation.getWalkingFrameSupplier();
                if(walkingFrameSupplier!=null&&walkingFrameSupplier.equals("null")){
                    walkingFrameSupplier="";
                }
                //联系人
                String walkingFrameContacts = faEquipmentInformation.getWalkingFrameContacts();
                if(walkingFrameContacts!=null&&walkingFrameContacts.equals("null")){
                    walkingFrameContacts="";
                }
                //光纤槽道编号
                String fiberOpticNumber = faEquipmentInformation.getFiberOpticNumber();
                if(fiberOpticNumber!=null&&fiberOpticNumber.equals("null")){
                    fiberOpticNumber="";
                }
                //设计长度
                String fiberOpticDesignLength = faEquipmentInformation.getFiberOpticDesignLength();
                if(fiberOpticDesignLength!=null&&fiberOpticDesignLength.equals("null")){
                    fiberOpticDesignLength="";
                }
                //供货厂家
                String fiberOpticSupplier = faEquipmentInformation.getFiberOpticSupplier();
                if(fiberOpticSupplier!=null&&fiberOpticSupplier.equals("null")){
                    fiberOpticSupplier="";
                }
                //联系人
                String fiberOpticContacts = faEquipmentInformation.getFiberOpticContacts();
                if(fiberOpticContacts!=null&&fiberOpticContacts.equals("null")){
                    fiberOpticContacts="";
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
                row.createCell(11).setCellValue(equipmentNumber);
                row.createCell(12).setCellValue(equipmentType);
                row.createCell(13).setCellValue(equipmentName);
                row.createCell(14).setCellValue(equipmentModel);
                row.createCell(15).setCellValue(equipmentDesignQuantity);
                row.createCell(16).setCellValue(equipmentSize);
                row.createCell(17).setCellValue(equipmentSupplier);
                row.createCell(18).setCellValue(equipmentContacts);
                row.createCell(19).setCellValue(boardCardNumber);
                row.createCell(20).setCellValue(boardCardName);
                row.createCell(21).setCellValue(veneerFunction);
                row.createCell(22).setCellValue(placeEquipment);
                row.createCell(23).setCellValue(boardCardDesignQuantity);
                row.createCell(24).setCellValue(boardCardSupplier);
                row.createCell(25).setCellValue(boardCardContacts);
                row.createCell(26).setCellValue(powerNumber);
                row.createCell(27).setCellValue(cableType);
                row.createCell(28).setCellValue(specificationModel);
                row.createCell(29).setCellValue(numberOfBranches);
                row.createCell(30).setCellValue(singleLength);
                row.createCell(31).setCellValue(totalLength);
                row.createCell(32).setCellValue(froms);
                row.createCell(33).setCellValue(to1);
                row.createCell(34).setCellValue(powerSupplier);
                row.createCell(35).setCellValue(powerContacts);
                row.createCell(36).setCellValue(pigtailNumber);
                row.createCell(37).setCellValue(fiberCableType);
                row.createCell(38).setCellValue(fiberSpecificationModel);
                row.createCell(39).setCellValue(fiberNumberOfBranches);
                row.createCell(40).setCellValue(fiberSingleLength);
                row.createCell(41).setCellValue(froms);
                row.createCell(42).setCellValue(to2);
                row.createCell(43).setCellValue(fiberSupplier);
                row.createCell(44).setCellValue(fiberContacts);
                row.createCell(45).setCellValue(walkingNumber);
                row.createCell(46).setCellValue(walkingDesignLength);
                row.createCell(47).setCellValue(walkingFrameSupplier);
                row.createCell(48).setCellValue(walkingFrameContacts);
                row.createCell(49).setCellValue(fiberOpticNumber);
                row.createCell(50).setCellValue(fiberOpticDesignLength);
                row.createCell(51).setCellValue(fiberOpticSupplier);
                row.createCell(52).setCellValue(fiberOpticContacts);
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
