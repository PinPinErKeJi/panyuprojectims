package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.entity.InspectionProject;
import com.panyu.panyuprojectims.entity.PhotoResources;
import com.panyu.panyuprojectims.service.InspectionProjectService;
import com.panyu.panyuprojectims.service.PhotoResourcesService;
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
public class PhotoResourcesController {

    @Autowired
    private PhotoResourcesService photoResourcesService;
    @Autowired
    private InspectionProjectService inspectionProjectService;


    @RequestMapping("selectAllPhotoByModuleIdAndSubId")
    public @ResponseBody
    List<InspectionProject> selectAllPhotoByModuleIdAndSubId(String moduleId, String subId,String projectProgressId) {
        List<String> selectProjectIdList = photoResourcesService.selectProjectByIdList(moduleId,subId);
        List<InspectionProject> inspectionProjectList = new ArrayList<InspectionProject>();
            for (String projectId : selectProjectIdList) {
                List<String> photoIdList = photoResourcesService.selectPhotoResourcesIds(projectId,projectProgressId);
                List<PhotoResources> photoResourcesList = new ArrayList<PhotoResources>();
                for (String photoResourcesId : photoIdList) {
                    PhotoResources photoResources = new PhotoResources();
                    PhotoResources resources = photoResourcesService.selectPhotoResourcesByPhotoId(photoResourcesId,projectProgressId);
                    photoResources.setPhotoName(resources.getPhotoName());
                    photoResources.setQualified(resources.getQualified());
                    photoResources.setProblemDescription(resources.getProblemDescription());
                    photoResources.setPhotoUploadPeople(resources.getPhotoUploadPeople());
                    photoResourcesList.add(photoResources);
                }
                InspectionProject inspectionProject = new InspectionProject();
                InspectionProject project = inspectionProjectService.selectProjectName(projectId);
                inspectionProject.setProjectId(projectId);
                inspectionProject.setProjectName(project.getProjectName());
                inspectionProject.setInspectionContent(project.getInspectionContent());
                inspectionProject.setPhotoResourcesList(photoResourcesList);
                inspectionProjectList.add(inspectionProject);
            }

        return inspectionProjectList;
    }





    @RequestMapping("insertPhotoResourcesData")
    public @ResponseBody long insertPhotoResourcesData(HttpServletRequest request,
                                                          MultipartFile[] uploadFile,
                                                          PhotoResources photoResources,
                                                          String parentId,
                                                          String projectProgressId){
        int i = 0;
        long countPhotoResourcesByParentId = photoResourcesService.getCountPhotoResourcesByParentId(parentId);
        try {
            if (uploadFile!=null) {
                for (MultipartFile multipartFile : uploadFile) {
                    String fileName = multipartFile.getOriginalFilename();
                    //System.out.println(fileName);
                    String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
                    Date d = new Date();
                    String newFileName = replaceAll + "" + d.getTime() + "" + fileName;
                    if (countPhotoResourcesByParentId < 6) {
                        File file = new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        multipartFile.transferTo(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo" + "/" + newFileName));
                        String finalFileName = newFileName;
                        photoResources.setPhotoName(finalFileName);
                        photoResources.setParentId(parentId);
                        photoResources.setProjectProgressId(projectProgressId);
                      i = photoResourcesService.insertPhotoResourcesData(photoResources);
                    } else {
                        System.out.println("图片只能添加六张");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countPhotoResourcesByParentId;
    }
}
