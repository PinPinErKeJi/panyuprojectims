package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.IndoorCoverageInformationService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class IndoorCoverageInformationServiceImpl implements IndoorCoverageInformationService{
    @Autowired
    private IndoorCoverageInformationDao indoorCoverageInformationDao;
    @Autowired
    private IcSupervisoryUnitDao icSupervisoryUnitDao;
    @Autowired
    private IcConstructionOrganizationDao icConstructionOrganizationDao;
    @Autowired
    private IcDesignUnitDao icDesignUnitDao;
    @Autowired
    private IcBbuNumberDao icBbuNumberDao;
    @Autowired
    private IcLightDistriputionNumberDao icLightDistriputionNumberDao;
    @Autowired
    private IcPassiveDeviceNumberDao icPassiveDeviceNumberDao;
    @Autowired
    private IcAntennaNumberDao icAntennaNumberDao;
    @Autowired
    private IcCableLengthDao icCableLengthDao;
    @Autowired
    private IndoorCoverageModuleDao indoorCoverageModuleDao;


    //根据信息id查询包含的模块id
    @Override
    public List<String> selectIndoorCoverageIdList(String indoorInformationId) {
        List<String> indoorCoverageIdList = new ArrayList<>();
        //根据信息id查询对应的对象

        IcBbuNumber ic1 = icBbuNumberDao.selectIcBbuNumberByIndoorInformationId(indoorInformationId);
        IcLightDistriputionNumber ic2 = icLightDistriputionNumberDao.selectIcLightDistriputionNumberByIndoorInformationId(indoorInformationId);
        IcPassiveDeviceNumber ic3 = icPassiveDeviceNumberDao.selectIcPassiveDeviceNumberByIndoorInformationId(indoorInformationId);
        IcAntennaNumber ic4 = icAntennaNumberDao.selectIcAntennaNumberByIndoorInformationId(indoorInformationId);
        IcCableLength ic5 = icCableLengthDao.selectIcCableLengthByIndoorInformationId(indoorInformationId);

        //4.室内覆盖BBU数量表
        if(ic1.getCentralization() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("BBU(集中放置)");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("1:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic1.getWallHangingWall() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("BBU(小区挂墙)");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("2:"+indoorCoverageModule.getIndoorCoverageId());
        }

        //5.光分布设备数量表
        if(ic2.getEasyMacro() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("Easy Macro");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("3:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic2.getBookrruNotIntegratedAntenna() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("BOOK RRU(不集成天线)");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("4:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic2.getBookrruIntegratedAntenna() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("BOOK RRU(集成天线)");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("5:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic2.getHub() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("HUB");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("6:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic2.getPruIntegratedAntenna() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("PRU(集成天线)");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("7:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic2.getPruNotIntegratedAntenna() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("PRU(不集成天线)");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("8:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic2.getAccessUnit() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("接入单元(近端)");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("9:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic2.getExtensionUnit() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("扩展单元");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("10:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic2.getRemoteDeviceIndoor() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("远端设备(室内)");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("11:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic2.getRemoteDeviceOutdoor() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("远端设备(室外)");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("12:"+indoorCoverageModule.getIndoorCoverageId());
        }
        //6.无源器件数量
        if(ic3.getPowerDivider() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("功分器");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("13:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic3.getCoupler() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("耦合器");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("14:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic3.getRoadConnector() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("合路器");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
           // System.out.println("15:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic3.getLoadNumber() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("负载");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("16:"+indoorCoverageModule.getIndoorCoverageId());
        }
        //7.天线数量
        if(ic4.getIndoorAntenna() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("室内天线");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("17:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic4.getOutdoorAntenna() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("室外天线");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("18:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic4.getElevatorAntenna() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("电梯天线");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("19:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic4.getGpsAntenna() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("GPS天线");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("20:"+indoorCoverageModule.getIndoorCoverageId());
        }
        //8.线缆长度表
        if(ic5.getNetworkLine() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("网线");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("21:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic5.getPhotoelectricCompositeCable() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("光电复合缆");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("22:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic5.getSevenEighthsFeeder() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("八分之七英寸馈线");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("23:"+indoorCoverageModule.getIndoorCoverageId());
        }
        if(ic5.getAhalfFeeder() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("二分之一英寸馈线");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("24:"+indoorCoverageModule.getIndoorCoverageId());
        }
        IndoorCoverageInformation indoorCoverageInformation = indoorCoverageInformationDao.selectIndoorCoverageInformationByIndoorInformationId(indoorInformationId);
        //PRU
        if(indoorCoverageInformation.getRruNumber() != null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("RRU");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("25:"+indoorCoverageModule.getIndoorCoverageId());
        }
        //电表
        if(indoorCoverageInformation.getAmmeterNumber()!= null){
            IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("电表");
            indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
            //System.out.println("26:"+indoorCoverageModule.getIndoorCoverageId());
        }
        //安全管理
        IndoorCoverageModule indoorCoverageModule = indoorCoverageModuleDao.selectIndoorCoverageModuleByIndoorCoverageName("安全管理");
        indoorCoverageIdList.add(indoorCoverageModule.getIndoorCoverageId());
        //System.out.println("27:"+indoorCoverageModule.getIndoorCoverageId());


        return indoorCoverageIdList;
    }

    //添加
    @Override
    public int insertIndoorCoverageInformation(String indoorInformationId, String operator, String buildingProject,
                                               String buildYear, String planStationName, String actualStationName,
                                               String indoorLongitude, String indoorLatitude, String province, String city,
                                               String county, String subordinateDepartment, String coverType,
                                               String icSupervisoryUnitId, String icConstructionId,
                                               String icDesignUnitId, String bbuNumberId,String rruNumber, String lightNumberId,
                                               String passiveDeviceNumberId, String antennaNumberId, String cableLengthId,
                                               String ammeterNumber) {
        //经纬度数据处理
        //①
        int i11 = indoorLongitude.indexOf(".");
        System.out.println("i11:"+i11);
        if(i11>0){
            String str = indoorLongitude.substring(i11);
            System.out.println("str1:"+str);
            int length = str.length();
            System.out.println("length1:"+length);
            if(length>6){
                indoorLongitude = indoorLongitude.substring(0, i11+7);
                System.out.println("大于6:"+indoorLongitude);
            }else {
                indoorLongitude = indoorLongitude.substring(0, i11+length);
                System.out.println("小于6:"+indoorLongitude);
            }
        }else {
            indoorLongitude = indoorLongitude.substring(0)+".000000";
        }
        //②
        int i22 = indoorLatitude.indexOf(".");
        if(i22>0){
            String str = indoorLatitude.substring(i22);
            int length = str.length();
            if(length>6){
                indoorLatitude = indoorLatitude.substring(0, i22+7);
                System.out.println("大于6:"+indoorLatitude);
            }else {
                indoorLatitude = indoorLatitude.substring(0, i22 + length);
                System.out.println("小于6:"+indoorLatitude);
            }
        }else {
            indoorLatitude = indoorLatitude.substring(0)+".000000";
        }


        indoorInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        return indoorCoverageInformationDao.insertIndoorCoverageInformation( indoorInformationId,  operator,  buildingProject,
                                                 buildYear,  planStationName,  actualStationName,
                                                 indoorLongitude,  indoorLatitude,  province,  city,
                                                 county,  subordinateDepartment,  coverType,
                                                   icSupervisoryUnitId,  icConstructionId,
                                                 icDesignUnitId,  bbuNumberId, rruNumber,  lightNumberId,
                                                 passiveDeviceNumberId,  antennaNumberId,  cableLengthId,ammeterNumber);
    }

    //模糊匹配查询展示室内覆盖基本信息数据
    @Override
    public PageHelperUtil selectAllIndoorCoverageInformation(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String professionResponsiblePerson,
            String districtHead,
            String siteLeader) {
        int start = (page-1)*rows-1;
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
        if (operator !=null && !operator.equals("")){
            operator = "%"+operator+"%";
        }else {
            operator = null;
        }
        if (professionResponsiblePerson !=null && !professionResponsiblePerson.equals("")){
            professionResponsiblePerson = "%"+professionResponsiblePerson+"%";
        }else {
            professionResponsiblePerson = null;
        }
        if (districtHead !=null && !districtHead.equals("")){
            districtHead = "%"+districtHead+"%";
        }else {
            districtHead = null;
        }
        if (siteLeader !=null && !siteLeader.equals("")){
            siteLeader = "%"+siteLeader+"%";
        }else {
            siteLeader = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<IndoorCoverageInformation> indoorCoverageInformationList = indoorCoverageInformationDao.selectAllIndoorCoverageInformation(
                start, end, province, city, county, buildYear, buildingProject, operator,
                professionResponsiblePerson, districtHead, siteLeader);
        //创建对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(indoorCoverageInformationList);
        //设置接收返回总记录数
        PageInfo<IndoorCoverageInformation> pageInfo = new PageInfo<IndoorCoverageInformation>(indoorCoverageInformationList);
        pageHelperUtil.setTotal(indoorCoverageInformationDao.getIndoorCoverageInformationCount(
                province, city, county, buildYear, buildingProject, operator, professionResponsiblePerson, districtHead, siteLeader));
        return pageHelperUtil;
    }
    //根据室内覆盖基本信息ID查询关联的小表ID（基于删除大表必须先删除小表的规则）
    @Override
    public String selectIcSupervisoryUnitIdByIndoorInformationId(String indoorInformationId) {
        return indoorCoverageInformationDao.selectIcSupervisoryUnitIdByIndoorInformationId(indoorInformationId);
    }
    @Override
    public String selectIcConstructionIdByIndoorInformationId(String indoorInformationId) {
        return indoorCoverageInformationDao.selectIcConstructionIdByIndoorInformationId(indoorInformationId);
    }
    @Override
    public String selectIcDesignUnitIdByIndoorInformationId(String indoorInformationId) {
        return indoorCoverageInformationDao.selectIcDesignUnitIdByIndoorInformationId(indoorInformationId);
    }
    @Override
    public String selectBbuNumberIdByIndoorInformationId(String indoorInformationId) {
        return indoorCoverageInformationDao.selectBbuNumberIdByIndoorInformationId(indoorInformationId);
    }
    @Override
    public String selectLightNumberIdByIndoorInformationId(String indoorInformationId) {
        return indoorCoverageInformationDao.selectLightNumberIdByIndoorInformationId(indoorInformationId);
    }
    @Override
    public String selectPassiveDeviceNumberIdByIndoorInformationId(String indoorInformationId) {
        return indoorCoverageInformationDao.selectPassiveDeviceNumberIdByIndoorInformationId(indoorInformationId);
    }
    @Override
    public String selectAntennaNumberIdByIndoorInformationId(String indoorInformationId) {
        return indoorCoverageInformationDao.selectAntennaNumberIdByIndoorInformationId(indoorInformationId);
    }
    @Override
    public String selectCableLengthIdByIndoorInformationId(String indoorInformationId) {
        return indoorCoverageInformationDao.selectCableLengthIdByIndoorInformationId(indoorInformationId);
    }
    //根据室内覆盖基本信息ID删除选中项
    @Override
    public int deleteIndoorCoverageInformationByIndoorInformationId(String indoorInformationId) {
        return indoorCoverageInformationDao.deleteIndoorCoverageInformationByIndoorInformationId(indoorInformationId);
    }
    //导出室内覆盖Excel空表格
    @Override
    public List<IndoorCoverageInformation> importIndoorCoverInformationNullExcel() {
        return indoorCoverageInformationDao.importIndoorCoverInformationNullExcel();
    }
    //导出室内覆盖Excel表格数据
    @Override
    public List<IndoorCoverageInformation> importIndoorCoverInformationExcel(String[] ids) {
        return indoorCoverageInformationDao.importIndoorCoverInformationExcel(ids);
    }

    //导入数据
    @Override
    public boolean add(String indoorInformationId, String operator, String buildingProject, String buildYear,
                       String planStationName, String actualStationName, String indoorLongitude, String indoorLatitude,
                       String province, String city, String county, String subordinateDepartment, String coverType,
                       String icSupervisoryUnitId,
                       String icConstructionId,
                       String icDesignUnitId,
                       String bbuNumberId,
                       String lightNumberId,
                       String passiveDeviceNumberId,
                       String antennaNumberId,
                       String cableLengthId,
                       String professionResponsiblePerson, String districtHead, String siteLeader, String icCorporateName,
                       String personInCharge, String designCorporateName, String designPersonInCharge,
                       String centralization, String wallHangingWall, String rruNumber, String easyMacro,
                       String bookrruNotIntegratedAntenna, String bookrruIntegratedAntenna, String hub,
                       String pruIntegratedAntenna, String pruNotIntegratedAntenna, String accessUnit, String extensionUnit,
                       String remoteDeviceIndoor, String remoteDeviceOutdoor, String powerDivider, String coupler,
                       String roadConnector, String loadNumber, String indoorAntenna, String outdoorAntenna,
                       String elevatorAntenna, String gpsAntenna, String networkLine, String photoelectricCompositeCable,
                       String sevenEighthsFeeder, String ahalfFeeder, String ammeterNumber) {

        boolean flag = true;
        indoorInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        icSupervisoryUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        icConstructionId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        icDesignUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        bbuNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        lightNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        passiveDeviceNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        antennaNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        cableLengthId= UUID.randomUUID().toString().replaceAll("-","").toUpperCase();


        int i1 = icSupervisoryUnitDao.insertIcSupervisoryUnit(icSupervisoryUnitId, professionResponsiblePerson, districtHead, siteLeader);
        int i2 = icConstructionOrganizationDao.insertIcConstructionOrganization(icConstructionId, icCorporateName, personInCharge);
        int i3 = icDesignUnitDao.insertIcDesignUnit(icDesignUnitId, designCorporateName, designPersonInCharge);
        int i4 = icBbuNumberDao.insertIcBbuNumber(bbuNumberId, centralization, wallHangingWall);
        int i5 = icLightDistriputionNumberDao.insertIcLightDistriputionNumber(
                lightNumberId, easyMacro, bookrruNotIntegratedAntenna,
                bookrruIntegratedAntenna, hub, pruIntegratedAntenna,
                pruNotIntegratedAntenna, accessUnit, extensionUnit,
                remoteDeviceIndoor, remoteDeviceOutdoor);
        int i6 = icPassiveDeviceNumberDao.insertIcPassiveDeviceNumber(passiveDeviceNumberId, powerDivider, coupler, roadConnector, loadNumber);

        int i7 = icAntennaNumberDao.insertIcAntennaNumber(antennaNumberId, indoorAntenna, outdoorAntenna,
                elevatorAntenna, gpsAntenna);
        int i8 = icCableLengthDao.insertIcCableLength(cableLengthId, networkLine, photoelectricCompositeCable,
                sevenEighthsFeeder, ahalfFeeder);
        if(i1 > 0 && i2 > 0 && i3 > 0 && i4 > 0 && i5 > 0 && i6 > 0 && i7 > 0 && i8>0){
            int i9 = indoorCoverageInformationDao.insertIndoorCoverageInformation(indoorInformationId, operator, buildingProject,
                    buildYear, planStationName, actualStationName,
                    indoorLongitude, indoorLatitude, province, city,
                    county, subordinateDepartment, coverType,
                    icSupervisoryUnitId, icConstructionId,
                    icDesignUnitId, bbuNumberId, rruNumber, lightNumberId,
                    passiveDeviceNumberId, antennaNumberId, cableLengthId, ammeterNumber);
            flag = true;
            System.out.println("导入成功");
        }else {
            flag = false;
            System.out.println("导入失败");
        }
        return flag;
    }
}