package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.IndoorCoverageSubWorkDao;
import com.panyu.panyuprojectims.entity.IndoorCoverageSubWork;
import com.panyu.panyuprojectims.service.IndoorCoverageSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IndoorCoverageSubWorkServiceImpl implements IndoorCoverageSubWorkService{
    @Autowired
    private IndoorCoverageSubWorkDao indoorCoverageSubWorkDao;

    //跟据分项工程id和名字查询分项工程对象
    @Override
    public IndoorCoverageSubWork getIndoorCoverageSubWork(String indoorSubWorkId, String indoorSubWorkName) {
        return indoorCoverageSubWorkDao.getIndoorCoverageSubWork(indoorSubWorkId,indoorSubWorkName);
    }

    //添加
    @Override
    public IndoorCoverageSubWork addIndoorCoverageSubWork(String indoorSubWorkName, String indoorCoverageId) {
        long count = indoorCoverageSubWorkDao.getCountByIndoorSubWorkNameAndByIndoorCoverageId(indoorSubWorkName, indoorCoverageId);
        if(count == 0){
            int i = indoorCoverageSubWorkDao.insertIndoorCoverageSubWork(indoorSubWorkName, indoorCoverageId);
        }
        IndoorCoverageSubWork indoorCoverageSubWork = indoorCoverageSubWorkDao.selectIndoorCoverageSubWorkByIndoorSubWorkNameAndByIndoorCoverageId(indoorSubWorkName, indoorCoverageId);
        return indoorCoverageSubWork;
    }

    //根据模块信息id查询包含的分项工程
    @Override
    public List<IndoorCoverageSubWork> selectAllIndoorCoverageSubWorkByIndoorCoverageId(String indoorCoverageId) {
        return indoorCoverageSubWorkDao.selectAllIndoorCoverageSubWorkByIndoorCoverageId(indoorCoverageId);
    }

    //修改
    @Override
    public int updateIndoorCoverageSubWork(String indoorSubWorkId, String indoorSubWorkName) {
        return indoorCoverageSubWorkDao.updateIndoorCoverageSubWork(indoorSubWorkId,indoorSubWorkName);
    }

    //删除
    @Override
    public int deleteIndoorCoverageSubWork(String indoorSubWorkId) {
        return indoorCoverageSubWorkDao.deleteIndoorCoverageSubWork(indoorSubWorkId);
    }

    //根据模块id查询包含的分项工程id
    @Override
    public List<String> selectIndoorSubWorkIdByIndoorCoverageId(String indoorCoverageId) {
        return indoorCoverageSubWorkDao.selectIndoorSubWorkIdByIndoorCoverageId(indoorCoverageId);
    }

}