package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.GarrisonInspectionCriterionDao;
import com.panyu.panyuprojectims.entity.GarrisonInspectionCriterion;
import com.panyu.panyuprojectims.service.GarrisonInspectionCriterionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GarrisonInspectionCriterionServiceImpl implements GarrisonInspectionCriterionService{
    @Autowired
    private GarrisonInspectionCriterionDao garrisonInspectionCriterionDao;

    //根据标准规范id和内容查询标准规范对象
    @Override
    public GarrisonInspectionCriterion getGarrisonInspectionCriterion(String garrisonCriterionName, String garrisonCriterionId) {
        return garrisonInspectionCriterionDao.getGarrisonInspectionCriterion(garrisonCriterionName,garrisonCriterionId);
    }

    //添加
    @Override
    public GarrisonInspectionCriterion addGarrisonInspectionCriterion(String garrisonCriterionName, String garrisonProjectId) {
        long count = garrisonInspectionCriterionDao.countByGarrisonCriterionName(garrisonCriterionName, garrisonProjectId);
        if(count == 0){
            int i = garrisonInspectionCriterionDao.insertGarrisonInspectionCriterion(garrisonCriterionName, garrisonProjectId);
        }
        GarrisonInspectionCriterion garrisonInspectionCriterion = garrisonInspectionCriterionDao.seleectGarrisonInspectionCriterionByGarrisonCriterionName(garrisonCriterionName, garrisonProjectId);
        return garrisonInspectionCriterion;
    }

    //根据检查项目id查询包含的标准规范
    @Override
    public List<GarrisonInspectionCriterion> selectAllGarrisonInspectionCriterionByGarrisonProjectId(String garrisonProjectId) {
        return garrisonInspectionCriterionDao.selectAllGarrisonInspectionCriterionByGarrisonProjectId(garrisonProjectId);
    }

    //修改
    @Override
    public int updateGarrisonInspectionCriterion(String garrisonCriterionName, String garrisonCriterionId) {
        return garrisonInspectionCriterionDao.updateGarrisonInspectionCriterion(garrisonCriterionName,garrisonCriterionId);
    }
    //删除
    @Override
    public int deleteGarrisonInspectionCriterion(String garrisonCriterionId) {
        return garrisonInspectionCriterionDao.deleteGarrisonInspectionCriterion(garrisonCriterionId);
    }
    //根据检查项目id查询标准规范id集合
    @Override
    public List<String> selectGarrisonCriterionIdByGarrisonProjectId(String garrisonProjectId) {
        return garrisonInspectionCriterionDao.selectGarrisonCriterionIdByGarrisonProjectId(garrisonProjectId);
    }
}