package com.panyu.panyuprojectims.entity;
//驻地网工程进度基本信息
public class HnGarrisonJobProgress {
    private String jobProgressId;
    private String operator;//运营商
    private String buildingProject;//建设项目名称
    private String buildYear;//建设年份
    private String singleProjectName;//单项工程名称 singleProjectName
    private String province;//省
    private String city;//市
    private String county;//区
    private String regionalType;//区域类型
    private String garrisonLongitude;//经度
    private String garrisonLatitude;//纬度
    private String constructionNature;//建设性质
    private String ascriptionEndBureau;//上联归属端局

    private String progressSupervisorUnitId;
    private String progressConstructionId;
    private String progressDesignUnitId;
    private String primarySplitterId;
    private String secondSplitterId;
    private String primarySplitterBoxId;
    private String secondSplitterBoxId;
    private String cableConnectorBoxId;
    private String cableLengthStatisticsId;
    private String statisticalLengthId;
    //1.监理单位
    private String onSiteSupervision;//
    private String professionResponsiblePerson;//
    private String districtHead;//
    //2.施工单位
    private String progressCompanyName;//
    private String progressLeader;//
    //3.设计单位
    private String designCompanyName;//
    private String designLeader;//
    //4.一级分光器
    private String primarySplittingRatio;//
    private String primaryOneToFour;//
    private String primaryOneToEight;//
    private String primaryOneToSixteen;//
    //5.二级分光器
    private String secondSplittingRatio;//
    private String secondOneToFour;//
    private String secondOneToEight;//
    private String secondOneToSixteen;//
    private String oneToThirtyTwo;//
    private String oneToSixtyFour;//
    //6.一级分光器箱
    private String primarySplitterBoxType;//
    private String primaryAnchorearType;//
    private String primaryWallMounted;//
    //7.二级分光器箱
    private String secondSplitterBoxType;//
    private String secondAnchorearType;//
    private String secondWallMounted;//
    //8.光缆交接箱
    private String cableConnectorBoxType;//
    private String cableFloorType;//
    private String cableWallMounted;//
    //9.光缆长度统计
    private String coreNumber;//
    private String cableLength;//
    //10.皮线光缆长度统计
    private String numberOfBranches;//
    private String totalLength;//
    private String averageLength;//

    public HnGarrisonJobProgress() {
        super();
    }

    public HnGarrisonJobProgress(String jobProgressId, String operator, String buildingProject, String buildYear, String singleProjectName, String province, String city, String county, String regionalType, String garrisonLongitude, String garrisonLatitude, String constructionNature, String ascriptionEndBureau, String progressSupervisorUnitId, String progressConstructionId, String progressDesignUnitId, String primarySplitterId, String secondSplitterId, String primarySplitterBoxId, String secondSplitterBoxId, String cableConnectorBoxId, String cableLengthStatisticsId, String statisticalLengthId, String onSiteSupervision, String professionResponsiblePerson, String districtHead, String progressCompanyName, String progressLeader, String designCompanyName, String designLeader, String primarySplittingRatio, String primaryOneToFour, String primaryOneToEight, String primaryOneToSixteen, String secondSplittingRatio, String secondOneToFour, String secondOneToEight, String secondOneToSixteen, String oneToThirtyTwo, String oneToSixtyFour, String primarySplitterBoxType, String primaryAnchorearType, String primaryWallMounted, String secondSplitterBoxType, String secondAnchorearType, String secondWallMounted, String cableConnectorBoxType, String cableFloorType, String cableWallMounted, String coreNumber, String cableLength, String numberOfBranches, String totalLength, String averageLength) {
        this.jobProgressId = jobProgressId;
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
        this.progressSupervisorUnitId = progressSupervisorUnitId;
        this.progressConstructionId = progressConstructionId;
        this.progressDesignUnitId = progressDesignUnitId;
        this.primarySplitterId = primarySplitterId;
        this.secondSplitterId = secondSplitterId;
        this.primarySplitterBoxId = primarySplitterBoxId;
        this.secondSplitterBoxId = secondSplitterBoxId;
        this.cableConnectorBoxId = cableConnectorBoxId;
        this.cableLengthStatisticsId = cableLengthStatisticsId;
        this.statisticalLengthId = statisticalLengthId;
        this.onSiteSupervision = onSiteSupervision;
        this.professionResponsiblePerson = professionResponsiblePerson;
        this.districtHead = districtHead;
        this.progressCompanyName = progressCompanyName;
        this.progressLeader = progressLeader;
        this.designCompanyName = designCompanyName;
        this.designLeader = designLeader;
        this.primarySplittingRatio = primarySplittingRatio;
        this.primaryOneToFour = primaryOneToFour;
        this.primaryOneToEight = primaryOneToEight;
        this.primaryOneToSixteen = primaryOneToSixteen;
        this.secondSplittingRatio = secondSplittingRatio;
        this.secondOneToFour = secondOneToFour;
        this.secondOneToEight = secondOneToEight;
        this.secondOneToSixteen = secondOneToSixteen;
        this.oneToThirtyTwo = oneToThirtyTwo;
        this.oneToSixtyFour = oneToSixtyFour;
        this.primarySplitterBoxType = primarySplitterBoxType;
        this.primaryAnchorearType = primaryAnchorearType;
        this.primaryWallMounted = primaryWallMounted;
        this.secondSplitterBoxType = secondSplitterBoxType;
        this.secondAnchorearType = secondAnchorearType;
        this.secondWallMounted = secondWallMounted;
        this.cableConnectorBoxType = cableConnectorBoxType;
        this.cableFloorType = cableFloorType;
        this.cableWallMounted = cableWallMounted;
        this.coreNumber = coreNumber;
        this.cableLength = cableLength;
        this.numberOfBranches = numberOfBranches;
        this.totalLength = totalLength;
        this.averageLength = averageLength;
    }

    public String getJobProgressId() {
        return jobProgressId;
    }

    public void setJobProgressId(String jobProgressId) {
        this.jobProgressId = jobProgressId;
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

    public String getProgressSupervisorUnitId() {
        return progressSupervisorUnitId;
    }

    public void setProgressSupervisorUnitId(String progressSupervisorUnitId) {
        this.progressSupervisorUnitId = progressSupervisorUnitId;
    }

    public String getProgressConstructionId() {
        return progressConstructionId;
    }

    public void setProgressConstructionId(String progressConstructionId) {
        this.progressConstructionId = progressConstructionId;
    }

    public String getProgressDesignUnitId() {
        return progressDesignUnitId;
    }

    public void setProgressDesignUnitId(String progressDesignUnitId) {
        this.progressDesignUnitId = progressDesignUnitId;
    }

    public String getPrimarySplitterId() {
        return primarySplitterId;
    }

    public void setPrimarySplitterId(String primarySplitterId) {
        this.primarySplitterId = primarySplitterId;
    }

    public String getSecondSplitterId() {
        return secondSplitterId;
    }

    public void setSecondSplitterId(String secondSplitterId) {
        this.secondSplitterId = secondSplitterId;
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

    public String getCableLengthStatisticsId() {
        return cableLengthStatisticsId;
    }

    public void setCableLengthStatisticsId(String cableLengthStatisticsId) {
        this.cableLengthStatisticsId = cableLengthStatisticsId;
    }

    public String getStatisticalLengthId() {
        return statisticalLengthId;
    }

    public void setStatisticalLengthId(String statisticalLengthId) {
        this.statisticalLengthId = statisticalLengthId;
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

    public String getProgressCompanyName() {
        return progressCompanyName;
    }

    public void setProgressCompanyName(String progressCompanyName) {
        this.progressCompanyName = progressCompanyName;
    }

    public String getProgressLeader() {
        return progressLeader;
    }

    public void setProgressLeader(String progressLeader) {
        this.progressLeader = progressLeader;
    }

    public String getDesignCompanyName() {
        return designCompanyName;
    }

    public void setDesignCompanyName(String designCompanyName) {
        this.designCompanyName = designCompanyName;
    }

    public String getDesignLeader() {
        return designLeader;
    }

    public void setDesignLeader(String designLeader) {
        this.designLeader = designLeader;
    }

    public String getPrimarySplittingRatio() {
        return primarySplittingRatio;
    }

    public void setPrimarySplittingRatio(String primarySplittingRatio) {
        this.primarySplittingRatio = primarySplittingRatio;
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

    public String getSecondSplittingRatio() {
        return secondSplittingRatio;
    }

    public void setSecondSplittingRatio(String secondSplittingRatio) {
        this.secondSplittingRatio = secondSplittingRatio;
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

    public String getPrimarySplitterBoxType() {
        return primarySplitterBoxType;
    }

    public void setPrimarySplitterBoxType(String primarySplitterBoxType) {
        this.primarySplitterBoxType = primarySplitterBoxType;
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

    public String getSecondSplitterBoxType() {
        return secondSplitterBoxType;
    }

    public void setSecondSplitterBoxType(String secondSplitterBoxType) {
        this.secondSplitterBoxType = secondSplitterBoxType;
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

    public String getCableConnectorBoxType() {
        return cableConnectorBoxType;
    }

    public void setCableConnectorBoxType(String cableConnectorBoxType) {
        this.cableConnectorBoxType = cableConnectorBoxType;
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

    public String getCoreNumber() {
        return coreNumber;
    }

    public void setCoreNumber(String coreNumber) {
        this.coreNumber = coreNumber;
    }

    public String getCableLength() {
        return cableLength;
    }

    public void setCableLength(String cableLength) {
        this.cableLength = cableLength;
    }

    public String getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(String numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public String getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(String totalLength) {
        this.totalLength = totalLength;
    }

    public String getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(String averageLength) {
        this.averageLength = averageLength;
    }

    @Override
    public String toString() {
        return "HnGarrisonJobProgress{" +
                "jobProgressId='" + jobProgressId + '\'' +
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
                ", progressSupervisorUnitId='" + progressSupervisorUnitId + '\'' +
                ", progressConstructionId='" + progressConstructionId + '\'' +
                ", progressDesignUnitId='" + progressDesignUnitId + '\'' +
                ", primarySplitterId='" + primarySplitterId + '\'' +
                ", secondSplitterId='" + secondSplitterId + '\'' +
                ", primarySplitterBoxId='" + primarySplitterBoxId + '\'' +
                ", secondSplitterBoxId='" + secondSplitterBoxId + '\'' +
                ", cableConnectorBoxId='" + cableConnectorBoxId + '\'' +
                ", cableLengthStatisticsId='" + cableLengthStatisticsId + '\'' +
                ", statisticalLengthId='" + statisticalLengthId + '\'' +
                ", onSiteSupervision='" + onSiteSupervision + '\'' +
                ", professionResponsiblePerson='" + professionResponsiblePerson + '\'' +
                ", districtHead='" + districtHead + '\'' +
                ", progressCompanyName='" + progressCompanyName + '\'' +
                ", progressLeader='" + progressLeader + '\'' +
                ", designCompanyName='" + designCompanyName + '\'' +
                ", designLeader='" + designLeader + '\'' +
                ", primarySplittingRatio='" + primarySplittingRatio + '\'' +
                ", primaryOneToFour='" + primaryOneToFour + '\'' +
                ", primaryOneToEight='" + primaryOneToEight + '\'' +
                ", primaryOneToSixteen='" + primaryOneToSixteen + '\'' +
                ", secondSplittingRatio='" + secondSplittingRatio + '\'' +
                ", secondOneToFour='" + secondOneToFour + '\'' +
                ", secondOneToEight='" + secondOneToEight + '\'' +
                ", secondOneToSixteen='" + secondOneToSixteen + '\'' +
                ", oneToThirtyTwo='" + oneToThirtyTwo + '\'' +
                ", oneToSixtyFour='" + oneToSixtyFour + '\'' +
                ", primarySplitterBoxType='" + primarySplitterBoxType + '\'' +
                ", primaryAnchorearType='" + primaryAnchorearType + '\'' +
                ", primaryWallMounted='" + primaryWallMounted + '\'' +
                ", secondSplitterBoxType='" + secondSplitterBoxType + '\'' +
                ", secondAnchorearType='" + secondAnchorearType + '\'' +
                ", secondWallMounted='" + secondWallMounted + '\'' +
                ", cableConnectorBoxType='" + cableConnectorBoxType + '\'' +
                ", cableFloorType='" + cableFloorType + '\'' +
                ", cableWallMounted='" + cableWallMounted + '\'' +
                ", coreNumber='" + coreNumber + '\'' +
                ", cableLength='" + cableLength + '\'' +
                ", numberOfBranches='" + numberOfBranches + '\'' +
                ", totalLength='" + totalLength + '\'' +
                ", averageLength='" + averageLength + '\'' +
                '}';
    }
}
