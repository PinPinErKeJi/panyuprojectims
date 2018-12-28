package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.GarrisonDao;
import com.panyu.panyuprojectims.entity.Garrison;
import com.panyu.panyuprojectims.service.GarrisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GarrisonServiceImpl implements GarrisonService{
    @Autowired
    private GarrisonDao garrisonDao;

    //根据模块名字查询模块对象
    @Override
    public Garrison getGarrison(String garrisonName) {
        return garrisonDao.selectGarrisonByGarrisonName(garrisonName);
    }

    //添加
    @Override
    public Garrison addGarrison(String garrisonName) {
        long count = garrisonDao.countByGarrisonName(garrisonName);
        if(count == 0){
            int i = garrisonDao.insertGarrison(garrisonName);
        }
        Garrison garrison = garrisonDao.selectGarrisonByGarrisonName(garrisonName);
        return garrison;
    }

    //查询下拉框模块名称
    @Override
    public List<Garrison> selectGarrison(){
        return garrisonDao.selectGarrison();
    }

    //修改
    @Override
    public int updateGarrison(String garrisonId, String garrisonName) {
        return garrisonDao.updateGarrison(garrisonId,garrisonName);
    }
    //删除
    @Override
    public int deleteGarrison(String garrisonId) {
        return garrisonDao.deleteGarrison(garrisonId);
    }
}