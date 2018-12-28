package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.PowerSupplyProgress;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PS_ExportPowerSupplyProgress_Excel {

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
        map.put(14,"尺寸");
        map.put(15,"施工进度");
        map.put(16,"到货时间");
        map.put(17,"安装时间");
        map.put(18,"加电时间");

        map.put(19,"编号");
        map.put(20,"型号");
        map.put(21,"长度(m)");
        map.put(22,"From:");
        map.put(23,"To:");
        map.put(24,"施工进度");
        map.put(25,"完工时间");

        map.put(26,"编号");
        map.put(27,"长度");
        map.put(28,"施工进度");
        map.put(29,"完工时间");

        return map;
    }
    static String[] excelSecond= {
            "运营商","建设年份","建设项目名称",
            "机房名称","机房经度","机房纬度","省", "市",
            "区(县)","现场监理","项目负责人",
            "新增设备","新增设备","新增设备","新增设备","新增设备","新增设备","新增设备","新增设备",
            "新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆","新增电力电缆"
            ,"新增走线架","新增走线架","新增走线架","新增走线架"
    };

	public static void createPowerSupplyProgressExcel(List<PowerSupplyProgress> powerSupplyProgressList,
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
        sheet.addMergedRegion(new CellRangeAddress(0,0,26,29));

        row = sheet.createRow(1);
        for (int a = 10;a<18;a++){
            cell = row.createCell((short)a);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("新增设备" +(a-1));
            sheet.autoSizeColumn(a);
        }
        for (int b = 18;b<25;b++){
            cell = row.createCell((short)b);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("新增电力电缆" +(b-1));
            sheet.autoSizeColumn(b);
        }
        for (int c = 25;c<29;c++){
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

        PowerSupplyProgress powerSupplyProgress = new PowerSupplyProgress();
        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (powerSupplyProgressList != null) {
			// 8 从集合的最高下标 递减 添加数据
			for (int i = powerSupplyProgressList.size() - 1; i >= 0; i--) {
                powerSupplyProgress = powerSupplyProgressList.get(i);
                //1.运营商
				String operator = powerSupplyProgress.getOperator();
				if (operator != null && operator.equals("null")) {
                    operator = "";
				}
                //2.建设年份
                String buildYear = powerSupplyProgress.getBuildYear();
                if (buildYear != null && buildYear.equals("null")) {
                   buildYear = "";
                }
                //3.建设项目名称
                String buildingProject = powerSupplyProgress.getBuildingProject();
                if (buildingProject != null && buildingProject.equals("null")) {
                    buildingProject = "";
                }
                //4.机房名称
                String motorRoomName = powerSupplyProgress.getMotorRoomName();
                if (motorRoomName != null && motorRoomName.equals("null")) {
                    motorRoomName = "";
				}
				//5.机房经度
                String motorRoomLongitude = powerSupplyProgress.getMotorRoomLongitude();
                if(motorRoomLongitude!=null&&motorRoomLongitude.equals("null")){
                    motorRoomLongitude="";
                }
                //6.机房纬度
                String motorRoomLatitude = powerSupplyProgress.getMotorRoomLatitude();
                if(motorRoomLatitude!=null&&motorRoomLatitude.equals("null")){
                    motorRoomLatitude="";
                }
                //7.省
                String province = powerSupplyProgress.getProvince();
                if(province!=null && province.equals("null")){
                    province="";
				}
				//8.市
                String city = powerSupplyProgress.getCity();
                if(city!=null && city.equals("null")){
                    city="";
				}
				//9.区（县）
                String county = powerSupplyProgress.getCounty();
                if(county!=null && county.equals("null")){
                    county="";
                }
                //10.现场监理
                String siteSupervision = powerSupplyProgress.getSiteSupervision();
                if(siteSupervision!=null&&siteSupervision.equals("null")){
                    siteSupervision="";
                }
                //11.项目负责人
                String projectLeader = powerSupplyProgress.getProjectLeader();
                if(projectLeader!=null&&projectLeader.equals("null")){
                    projectLeader="";
                }
                //12.编号
                String progressEquipmentNumber = powerSupplyProgress.getProgressEquipmentNumber();
                if(progressEquipmentNumber!=null&&progressEquipmentNumber.equals("null")){
                    progressEquipmentNumber="";
                }
                //13.类型
                String progressEquipmentType = powerSupplyProgress.getProgressEquipmentType();
                if(progressEquipmentType!=null&&progressEquipmentType.equals("null")){
                    progressEquipmentType="";
                }
                //14.型号
                String progressEquipmentModel = powerSupplyProgress.getProgressEquipmentModel();
                if(progressEquipmentModel!=null&&progressEquipmentModel.equals("null")){
                    progressEquipmentModel="";
                }
                //15.尺寸
                String progressEquipmentSize = powerSupplyProgress.getProgressEquipmentSize();
                if(progressEquipmentSize!=null&&progressEquipmentSize.equals("null")){
                    progressEquipmentSize="";
                }
                //16.施工进度
                String constructionProgress = powerSupplyProgress.getConstructionProgress();
                if(constructionProgress!=null&&constructionProgress.equals("null")){
                    constructionProgress="";
                }
                //17.到货时间
                String equipmentArrivalTime = powerSupplyProgress.getEquipmentArrivalTime();
                if(equipmentArrivalTime!=null&&equipmentArrivalTime.equals("null")){
                    equipmentArrivalTime="";
                }
                //18.安装时间
                String installationTime = powerSupplyProgress.getInstallationTime();
                if(installationTime!=null&&installationTime.equals("null")){
                    installationTime="";
                }
                //19.加电时间
                String chargingTime = powerSupplyProgress.getChargingTime();
                if(chargingTime!=null&&chargingTime.equals("null")){
                    chargingTime="";
                }
                //20.编号
                String progressPowerCableNumber = powerSupplyProgress.getProgressPowerCableNumber();
                if(progressPowerCableNumber!=null&&progressPowerCableNumber.equals("null")){
                    progressPowerCableNumber="";
                }
                //21.型号
                String progressPowerCableModel = powerSupplyProgress.getProgressPowerCableModel();
                if(progressPowerCableModel!=null&&progressPowerCableModel.equals("null")){
                    progressPowerCableModel="";
                }
                //22.长度（m）
                String progressPowerLength = powerSupplyProgress.getProgressPowerLength();
                if(progressPowerLength!=null&&progressPowerLength.equals("null")){
                    progressPowerLength="";
                }
                //23.From
                String beFrom = powerSupplyProgress.getBeFrom();
                if(beFrom!=null&&beFrom.equals("null")){
                    beFrom="";
                }
                //24.To
                String beTo = powerSupplyProgress.getBeTo();
                if(beTo!=null&&beTo.equals("null")){
                    beTo="";
                }
                //25.施工进度
                String constructionSchedule = powerSupplyProgress.getConstructionSchedule();
                if(constructionSchedule!=null&&constructionSchedule.equals("null")){
                    constructionSchedule="";
                }
                //26.完工时间
                String powerCableMakespan = powerSupplyProgress.getPowerCableMakespan();
                if(powerCableMakespan!=null&&powerCableMakespan.equals("null")){
                    powerCableMakespan="";
                }
                //27.编号
                String progressCablingRackNumber = powerSupplyProgress.getProgressCablingRackNumber();
                if(progressCablingRackNumber!=null&&progressCablingRackNumber.equals("null")){
                    progressCablingRackNumber="";
                }
                //28.长度
                String progressRackLength = powerSupplyProgress.getProgressRackLength();
                if(progressRackLength!=null&&progressRackLength.equals("null")){
                    progressRackLength="";
                }
                //29.施工进度
                String rackConstructionProgress = powerSupplyProgress.getRackConstructionProgress();
                if(rackConstructionProgress!=null&&rackConstructionProgress.equals("null")){
                    rackConstructionProgress="";
                }
                //30.完工时间
                String cablingRackMakespan = powerSupplyProgress.getCablingRackMakespan();
                if(cablingRackMakespan!=null&&cablingRackMakespan.equals("null")){
                    cablingRackMakespan="";
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
                row.createCell(9).setCellValue(siteSupervision);
                row.createCell(10).setCellValue(projectLeader);
                row.createCell(11).setCellValue(progressEquipmentNumber);
                row.createCell(12).setCellValue(progressEquipmentType);
                row.createCell(13).setCellValue(progressEquipmentModel);
                row.createCell(14).setCellValue(progressEquipmentSize);
                row.createCell(15).setCellValue(constructionProgress);
                row.createCell(16).setCellValue(equipmentArrivalTime);
                row.createCell(17).setCellValue(installationTime);
                row.createCell(18).setCellValue(chargingTime);
                row.createCell(19).setCellValue(progressPowerCableNumber);
                row.createCell(20).setCellValue(progressPowerCableModel);
                row.createCell(21).setCellValue(progressPowerLength);
                row.createCell(22).setCellValue(beFrom);
                row.createCell(23).setCellValue(beTo);
                row.createCell(24).setCellValue(constructionSchedule);
                row.createCell(25).setCellValue(powerCableMakespan);
                row.createCell(26).setCellValue(progressCablingRackNumber);
                row.createCell(27).setCellValue(progressRackLength);
                row.createCell(28).setCellValue(rackConstructionProgress);
                row.createCell(29).setCellValue(cablingRackMakespan);
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
