package com.panyu.panyuprojectims.poi;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class GetCellValue {
	
	/**
	 * 获取工作薄sheet单元格中的值
	 * （2003版本取值）
	 * @param row
	 * @param cellNum
	 * @return
	 * @author lx
	 */
	public static String getCellValue(HSSFRow row,int cellNum){
		
		Cell cell = row.getCell(cellNum);
		
		if(cell == null){
			return null;
		}
		
		switch(cell.getCellType()){
		
			case Cell.CELL_TYPE_BLANK:
				return null;
				
			case Cell.CELL_TYPE_STRING:
				return cell.getStringCellValue();
				
			case Cell.CELL_TYPE_BOOLEAN:
				return cell.getBooleanCellValue()+"";
				
			case Cell.CELL_TYPE_NUMERIC:
				return cell.getNumericCellValue()+"";
				
			default:
				return null;
		}
	}
	
	/**
	 * 获取工作薄sheet单元格中的值
	 * (重载，用于2007版本)
	 * @param row
	 * @param cellNum
	 * @return
	 * @author lx
	 */
	public static String getCellValue(XSSFRow row,int cellNum){
		
		Cell cell = row.getCell(cellNum);
		
		if(cell == null){
			return null;
		}
		
		switch(cell.getCellType()){
			
			case Cell.CELL_TYPE_BLANK:
				return null;
			
			case Cell.CELL_TYPE_STRING:
				return cell.getStringCellValue();
			
			case Cell.CELL_TYPE_BOOLEAN:
				return cell.getBooleanCellValue()+"";
			
			case Cell.CELL_TYPE_FORMULA:
				return cell.getNumericCellValue()+"";
			
			default:
				return null;
		}
	}
}
