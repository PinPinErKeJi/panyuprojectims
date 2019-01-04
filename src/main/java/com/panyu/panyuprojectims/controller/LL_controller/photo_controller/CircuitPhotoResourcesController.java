package com.panyu.panyuprojectims.controller.LL_controller.photo_controller;

import com.panyu.panyuprojectims.entity.CircuitInspectionProject;
import com.panyu.panyuprojectims.entity.CircuitPhotoResources;
import com.panyu.panyuprojectims.service.CircuitInspectionProjectService;
import com.panyu.panyuprojectims.service.CircuitPhotoResourcesService;
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
@RequestMapping("LL")
public class CircuitPhotoResourcesController {
    @Autowired private CircuitPhotoResourcesService circuitPhotoResourcesService;
    @Autowired
    private CircuitInspectionProjectService circuitInspectionProjectService;

    //根据模块id和分项工程id查询图片信息
    @RequestMapping("selectAllCircuitPhotoResourcesByModuleIdAndSubId")
    public @ResponseBody List<CircuitInspectionProject> selectAllCircuitPhotoResourcesByModuleIdAndSubId(String circuitModuleId, String circuitSubWorkId, String circuitInformationId) {
       //查询检查项目id集合
        List<String> projectIdList = circuitPhotoResourcesService.selectCircuitInspectionProjectList(circuitModuleId, circuitSubWorkId);
        List<CircuitInspectionProject> circuitInspectionProjectList = new ArrayList<>();
        for (String projectId : projectIdList) {
            //查询图片资源id
            List<String> photoIdList = circuitPhotoResourcesService.selectCircuitPhotoResourcesByPhotoId(projectId, circuitInformationId);
            List<CircuitPhotoResources> circuitPhotoResourcesList = new ArrayList<>();
            for (String photoId : photoIdList) {
                CircuitPhotoResources circuitPhotoResources = new CircuitPhotoResources();
                CircuitPhotoResources circuitPhotoResources1 = circuitPhotoResourcesService.selectAllCircuitPhotoResources(photoId, projectId, circuitInformationId);
                circuitPhotoResources.setCircuitPhotoName(circuitPhotoResources1.getCircuitPhotoName());
                circuitPhotoResources.setCircuitProjectId(projectId);
                circuitPhotoResources.setCircuitInformationId(circuitInformationId);
                circuitPhotoResources.setPhotoUploadPeople(circuitPhotoResources1.getPhotoUploadPeople());
                circuitPhotoResources.setQualified(circuitPhotoResources1.getQualified());
                circuitPhotoResources.setProblemDescription(circuitPhotoResources1.getProblemDescription());
                circuitPhotoResourcesList.add(circuitPhotoResources);
                //System.out.println("图片信息:"+circuitPhotoResourcesList);
            }
            CircuitInspectionProject circuitInspectionProject = new CircuitInspectionProject();
            CircuitInspectionProject circuitInspectionProject1 = circuitInspectionProjectService.selectCircuitInspectionProjectBycircuitProjectId(projectId);
            //System.out.println("标准规范信息:"+circuitInspectionProject1);

            //System.out.println("标准:"+circuitInspectionProject1.getCircuitCriterionName());
            circuitInspectionProject.setCircuitCriterionName(circuitInspectionProject1.getCircuitCriterionName());
            circuitInspectionProject.setCircuitProjectId(projectId);
            circuitInspectionProject.setCircuitProjectName(circuitInspectionProject1.getCircuitProjectName());
            circuitInspectionProject.setCircuitPhotoResourcesList(circuitPhotoResourcesList);
            circuitInspectionProjectList.add(circuitInspectionProject);
        };

        return circuitInspectionProjectList;
    }

    //添加
    @RequestMapping("insertCircuitInspectionProject")
    public @ResponseBody long insertCircuitInspectionProject(HttpServletRequest request,
                                               MultipartFile[] uploadFile,
                                               CircuitPhotoResources circuitPhotoResources,
                                               String circuitProjectId,String circuitInformationId){
        long count = circuitPhotoResourcesService.getCircuitPhotoResourcesCountByProjectId(circuitProjectId);
        try{
            if(uploadFile != null){
                for (MultipartFile multipartFile : uploadFile) {
                    String fileName = multipartFile.getOriginalFilename();
                    //System.out.println(fileName);
                    String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
                    Date d = new Date();
                    String newFileName = replaceAll + "" + d.getTime() + "" + fileName;
                    if (count < 6) {
                        File file = new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\LL\\photo");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        multipartFile.transferTo(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\LL\\photo" + "/" + newFileName));
                        String finalFileName = newFileName;
                        circuitPhotoResources.setCircuitPhotoName(finalFileName);
                        circuitPhotoResources.setCircuitProjectId(circuitProjectId);
                        circuitPhotoResources.setCircuitInformationId(circuitInformationId);
                        circuitPhotoResourcesService.insertCircuitPhotoResources(circuitPhotoResources);
                    } else {
                        System.out.println("图片只能添加六张");
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
}
