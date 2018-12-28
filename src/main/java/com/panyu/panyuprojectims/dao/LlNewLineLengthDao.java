package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.LlNewLineLength;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LlNewLineLengthDao{

    //根据信息id查询新建线路长度对象
    LlNewLineLength selectLlNewLineLengthByCircuitInformationId(@Param("circuitInformationId") String circuitInformationId);

    //根据新建线路长度ID删除选中项
    int deleteLlNewLineLength(@Param("newLineLengthId") String newLineLengthId);
    //添加
    int insertLlNewLineLength(
            @Param("newLineLengthId") String newLineLengthId,
            @Param("newPoleLine") String newPoleLine,
            @Param("newPipe") String newPipe,
            @Param("directBurialOpticalCable") String directBurialOpticalCable,
            @Param("pushPipe") String pushPipe);
}