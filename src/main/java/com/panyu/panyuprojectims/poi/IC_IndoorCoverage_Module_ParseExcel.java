package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.GarrisonDTOService;
import com.panyu.panyuprojectims.service.IndoorCoverageDTOService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

/**
 * 解析导入用户的工具类
 * @author yjl
 */
public class IC_IndoorCoverage_Module_ParseExcel {
	/**
	 * 解析导入用户的方法。getCellValue
	 */
	public static void parseAndImportIndoorCoverage(InputStream inputStream, String fileName, IndoorCoverageDTOService indoorCoverageDTOService){
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

					IndoorCoverageDTO indoorCoverageDTO = new IndoorCoverageDTO();
					IndoorCoverageModule indoorCoverageModule = new IndoorCoverageModule();
					IndoorCoverageSubWork indoorCoverageSubWork = new IndoorCoverageSubWork();
					IndoorCoverageProject indoorCoverageProject = new IndoorCoverageProject();
					IndoorCoverageSpecification indoorCoverageSpecification = new IndoorCoverageSpecification();


					// 获取当前行数据
					HSSFRow row = sheet.getRow(h);
					String indoorCoverageNamedto = GetCellValue.getCellValue(row, 0);
					String indoorSubWorkNamedto = GetCellValue.getCellValue(row, 1);
					String indoorProjectNamedto = GetCellValue.getCellValue(row, 2);
					String indoorSpecificationNamedto = GetCellValue.getCellValue(row, 3);

					indoorCoverageDTO.setIndoorCoverageNamedto(indoorCoverageModule.getIndoorCoverageName());
					indoorCoverageDTO.setIndoorSubWorkNamedto(indoorCoverageSubWork.getIndoorSubWorkName());
					indoorCoverageDTO.setIndoorProjectNamedto(indoorCoverageProject.getIndoorProjectName());
					indoorCoverageDTO.setIndoorSpecificationNamedto(indoorCoverageSpecification.getIndoorSpecificationName());

					int i = indoorCoverageNamedto.indexOf(".");
					if(i>0){
						indoorCoverageNamedto = indoorCoverageNamedto.substring(0, i);
					}


					int i1 = indoorSubWorkNamedto.indexOf(".");
					if(i1>0){
						indoorSubWorkNamedto = indoorSubWorkNamedto.substring(0, i1);
					}


					int i2 = indoorProjectNamedto.indexOf(".");
					if(i2>0){
						indoorProjectNamedto = indoorProjectNamedto.substring(0, i2);
					}

					int i3 = indoorSpecificationNamedto.indexOf(".");
					if(i3>0){
						indoorSpecificationNamedto = indoorSpecificationNamedto.substring(0, i3);
					}


					boolean b = indoorCoverageDTOService.insertDTO(indoorCoverageNamedto, indoorSubWorkNamedto, indoorProjectNamedto, indoorSpecificationNamedto);
					//System.out.println("b:"+b);
				}
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
