package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.LlNewLineLengthDao;
import com.panyu.panyuprojectims.service.LlNewLineLengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LlNewLineLengthServiceImpl implements LlNewLineLengthService{
    @Autowired
    private LlNewLineLengthDao llNewLineLengthDao;

    //根据新建线路长度ID删除选中项
    @Override
    public int deleteLlNewLineLength(String newLineLengthId) {
        return llNewLineLengthDao.deleteLlNewLineLength(newLineLengthId);
    }
    //添加
    @Override
    public int insertLlNewLineLength(String newLineLengthId, String newPoleLine, String newPipe, String directBurialOpticalCable, String pushPipe) {
        int i1 = newPoleLine.indexOf(".");
        if(i1>0){
            String str = newPoleLine.substring(i1);
            int length = str.length();
            if(length>2){
                newPoleLine = newPoleLine.substring(0, i1+3);
            }else {
                newPoleLine = newPoleLine.substring(0, i1 + length)+"0";
            }
        }else {
            newPoleLine = newPoleLine+".00";
        }

        int i2 = newPipe.indexOf(".");
        if(i2>0){
            String str = newPipe.substring(i2);
            int length = str.length();
            if(length>2){
                newPipe = newPipe.substring(0, i2+3);
            }else {
                newPipe = newPipe.substring(0, i2 + length)+"0";
            }
        }else {
            newPipe = newPipe+".00";
        }

        int i3 = directBurialOpticalCable.indexOf(".");
        if(i3>0){
            String str = directBurialOpticalCable.substring(i3);
            int length = str.length();
            if(length>2){
                directBurialOpticalCable = directBurialOpticalCable.substring(0, i3+3);
            }else {
                directBurialOpticalCable = directBurialOpticalCable.substring(0, i3 + length)+"0";
            }
        }else {
            directBurialOpticalCable = directBurialOpticalCable+".00";
        }

        int i4 = pushPipe.indexOf(".");
        if(i4>0){
            String str = pushPipe.substring(i1);
            int length = str.length();
            if(length>2){
                pushPipe = pushPipe.substring(0, i4+3);
            }else {
                pushPipe = pushPipe.substring(0, i4 + length)+"0";
            }
        }else {
            pushPipe = pushPipe+".00";
        }

        return llNewLineLengthDao.insertLlNewLineLength(newLineLengthId, newPoleLine, newPipe, directBurialOpticalCable, pushPipe);
    }
}