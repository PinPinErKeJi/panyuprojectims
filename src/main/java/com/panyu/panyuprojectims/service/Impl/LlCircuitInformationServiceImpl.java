package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.LlCircuitInformationService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class LlCircuitInformationServiceImpl implements LlCircuitInformationService{

    @Autowired
    private LlCircuitInformationDao llCircuitInformationDao;
    @Autowired
    private LlDesignInstituteDao llDesignInstituteDao;
    @Autowired
    private LlSupervisionUnitDao llSupervisionUnitDao;
    @Autowired
    private LlConstructionUnitDao llConstructionUnitDao;
    @Autowired
    private LlNewLineLengthDao llNewLineLengthDao;
    @Autowired
    private LlCableLengthDesignDao llCableLengthDesignDao;
    @Autowired
    private LlFloorStandOnuNewDao llFloorStandOnuNewDao;
    @Autowired
    private LlFloorStandOnuWornDao llFloorStandOnuWornDao;
    @Autowired
    private LlWallMountedOnuNewDao llWallMountedOnuNewDao;
    @Autowired
    private LlWallMountedOnuWornDao llWallMountedOnuWornDao;
    @Autowired
    private CircuitModuleDao circuitModuleDao;

    //查询导入信息包含的模块id集合
   @Override
    public List<String> selectCircuitModuleIdList(String circuitInformationId) {
        List<String> CircuitModuleIdList = new ArrayList<String>();

        //根据导入信息id查询对应的其他信息
        LlNewLineLength llNewLineLength = llNewLineLengthDao.selectLlNewLineLengthByCircuitInformationId(circuitInformationId);
        LlCableLengthDesign llCableLengthDesign = llCableLengthDesignDao.selectLlCableLengthDesignByCircuitInformationId(circuitInformationId);
        LlFloorStandOnuNew llFloorStandOnuNew = llFloorStandOnuNewDao.selectLlFloorStandOnuNewByCircuitInformationId(circuitInformationId);
        LlFloorStandOnuWorn llFloorStandOnuWorn = llFloorStandOnuWornDao.selectLlFloorStandOnuWornByCircuitInformationId(circuitInformationId);
        LlWallMountedOnuNew llWallMountedOnuNew = llWallMountedOnuNewDao.selectLlWallMountedOnuNewByCircuitInformationId(circuitInformationId);
        LlWallMountedOnuWorn llWallMountedOnuWorn = llWallMountedOnuWornDao.selectLlWallMountedOnuWornDByCircuitInformationId(circuitInformationId);

        //新建线路长度
        if(llNewLineLength.getNewPoleLine() != null ){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("新建杆路");
             CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }
        if(llNewLineLength.getNewPipe() != null ){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("新建管道");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }
        if(llNewLineLength.getDirectBurialOpticalCable() != null ){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("直埋光缆");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }
        if(llNewLineLength.getPushPipe() != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("顶管");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }

        //光缆设计皮长公里
        if(llCableLengthDesign.getGystsSuspended() != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("架空光缆(附挂)");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }
        if(llCableLengthDesign.getGystsSuspensionWire() != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("架空光缆(加挂吊线)");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }
        if(llCableLengthDesign.getGysta() != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("管道光缆");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }
        if(llCableLengthDesign.getPlowInOpticalCable() != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("直埋光缆");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }
        if(llCableLengthDesign.getWallCable() != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("墙壁光缆");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }
        if(llCableLengthDesign.getInBridgeCable() != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("桥架内光缆");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }
        if(llCableLengthDesign.getGyfxts() != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("路面微槽光缆");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }

        //落地式光交箱（新建）
        if(llFloorStandOnuNew != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("落地式光缆交接箱(新建)");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }

        //落地式光交箱（利旧）
        if(llFloorStandOnuWorn != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("落地式光缆交接箱(利旧)");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }

        //壁挂式光交箱（新建）
        if(llWallMountedOnuNew != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("壁挂式光缆交接箱(新建)");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }

        //壁挂式光交箱（利旧）
        if(llWallMountedOnuWorn != null){
            CircuitModule circuitModule = circuitModuleDao.selectCircuitModuleByCircuitModuleName("壁挂式光缆交接箱(利旧)");
            CircuitModuleIdList.add(circuitModule.getCircuitModuleId());
        }

        return CircuitModuleIdList;
    }

    @Override
    public PageHelperUtil selectAllLlCircuitInformation(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String siteLeader,
            String professionResponsiblePerson,
            String districtHead) {

        int start = (page-1)*rows+1;
        int end = page*rows;

        if (province !=null && !province.equals("")){
            province = "%"+province+"%";
        }else {
            province = null;
        }
        if (city != null && !city.equals("")){
            city = "%"+city+"%";
        }else {
            city = null;
        }
        if (county !=null && !county.equals("")){
            county = "%"+county+"%";
        }else {
            county = null;
        }
        if (buildYear != null && !buildYear.equals("")){
            buildYear = "%"+buildYear+"%";
        }else {
            buildYear = null;
        }
        if (buildingProject !=null && !buildingProject.equals("")){
            buildingProject = "%"+buildingProject+"%";
        }else {
            buildingProject = null;
        }
        if (operator != null && !operator.equals("")){
            operator = "%"+operator+"%";
        }else {
            operator = null;
        }
        if (siteLeader !=null && !siteLeader.equals("")){
            siteLeader = "%"+siteLeader+"%";
        }else {
            siteLeader = null;
        }
        if (professionResponsiblePerson != null && !professionResponsiblePerson.equals("")){
            professionResponsiblePerson = "%"+professionResponsiblePerson+"%";
        }else {
            professionResponsiblePerson = null;
        }
        if (districtHead !=null && !districtHead.equals("")){
            districtHead = "%"+districtHead+"%";
        }else {
            districtHead = null;
        }

        //分页处理
        PageHelper.startPage(start,rows);
        List<LlCircuitInformation> llCircuitInformationList = llCircuitInformationDao.selectAllLlCircuitInformation(start,end, province, city, county, buildYear, buildingProject, operator, siteLeader, professionResponsiblePerson, districtHead);
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(llCircuitInformationList);
        PageInfo<LlCircuitInformation> pageInfo = new PageInfo<LlCircuitInformation>(llCircuitInformationList);
        pageHelperUtil.setTotal(llCircuitInformationDao.getCircuitInformationCount(province, city, county, buildYear, buildingProject, operator, siteLeader, professionResponsiblePerson, districtHead));
        return pageHelperUtil;
    }
    //根据线路基本信息ID查询关联的小表ID（基于删除大表必须先删除小表的规则）
    @Override
    public String selectDesignInstituteId(String circuitInformationId) {
        return llCircuitInformationDao.selectDesignInstituteId(circuitInformationId);
    }
    @Override
    public String selectSupervisionUnitId(String circuitInformationId) {
        return llCircuitInformationDao.selectSupervisionUnitId(circuitInformationId);
    }
    @Override
    public String selectConstructionUnitId(String circuitInformationId) {
        return llCircuitInformationDao.selectConstructionUnitId(circuitInformationId);
    }
    @Override
    public String selectNewLineLengthId(String circuitInformationId) {
        return llCircuitInformationDao.selectNewLineLengthId(circuitInformationId);
    }
    @Override
    public String selectCableLengthDesignId(String circuitInformationId) {
        return llCircuitInformationDao.selectCableLengthDesignId(circuitInformationId);
    }
    @Override
    public String selectNewFloorStandId(String circuitInformationId) {
        return llCircuitInformationDao.selectNewFloorStandId(circuitInformationId);
    }
    @Override
    public String selectWornFloorStandId(String circuitInformationId) {
        return llCircuitInformationDao.selectWornFloorStandId(circuitInformationId);
    }
    @Override
    public String selectNewWallMountedOnuId(String circuitInformationId) {
        return llCircuitInformationDao.selectNewWallMountedOnuId(circuitInformationId);
    }
    @Override
    public String selectWornWallMountedOnuId(String circuitInformationId) {
        return llCircuitInformationDao.selectWornWallMountedOnuId(circuitInformationId);
    }
    //根据线路基本信息ID删除选中项
    @Override
    public int deleteLlCircuitInformation(String circuitInformationId) {
        return llCircuitInformationDao.deleteLlCircuitInformation(circuitInformationId);
    }
    //添加线路基本信息数据
    @Override
    public int insertLlCircuitInformation(
            String circuitInformationId,
            String operator,
            String buildingProject,
            String buildYear,
            String hopName,
            String province,
            String city,
            String county,
            String area,
            String subordinateDepartment,
            String designInstituteId,
            String supervisionUnitId,
            String constructionUnitId,
            String newLineLengthId,
            String cableType,
            String cableLengthDesignId,
            String newFloorStandId,
            String wornFloorStandId,
            String newWallMountedOnuId,
            String wornWallMountedOnuId) {

        circuitInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        return llCircuitInformationDao.insertLlCircuitInformation(
                circuitInformationId,
                operator,
                buildingProject,
                buildYear,
                hopName,
                province,
                city,
                county,
                area,
                subordinateDepartment,
                designInstituteId,
                supervisionUnitId,
                constructionUnitId,
                newLineLengthId,
                cableType,
                cableLengthDesignId,
                newFloorStandId,
                wornFloorStandId,
                newWallMountedOnuId,
                wornWallMountedOnuId);
    }
    //导出线路基本信息Excel空表格
    @Override
    public List<LlCircuitInformation> importLlCircuitInformationNullExcel() {
        return llCircuitInformationDao.importLlCircuitInformationNullExcel();
    }
    //导出线路基本信息Excel表格数据
    @Override
    public List<LlCircuitInformation> importLlCircuitInformationExcel(String[] ids) {
        return llCircuitInformationDao.importLlCircuitInformationExcel(ids);
    }
    //导入数据添加
    @Override
    public boolean add(String circuitInformationId, String operator, String buildingProject, String buildYear,
                       String hopName, String province, String city, String county, String area,
                       String subordinateDepartment, String designInstituteId, String supervisionUnitId,
                       String constructionUnitId, String newLineLengthId, String cableType, String cableLengthDesignId,
                       String newFloorStandId, String wornFloorStandId, String newWallMountedOnuId,
                       String wornWallMountedOnuId, String companyName, String designPersonnel, String siteLeader,
                       String professionResponsiblePerson, String districtHead, String corporateName,
                       String personInCharge, String newPoleLine, String newPipe, String directBurialOpticalCable,
                       String pushPipe, String gystsSuspended, String gystsSuspensionWire, String gysta,
                       String plowInOpticalCable, String wallCable, String inBridgeCable, String gyfxts,
                       String newFloorStandNumber, String newFloorStandSize, String wornFloorStandNumber,
                       String wornFloorStandSize, String newWallMountedOnuNumber, String newWallMountedOnuSize,
                       String wornWallMountedOnuNumber, String wornWallMountedOnuSize) {

        boolean flag = true;
        circuitInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        designInstituteId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        supervisionUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        constructionUnitId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        newLineLengthId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        cableLengthDesignId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        newFloorStandId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        wornFloorStandId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        newWallMountedOnuId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        wornWallMountedOnuId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        int i1 = llDesignInstituteDao.insertLlDesignInstitute(designInstituteId, companyName, designPersonnel);
        int i2 = llSupervisionUnitDao.insertLlSupervisionUnit(supervisionUnitId, siteLeader, professionResponsiblePerson, districtHead);
        int i3= llConstructionUnitDao.insertLlConstructionUnit(constructionUnitId, corporateName, personInCharge);
        int i4 = llNewLineLengthDao.insertLlNewLineLength(newLineLengthId, newPoleLine, newPipe, directBurialOpticalCable, pushPipe);
        int i5 = llCableLengthDesignDao.insertLlCableLengthDesign(cableLengthDesignId, gystsSuspended, gystsSuspensionWire, gysta, plowInOpticalCable, wallCable, inBridgeCable, gyfxts);
        int i6 = llFloorStandOnuNewDao.insertLlFloorStandOnuNew(newFloorStandId, newFloorStandNumber, newFloorStandSize);
        int i7 = llFloorStandOnuWornDao.insertLlFloorStandOnuWorn(wornFloorStandId, wornFloorStandNumber, wornFloorStandSize);
        int i8 = llWallMountedOnuNewDao.insertLlWallMountedOnuNew(newWallMountedOnuId, newWallMountedOnuNumber, newWallMountedOnuSize);
        int i9 = llWallMountedOnuWornDao.insertLlWallMountedOnuWorn(wornWallMountedOnuId, wornWallMountedOnuNumber, wornWallMountedOnuSize);
        int i10 = llCircuitInformationDao.insertLlCircuitInformation(
                circuitInformationId,
                operator,
                buildingProject,
                buildYear,
                hopName,
                province,
                city,
                county,
                area,
                subordinateDepartment,
                designInstituteId,
                supervisionUnitId,
                constructionUnitId,
                newLineLengthId,
                cableType,
                cableLengthDesignId,
                newFloorStandId,
                wornFloorStandId,
                newWallMountedOnuId,
                wornWallMountedOnuId);
        if(i1 > 0 && i2 > 0 && i3 > 0 && i4 > 0 && i5 > 0 && i6 > 0 && i7 > 0 && i8 > 0 && i9 > 0 && i10 > 0){
            //System.out.println("导入成功");
            flag = true;
        }else {
            //System.out.println("导入失败");
            flag = false;
        }
        return flag;
    }
}