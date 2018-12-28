package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaVeneerExpansionDao;
import com.panyu.panyuprojectims.entity.FaVeneerExpansion;
import com.panyu.panyuprojectims.service.FaVeneerExpansionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaVeneerExpansionServiceImpl implements FaVeneerExpansionService{
    @Autowired
    private FaVeneerExpansionDao faVeneerExpansionDao;


    @Override
    public String selectVeneerVerifyingPhotos(String arrivalStatisticsId) {
        return faVeneerExpansionDao.selectVeneerVerifyingPhotos(arrivalStatisticsId);
    }
}