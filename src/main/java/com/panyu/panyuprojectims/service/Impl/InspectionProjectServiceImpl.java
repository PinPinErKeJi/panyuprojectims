package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.InspectionProjectDao;
import com.panyu.panyuprojectims.entity.InspectionProject;
import com.panyu.panyuprojectims.service.InspectionProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InspectionProjectServiceImpl implements InspectionProjectService{
    @Autowired
    private InspectionProjectDao inspectionProjectDao;


    //根据检查项目id和名字查询对象
    @Override
    public InspectionProject getInspectionProject(String projectId, String projectName) {
        return inspectionProjectDao.getInspectionProject(projectId,projectName);
    }

    @Override
    public InspectionProject selectProjectName(String projectId) {
        return inspectionProjectDao.selectProjectName(projectId);
    }

    @Override
    public List<InspectionProject> selectInspectionProjectById(String subId) {
        return inspectionProjectDao.selectInspectionProjectById(subId);
    }


    @Override
    public List<String> selectProjectSubId(String subId) {
        return inspectionProjectDao.selectProjectSubId(subId);
    }
    @Override
    public int deleteInspectionProjectById(String projectId){
        return inspectionProjectDao.deleteInspectionProjectById(projectId);
    }

    @Override
    public int updateProject(String projectId, String projectName) {
        return inspectionProjectDao.updateProject(projectId,projectName);
    }

    public InspectionProjectDao getInspectionProjectDao() {
        return this.inspectionProjectDao;
    }

    public void setInspectionProjectDao(InspectionProjectDao inspectionProjectDao) {
        this.inspectionProjectDao = inspectionProjectDao;
    }

    //添加
    public  InspectionProject addProject(String projectName, String subId){
        int count = inspectionProjectDao.getCountByProjectNameAndSubId(projectName, subId);
        if(count == 0) {
            int i = inspectionProjectDao.insertInspectionProject(projectName, subId);
        }
        InspectionProject inspectionProject = inspectionProjectDao.selectInspectionProjectByName(projectName,subId);
        return inspectionProject;
    }
}