package com.panyu.panyuprojectims.service.Impl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.PowerSupplyInformationService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PowerSupplyInformationServiceImpl implements PowerSupplyInformationService{
    @Autowired
    private PowerSupplyInformationDao powerSupplyInformationDao;
    @Autowired
    private PsNewEquipmentDao psNewEquipmentDao;
    @Autowired
    private PsNewPowerCableDao psNewPowerCableDao;
    @Autowired
    private PsNewCablingRackDao psNewCablingRackDao;
    @Autowired
    private PowerSupplyModuleDao powerSupplyModuleDao;

    //基站信息展示和模糊查询
    @Override
    public PageHelperUtil selectPowerSupplyInformation(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String motorRoomName,
            String siteSupervision,
            String projectLeader) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (province !=null && !province.equals("")){
            province = "%"+province+"%";
        }else {
            province = null;
        }
        if (city !=null && !city.equals("")){
            city = "%"+city+"%";
        }else {
            city = null;
        }
        if (county !=null && !county.equals("")){
            county = "%"+county+"%";
        }else {
            county = null;
        }
        if (buildYear !=null && !buildYear.equals("")){
            buildYear = "%"+buildYear+"%";
        }else {
            buildYear = null;
        }
        if (operator !=null && !operator.equals("")){
            operator = "%"+operator+"%";
        }else {
            operator = null;
        }
        if (buildingProject !=null && !buildingProject.equals("")){
            buildingProject = "%"+buildingProject+"%";
        }else {
            buildingProject = null;
        }
        if (motorRoomName !=null && !motorRoomName.equals("")){
            motorRoomName = "%"+motorRoomName+"%";
        }else {
            motorRoomName = null;
        }
        if (siteSupervision !=null && !siteSupervision.equals("")){
            siteSupervision = "%"+siteSupervision+"%";
        }else {
            siteSupervision = null;
        }
        if (projectLeader !=null && !projectLeader.equals("")){
            projectLeader = "%"+projectLeader+"%";
        }else {
            projectLeader = null;
        }

        //分页处理
        PageHelper.startPage(start,rows);
        List<PowerSupplyInformation> powerSupplyInformationList = powerSupplyInformationDao.selectPowerSupplyInformation(page,rows,province,city,county,buildYear,operator,buildingProject,motorRoomName,siteSupervision,projectLeader);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(powerSupplyInformationList);
        //设置返回总记录数
        PageInfo<PowerSupplyInformation> info = new PageInfo<PowerSupplyInformation>(powerSupplyInformationList);
        pageHelperUtil.setTotal(powerSupplyInformationDao.getPowerSupplyInformationRowCount(province,city,county,buildYear,operator,buildingProject,motorRoomName,siteSupervision,projectLeader));
        return pageHelperUtil;
    }
    //添加
    @Override
    public boolean insertPowerSupplyInformation(String powerInformationId, String operator, String buildYear,
                                                String buildingProject, String motorRoomName, String motorRoomLongitude,
                                                String motorRoomLatitude, String province, String city, String county,
                                                String siteSupervision, String projectLeader, String powerEquipmentId,
                                                String newPowerCableId, String newCablingRackId) {
        boolean flag = true;
        powerInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        //经纬度数据处理
        //①
        int i1 = motorRoomLongitude.indexOf(".");
        if(i1>0){
            String str = motorRoomLongitude.substring(i1);
            int length = str.length();
            if(length>6){
                motorRoomLongitude = motorRoomLongitude.substring(0, i1+7);
            }else {
                motorRoomLongitude = motorRoomLongitude.substring(0, i1+length);
            }
        }else {
            motorRoomLongitude = motorRoomLongitude.substring(0)+".000000";
        }
        //②
        int i2 = motorRoomLatitude.indexOf(".");
        if(i2>0){
            String str = motorRoomLatitude.substring(i2);
            int length = str.length();
            if(length>6){
                motorRoomLatitude = motorRoomLatitude.substring(0, i2+7);
            }else {
                motorRoomLatitude = motorRoomLatitude.substring(0, i2 + length);
            }
        }else {
            motorRoomLatitude = motorRoomLatitude.substring(0)+".000000";
        }

        int i = powerSupplyInformationDao.insertPowerSupplyInformation(powerInformationId,
                operator,
                buildYear,
                buildingProject,
                motorRoomName,
                motorRoomLongitude,
                motorRoomLatitude,
                province,
                city,
                county,
                siteSupervision,
                projectLeader,
                powerEquipmentId,
                newPowerCableId,
                newCablingRackId);
        if(i > 0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //根据信息ID查询关联的小表ID
    @Override
    public String selectPowerEquipmentId(String powerInformationId) {
        return powerSupplyInformationDao.selectPowerEquipmentId(powerInformationId);
    }
    @Override
    public String selectNewPowerCableId(String powerInformationId) {
        return powerSupplyInformationDao.selectNewPowerCableId(powerInformationId);
    }
    @Override
    public String selectNewCablingRackId(String powerInformationId) {
        return powerSupplyInformationDao.selectNewCablingRackId(powerInformationId);
    }
    //删除
    @Override
    public int deletePowerSupplyInformation(String powerInformationId) {
        return powerSupplyInformationDao.deletePowerSupplyInformation(powerInformationId);
    }

    //导出空表格
    @Override
    public List<PowerSupplyInformation> importPowerSupplyInformationExcel() {
        return powerSupplyInformationDao.importPowerSupplyInformationExcel();
    }

    //导出数据
    @Override
    public List<PowerSupplyInformation> powerSupplyInformationExcel(String[] ids) {
        return powerSupplyInformationDao.powerSupplyInformationExcel(ids);
    }

    //导入数据
    @Override
    public boolean addPowerSupplyInformation(String powerInformationId, String operator, String buildYear, String buildingProject, String motorRoomName, String motorRoomLongitude, String motorRoomLatitude, String province, String city, String county, String siteSupervision, String projectLeader,
                                             String powerEquipmentId, String newPowerCableId, String newCablingRackId, String powerEquipmentNumber, String powerEquipmentType, String powerEquipmentModel, String equipmentDesignStart, String powerEquipmentSize, String powerEquipmentSupplier, String powerEquipmentLinkman, String newPowerCableNumber, String newPowerCableModel, String newPowerCableRow, String powerSingleLength, String powerTotalLength, String beFrom, String beTo, String cableEquipmentSupplier, String cableEquipmentLinkman, String newCablingRackNumber, String rackDesignStart, String rackEquipmentSupplier, String rackEquipmentLinkman) {
        boolean flag = true;

        powerInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        powerEquipmentId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        newPowerCableId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        newCablingRackId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        int i = psNewEquipmentDao.insertPsNewEquipment(powerEquipmentId,
                                                         powerEquipmentNumber,
                                                         powerEquipmentType,
                                                         powerEquipmentModel,
                                                         equipmentDesignStart,
                                                         powerEquipmentSize,
                                                         powerEquipmentSupplier,
                                                         powerEquipmentLinkman);
        int i1 = psNewPowerCableDao.insertPsNewPowerCable(newPowerCableId,
                                                             newPowerCableNumber,
                                                             newPowerCableModel,
                                                             newPowerCableRow,
                                                             powerSingleLength,
                                                             powerTotalLength,
                                                             beFrom,
                                                             beTo,
                                                             cableEquipmentSupplier,
                                                             cableEquipmentLinkman);
        int i2 = psNewCablingRackDao.insertPsNewCablingRack(newCablingRackId,
                                                              newCablingRackNumber,
                                                              rackDesignStart,
                                                              rackEquipmentSupplier,
                                                              rackEquipmentLinkman);
        int i3 = powerSupplyInformationDao.insertPowerSupplyInformation( powerInformationId,
                                                                             operator,
                                                                             buildYear,
                                                                             buildingProject,
                                                                             motorRoomName,
                                                                             motorRoomLongitude,
                                                                             motorRoomLatitude,
                                                                             province,
                                                                             city,
                                                                             county,
                                                                             siteSupervision,
                                                                             projectLeader,
                                                                             powerEquipmentId,
                                                                             newPowerCableId,
                                                                             newCablingRackId);
        if(i >0 && i1 >0 && i2 >0 && i3 >0 ){
            System.out.println("导入成功");
            flag = true;
        }else {
            System.out.println("导入失败");
            flag = false;
        }
        return flag;
    }

    //根据信息id查询包含的模块id
    @Override
    public List<String> selectPowerModuleIdList(String powerInformationId) {
        List<String> powerModuleIdList = new ArrayList<>();
        PowerSupplyModule powerSupplyModule = new PowerSupplyModule();
        //根据导入信息id查询对应的其他信息
        PsNewEquipment psNewEquipment = psNewEquipmentDao.selectPsNewEquipmentByPowerInformationId(powerInformationId);
        PsNewPowerCable psNewPowerCable = psNewPowerCableDao.selectPsNewPowerCableByPowerInformationId(powerInformationId);
        PsNewCablingRack psNewCablingRack = psNewCablingRackDao.selectPsNewCablingRackByPowerInformationId(powerInformationId);
        //新增设备
        String powerEquipmentType = psNewEquipment.getPowerEquipmentType();
        if(powerEquipmentType != null && !powerEquipmentType.equals("")){
            switch (powerEquipmentType){
                case "高频开关电源":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    //System.out.println("1:"+powerSupplyModule.getPowerModuleId());
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "直流配电屏":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "交流配电屏":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "UPS设备":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "UPS输入配电柜":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "UPS输出配电柜":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "蓄电池":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "柴油发电机":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "油机配电柜":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "油市转换柜":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "机房专用空调":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "舒适性空调":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
                case "空调配电柜":
                    powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName(powerEquipmentType);
                    powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
                    break;
            }
            if(psNewCablingRack != null){
                powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName("走线架");
                //System.out.println("2:"+powerSupplyModule.getPowerModuleId());
                powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
            }
            if(psNewPowerCable != null){
                powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName("电力电缆");
                //System.out.println("3:"+powerSupplyModule.getPowerModuleId());
                powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
            }
             powerSupplyModule = powerSupplyModuleDao.selectPowerSupplyModuleByPowerModuleName("安全管理");
            //System.out.println("4:"+powerSupplyModule.getPowerModuleId());
            powerModuleIdList.add(powerSupplyModule.getPowerModuleId());
        }
        return powerModuleIdList;
    }


}