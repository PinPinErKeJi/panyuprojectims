package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.CircuitDTO;
import com.panyu.panyuprojectims.entity.IndoorCoverageDTO;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

//导出
public class LL_Circuit_Module_ExportExcel {
	/**
	 * 备份用户的excel数据文件方法。
	 * 
	 * @param circuitDTOList
	 *            根据要清理的条件获得的用户数据信息。
	 * @param sheetForAuth
	 * 
	 *       
	 */
	public static void createExcelOfUser(List<CircuitDTO> circuitDTOList,
			HSSFSheet sheetForAuth) {
		//System.out.println("circuitDTOList 2:"+circuitDTOList);
		// 第三步，在sheet中添加表头第0行
		HSSFRow rowHead = sheetForAuth.createRow(0);
		// 第四步，创建单元格，并设置值表头 
		rowHead.createCell(0).setCellValue("模块名称");
		rowHead.createCell(1).setCellValue("分项工程");
		rowHead.createCell(2).setCellValue("检查项目");
		rowHead.createCell(3).setCellValue("标准规范");
		rowHead.createCell(4).setCellValue("是否合格");
		rowHead.createCell(5).setCellValue("问题描述");
		rowHead.createCell(6).setCellValue("完整照片");

		CircuitDTO circuitDTO = new CircuitDTO();

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (circuitDTOList != null) {
			//    8      从集合的最高下标 递减 添加数据
			for (int i = circuitDTOList.size() - 1; i >= 0; i--) {

				circuitDTO = circuitDTOList.get(i);
				String circuitModuleNamedto = circuitDTO.getCircuitModuleNamedto();
				if (circuitModuleNamedto != null && circuitModuleNamedto.equals("null")) {
					circuitModuleNamedto = "";
				}
				
                String circuitSubWorkNamedto = circuitDTO.getCircuitSubWorkNamedto();
                if (circuitSubWorkNamedto != null && circuitSubWorkNamedto.equals("null")) {
					circuitSubWorkNamedto = "";
				}

                String circuitProjectNamedto = circuitDTO.getCircuitProjectNamedto();
                if (circuitProjectNamedto != null && circuitProjectNamedto.equals("null")) {
					circuitProjectNamedto = "";
				}

                String circuitCriterionNamedto = circuitDTO.getCircuitCriterionNamedto();
                if (circuitCriterionNamedto != null && circuitCriterionNamedto.equals("null")) {
					circuitCriterionNamedto = "";
				}

                String circuitQualifieddto = circuitDTO.getCircuitQualifieddto();
                if(circuitQualifieddto!=null && circuitQualifieddto.equals("null")){
					circuitQualifieddto="";
				}

                String circuitProblemdto = circuitDTO.getCircuitProblemdto();
                if(circuitProblemdto!=null && circuitProblemdto.equals("null")){
					circuitProblemdto="";
				}

                String circuitPhotodto = circuitDTO.getCircuitPhotodto();
				if(circuitPhotodto!=null&&circuitPhotodto.equals("null")){
					circuitPhotodto="";
				}

				HSSFRow row = sheetForAuth.createRow(i + 1);
				row.createCell(0).setCellValue(circuitModuleNamedto);
				row.createCell(1).setCellValue(circuitSubWorkNamedto);
				row.createCell(2).setCellValue(circuitProjectNamedto);
				row.createCell(3).setCellValue(circuitCriterionNamedto);
				row.createCell(4).setCellValue(circuitQualifieddto);
				row.createCell(5).setCellValue(circuitProblemdto);
				row.createCell(6).setCellValue(circuitPhotodto);
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
