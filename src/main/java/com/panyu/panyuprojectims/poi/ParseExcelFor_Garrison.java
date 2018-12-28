package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.GarrisonDTOService;
import com.panyu.panyuprojectims.service.PanyuDTOService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

/**
 * 解析导入用户的工具类
 * @author yjl
 */
public class ParseExcelFor_Garrison {
	/**
	 * 解析导入用户的方法。getCellValue
	 */
	public static void parseAndImportGarrison(InputStream inputStream, String fileName, GarrisonDTOService garrisonDTOService){
		if(fileName.toLowerCase().endsWith("xls")){
			try {
				// 将流中数据实例化为 HSSFWorkbook。
				HSSFWorkbook wb = new HSSFWorkbook(inputStream);
				// 获取sheet工作簿
				HSSFSheet sheet = wb.getSheetAt(0);
				int hang = 0;
				// 获取表中所有行
				hang = sheet.getPhysicalNumberOfRows();

				for (int h = 1; h < hang; h++) {
					//创建对象

					 GarrisonDTO garrisonDTO = new GarrisonDTO();
					 GarrisonSubWork garrisonSubWork = new GarrisonSubWork();
					 Garrison garrison = new Garrison();
					 GarrisonInspectionProject garrisonInspectionProject = new GarrisonInspectionProject();
					 GarrisonInspectionCriterion garrisonInspectionCriterion = new GarrisonInspectionCriterion();

					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);
					String garrisonNamedto = GetCellValue.getCellValue(row, 0);
					String garrisonSubWorkNamedto = GetCellValue.getCellValue(row, 1);
					String garrisonProjectNamedto = GetCellValue.getCellValue(row, 2);
					String garrisonCriterionNamedto = GetCellValue.getCellValue(row, 3);

					garrisonDTO.setGarrisonNamedto(garrison.getGarrisonName());
					garrisonDTO.setGarrisonSubWorkNamedto(garrisonSubWork.getGarrisonSubWorkName());
					garrisonDTO.setGarrisonProjectNamedto(garrisonInspectionProject.getGarrisonProjectName());
					garrisonDTO.setGarrisonCriterionNamedto(garrisonInspectionCriterion.getGarrisonCriterionName());

					int i = garrisonNamedto.indexOf(".");
					if(i>0){
						garrisonNamedto = garrisonNamedto.substring(0, i);
					}


					int i1 = garrisonSubWorkNamedto.indexOf(".");
					if(i1>0){
						garrisonSubWorkNamedto = garrisonSubWorkNamedto.substring(0, i1);
					}


					int i2 = garrisonProjectNamedto.indexOf(".");
					if(i2>0){
						garrisonProjectNamedto = garrisonProjectNamedto.substring(0, i2);
					}

					int i3 = garrisonCriterionNamedto.indexOf(".");
					if(i3>0){
						garrisonCriterionNamedto = garrisonCriterionNamedto.substring(0, i3);

					}


					boolean b = garrisonDTOService.insertDTO(garrisonNamedto, garrisonSubWorkNamedto, garrisonProjectNamedto, garrisonCriterionNamedto);
					//System.out.println(b);

				}
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
