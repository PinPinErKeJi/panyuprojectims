package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.EquipmentDTOService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

/**
 * 解析导入用户的工具类
 * @author yjl
 */
public class ParseExcelForEquipment {
	/**
	 * 解析导入用户的方法。getCellValue
	 */
	public static void importEquipmentExcel(InputStream inputStream, String fileName, EquipmentDTOService equipmentDTOService){
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
					EquipmentSpeciality equipmentSpeciality = new EquipmentSpeciality();
					EquipmentSubWork equipmentSubWork = new EquipmentSubWork();
					EquipmentInspectionProject equipmentInspectionProject = new EquipmentInspectionProject();
					EquipmentInspectionCriterion equipmentInspectionCriterion = new EquipmentInspectionCriterion();
					EquipmentDTO equipmentDTO = new EquipmentDTO();
					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);
					String equipmentSpecialityNamedto = GetCellValue.getCellValue(row, 0);
					String equipmentSubWorkNamedto = GetCellValue.getCellValue(row, 1);
					String equipmentProjectNamedto = GetCellValue.getCellValue(row, 2);
					String equipmentCriterionNamedto = GetCellValue.getCellValue(row, 3);


					equipmentDTO.setEquipmentSpecialityNamedto(equipmentSpeciality.getEquipmentSpecialityName());
					equipmentDTO.setEquipmentSubWorkNamedto(equipmentSubWork.getEquipmentSubWorkName());
					equipmentDTO.setEquipmentProjectNamedto(equipmentInspectionProject.getEquipmentProjectName());
					equipmentDTO.setEquipmentCriterionNamedto(equipmentInspectionCriterion.getEquipmentCriterionName());

					int i = equipmentSpecialityNamedto.indexOf(".");
					if(i>0){
						equipmentSpecialityNamedto = equipmentSpecialityNamedto.substring(0, i);
					}


					int i1 = equipmentSubWorkNamedto.indexOf(".");
					if(i1>0){
						equipmentSubWorkNamedto = equipmentSubWorkNamedto.substring(0, i1);
					}


					int i2 = equipmentProjectNamedto.indexOf(".");
					if(i2>0){
						equipmentProjectNamedto = equipmentProjectNamedto.substring(0, i2);
					}

					int i3 = equipmentCriterionNamedto.indexOf(".");
					if(i3>0){
						equipmentCriterionNamedto = equipmentCriterionNamedto.substring(0, i3);

					}

					equipmentDTOService.importEquipmentExcel(equipmentSpecialityNamedto,equipmentSubWorkNamedto,equipmentProjectNamedto,equipmentCriterionNamedto);
				}
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
