package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.GarrisonInspectionCriterion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface GarrisonInspectionCriterionDao{


    //根据标准规范id和内容查询标准规范对象
    GarrisonInspectionCriterion getGarrisonInspectionCriterion(@Param("garrisonCriterionName") String garrisonCriterionName,
                                                               @Param("garrisonCriterionId") String garrisonCriterionId);

    //根据检查项目id查询包含的标准规范
    List<GarrisonInspectionCriterion> selectAllGarrisonInspectionCriterionByGarrisonProjectId(
            @Param("garrisonProjectId") String garrisonProjectId);
    //添加
    int insertGarrisonInspectionCriterion(@Param("garrisonCriterionName") String garrisonCriterionName,
                                          @Param("garrisonProjectId") String garrisonProjectId);
    //添加之前根据标准规范内容查询个数，判断标准规范是否存在
    long countByGarrisonCriterionName(@Param("garrisonCriterionName") String garrisonCriterionName,
                                      @Param("garrisonProjectId") String garrisonProjectId);
    //根据标准规范内容查询标准规范
    GarrisonInspectionCriterion seleectGarrisonInspectionCriterionByGarrisonCriterionName(
            @Param("garrisonCriterionName") String garrisonCriterionName,
            @Param("garrisonProjectId") String garrisonProjectId);
    //修改
    int updateGarrisonInspectionCriterion(@Param("garrisonCriterionName") String garrisonCriterionName,
                                          @Param("garrisonCriterionId") String garrisonCriterionId
    );
    //删除
    int deleteGarrisonInspectionCriterion(@Param("garrisonCriterionId") String garrisonCriterionId);
    //根据检查项目id查询标准规范id集合
    List<String> selectGarrisonCriterionIdByGarrisonProjectId(@Param("garrisonProjectId") String garrisonProjectId);

}