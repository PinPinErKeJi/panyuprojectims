package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.GarrisonDTO;
import com.panyu.panyuprojectims.entity.PanyuDTO;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

//导出
public class ExportExcelFor_Garrison {
	/**
	 * 备份用户的excel数据文件方法。
	 * 
	 * @param garrisonDTOList
	 *            根据要清理的条件获得的用户数据信息。
	 * @param sheetForAuth
	 * 
	 *       
	 */
	public static void createExcelOfUser(List<GarrisonDTO> garrisonDTOList,
			HSSFSheet sheetForAuth) {
		//System.out.println("garrisonDTOList 2:"+garrisonDTOList);
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

		GarrisonDTO garrisonDTO = new GarrisonDTO();

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (garrisonDTOList != null) {
			//    8      从集合的最高下标 递减 添加数据
			for (int i = garrisonDTOList.size() - 1; i >= 0; i--) {

				garrisonDTO = garrisonDTOList.get(i);
				String garrisonNamedto = garrisonDTO.getGarrisonNamedto();
				if (garrisonNamedto != null && garrisonNamedto.equals("null")) {
					garrisonNamedto = "";
				}
				
                String garrisonSubWorkNamedto = garrisonDTO.getGarrisonSubWorkNamedto();
                if (garrisonSubWorkNamedto != null && garrisonSubWorkNamedto.equals("null")) {
					garrisonSubWorkNamedto = "";
				}

                String garrisonProjectNamedto = garrisonDTO.getGarrisonProjectNamedto();
                if (garrisonProjectNamedto != null && garrisonProjectNamedto.equals("null")) {
					garrisonProjectNamedto = "";
				}

                String garrisonCriterionNamedto = garrisonDTO.getGarrisonCriterionNamedto();
                if (garrisonCriterionNamedto != null && garrisonCriterionNamedto.equals("null")) {
					garrisonCriterionNamedto = "";
				}

                String garrisonQualifieddto = garrisonDTO.getGarrisonQualifieddto();
                if(garrisonQualifieddto!=null && garrisonQualifieddto.equals("null")){
					garrisonQualifieddto="";
				}

                String garrisonProblemdto = garrisonDTO.getGarrisonProblemdto();
                if(garrisonProblemdto!=null && garrisonProblemdto.equals("null")){
					garrisonProblemdto="";
				}

                String garrisonPhotodto = garrisonDTO.getGarrisonPhotodto();
				if(garrisonPhotodto!=null&&garrisonPhotodto.equals("null")){
					garrisonPhotodto="";
				}

				HSSFRow row = sheetForAuth.createRow(i + 1);
				row.createCell(0).setCellValue(garrisonNamedto);
				row.createCell(1).setCellValue(garrisonSubWorkNamedto);
				row.createCell(2).setCellValue(garrisonProjectNamedto);
				row.createCell(3).setCellValue(garrisonCriterionNamedto);
				row.createCell(4).setCellValue(garrisonQualifieddto);
				row.createCell(5).setCellValue(garrisonProblemdto);
				row.createCell(6).setCellValue(garrisonPhotodto);
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
