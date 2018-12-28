package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.IcCableLengthDao;
import com.panyu.panyuprojectims.service.IcCableLengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IcCableLengthServiceImpl implements IcCableLengthService{
    @Autowired
    private IcCableLengthDao icCableLengthDao;

    //添加
    @Override
    public int insertIcCableLength(String cableLengthId, String networkLine, String photoelectricCompositeCable,
                                    String sevenEighthsFeeder, String ahalfFeeder) {

        int i1 = networkLine.indexOf(".");
        if(i1>0){
            String str = networkLine.substring(i1);
            int length = str.length();
            if(length>2){
                networkLine = networkLine.substring(0, i1+3);
                //System.out.println("大于2:"+networkLine);
            }else {
                networkLine = networkLine.substring(0, i1 + length);
                //System.out.println("小于2:"+networkLine);
            }
        }else {
            networkLine = networkLine+".00";
        }

        int i2 = photoelectricCompositeCable.indexOf(".");
        if(i2>0){
            String str = photoelectricCompositeCable.substring(i2);
            int length = str.length();
            if(length>2){
                photoelectricCompositeCable = photoelectricCompositeCable.substring(0, i2+3);
                //System.out.println("大于2:"+photoelectricCompositeCable);
            }else {
                photoelectricCompositeCable = photoelectricCompositeCable.substring(0, i2 + length);
                //System.out.println("小于2:"+photoelectricCompositeCable);
            }
        }else {
            photoelectricCompositeCable = photoelectricCompositeCable+".00";
        }
        int i3 = sevenEighthsFeeder.indexOf(".");
        if(i3>0){
            String str = sevenEighthsFeeder.substring(i3);
            int length = str.length();
            if(length>2){
                sevenEighthsFeeder = sevenEighthsFeeder.substring(0, i3+3);
                //System.out.println("大于2:"+sevenEighthsFeeder);
            }else {
                sevenEighthsFeeder = sevenEighthsFeeder.substring(0, i3 + length);
                //System.out.println("小于2:"+sevenEighthsFeeder);
            }
        }else {
            sevenEighthsFeeder = sevenEighthsFeeder+".00";
        }
        int i4 = ahalfFeeder.indexOf(".");
        if(i4>0){
            String str = ahalfFeeder.substring(i4);
            int length = str.length();
            if(length>2){
                ahalfFeeder = ahalfFeeder.substring(0, i4+3);
                //System.out.println("大于2:"+ahalfFeeder);
            }else {
                ahalfFeeder = ahalfFeeder.substring(0, i4 + length);
                //System.out.println("小于2:"+ahalfFeeder);
            }
        }else {
            ahalfFeeder = ahalfFeeder+".00";
        }
        return icCableLengthDao.insertIcCableLength(cableLengthId,networkLine,photoelectricCompositeCable,
                                                        sevenEighthsFeeder,ahalfFeeder);
    }

    //根据线缆长度表ID删除选中项
    @Override
    public int deleteIcCableLengthById(String cableLengthId) {
        return icCableLengthDao.deleteIcCableLengthById(cableLengthId);
    }
}