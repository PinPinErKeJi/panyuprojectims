package com.panyu.panyuprojectims.controller;

import com.panyu.panyuprojectims.service.HnCableLengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class HnCableLengthController {
    @Autowired private HnCableLengthService hnCableLengthService;

    //添加
    @RequestMapping("insertHnCableLength")
    public @ResponseBody String insertHnCableLength(String cableLengthId, String gysts, String gysta,
                               String buriedServiceLightguide, String wallCable,
                               String inBridgeCable, String gyfxts){
        cableLengthId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        //光缆数据处理
        //①
        int i1 = gysts.indexOf(".");
        if(i1>0){
            String str = gysts.substring(i1);
            int length = str.length();
            if(length>2){
                gysts = gysts.substring(0, i1+3);
                //System.out.println("大于2:"+gysts);
            }else {
                gysts = gysts.substring(0, i1+length);
                //System.out.println("小于2:"+gysts);
            }
        }else {
            gysts = gysts+".00";
        }

        //②
        int i2 = gysta.indexOf(".");
        if(i2>0){
            String str = gysta.substring(i2);
            int length = str.length();
            if(length>2){
                gysta = gysta.substring(0, i2+3);
                //System.out.println("大于2:"+gysta);
            }else {
                gysta = gysta.substring(0, i2 + length);
                //System.out.println("小于2:"+gysta);
            }
        }else {
            gysta = gysta+".00";
        }

        //③
        int i3 = buriedServiceLightguide.indexOf(".");
        if(i3>0){
            String str = buriedServiceLightguide.substring(i3);
            int length = str.length();
            if(length>2){
                buriedServiceLightguide = buriedServiceLightguide.substring(0, i3+3);
                //System.out.println("大于2:"+buriedServiceLightguide);
            }else {
                buriedServiceLightguide = buriedServiceLightguide.substring(0, i3 + length);
                //System.out.println("小于2:"+buriedServiceLightguide);
            }
        }else {
            buriedServiceLightguide = buriedServiceLightguide+".00";
        }

        //④
        int i4 = wallCable.indexOf(".");
        if(i4>0){
            String str = wallCable.substring(i4);
            int length = str.length();
            if(length>2){
                wallCable = wallCable.substring(0, i4+3);
                //System.out.println("大于2:"+wallCable);
            }else {
                wallCable = wallCable.substring(0, i4 + length);
                //System.out.println("小于2:"+wallCable);
            }
        }else {
            wallCable = wallCable+".00";
        }

        //⑤
        int i5 = inBridgeCable.indexOf(".");
        if(i5>0){
            String str = inBridgeCable.substring(i5);
            int length = str.length();
            if(length>2){
                inBridgeCable = inBridgeCable.substring(0, i5+3);
                //System.out.println("大于2:"+inBridgeCable);
            }else {
                inBridgeCable = inBridgeCable.substring(0, i5 + length);
                //System.out.println("小于2:"+inBridgeCable);
            }
        }else {
            inBridgeCable = inBridgeCable+".00";
        }

        //⑥
        int i6 = gyfxts.indexOf(".");
        if(i6>0){
            String str = gyfxts.substring(i6);
            int length = str.length();
            if(length>2){
                gyfxts = gyfxts.substring(0, i6+3);
                //System.out.println("大于2:"+gyfxts);
            }else {
                gyfxts = gyfxts.substring(0, i6 + length);
                //System.out.println("小于2:"+gyfxts);
            }
        }else {
            gyfxts = gyfxts+".00";
        }


        int i = hnCableLengthService.insertHnCableLength(cableLengthId, gysts, gysta, buriedServiceLightguide,
                wallCable, inBridgeCable, gyfxts);
        return cableLengthId;
    }
}
