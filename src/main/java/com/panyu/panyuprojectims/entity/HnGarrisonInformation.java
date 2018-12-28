package com.panyu.panyuprojectims.entity;
public class HnGarrisonInformation {
    private String garrisonInformationId;//驻地网基本信息ID
    private String operator;//运营商
    private String buildingProject;//建设项目名称
    private String buildYear;//建设年份
    private String singleProjectName;//单项工程名称
    private String province;//省
    private String city;//市
    private String county;//区（县）
    private String regionalType;//区域类型
    private String garrisonLongitude;//经度
    private String garrisonLatitude;//纬度
    private String constructionNature;//建设性质
    private String ascriptionEndBureau;//上联归属端局


    private String supervisorUnitId;//监理单位ID
    private String constructionOrganizationId;//施工单位ID
    private String designUnitId;//设计单位
    private String primarySplitterNumberId;//一级分光器设计数量ID
    private String secondSplitterNumberId;//二级分光器设计数量ID
    private String primarySplitterBoxId;//一级分光器箱设计数量ID
    private String secondSplitterBoxId;//二级分光器箱设计数量ID
    private String cableConnectorBoxId;//光缆交接箱设计数量ID
    private String cableLengthId;//光缆长度ID
    // 1.
    private String onSiteSupervision;//现场监理
    private String professionResponsiblePerson;//专业负责人
    private String districtHead;//区域负责人
    //2.
    private String constructionCorporateName;//公司名称
    private String constructionLinkman;//联系人
    //3.
    private String designCorporateName;//公司名称
    private String designConstructionLinkman;//联系人
    //4.
    private String primaryOneToFour;//1:4
    private String primaryOneToEight;//1:8
    private String primaryOneToSixteen;//1:16
    //5.
    private String secondOneToFour;//1:4
    private String secondOneToEight;//1:8
    private String secondOneToSixteen;//1:16
    private String oneToThirtyTwo;//1:32
    private String oneToSixtyFour;//1:64
    //6.
    private String primaryAnchorearType;//抱箍式
    private String primaryWallMounted;//壁挂式
    //7.
    private String secondAnchorearType;//抱箍式
    private String secondWallMounted;//壁挂式
    //8.
    private String cableFloorType;//落地式
    private String cableWallMounted;//壁挂式
    //9.
    private String gysts;//架空光缆
    private String gysta;//管道光缆
    private String buriedServiceLightguide;//直埋光缆
    private String wallCable;//墙壁光缆
    private String inBridgeCable;//桥架内光缆
    private String gyfxts;//路面微槽光缆


    public HnGarrisonInformation() {
        super();
    }

    public HnGarrisonInformation(String garrisonInformationId, String operator, String buildingProject, String buildYear, String singleProjectName, String province, String city, String county, String regionalType, String garrisonLongitude, String garrisonLatitude, String constructionNature, String ascriptionEndBureau, String supervisorUnitId, String constructionOrganizationId, String designUnitId, String primarySplitterNumberId, String secondSplitterNumberId, String primarySplitterBoxId, String secondSplitterBoxId, String cableConnectorBoxId, String cableLengthId, String onSiteSupervision, String professionResponsiblePerson, String districtHead, String constructionCorporateName, String constructionLinkman, String designCorporateName, String designConstructionLinkman, String primaryOneToFour, String primaryOneToEight, String primaryOneToSixteen, String secondOneToFour, String secondOneToEight, String secondOneToSixteen, String oneToThirtyTwo, String oneToSixtyFour, String primaryAnchorearType, String primaryWallMounted, String secondAnchorearType, String secondWallMounted, String cableFloorType, String cableWallMounted, String gysts, String gysta, String buriedServiceLightguide, String wallCable, String inBridgeCable, String gyfxts) {
        this.garrisonInformationId = garrisonInformationId;
        this.operator = operator;
        this.buildingProject = buildingProject;
        this.buildYear = buildYear;
        this.singleProjectName = singleProjectName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.regionalType = regionalType;
        this.garrisonLongitude = garrisonLongitude;
        this.garrisonLatitude = garrisonLatitude;
        this.constructionNature = constructionNature;
        this.ascriptionEndBureau = ascriptionEndBureau;
        this.supervisorUnitId = supervisorUnitId;
        this.constructionOrganizationId = constructionOrganizationId;
        this.designUnitId = designUnitId;
        this.primarySplitterNumberId = primarySplitterNumberId;
        this.secondSplitterNumberId = secondSplitterNumberId;
        this.primarySplitterBoxId = primarySplitterBoxId;
        this.secondSplitterBoxId = secondSplitterBoxId;
        this.cableConnectorBoxId = cableConnectorBoxId;
        this.cableLengthId = cableLengthId;
        this.onSiteSupervision = onSiteSupervision;
        this.professionResponsiblePerson = professionResponsiblePerson;
        this.districtHead = districtHead;
        this.constructionCorporateName = constructionCorporateName;
        this.constructionLinkman = constructionLinkman;
        this.designCorporateName = designCorporateName;
        this.designConstructionLinkman = designConstructionLinkman;
        this.primaryOneToFour = primaryOneToFour;
        this.primaryOneToEight = primaryOneToEight;
        this.primaryOneToSixteen = primaryOneToSixteen;
        this.secondOneToFour = secondOneToFour;
        this.secondOneToEight = secondOneToEight;
        this.secondOneToSixteen = secondOneToSixteen;
        this.oneToThirtyTwo = oneToThirtyTwo;
        this.oneToSixtyFour = oneToSixtyFour;
        this.primaryAnchorearType = primaryAnchorearType;
        this.primaryWallMounted = primaryWallMounted;
        this.secondAnchorearType = secondAnchorearType;
        this.secondWallMounted = secondWallMounted;
        this.cableFloorType = cableFloorType;
        this.cableWallMounted = cableWallMounted;
        this.gysts = gysts;
        this.gysta = gysta;
        this.buriedServiceLightguide = buriedServiceLightguide;
        this.wallCable = wallCable;
        this.inBridgeCable = inBridgeCable;
        this.gyfxts = gyfxts;
    }

    public String getGarrisonInformationId() {
        return garrisonInformationId;
    }

    public void setGarrisonInformationId(String garrisonInformationId) {
        this.garrisonInformationId = garrisonInformationId;
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

    public String getSingleProjectName() {
        return singleProjectName;
    }

    public void setSingleProjectName(String singleProjectName) {
        this.singleProjectName = singleProjectName;
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

    public String getRegionalType() {
        return regionalType;
    }

    public void setRegionalType(String regionalType) {
        this.regionalType = regionalType;
    }

    public String getGarrisonLongitude() {
        return garrisonLongitude;
    }

    public void setGarrisonLongitude(String garrisonLongitude) {
        this.garrisonLongitude = garrisonLongitude;
    }

    public String getGarrisonLatitude() {
        return garrisonLatitude;
    }

    public void setGarrisonLatitude(String garrisonLatitude) {
        this.garrisonLatitude = garrisonLatitude;
    }

    public String getConstructionNature() {
        return constructionNature;
    }

    public void setConstructionNature(String constructionNature) {
        this.constructionNature = constructionNature;
    }

    public String getAscriptionEndBureau() {
        return ascriptionEndBureau;
    }

    public void setAscriptionEndBureau(String ascriptionEndBureau) {
        this.ascriptionEndBureau = ascriptionEndBureau;
    }

    public String getSupervisorUnitId() {
        return supervisorUnitId;
    }

    public void setSupervisorUnitId(String supervisorUnitId) {
        this.supervisorUnitId = supervisorUnitId;
    }

    public String getConstructionOrganizationId() {
        return constructionOrganizationId;
    }

    public void setConstructionOrganizationId(String constructionOrganizationId) {
        this.constructionOrganizationId = constructionOrganizationId;
    }

    public String getDesignUnitId() {
        return designUnitId;
    }

    public void setDesignUnitId(String designUnitId) {
        this.designUnitId = designUnitId;
    }

    public String getPrimarySplitterNumberId() {
        return primarySplitterNumberId;
    }

    public void setPrimarySplitterNumberId(String primarySplitterNumberId) {
        this.primarySplitterNumberId = primarySplitterNumberId;
    }

    public String getSecondSplitterNumberId() {
        return secondSplitterNumberId;
    }

    public void setSecondSplitterNumberId(String secondSplitterNumberId) {
        this.secondSplitterNumberId = secondSplitterNumberId;
    }

    public String getPrimarySplitterBoxId() {
        return primarySplitterBoxId;
    }

    public void setPrimarySplitterBoxId(String primarySplitterBoxId) {
        this.primarySplitterBoxId = primarySplitterBoxId;
    }

    public String getSecondSplitterBoxId() {
        return secondSplitterBoxId;
    }

    public void setSecondSplitterBoxId(String secondSplitterBoxId) {
        this.secondSplitterBoxId = secondSplitterBoxId;
    }

    public String getCableConnectorBoxId() {
        return cableConnectorBoxId;
    }

    public void setCableConnectorBoxId(String cableConnectorBoxId) {
        this.cableConnectorBoxId = cableConnectorBoxId;
    }

    public String getCableLengthId() {
        return cableLengthId;
    }

    public void setCableLengthId(String cableLengthId) {
        this.cableLengthId = cableLengthId;
    }

    public String getOnSiteSupervision() {
        return onSiteSupervision;
    }

    public void setOnSiteSupervision(String onSiteSupervision) {
        this.onSiteSupervision = onSiteSupervision;
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

    public String getConstructionCorporateName() {
        return constructionCorporateName;
    }

    public void setConstructionCorporateName(String constructionCorporateName) {
        this.constructionCorporateName = constructionCorporateName;
    }

    public String getConstructionLinkman() {
        return constructionLinkman;
    }

    public void setConstructionLinkman(String constructionLinkman) {
        this.constructionLinkman = constructionLinkman;
    }

    public String getDesignCorporateName() {
        return designCorporateName;
    }

    public void setDesignCorporateName(String designCorporateName) {
        this.designCorporateName = designCorporateName;
    }

    public String getDesignConstructionLinkman() {
        return designConstructionLinkman;
    }

    public void setDesignConstructionLinkman(String designConstructionLinkman) {
        this.designConstructionLinkman = designConstructionLinkman;
    }

    public String getPrimaryOneToFour() {
        return primaryOneToFour;
    }

    public void setPrimaryOneToFour(String primaryOneToFour) {
        this.primaryOneToFour = primaryOneToFour;
    }

    public String getPrimaryOneToEight() {
        return primaryOneToEight;
    }

    public void setPrimaryOneToEight(String primaryOneToEight) {
        this.primaryOneToEight = primaryOneToEight;
    }

    public String getPrimaryOneToSixteen() {
        return primaryOneToSixteen;
    }

    public void setPrimaryOneToSixteen(String primaryOneToSixteen) {
        this.primaryOneToSixteen = primaryOneToSixteen;
    }

    public String getSecondOneToFour() {
        return secondOneToFour;
    }

    public void setSecondOneToFour(String secondOneToFour) {
        this.secondOneToFour = secondOneToFour;
    }

    public String getSecondOneToEight() {
        return secondOneToEight;
    }

    public void setSecondOneToEight(String secondOneToEight) {
        this.secondOneToEight = secondOneToEight;
    }

    public String getSecondOneToSixteen() {
        return secondOneToSixteen;
    }

    public void setSecondOneToSixteen(String secondOneToSixteen) {
        this.secondOneToSixteen = secondOneToSixteen;
    }

    public String getOneToThirtyTwo() {
        return oneToThirtyTwo;
    }

    public void setOneToThirtyTwo(String oneToThirtyTwo) {
        this.oneToThirtyTwo = oneToThirtyTwo;
    }

    public String getOneToSixtyFour() {
        return oneToSixtyFour;
    }

    public void setOneToSixtyFour(String oneToSixtyFour) {
        this.oneToSixtyFour = oneToSixtyFour;
    }

    public String getPrimaryAnchorearType() {
        return primaryAnchorearType;
    }

    public void setPrimaryAnchorearType(String primaryAnchorearType) {
        this.primaryAnchorearType = primaryAnchorearType;
    }

    public String getPrimaryWallMounted() {
        return primaryWallMounted;
    }

    public void setPrimaryWallMounted(String primaryWallMounted) {
        this.primaryWallMounted = primaryWallMounted;
    }

    public String getSecondAnchorearType() {
        return secondAnchorearType;
    }

    public void setSecondAnchorearType(String secondAnchorearType) {
        this.secondAnchorearType = secondAnchorearType;
    }

    public String getSecondWallMounted() {
        return secondWallMounted;
    }

    public void setSecondWallMounted(String secondWallMounted) {
        this.secondWallMounted = secondWallMounted;
    }

    public String getCableFloorType() {
        return cableFloorType;
    }

    public void setCableFloorType(String cableFloorType) {
        this.cableFloorType = cableFloorType;
    }

    public String getCableWallMounted() {
        return cableWallMounted;
    }

    public void setCableWallMounted(String cableWallMounted) {
        this.cableWallMounted = cableWallMounted;
    }

    public String getGysts() {
        return gysts;
    }

    public void setGysts(String gysts) {
        this.gysts = gysts;
    }

    public String getGysta() {
        return gysta;
    }

    public void setGysta(String gysta) {
        this.gysta = gysta;
    }

    public String getBuriedServiceLightguide() {
        return buriedServiceLightguide;
    }

    public void setBuriedServiceLightguide(String buriedServiceLightguide) {
        this.buriedServiceLightguide = buriedServiceLightguide;
    }

    public String getWallCable() {
        return wallCable;
    }

    public void setWallCable(String wallCable) {
        this.wallCable = wallCable;
    }

    public String getInBridgeCable() {
        return inBridgeCable;
    }

    public void setInBridgeCable(String inBridgeCable) {
        this.inBridgeCable = inBridgeCable;
    }

    public String getGyfxts() {
        return gyfxts;
    }

    public void setGyfxts(String gyfxts) {
        this.gyfxts = gyfxts;
    }

    @Override
    public String toString() {
        return "HnGarrisonInformation{" +
                "garrisonInformationId='" + garrisonInformationId + '\'' +
                ", operator='" + operator + '\'' +
                ", buildingProject='" + buildingProject + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", singleProjectName='" + singleProjectName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", regionalType='" + regionalType + '\'' +
                ", garrisonLongitude='" + garrisonLongitude + '\'' +
                ", garrisonLatitude='" + garrisonLatitude + '\'' +
                ", constructionNature='" + constructionNature + '\'' +
                ", ascriptionEndBureau='" + ascriptionEndBureau + '\'' +
                ", supervisorUnitId='" + supervisorUnitId + '\'' +
                ", constructionOrganizationId='" + constructionOrganizationId + '\'' +
                ", designUnitId='" + designUnitId + '\'' +
                ", primarySplitterNumberId='" + primarySplitterNumberId + '\'' +
                ", secondSplitterNumberId='" + secondSplitterNumberId + '\'' +
                ", primarySplitterBoxId='" + primarySplitterBoxId + '\'' +
                ", secondSplitterBoxId='" + secondSplitterBoxId + '\'' +
                ", cableConnectorBoxId='" + cableConnectorBoxId + '\'' +
                ", cableLengthId='" + cableLengthId + '\'' +
                ", onSiteSupervision='" + onSiteSupervision + '\'' +
                ", professionResponsiblePerson='" + professionResponsiblePerson + '\'' +
                ", districtHead='" + districtHead + '\'' +
                ", constructionCorporateName='" + constructionCorporateName + '\'' +
                ", constructionLinkman='" + constructionLinkman + '\'' +
                ", designCorporateName='" + designCorporateName + '\'' +
                ", designConstructionLinkman='" + designConstructionLinkman + '\'' +
                ", primaryOneToFour='" + primaryOneToFour + '\'' +
                ", primaryOneToEight='" + primaryOneToEight + '\'' +
                ", primaryOneToSixteen='" + primaryOneToSixteen + '\'' +
                ", secondOneToFour='" + secondOneToFour + '\'' +
                ", secondOneToEight='" + secondOneToEight + '\'' +
                ", secondOneToSixteen='" + secondOneToSixteen + '\'' +
                ", oneToThirtyTwo='" + oneToThirtyTwo + '\'' +
                ", oneToSixtyFour='" + oneToSixtyFour + '\'' +
                ", primaryAnchorearType='" + primaryAnchorearType + '\'' +
                ", primaryWallMounted='" + primaryWallMounted + '\'' +
                ", secondAnchorearType='" + secondAnchorearType + '\'' +
                ", secondWallMounted='" + secondWallMounted + '\'' +
                ", cableFloorType='" + cableFloorType + '\'' +
                ", cableWallMounted='" + cableWallMounted + '\'' +
                ", gysts='" + gysts + '\'' +
                ", gysta='" + gysta + '\'' +
                ", buriedServiceLightguide='" + buriedServiceLightguide + '\'' +
                ", wallCable='" + wallCable + '\'' +
                ", inBridgeCable='" + inBridgeCable + '\'' +
                ", gyfxts='" + gyfxts + '\'' +
                '}';
    }
}
