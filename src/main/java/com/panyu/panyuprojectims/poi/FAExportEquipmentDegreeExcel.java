package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.FaEquipmentProjectProgress;
import com.panyu.panyuprojectims.entity.ProjectProgressDegree;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FAExportEquipmentDegreeExcel {

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
		map.put(8,"县（区）");
		map.put(9,"现场监理");
		map.put(10,"项目负责人");

		map.put(11,"编号");
		map.put(12,"类型");
		map.put(13,"设备名称");
		map.put(14,"设备型号");
		map.put(15,"到货");
		map.put(16,"安装");
		map.put(17,"加电");
		map.put(18,"链路调试");
		map.put(19,"单机调试");
		map.put(20,"联网调试");
		map.put(21,"割接入网");

		map.put(22,"编号");
		map.put(23,"单板名称");
		map.put(24,"单板功能");
		map.put(25,"所在设备");
		map.put(26,"设计数量");
		map.put(27,"单板安装");
		map.put(28,"割接入网");
		map.put(29,"编号");
		map.put(30,"线缆类型");
		map.put(31,"规格型号");
		map.put(32,"长度（m）");
		map.put(33,"From：");
		map.put(34,"To：");
		map.put(35,"施工进度");
		map.put(36,"完工时间");
		map.put(37,"长度（m）");
		map.put(38,"施工进度");
		map.put(39,"完工时间");
		map.put(40,"长度（m）");
		map.put(41,"施工进度");
		map.put(42,"完工时间");

		return map;
	}

	static String[] excelSecond= {
			"运营商","建设年份","建设项目名称",
            "机房名称","机房经度","机房纬度","省", "市","区（县）","现场监理","项目负责人",
            "新增设备","新增设备","新增设备","新增设备","新增设备","新增设备","新增设备","新增设备","新增设备","新增设备","新增设备",
            "扩容单板","扩容单板","扩容单板","扩容单板","扩容单板","扩容单板","扩容单板",
            "新增线缆","新增线缆","新增线缆","新增线缆","新增线缆","新增线缆","新增线缆","新增线缆",
            "新增走线架","新增走线架","新增走线架",
            "新增光纤槽道","新增光纤槽道","新增光纤槽道",
			};

	public static void createFAExportEquipmentDegreeExcel(List<FaEquipmentProjectProgress> faEquipmentProjectProgressList,
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


		sheet.addMergedRegion(new CellRangeAddress(0,0,11,21));
		sheet.addMergedRegion(new CellRangeAddress(0,0,21,27));
		sheet.addMergedRegion(new CellRangeAddress(0,0,28,35));
		sheet.addMergedRegion(new CellRangeAddress(0,0,36,39));
		sheet.addMergedRegion(new CellRangeAddress(0,0,40,42));

		row = sheet.createRow(1);
		for (int j = 10;j<21;j++){
			cell = row.createCell((short)j);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("新增设备" +(j-1));
			sheet.autoSizeColumn(j);
		}
		for (int a = 21;a<27;a++){
			cell = row.createCell((short)a);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("扩容单板" +(a-1));
			sheet.autoSizeColumn(a);
		}
		for (int b = 27;b<35;b++){
			cell = row.createCell((short)b);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("新增线缆" +(b-1));
			sheet.autoSizeColumn(b);
		}
		for (int c = 35;c<39;c++){
			cell = row.createCell((short)c);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("新增走线架" +(c-1));
			sheet.autoSizeColumn(c);
		}
		for (int d = 39;d<42;d++){
			cell = row.createCell((short)d);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("新增光纤槽道" +(d-1));
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



        FaEquipmentProjectProgress faEquipmentProjectProgress = new FaEquipmentProjectProgress();

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (faEquipmentProjectProgressList != null) {
			// 8 从集合的最高下标 递减 添加数据
			for (int i = faEquipmentProjectProgressList.size() - 1; i >= 0; i--) {
                faEquipmentProjectProgress = faEquipmentProjectProgressList.get(i);
                //运营商
				String operator = faEquipmentProjectProgress.getOperator();
				if (operator != null && operator.equals("null")) {
                    operator = "";
				}
				//建设年份
                String buildYear = faEquipmentProjectProgress.getBuildYear();
                if (buildYear != null && buildYear.equals("null")) {
                    buildYear = "";
				}
                //建设项目
                String buildingProject = faEquipmentProjectProgress.getBuildingProject();
                if (buildingProject != null && buildingProject.equals("null")) {
                    buildingProject = "";
                }
                //机房名称
                String motorRoomName = faEquipmentProjectProgress.getMotorRoomName();
                if (motorRoomName != null && motorRoomName.equals("null")) {
                    motorRoomName = "";
                }
                //机房经度
                String motorRoomLongitude = faEquipmentProjectProgress.getMotorRoomLongitude();
                if (motorRoomLongitude != null && motorRoomLongitude.equals("null")) {
                    motorRoomLongitude = "";
                }
                //机房纬度
                String motorRoomLatitude = faEquipmentProjectProgress.getMotorRoomLatitude();
                if (motorRoomLatitude != null && motorRoomLatitude.equals("null")) {
                    motorRoomLatitude = "";
                }
                //省
                String province = faEquipmentProjectProgress.getProvince();
                if(province!=null&&province.equals("null")){
                    province="";
                }
                //市
                String city = faEquipmentProjectProgress.getCity();
                if(city!=null&&city.equals("null")){
                    city="";
                }
                //县（区）
                String county = faEquipmentProjectProgress.getCounty();
                if(county!=null&&county.equals("null")){
                    county="";
                }
                //现场监理
                String onSiteSupervision = faEquipmentProjectProgress.getOnSiteSupervision();
                if(onSiteSupervision!=null&&onSiteSupervision.equals("null")){
                    onSiteSupervision="";
                }
                //项目负责人
                String projectLeader = faEquipmentProjectProgress.getProjectLeader();
                if(projectLeader!=null&&projectLeader.equals("null")){
                    projectLeader="";
                }
                //编号
                String newEquipmentNumber = faEquipmentProjectProgress.getNewEquipmentNumber();
                if(newEquipmentNumber!=null&&newEquipmentNumber.equals("null")){
                    newEquipmentNumber="";
                }
                //类型
                String newEquipmentType = faEquipmentProjectProgress.getNewEquipmentType();
                if(newEquipmentType!=null&&newEquipmentType.equals("null")){
                    newEquipmentType="";
                }
                //设备名称
                String newEquipmentName = faEquipmentProjectProgress.getNewEquipmentName();
                if(newEquipmentName!=null&&newEquipmentName.equals("null")){
                    newEquipmentName="";
                }
                //设备型号
                String newEquipmentModel = faEquipmentProjectProgress.getNewEquipmentModel();
                if(newEquipmentModel!=null&&newEquipmentModel.equals("null")){
                    newEquipmentModel="";
                }
                //到货
                String newEquipmentArrival = faEquipmentProjectProgress.getNewEquipmentArrival();
                if(newEquipmentArrival!=null&&newEquipmentArrival.equals("null")){
                    newEquipmentArrival="";
                }
                //安装
                String newEquipmentInstall = faEquipmentProjectProgress.getNewEquipmentInstall();
                if(newEquipmentInstall!=null&&newEquipmentInstall.equals("null")){
                    newEquipmentInstall="";
                }
                //加电
                String newEquipmentPowerUp = faEquipmentProjectProgress.getNewEquipmentPowerUp();
                if(newEquipmentPowerUp!=null&&newEquipmentPowerUp.equals("null")){
                    newEquipmentPowerUp="";
                }//链路调试
                String newEquipmentLinkDebugging = faEquipmentProjectProgress.getNewEquipmentLinkDebugging();
                if(newEquipmentLinkDebugging!=null&&newEquipmentLinkDebugging.equals("null")){
                    newEquipmentLinkDebugging="";
                }
                //单机调试
                String singleMachineDebugging = faEquipmentProjectProgress.getSingleMachineDebugging();
                if(singleMachineDebugging!=null&&singleMachineDebugging.equals("null")){
                    singleMachineDebugging="";
                }
                //联网调试
                String networkingDebugging = faEquipmentProjectProgress.getNetworkingDebugging();
                if(networkingDebugging!=null&&networkingDebugging.equals("null")){
                    networkingDebugging="";
                }
                //割接入网
                String cutAccessNetwork = faEquipmentProjectProgress.getCutAccessNetwork();
                if(cutAccessNetwork!=null&&cutAccessNetwork.equals("null")){
                    cutAccessNetwork="";
                }
                //编号
                String dilatantVeneerNumber = faEquipmentProjectProgress.getDilatantVeneerNumber();
                if(dilatantVeneerNumber!=null&&dilatantVeneerNumber.equals("null")){
                    dilatantVeneerNumber="";
                }
                //单板名称
                String dilatantVeneerName = faEquipmentProjectProgress.getDilatantVeneerName();
                if(dilatantVeneerName!=null&&dilatantVeneerName.equals("null")){
                    dilatantVeneerName="";
                }
                //单板功能
                String dilatantVeneerFunction = faEquipmentProjectProgress.getDilatantVeneerFunction();
                if(dilatantVeneerFunction!=null&&dilatantVeneerFunction.equals("null")){
                    dilatantVeneerFunction="";
                }
                //所在设备
                String veneerPlaceEquipment = faEquipmentProjectProgress.getVeneerPlaceEquipment();
                if(veneerPlaceEquipment!=null&&veneerPlaceEquipment.equals("null")){
                    veneerPlaceEquipment="";
                }
                //设计数量
                String dilatantVeneerEsignQuantity = faEquipmentProjectProgress.getDilatantVeneerEsignQuantity();
                if(dilatantVeneerEsignQuantity!=null&&dilatantVeneerEsignQuantity.equals("null")){
                    dilatantVeneerEsignQuantity="";
                }
                //单板安装
                String dilatantVeneerInstall = faEquipmentProjectProgress.getDilatantVeneerInstall();
                if(dilatantVeneerInstall!=null&&dilatantVeneerInstall.equals("null")){
                    dilatantVeneerInstall="";
                }
                //割接入网
                String veneerCutAccessNetwork = faEquipmentProjectProgress.getVeneerCutAccessNetwork();
                if(veneerCutAccessNetwork!=null&&veneerCutAccessNetwork.equals("null")){
                    veneerCutAccessNetwork="";
                }
                //编号
                String newCableNumber = faEquipmentProjectProgress.getNewCableNumber();
                if(newCableNumber!=null&&newCableNumber.equals("null")){
                    newCableNumber="";
                }
                //线缆类型
                String newCableType = faEquipmentProjectProgress.getNewCableType();
                if(newCableType!=null&&newCableType.equals("null")){
                    newCableType="";
                }
                //规格型号
                String newCableSpecificationModel = faEquipmentProjectProgress.getNewCableSpecificationModel();
                if(newCableSpecificationModel!=null&&newCableSpecificationModel.equals("null")){
                    newCableSpecificationModel="";
                }
                //长度（m）
                String newCableLength = faEquipmentProjectProgress.getNewCableLength();
                if(newCableLength!=null&&newCableLength.equals("null")){
                    newCableLength="";
                }
                //From
                String newCableForm = faEquipmentProjectProgress.getNewCableForm();
                if(newCableForm!=null&&newCableForm.equals("null")){
                    newCableForm="";
                }
                //To
                String newCableTo = faEquipmentProjectProgress.getNewCableTo();
                if(newCableTo!=null&&newCableTo.equals("null")){
                    newCableTo="";
                }
                //施工进度
                String cableConstructionProgress = faEquipmentProjectProgress.getCableConstructionProgress();
                if(cableConstructionProgress!=null&&cableConstructionProgress.equals("null")){
                    cableConstructionProgress="";
                }
                //完工时间
                String newCableMakespan = faEquipmentProjectProgress.getNewCableMakespan();
                if(newCableMakespan!=null&&newCableMakespan.equals("null")){
                    newCableMakespan="";
                }
                //长度（m）
                String newWalkingFrameLength = faEquipmentProjectProgress.getNewWalkingFrameLength();
                if(newWalkingFrameLength!=null&&newWalkingFrameLength.equals("null")){
                    newWalkingFrameLength="";
                }
                //施工进度
                String walkingConstructionProgress = faEquipmentProjectProgress.getWalkingConstructionProgress();
                if(walkingConstructionProgress!=null&&walkingConstructionProgress.equals("null")){
                    walkingConstructionProgress="";
                }
                //完工时间
                String newWalkingFrameMakespan = faEquipmentProjectProgress.getNewWalkingFrameMakespan();
                if(newWalkingFrameMakespan!=null&&newWalkingFrameMakespan.equals("null")){
                    newWalkingFrameMakespan="";
                }
                //长度（m）
                String newFiberOpticChannelLength = faEquipmentProjectProgress.getNewFiberOpticChannelLength();
                if(newFiberOpticChannelLength!=null&&newFiberOpticChannelLength.equals("null")){
                    newFiberOpticChannelLength="";
                }
                //施工进度
                String channelConstructionProgress = faEquipmentProjectProgress.getChannelConstructionProgress();
                if(channelConstructionProgress!=null&&channelConstructionProgress.equals("null")){
                    channelConstructionProgress="";
                }
                //完工时间
                String channelFrameMakespan = faEquipmentProjectProgress.getChannelFrameMakespan();
                if(channelFrameMakespan!=null&&channelFrameMakespan.equals("null")){
                    channelFrameMakespan="";
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
                row.createCell(11).setCellValue(newEquipmentNumber);
                row.createCell(12).setCellValue(newEquipmentType);
                row.createCell(13).setCellValue(newEquipmentName);
                row.createCell(14).setCellValue(newEquipmentModel);
                row.createCell(15).setCellValue(newEquipmentArrival);
                row.createCell(16).setCellValue(newEquipmentInstall);
                row.createCell(17).setCellValue(newEquipmentPowerUp);
                row.createCell(18).setCellValue(newEquipmentLinkDebugging);
                row.createCell(19).setCellValue(singleMachineDebugging);
                row.createCell(20).setCellValue(networkingDebugging);
                row.createCell(21).setCellValue(cutAccessNetwork);
                row.createCell(22).setCellValue(dilatantVeneerNumber);
                row.createCell(23).setCellValue(dilatantVeneerName);
                row.createCell(24).setCellValue(dilatantVeneerFunction);
                row.createCell(25).setCellValue(veneerPlaceEquipment);
                row.createCell(26).setCellValue(dilatantVeneerEsignQuantity);
                row.createCell(27).setCellValue(dilatantVeneerInstall);
                row.createCell(28).setCellValue(veneerCutAccessNetwork);
                row.createCell(29).setCellValue(newCableNumber);
                row.createCell(30).setCellValue(newCableType);
                row.createCell(31).setCellValue(newCableSpecificationModel);
                row.createCell(32).setCellValue(newCableLength);
                row.createCell(33).setCellValue(newCableForm);
                row.createCell(34).setCellValue(newCableTo);
                row.createCell(35).setCellValue(cableConstructionProgress);
                row.createCell(36).setCellValue(newCableMakespan);
                row.createCell(37).setCellValue(newWalkingFrameLength);
                row.createCell(38).setCellValue(walkingConstructionProgress);
                row.createCell(39).setCellValue(newWalkingFrameMakespan);
                row.createCell(40).setCellValue(newFiberOpticChannelLength);
                row.createCell(41).setCellValue(channelConstructionProgress);
                row.createCell(42).setCellValue(channelFrameMakespan);
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
