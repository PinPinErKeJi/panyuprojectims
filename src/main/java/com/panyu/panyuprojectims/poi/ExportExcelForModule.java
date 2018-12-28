package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.PanyuDTO;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

//导出
public class ExportExcelForModule {
	/**
	 * 备份用户的excel数据文件方法。
	 * 
	 * @param panyuDTOList
	 *            根据要清理的条件获得的用户数据信息。
	 * @param sheetForAuth
	 * 
	 *       
	 */
	public static void createExcelOfUser(List<PanyuDTO> panyuDTOList,
			HSSFSheet sheetForAuth) {
		//System.out.println("panyuDTOList 2:"+panyuDTOList);
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

		PanyuDTO panyuDTO = new PanyuDTO();

        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，
		if (panyuDTOList != null) {
			//    8      从集合的最高下标 递减 添加数据
			for (int i = panyuDTOList.size() - 1; i >= 0; i--) {

				panyuDTO = panyuDTOList.get(i);
				String moduleNamedto = panyuDTO.getModuleNamedto();
				if (moduleNamedto != null && moduleNamedto.equals("null")) {
                    moduleNamedto = "";
				}
				
                String subNamedto = panyuDTO.getSubNamedto();
                if (subNamedto != null && subNamedto.equals("null")) {
                    subNamedto = "";
				}

                String projectNamedto = panyuDTO.getProjectNamedto();
                if (projectNamedto != null && projectNamedto.equals("null")) {
                    projectNamedto = "";
				}

                String inspectionContentdto = panyuDTO.getInspectionContentdto();
                if (inspectionContentdto != null && inspectionContentdto.equals("null")) {
                    inspectionContentdto = "";
				}

                String qualifieddto = panyuDTO.getQualifieddto();
                if(qualifieddto!=null && qualifieddto.equals("null")){
                    qualifieddto="";
				}

                String problemDescriptiondto = panyuDTO.getProblemDescriptiondto();
                if(problemDescriptiondto!=null && problemDescriptiondto.equals("null")){
                    problemDescriptiondto="";
				}

                String photodto = panyuDTO.getPhotodto();
				if(photodto!=null&&photodto.equals("null")){
                    photodto="";
				}

				HSSFRow row = sheetForAuth.createRow(i + 1);
				row.createCell(0).setCellValue(moduleNamedto);
				row.createCell(1).setCellValue(subNamedto);
				row.createCell(2).setCellValue(projectNamedto);
				row.createCell(3).setCellValue(inspectionContentdto);
				row.createCell(4).setCellValue(qualifieddto);
				row.createCell(5).setCellValue(problemDescriptiondto);
				row.createCell(6).setCellValue(photodto);
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
