package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.HnGarrisonJobProgress;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HN_ExportGarrisonJobProgressExcel {

	public static Map getMap(){
	    Map map=new HashMap();

		map.put(0,"运营商");
		map.put(1,"建设项目名称");
		map.put(2,"建设年份");
		map.put(3,"单项工程名称");
		map.put(4,"省");
		map.put(5,"市");
        map.put(6,"县（区）");
        map.put(7,"区域类型");
		map.put(8,"经度");
		map.put(9,"纬度");
		map.put(10,"建设性质");
		map.put(11,"上联归属端局");

		map.put(12,"现场监理");
		map.put(13,"专业负责人");
		map.put(14,"区域负责人");
		map.put(15,"单位名称");
		map.put(16,"负责人");
		map.put(17,"单位名称");
		map.put(18,"负责人");
		map.put(19,"分光比");
		map.put(20,"1:4");
		map.put(21,"1:8");
		map.put(22,"1:16");
		map.put(23,"分光比");
		map.put(24,"1:4");
		map.put(25,"1:8");
		map.put(26,"1:16");
		map.put(27,"1:32");
		map.put(28,"1:64");
		map.put(29,"类型");
		map.put(30,"抱箍式");
		map.put(31,"壁挂式");
		map.put(32,"类型");
		map.put(33,"抱箍式");
		map.put(34,"壁挂式");
		map.put(35,"类型");
		map.put(36,"落地式");
		map.put(37,"壁挂式");
		map.put(38,"芯数");
		map.put(39,"长度(km)");
		map.put(40,"条数");
		map.put(41,"总长度(m)");
		map.put(42,"平均长度(m)");

		return map;
	}

	static String[] GarrisonExcel= {
			"运营商","建设项目名称","建设年份",
            "单项工程名称","省","市","县（区）", "区域类型","经度","纬度","建设性质","上联归属端局",
            "监理单位","监理单位","监理单位",
            "施工单位","施工单位",
            "设计单位","设计单位",
            "一级分光器","一级分光器","一级分光器","一级分光器",
            "二级分光器","二级分光器","二级分光器","二级分光器","二级分光器","二级分光器",
            "一级分光器箱","一级分光器箱","一级分光器箱",
            "二级分光器箱","二级分光器箱","二级分光器箱",
            "光缆交接箱","光缆交接箱","光缆交接箱",
            "光缆长度统计","光缆长度统计",
            "皮线光缆长度统计", "皮线光缆长度统计","皮线光缆长度统计",
			};

	public static void createHnGarrisonJobProgressExcel(List<HnGarrisonJobProgress> hnGarrisonJobProgressList,
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
		sheet.addMergedRegion(new CellRangeAddress(0,0,19,22));
		sheet.addMergedRegion(new CellRangeAddress(0,0,23,28));
        sheet.addMergedRegion(new CellRangeAddress(0,0,29,31));
        sheet.addMergedRegion(new CellRangeAddress(0,0,32,34));
        sheet.addMergedRegion(new CellRangeAddress(0,0,35,37));
        sheet.addMergedRegion(new CellRangeAddress(0,0,38,39));
        sheet.addMergedRegion(new CellRangeAddress(0,0,40,42));

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
		for (int c = 19;c<22;c++){
			cell = row.createCell((short)c);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("一级分光器" +(c-1));
			sheet.autoSizeColumn(c);
		}
		for (int d = 23;d<28;d++){
			cell = row.createCell((short)d);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("二级分光器" +(d-1));
		}

		for (int e = 29;e<31;e++){
			cell = row.createCell((short)e);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("一级分光器箱" +(e-1));
		}
		for (int f = 32;f<34;f++){
			cell = row.createCell((short)f);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("二级分光器箱" +(f-1));
		}
		for (int g = 35;g<37;g++){
			cell = row.createCell((short)g);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("光缆交接箱" +(g-1));
		}
		for (int h = 38;h<39;h++){
			cell = row.createCell((short)h);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("光缆长度统计" +(h-1));
		}
		for (int i = 40;i<42;i++){
			cell = row.createCell((short)i);
			cell.setCellStyle(cellStyle);
			cell.setCellValue("皮线光缆长度统计" +(i-1));
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



		HnGarrisonJobProgress hnGarrisonJobProgress = new HnGarrisonJobProgress();
        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (hnGarrisonJobProgressList != null) {
			// 8 从集合的最高下标 递减 添加数据
			for (int i = hnGarrisonJobProgressList.size() - 1; i >= 0; i--) {
                hnGarrisonJobProgress = hnGarrisonJobProgressList.get(i);
                //运营商
				String operator = hnGarrisonJobProgress.getOperator();
				if (operator != null && operator.equals("null")) {
                    operator = "";
				}
				//建设项目名称
				String buildingProject = hnGarrisonJobProgress.getBuildingProject();
				if (buildingProject != null && buildingProject.equals("null")) {
					buildingProject = "";
				}
				//建设年份
                String buildYear = hnGarrisonJobProgress.getBuildYear();
                if (buildYear != null && buildYear.equals("null")) {
                    buildYear = "";
				}
                //单项工程名称
                String singleProjectName = hnGarrisonJobProgress.getSingleProjectName();
                if (singleProjectName != null && singleProjectName.equals("null")) {
					singleProjectName = "";
                }
                //省
                String province = hnGarrisonJobProgress.getProvince();
                if(province!=null&&province.equals("null")){
                    province="";
                }
                //市
                String city = hnGarrisonJobProgress.getCity();
                if(city!=null&&city.equals("null")){
                    city="";
                }
                //区（县）
                String county = hnGarrisonJobProgress.getCounty();
                if(county!=null&&county.equals("null")){
                    county="";
                }
                //区域类型
                String regionalType = hnGarrisonJobProgress.getRegionalType();
                if(regionalType!=null&&regionalType.equals("null")){
                    regionalType="";
                }
                //经度
                String garrisonLongitude = hnGarrisonJobProgress.getGarrisonLongitude();
                if(garrisonLongitude!=null&&garrisonLongitude.equals("null")){
                    garrisonLongitude="";
                }
                //纬度
                String garrisonLatitude = hnGarrisonJobProgress.getGarrisonLatitude();
                if(garrisonLatitude!=null&&garrisonLatitude.equals("null")){
                    garrisonLatitude="";
                }
                //建设性质
                String constructionNature = hnGarrisonJobProgress.getConstructionNature();
                if(constructionNature!=null&&constructionNature.equals("null")){
                    constructionNature="";
                }
                //上联归属端局
                String ascriptionEndBureau = hnGarrisonJobProgress.getAscriptionEndBureau();
                if(ascriptionEndBureau!=null&&ascriptionEndBureau.equals("null")){
                    ascriptionEndBureau="";
                }
                //现场监理
                String onSiteSupervision = hnGarrisonJobProgress.getOnSiteSupervision();
                if(onSiteSupervision!=null&&onSiteSupervision.equals("null")){
                    onSiteSupervision="";
                }
                //专业负责人
                String professionResponsiblePerson = hnGarrisonJobProgress.getProfessionResponsiblePerson();
                if(professionResponsiblePerson!=null&&professionResponsiblePerson.equals("null")){
                    professionResponsiblePerson="";
                }
                //区域负责人
                String districtHead = hnGarrisonJobProgress.getDistrictHead();
                if(districtHead!=null&&districtHead.equals("null")){
                    districtHead="";
                }
                //单位名称
                String progressCompanyName = hnGarrisonJobProgress.getProgressCompanyName();
                if(progressCompanyName!=null&&progressCompanyName.equals("null")){
                    progressCompanyName="";
                }
                //负责人
                String progressLeader = hnGarrisonJobProgress.getProgressLeader();
                if(progressLeader!=null&&progressLeader.equals("null")){
                    progressLeader="";
                }
                //单位名称
                String designCompanyName = hnGarrisonJobProgress.getDesignCompanyName();
                if(designCompanyName!=null&&designCompanyName.equals("null")){
                    designCompanyName="";
                }
                //负责人
                String designLeader = hnGarrisonJobProgress.getDesignLeader();
                if(designLeader!=null&&designLeader.equals("null")){
                    designLeader="";
                }
                //分光比
                String primarySplittingRatio = hnGarrisonJobProgress.getPrimarySplittingRatio();
                if(primarySplittingRatio!=null&&primarySplittingRatio.equals("null")){
                    primarySplittingRatio="";
                }
                //1:4
                String primaryOneToFour = hnGarrisonJobProgress.getPrimaryOneToFour();
                if(primaryOneToFour!=null&&primaryOneToFour.equals("null")){
                    primaryOneToFour="";
                }
                //1:8
                String primaryOneToEight = hnGarrisonJobProgress.getPrimaryOneToEight();
                if(primaryOneToEight!=null&&primaryOneToEight.equals("null")){
                    primaryOneToEight="";
                }
                //1:16
                String primaryOneToSixteen = hnGarrisonJobProgress.getPrimaryOneToSixteen();
                if(primaryOneToSixteen!=null&&primaryOneToSixteen.equals("null")){
                    primaryOneToSixteen="";
                }
                //分光比
                String secondSplittingRatio = hnGarrisonJobProgress.getSecondSplittingRatio();
                if(secondSplittingRatio!=null&&secondSplittingRatio.equals("null")){
                    secondSplittingRatio="";
                }
                //1:4
                String secondOneToFour = hnGarrisonJobProgress.getSecondOneToFour();
                if(secondOneToFour!=null&&secondOneToFour.equals("null")){
                    secondOneToFour="";
                }
                //1:8
                String secondOneToEight = hnGarrisonJobProgress.getSecondOneToEight();
                if(secondOneToEight!=null&&secondOneToEight.equals("null")){
                    secondOneToEight="";
                }
                //1:16
                String secondOneToSixteen = hnGarrisonJobProgress.getSecondOneToSixteen();
                if(secondOneToSixteen!=null&&secondOneToSixteen.equals("null")){
                    secondOneToSixteen="";
                }
                //1:32
                String oneToThirtyTwo = hnGarrisonJobProgress.getOneToThirtyTwo();
                if(oneToThirtyTwo!=null&&oneToThirtyTwo.equals("null")){
                    oneToThirtyTwo="";
                }
                //1:64
                String oneToSixtyFour = hnGarrisonJobProgress.getOneToSixtyFour();
                if(oneToSixtyFour!=null&&oneToSixtyFour.equals("null")){
                    oneToSixtyFour="";
                }
                //类型
                String primarySplitterBoxType = hnGarrisonJobProgress.getPrimarySplitterBoxType();
                if(primarySplitterBoxType!=null&&primarySplitterBoxType.equals("null")){
                    primarySplitterBoxType="";
                }
                //抱箍式
                String primaryAnchorearType = hnGarrisonJobProgress.getPrimaryAnchorearType();
                if(primaryAnchorearType!=null&&primaryAnchorearType.equals("null")){
                    primaryAnchorearType="";
                }
                //壁挂式
                String primaryWallMounted = hnGarrisonJobProgress.getPrimaryWallMounted();
                if(primaryWallMounted!=null&&primaryWallMounted.equals("null")){
                    primaryWallMounted="";
                }
                //类型
                String secondSplitterBoxType = hnGarrisonJobProgress.getSecondSplitterBoxType();
                if(secondSplitterBoxType!=null&&secondSplitterBoxType.equals("null")){
                    secondSplitterBoxType="";
                }
                //抱箍式
                String secondAnchorearType = hnGarrisonJobProgress.getSecondAnchorearType();
                if(secondAnchorearType!=null&&secondAnchorearType.equals("null")){
                    secondAnchorearType="";
                }
                //壁挂式
                String secondWallMounted = hnGarrisonJobProgress.getSecondWallMounted();
                if(secondWallMounted!=null&&secondWallMounted.equals("null")){
                    secondWallMounted="";
                }
                //类型
                String cableConnectorBoxType = hnGarrisonJobProgress.getCableConnectorBoxType();
                if(cableConnectorBoxType!=null&&cableConnectorBoxType.equals("null")){
                    cableConnectorBoxType="";
                }
                //落地式
                String cableFloorType = hnGarrisonJobProgress.getCableFloorType();
                if(cableFloorType!=null&&cableFloorType.equals("null")){
                    cableFloorType="";
                }
                //壁挂式
                String cableWallMounted = hnGarrisonJobProgress.getCableWallMounted();
                if(cableWallMounted!=null&&cableWallMounted.equals("null")){
                    cableWallMounted="";
                }
                //芯数
                String coreNumber = hnGarrisonJobProgress.getCoreNumber();
                if(coreNumber!=null&&coreNumber.equals("null")){
                    coreNumber="";
                }
                //长度(m)
                String cableLength = hnGarrisonJobProgress.getCableLength();
                if(cableLength!=null&&cableLength.equals("null")){
                    cableLength="";
                }
                //条数
                String numberOfBranches = hnGarrisonJobProgress.getNumberOfBranches();
                if(numberOfBranches!=null&&numberOfBranches.equals("null")){
                    numberOfBranches="";
                }
                //总长度(m)
                String totalLength = hnGarrisonJobProgress.getTotalLength();
                if(totalLength!=null&&totalLength.equals("null")){
                    totalLength="";
                }
                //平均长度(m)
                String averageLength = hnGarrisonJobProgress.getAverageLength();
                if(averageLength!=null&&averageLength.equals("null")){
                    averageLength="";
                }

                row = sheet.createRow(i + 2);
                row.createCell(0).setCellValue(operator);
                row.createCell(1).setCellValue(buildingProject);
                row.createCell(2).setCellValue(buildYear);
                row.createCell(3).setCellValue(singleProjectName);
                row.createCell(4).setCellValue(province);
                row.createCell(5).setCellValue(city);
                row.createCell(6).setCellValue(county);
                row.createCell(7).setCellValue(regionalType);
                row.createCell(8).setCellValue(garrisonLongitude);
                row.createCell(9).setCellValue(garrisonLatitude);
                row.createCell(10).setCellValue(constructionNature);
                row.createCell(11).setCellValue(ascriptionEndBureau);
                row.createCell(12).setCellValue(onSiteSupervision);
                row.createCell(13).setCellValue(professionResponsiblePerson);
                row.createCell(14).setCellValue(districtHead);
                row.createCell(15).setCellValue(progressCompanyName);
                row.createCell(16).setCellValue(progressLeader);
                row.createCell(17).setCellValue(designCompanyName);
                row.createCell(18).setCellValue(designLeader);
                row.createCell(19).setCellValue(primarySplittingRatio);
                row.createCell(20).setCellValue(primaryOneToFour);
                row.createCell(21).setCellValue(primaryOneToEight);
                row.createCell(22).setCellValue(primaryOneToSixteen);
                row.createCell(23).setCellValue(secondSplittingRatio);
                row.createCell(24).setCellValue(secondOneToFour);
                row.createCell(25).setCellValue(secondOneToEight);
                row.createCell(26).setCellValue(secondOneToSixteen);
                row.createCell(27).setCellValue(oneToThirtyTwo);
                row.createCell(28).setCellValue(oneToSixtyFour);
                row.createCell(29).setCellValue(primarySplitterBoxType);
                row.createCell(30).setCellValue(primaryAnchorearType);
                row.createCell(31).setCellValue(primaryWallMounted);
                row.createCell(32).setCellValue(secondSplitterBoxType);
                row.createCell(33).setCellValue(secondAnchorearType);
                row.createCell(34).setCellValue(secondWallMounted);
                row.createCell(35).setCellValue(cableConnectorBoxType);
                row.createCell(36).setCellValue(cableFloorType);
                row.createCell(37).setCellValue(cableWallMounted);
                row.createCell(38).setCellValue(coreNumber);
                row.createCell(39).setCellValue(cableLength);
                row.createCell(40).setCellValue(numberOfBranches);
                row.createCell(41).setCellValue(totalLength);
                row.createCell(42).setCellValue(averageLength);
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
