package com.panyu.panyuprojectims.service;
public interface LlNewLineLengthService{

    //根据新建线路长度ID删除选中项
    int deleteLlNewLineLength(String newLineLengthId);
    //添加
    int insertLlNewLineLength(
            String newLineLengthId,
            String newPoleLine,
            String newPipe,
            String directBurialOpticalCable,
            String pushPipe
    );
}