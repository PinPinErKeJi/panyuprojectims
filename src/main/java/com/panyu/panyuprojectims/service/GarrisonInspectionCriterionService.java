package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.GarrisonInspectionCriterion;

import java.util.List;
public interface GarrisonInspectionCriterionService{


    //根据标准规范id和内容查询标准规范对象
    GarrisonInspectionCriterion getGarrisonInspectionCriterion(String garrisonCriterionName, String garrisonCriterionId);




    //添加
    GarrisonInspectionCriterion addGarrisonInspectionCriterion(String garrisonCriterionName,
                                                               String garrisonProjectId);


    //根据检查项目id查询包含的标准规范
    List<GarrisonInspectionCriterion> selectAllGarrisonInspectionCriterionByGarrisonProjectId(String garrisonProjectId);

    //修改
    int updateGarrisonInspectionCriterion(String garrisonCriterionName,
                                          String garrisonCriterionId);
    //删除
    int deleteGarrisonInspectionCriterion(String garrisonCriterionId);
    //根据检查项目id查询标准规范id集合
    List<String> selectGarrisonCriterionIdByGarrisonProjectId(String garrisonProjectId);

}