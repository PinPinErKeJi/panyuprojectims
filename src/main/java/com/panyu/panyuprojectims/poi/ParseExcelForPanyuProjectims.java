package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.ProjectProgressService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

/**
 * 解析导入工程基本信息的工具类
 * @author yjl
 */
public class ParseExcelForPanyuProjectims {
	/**
	 * 解析导入工程基本信息的方法。getCellValue
	 */
	public static void parseAndImportModule(InputStream inputStream, String fileName, ProjectProgressService projectProgressService){
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
					SkyBranch sb = new SkyBranch();
					MachineRoom mr = new MachineRoom();
					ElectricPower ep = new ElectricPower();
					MainEquipment me = new MainEquipment();
					AirConditioner ac = new AirConditioner();
					FireFightingDevice ffd = new FireFightingDevice();
					PowerMonitoring pm = new PowerMonitoring();
					ProjectProgress pp = new ProjectProgress();
					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);

					 String operator= GetCellValue.getCellValue(row, 0);					//运营商
					 String buildYear= GetCellValue.getCellValue(row, 1);					//建设年份
					 String buildingProject= GetCellValue.getCellValue(row, 2);             //建设项目名称
					 String planningName= GetCellValue.getCellValue(row, 3);               //规划名称
					 String actualName= GetCellValue.getCellValue(row, 4);               //实际名称
					 String planningLongitude= GetCellValue.getCellValue(row, 5);         //规划经度
					 String actualLongitude= GetCellValue.getCellValue(row, 6);           //实际经度
					 String planningLatitude= GetCellValue.getCellValue(row, 7);          //规划纬度
					 String actualLatitudes= GetCellValue.getCellValue(row, 8);           //实际纬度
					 String province= GetCellValue.getCellValue(row, 9);                   //省
					 String city= GetCellValue.getCellValue(row, 10);                       //市
					 String county= GetCellValue.getCellValue(row, 11);                   //县区
					 String regions= GetCellValue.getCellValue(row, 12);                  //区域
					 String onSiteSupervision= GetCellValue.getCellValue(row, 13);        //现场监理
					 String professionPeople= GetCellValue.getCellValue(row, 14);         //专业负责人
					 String districtHead= GetCellValue.getCellValue(row, 15);             //区域负责人
					 String overlayScene= GetCellValue.getCellValue(row, 16);             //覆盖场景
					//天支表字段
					 String constructionMode= GetCellValue.getCellValue(row, 17);         //天支建设方式
					 String basicType= GetCellValue.getCellValue(row, 18);                //基础类型
					 String foundationConstructionName= GetCellValue.getCellValue(row, 19); //基础施工单位
					 String basicUnitContacts= GetCellValue.getCellValue(row, 20);           //基础施工单位联系人
					 String skyBranchTypeName= GetCellValue.getCellValue(row, 21);      //天支类型
					 String skyBranchSupplierName= GetCellValue.getCellValue(row, 22);  //天支供货厂家
					 String skyBranchSupplierContacts= GetCellValue.getCellValue(row, 23);//天支供货厂家联系人
					 String skyBranchUnitName= GetCellValue.getCellValue(row, 24);       //天支施工单位
					 String skyConstructionUnitContacts= GetCellValue.getCellValue(row, 25);//天支施工单位联系人
					 String skyBranchHeight= GetCellValue.getCellValue(row, 26);        // 天支高度（M）
					//机房字段
					 String machineRoomConstructionMode= GetCellValue.getCellValue(row, 27);//机房建设方式
					 String machineRoomTypeName= GetCellValue.getCellValue(row, 28);         //机房类型
					 String machineRoomConstructionName= GetCellValue.getCellValue(row, 29);//土建单位
					 String civilEngineeringContacts= GetCellValue.getCellValue(row, 30);//土建单位联系人
					 String machineRoomDecorateName= GetCellValue.getCellValue(row, 31);     //装修单位
					 String decorationUnitContacts= GetCellValue.getCellValue(row, 32);//装修施工单位联系人
					//外电引入字段
					 String electricConstructionMode= GetCellValue.getCellValue(row, 33);    //外电建设方式
					 String electricType= GetCellValue.getCellValue(row, 34);                 //外电类型
					 String electricUnitName= GetCellValue.getCellValue(row, 35);            //外电施工单位
					 String electricUnitContacts= GetCellValue.getCellValue(row, 36);      //外电施工单位联系人
					//主设备字段
					 String equipmentConstructionMode= GetCellValue.getCellValue(row, 37);//主设备建设方式
					 String equipmentTypeName= GetCellValue.getCellValue(row, 38);//主设备类型
					 String equipmentSupplierName= GetCellValue.getCellValue(row, 39);//主设备供货厂家
					 String equipmentSupplierContacts= GetCellValue.getCellValue(row, 40);//主设备供货厂家联系人
					 String equipmentUnitName= GetCellValue.getCellValue(row, 41);//主设备施工单位
					 String equipmentUnitContacts= GetCellValue.getCellValue(row, 42);//主设备施工单位联系人
					//空调字段
					 String airConstructionMode= GetCellValue.getCellValue(row, 43);//空调建设方式
					 String conditioningBrandName= GetCellValue.getCellValue(row, 44);//空调品牌
					 String specificationTypeName= GetCellValue.getCellValue(row, 45);//空调规格类型
					 String airUnitName= GetCellValue.getCellValue(row, 46);//空调施工单位
					 String airConstructionContacts= GetCellValue.getCellValue(row, 47);//空调施工单位联系人
					//消防设施字段
					 String fireConstructionMode= GetCellValue.getCellValue(row, 48);//消防建设方式
					 String handHeldNumber= GetCellValue.getCellValue(row, 49);//手提式数量
					 String sprayingMethodNumber= GetCellValue.getCellValue(row, 50);//喷淋式数量
					 String fireSupplierName= GetCellValue.getCellValue(row, 51);//消防供货厂家
					 String fireSupplierContacts= GetCellValue.getCellValue(row, 52);//消防供货厂家联系人
					 String installationUnitName= GetCellValue.getCellValue(row, 53);//消防安装单位
					 String installationUnitContacts= GetCellValue.getCellValue(row, 54);//消防安装单位联系人
					//动力环境监控字段
					 String powerConstructionMode= GetCellValue.getCellValue(row, 55);//动力建设方式
					 String powerSupplierName= GetCellValue.getCellValue(row, 56);//动力供货厂家
					 String powerSupplierContacts= GetCellValue.getCellValue(row, 57);//动力供货厂家联系人
					 String powerUnitName= GetCellValue.getCellValue(row, 58);// 动力施工单位
					 String powerUnitContacts= GetCellValue.getCellValue(row, 59);

					 /*数据处理（字符截取）*/
					buildYear=buildYear.substring(0,4);
					//System.out.println("建设年份:"+buildYear.substring(0,4));

					//经纬度数据处理
					//①
					int i1 = planningLongitude.indexOf(".");
					//System.out.println("i1:"+i1);
					if(i1>0){
						String str = planningLongitude.substring(i1);
						//System.out.println("str1:"+str);
						int length = str.length();
						//System.out.println("length1:"+length);
						if(length>6){
							planningLongitude = planningLongitude.substring(0, i1+7);
							//System.out.println("大于6:"+planningLongitude);
						}else {
							planningLongitude = planningLongitude.substring(0, i1+length);
							//System.out.println("小于6:"+planningLongitude);
						}
					}else {
						planningLongitude = planningLongitude.substring(0)+".000000";
					}
					//②
					int i3 = planningLatitude.indexOf(".");
					if(i3>0){
						String str = planningLatitude.substring(i3);
						int length = str.length();
						if(length>6){
							planningLatitude = planningLatitude.substring(0, i3+7);
							//System.out.println("大于6:"+planningLatitude);
						}else {
							planningLatitude = planningLatitude.substring(0, i3 + length);
							//System.out.println("小于6:"+planningLatitude);
						}
					}else {
						planningLatitude = planningLatitude.substring(0)+".000000";
					}
					//③
					int i4 = actualLongitude.indexOf(".");
					if(i4>0){
						String str = actualLongitude.substring(i4);
						int length = str.length();
						if(length>6){
							actualLongitude = actualLongitude.substring(0, i4+7);
							//System.out.println("大于6:"+actualLongitude);
						}else {
							actualLongitude = actualLongitude.substring(0, i4 + length);
							//System.out.println("小于6:"+actualLongitude);
						}
					}else {
						actualLongitude = actualLongitude.substring(0)+".000000";
					}
					//④
					int i5 = actualLatitudes.indexOf(".");
					if(i5>0){
						String str = actualLatitudes.substring(i5);
						int length = str.length();
						if(length>6){
							actualLatitudes = actualLatitudes.substring(0, i5+7);
							//System.out.println("大于6:"+actualLatitudes);
						}else {
							actualLatitudes = actualLatitudes.substring(0, i5 + length);
							//System.out.println("小于6:"+actualLatitudes);
						}
					}else {
						actualLatitudes = actualLatitudes.substring(0)+".000000";
					}

					int i = handHeldNumber.indexOf(".");
					if(i<0){
						//System.out.println("handHeldNumber+i:"+i);
						handHeldNumber = handHeldNumber;
						//System.out.println("handHeldNumber:"+handHeldNumber);
						sprayingMethodNumber=sprayingMethodNumber;
					}else {
						//System.out.println("handHeldNumber+i:"+i);
						handHeldNumber = handHeldNumber.substring(0,i);
						//System.out.println("handHeldNumber:"+handHeldNumber);
						sprayingMethodNumber=sprayingMethodNumber.substring(0,i);
					}
					int i2 = skyBranchHeight.indexOf(".");
					if(i2>0){
						String str = skyBranchHeight.substring(i2);
						int length = str.length();
						if(length>2){
							skyBranchHeight = skyBranchHeight.substring(0, i2+3);
							//System.out.println("大于2:"+skyBranchHeight);
						}else {
							skyBranchHeight = skyBranchHeight.substring(0, i2 + length)+"0";
							//System.out.println("小于2:"+skyBranchHeight);
						}
					}else {
						skyBranchHeight = skyBranchHeight.substring(0)+".00";
					}


					/*对属性赋值*/
					pp.setOperator(operator);                    //运营商 0
					pp.setBuildYear(buildYear);         //建设年份 1
					pp.setBuildingProject(buildingProject);             //建设项目名称 2
					pp.setPlanningName(planningName);                //规划名称 3
					pp.setActualName(actualName);                  //实际名称 4
					pp.setPlanningLongitude(planningLongitude);         //规划经度 5
					pp.setActualLongitude(actualLongitude);           //实际经度 6
					pp.setPlanningLatitude(planningLatitude);          //规划纬度 7
					pp.setActualLatitudes(actualLatitudes);           //实际纬度 8
					pp.setProvince(province);                   //省 9
					pp.setCity(city);                       //市 10
					pp.setCounty(county);                    //县区  11
					pp.setRegions(regions);                   //区域 12
					pp.setOnSiteSupervision(onSiteSupervision);        //现场监理 13
					pp.setProfessionPeople(professionPeople);         //专业负责人 14
					pp.setDistrictHead(districtHead);             //区域负责人 15
					pp.setOverlayScene(overlayScene);             //覆盖场景 16
					//天支表字段
					pp.setConstructionMode(sb.getConstructionMode());         //天支建设方式 17
					pp.setBasicType(sb.getBasicType());                //基础类型 18
					pp.setFoundationConstructionName(sb.getFoundationConstructionName()); 	//基础施工单位 19
					pp.setBasicUnitContacts(sb.getBasicUnitContacts());          			//基础施工单位联系人 20
					pp.setSkyBranchTypeName(sb.getSkyBranchTypeName());     			 	//天支类型 21
					pp.setSkyBranchSupplierName(sb.getSkyBranchSupplierName()); 			//天支供货厂家 22
					pp.setSkyBranchSupplierContacts(sb.getSkyBranchSupplierContacts());		//天支供货厂家联系人 23
					pp.setSkyBranchUnitName(sb.getSkyBranchUnitName());       				//天支施工单位 24
					pp.setSkyConstructionUnitContacts(sb.getSkyConstructionUnitContacts());	//天支施工单位联系人 25
					pp.setSkyBranchHeight(sb.getSkyBranchHeight());        					// 天支高度（M）26



					//机房字段
					pp.setMachineRoomConstructionMode(mr.getMachineRoomConstructionMode());	//机房建设方式
					pp.setMachineRoomTypeName(mr.getMachineRoomTypeName());         		//机房类型
					pp.setMachineRoomConstructionName(mr.getMachineRoomConstructionName());	//土建单位
					pp.setCivilEngineeringContacts(mr.getCivilEngineeringContacts());		//土建单位联系人
					pp.setMachineRoomDecorateName(mr.getMachineRoomDecorateName());     	//装修单位
					pp.setDecorationUnitContacts(mr.getDecorationUnitContacts());			//装修施工单位联系人
					//外电引入字段
					pp.setElectricConstructionMode(ep.getElectricConstructionMode());   //外电建设方式
					pp.setElectricType(ep.getElectricType());                 			//外电类型
					pp.setElectricUnitName(ep.getElectricUnitName());            		//外电施工单位
					pp.setElectricUnitContacts(ep.getElectricUnitContacts());        	//外电施工单位联系人
					//主设备字段
					pp.setEquipmentConstructionMode(me.getEquipmentConstructionMode()); //主设备建设方式
					pp.setEquipmentTypeName(me.getEquipmentTypeName());					//主设备类型
					pp.setEquipmentSupplierName(me.getEquipmentSupplierName());			//主设备供货厂家
					pp.setEquipmentSupplierContacts(me.getEquipmentSupplierContacts()); //主设备供货厂家联系人
					pp.setEquipmentUnitName(me.getEquipmentUnitName()); 			    //主设备施工单位
					pp.setEquipmentUnitContacts(me.getEquipmentUnitContacts()); 		//主设备施工单位联系人
					//空调字段
					pp.setAirConstructionMode(ac.getAirConstructionMode());			    //空调建设方式
					pp.setConditioningBrandName(ac.getConditioningBrandName());		    //空调品牌
					pp.setSpecificationTypeName(ac.getSpecificationTypeName());      	//空调规格类型
					pp.setAirUnitName(ac.getAirUnitName());//空调施工单位
					pp.setAirConstructionContacts(ac.getAirConstructionContacts());     //空调施工单位联系人
					//消防设施字段
					pp.setFireConstructionMode(ffd.getFireConstructionMode());		   //消防建设方式
					pp.setHandHeldNumber(ffd.getHandHeldNumber());					   //手提式数量
					pp.setSprayingMethodNumber(ffd.getSprayingMethodNumber());		   //喷淋式数量

					pp.setFireSupplierName(ffd.getFireSupplierName());				   //消防供货厂家
					pp.setFireSupplierContacts(ffd.getFireSupplierContacts());		   //消防供货厂家联系人
					pp.setInstallationUnitName(ffd.getInstallationUnitName());		   //消防安装单位
					pp.setInstallationUnitContacts(ffd.getInstallationUnitContacts()); //消防安装单位联系人
					//动力环境监控字段
					pp.setPowerConstructionMode(pm.getPowerConstructionMode());        //动力建设方式
					pp.setPowerSupplierName(pm.getPowerSupplierName());                //动力供货厂家
					pp.setPowerSupplierContacts(pm.getPowerSupplierContacts());        //动力供货厂家联系人
					pp.setPowerUnitName(pm.getPowerUnitName());						   // 动力施工单位
					pp.setPowerUnitContacts(pm.getPowerUnitContacts());       		   //动力施工单位联系人




					projectProgressService.add(pp.getProjectProgressId(),powerConstructionMode,
							 powerSupplierName,  powerSupplierContacts,  powerUnitName,
							 powerUnitContacts, equipmentConstructionMode,  equipmentTypeName,
							 equipmentSupplierName,  equipmentSupplierContacts,  equipmentUnitName,
							 equipmentUnitContacts, machineRoomConstructionMode,  machineRoomTypeName,
							 machineRoomConstructionName,  civilEngineeringContacts,
							 machineRoomDecorateName,  decorationUnitContacts, fireConstructionMode,
							 handHeldNumber,
							 sprayingMethodNumber,  fireSupplierName,
							 fireSupplierContacts,  installationUnitName,  installationUnitContacts,
							 electricConstructionMode,  electricType,  electricUnitName,  electricUnitContacts,
							 airConstructionMode,  conditioningBrandName,  specificationTypeName,  airUnitName,
							 airConstructionContacts,  constructionMode,  basicType,
							 foundationConstructionName,  basicUnitContacts,  skyBranchTypeName,
							 skyBranchSupplierName,  skyBranchSupplierContacts,  skyBranchUnitName,
							 skyConstructionUnitContacts,
							 skyBranchHeight, operator,  buildYear,  buildingProject,  planningName,
							 actualName,  planningLongitude,  planningLatitude,  actualLongitude,
							 actualLatitudes,  province,  city,  county,  regions,  onSiteSupervision,
							 professionPeople,  districtHead,  overlayScene,
							sb.getSkyBranchId(),
							mr.getMachineRoomId(),
							ep.getElectricPowerId(),
							me.getMainEquipmentId(),
							ac.getAirConditionerId(),
							ffd.getFireId(),
							pm.getPowerMonitoringId());

				}

				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
