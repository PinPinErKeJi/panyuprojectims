package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.IndoorCoverageProjectDao;
import com.panyu.panyuprojectims.entity.IndoorCoverageProject;
import com.panyu.panyuprojectims.service.IndoorCoverageProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class IndoorCoverageProjectServiceImpl implements IndoorCoverageProjectService{
    @Autowired
    private IndoorCoverageProjectDao indoorCoverageProjectDao;

    //根据检查项目id和名字查询检查项目对象
    @Override
    public IndoorCoverageProject getIndoorCoverageProject(String indoorProjectId, String indoorProjectName) {
        return indoorCoverageProjectDao.getIndoorCoverageProject(indoorProjectId,indoorProjectName);
    }

    //根据分项工程id查询分项工程名和标准规范
    @Override
    public IndoorCoverageProject selectIndoorProjectNameAndIndoorSpecificationName(String indoorProjectId) {
        return indoorCoverageProjectDao.selectIndoorProjectNameAndIndoorSpecificationName(indoorProjectId);
    }

    //添加
    @Override
    public IndoorCoverageProject addIndoorCoverageProject(String indoorProjectName, String indoorSubWorkId) {
        long count = indoorCoverageProjectDao.getCountByIndoorProjectNameAndIndoorSubWorkId(indoorProjectName, indoorSubWorkId);
        if(count == 0){
            int i = indoorCoverageProjectDao.insertIndoorCoverageProject(indoorProjectName, indoorSubWorkId);
        }
        IndoorCoverageProject indoorCoverageProject = indoorCoverageProjectDao.selectIndoorCoverageProjectByIndoorProjectNameAndIndoorSubWorkId(indoorProjectName, indoorSubWorkId);
        return indoorCoverageProject;
    }

    //根据分项工程id查询包含的检查项目
    @Override
    public List<IndoorCoverageProject> selectAllIndoorCoverageProjectByIndoorSubWorkId(String indoorSubWorkId) {
        return indoorCoverageProjectDao.selectAllIndoorCoverageProjectByIndoorSubWorkId(indoorSubWorkId);
    }

    //修改
    @Override
    public int updateIndoorCoverageProject(String indoorProjectId, String indoorProjectName) {
        return indoorCoverageProjectDao.updateIndoorCoverageProject(indoorProjectId,indoorProjectName);
    }

    //删除
    @Override
    public int deleteIndoorCoverageProject(String indoorProjectId) {
        return indoorCoverageProjectDao.deleteIndoorCoverageProject(indoorProjectId);
    }

    //根据分项工程id查询检查项目id
    @Override
    public List<String> selectIndoorProjectIdByIndoorSubWorkId(String indoorSubWorkId) {
        return indoorCoverageProjectDao.selectIndoorProjectIdByIndoorSubWorkId(indoorSubWorkId);
    }

}