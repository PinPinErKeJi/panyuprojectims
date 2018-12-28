package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.LlCircuitProgress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface LlCircuitProgressDao{

    //获取总行数
    long getLlCircuitProgressRowCount(
            @Param("province") String province,
            @Param("city") String city,
            @Param("county") String county,
            @Param("buildYear") String buildYear,
            @Param("operator") String operator,
            @Param("buildingProject") String buildingProject,
            @Param("keyword") String siteLeader,
            @Param("keyword") String professionResponsiblePerson,
            @Param("keyword") String districtHead);

    //获取对象集合
    List<LlCircuitProgress> selectLlCircuitProgress(@Param("start") int start,
                                                    @Param("end") int end,
                                                    @Param("province") String province,
                                                    @Param("city") String city,
                                                    @Param("county") String county,
                                                    @Param("buildYear") String buildYear,
                                                    @Param("operator") String operator,
                                                    @Param("buildingProject") String buildingProject,
                                                    @Param("keyword") String siteLeader,
                                                    @Param("keyword") String professionResponsiblePerson,
                                                    @Param("keyword") String districtHead);


    //导出数据
    List<LlCircuitProgress> importLlCircuitProgressExcel(String[] ids);

}