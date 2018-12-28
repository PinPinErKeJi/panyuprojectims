package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.HnGarrisonInformationService;
import com.panyu.panyuprojectims.service.IndoorCoverageInformationService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

/**
 * 解析导入工程基本信息的工具类
 * @author yjl
 */
public class IC_IndoorCoverage_ParseExcel {
	/**
	 * 解析导入工程基本信息的方法。getCellValue
	 */
	public static void parseAndImport_IC_IndoorCoverage(InputStream inputStream, String fileName, IndoorCoverageInformationService indoorCoverageInformationService){
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
					IndoorCoverageInformation in = new IndoorCoverageInformation();
					IcSupervisoryUnit ic1 = new IcSupervisoryUnit();
					IcConstructionOrganization ic2 = new IcConstructionOrganization();
					IcDesignUnit ic3 = new IcDesignUnit();
					IcBbuNumber ic4 = new IcBbuNumber();
					IcLightDistriputionNumber ic5 = new IcLightDistriputionNumber();
					IcPassiveDeviceNumber ic6 = new IcPassiveDeviceNumber();
					IcAntennaNumber ic7 = new IcAntennaNumber();
					IcCableLength ic8 = new IcCableLength();


					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);

							String operator= GetCellValue.getCellValue(row, 0);
							String buildingProject= GetCellValue.getCellValue(row, 1);
							String buildYear= GetCellValue.getCellValue(row, 2);
							String planStationName= GetCellValue.getCellValue(row, 3);
							String actualStationName= GetCellValue.getCellValue(row,4);
							String indoorLongitude= GetCellValue.getCellValue(row,5);
							String indoorLatitude= GetCellValue.getCellValue(row,6);
							String province= GetCellValue.getCellValue(row,7);
							String city= GetCellValue.getCellValue(row,8);
							String county= GetCellValue.getCellValue(row,9);
							String subordinateDepartment= GetCellValue.getCellValue(row,10);
							String coverType= GetCellValue.getCellValue(row,11);
							String professionResponsiblePerson= GetCellValue.getCellValue(row,12);
							String districtHead= GetCellValue.getCellValue(row,13);
							String siteLeader= GetCellValue.getCellValue(row,14);
							String icCorporateName= GetCellValue.getCellValue(row,15);
							String personInCharge= GetCellValue.getCellValue(row,16);
							String designCorporateName= GetCellValue.getCellValue(row,17);
							String designPersonInCharge= GetCellValue.getCellValue(row,18);
							String centralization= GetCellValue.getCellValue(row,19);
							String wallHangingWall= GetCellValue.getCellValue(row,20);
							String rruNumber= GetCellValue.getCellValue(row,21);
							String easyMacro= GetCellValue.getCellValue(row,22);
							String bookrruNotIntegratedAntenna= GetCellValue.getCellValue(row,23);
							String bookrruIntegratedAntenna= GetCellValue.getCellValue(row,24);
							String hub= GetCellValue.getCellValue(row,25);
							String pruIntegratedAntenna= GetCellValue.getCellValue(row,26);
							String pruNotIntegratedAntenna= GetCellValue.getCellValue(row,27);
							String accessUnit= GetCellValue.getCellValue(row,28);
							String extensionUnit= GetCellValue.getCellValue(row,29);
							String remoteDeviceIndoor= GetCellValue.getCellValue(row,30);
							String remoteDeviceOutdoor= GetCellValue.getCellValue(row,31);
							String powerDivider= GetCellValue.getCellValue(row,32);
							String coupler= GetCellValue.getCellValue(row,33);
							String roadConnector= GetCellValue.getCellValue(row,34);
							String loadNumber= GetCellValue.getCellValue(row,35);
							String indoorAntenna= GetCellValue.getCellValue(row,36);
							String outdoorAntenna= GetCellValue.getCellValue(row,37);
							String elevatorAntenna= GetCellValue.getCellValue(row,38);
							String gpsAntenna= GetCellValue.getCellValue(row,39);
							String networkLine= GetCellValue.getCellValue(row,40);
							String photoelectricCompositeCable= GetCellValue.getCellValue(row,41);
							String sevenEighthsFeeder= GetCellValue.getCellValue(row,42);
							String ahalfFeeder= GetCellValue.getCellValue(row,43);
							String ammeterNumber= GetCellValue.getCellValue(row,44);

					 //数据处理（字符截取）
					buildYear=buildYear.substring(0,4);
					//System.out.println("建设年份:"+buildYear.substring(0,4));

					//线缆长度数据处理
					int i1 = networkLine.indexOf(".");
					if(i1>0){
						String str = networkLine.substring(i1);
						int length = str.length();
						if(length>2){
							networkLine = networkLine.substring(0, i1+3);
							//System.out.println("大于2:"+networkLine);
						}else {
							networkLine = networkLine.substring(0, i1 + length)+"0";
							//System.out.println("小于2:"+networkLine);
						}
					}else {
						networkLine = networkLine+".00";
					}

					int i2 = photoelectricCompositeCable.indexOf(".");
					if(i2>0){
						String str = photoelectricCompositeCable.substring(i2);
						int length = str.length();
						if(length>2){
							photoelectricCompositeCable = photoelectricCompositeCable.substring(0, i2+3);
							//System.out.println("大于2:"+photoelectricCompositeCable);
						}else {
							photoelectricCompositeCable = photoelectricCompositeCable.substring(0, i2 + length)+"0";
							//System.out.println("小于2:"+photoelectricCompositeCable);
						}
					}else {
						photoelectricCompositeCable = photoelectricCompositeCable+".00";
					}
					int i3 = sevenEighthsFeeder.indexOf(".");
					if(i3>0){
						String str = sevenEighthsFeeder.substring(i3);
						int length = str.length();
						if(length>2){
							sevenEighthsFeeder = sevenEighthsFeeder.substring(0, i3+3);
							//System.out.println("大于2:"+sevenEighthsFeeder);
						}else {
							sevenEighthsFeeder = sevenEighthsFeeder.substring(0, i3 + length)+"0";
							//System.out.println("小于2:"+sevenEighthsFeeder);
						}
					}else {
						sevenEighthsFeeder = sevenEighthsFeeder+".00";
					}
					int i4 = ahalfFeeder.indexOf(".");
					if(i4>0){
						String str = ahalfFeeder.substring(i4);
						int length = str.length();
						if(length>2){
							ahalfFeeder = ahalfFeeder.substring(0, i4+3);
							//System.out.println("大于2:"+ahalfFeeder);
						}else {
							ahalfFeeder = ahalfFeeder.substring(0, i4 + length)+"0";
							//System.out.println("小于2:"+ahalfFeeder);
						}
					}else {
						ahalfFeeder = ahalfFeeder+".00";
					}

					//经纬度数据处理
					//①
					int i11 = indoorLongitude.indexOf(".");
					//System.out.println("i11:"+i11);
					if(i11>0){
						String str = indoorLongitude.substring(i11);
						//System.out.println("str1:"+str);
						int length = str.length();
						//System.out.println("length1:"+length);
						if(length>6){
							indoorLongitude = indoorLongitude.substring(0, i11+7);
							//System.out.println("大于6:"+indoorLongitude);
						}else {
							indoorLongitude = indoorLongitude.substring(0, i11+length);
							//System.out.println("小于6:"+indoorLongitude);
						}
					}else {
						indoorLongitude = indoorLongitude.substring(0)+".000000";
					}
					//②
					int i22 = indoorLatitude.indexOf(".");
					if(i22>0){
						String str = indoorLatitude.substring(i22);
						int length = str.length();
						if(length>6){
							indoorLatitude = indoorLatitude.substring(0, i22+7);
							//System.out.println("大于6:"+indoorLatitude);
						}else {
							indoorLatitude = indoorLatitude.substring(0, i22 + length);
							//System.out.println("小于6:"+indoorLatitude);
						}
					}else {
						indoorLatitude = indoorLatitude.substring(0)+".000000";
					}





					/*对属性赋值*/
					in.setOperator(operator);//运营商
					in.setBuildingProject(buildingProject);//建设项目名称
					in.setBuildYear(buildYear);//建设年份
					in.setPlanStationName(planStationName);//规划站名
					in.setActualStationName(actualStationName);//实际站名
					in.setIndoorLongitude(indoorLongitude);//经度
					in.setIndoorLatitude(indoorLatitude);//纬度
					in.setProvince(province);//省
					in.setCity(city);//市
					in.setCounty(county);//区(县)
					in.setSubordinateDepartment(subordinateDepartment);//所属部门
					in.setCoverType(coverType);//覆盖类型
					in.setProfessionResponsiblePerson(ic1.getProfessionResponsiblePerson());//专业负责人
					in.setDistrictHead(ic1.getDistrictHead());//区域负责人
					in.setSiteLeader(ic1.getSiteLeader());//现场负责人
					in.setIcCorporateName(ic2.getIcCorporateName());//公司名称
					in.setPersonInCharge(ic2.getPersonInCharge());//负责人
					in.setDesignCorporateName(ic3.getDesignCorporateName());//公司名称
					in.setDesignPersonInCharge(ic3.getDesignPersonInCharge());//负责人
					in.setCentralization(ic4.getCentralization());//集中放置
					in.setWallHangingWall(ic4.getWallHangingWall());//小区挂墙
					in.setRruNumber(rruNumber);//RRU数量
					in.setEasyMacro(ic5.getEasyMacro());//EasyMacro
					in.setBookrruNotIntegratedAntenna(ic5.getBookrruNotIntegratedAntenna());//BOOK RRU(不集成天线)
					in.setBookrruIntegratedAntenna(ic5.getBookrruIntegratedAntenna());//BOOK RRU(集成天线)
					in.setHub(ic5.getHub());//HUB
					in.setPruIntegratedAntenna(ic5.getPruIntegratedAntenna());//PRU（集成天线）
					in.setPruNotIntegratedAntenna(ic5.getPruNotIntegratedAntenna());//PRU（不集成天线）
					in.setAccessUnit(ic5.getAccessUnit());//接入单元（近端）
					in.setExtensionUnit(ic5.getExtensionUnit());//扩展单元
					in.setRemoteDeviceIndoor(ic5.getRemoteDeviceIndoor());//远端设备(室内)
					in.setRemoteDeviceOutdoor(ic5.getRemoteDeviceOutdoor());//远端设备(室外)
					in.setPowerDivider(ic6.getPowerDivider());//功分器
					in.setCoupler(ic6.getCoupler());//耦合器
					in.setRoadConnector(ic6.getRoadConnector());//合路器
					in.setLoadNumber(ic6.getLoadNumber());//负载
					in.setIndoorAntenna(ic7.getIndoorAntenna());//室内天线
					in.setOutdoorAntenna(ic7.getOutdoorAntenna());//室外天线
					in.setElevatorAntenna(ic7.getElevatorAntenna());//电梯天线
					in.setGpsAntenna(ic7.getGpsAntenna());//GPS天线
					in.setNetworkLine(ic8.getNetworkLine());//网线
					in.setPhotoelectricCompositeCable(ic8.getPhotoelectricCompositeCable());//光电复合缆
					in.setSevenEighthsFeeder(ic8.getSevenEighthsFeeder());//7/8馈线
					in.setAhalfFeeder(ic8.getAhalfFeeder());//1/2馈线
					in.setAmmeterNumber(ammeterNumber);//电表数量（端）

					indoorCoverageInformationService.add( in.getIndoorInformationId(),
							 operator,
							 buildingProject,
							 buildYear,
							 planStationName,
							 actualStationName,
							 indoorLongitude,
							 indoorLatitude,
							 province,
							 city,
							 county,
							 subordinateDepartment,
							 coverType,
							 ic1.getIcSupervisoryUnitId(),
							 ic2.getIcConstructionId(),
							 ic3.getIcDesignUnitId(),
							 ic4.getBbuNumberId(),
							 ic5.getLightNumberId(),
							 ic6.getPassiveDeviceNumberId(),
							 ic7.getAntennaNumberId(),
							 ic8.getCableLengthId(),
							 professionResponsiblePerson,
							 districtHead,
							 siteLeader,
							 icCorporateName,
							 personInCharge,
							 designCorporateName,
							 designPersonInCharge,
							 centralization,
							 wallHangingWall,
							 rruNumber,
							 easyMacro,
							 bookrruNotIntegratedAntenna,
							 bookrruIntegratedAntenna,
							 hub,
							 pruIntegratedAntenna,
							 pruNotIntegratedAntenna,
							 accessUnit,
							 extensionUnit,
							 remoteDeviceIndoor,
							 remoteDeviceOutdoor,
							 powerDivider,
							 coupler,
							 roadConnector,
							 loadNumber,
							 indoorAntenna,
							 outdoorAntenna,
							 elevatorAntenna,
							 gpsAntenna,
							 networkLine,
							 photoelectricCompositeCable,
							 sevenEighthsFeeder,
							 ahalfFeeder,
							 ammeterNumber);
				}
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
