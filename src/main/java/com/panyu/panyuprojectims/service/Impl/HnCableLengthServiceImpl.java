package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnCableLengthDao;
import com.panyu.panyuprojectims.entity.HnCableLength;
import com.panyu.panyuprojectims.service.HnCableLengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnCableLengthServiceImpl implements HnCableLengthService{
    @Autowired
    private HnCableLengthDao hnCableLengthDao;


    //根据光缆长度表ID字段删除数据
    @Override
    public int deleteHnCableLengthByCableLengthId(String cableLengthId) {
        return hnCableLengthDao.deleteHnCableLengthByCableLengthId(cableLengthId);
    }

    //添加
    @Override
    public int insertHnCableLength(String cableLengthId, String gysts, String gysta,
                                   String buriedServiceLightguide, String wallCable,
                                   String inBridgeCable, String gyfxts) {
        //光缆线长度数据处理
        //①
        int i11 = gysts.indexOf(".");
        if(i11>0){
            String str = gysts.substring(i11);
            int length = str.length();
            if(length>2){
                gysts = gysts.substring(0, i11+3);
                System.out.println("大于2:"+gysts);
            }else {
                gysts = gysts.substring(0, i11+length);
                System.out.println("小于2:"+gysts);
            }
        }else {
            gysts = gysts+".00";
        }

        //②
        int i22 = gysta.indexOf(".");
        if(i22>0){
            String str = gysta.substring(i22);
            int length = str.length();
            if(length>2){
                gysta = gysta.substring(0, i22+3);
                System.out.println("大于2:"+gysta);
            }else {
                gysta = gysta.substring(0, i22 + length);
                System.out.println("小于2:"+gysta);
            }
        }else {
            gysta = gysta+".00";
        }

        //③
        int i33 = buriedServiceLightguide.indexOf(".");
        if(i33>0){
            String str = buriedServiceLightguide.substring(i33);
            int length = str.length();
            if(length>2){
                buriedServiceLightguide = buriedServiceLightguide.substring(0, i33+3);
                System.out.println("大于2:"+buriedServiceLightguide);
            }else {
                buriedServiceLightguide = buriedServiceLightguide.substring(0, i33 + length);
                System.out.println("小于2:"+buriedServiceLightguide);
            }
        }else {
            buriedServiceLightguide = buriedServiceLightguide+".00";
        }

        //④
        int i44 = wallCable.indexOf(".");
        if(i44>0){
            String str = wallCable.substring(i44);
            int length = str.length();
            if(length>2){
                wallCable = wallCable.substring(0, i44+3);
                System.out.println("大于2:"+wallCable);
            }else {
                wallCable = wallCable.substring(0, i44 + length);
                System.out.println("小于2:"+wallCable);
            }
        }else {
            wallCable = wallCable+".00";
        }

        //⑤
        int i55 = inBridgeCable.indexOf(".");
        if(i55>0){
            String str = inBridgeCable.substring(i55);
            int length = str.length();
            if(length>2){
                inBridgeCable = inBridgeCable.substring(0, i55+3);
                System.out.println("大于2:"+inBridgeCable);
            }else {
                inBridgeCable = inBridgeCable.substring(0, i55 + length);
                System.out.println("小于2:"+inBridgeCable);
            }
        }else {
            inBridgeCable = inBridgeCable+".00";
        }

        //⑥
        int i66 = gyfxts.indexOf(".");
        if(i66>0){
            String str = gyfxts.substring(i66);
            int length = str.length();
            if(length>2){
                gyfxts = gyfxts.substring(0, i66+3);
                System.out.println("大于2:"+gyfxts);
            }else {
                gyfxts = gyfxts.substring(0, i66 + length);
                System.out.println("小于2:"+gyfxts);
            }
        }else {
            gyfxts = gyfxts+".00";
        }
        return hnCableLengthDao.insertHnCableLength(cableLengthId,gysts,gysta, buriedServiceLightguide, wallCable, inBridgeCable, gyfxts);
    }
}