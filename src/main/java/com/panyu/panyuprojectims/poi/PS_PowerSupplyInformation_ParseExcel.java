package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.HnGarrisonInformationService;
import com.panyu.panyuprojectims.service.PowerSupplyInformationService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

/**
 * 解析导入工程基本信息的工具类
 * @author yjl
 */
public class PS_PowerSupplyInformation_ParseExcel {
	/**
	 * 解析导入工程基本信息的方法。getCellValue
	 */
	public static void parseAndImportPowerSupplyInformation(InputStream inputStream, String fileName, PowerSupplyInformationService powerSupplyInformationService){
		if(fileName.toLowerCase().endsWith("xls")){
			try {
				// 将流中数据实例化为 HSSFWorkbook。
				HSSFWorkbook wb = new HSSFWorkbook(inputStream);
				// 获取sheet工作簿
				HSSFSheet sheet = wb.getSheetAt(0);
				int hang = 0;
				// 获取表中所有行
				hang = sheet.getPhysicalNumberOfRows();

				for (int h = 2; h < hang; h++) {
					//创建对象
					PowerSupplyInformation powerSupplyInformation = new PowerSupplyInformation();
					PsNewEquipment psNewEquipment = new PsNewEquipment();
					PsNewPowerCable psNewPowerCable = new PsNewPowerCable();
					PsNewCablingRack psNewCablingRack = new PsNewCablingRack();
					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);

					 String operator = GetCellValue.getCellValue(row, 0);
					 String buildYear = GetCellValue.getCellValue(row, 1);
					 String buildingProject = GetCellValue.getCellValue(row, 2);
					 String motorRoomName = GetCellValue.getCellValue(row, 3);
					 String motorRoomLongitude = GetCellValue.getCellValue(row, 4);
					 String motorRoomLatitude = GetCellValue.getCellValue(row, 5);
					 String province = GetCellValue.getCellValue(row, 6);
					 String city = GetCellValue.getCellValue(row, 7);
					 String county = GetCellValue.getCellValue(row, 8);
					 String siteSupervision = GetCellValue.getCellValue(row, 9);
					 String projectLeader = GetCellValue.getCellValue(row, 10);

					 String powerEquipmentNumber = GetCellValue.getCellValue(row, 11);
					 String powerEquipmentType = GetCellValue.getCellValue(row, 12);
					 String powerEquipmentModel = GetCellValue.getCellValue(row, 13);
					 String equipmentDesignStart = GetCellValue.getCellValue(row, 14);
					 String powerEquipmentSize = GetCellValue.getCellValue(row, 15);
					 String powerEquipmentSupplier = GetCellValue.getCellValue(row, 16);
					 String powerEquipmentLinkman = GetCellValue.getCellValue(row, 17);

					 String newPowerCableNumber = GetCellValue.getCellValue(row, 18);
					 String newPowerCableModel = GetCellValue.getCellValue(row, 19);
					 String newPowerCableRow = GetCellValue.getCellValue(row, 20);
					 String powerSingleLength = GetCellValue.getCellValue(row, 21);
					 String powerTotalLength = GetCellValue.getCellValue(row, 22);
					 String beFrom = GetCellValue.getCellValue(row, 23);
					 String beTo = GetCellValue.getCellValue(row, 24);
					 String cableEquipmentSupplier = GetCellValue.getCellValue(row, 25);
					 String cableEquipmentLinkman = GetCellValue.getCellValue(row, 26);

					 String newCablingRackNumber = GetCellValue.getCellValue(row, 27);
					 String rackDesignStart = GetCellValue.getCellValue(row, 28);
					 String rackEquipmentSupplier = GetCellValue.getCellValue(row, 29);
					 String rackEquipmentLinkman = GetCellValue.getCellValue(row, 30);


					 /*数据处理（字符截取）*/
					buildYear=buildYear.substring(0,4);
					//System.out.println("建设年份:"+buildYear.substring(0,4));

					//经纬度数据处理
					//①
					int i1 = motorRoomLongitude.indexOf(".");
					//System.out.println("i1:"+i1);
					if(i1>0){
						String str = motorRoomLongitude.substring(i1);
						//System.out.println("str1:"+str);
						int length = str.length();
						//System.out.println("length1:"+length);
						if(length>6){
							motorRoomLongitude = motorRoomLongitude.substring(0, i1+7);
							//System.out.println("大于6:"+motorRoomLongitude);
						}else {
							motorRoomLongitude = motorRoomLongitude.substring(0, i1+length);
							System.out.println("小于6:"+motorRoomLongitude);
						}
					}else {
						motorRoomLongitude = motorRoomLongitude.substring(0)+".000000";
					}
					//②
					int i3 = motorRoomLatitude.indexOf(".");
					if(i3>0){
						String str = motorRoomLatitude.substring(i3);
						int length = str.length();
						if(length>6){
							motorRoomLatitude = motorRoomLatitude.substring(0, i3+7);
							//System.out.println("大于6:"+motorRoomLatitude);
						}else {
							motorRoomLatitude = motorRoomLatitude.substring(0, i3 + length);
							//System.out.println("小于6:"+motorRoomLatitude);
						}
					}else {
						motorRoomLatitude = motorRoomLatitude.substring(0)+".000000";
					}





					//②
					int i22 = powerSingleLength.indexOf(".");
					if(i22>0){
						String str = powerSingleLength.substring(i22);
						int length = str.length();
						if(length>2){
							powerSingleLength = powerSingleLength.substring(0, i22+3);
							//System.out.println("大于2:"+powerSingleLength);
						}else {
							powerSingleLength = powerSingleLength.substring(0, i22 + length);
							//System.out.println("小于2:"+powerSingleLength);
						}
					}else {
						powerSingleLength = powerSingleLength+".00";
					}

					//③
					int i33 = powerTotalLength.indexOf(".");
					if(i33>0){
						String str = powerTotalLength.substring(i33);
						int length = str.length();
						if(length>2){
							powerTotalLength = powerTotalLength.substring(0, i33+3);
							//System.out.println("大于2:"+powerTotalLength);
						}else {
							powerTotalLength = powerTotalLength.substring(0, i33 + length);
							//System.out.println("小于2:"+powerTotalLength);
						}
					}else {
						powerTotalLength = powerTotalLength+".00";
					}

					//④
					int i44 = rackDesignStart.indexOf(".");
					if(i44>0){
						String str = rackDesignStart.substring(i44);
						int length = str.length();
						if(length>2){
							rackDesignStart = rackDesignStart.substring(0, i44+3);
							//System.out.println("大于2:"+rackDesignStart);
						}else {
							rackDesignStart = rackDesignStart.substring(0, i44 + length);
							//System.out.println("小于2:"+rackDesignStart);
						}
					}else {
						rackDesignStart = rackDesignStart+".00";
					}

					/*对属性赋值*/
					powerSupplyInformation.setOperator(operator);
					powerSupplyInformation.setBuildYear(buildYear);
					powerSupplyInformation.setBuildingProject(buildingProject);
					powerSupplyInformation.setMotorRoomName(motorRoomName);
					powerSupplyInformation.setMotorRoomLongitude(motorRoomLongitude);
					powerSupplyInformation.setMotorRoomLatitude(motorRoomLatitude);
					powerSupplyInformation.setProvince(province);
					powerSupplyInformation.setCity(city);
					powerSupplyInformation.setCounty(county);
					powerSupplyInformation.setSiteSupervision(siteSupervision);
					powerSupplyInformation.setProjectLeader(projectLeader);

					powerSupplyInformation.setPowerEquipmentNumber(psNewEquipment.getPowerEquipmentNumber());
					powerSupplyInformation.setPowerEquipmentType(psNewEquipment.getPowerEquipmentType());
					powerSupplyInformation.setPowerEquipmentModel(psNewEquipment.getPowerEquipmentModel());
					powerSupplyInformation.setEquipmentDesignStart(psNewEquipment.getEquipmentDesignStart());
					powerSupplyInformation.setPowerEquipmentSize(psNewEquipment.getPowerEquipmentSize());
					powerSupplyInformation.setPowerEquipmentSupplier(psNewEquipment.getPowerEquipmentSupplier());
					powerSupplyInformation.setPowerEquipmentLinkman(psNewEquipment.getPowerEquipmentLinkman());

					powerSupplyInformation.setNewPowerCableNumber(psNewPowerCable.getNewPowerCableNumber());
					powerSupplyInformation.setNewPowerCableModel(psNewPowerCable.getNewPowerCableModel());
					powerSupplyInformation.setNewPowerCableRow(psNewPowerCable.getNewPowerCableRow());
					powerSupplyInformation.setPowerSingleLength(psNewPowerCable.getPowerSingleLength());
					powerSupplyInformation.setPowerTotalLength(psNewPowerCable.getPowerTotalLength());
					powerSupplyInformation.setBeFrom(psNewPowerCable.getBeFrom());
					powerSupplyInformation.setBeTo(psNewPowerCable.getBeTo());
					powerSupplyInformation.setCableEquipmentSupplier(psNewPowerCable.getCableEquipmentSupplier());
					powerSupplyInformation.setCableEquipmentLinkman(psNewPowerCable.getCableEquipmentLinkman());

					powerSupplyInformation.setNewCablingRackNumber(psNewCablingRack.getNewCablingRackNumber());
					powerSupplyInformation.setRackDesignStart(psNewCablingRack.getRackDesignStart());
					powerSupplyInformation.setRackEquipmentSupplier(psNewCablingRack.getRackEquipmentSupplier());
					powerSupplyInformation.setRackEquipmentLinkman(psNewCablingRack.getRackEquipmentLinkman());


					powerSupplyInformationService.addPowerSupplyInformation(
							powerSupplyInformation.getPowerInformationId(),
							operator,
							buildYear,
							buildingProject,
							motorRoomName,
							motorRoomLongitude,
							motorRoomLatitude,
							province,
							city,
							county,
							siteSupervision,
							projectLeader,
							psNewEquipment.getPowerEquipmentId(),
							psNewPowerCable.getNewPowerCableId(),
							psNewCablingRack.getNewCablingRackId(),

							powerEquipmentNumber,
							powerEquipmentType,
							powerEquipmentModel,
							equipmentDesignStart,
							powerEquipmentSize,
							powerEquipmentSupplier,
							powerEquipmentLinkman,

							newPowerCableNumber,
							newPowerCableModel,
							newPowerCableRow,
							powerSingleLength,
							powerTotalLength,
							beFrom,
							beTo,
							cableEquipmentSupplier,
							cableEquipmentLinkman,

							newCablingRackNumber,
							rackDesignStart,
							rackEquipmentSupplier,
							rackEquipmentLinkman
					);
				}

				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
