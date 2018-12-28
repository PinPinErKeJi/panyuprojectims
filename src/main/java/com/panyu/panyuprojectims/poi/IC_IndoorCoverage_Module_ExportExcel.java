package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.GarrisonDTO;
import com.panyu.panyuprojectims.entity.IndoorCoverageDTO;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

//导出空表格
public class IC_IndoorCoverage_Module_ExportExcel {
	/**
	 * 备份用户的excel数据文件方法。
	 * 
	 * @param indoorCoverageDTOList
	 *            根据要清理的条件获得的用户数据信息。
	 * @param sheetForAuth
	 * 
	 *       
	 */
	public static void createExcelOfUser(List<IndoorCoverageDTO> indoorCoverageDTOList,
			HSSFSheet sheetForAuth) {
		// 第三步，在sheet中添加表头第0行
		HSSFRow rowHead = sheetForAuth.createRow(0);
		// 第四步，创建单元格，并设置值表头 
		rowHead.createCell(0).setCellValue("模块名称");
		rowHead.createCell(1).setCellValue("分项工程");
		rowHead.createCell(2).setCellValue("检查项目");
		rowHead.createCell(3).setCellValue("标准规范");
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
