package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.CircuitDTOService;
import com.panyu.panyuprojectims.service.IndoorCoverageDTOService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

/**
 * 解析导入用户的工具类
 * @author yjl
 */
public class LL_CircuitDTO_Module_ParseExcel {
	/**
	 * 解析导入用户的方法。getCellValue
	 */
	public static void parseAndImportCircuitDTO(InputStream inputStream, String fileName, CircuitDTOService circuitDTOService){
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
					CircuitDTO circuitDTO = new CircuitDTO();
					CircuitModule circuitModule = new CircuitModule();
					CircuitSubWork circuitSubWork = new CircuitSubWork();
					CircuitInspectionProject circuitInspectionProject = new CircuitInspectionProject();
					CircuitInspectionCriterion circuitInspectionCriterion = new CircuitInspectionCriterion();

					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);
					String circuitModuleNamedto = GetCellValue.getCellValue(row, 0);
					String circuitSubWorkNamedto = GetCellValue.getCellValue(row, 1);
					String circuitProjectNamedto = GetCellValue.getCellValue(row, 2);
					String circuitCriterionNamedto = GetCellValue.getCellValue(row, 3);

					circuitDTO.setCircuitModuleNamedto(circuitModule.getCircuitModuleName());
					circuitDTO.setCircuitSubWorkNamedto(circuitSubWork.getCircuitSubWorkName());
					circuitDTO.setCircuitProjectNamedto(circuitInspectionProject.getCircuitProjectName());
					circuitDTO.setCircuitCriterionNamedto(circuitInspectionCriterion.getCircuitCriterionName());

					int i = circuitModuleNamedto.indexOf(".");
					if(i>0){
						circuitModuleNamedto = circuitModuleNamedto.substring(0, i);
					}


					int i1 = circuitSubWorkNamedto.indexOf(".");
					if(i1>0){
						circuitSubWorkNamedto = circuitSubWorkNamedto.substring(0, i1);
					}


					int i2 = circuitProjectNamedto.indexOf(".");
					if(i2>0){
						circuitProjectNamedto = circuitProjectNamedto.substring(0, i2);
					}

					int i3 = circuitCriterionNamedto.indexOf(".");
					if(i3>0){
						circuitCriterionNamedto = circuitCriterionNamedto.substring(0, i3);

					}



					boolean b = circuitDTOService.importCircuitDTO(circuitModuleNamedto, circuitSubWorkNamedto, circuitProjectNamedto, circuitCriterionNamedto);
				}
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
