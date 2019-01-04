package com.panyu.panyuprojectims.controller.PS_controller.photo_controller;

import com.panyu.panyuprojectims.entity.PowerPhotoResources;
import com.panyu.panyuprojectims.entity.PowerSupplyProject;
import com.panyu.panyuprojectims.service.PowerPhotoResourcesService;
import com.panyu.panyuprojectims.service.PowerSupplyProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("PS")
public class PowerPhotoResourcesController {

    @Autowired
    private PowerPhotoResourcesService powerPhotoResourcesService;
    @Autowired
    private PowerSupplyProjectService powerSupplyProjectService;

    //根据模块id和分项工程id查询图片信息
    @RequestMapping("selectAllPowerPhotoResourcesByModuleIdAndSubId")
    public @ResponseBody
    List<PowerSupplyProject> selectAllPowerPhotoResourcesByModuleIdAndSubId(
            String powerModuleId,
            String powerSubWorkId,
            String powerInformationId){
        //查询检查项目id集合
        List<String> ProjectList = powerPhotoResourcesService.selectPowerSupplyProjectList(powerModuleId,powerSubWorkId);
        List<PowerSupplyProject> powerSupplyProjectList = new ArrayList<>();
        for (String powerProjectId:ProjectList){
            //根据检查项目ID和信息id查询图片资源ID集合
            List<String> powerPhotoIdList = powerPhotoResourcesService.selectPowerPhotoResourcesIdList(powerProjectId,powerInformationId);
            List<PowerPhotoResources> powerPhotoResourcesList = new ArrayList<>();
            for (String powerPhotoId:powerPhotoIdList){
                PowerPhotoResources powerPhotoResources = new PowerPhotoResources();
                //根据图片资源ID，检查项目id和信息id查询图片资源
                PowerPhotoResources PhotoResources = powerPhotoResourcesService.selectAllPowerPhotoResources(powerPhotoId, powerProjectId, powerInformationId);
                powerPhotoResources.setPowerPhotoName(PhotoResources.getPowerPhotoName());
                powerPhotoResources.setPowerProjectId(powerProjectId);
                powerPhotoResources.setPowerInformationId(powerInformationId);
                powerPhotoResources.setPhotoUploadPeople(PhotoResources.getPhotoUploadPeople());
                powerPhotoResources.setQualified(PhotoResources.getQualified());
                powerPhotoResources.setProblemDescription(PhotoResources.getProblemDescription());
                powerPhotoResourcesList.add(powerPhotoResources);
            }
            PowerSupplyProject powerSupplyProject = new PowerSupplyProject();
            //根据检查项目id查询检查项目对象
            PowerSupplyProject powerSupplyProject1 = powerSupplyProjectService.selectPowerSupplyProjectByProjectId(powerProjectId);
            powerSupplyProject.setPowerProjectName(powerSupplyProject1.getPowerProjectName());
            powerSupplyProject.setPowerProjectId(powerProjectId);
            powerSupplyProject.setPowerCriterionName(powerSupplyProject1.getPowerCriterionName());
            powerSupplyProject.setPowerPhotoResourcesList(powerPhotoResourcesList);
            powerSupplyProjectList.add(powerSupplyProject);
        }
        return powerSupplyProjectList;
    }

    @RequestMapping("insertPowerPhotoResources")
    public @ResponseBody long insertPowerPhotoResources(
            HttpServletRequest request,
            MultipartFile[] uploadFile,
            PowerPhotoResources powerPhotoResources,
            String powerProjectId,
            String powerInformationId){
        //根据parentID查询对应的图片信息个数
        long count = powerPhotoResourcesService.getPowerPhotoResourcesCountByProjectId(powerProjectId);
        try {
            if(uploadFile != null){
                for (MultipartFile multipartFile : uploadFile) {
                    String fileName = multipartFile.getOriginalFilename();
                    String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
                    Date d = new Date();
                    String newFileName = replaceAll + "" + d.getTime() + "" + fileName;
                    if (count < 6) {
                        File file = new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\PS\\photo");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        multipartFile.transferTo(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\PS\\photo" + "/" + newFileName));
                        String finalFileName = newFileName;
                        powerPhotoResources.setPowerPhotoName(finalFileName);
                        powerPhotoResources.setPowerProjectId(powerProjectId);
                        powerPhotoResources.setPowerInformationId(powerInformationId);
                        powerPhotoResourcesService.insertPowerPhotoResources(powerPhotoResources);
                    } else {
                        System.out.println("图片只能添加六张");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
