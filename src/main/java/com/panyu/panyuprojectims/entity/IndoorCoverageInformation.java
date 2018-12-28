package com.panyu.panyuprojectims.entity;
public class IndoorCoverageInformation {
    private String indoorInformationId;//基本信息ID
    private String operator;//运营商
    private String buildingProject;//建设项目名称
    private String buildYear;//建设年份
    private String planStationName;//规划站名
    private String actualStationName;//实际站名
    private String indoorLongitude;//经度
    private String indoorLatitude;//纬度
    private String province;//省
    private String city;//市
    private String county;//区(县)
    private String subordinateDepartment;//所属部门
    private String coverType;//覆盖类型

    private String icSupervisoryUnitId;//监理单位ID
    private String icConstructionId;//施工单位ID
    private String icDesignUnitId;//设计单位ID
    private String bbuNumberId;//BBU数量ID

    private String lightNumberId;//光分布设备数量ID
    private String passiveDeviceNumberId;//无源器件数量ID
    private String antennaNumberId;//天线数量ID
    private String cableLengthId;//线缆长度ID

    private String professionResponsiblePerson;//专业负责人
    private String districtHead;//区域负责人
    private String siteLeader;//现场负责人

    private String icCorporateName;//公司名称
    private String personInCharge;//负责人

    private String designCorporateName;//公司名称
    private String designPersonInCharge;//负责人

    private String centralization;//集中放置
    private String wallHangingWall;//小区挂墙

    private String rruNumber;//RRU数量

    private String easyMacro;//EasyMacro
    private String bookrruNotIntegratedAntenna;//BOOK RRU(不集成天线)
    private String bookrruIntegratedAntenna;//BOOK RRU(集成天线)
    private String hub;//HUB
    private String pruIntegratedAntenna;//PRU（集成天线）
    private String pruNotIntegratedAntenna;//PRU（不集成天线）
    private String accessUnit;//接入单元（近端）
    private String extensionUnit;//扩展单元
    private String remoteDeviceIndoor;//远端设备(室内)
    private String remoteDeviceOutdoor;//远端设备(室外)

    private String powerDivider;//功分器
    private String coupler;//耦合器
    private String roadConnector;//合路器
    private String loadNumber;//负载

    private String indoorAntenna;//室内天线
    private String outdoorAntenna;//室外天线
    private String elevatorAntenna;//电梯天线
    private String gpsAntenna;//GPS天线

    private String networkLine;//网线
    private String photoelectricCompositeCable;//光电复合缆
    private String sevenEighthsFeeder;//7/8馈线
    private String ahalfFeeder;//1/2馈线

    private String ammeterNumber;//电表数量（端）

    public IndoorCoverageInformation() {
        super();
    }

    public IndoorCoverageInformation(String indoorInformationId, String operator, String buildingProject, String buildYear, String planStationName, String actualStationName, String indoorLongitude, String indoorLatitude, String province, String city, String county, String subordinateDepartment, String coverType, String icSupervisoryUnitId, String icConstructionId, String icDesignUnitId, String bbuNumberId, String lightNumberId, String passiveDeviceNumberId, String antennaNumberId, String cableLengthId, String professionResponsiblePerson, String districtHead, String siteLeader, String icCorporateName, String personInCharge, String designCorporateName, String designPersonInCharge, String centralization, String wallHangingWall, String rruNumber, String easyMacro, String bookrruNotIntegratedAntenna, String bookrruIntegratedAntenna, String hub, String pruIntegratedAntenna, String pruNotIntegratedAntenna, String accessUnit, String extensionUnit, String remoteDeviceIndoor, String remoteDeviceOutdoor, String powerDivider, String coupler, String roadConnector, String loadNumber, String indoorAntenna, String outdoorAntenna, String elevatorAntenna, String gpsAntenna, String networkLine, String photoelectricCompositeCable, String sevenEighthsFeeder, String ahalfFeeder, String ammeterNumber) {
        this.indoorInformationId = indoorInformationId;
        this.operator = operator;
        this.buildingProject = buildingProject;
        this.buildYear = buildYear;
        this.planStationName = planStationName;
        this.actualStationName = actualStationName;
        this.indoorLongitude = indoorLongitude;
        this.indoorLatitude = indoorLatitude;
        this.province = province;
        this.city = city;
        this.county = county;
        this.subordinateDepartment = subordinateDepartment;
        this.coverType = coverType;
        this.icSupervisoryUnitId = icSupervisoryUnitId;
        this.icConstructionId = icConstructionId;
        this.icDesignUnitId = icDesignUnitId;
        this.bbuNumberId = bbuNumberId;
        this.lightNumberId = lightNumberId;
        this.passiveDeviceNumberId = passiveDeviceNumberId;
        this.antennaNumberId = antennaNumberId;
        this.cableLengthId = cableLengthId;
        this.professionResponsiblePerson = professionResponsiblePerson;
        this.districtHead = districtHead;
        this.siteLeader = siteLeader;
        this.icCorporateName = icCorporateName;
        this.personInCharge = personInCharge;
        this.designCorporateName = designCorporateName;
        this.designPersonInCharge = designPersonInCharge;
        this.centralization = centralization;
        this.wallHangingWall = wallHangingWall;
        this.rruNumber = rruNumber;
        this.easyMacro = easyMacro;
        this.bookrruNotIntegratedAntenna = bookrruNotIntegratedAntenna;
        this.bookrruIntegratedAntenna = bookrruIntegratedAntenna;
        this.hub = hub;
        this.pruIntegratedAntenna = pruIntegratedAntenna;
        this.pruNotIntegratedAntenna = pruNotIntegratedAntenna;
        this.accessUnit = accessUnit;
        this.extensionUnit = extensionUnit;
        this.remoteDeviceIndoor = remoteDeviceIndoor;
        this.remoteDeviceOutdoor = remoteDeviceOutdoor;
        this.powerDivider = powerDivider;
        this.coupler = coupler;
        this.roadConnector = roadConnector;
        this.loadNumber = loadNumber;
        this.indoorAntenna = indoorAntenna;
        this.outdoorAntenna = outdoorAntenna;
        this.elevatorAntenna = elevatorAntenna;
        this.gpsAntenna = gpsAntenna;
        this.networkLine = networkLine;
        this.photoelectricCompositeCable = photoelectricCompositeCable;
        this.sevenEighthsFeeder = sevenEighthsFeeder;
        this.ahalfFeeder = ahalfFeeder;
        this.ammeterNumber = ammeterNumber;
    }

    public String getIndoorInformationId() {
        return indoorInformationId;
    }

    public void setIndoorInformationId(String indoorInformationId) {
        this.indoorInformationId = indoorInformationId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getBuildingProject() {
        return buildingProject;
    }

    public void setBuildingProject(String buildingProject) {
        this.buildingProject = buildingProject;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getPlanStationName() {
        return planStationName;
    }

    public void setPlanStationName(String planStationName) {
        this.planStationName = planStationName;
    }

    public String getActualStationName() {
        return actualStationName;
    }

    public void setActualStationName(String actualStationName) {
        this.actualStationName = actualStationName;
    }

    public String getIndoorLongitude() {
        return indoorLongitude;
    }

    public void setIndoorLongitude(String indoorLongitude) {
        this.indoorLongitude = indoorLongitude;
    }

    public String getIndoorLatitude() {
        return indoorLatitude;
    }

    public void setIndoorLatitude(String indoorLatitude) {
        this.indoorLatitude = indoorLatitude;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getSubordinateDepartment() {
        return subordinateDepartment;
    }

    public void setSubordinateDepartment(String subordinateDepartment) {
        this.subordinateDepartment = subordinateDepartment;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getIcSupervisoryUnitId() {
        return icSupervisoryUnitId;
    }

    public void setIcSupervisoryUnitId(String icSupervisoryUnitId) {
        this.icSupervisoryUnitId = icSupervisoryUnitId;
    }

    public String getIcConstructionId() {
        return icConstructionId;
    }

    public void setIcConstructionId(String icConstructionId) {
        this.icConstructionId = icConstructionId;
    }

    public String getIcDesignUnitId() {
        return icDesignUnitId;
    }

    public void setIcDesignUnitId(String icDesignUnitId) {
        this.icDesignUnitId = icDesignUnitId;
    }

    public String getBbuNumberId() {
        return bbuNumberId;
    }

    public void setBbuNumberId(String bbuNumberId) {
        this.bbuNumberId = bbuNumberId;
    }

    public String getLightNumberId() {
        return lightNumberId;
    }

    public void setLightNumberId(String lightNumberId) {
        this.lightNumberId = lightNumberId;
    }

    public String getPassiveDeviceNumberId() {
        return passiveDeviceNumberId;
    }

    public void setPassiveDeviceNumberId(String passiveDeviceNumberId) {
        this.passiveDeviceNumberId = passiveDeviceNumberId;
    }

    public String getAntennaNumberId() {
        return antennaNumberId;
    }

    public void setAntennaNumberId(String antennaNumberId) {
        this.antennaNumberId = antennaNumberId;
    }

    public String getCableLengthId() {
        return cableLengthId;
    }

    public void setCableLengthId(String cableLengthId) {
        this.cableLengthId = cableLengthId;
    }

    public String getProfessionResponsiblePerson() {
        return professionResponsiblePerson;
    }

    public void setProfessionResponsiblePerson(String professionResponsiblePerson) {
        this.professionResponsiblePerson = professionResponsiblePerson;
    }

    public String getDistrictHead() {
        return districtHead;
    }

    public void setDistrictHead(String districtHead) {
        this.districtHead = districtHead;
    }

    public String getSiteLeader() {
        return siteLeader;
    }

    public void setSiteLeader(String siteLeader) {
        this.siteLeader = siteLeader;
    }

    public String getIcCorporateName() {
        return icCorporateName;
    }

    public void setIcCorporateName(String icCorporateName) {
        this.icCorporateName = icCorporateName;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getDesignCorporateName() {
        return designCorporateName;
    }

    public void setDesignCorporateName(String designCorporateName) {
        this.designCorporateName = designCorporateName;
    }

    public String getDesignPersonInCharge() {
        return designPersonInCharge;
    }

    public void setDesignPersonInCharge(String designPersonInCharge) {
        this.designPersonInCharge = designPersonInCharge;
    }

    public String getCentralization() {
        return centralization;
    }

    public void setCentralization(String centralization) {
        this.centralization = centralization;
    }

    public String getWallHangingWall() {
        return wallHangingWall;
    }

    public void setWallHangingWall(String wallHangingWall) {
        this.wallHangingWall = wallHangingWall;
    }

    public String getRruNumber() {
        return rruNumber;
    }

    public void setRruNumber(String rruNumber) {
        this.rruNumber = rruNumber;
    }

    public String getEasyMacro() {
        return easyMacro;
    }

    public void setEasyMacro(String easyMacro) {
        this.easyMacro = easyMacro;
    }

    public String getBookrruNotIntegratedAntenna() {
        return bookrruNotIntegratedAntenna;
    }

    public void setBookrruNotIntegratedAntenna(String bookrruNotIntegratedAntenna) {
        this.bookrruNotIntegratedAntenna = bookrruNotIntegratedAntenna;
    }

    public String getBookrruIntegratedAntenna() {
        return bookrruIntegratedAntenna;
    }

    public void setBookrruIntegratedAntenna(String bookrruIntegratedAntenna) {
        this.bookrruIntegratedAntenna = bookrruIntegratedAntenna;
    }

    public String getHub() {
        return hub;
    }

    public void setHub(String hub) {
        this.hub = hub;
    }

    public String getPruIntegratedAntenna() {
        return pruIntegratedAntenna;
    }

    public void setPruIntegratedAntenna(String pruIntegratedAntenna) {
        this.pruIntegratedAntenna = pruIntegratedAntenna;
    }

    public String getPruNotIntegratedAntenna() {
        return pruNotIntegratedAntenna;
    }

    public void setPruNotIntegratedAntenna(String pruNotIntegratedAntenna) {
        this.pruNotIntegratedAntenna = pruNotIntegratedAntenna;
    }

    public String getAccessUnit() {
        return accessUnit;
    }

    public void setAccessUnit(String accessUnit) {
        this.accessUnit = accessUnit;
    }

    public String getExtensionUnit() {
        return extensionUnit;
    }

    public void setExtensionUnit(String extensionUnit) {
        this.extensionUnit = extensionUnit;
    }

    public String getRemoteDeviceIndoor() {
        return remoteDeviceIndoor;
    }

    public void setRemoteDeviceIndoor(String remoteDeviceIndoor) {
        this.remoteDeviceIndoor = remoteDeviceIndoor;
    }

    public String getRemoteDeviceOutdoor() {
        return remoteDeviceOutdoor;
    }

    public void setRemoteDeviceOutdoor(String remoteDeviceOutdoor) {
        this.remoteDeviceOutdoor = remoteDeviceOutdoor;
    }

    public String getPowerDivider() {
        return powerDivider;
    }

    public void setPowerDivider(String powerDivider) {
        this.powerDivider = powerDivider;
    }

    public String getCoupler() {
        return coupler;
    }

    public void setCoupler(String coupler) {
        this.coupler = coupler;
    }

    public String getRoadConnector() {
        return roadConnector;
    }

    public void setRoadConnector(String roadConnector) {
        this.roadConnector = roadConnector;
    }

    public String getLoadNumber() {
        return loadNumber;
    }

    public void setLoadNumber(String loadNumber) {
        this.loadNumber = loadNumber;
    }

    public String getIndoorAntenna() {
        return indoorAntenna;
    }

    public void setIndoorAntenna(String indoorAntenna) {
        this.indoorAntenna = indoorAntenna;
    }

    public String getOutdoorAntenna() {
        return outdoorAntenna;
    }

    public void setOutdoorAntenna(String outdoorAntenna) {
        this.outdoorAntenna = outdoorAntenna;
    }

    public String getElevatorAntenna() {
        return elevatorAntenna;
    }

    public void setElevatorAntenna(String elevatorAntenna) {
        this.elevatorAntenna = elevatorAntenna;
    }

    public String getGpsAntenna() {
        return gpsAntenna;
    }

    public void setGpsAntenna(String gpsAntenna) {
        this.gpsAntenna = gpsAntenna;
    }

    public String getNetworkLine() {
        return networkLine;
    }

    public void setNetworkLine(String networkLine) {
        this.networkLine = networkLine;
    }

    public String getPhotoelectricCompositeCable() {
        return photoelectricCompositeCable;
    }

    public void setPhotoelectricCompositeCable(String photoelectricCompositeCable) {
        this.photoelectricCompositeCable = photoelectricCompositeCable;
    }

    public String getSevenEighthsFeeder() {
        return sevenEighthsFeeder;
    }

    public void setSevenEighthsFeeder(String sevenEighthsFeeder) {
        this.sevenEighthsFeeder = sevenEighthsFeeder;
    }

    public String getAhalfFeeder() {
        return ahalfFeeder;
    }

    public void setAhalfFeeder(String ahalfFeeder) {
        this.ahalfFeeder = ahalfFeeder;
    }

    public String getAmmeterNumber() {
        return ammeterNumber;
    }

    public void setAmmeterNumber(String ammeterNumber) {
        this.ammeterNumber = ammeterNumber;
    }

    @Override
    public String toString() {
        return "IndoorCoverageInformation{" +
                "indoorInformationId='" + indoorInformationId + '\'' +
                ", operator='" + operator + '\'' +
                ", buildingProject='" + buildingProject + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", planStationName='" + planStationName + '\'' +
                ", actualStationName='" + actualStationName + '\'' +
                ", indoorLongitude='" + indoorLongitude + '\'' +
                ", indoorLatitude='" + indoorLatitude + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", subordinateDepartment='" + subordinateDepartment + '\'' +
                ", coverType='" + coverType + '\'' +
                ", icSupervisoryUnitId='" + icSupervisoryUnitId + '\'' +
                ", icConstructionId='" + icConstructionId + '\'' +
                ", icDesignUnitId='" + icDesignUnitId + '\'' +
                ", bbuNumberId='" + bbuNumberId + '\'' +
                ", lightNumberId='" + lightNumberId + '\'' +
                ", passiveDeviceNumberId='" + passiveDeviceNumberId + '\'' +
                ", antennaNumberId='" + antennaNumberId + '\'' +
                ", cableLengthId='" + cableLengthId + '\'' +
                ", professionResponsiblePerson='" + professionResponsiblePerson + '\'' +
                ", districtHead='" + districtHead + '\'' +
                ", siteLeader='" + siteLeader + '\'' +
                ", icCorporateName='" + icCorporateName + '\'' +
                ", personInCharge='" + personInCharge + '\'' +
                ", designCorporateName='" + designCorporateName + '\'' +
                ", designPersonInCharge='" + designPersonInCharge + '\'' +
                ", centralization='" + centralization + '\'' +
                ", wallHangingWall='" + wallHangingWall + '\'' +
                ", rruNumber='" + rruNumber + '\'' +
                ", easyMacro='" + easyMacro + '\'' +
                ", bookrruNotIntegratedAntenna='" + bookrruNotIntegratedAntenna + '\'' +
                ", bookrruIntegratedAntenna='" + bookrruIntegratedAntenna + '\'' +
                ", hub='" + hub + '\'' +
                ", pruIntegratedAntenna='" + pruIntegratedAntenna + '\'' +
                ", pruNotIntegratedAntenna='" + pruNotIntegratedAntenna + '\'' +
                ", accessUnit='" + accessUnit + '\'' +
                ", extensionUnit='" + extensionUnit + '\'' +
                ", remoteDeviceIndoor='" + remoteDeviceIndoor + '\'' +
                ", remoteDeviceOutdoor='" + remoteDeviceOutdoor + '\'' +
                ", powerDivider='" + powerDivider + '\'' +
                ", coupler='" + coupler + '\'' +
                ", roadConnector='" + roadConnector + '\'' +
                ", loadNumber='" + loadNumber + '\'' +
                ", indoorAntenna='" + indoorAntenna + '\'' +
                ", outdoorAntenna='" + outdoorAntenna + '\'' +
                ", elevatorAntenna='" + elevatorAntenna + '\'' +
                ", gpsAntenna='" + gpsAntenna + '\'' +
                ", networkLine='" + networkLine + '\'' +
                ", photoelectricCompositeCable='" + photoelectricCompositeCable + '\'' +
                ", sevenEighthsFeeder='" + sevenEighthsFeeder + '\'' +
                ", ahalfFeeder='" + ahalfFeeder + '\'' +
                ", ammeterNumber='" + ammeterNumber + '\'' +
                '}';
    }
}
