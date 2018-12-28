package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaArrivalPigtailDao;
import com.panyu.panyuprojectims.entity.FaArrivalPigtail;
import com.panyu.panyuprojectims.service.FaArrivalPigtailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaArrivalPigtailServiceImpl implements FaArrivalPigtailService{
    @Autowired
    private FaArrivalPigtailDao faArrivalPigtailDao;


    @Override
    public String selectPigtailVerifyingPhotos(String arrivalStatisticsId) {
        return faArrivalPigtailDao.selectPigtailVerifyingPhotos(arrivalStatisticsId);
    }
}