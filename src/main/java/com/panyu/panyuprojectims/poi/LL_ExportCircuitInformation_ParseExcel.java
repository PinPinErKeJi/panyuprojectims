package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.IndoorCoverageInformationService;
import com.panyu.panyuprojectims.service.LlCircuitInformationService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

//解析导入工程基本信息的工具类



public class LL_ExportCircuitInformation_ParseExcel {
//解析导入工程基本信息的方法。getCellValue


	public static void parseAndImport_LL_CircuitInformation(InputStream inputStream, String fileName, LlCircuitInformationService llCircuitInformationService){
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
					LlCircuitInformation l = new LlCircuitInformation();
					LlDesignInstitute l1 = new LlDesignInstitute();
					LlSupervisionUnit l2 = new LlSupervisionUnit();
					LlConstructionUnit l3 = new LlConstructionUnit();
					LlNewLineLength l4 = new LlNewLineLength();
					LlCableLengthDesign l5 = new LlCableLengthDesign();
					LlFloorStandOnuNew l6 = new LlFloorStandOnuNew();
					LlFloorStandOnuWorn l7 = new LlFloorStandOnuWorn();
					LlWallMountedOnuNew l8 = new LlWallMountedOnuNew();
					LlWallMountedOnuWorn l9 = new LlWallMountedOnuWorn();



					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);



					 String operator = GetCellValue.getCellValue(row, 0);//运营商
					 String buildingProject = GetCellValue.getCellValue(row, 1);//建设项目名称
					 String buildYear = GetCellValue.getCellValue(row, 2);//建设年份
					 String hopName = GetCellValue.getCellValue(row, 3);//中继段名称
					 String province = GetCellValue.getCellValue(row, 4);//省
					 String city = GetCellValue.getCellValue(row, 5);//市
					 String county = GetCellValue.getCellValue(row, 6);//区(县)
					 String area = GetCellValue.getCellValue(row, 7);//区域
					 String subordinateDepartment = GetCellValue.getCellValue(row, 8);//所属部门




					 String companyName = GetCellValue.getCellValue(row, 9);//公司名称
					 String designPersonnel = GetCellValue.getCellValue(row, 10);//设计人员

					 String siteLeader = GetCellValue.getCellValue(row, 11);//现场监理
					 String professionResponsiblePerson = GetCellValue.getCellValue(row, 12);//专业负责人
					 String districtHead = GetCellValue.getCellValue(row, 13);//区域负责人

					 String corporateName = GetCellValue.getCellValue(row, 14);//公司名称
					 String personInCharge = GetCellValue.getCellValue(row, 15);//负责人

					 String newPoleLine = GetCellValue.getCellValue(row, 16);//新建杆路
					 String newPipe = GetCellValue.getCellValue(row, 17);//新建管道
					 String directBurialOpticalCable = GetCellValue.getCellValue(row, 18);//直埋光缆
					 String pushPipe = GetCellValue.getCellValue(row, 19);//顶管

					String cableType = GetCellValue.getCellValue(row, 20);//光缆类型

					 String gystsSuspended = GetCellValue.getCellValue(row, 21);//架空光缆（附挂）
					 String gystsSuspensionWire = GetCellValue.getCellValue(row, 22);//架空光缆（加挂吊线）
					 String gysta = GetCellValue.getCellValue(row, 23);//管道光缆
					 String plowInOpticalCable = GetCellValue.getCellValue(row, 24);//直埋光缆
					 String wallCable = GetCellValue.getCellValue(row, 25);//墙壁光缆
					 String inBridgeCable = GetCellValue.getCellValue(row, 26);//桥架内光缆
					 String gyfxts = GetCellValue.getCellValue(row, 27);//路面微槽光缆

					 String newFloorStandNumber = GetCellValue.getCellValue(row, 28);//数量
					 String newFloorStandSize = GetCellValue.getCellValue(row, 29);//规格

					 String wornFloorStandNumber = GetCellValue.getCellValue(row, 30);//数量
					 String wornFloorStandSize = GetCellValue.getCellValue(row, 31);//规格

					 String newWallMountedOnuNumber = GetCellValue.getCellValue(row, 32);//数量
					 String newWallMountedOnuSize = GetCellValue.getCellValue(row, 33);//规格

					 String wornWallMountedOnuNumber = GetCellValue.getCellValue(row, 34);//数量
					 String wornWallMountedOnuSize = GetCellValue.getCellValue(row, 35);//规格




					 //数据处理（字符截取）
					//buildYear=buildYear.substring(0,4);
					//System.out.println("建设年份:"+buildYear.substring(0,4));

					//新建线路长度 数据处理
					int i11 = newPoleLine.indexOf(".");
					if(i11>0){
						String str = newPoleLine.substring(i11);
						int length = str.length();
						if(length>2){
							newPoleLine = newPoleLine.substring(0, i11+3);
						}else {
							newPoleLine = newPoleLine.substring(0, i11 + length)+"0";
						}
					}else {
						newPoleLine = newPoleLine+".00";
					}

					int i22 = newPipe.indexOf(".");
					if(i22>0){
						String str = newPipe.substring(i22);
						int length = str.length();
						if(length>2){
							newPipe = newPipe.substring(0, i22+3);
						}else {
							newPipe = newPipe.substring(0, i22 + length)+"0";
						}
					}else {
						newPipe = newPipe+".00";
					}

					int i33 = directBurialOpticalCable.indexOf(".");
					if(i33>0){
						String str = directBurialOpticalCable.substring(i33);
						int length = str.length();
						if(length>2){
							directBurialOpticalCable = directBurialOpticalCable.substring(0, i33+3);
						}else {
							directBurialOpticalCable = directBurialOpticalCable.substring(0, i33 + length)+"0";
						}
					}else {
						directBurialOpticalCable = directBurialOpticalCable+".00";
					}

					int i44 = pushPipe.indexOf(".");
					if(i44>0){
						String str = pushPipe.substring(i44);
						int length = str.length();
						if(length>2){
							pushPipe = pushPipe.substring(0, i44+3);
						}else {
							pushPipe = pushPipe.substring(0, i44 + length)+"0";
						}
					}else {
						pushPipe = pushPipe+".00";
					}

					//光缆设计皮长公里
					int i1 = gystsSuspended.indexOf(".");
					if(i1>0){
						String str = gystsSuspended.substring(i1);
						int length = str.length();
						if(length>2){
							gystsSuspended = gystsSuspended.substring(0, i1+3);
						}else {
							gystsSuspended = gystsSuspended.substring(0, i1 + length)+"0";
						}
					}else {
						gystsSuspended = gystsSuspended+".00";
					}

					int i2 = gystsSuspensionWire.indexOf(".");
					if(i2>0){
						String str = gystsSuspensionWire.substring(i2);
						int length = str.length();
						if(length>2){
							gystsSuspensionWire = gystsSuspensionWire.substring(0, i2+3);
						}else {
							gystsSuspensionWire = gystsSuspensionWire.substring(0, i2 + length)+"0";
						}
					}else {
						gystsSuspensionWire = gystsSuspensionWire+".00";
					}

					int i3 = gysta.indexOf(".");
					if(i3>0){
						String str = gysta.substring(i3);
						int length = str.length();
						if(length>2){
							gysta = gysta.substring(0, i3+3);
						}else {
							gysta = gysta.substring(0, i3 + length)+"0";
						}
					}else {
						gysta = gysta+".00";
					}

					int i4 = plowInOpticalCable.indexOf(".");
					if(i4>0){
						String str = plowInOpticalCable.substring(i4);
						int length = str.length();
						if(length>2){
							plowInOpticalCable = plowInOpticalCable.substring(0, i4+3);
						}else {
							plowInOpticalCable = plowInOpticalCable.substring(0, i4 + length)+"0";
						}
					}else {
						plowInOpticalCable = plowInOpticalCable+".00";
					}

					int i5 = wallCable.indexOf(".");
					if(i5>0){
						String str = wallCable.substring(i5);
						int length = str.length();
						if(length>2){
							wallCable = wallCable.substring(0, i5+3);
						}else {
							wallCable = wallCable.substring(0, i5 + length)+"0";
						}
					}else {
						wallCable = wallCable+".00";
					}

					int i6 = inBridgeCable.indexOf(".");
					if(i6>0){
						String str = inBridgeCable.substring(i6);
						int length = str.length();
						if(length>2){
							inBridgeCable = inBridgeCable.substring(0, i6+3);
						}else {
							inBridgeCable = inBridgeCable.substring(0, i6 + length)+"0";
						}
					}else {
						inBridgeCable = inBridgeCable+".00";
					}

					int i7 = gyfxts.indexOf(".");
					if(i7>0){
						String str = gyfxts.substring(i7);
						int length = str.length();
						if(length>2){
							gyfxts = gyfxts.substring(0, i7+3);
						}else {
							gyfxts = gyfxts.substring(0, i7 + length)+"0";
						}
					}else {
						gyfxts = gyfxts+".00";
					}


					//对属性赋值
					l.setOperator(operator);//运营商
					l.setBuildingProject(buildingProject);//建设项目名称
					l.setBuildYear(buildYear);//建设年份
					l.setHopName(hopName);//中继段名称
					l.setProvince(province);//省
					l.setCity(city);//市
					l.setCounty(county);//区(县)
					l.setArea(area);//区域
					l.setSubordinateDepartment(subordinateDepartment);//所属部门

					l.setCableType(cableType);//光缆类型

					l.setCompanyName(l1.getCompanyName());//公司名称
					l.setDesignPersonnel(l1.getDesignPersonnel());//设计人员

					l.setSiteLeader(l2.getSiteLeader());//现场监理
					l.setProfessionResponsiblePerson(l2.getProfessionResponsiblePerson());//专业负责人
					l.setDistrictHead(l2.getDistrictHead());//区域负责人

					l.setCorporateName(l3.getCorporateName());//公司名称
					l.setPersonInCharge(l3.getPersonInCharge());//负责人

					l.setNewPoleLine(l4.getNewPoleLine());//新建杆路
					l.setNewPipe(l4.getNewPipe());//新建管道
					l.setDirectBurialOpticalCable(l4.getDirectBurialOpticalCable());//直埋光缆
					l.setPushPipe(l4.getPushPipe());//顶管

					l.setGystsSuspended(l5.getGystsSuspended());//架空光缆（附挂）
					l.setGystsSuspensionWire(l5.getGystsSuspensionWire());//架空光缆（加挂吊线）
					l.setGysta(l5.getGysta());//管道光缆
					l.setPlowInOpticalCable(l5.getPlowInOpticalCable());//直埋光缆
					l.setWallCable(l5.getWallCable());//墙壁光缆
					l.setInBridgeCable(l5.getInBridgeCable());//桥架内光缆
					l.setGyfxts(l5.getGyfxts());//路面微槽光缆

					l.setNewFloorStandNumber(l6.getNewFloorStandNumber());//数量
					l.setNewFloorStandSize(l6.getNewFloorStandSize());//规格

					l.setWornFloorStandNumber(l7.getWornFloorStandNumber());//数量
					l.setWornFloorStandSize(l7.getWornFloorStandSize());//规格

					l.setNewWallMountedOnuNumber(l8.getNewWallMountedOnuNumber());//数量
					l.setNewWallMountedOnuSize(l8.getNewWallMountedOnuSize());//规格

					l.setWornWallMountedOnuNumber(l9.getWornWallMountedOnuNumber());//数量
					l.setWornWallMountedOnuSize(l9.getWornWallMountedOnuSize());//规格




					llCircuitInformationService.add( l.getCircuitInformationId(),  operator,  buildingProject,  buildYear,
							 hopName,  province,  city,  county,  area,
							 subordinateDepartment,  l1.getDesignInstituteId(),  l2.getSupervisionUnitId(),
							 l3.getConstructionUnitId(),  l4.getNewLineLengthId(),  cableType,  l5.getCableLengthDesignId(),
							 l6.getNewFloorStandId(),  l7.getWornFloorStandId(),  l8.getNewWallMountedOnuId(),
							 l9.getWornWallMountedOnuId(),  companyName,  designPersonnel,  siteLeader,
							 professionResponsiblePerson,  districtHead,  corporateName,
							 personInCharge,  newPoleLine,  newPipe,  directBurialOpticalCable,
							 pushPipe,  gystsSuspended,  gystsSuspensionWire,  gysta,
							 plowInOpticalCable,  wallCable,  inBridgeCable,  gyfxts,
							 newFloorStandNumber,  newFloorStandSize,  wornFloorStandNumber,
							 wornFloorStandSize,  newWallMountedOnuNumber,  newWallMountedOnuSize,
							 wornWallMountedOnuNumber,  wornWallMountedOnuSize);
				}

				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
