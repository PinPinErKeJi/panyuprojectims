package com.panyu.panyuprojectims.service;
import java.util.List;
import com.panyu.panyuprojectims.entity.PsNewCablingRack;
public interface PsNewCablingRackService{


    //添加
    int insertPsNewCablingRack(
            String newCablingRackId,
            String newCablingRackNumber,
            String rackDesignStart,
            String rackEquipmentSupplier,
            String rackEquipmentLinkman);

    //删除
    int deletePsNewCablingRack(String newCablingRackId);




}