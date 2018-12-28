package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaArrivalPowerCordDao;
import com.panyu.panyuprojectims.entity.FaArrivalPowerCord;
import com.panyu.panyuprojectims.service.FaArrivalPowerCordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaArrivalPowerCordServiceImpl implements FaArrivalPowerCordService{
    @Autowired
    private FaArrivalPowerCordDao faArrivalPowerCordDao;


    @Override
    public String selectPowerCordVerifyingPhotos(String arrivalStatisticsId) {
        return faArrivalPowerCordDao.selectPowerCordVerifyingPhotos(arrivalStatisticsId);
    }
}