package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.InspectionStandardDao;
import com.panyu.panyuprojectims.entity.InspectionStandard;
import com.panyu.panyuprojectims.service.InspectionStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InspectionStandardServiceImpl implements InspectionStandardService{
    @Autowired
    private InspectionStandardDao inspectionStandardDao;

    //根据标准规范id和内容查询对象
    @Override
    public InspectionStandard getInspectionStandard(String standardId, String inspectionContent) {
        return inspectionStandardDao.getInspectionStandard(standardId,inspectionContent);
    }

    @Override
    public List<InspectionStandard> selectInspectionStandardById(String projectId) {
        return inspectionStandardDao.selectInspectionStandardById(projectId);
    }

    @Override
    public String selectStandardProjectId(String projectId) {
        return inspectionStandardDao.selectStandardProjectId(projectId);
    }
    @Override
    public int deleteInspectionStandardById(String standardId){
        return inspectionStandardDao.deleteInspectionStandardById(standardId);
    }

    @Override
    public int updateStandard(String standardId, String inspectionContent) {
        return inspectionStandardDao.updateStandard(standardId,inspectionContent);
    }

    public InspectionStandardDao getInspectionStandardDao() {
        return this.inspectionStandardDao;
    }

    public void setInspectionStandardDao(InspectionStandardDao inspectionStandardDao) {
        this.inspectionStandardDao = inspectionStandardDao;
    }

    //添加
    public  InspectionStandard addInspectionStandard(String inspectionContent, String projectId){
        int count = inspectionStandardDao.getCountByInspectionContentAndProjectId(inspectionContent, projectId);
        if(count == 0) {
            int i = inspectionStandardDao.insertInspectionStandard(inspectionContent, projectId);
        }
        InspectionStandard inspectionStandard = inspectionStandardDao.selectInspectionStandardByContent(inspectionContent, projectId);
        return inspectionStandard;
    }
}