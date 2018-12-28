package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.EquipmentDTO;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;


public class ExportExcelForEquipment {
	public static void createExcelOfEquipment(List<EquipmentDTO> equipmentDTOList,
			HSSFSheet sheetForAuth) {
		//System.out.println("equipmentDTOList  1:"+equipmentDTOList);
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

		EquipmentDTO equipmentDTO = new EquipmentDTO();

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (equipmentDTOList != null) {
			//    8      从集合的最高下标 递减 添加数据
			for (int i = equipmentDTOList.size() - 1; i >= 0; i--) {
				equipmentDTO = equipmentDTOList.get(i);
                String equipmentSpecialityNamedto = equipmentDTO.getEquipmentSpecialityNamedto();
				if (equipmentSpecialityNamedto != null && equipmentSpecialityNamedto.equals("null")) {
                    equipmentSpecialityNamedto = "";
				}

                String equipmentSubWorkNamedto = equipmentDTO.getEquipmentSubWorkNamedto();
				if (equipmentSubWorkNamedto !=null && equipmentSubWorkNamedto.equals("null")){
                    equipmentSubWorkNamedto = "";
                }

                String equipmentProjectNamedto = equipmentDTO.getEquipmentProjectNamedto();
                if (equipmentProjectNamedto !=null && equipmentProjectNamedto.equals("null")){
                    equipmentProjectNamedto = "";
                }

                String equipmentCriterionNamedto = equipmentDTO.getEquipmentCriterionNamedto();
				if (equipmentCriterionNamedto != null && equipmentCriterionNamedto.equals("null")){
                    equipmentCriterionNamedto = "";
                }

                String equipmentQualifieddto = equipmentDTO.getEquipmentQualifieddto();
				if (equipmentQualifieddto != null && equipmentQualifieddto.equals("null")){
				    equipmentQualifieddto = "";
                }

                String equipmentProblemdto = equipmentDTO.getEquipmentProblemdto();
                if (equipmentProblemdto !=null && equipmentProblemdto.equals("null")){
                    equipmentProblemdto = "";
                }

                String equipmentPhotodto = equipmentDTO.getEquipmentPhotodto();
                if (equipmentPhotodto != null && equipmentPhotodto.equals("null")){
                    equipmentPhotodto = "";
                }
                HSSFRow row = sheetForAuth.createRow(i + 1);
				row.createCell(0).setCellValue(equipmentSpecialityNamedto);
				row.createCell(1).setCellValue(equipmentSubWorkNamedto);
				row.createCell(2).setCellValue(equipmentProjectNamedto);
				row.createCell(3).setCellValue(equipmentCriterionNamedto);
				row.createCell(4).setCellValue(equipmentQualifieddto);
				row.createCell(5).setCellValue(equipmentProblemdto);
				row.createCell(6).setCellValue(equipmentPhotodto);
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
