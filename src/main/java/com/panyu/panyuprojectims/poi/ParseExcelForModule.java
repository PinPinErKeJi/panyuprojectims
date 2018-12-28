package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.PanyuDTOService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.InputStream;

/**
 * 解析导入用户的工具类
 * @author yjl
 */
public class ParseExcelForModule {
	/**
	 * 解析导入用户的方法。getCellValue
	 */
	public static void parseAndImportModule(InputStream inputStream, String fileName, PanyuDTOService panyuDTOService){
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
					Module module = new Module();
					SubWork subWork = new SubWork();
					InspectionProject inspectionProject = new InspectionProject();
					InspectionStandard inspectionStandard = new InspectionStandard();
					PanyuDTO panyuDTO = new PanyuDTO();
					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);
					String moduleNamedto = GetCellValue.getCellValue(row, 0);
					String subNamedto = GetCellValue.getCellValue(row, 1);
					String projectNamedto = GetCellValue.getCellValue(row, 2);
					String inspectionContentdto = GetCellValue.getCellValue(row, 3);


					panyuDTO.setModuleNamedto(module.getModuleName());
					panyuDTO.setSubNamedto(subWork.getSubName());
					panyuDTO.setProjectNamedto(inspectionProject.getProjectName());
					panyuDTO.setInspectionContentdto(inspectionStandard.getInspectionContent());


					int i = moduleNamedto.indexOf(".");
					if(i>0){
						moduleNamedto = moduleNamedto.substring(0, i);
					}


					int i1 = subNamedto.indexOf(".");
					if(i1>0){
						 subNamedto = subNamedto.substring(0, i1);
					}


					int i2 = projectNamedto.indexOf(".");
					if(i2>0){
						projectNamedto = projectNamedto.substring(0, i2);
					}

					int i3 = inspectionContentdto.indexOf(".");
					if(i3>0){
						inspectionContentdto = inspectionContentdto.substring(0, i3);

					}

					boolean b = panyuDTOService.insertDTO(moduleNamedto, subNamedto, projectNamedto, inspectionContentdto);
						//System.out.println("b:"+b);
				}
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
