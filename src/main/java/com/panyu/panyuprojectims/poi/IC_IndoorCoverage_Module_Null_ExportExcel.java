package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.GarrisonDTO;
import com.panyu.panyuprojectims.entity.IndoorCoverageDTO;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

//导出
public class IC_IndoorCoverage_Module_Null_ExportExcel {
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
		//System.out.println("indoorCoverageDTOList 2:"+indoorCoverageDTOList);
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

		IndoorCoverageDTO indoorCoverageDTO = new IndoorCoverageDTO();

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (indoorCoverageDTOList != null) {
			//    8      从集合的最高下标 递减 添加数据
			for (int i = indoorCoverageDTOList.size() - 1; i >= 0; i--) {

				indoorCoverageDTO = indoorCoverageDTOList.get(i);
				String indoorCoverageNamedto = indoorCoverageDTO.getIndoorCoverageNamedto();
				if (indoorCoverageNamedto != null && indoorCoverageNamedto.equals("null")) {
					indoorCoverageNamedto = "";
				}
				
                String indoorSubWorkNamedto = indoorCoverageDTO.getIndoorSubWorkNamedto();
                if (indoorSubWorkNamedto != null && indoorSubWorkNamedto.equals("null")) {
					indoorSubWorkNamedto = "";
				}

                String indoorProjectNamedto = indoorCoverageDTO.getIndoorProjectNamedto();
                if (indoorProjectNamedto != null && indoorProjectNamedto.equals("null")) {
					indoorProjectNamedto = "";
				}

                String indoorSpecificationNamedto = indoorCoverageDTO.getIndoorSpecificationNamedto();
                if (indoorSpecificationNamedto != null && indoorSpecificationNamedto.equals("null")) {
					indoorSpecificationNamedto = "";
				}

                String indoorQualifieddto = indoorCoverageDTO.getIndoorQualifieddto();
                if(indoorQualifieddto!=null && indoorQualifieddto.equals("null")){
					indoorQualifieddto="";
				}

                String indoorProblemdto = indoorCoverageDTO.getIndoorProblemdto();
                if(indoorProblemdto!=null && indoorProblemdto.equals("null")){
					indoorProblemdto="";
				}

                String indoorPhotodto = indoorCoverageDTO.getIndoorPhotodto();
				if(indoorPhotodto!=null&&indoorPhotodto.equals("null")){
					indoorPhotodto="";
				}

				HSSFRow row = sheetForAuth.createRow(i + 1);
				row.createCell(0).setCellValue(indoorCoverageNamedto);
				row.createCell(1).setCellValue(indoorSubWorkNamedto);
				row.createCell(2).setCellValue(indoorProjectNamedto);
				row.createCell(3).setCellValue(indoorSpecificationNamedto);
				row.createCell(4).setCellValue(indoorQualifieddto);
				row.createCell(5).setCellValue(indoorProblemdto);
				row.createCell(6).setCellValue(indoorPhotodto);
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
