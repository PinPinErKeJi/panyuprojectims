package com.panyu.panyuprojectims.service;
public interface LlDesignInstituteService{

    //根据线路设计单位表ID删除选中项
    int deleteLlDesignInstitute(String designInstituteId);
    //添加
    int insertLlDesignInstitute(
            String designInstituteId,
            String companyName,
            String designPersonnel
    );
}