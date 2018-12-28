package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.ProjectProgressService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProjectProgressServiceImpl implements ProjectProgressService{
    @Autowired
    private ProjectProgressDao projectProgressDao;
    @Autowired
    private SkyBranchDao skyBranchDao;
    @Autowired
    private ElectricPowerDao electricPowerDao;
    @Autowired
    private FireFightingDeviceDao fireFightingDeviceDao;
    @Autowired
    private MachineRoomDao machineRoomDao;
    @Autowired
    private MainEquipmentDao mainEquipmentDao;
    @Autowired
    private PowerMonitoringDao powerMonitoringDao;
    @Autowired
    private AirConditionerDao airConditionerDao;
    @Autowired
    private ModuleDao moduleDao;
    @Autowired
    private ProjectProgressService projectProgressService;
    //图片展示和模糊查询
    @Override
    public PageHelperUtil selectProjectProgressByPhoto(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String planningName,
            String actualName,
            String onSiteSupervision,
            String professionPeople,
            String districtHead,
            String regions) {
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
        if (planningName !=null && !planningName.equals("")){
            planningName = "%"+planningName+"%";
        }else {
            planningName = null;
        }
        if (actualName !=null && !actualName.equals("")){
            actualName = "%"+actualName+"%";
        }else {
            actualName = null;
        }
        if (onSiteSupervision !=null && !onSiteSupervision.equals("")){
            onSiteSupervision = "%"+onSiteSupervision+"%";
        }else {
            onSiteSupervision = null;
        }
        if (professionPeople !=null && !professionPeople.equals("")){
            professionPeople = "%"+professionPeople+"%";
        }else {
            professionPeople = null;
        }
        if (districtHead !=null && !districtHead.equals("")){
            districtHead = "%"+districtHead+"%";
        }else {
            districtHead = null;
        }
        if (regions !=null && !regions.equals("")){
            regions = "%"+regions+"%";
        }else {
            regions = null;
        }

        //分页处理
        PageHelper.startPage(start,rows);
        List<ProjectProgress> selectProjectProgressByPhotoList = projectProgressDao.selectProjectProgressByPhoto(page, rows, province, city, county, buildYear,operator, buildingProject, planningName, actualName, onSiteSupervision, professionPeople, districtHead, regions);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(selectProjectProgressByPhotoList);
        //设置返回总记录数
        PageInfo<ProjectProgress> info = new PageInfo<ProjectProgress>(selectProjectProgressByPhotoList);
        pageHelperUtil.setTotal(projectProgressDao.getPhotoCount(province,city,county,buildYear,operator,buildingProject,planningName,actualName,onSiteSupervision,professionPeople,districtHead,regions));
        return pageHelperUtil;
    }

    //查询导入信息的模块id
    public List<String> selectModuleId(String projectProgressId) {
        List<String> moduleIdList = new ArrayList<>();
        String moduleId = null;
                //根据类别id查询类别的建设方式以及类型
                SkyBranch skyBranch = skyBranchDao.selectByskyBranchId(projectProgressId);
                ElectricPower electricPower = electricPowerDao.SelectByElectricPowerId(projectProgressId);
                FireFightingDevice fireFightingDevice = fireFightingDeviceDao.SelectByFireId(projectProgressId);
                MachineRoom machineRoom = machineRoomDao.SelectByMachineRoomId(projectProgressId);
                MainEquipment mainEquipment = mainEquipmentDao.SelectByMainEquipmentId(projectProgressId);
                PowerMonitoring powerMonitoring = powerMonitoringDao.SelectByPowerMonitoringId(projectProgressId);
                AirConditioner airConditioner = airConditionerDao.SelectByAirConditionerId(projectProgressId);
                //1.天支判断建设方式
                if (skyBranch.getConstructionMode().equals("新建")) {
                    String skyBranchTypeName = skyBranch.getSkyBranchTypeName();
                    //System.out.println("天支类型:"+skyBranchTypeName);
                    switch (skyBranchTypeName) {
                        case "独管塔":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            //System.out.println("moduleId:"+moduleId);
                            moduleIdList.add(moduleId);
                            break;
                        case "美化独管塔":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "三管塔":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "四管塔":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "角钢塔":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "市政灯杆":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "可移动塔":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "美化集束天线":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "美化排气筒":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "美化空调":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "美化变色龙":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "美化水桶":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "美化方柱":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "增高架":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "抱杆":
                            moduleId = moduleDao.selectModuleId(skyBranchTypeName);
                            moduleIdList.add(moduleId);
                            break;
                    }
                }
                if(skyBranch.getConstructionMode().equals("利旧")){

                }
                if (skyBranch.getConstructionMode().equals("新增支臂")) {
                    moduleId = moduleDao.selectModuleId("新增支臂");
                    moduleIdList.add(moduleId);
                }
                //判断类型
                if (skyBranch.getConstructionMode().equals("新建")) {
                    String skyBranchBasicType = skyBranch.getBasicType();
                    switch (skyBranchBasicType) {
                        case "桩基":
                            moduleId = moduleDao.selectModuleId(skyBranchBasicType);
                            moduleIdList.add(moduleId);
                            break;
                        case "筏板基础":
                            moduleId = moduleDao.selectModuleId(skyBranchBasicType);
                            moduleIdList.add(moduleId);
                            break;
                    }
                }
                if (skyBranch.getConstructionMode().equals("利旧")) {
                    String skyBranchBasicType = skyBranch.getBasicType();
                    switch (skyBranchBasicType) {
                        case "桩基":
                            moduleId = moduleDao.selectModuleId(skyBranchBasicType);
                            moduleIdList.add(moduleId);
                            break;
                        case "筏板基础":
                            moduleId = moduleDao.selectModuleId(skyBranchBasicType);
                            moduleIdList.add(moduleId);
                            break;
                    }
                }
                if (skyBranch.getConstructionMode().equals("新增支臂")) {
                    String skyBranchBasicType = skyBranch.getBasicType();
                    switch (skyBranchBasicType) {
                        case "桩基":
                            moduleId = moduleDao.selectModuleId(skyBranchBasicType);
                            moduleIdList.add(moduleId);
                            break;
                        case "筏板基础":
                            moduleId = moduleDao.selectModuleId(skyBranchBasicType);
                            moduleIdList.add(moduleId);
                            break;
                    }
                }
                //2.机房建设方式判断
                if (machineRoom.getMachineRoomConstructionMode().equals("新建")) {
                    String machineRoomTypeName = machineRoom.getMachineRoomTypeName();
                    switch (machineRoomTypeName) {
                        case "自建房":
                            moduleId = moduleDao.selectModuleId("自建房");
                            moduleIdList.add(moduleId);
                            moduleId = moduleDao.selectModuleId("机房装修");
                            moduleIdList.add(moduleId);
                            moduleId = moduleDao.selectModuleId("电源配套");
                            moduleIdList.add(moduleId);
                            break;
                        case "可移动塔":
                            moduleId = moduleDao.selectModuleId("可移动塔");
                            moduleIdList.add(moduleId);
                            moduleId = moduleDao.selectModuleId("电源配套");
                            moduleIdList.add(moduleId);
                            break;
                        case "租赁机房":
                            moduleId = moduleDao.selectModuleId("租赁机房");
                            moduleIdList.add(moduleId);
                            moduleId = moduleDao.selectModuleId("电源配套");
                            moduleIdList.add(moduleId);
                            break;
                        case "MINI机柜":
                            moduleId = moduleDao.selectModuleId("MINI机柜");
                            moduleIdList.add(moduleId);
                            break;
                        case "路灯杆机柜":
                            moduleId = moduleDao.selectModuleId("路灯杆机柜");
                            moduleIdList.add(moduleId);
                            break;
                    }
                }
                if(machineRoom.getMachineRoomConstructionMode().equals("利旧")){

                }
                //3.外电引入建设方式判断
                if (electricPower.getElectricConstructionMode().equals("新建")) {
                    String electricType = electricPower.getElectricType();
                    switch (electricType) {
                        case "交流引入":
                            moduleId = moduleDao.selectModuleId(electricType);
                            moduleIdList.add(moduleId);
                            break;
                        case "直流远供":
                            moduleId = moduleDao.selectModuleId(electricType);
                            moduleIdList.add(moduleId);
                            break;
                    }
                }
                if (electricPower.getElectricConstructionMode().equals("利旧")){}
                //4.主设备建设方式判断
                if (mainEquipment.getEquipmentConstructionMode().equals("新建")) {
                    String equipmentTypeName = mainEquipment.getEquipmentTypeName();
                    //System.out.println("equipmentTypeName:"+equipmentTypeName);
                    switch (equipmentTypeName) {
                        case "常规主设备":
                            moduleId = moduleDao.selectModuleId(equipmentTypeName);
                            moduleIdList.add(moduleId);
                            break;
                        case "一体化主设备":
                            moduleId = moduleDao.selectModuleId(equipmentTypeName);
                            moduleIdList.add(moduleId);
                            break;
                    }
                }
                if (mainEquipment.getEquipmentConstructionMode().equals("利旧")){

                }
                //5.空调建设方式判断
                if (airConditioner.getAirConstructionMode().equals("新建")) {
                    moduleId = moduleDao.selectModuleId("空调");
                    //System.out.println("空调id:"+moduleId);
                    moduleIdList.add(moduleId);
                }
                if (airConditioner.getAirConstructionMode().equals("利旧")){}
                //6.消防设施建设方式判断
                if (fireFightingDevice.getFireConstructionMode().equals("新建")) {
                    moduleId = moduleDao.selectModuleId("消防设施");
                    moduleIdList.add(moduleId);
                }
                if (fireFightingDevice.getFireConstructionMode().equals("利旧")){}
                //7.动力环境监控判断键
                if (powerMonitoring.getPowerConstructionMode().equals("新建")) {
                    moduleId = moduleDao.selectModuleId("动力环境监控");
                    moduleIdList.add(moduleId);
                }
                if (powerMonitoring.getPowerConstructionMode().equals("利旧")){}

                //8.安全管理
                moduleId = moduleDao.selectModuleId("安全管理");
                //System.out.println("安全管理id:"+moduleId);
                moduleIdList.add(moduleId);
                //System.out.println("模块ID:"+moduleIdList);
        return moduleIdList;
    }

    //基站信息展示和模糊查询
    @Override
    public PageHelperUtil selectProjectProgress(
            int page,int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String operator,
            String buildingProject,
            String planningName,
            String actualName,
            String regions,
            String onSiteSupervision,
            String professionPeople,
            String districtHead) {
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
        if (buildingProject !=null && !buildingProject.equals("")){
            buildingProject = "%"+buildingProject+"%";
        }else {
            buildingProject = null;
        }
        if (planningName !=null && !planningName.equals("")){
            planningName = "%"+planningName+"%";
        }else {
            planningName = null;
        }
        if (actualName !=null && !actualName.equals("")){
            actualName = "%"+actualName+"%";
        }else {
            actualName = null;
        }
        if (regions !=null && !regions.equals("")){
            regions = "%"+regions+"%";
        }else {
            regions = null;
        }
        if (onSiteSupervision !=null && !onSiteSupervision.equals("")){
            onSiteSupervision = "%"+onSiteSupervision+"%";
        }else {
            onSiteSupervision = null;
        }
        if (professionPeople !=null && !professionPeople.equals("")){
            professionPeople = "%"+professionPeople+"%";
        }else {
            professionPeople = null;
        }
        if (districtHead !=null && !districtHead.equals("")){
            districtHead = "%"+districtHead+"%";
        }else {
            districtHead = null;
        }


        //分页处理
        PageHelper.startPage(start,rows);
        List<ProjectProgress> projectProgressList = projectProgressDao.selectProjectProgress(page, rows, province, city, county, buildYear,operator, buildingProject,planningName,actualName,regions,onSiteSupervision,
                professionPeople,districtHead);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        //设置返回结果
        pageHelperUtil.setRows(projectProgressList);
        //设置返回总记录数
        PageInfo<ProjectProgress> info = new PageInfo<ProjectProgress>(projectProgressList);
        pageHelperUtil.setTotal(projectProgressDao.getProjectProgressRowCount(province,city,county,buildYear,operator,buildingProject,planningName,actualName,regions,onSiteSupervision,
                professionPeople,districtHead));
        return pageHelperUtil;
    }

    //工程基本信息数据添加
    @Override
    public boolean insertProjectProgress(
            String projectProgressId,
            String operator,
            String buildYear,
            String buildingProject,
            String planningName,
            String actualName,
            String planningLongitude,
            String planningLatitude,
            String actualLongitude,
            String actualLatitudes,
            String province,
            String city,
            String county,
            String regions,
            String onSiteSupervision,
            String professionPeople,
            String districtHead,
            String overlayScene,
            String skyBranchId,
            String machineRoomId,
            String electricPowerId,
            String mainEquipmentId,
            String airConditionerId,
            String fireId,
            String powerMonitoringId){
        projectProgressId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        //经纬度数据处理
        //①
        int i1 = planningLongitude.indexOf(".");
        //System.out.println("i1:"+i1);
        if(i1>0){
            String str = planningLongitude.substring(i1);
            //System.out.println("str1:"+str);
            int length = str.length();
            //System.out.println("length1:"+length);
            if(length>6){
                planningLongitude = planningLongitude.substring(0, i1+7);
                //System.out.println("大于6:"+planningLongitude);
            }else {
                planningLongitude = planningLongitude.substring(0, i1+length);
                //System.out.println("小于6:"+planningLongitude);
            }
        }else {
            planningLongitude = planningLongitude.substring(0)+".000000";
        }
        //②
        int i3 = planningLatitude.indexOf(".");
        if(i3>0){
            String str = planningLatitude.substring(i3);
            int length = str.length();
            if(length>6){
                planningLatitude = planningLatitude.substring(0, i3+7);
                //System.out.println("大于6:"+planningLatitude);
            }else {
                planningLatitude = planningLatitude.substring(0, i3 + length);
                //System.out.println("小于6:"+planningLatitude);
            }
        }else {
            planningLatitude = planningLatitude.substring(0)+".000000";
        }
        //③
        int i4 = actualLongitude.indexOf(".");
        if(i4>0){
            String str = actualLongitude.substring(i4);
            int length = str.length();
            if(length>6){
                actualLongitude = actualLongitude.substring(0, i4+7);
                //System.out.println("大于6:"+actualLongitude);
            }else {
                actualLongitude = actualLongitude.substring(0, i4 + length);
                //System.out.println("小于6:"+actualLongitude);
            }
        }else {
            actualLongitude = actualLongitude.substring(0)+".000000";
        }
        //④
        int i5 = actualLatitudes.indexOf(".");
        if(i5>0){
            String str = actualLatitudes.substring(i5);
            int length = str.length();
            if(length>6){
                actualLatitudes = actualLatitudes.substring(0, i5+7);
                //System.out.println("大于6:"+actualLatitudes);
            }else {
                actualLatitudes = actualLatitudes.substring(0, i5 + length);
                //System.out.println("小于6:"+actualLatitudes);
            }
        }else {
            actualLatitudes = actualLatitudes.substring(0)+".000000";
        }

        boolean flag = true;
        try{
            if(skyBranchId != null &machineRoomId != null &electricPowerId != null &mainEquipmentId != null &airConditionerId != null& fireId != null & powerMonitoringId != null){
                int i = projectProgressDao.insertProjectProgress(
                        projectProgressId,
                        operator,
                        buildYear,
                        buildingProject,
                        planningName,
                        actualName,
                        planningLongitude,
                        planningLatitude,
                        actualLongitude,
                        actualLatitudes,
                        province,
                        city,
                        county,
                        regions,
                        onSiteSupervision,
                        professionPeople,
                        districtHead,
                        overlayScene,
                        skyBranchId,
                        machineRoomId,
                        electricPowerId,
                        mainEquipmentId,
                        airConditionerId,
                        fireId,
                        powerMonitoringId);
                System.out.println("添加成功");
            }else {
                flag = false;
                System.out.println("添加失败");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常");
        }
        return flag;
    }

//-----------------------------------删除方法开始---------------------------------------------//
    @Override
    public String selectProjectProgressBySkyId(String projectProgressId){
        return projectProgressDao.selectProjectProgressBySkyId(projectProgressId);
    }

    @Override
    public String selectProjectProgressByMachId(String projectProgressId) {
        return projectProgressDao.selectProjectProgressByMachId(projectProgressId);
    }

    @Override
    public String selectProjectProgressByElectricId(String projectProgressId) {
        return projectProgressDao.selectProjectProgressByElectricId(projectProgressId);
    }

    @Override
    public String selectProjectProgressByMainId(String projectProgressId) {
        return projectProgressDao.selectProjectProgressByMainId(projectProgressId);
    }

    @Override
    public String selectProjectProgressByAirId(String projectProgressId) {
        return projectProgressDao.selectProjectProgressByAirId(projectProgressId);
    }

    @Override
    public String selectProjectProgressByFireId(String projectProgressId) {
        return projectProgressDao.selectProjectProgressByFireId(projectProgressId);
    }

    @Override
    public String selectProjectProgressByPowerId(String projectProgressId) {
        return projectProgressDao.selectProjectProgressByPowerId(projectProgressId);
    }

    @Override
    public int deleteProjectProgressById(String projectProgressId){
        return projectProgressDao.deleteProjectProgressById(projectProgressId);
    }
//-----------------------------------删除方法结束---------------------------------------------//

//导出Excel空表格
    @Override
    public List<ProjectProgress> importProjectProgressExcel() {
        return projectProgressDao.importProjectProgressExcel();
    }

//导出数据
    @Override
    public List<ProjectProgress> ProjectProgressExcel(String[] ids) {
        return projectProgressDao.ProjectProgressExcel(ids);
    }
//导入数据
@Override
public boolean add(String projectProgressId,String powerConstructionMode,
                   String powerSupplierName, String powerSupplierContacts, String powerUnitName,
                   String powerUnitContacts,String equipmentConstructionMode, String equipmentTypeName,
                   String equipmentSupplierName, String equipmentSupplierContacts, String equipmentUnitName,
                   String equipmentUnitContacts,String machineRoomConstructionMode, String machineRoomTypeName,
                   String machineRoomConstructionName, String civilEngineeringContacts,
                   String machineRoomDecorateName, String decorationUnitContacts,String fireConstructionMode,
                   String handHeldNumber,
                   String sprayingMethodNumber, String fireSupplierName,
                   String fireSupplierContacts, String installationUnitName, String installationUnitContacts,
                   String electricConstructionMode, String electricType, String electricUnitName, String electricUnitContacts,
                   String airConstructionMode, String conditioningBrandName, String specificationTypeName, String airUnitName,
                   String airConstructionContacts, String constructionMode, String basicType,
                   String foundationConstructionName, String basicUnitContacts, String skyBranchTypeName,
                   String skyBranchSupplierName, String skyBranchSupplierContacts, String skyBranchUnitName,
                   String skyConstructionUnitContacts,
                   String skyBranchHeight,String operator, String buildYear, String buildingProject, String planningName,
                   String actualName, String planningLongitude, String planningLatitude, String actualLongitude,
                   String actualLatitudes, String province, String city, String county, String regions, String onSiteSupervision,
                   String professionPeople, String districtHead, String overlayScene,String skyBranchId,
                   String machineRoomId, String electricPowerId, String mainEquipmentId, String airConditionerId, String fireId,
                   String powerMonitoringId) {
    //经纬度数据处理
    //①
    int i11 = planningLongitude.indexOf(".");
    System.out.println("i1:"+i11);
    if(i11>0){
        String str = planningLongitude.substring(i11);
        //System.out.println("str1:"+str);
        int length = str.length();
        //System.out.println("length1:"+length);
        if(length>6){
            planningLongitude = planningLongitude.substring(0, i11+7);
           /// System.out.println("大于6:"+planningLongitude);
        }else {
            planningLongitude = planningLongitude.substring(0, i11+length);
            //System.out.println("小于6:"+planningLongitude);
        }
    }else {
        planningLongitude = planningLongitude.substring(0,i11);
    }
    //②
    int i31 = planningLatitude.indexOf(".");
    if(i31>0){
        String str = planningLatitude.substring(i31);
        int length = str.length();
        if(length>6){
            planningLatitude = planningLatitude.substring(0, i31+7);
            //System.out.println("大于6:"+planningLatitude);
        }else {
            planningLatitude = planningLatitude.substring(0, i31 + length);
            //System.out.println("小于6:"+planningLatitude);
        }
    }else {
        planningLatitude = planningLatitude.substring(0,i31);
    }
    //③
    int i41 = actualLongitude.indexOf(".");
    if(i41>0){
        String str = actualLongitude.substring(i41);
        int length = str.length();
        if(length>6){
            actualLongitude = actualLongitude.substring(0, i41+7);
            //System.out.println("大于6:"+actualLongitude);
        }else {
            actualLongitude = actualLongitude.substring(0, i41 + length);
            //System.out.println("小于6:"+actualLongitude);
        }
    }else {
        actualLongitude = actualLongitude.substring(0,i41);
    }
    //④
    int i51 = actualLatitudes.indexOf(".");
    if(i51>0){
        String str = actualLatitudes.substring(i51);
        int length = str.length();
        if(length>6){
            actualLatitudes = actualLatitudes.substring(0, i51+7);
           // System.out.println("大于6:"+actualLatitudes);
        }else {
            actualLatitudes = actualLatitudes.substring(0, i51 + length);
            //System.out.println("小于6:"+actualLatitudes);
        }
    }else {
        actualLatitudes = actualLatitudes.substring(0,i51);
    }
    int ii = handHeldNumber.indexOf(".");
    if(ii<0){
        //System.out.println("handHeldNumber+i:"+ii);
        handHeldNumber = handHeldNumber;
        //System.out.println("handHeldNumber:"+handHeldNumber);
        sprayingMethodNumber=sprayingMethodNumber;
    }else {
        //System.out.println("handHeldNumber+i:"+ii);
        handHeldNumber = handHeldNumber.substring(0,ii);
        //System.out.println("handHeldNumber:"+handHeldNumber);
        sprayingMethodNumber=sprayingMethodNumber.substring(0,ii);
    }
    boolean flag = true;
    airConditionerId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    electricPowerId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    skyBranchId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    powerMonitoringId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    mainEquipmentId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    machineRoomId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
    fireId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

    projectProgressId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();


    int i = skyBranchDao.insertSkyBranch(
            skyBranchId, constructionMode,
            basicType, foundationConstructionName,
            basicUnitContacts, skyBranchTypeName,
            skyBranchSupplierName, skyBranchSupplierContacts,
            skyBranchUnitName, skyConstructionUnitContacts, skyBranchHeight);
    int i1 = airConditionerDao.insertAirConditioner(airConditionerId, airConstructionMode,
            conditioningBrandName, specificationTypeName, airUnitName, airConstructionContacts);
    int i2 = electricPowerDao.insertElectricPower(electricPowerId, electricConstructionMode, electricType, electricUnitName, electricUnitContacts);
    int i3 = fireFightingDeviceDao.insertFireFightingDevice(fireId, fireConstructionMode,
            handHeldNumber,
            sprayingMethodNumber, fireSupplierName, fireSupplierContacts, installationUnitName, installationUnitContacts);
    int i4 = machineRoomDao.insertMachineRoom(machineRoomId, machineRoomConstructionMode,
            machineRoomTypeName, machineRoomConstructionName, civilEngineeringContacts, machineRoomDecorateName,
            decorationUnitContacts);
    int i5 = mainEquipmentDao.insertMainEquipment(mainEquipmentId, equipmentConstructionMode,
            equipmentTypeName, equipmentSupplierName, equipmentSupplierContacts, equipmentUnitName, equipmentUnitContacts);
    int i6 = powerMonitoringDao.insertPowerMonitoring(powerMonitoringId, powerConstructionMode,
            powerSupplierName, powerSupplierContacts, powerUnitName, powerUnitContacts);
    if(i>0&i1>0&i2>0&i3>0&i4>0&i5>0&i6>0){
        int i7 = projectProgressDao.insertProjectProgress(
                projectProgressId,
                operator,
                buildYear,
                buildingProject,
                planningName,
                actualName,
                planningLongitude,
                planningLatitude,
                actualLongitude,
                actualLatitudes,
                province,
                city,
                county,
                regions,
                onSiteSupervision,
                professionPeople,
                districtHead,
                overlayScene,
                skyBranchId,
                machineRoomId,
                electricPowerId,
                mainEquipmentId,
                airConditionerId,
                fireId,
                powerMonitoringId);
        flag = true;
        System.out.println("导入成功");
    }else {
        flag = false;
        System.out.println("导入失败");
    }
    return flag;
}
}