package com.panyu.panyuprojectims.controller.IC_controller.photo_controller;

import com.panyu.panyuprojectims.entity.IndoorCoveragePhoto;
import com.panyu.panyuprojectims.entity.IndoorCoverageProject;
import com.panyu.panyuprojectims.service.IndoorCoveragePhotoService;
import com.panyu.panyuprojectims.service.IndoorCoverageProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

@Controller
@RequestMapping("IC")
public class IndoorCoveragePhotoController {
    @Autowired private IndoorCoveragePhotoService indoorCoveragePhotoService;
    @Autowired private IndoorCoverageProjectService indoorCoverageProjectService;

    //根据模块id和分项工程id查询图片信息
    @RequestMapping("selectAllIndoorCoveragePhotoByModuleIdAndSubId")
   public @ResponseBody List<IndoorCoverageProject> selectAllIndoorCoveragePhotoByModuleIdAndSubId(String indoorCoverageId, String indoorSubWorkId,String indoorInformationId){
       List<String> selectIndoorProjectIdList = indoorCoveragePhotoService.selectIndoorProjectIdList(indoorCoverageId, indoorSubWorkId);
       List<IndoorCoverageProject> indoorCoverageProjectList = new ArrayList<IndoorCoverageProject>();
       for (String indoorProjectId : selectIndoorProjectIdList) {
           List<String> indoorPhotoIdList = indoorCoveragePhotoService.selectIndoorPhotoIdList(indoorProjectId, indoorInformationId);
           List<IndoorCoveragePhoto> indoorCoveragePhotoList = new ArrayList<IndoorCoveragePhoto>();
           for (String indoorPhotoId:indoorPhotoIdList) {
               IndoorCoveragePhoto indoorCoveragePhoto = new IndoorCoveragePhoto();
               IndoorCoveragePhoto indoorCoveragePhoto1 = indoorCoveragePhotoService.selectIndoorCoveragePhoto(indoorPhotoId, indoorProjectId, indoorInformationId);
               indoorCoveragePhoto.setIndoorProjectId(indoorProjectId);
               indoorCoveragePhoto.setIndoorName(indoorCoveragePhoto1.getIndoorName());
               indoorCoveragePhoto.setPhotoUploadPeople(indoorCoveragePhoto1.getPhotoUploadPeople());
               indoorCoveragePhoto.setQualified(indoorCoveragePhoto1.getQualified());
               indoorCoveragePhoto.setProblemDescription(indoorCoveragePhoto1.getProblemDescription());
               indoorCoveragePhoto.setIndoorInformationId(indoorInformationId);
               indoorCoveragePhotoList.add(indoorCoveragePhoto);
           }
           IndoorCoverageProject indoorCoverageProject = new IndoorCoverageProject();
           IndoorCoverageProject indoorCoverageProject1 = indoorCoverageProjectService.selectIndoorProjectNameAndIndoorSpecificationName(indoorProjectId);
           indoorCoverageProject.setIndoorProjectId(indoorProjectId);
           indoorCoverageProject.setIndoorProjectName(indoorCoverageProject1.getIndoorProjectName());
           indoorCoverageProject.setIndoorSpecificationName(indoorCoverageProject1.getIndoorSpecificationName());
           indoorCoverageProject.setIndoorCoveragePhotoList(indoorCoveragePhotoList);
           indoorCoverageProjectList.add(indoorCoverageProject);
       };
       return indoorCoverageProjectList;
   }

   //添加
    @RequestMapping("insertIndoorCoveragePhoto")
    public @ResponseBody long insertIndoorCoveragePhoto(HttpServletRequest request,
                                          MultipartFile[] uploadFile,
                                          IndoorCoveragePhoto indoorCoveragePhoto,
                                          String indoorProjectId, String indoorInformationId){
        //文件目录地址，年月作为文件夹名称
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) +1;
        int day = calendar.get(Calendar.DATE);

        String yearloadTargetPath = year+ "/";
        String mothloadTargetPath =month+ "/";
        String dayloadTargetPath =day+ "/";
        String uploadTargetPath =  yearloadTargetPath + mothloadTargetPath +dayloadTargetPath+ "/";
       //int i = 0;
        long countIndoorCoveragePhotoByIndoorProjectId = indoorCoveragePhotoService.getCountIndoorCoveragePhotoByIndoorProjectId(indoorProjectId);
        try {
            if (uploadFile!=null) {
                for (MultipartFile multipartFile : uploadFile) {
                    String fileName = multipartFile.getOriginalFilename();
                    //System.out.println(fileName);
                    String replaceAll = UUID.randomUUID().toString().replaceAll("-", "");
                    Date d = new Date();
                    String newFileName = replaceAll + "" + d.getTime() + "" + fileName;

                    if (countIndoorCoveragePhotoByIndoorProjectId < 6) {
                        File file = new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo\\IC"+"\\"+uploadTargetPath);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        multipartFile.transferTo(new File("E:\\IdeaWorkSpace\\panyuprojectims\\src\\main\\resources\\static\\photo\\IC"+"\\"+uploadTargetPath+"/"+ newFileName));
                        String finalFileName = newFileName;
                        indoorCoveragePhoto.setIndoorName("\\photo\\IC"+"\\"+uploadTargetPath+"/"+finalFileName);
                        indoorCoveragePhoto.setIndoorInformationId(indoorInformationId);
                        indoorCoveragePhoto.setIndoorProjectId(indoorProjectId);
                       int i = indoorCoveragePhotoService.insertIndoorCoveragePhoto(indoorCoveragePhoto);
                    } else {
                        System.out.println("图片只能添加六张");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countIndoorCoveragePhotoByIndoorProjectId;
    }


}
