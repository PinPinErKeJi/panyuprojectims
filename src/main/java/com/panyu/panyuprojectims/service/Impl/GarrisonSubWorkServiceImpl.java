package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.GarrisonSubWorkDao;
import com.panyu.panyuprojectims.entity.GarrisonSubWork;
import com.panyu.panyuprojectims.service.GarrisonSubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GarrisonSubWorkServiceImpl implements GarrisonSubWorkService{
    @Autowired
    private GarrisonSubWorkDao garrisonSubWorkDao;

    //根据分项工程id和名字查询分项工程对象
    @Override
    public GarrisonSubWork getGarrisonSubWork(String garrisonSubWorkId, String garrisonSubWorkName) {
        return garrisonSubWorkDao.getGarrisonSubWork(garrisonSubWorkId,garrisonSubWorkName);
    }

    //添加
    @Override
    public GarrisonSubWork addGarrisonSubWork(String garrisonSubWorkName, String garrisonId) {
        long count = garrisonSubWorkDao.countByGarrisonSubWorkName(garrisonSubWorkName,garrisonId);
        if(count == 0){
            int i = garrisonSubWorkDao.insertGarrisonSubWork(garrisonSubWorkName, garrisonId);
        }
        GarrisonSubWork garrisonSubWork = garrisonSubWorkDao.selectGarrisonSubWorkByGarrisonSubWorkName(
                garrisonSubWorkName,garrisonId);
        return garrisonSubWork;
    }

    //根据模块id查询包含的分项工程
    @Override
    public List<GarrisonSubWork> selectAllGarrisonSubWorkByGarrisonId(String garrisonId) {
        return garrisonSubWorkDao.selectAllGarrisonSubWorkByGarrisonId(garrisonId);
    }

    //修改
    @Override
    public int updateGarrisonSubWork(String garrisonSubWorkId, String garrisonSubWorkName) {
        return garrisonSubWorkDao.updateGarrisonSubWork(garrisonSubWorkId,garrisonSubWorkName);
    }
    //删除
    @Override
    public int deleteGarrisonSubWork(String garrisonSubWorkId) {
        return garrisonSubWorkDao.deleteGarrisonSubWork(garrisonSubWorkId);
    }
    //根据模块id查询包含的分项工程的id
    @Override
    public List<String> selectAllGarrisonSubWorkIdByGarrisonId(String garrisonId) {
        return garrisonSubWorkDao.selectAllGarrisonSubWorkIdByGarrisonId(garrisonId);
    }
}