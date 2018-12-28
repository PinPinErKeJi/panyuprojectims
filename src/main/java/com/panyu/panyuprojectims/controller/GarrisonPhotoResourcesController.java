package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.GarrisonInspectionProject;
import com.panyu.panyuprojectims.entity.GarrisonPhotoResources;
import com.panyu.panyuprojectims.service.GarrisonInspectionProjectService;
import com.panyu.panyuprojectims.service.GarrisonPhotoResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class GarrisonPhotoResourcesController {

    @Autowired
    private GarrisonPhotoResourcesService garrisonPhotoResourcesService;
    @Autowired
    private GarrisonInspectionProjectService garrisonInspectionProjectService;


    //根据点击检查项目展示图片信息
    @RequestMapping("selectGarrisonPhotoResourcesByGarrisonIdAndGarrisonSubWorkId")
    public @ResponseBody
    List<GarrisonInspectionProject> selectGarrisonPhotoResourcesByGarrisonIdAndGarrisonSubWorkId(String garrisonId,String garrisonSubWorkId,String garrisonInformationId){
        List<String> list = garrisonPhotoResourcesService.selectGarrisonInspectionProjectList(garrisonId, garrisonSubWorkId);
        List<GarrisonInspectionProject> garrisonInspectionProjectList = new ArrayList<GarrisonInspectionProject>();
        //循环获取检查项目ID
        for (String garrisonProjectId:list){
            List<String> photoResourcesList = garrisonPhotoResourcesService.selectGarrisonPhotoResourcesByPhotoId(garrisonProjectId,garrisonInformationId);
            List<GarrisonPhotoResources> garrisonPhotoResourcesList = new ArrayList<GarrisonPhotoResources>();
            for (String garrisonPhotoId:photoResourcesList){
                GarrisonPhotoResources garrisonPhotoResources = new GarrisonPhotoResources();
                GarrisonPhotoResources photoResources = garrisonPhotoResourcesService.selectAllGarrisonPhotoResources(garrisonPhotoId,garrisonProjectId,garrisonInformationId);
                garrisonPhotoResources.setGarrisonProjectId(garrisonProjectId);
                garrisonPhotoResources.setGarrisonPhotoName(photoResources.getGarrisonPhotoName());
                garrisonPhotoResources.setPhotoUploadPeople(photoResources.getPhotoUploadPeople());
                garrisonPhotoResources.setQualified(photoResources.getQualified());
                garrisonPhotoResources.setProblemDescription(photoResources.getProblemDescription());
                garrisonPhotoResources.setGarrisonInformationId(garrisonInformationId);
                garrisonPhotoResourcesList.add(garrisonPhotoResources);
            }
            GarrisonInspectionProject garrisonInspectionProjects = new GarrisonInspectionProject();
            GarrisonInspectionProject garrisonInspectionProject = garrisonInspectionProjectService.selectGarrisonInspectionProjectByProjectName(garrisonProjectId);
            garrisonInspectionProjects.setGarrisonProjectId(garrisonProjectId);
            garrisonInspectionProjects.setGarrisonProjectName(garrisonInspectionProject.getGarrisonProjectName());
            garrisonInspectionProjects.setGarrisonCriterionName(garrisonInspectionProject.getGarrisonCriterionName());
            garrisonInspectionProjects.setGarrisonPhotoResourcesList(garrisonPhotoResourcesList);
            garrisonInspectionProjectList.add(garrisonInspectionProjects);
        }
        return garrisonInspectionProjectList;
    }


    //添加数据
    @RequestMapping("insertGarrisonPhotoResources")
    public @ResponseBody long insertGarrisonPhotoResources(
            HttpServletRequest request,
            MultipartFile[] uploadFile,
            GarrisonPhotoResources garrisonPhotoResources,
            String garrisonProjectId,String garrisonInformationId){
       int i = 0;
        long garrisonPhotoResourcesCountByProjectId = garrisonPhotoResourcesService.getGarrisonPhotoResourcesCountByProjectId(garrisonProjectId);
        try {
            if (uploadFile!=null) {
                for (MultipartFile multipartFile : uploadFile) {
                    String fileName = multipartFile.getOriginalFilename();
                    //System.out.println(fileName);
                    String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
                    Date d = new Date();
                    String newFileName = replaceAll + "" + d.getTime() + "" + fileName;
                    if (garrisonPhotoResourcesCountByProjectId < 6) {
                        File file = new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        multipartFile.transferTo(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo" + "/" + newFileName));
                        String finalFileName = newFileName;
                        garrisonPhotoResources.setGarrisonPhotoName(finalFileName);
                        garrisonPhotoResources.setGarrisonProjectId(garrisonProjectId);
                        garrisonPhotoResources.setGarrisonInformationId(garrisonInformationId);
                        i = garrisonPhotoResourcesService.insertGarrisonPhotoResources(garrisonPhotoResources);
                    } else {
                        System.out.println("图片只能添加六张");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return garrisonPhotoResourcesCountByProjectId;
    }

}
