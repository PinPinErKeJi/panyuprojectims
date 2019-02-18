package com.panyu.panyuprojectims.controller.FA_controller.photo_controller;

import com.panyu.panyuprojectims.entity.EquipmentInspectionProject;
import com.panyu.panyuprojectims.entity.EquipmentPhotoResources;
import com.panyu.panyuprojectims.service.EquipmentInspectionProjectService;
import com.panyu.panyuprojectims.service.EquipmentPhotoResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

@Controller
@RequestMapping("FA")
public class EquipmentPhotoResourcesController {

    @Autowired
    private EquipmentPhotoResourcesService equipmentPhotoResourcesService;
    @Autowired
    private EquipmentInspectionProjectService equipmentInspectionProjectService;





    //根据点击检查项目展示图片信息
    @RequestMapping("selectAllPhotoResourcesByModuleIdAndSubId")
    public @ResponseBody
    List<EquipmentInspectionProject> selectAllPhotoResourcesByModuleIdAndSubId(String equipmentSpecialityId, String equipmentSubWorkId,String equipmentInformationId) {
        List<String> selectAllEquipmentProjectIdList = equipmentPhotoResourcesService.selectEquipmentInspectionProjectList(equipmentSpecialityId,equipmentSubWorkId);
        List<EquipmentInspectionProject> equipmentInspectionProjectList = new ArrayList<EquipmentInspectionProject>();
        for (String equipmentProjectId : selectAllEquipmentProjectIdList) {
            List<String> photoResourcesList = equipmentPhotoResourcesService.selectEquipmentPhotoResourcesIds(equipmentProjectId,equipmentInformationId);
            List<EquipmentPhotoResources> equipmentPhotoResourcesList = new ArrayList<EquipmentPhotoResources>();
            for (String equipmentPhotoId : photoResourcesList) {
                EquipmentPhotoResources equipmentPhotoResources = new EquipmentPhotoResources();
                EquipmentPhotoResources photoResources = equipmentPhotoResourcesService.selectEquipmentPhotoResourcesById(equipmentPhotoId, equipmentProjectId,equipmentInformationId);
                //System.out.println("图片资源:"+photoResources);
                equipmentPhotoResources.setEquipmentPhotoName(photoResources.getEquipmentPhotoName());
                equipmentPhotoResources.setPhotoUploadPeople(photoResources.getPhotoUploadPeople());
                equipmentPhotoResources.setQualified(photoResources.getQualified());
                equipmentPhotoResources.setProblemDescription(photoResources.getProblemDescription());
                equipmentPhotoResourcesList.add(equipmentPhotoResources);
            }
            EquipmentInspectionProject equipmentInspectionProject = new EquipmentInspectionProject();
            EquipmentInspectionProject project= equipmentInspectionProjectService.selectEquipmentInspectionProjectByName(equipmentProjectId);
            equipmentInspectionProject.setEquipmentProjectId(equipmentProjectId);
            equipmentInspectionProject.setEquipmentProjectName(project.getEquipmentProjectName());
            equipmentInspectionProject.setEquipmentCriterionName(project.getEquipmentCriterionName());
            equipmentInspectionProject.setEquipmentPhotoResourcesList(equipmentPhotoResourcesList);
            equipmentInspectionProjectList.add(equipmentInspectionProject);
        }
        return equipmentInspectionProjectList;
    }

    //添加图片
    @RequestMapping("insertEquipmentPhotoResources")
    public @ResponseBody long insertEquipmentPhotoResources(HttpServletRequest request,
                                                            MultipartFile[] uploadFile,
                                                            EquipmentPhotoResources equipmentPhotoResources,
                                                            String equipmentProjectId,
                                                            String equipmentInformationId){
        //文件目录地址，年月作为文件夹名称
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) +1;
        int day = calendar.get(Calendar.DATE);

        String yearloadTargetPath = year+ "/";
        String mothloadTargetPath =month+ "/";
        String dayloadTargetPath =day+ "/";
        String uploadTargetPath =  yearloadTargetPath + mothloadTargetPath +dayloadTargetPath+ "/";

        int i = 0;
        long countEquipmentPhotoResourcesByParentId = equipmentPhotoResourcesService.getCountEquipmentPhotoResourcesByParentId(equipmentProjectId);
        try {
            if (uploadFile!=null) {
                for (MultipartFile multipartFile : uploadFile) {
                    String fileName = multipartFile.getOriginalFilename();
                    //System.out.println(fileName);
                    String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
                    Date d = new Date();
                    String newFileName = replaceAll + "" + d.getTime() + "" + fileName;

                    if (countEquipmentPhotoResourcesByParentId < 6) {
                        File file = new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo\\FA"+"\\"+uploadTargetPath);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        multipartFile.transferTo(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo\\FA"+"\\"+uploadTargetPath+"/" + newFileName));
                        String finalFileName = newFileName;
                        equipmentPhotoResources.setEquipmentPhotoName("\\photo\\FA"+"\\"+uploadTargetPath+"/"+finalFileName);
                        equipmentPhotoResources.setEquipmentInformationId(equipmentInformationId);
                        equipmentPhotoResources.setEquipmentProjectId(equipmentProjectId);
                        i = equipmentPhotoResourcesService.insertEmptyEquipmentPhotoResources(equipmentPhotoResources);
                    } else {
                        System.out.println("图片只能添加六张");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countEquipmentPhotoResourcesByParentId;
    }


}
