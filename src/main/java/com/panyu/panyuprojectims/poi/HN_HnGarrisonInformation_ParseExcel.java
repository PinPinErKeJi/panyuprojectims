package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.HnGarrisonInformationService;
import com.panyu.panyuprojectims.service.ProjectProgressService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

/**
 * 解析导入工程基本信息的工具类
 * @author yjl
 */
public class HN_HnGarrisonInformation_ParseExcel {
	/**
	 * 解析导入工程基本信息的方法。getCellValue
	 */
	public static void parseAndImportHnGarrisonInformation(InputStream inputStream, String fileName, HnGarrisonInformationService hnGarrisonInformationService){
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
					HnGarrisonInformation hn = new HnGarrisonInformation();
					HnSupervisorUnit hn1 = new HnSupervisorUnit();
					HnConstructionOrganization hn2 = new HnConstructionOrganization();
					HnDesignUnit hn3 = new HnDesignUnit();
					HnPrimarySplitterNumber hn4 = new HnPrimarySplitterNumber();
					HnSecondSplitterNumber hn5 = new HnSecondSplitterNumber();
					HnPrimarySplitterBoxNumber hn6 = new HnPrimarySplitterBoxNumber();
					HnSecondSplitterBoxNumber hn7 = new HnSecondSplitterBoxNumber();
					HnCableConnectorBoxNumber hn8 = new HnCableConnectorBoxNumber();
					HnCableLength hn9 = new HnCableLength();


					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);

					 String buildingProject= GetCellValue.getCellValue(row, 0);
					 String operator= GetCellValue.getCellValue(row, 1);
					 String buildYear= GetCellValue.getCellValue(row, 2);
					 String singleProjectName= GetCellValue.getCellValue(row, 3);
					 String province= GetCellValue.getCellValue(row, 4);
					 String city= GetCellValue.getCellValue(row, 5);
					 String county= GetCellValue.getCellValue(row, 6);
					 String regionalType= GetCellValue.getCellValue(row, 7);
					 String garrisonLongitude= GetCellValue.getCellValue(row, 8);
					 String garrisonLatitude= GetCellValue.getCellValue(row, 9);
					 String constructionNature= GetCellValue.getCellValue(row, 10);
					 String ascriptionEndBureau= GetCellValue.getCellValue(row, 11);

					 String onSiteSupervision= GetCellValue.getCellValue(row, 12);
					 String professionResponsiblePerson= GetCellValue.getCellValue(row, 13);
					 String districtHead= GetCellValue.getCellValue(row, 14);

					 String constructionCorporateName= GetCellValue.getCellValue(row, 15);
					 String constructionLinkman= GetCellValue.getCellValue(row, 16);

					 String designCorporateName= GetCellValue.getCellValue(row, 17);
					 String designConstructionLinkman= GetCellValue.getCellValue(row, 18);

					 String primaryOneToFour= GetCellValue.getCellValue(row, 19);
					 String primaryOneToEight= GetCellValue.getCellValue(row, 20);
					 String primaryOneToSixteen= GetCellValue.getCellValue(row, 21);

					 String secondOneToFour= GetCellValue.getCellValue(row, 22);
					 String secondOneToEight= GetCellValue.getCellValue(row, 23);
					 String secondOneToSixteen= GetCellValue.getCellValue(row, 24);
					 String oneToThirtyTwo= GetCellValue.getCellValue(row, 25);
					 String oneToSixtyFour= GetCellValue.getCellValue(row, 26);

					 String primaryAnchorearType= GetCellValue.getCellValue(row, 27);
					 String primaryWallMounted= GetCellValue.getCellValue(row, 28);

					 String secondAnchorearType= GetCellValue.getCellValue(row, 29);
					 String secondWallMounted= GetCellValue.getCellValue(row, 30);

					 String cableFloorType= GetCellValue.getCellValue(row, 31);
					 String cableWallMounted= GetCellValue.getCellValue(row, 32);

					 String gysts= GetCellValue.getCellValue(row, 33);
					 String gysta= GetCellValue.getCellValue(row, 34);
					 String buriedServiceLightguide= GetCellValue.getCellValue(row, 35);
					 String wallCable= GetCellValue.getCellValue(row, 36);
					 String inBridgeCable= GetCellValue.getCellValue(row, 37);
					 String gyfxts= GetCellValue.getCellValue(row, 38);



					 /*数据处理（字符截取）*/
					buildYear=buildYear.substring(0,4);
					//System.out.println("建设年份:"+buildYear.substring(0,4));

					//经纬度数据处理
					//①
					int i1 = garrisonLongitude.indexOf(".");
					//System.out.println("i1:"+i1);
					if(i1>0){
						String str = garrisonLongitude.substring(i1);
						//System.out.println("str1:"+str);
						int length = str.length();
						//System.out.println("length1:"+length);
						if(length>6){
							garrisonLongitude = garrisonLongitude.substring(0, i1+7);
							//System.out.println("大于6:"+garrisonLongitude);
						}else {
							garrisonLongitude = garrisonLongitude.substring(0, i1+length);
							//System.out.println("小于6:"+garrisonLongitude);
						}
					}else {
						garrisonLongitude = garrisonLongitude.substring(0)+".000000";
					}
					//②
					int i3 = garrisonLatitude.indexOf(".");
					if(i3>0){
						String str = garrisonLatitude.substring(i3);
						int length = str.length();
						if(length>6){
							garrisonLatitude = garrisonLatitude.substring(0, i3+7);
							//System.out.println("大于6:"+garrisonLatitude);
						}else {
							garrisonLatitude = garrisonLatitude.substring(0, i3 + length);
							//System.out.println("小于6:"+garrisonLatitude);
						}
					}else {
						garrisonLatitude = garrisonLatitude.substring(0)+".000000";
					}

					//光缆线长度数据处理
					//①
					int i11 = gysts.indexOf(".");
					if(i11>0){
						String str = gysts.substring(i11);
						int length = str.length();
						if(length>2){
							gysts = gysts.substring(0, i11+3);
							//System.out.println("大于2:"+gysts);
						}else {
							gysts = gysts.substring(0, i11+length);
							//System.out.println("小于2:"+gysts);
						}
					}else {
						gysts = gysts+".00";
					}

					//②
					int i22 = gysta.indexOf(".");
					if(i22>0){
						String str = gysta.substring(i22);
						int length = str.length();
						if(length>2){
							gysta = gysta.substring(0, i22+3);
							//System.out.println("大于2:"+gysta);
						}else {
							gysta = gysta.substring(0, i22 + length);
							//System.out.println("小于2:"+gysta);
						}
					}else {
						gysta = gysta+".00";
					}

					//③
					int i33 = buriedServiceLightguide.indexOf(".");
					if(i33>0){
						String str = buriedServiceLightguide.substring(i33);
						int length = str.length();
						if(length>2){
							buriedServiceLightguide = buriedServiceLightguide.substring(0, i33+3);
							//System.out.println("大于2:"+buriedServiceLightguide);
						}else {
							buriedServiceLightguide = buriedServiceLightguide.substring(0, i33 + length);
							//System.out.println("小于2:"+buriedServiceLightguide);
						}
					}else {
						buriedServiceLightguide = buriedServiceLightguide+".00";
					}

					//④
					int i44 = wallCable.indexOf(".");
					if(i44>0){
						String str = wallCable.substring(i44);
						int length = str.length();
						if(length>2){
							wallCable = wallCable.substring(0, i44+3);
							//System.out.println("大于2:"+wallCable);
						}else {
							wallCable = wallCable.substring(0, i44 + length);
							//System.out.println("小于2:"+wallCable);
						}
					}else {
						wallCable = wallCable+".00";
					}

					//⑤
					int i55 = inBridgeCable.indexOf(".");
					if(i55>0){
						String str = inBridgeCable.substring(i55);
						int length = str.length();
						if(length>2){
							inBridgeCable = inBridgeCable.substring(0, i55+3);
							//System.out.println("大于2:"+inBridgeCable);
						}else {
							inBridgeCable = inBridgeCable.substring(0, i55 + length);
							//System.out.println("小于2:"+inBridgeCable);
						}
					}else {
						inBridgeCable = inBridgeCable+".00";
					}

					//⑥
					int i66 = gyfxts.indexOf(".");
					if(i66>0){
						String str = gyfxts.substring(i66);
						int length = str.length();
						if(length>2){
							gyfxts = gyfxts.substring(0, i66+3);
							//System.out.println("大于2:"+gyfxts);
						}else {
							gyfxts = gyfxts.substring(0, i66 + length);
							//System.out.println("小于2:"+gyfxts);
						}
					}else {
						gyfxts = gyfxts+".00";
					}



					/*对属性赋值*/
					hn.setBuildingProject(buildingProject);//建设项目名称
					hn.setOperator(operator);//运营商
					hn.setBuildYear(buildYear);//建设年份
					hn.setSingleProjectName(singleProjectName);//单项工程名称
					hn.setProvince(province);//省
					hn.setCity(city);//市
					hn.setCounty(county);//区（县）
					hn.setRegionalType(regionalType);//区域类型
					hn.setGarrisonLongitude(garrisonLongitude);//经度
					hn.setGarrisonLatitude(garrisonLatitude);//纬度
					hn.setConstructionNature(constructionNature);//建设性质
					hn.setAscriptionEndBureau(ascriptionEndBureau);//上联归属端局
					// 1.
					hn.setOnSiteSupervision(hn1.getOnSiteSupervision());//现场监理
					hn.setProfessionResponsiblePerson(hn1.getProfessionResponsiblePerson());//专业负责人
					hn.setDistrictHead(hn1.getDistrictHead());//区域负责人
					//2.
					hn.setConstructionCorporateName(hn2.getConstructionCorporateName());//公司名称
					hn.setConstructionLinkman(hn2.getConstructionLinkman());//联系人
					//3.
					hn.setDesignCorporateName(hn3.getDesignCorporateName());//公司名称
					hn.setDesignConstructionLinkman(hn3.getDesignConstructionLinkman());//联系人
					//4.
					hn.setPrimaryOneToFour(hn4.getPrimaryOneToFour());//1:4
					hn.setPrimaryOneToEight(hn4.getPrimaryOneToEight());//1:8
					hn.setPrimaryOneToSixteen(hn4.getPrimaryOneToSixteen());//1:16
					//5.
					hn.setSecondOneToFour(hn5.getSecondOneToFour());//1:4
					hn.setSecondOneToEight(hn5.getSecondOneToEight());//1:8
					hn.setSecondOneToSixteen(hn5.getSecondOneToSixteen());//1:16
					hn.setOneToThirtyTwo(hn5.getOneToThirtyTwo());//1:32
					hn.setOneToSixtyFour(hn5.getOneToSixtyFour());//1:64
					//6.
					hn.setPrimaryAnchorearType(hn6.getPrimaryAnchorearType());//抱箍式
					hn.setPrimaryWallMounted(hn6.getPrimaryWallMounted());//壁挂式
					//7.
					hn.setSecondAnchorearType(hn7.getSecondAnchorearType());//抱箍式
					hn.setSecondWallMounted(hn7.getSecondWallMounted());//壁挂式
					//8.
					hn.setCableFloorType(hn8.getCableFloorType());//落地式
					hn.setCableWallMounted(hn8.getCableWallMounted());//壁挂式
					//9.
					hn.setGysts(hn9.getGysts());//架空光缆
					hn.setGysta(hn9.getGysta());//管道光缆
					hn.setBuriedServiceLightguide(hn9.getBuriedServiceLightguide());//直埋光缆
					hn.setWallCable(hn9.getWallCable());//墙壁光缆
					hn.setInBridgeCable(hn9.getInBridgeCable());//桥架内光缆
					hn.setGyfxts(hn9.getGyfxts());//路面微槽光缆

					hnGarrisonInformationService.add( hn.getGarrisonInformationId(),
							operator,
							buildingProject,
							buildYear,
							singleProjectName,
							province,
							city,
							county,
							regionalType,
							garrisonLongitude,
							garrisonLatitude,
							constructionNature,
							ascriptionEndBureau,

							hn1.getSupervisorUnitId(),
							hn2.getConstructionOrganizationId(),
							hn3.getDesignUnitId(),
							hn4.getPrimarySplitterNumberId(),
							hn5.getSecondSplitterNumberId(),
							hn6.getPrimarySplitterBoxId(),
							hn7.getSecondSplitterBoxId(),
							hn8.getCableConnectorBoxId(),
							hn9.getCableLengthId(),
							// 1.
							onSiteSupervision,
							professionResponsiblePerson,
							districtHead,
							//2.
							constructionCorporateName,
							constructionLinkman,
							//3.
							designCorporateName,
							designConstructionLinkman,
							//4.
							primaryOneToFour,
							primaryOneToEight,
							primaryOneToSixteen,
							//5.
							secondOneToFour,
							secondOneToEight,
							secondOneToSixteen,
							oneToThirtyTwo,
							oneToSixtyFour,
							//6.
							primaryAnchorearType,
							primaryWallMounted,
							//7.
							secondAnchorearType,
							secondWallMounted,
							//8.
							cableFloorType,
							cableWallMounted,
							//9.
							gysts,
							gysta,
							buriedServiceLightguide,
							wallCable,
							inBridgeCable,
							gyfxts);
				}

				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
