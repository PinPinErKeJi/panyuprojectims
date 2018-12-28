package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.LlCableLengthDesignDao;
import com.panyu.panyuprojectims.service.LlCableLengthDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LlCableLengthDesignServiceImpl implements LlCableLengthDesignService{
    @Autowired
    private LlCableLengthDesignDao llCableLengthDesignDao;

    //根据光缆设计皮长公里ID删除选中项
    @Override
    public int deleteLlCableLengthDesign(String cableLengthDesignId) {
        return llCableLengthDesignDao.deleteLlCableLengthDesign(cableLengthDesignId);
    }

    //添加光缆设计皮长公里
    @Override
    public int insertLlCableLengthDesign(
            String cableLengthDesignId,
            String gystsSuspended,
            String gystsSuspensionWire,
            String gysta,
            String plowInOpticalCable,
            String wallCable,
            String inBridgeCable,
            String gyfxts) {

        int i1 = gystsSuspended.indexOf(".");
        if(i1>0){
            String str = gystsSuspended.substring(i1);
            int length = str.length();
            if(length>2){
                gystsSuspended = gystsSuspended.substring(0, i1+3);
            }else {
                gystsSuspended = gystsSuspended.substring(0, i1 + length)+"0";
            }
        }else {
            gystsSuspended = gystsSuspended+".00";
        }

        int i2 = gystsSuspensionWire.indexOf(".");
        if(i2>0){
            String str = gystsSuspensionWire.substring(i2);
            int length = str.length();
            if(length>2){
                gystsSuspensionWire = gystsSuspensionWire.substring(0, i2+3);
            }else {
                gystsSuspensionWire = gystsSuspensionWire.substring(0, i2 + length)+"0";
            }
        }else {
            gystsSuspensionWire = gystsSuspensionWire+".00";
        }

        int i3 = gysta.indexOf(".");
        if(i3>0){
            String str = gysta.substring(i3);
            int length = str.length();
            if(length>2){
                gysta = gysta.substring(0, i3+3);
            }else {
                gysta = gysta.substring(0, i3 + length)+"0";
            }
        }else {
            gysta = gysta+".00";
        }

        int i4 = plowInOpticalCable.indexOf(".");
        if(i4>0){
            String str = plowInOpticalCable.substring(i4);
            int length = str.length();
            if(length>2){
                plowInOpticalCable = plowInOpticalCable.substring(0, i4+3);
            }else {
                plowInOpticalCable = plowInOpticalCable.substring(0, i4 + length)+"0";
            }
        }else {
            plowInOpticalCable = plowInOpticalCable+".00";
        }

        int i5 = wallCable.indexOf(".");
        if(i5>0){
            String str = wallCable.substring(i5);
            int length = str.length();
            if(length>2){
                wallCable = wallCable.substring(0, i5+3);
            }else {
                wallCable = wallCable.substring(0, i5 + length)+"0";
            }
        }else {
            wallCable = wallCable+".00";
        }

        int i6 = inBridgeCable.indexOf(".");
        if(i6>0){
            String str = inBridgeCable.substring(i6);
            int length = str.length();
            if(length>2){
                inBridgeCable = inBridgeCable.substring(0, i6+3);
            }else {
                inBridgeCable = inBridgeCable.substring(0, i6 + length)+"0";
            }
        }else {
            inBridgeCable = inBridgeCable+".00";
        }

        int i7 = gyfxts.indexOf(".");
        if(i7>0){
            String str = gyfxts.substring(i7);
            int length = str.length();
            if(length>2){
                gyfxts = gyfxts.substring(0, i7+3);
            }else {
                gyfxts = gyfxts.substring(0, i7 + length)+"0";
            }
        }else {
            gyfxts = gyfxts+".00";
        }

        return llCableLengthDesignDao.insertLlCableLengthDesign(
                cableLengthDesignId,
                gystsSuspended,
                gystsSuspensionWire,
                gysta,
                plowInOpticalCable,
                wallCable,
                inBridgeCable,
                gyfxts);
    }
}