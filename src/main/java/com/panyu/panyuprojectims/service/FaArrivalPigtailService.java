package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.FaArrivalPigtail;
public interface FaArrivalPigtailService{

    //到货信息表、尾纤，跳纤表链表查询 到货图片
    String selectPigtailVerifyingPhotos(String arrivalStatisticsId);

}