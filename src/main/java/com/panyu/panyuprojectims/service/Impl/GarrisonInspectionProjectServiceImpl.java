package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.GarrisonInspectionProjectDao;
import com.panyu.panyuprojectims.entity.GarrisonInspectionProject;
import com.panyu.panyuprojectims.service.GarrisonInspectionProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GarrisonInspectionProjectServiceImpl implements GarrisonInspectionProjectService{
    @Autowired
    private GarrisonInspectionProjectDao garrisonInspectionProjectDao;

    //根据检查项目id和名字查询检查项目对象
    @Override
    public GarrisonInspectionProject getGarrisonInspectionProject(String garrisonProjectName, String garrisonProjectId) {
        return garrisonInspectionProjectDao.getGarrisonInspectionProject(garrisonProjectName,garrisonProjectId);
    }

    //添加
    @Override
    public GarrisonInspectionProject addGarrisonInspectionProject(String garrisonProjectName, String garrisonSubWorkId) {
        long count = garrisonInspectionProjectDao.countByGarrisonProjectName(garrisonProjectName, garrisonSubWorkId);
        if(count == 0){
            int i = garrisonInspectionProjectDao.insertGarrisonInspectionProject(garrisonProjectName, garrisonSubWorkId);
        }
        GarrisonInspectionProject garrisonInspectionProject = garrisonInspectionProjectDao.selectGarrisonInspectionProjectByGarrisonProjectName(garrisonProjectName, garrisonSubWorkId);
        return garrisonInspectionProject;
    }

    //根据分项工程id查询包含的检查项目
    @Override
    public List<GarrisonInspectionProject> selectAllGarrisonInspectionProjectByGarrisonSubWorkId(String garrisonSubWorkId) {
        return garrisonInspectionProjectDao.selectAllGarrisonInspectionProjectByGarrisonSubWorkId(garrisonSubWorkId);
    }

    //修改
    @Override
    public int updateGarrisonInspectionProject(String garrisonProjectName, String garrisonProjectId) {
        return garrisonInspectionProjectDao.updateGarrisonInspectionProject(garrisonProjectName,garrisonProjectId);
    }
    //删除
    @Override
    public int deleteGarrisonInspectionProject(String garrisonProjectId) {
        return garrisonInspectionProjectDao.deleteGarrisonInspectionProject(garrisonProjectId);
    }
    //根据分项工程id查询包含的检查项目id 集合
    @Override
    public List<String> selectAllGarrisonProjectIdByGarrisonSubWorkId(String garrisonSubWorkId) {
        return garrisonInspectionProjectDao.selectAllGarrisonProjectIdByGarrisonSubWorkId(garrisonSubWorkId);
    }
    //数据填报的时候根据检查项目ID查询项目名称通过对象接收
    @Override
    public GarrisonInspectionProject selectGarrisonInspectionProjectByProjectName(String garrisonProjectId) {
        return garrisonInspectionProjectDao.selectGarrisonInspectionProjectByProjectName(garrisonProjectId);
    }
}