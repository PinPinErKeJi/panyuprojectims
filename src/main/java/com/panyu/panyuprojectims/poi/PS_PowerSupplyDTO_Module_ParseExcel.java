package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.CircuitDTOService;
import com.panyu.panyuprojectims.service.PowerSupplyDTOService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

/**
 * 解析导入用户的工具类
 * @author yjl
 */
public class PS_PowerSupplyDTO_Module_ParseExcel {
	/**
	 * 解析导入用户的方法。getCellValue
	 */
	public static void parseAndImportPowerSupplyDTO(InputStream inputStream, String fileName, PowerSupplyDTOService powerSupplyDTOService){
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
					PowerSupplyDTO powerSupplyDTO = new PowerSupplyDTO();
					PowerSupplyModule powerSupplyModule = new PowerSupplyModule();
					PowerSubWork powerSubWork = new PowerSubWork();
					PowerSupplyProject powerSupplyProject = new PowerSupplyProject();
					PowerSupplyCriterion powerSupplyCriterion = new PowerSupplyCriterion();

					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);
					String powerModuleName = GetCellValue.getCellValue(row, 0);
					String powerSubWorkName = GetCellValue.getCellValue(row, 1);
					String powerProjectName = GetCellValue.getCellValue(row, 2);
					String powerCriterionName = GetCellValue.getCellValue(row, 3);

					powerSupplyDTO.setPowerModuleName(powerSupplyModule.getPowerModuleName());
					powerSupplyDTO.setPowerSubWorkName(powerSubWork.getPowerSubWorkName());
					powerSupplyDTO.setPowerProjectName(powerSupplyProject.getPowerProjectName());
					powerSupplyDTO.setPowerCriterionName(powerSupplyCriterion.getPowerCriterionName());

					int i = powerModuleName.indexOf(".");
					if(i>0){
						powerModuleName = powerModuleName.substring(0, i);
					}


					int i1 = powerSubWorkName.indexOf(".");
					if(i1>0){
						powerSubWorkName = powerSubWorkName.substring(0, i1);
					}


					int i2 = powerProjectName.indexOf(".");
					if(i2>0){
						powerProjectName = powerProjectName.substring(0, i2);
					}

					int i3 = powerCriterionName.indexOf(".");
					if(i3>0){
						powerCriterionName = powerCriterionName.substring(0, i3);

					}



					boolean b = powerSupplyDTOService.importPowerSupplyDTO(powerModuleName, powerSubWorkName, powerProjectName, powerCriterionName);
				}
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
