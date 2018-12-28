package com.panyu.panyuprojectims.service.Impl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.HnGarrisonInformationService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnGarrisonInformationServiceImpl implements HnGarrisonInformationService{
    @Autowired
    private HnGarrisonInformationDao hnGarrisonInformationDao;
    @Autowired
    private HnSupervisorUnitDao hnSupervisorUnitDao;
    @Autowired
    private HnConstructionOrganizationDao hnConstructionOrganizationDao;
    @Autowired
    private HnDesignUnitDao hnDesignUnitDao;
    @Autowired
    private
    HnPrimarySplitterNumberDao hnPrimarySplitterNumberDao ;
    @Autowired
    private HnSecondSplitterNumberDao hnSecondSplitterNumberDao;
    @Autowired
    private
    HnPrimarySplitterBoxNumberDao hnPrimarySplitterBoxNumberDao ;
    @Autowired
    private
    HnSecondSplitterBoxNumberDao hnSecondSplitterBoxNumberDao ;
    @Autowired
    private
    HnCableConnectorBoxNumberDao hnCableConnectorBoxNumberDao ;
    @Autowired
    private
    HnCableLengthDao hnCableLengthDao ;
    @Autowired
    private GarrisonDao garrisonDao;


    //根据驻地网id查询包含的模块id集合
    @Override
    public List<String> selectGarrisonIdList(String garrisonInformationId) {
        List<String> moduleIdList = new ArrayList<>();
        HnPrimarySplitterBoxNumber hnPrimarySplitterBoxNumber = hnPrimarySplitterBoxNumberDao.selectHnPrimarySplitterBoxNumberByGarrisonInformationId(garrisonInformationId);
        HnSecondSplitterBoxNumber hnSecondSplitterBoxNumber = hnSecondSplitterBoxNumberDao.selectHnSecondSplitterBoxNumberByGarrisonInformationId(garrisonInformationId);
        HnCableConnectorBoxNumber hnCableConnectorBoxNumber = hnCableConnectorBoxNumberDao.selectHnCableConnectorBoxNumberByGarrisonInformationId(garrisonInformationId);
        HnCableLength hnCableLength = hnCableLengthDao.selectHnCableLengthByGarrisonInformationId(garrisonInformationId);

        //一级分光器箱设计数量
        if(hnPrimarySplitterBoxNumber.getPrimaryAnchorearType() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("抱箍式分光器箱");
            moduleIdList.add(garrison.getGarrisonId());
        }
        if(hnPrimarySplitterBoxNumber.getPrimaryWallMounted() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("壁挂式分光器箱");
            moduleIdList.add(garrison.getGarrisonId());
        }

        //二级分光器箱设计数量
        if(hnSecondSplitterBoxNumber.getSecondAnchorearType() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("抱箍式分光器箱");
            moduleIdList.add(garrison.getGarrisonId());
        }
        if(hnSecondSplitterBoxNumber.getSecondWallMounted() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("壁挂式分光器箱");
            moduleIdList.add(garrison.getGarrisonId());
        }

        //光缆交接箱设计数量
        if(hnCableConnectorBoxNumber.getCableFloorType() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("落地式光缆交接箱");
            moduleIdList.add(garrison.getGarrisonId());
        }
        if(hnCableConnectorBoxNumber.getCableWallMounted() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("壁挂式光缆交接箱");
            moduleIdList.add(garrison.getGarrisonId());
        }
        //光缆长度
        if(hnCableLength.getGysts() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("架空光缆");
            moduleIdList.add(garrison.getGarrisonId());
        }
        if(hnCableLength.getGysts() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("管道光缆");
            moduleIdList.add(garrison.getGarrisonId());
        }
        if(hnCableLength.getBuriedServiceLightguide() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("直埋光缆");
            moduleIdList.add(garrison.getGarrisonId());
        }
        if(hnCableLength.getWallCable() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("墙壁光缆");
            moduleIdList.add(garrison.getGarrisonId());
        }
        if(hnCableLength.getInBridgeCable() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("桥架内光缆");
            moduleIdList.add(garrison.getGarrisonId());
        }
        if(hnCableLength.getGyfxts() != null){
            Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("路面微槽光缆");
            moduleIdList.add(garrison.getGarrisonId());
        }
        Garrison garrison = garrisonDao.selectGarrisonByGarrisonName("小区概况");
        moduleIdList.add(garrison.getGarrisonId());
        return moduleIdList;
    }




    //导入数据的添加
    @Override
    public boolean add(
            String garrisonInformationId,
                       String operator,
                       String buildingProject,
                       String buildYear,
                       String singleProjectName,
                       String province,
                       String city,
                       String county,
                       String regionalType,
                       String garrisonLongitude,
                       String garrisonLatitude,
                       String constructionNature,
                       String ascriptionEndBureau,

                       String supervisorUnitId,
                       String constructionOrganizationId,
                       String designUnitId,
                       String primarySplitterNumberId,
                       String secondSplitterNumberId,
                       String primarySplitterBoxId,
                       String secondSplitterBoxId,
                       String cableConnectorBoxId,
                       String cableLengthId,
                       // 1.
                       String onSiteSupervision,
                       String professionResponsiblePerson,
                       String districtHead,
                       //2.
                       String constructionCorporateName,
                       String constructionLinkman,
                       //3.
                       String designCorporateName,
                       String designConstructionLinkman,
                       //4.
                       String primaryOneToFour,
                       String primaryOneToEight,
                       String primaryOneToSixteen,
                       //5.
                       String secondOneToFour,
                       String secondOneToEight,
                       String secondOneToSixteen,
                       String oneToThirtyTwo,
                       String oneToSixtyFour,
                       //6.
                       String primaryAnchorearType,
                       String primaryWallMounted,
                       //7.
                       String secondAnchorearType,
                       String secondWallMounted,
                       //8.
                       String cableFloorType,
                       String cableWallMounted,
                       //9.
                       String gysts,
                       String gysta,
                       String buriedServiceLightguide,
                       String wallCable,
                       String inBridgeCable,
                       String gyfxts) {

        boolean flag = true;
        supervisorUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        constructionOrganizationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        designUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        primarySplitterNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        secondSplitterNumberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        primarySplitterBoxId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        secondSplitterBoxId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        cableConnectorBoxId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        cableLengthId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        garrisonInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        int i = hnSupervisorUnitDao.insertHnSupervisorUnit(supervisorUnitId, onSiteSupervision, professionResponsiblePerson, districtHead);
        int i1 = hnConstructionOrganizationDao.insertHnConstructionOrganization(constructionOrganizationId, constructionCorporateName,
                                                                                    constructionLinkman);
        int i2 = hnDesignUnitDao.insertHnDesignUnit(designUnitId, designCorporateName, designConstructionLinkman);
        int i3 = hnPrimarySplitterNumberDao.insertHnPrimarySplitterNumber(primarySplitterNumberId, primaryOneToFour,
                                                                             primaryOneToEight, primaryOneToSixteen);
        int i4 = hnSecondSplitterNumberDao.insertHnSecondSplitterNumber(secondSplitterNumberId, secondOneToFour, secondOneToEight,
                                                                            secondOneToSixteen, oneToThirtyTwo, oneToSixtyFour);
        int i5 = hnPrimarySplitterBoxNumberDao.insertHnPrimarySplitterBoxNumber(primarySplitterBoxId, primaryAnchorearType,
                                                                                    primaryWallMounted);
        int i6 = hnSecondSplitterBoxNumberDao.insertHnSecondSplitterBoxNumber(secondSplitterBoxId, secondAnchorearType, secondWallMounted);
        int i7 = hnCableConnectorBoxNumberDao.insertHnCableConnectorBoxNumber(cableConnectorBoxId, cableFloorType, cableWallMounted);
        int i8 = hnCableLengthDao.insertHnCableLength(cableLengthId, gysts, gysta, buriedServiceLightguide, wallCable, inBridgeCable, gyfxts);
        int i9 = hnGarrisonInformationDao.insertHnGarrisonInformation(garrisonInformationId,
                operator,
                buildingProject,
                buildYear,
                singleProjectName,
                province,
                city,
                county,
                regionalType,
                garrisonLongitude,
                garrisonLatitude,
                constructionNature,
                ascriptionEndBureau,
                supervisorUnitId,
                constructionOrganizationId,
                designUnitId,
                primarySplitterNumberId,
                secondSplitterNumberId,
                primarySplitterBoxId,
                secondSplitterBoxId,
                cableConnectorBoxId,
                cableLengthId);
        if(i>0&i1>0&i2>0&i3>0&i4>0&i5>0&i6>0&i7>0&i8>0&i9>0){
            flag = true;
            System.out.println("导入成功");
        }else {
            flag = false;
            System.out.println("导入失败");
        }
        return flag;
    }

    //添加
    @Override
    public int insertHnGarrisonInformation(String garrisonInformationId, String operator, String buildingProject, String buildYear,
                                           String singleProjectName, String province, String city, String county, String regionalType,
                                           String garrisonLongitude, String garrisonLatitude, String constructionNature,
                                           String ascriptionEndBureau, String supervisorUnitId, String constructionOrganizationId,
                                           String designUnitId, String primarySplitterNumberId, String secondSplitterNumberId,
                                           String primarySplitterBoxId, String secondSplitterBoxId, String cableConnectorBoxId,
                                           String cableLengthId) {

        //经纬度数据处理
        //①
        int i11 = garrisonLongitude.indexOf(".");
        System.out.println("i1:"+i11);
        if(i11>0){
            String str = garrisonLongitude.substring(i11);
            System.out.println("str1:"+str);
            int length = str.length();
            System.out.println("length1:"+length);
            if(length>6){
                garrisonLongitude = garrisonLongitude.substring(0, i11+7);
                System.out.println("大于6:"+garrisonLongitude);
            }else {
                garrisonLongitude = garrisonLongitude.substring(0, i11+length);
                System.out.println("小于6:"+garrisonLongitude);
            }
        }else {
            garrisonLongitude = garrisonLongitude.substring(0)+".000000";
        }
        //②
        int i31 = garrisonLatitude.indexOf(".");
        if(i31>0){
            String str = garrisonLatitude.substring(i31);
            int length = str.length();
            if(length>6){
                garrisonLatitude = garrisonLatitude.substring(0, i31+7);
                System.out.println("大于6:"+garrisonLatitude);
            }else {
                garrisonLatitude = garrisonLatitude.substring(0, i31 + length);
                System.out.println("小于6:"+garrisonLatitude);
            }
        }else {
            garrisonLatitude = garrisonLatitude.substring(0)+".000000";
        }

        return hnGarrisonInformationDao.insertHnGarrisonInformation( garrisonInformationId,  operator,  buildingProject,  buildYear,
                 singleProjectName,  province,  city,  county,  regionalType,
                 garrisonLongitude,  garrisonLatitude,  constructionNature,
                 ascriptionEndBureau,  supervisorUnitId,  constructionOrganizationId,
                 designUnitId,  primarySplitterNumberId,  secondSplitterNumberId,
                 primarySplitterBoxId,  secondSplitterBoxId,  cableConnectorBoxId,
                 cableLengthId);
    }

    //删除
    //删除驻地网基本信息数据时首先根据驻地网基本信息表的ID字段查询出关联的字表ID
    //查询驻地网监理单位表ID字段
    @Override
    public String selectSupervisorUnitIdByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.selectSupervisorUnitIdByGarrisonInformationId(garrisonInformationId);
    }
    //查询驻地网施工单位表ID字段
    @Override
    public String selectConstructionOrganizationIdByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.selectConstructionOrganizationIdByGarrisonInformationId(garrisonInformationId);
    }
    //查询驻地网设计单位表ID字段
    @Override
    public String selectDesignUnitIdByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.selectDesignUnitIdByGarrisonInformationId(garrisonInformationId);
    }
    //查询一级分光器设计数量表ID字段
    @Override
    public String selectPrimarySplitterNumberIdByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.selectPrimarySplitterNumberIdByGarrisonInformationId(garrisonInformationId);
    }
    //查询二级分光器设计数量表ID字段
    @Override
    public String selectSecondSplitterNumberIdByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.selectSecondSplitterNumberIdByGarrisonInformationId(garrisonInformationId);
    }
    //查询一级分光器箱设计数量表ID字段
    @Override
    public String selectPrimarySplitterBoxIdByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.selectPrimarySplitterBoxIdByGarrisonInformationId(garrisonInformationId);
    }
    //查询二级分光器箱设计数量表ID字段
    @Override
    public String selectSecondSplitterBoxIdByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.selectSecondSplitterBoxIdByGarrisonInformationId(garrisonInformationId);
    }
    //查询光缆交接箱设计数量表ID字段
    @Override
    public String selectCableConnectorBoxIdByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.selectCableConnectorBoxIdByGarrisonInformationId(garrisonInformationId);
    }
    //查询光缆长度表ID字段
    @Override
    public String selectCableLengthIdByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.selectCableLengthIdByGarrisonInformationId(garrisonInformationId);
    }
    //根据ID字段删除驻地网基本信息
    @Override
    public int deleteHnGarrisonInformationByGarrisonInformationId(String garrisonInformationId) {
        return hnGarrisonInformationDao.deleteHnGarrisonInformationByGarrisonInformationId(garrisonInformationId);
    }


    //分页模糊匹配查询展示基本信息数据
    @Override
    public PageHelperUtil selectHnGarrisonInformation(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String singleProjectName,
            String onSiteSupervision,
            String professionResponsiblePerson,
            String districtHead) {

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
        if (operator !=null && !operator.equals("")){
            operator = "%"+operator+"%";
        }else {
            operator = null;
        }
        if (onSiteSupervision !=null && !onSiteSupervision.equals("")){
            onSiteSupervision = "%"+onSiteSupervision+"%";
        }else {
            onSiteSupervision = null;
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
        if (singleProjectName !=null && !singleProjectName.equals("")){
            singleProjectName = "%"+singleProjectName+"%";
        }else {
            singleProjectName = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<HnGarrisonInformation> garrisonInformationList = hnGarrisonInformationDao.selectHnGarrisonInformation(
                start, end, province, city, county, buildYear, buildingProject, operator, singleProjectName, onSiteSupervision, professionResponsiblePerson, districtHead);
        //创建返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(garrisonInformationList);
        //设置返回总记录数
        PageInfo<HnGarrisonInformation> pageInfo = new PageInfo<HnGarrisonInformation>(garrisonInformationList);
        pageHelperUtil.setTotal(hnGarrisonInformationDao.getHnGarrisonInformationRowCount(province,city,county,buildYear,buildingProject,operator, singleProjectName,onSiteSupervision,professionResponsiblePerson,districtHead));
        return pageHelperUtil;
    }

    //导出空表格
    @Override
    public List<HnGarrisonInformation> exportExcel_HnGarrisonInformation() {
        return hnGarrisonInformationDao.exportExcel_HnGarrisonInformation();
    }

    //导出数据
    @Override
    public List<HnGarrisonInformation> export_HnGarrisonInformation(String[] ids) {
        return hnGarrisonInformationDao.export_HnGarrisonInformation(ids);
    }
}