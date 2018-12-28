package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaStatisticsNewEquipmentDao;
import com.panyu.panyuprojectims.entity.FaStatisticsNewEquipment;
import com.panyu.panyuprojectims.service.FaStatisticsNewEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaStatisticsNewEquipmentServiceImpl implements FaStatisticsNewEquipmentService{
    @Autowired
    private FaStatisticsNewEquipmentDao faStatisticsNewEquipmentDao;


    @Override
    public String selectEquipmentVerifyingPhotos(String arrivalStatisticsId) {
        return faStatisticsNewEquipmentDao.selectEquipmentVerifyingPhotos(arrivalStatisticsId);
    }
}