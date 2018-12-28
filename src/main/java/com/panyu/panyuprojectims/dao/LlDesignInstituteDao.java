package com.panyu.panyuprojectims.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LlDesignInstituteDao{

    //根据线路设计单位表ID删除选中项
    int deleteLlDesignInstitute(@Param("designInstituteId") String designInstituteId);
    //添加
    int insertLlDesignInstitute(
            @Param("designInstituteId") String designInstituteId,
            @Param("companyName") String companyName,
            @Param("designPersonnel") String designPersonnel);
}