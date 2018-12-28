package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.Garrison;

import java.util.List;
public interface GarrisonService{

    //根据模块名字查询模块对象
    Garrison getGarrison(String garrisonName);


    //添加
    Garrison addGarrison(String garrisonName);

    //查询下拉框模块名称
    List<Garrison> selectGarrison();

    //修改
    int updateGarrison(String garrisonId, String garrisonName);
    //删除
    int deleteGarrison(String garrisonId);
}