package com.panyu.panyuprojectims.entity;
public class LlCircuitProgress {
    private String circuitProgressId;//线路进度ID
    private String operator;//运营商
    private String buildingProject;//建设项目名称
    private String buildYear;//建设年份
    private String hopName;//中继段名称
    private String province;//省
    private String city;//市
    private String county;//区(县)
    private String area;//区域

    private String designInstituteId;//设计单位ID
    private String companyName;//公司名称
    private String designPersonnel;//设计人员

    private String supervisionUnitId;//监理单位ID
    private String siteLeader;//现场监理
    private String professionResponsiblePerson;//专业负责人
    private String districtHead;//区域负责人

    private String constructionUnitId;//施工单位ID
    private String corporateName;//公司名称
    private String personInCharge;//负责人

    private String newLineLengthsId;//新建新路长度ID

    private String newPoleLineId;//新建杆路ID
    private String poleDesignLength;//设计长度
    private String poleCompletionLength;//完工长度

    private String newPipeLineId;//管道ID
    private String pipelineDesignLength;//设计长度
    private String pipelineCompletionLength;//完工长度

    private String buriedLightguideId;//直埋光缆ID
    private String buriedDesignLength;//设计长度
    private String buriedCompletionLength;//完工长度

    private String pushPipeId;//顶管ID
    private String pushDesignLength;//设计长度
    private String pushCompletionLength;//完工长度

    private String cableType;//光缆类型

    private String cableLengthDesignsId;//光缆设计皮长公里ID

    private String suspendedId;//架空光缆（附挂）ID
    private String suspendedDesignLength;//设计长度
    private String suspendedLaidLength;//敷设长度

    private String messengerWireId;//架空光缆（加挂吊线）ID
    private String messengerDesignLength;//设计长度
    private String messengerLaidLength;//敷设长度

    private String gystaId;//管道光缆ID
    private String gystaDesignLength;//设计长度
    private String gystaLaidLength;//敷设长度

    private String buriedServiceLightguideId;//直埋光缆ID
    private String lightguideDesignLength;//设计长度
    private String lightguideLaidLength;//敷设长度

    private String wallCableId;//墙壁光缆ID
    private String wallDesignLength;//设计长度
    private String wallLaidLength;//敷设长度

    private String bridgeCableId;//桥架内光缆ID
    private String bridgeDesignLength;//设计长度
    private String bridgeLaidLength;//敷设长度

    private String gyfxtsId;//路面微槽光缆ID
    private String gyfxtsDesignLength;//设计长度
    private String gyfxtsLaidLength;//敷设长度

    private String newModelOnuId;//落地式光交箱（新建）ID
    private String newOnuDesignStart;//设计数量
    private String newModelOnuSize;//规格
    private String newOnuInstallationNumber;//安装数量

    private String wornModelOnuId;//落地式光交箱(利旧)ID
    private String wornOnuDesignStart;//设计数量
    private String wornModelOnuSize;//规格
    private String wornOnuInstallationNumber;//安装数量

    private String newWallTypeId;//壁挂式光交箱（新建）ID
    private String newWallDesignStart;//设计数量
    private String newWallOnuSize;//规格
    private String newWallInstallationNumber;//安装数量

    private String wornWallTypeId;//壁挂式光交箱（利旧）ID
    private String wornWallDesignStart;//设计数量
    private String wornWallOnuSize;//规格
    private String wornWallInstallationNumber;//安装数量


    public LlCircuitProgress() {
        super();
    }

    public LlCircuitProgress(String circuitProgressId, String operator, String buildingProject, String buildYear, String hopName, String province, String city, String county, String area, String designInstituteId, String companyName, String designPersonnel, String supervisionUnitId, String siteLeader, String professionResponsiblePerson, String districtHead, String constructionUnitId, String corporateName, String personInCharge, String newLineLengthsId, String newPoleLineId, String poleDesignLength, String poleCompletionLength, String newPipeLineId, String pipelineDesignLength, String pipelineCompletionLength, String buriedLightguideId, String buriedDesignLength, String buriedCompletionLength, String pushPipeId, String pushDesignLength, String pushCompletionLength, String cableType, String cableLengthDesignsId, String suspendedId, String suspendedDesignLength, String suspendedLaidLength, String messengerWireId, String messengerDesignLength, String messengerLaidLength, String gystaId, String gystaDesignLength, String gystaLaidLength, String buriedServiceLightguideId, String lightguideDesignLength, String lightguideLaidLength, String wallCableId, String wallDesignLength, String wallLaidLength, String bridgeCableId, String bridgeDesignLength, String bridgeLaidLength, String gyfxtsId, String gyfxtsDesignLength, String gyfxtsLaidLength, String newModelOnuId, String newOnuDesignStart, String newModelOnuSize, String newOnuInstallationNumber, String wornModelOnuId, String wornOnuDesignStart, String wornModelOnuSize, String wornOnuInstallationNumber, String newWallTypeId, String newWallDesignStart, String newWallOnuSize, String newWallInstallationNumber, String wornWallTypeId, String wornWallDesignStart, String wornWallOnuSize, String wornWallInstallationNumber) {
        this.circuitProgressId = circuitProgressId;
        this.operator = operator;
        this.buildingProject = buildingProject;
        this.buildYear = buildYear;
        this.hopName = hopName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.area = area;
        this.designInstituteId = designInstituteId;
        this.companyName = companyName;
        this.designPersonnel = designPersonnel;
        this.supervisionUnitId = supervisionUnitId;
        this.siteLeader = siteLeader;
        this.professionResponsiblePerson = professionResponsiblePerson;
        this.districtHead = districtHead;
        this.constructionUnitId = constructionUnitId;
        this.corporateName = corporateName;
        this.personInCharge = personInCharge;
        this.newLineLengthsId = newLineLengthsId;
        this.newPoleLineId = newPoleLineId;
        this.poleDesignLength = poleDesignLength;
        this.poleCompletionLength = poleCompletionLength;
        this.newPipeLineId = newPipeLineId;
        this.pipelineDesignLength = pipelineDesignLength;
        this.pipelineCompletionLength = pipelineCompletionLength;
        this.buriedLightguideId = buriedLightguideId;
        this.buriedDesignLength = buriedDesignLength;
        this.buriedCompletionLength = buriedCompletionLength;
        this.pushPipeId = pushPipeId;
        this.pushDesignLength = pushDesignLength;
        this.pushCompletionLength = pushCompletionLength;
        this.cableType = cableType;
        this.cableLengthDesignsId = cableLengthDesignsId;
        this.suspendedId = suspendedId;
        this.suspendedDesignLength = suspendedDesignLength;
        this.suspendedLaidLength = suspendedLaidLength;
        this.messengerWireId = messengerWireId;
        this.messengerDesignLength = messengerDesignLength;
        this.messengerLaidLength = messengerLaidLength;
        this.gystaId = gystaId;
        this.gystaDesignLength = gystaDesignLength;
        this.gystaLaidLength = gystaLaidLength;
        this.buriedServiceLightguideId = buriedServiceLightguideId;
        this.lightguideDesignLength = lightguideDesignLength;
        this.lightguideLaidLength = lightguideLaidLength;
        this.wallCableId = wallCableId;
        this.wallDesignLength = wallDesignLength;
        this.wallLaidLength = wallLaidLength;
        this.bridgeCableId = bridgeCableId;
        this.bridgeDesignLength = bridgeDesignLength;
        this.bridgeLaidLength = bridgeLaidLength;
        this.gyfxtsId = gyfxtsId;
        this.gyfxtsDesignLength = gyfxtsDesignLength;
        this.gyfxtsLaidLength = gyfxtsLaidLength;
        this.newModelOnuId = newModelOnuId;
        this.newOnuDesignStart = newOnuDesignStart;
        this.newModelOnuSize = newModelOnuSize;
        this.newOnuInstallationNumber = newOnuInstallationNumber;
        this.wornModelOnuId = wornModelOnuId;
        this.wornOnuDesignStart = wornOnuDesignStart;
        this.wornModelOnuSize = wornModelOnuSize;
        this.wornOnuInstallationNumber = wornOnuInstallationNumber;
        this.newWallTypeId = newWallTypeId;
        this.newWallDesignStart = newWallDesignStart;
        this.newWallOnuSize = newWallOnuSize;
        this.newWallInstallationNumber = newWallInstallationNumber;
        this.wornWallTypeId = wornWallTypeId;
        this.wornWallDesignStart = wornWallDesignStart;
        this.wornWallOnuSize = wornWallOnuSize;
        this.wornWallInstallationNumber = wornWallInstallationNumber;
    }

    public String getCircuitProgressId() {
        return circuitProgressId;
    }

    public void setCircuitProgressId(String circuitProgressId) {
        this.circuitProgressId = circuitProgressId;
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

    public String getHopName() {
        return hopName;
    }

    public void setHopName(String hopName) {
        this.hopName = hopName;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDesignInstituteId() {
        return designInstituteId;
    }

    public void setDesignInstituteId(String designInstituteId) {
        this.designInstituteId = designInstituteId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignPersonnel() {
        return designPersonnel;
    }

    public void setDesignPersonnel(String designPersonnel) {
        this.designPersonnel = designPersonnel;
    }

    public String getSupervisionUnitId() {
        return supervisionUnitId;
    }

    public void setSupervisionUnitId(String supervisionUnitId) {
        this.supervisionUnitId = supervisionUnitId;
    }

    public String getSiteLeader() {
        return siteLeader;
    }

    public void setSiteLeader(String siteLeader) {
        this.siteLeader = siteLeader;
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

    public String getConstructionUnitId() {
        return constructionUnitId;
    }

    public void setConstructionUnitId(String constructionUnitId) {
        this.constructionUnitId = constructionUnitId;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getNewLineLengthsId() {
        return newLineLengthsId;
    }

    public void setNewLineLengthsId(String newLineLengthsId) {
        this.newLineLengthsId = newLineLengthsId;
    }

    public String getNewPoleLineId() {
        return newPoleLineId;
    }

    public void setNewPoleLineId(String newPoleLineId) {
        this.newPoleLineId = newPoleLineId;
    }

    public String getPoleDesignLength() {
        return poleDesignLength;
    }

    public void setPoleDesignLength(String poleDesignLength) {
        this.poleDesignLength = poleDesignLength;
    }

    public String getPoleCompletionLength() {
        return poleCompletionLength;
    }

    public void setPoleCompletionLength(String poleCompletionLength) {
        this.poleCompletionLength = poleCompletionLength;
    }

    public String getNewPipeLineId() {
        return newPipeLineId;
    }

    public void setNewPipeLineId(String newPipeLineId) {
        this.newPipeLineId = newPipeLineId;
    }

    public String getPipelineDesignLength() {
        return pipelineDesignLength;
    }

    public void setPipelineDesignLength(String pipelineDesignLength) {
        this.pipelineDesignLength = pipelineDesignLength;
    }

    public String getPipelineCompletionLength() {
        return pipelineCompletionLength;
    }

    public void setPipelineCompletionLength(String pipelineCompletionLength) {
        this.pipelineCompletionLength = pipelineCompletionLength;
    }

    public String getBuriedLightguideId() {
        return buriedLightguideId;
    }

    public void setBuriedLightguideId(String buriedLightguideId) {
        this.buriedLightguideId = buriedLightguideId;
    }

    public String getBuriedDesignLength() {
        return buriedDesignLength;
    }

    public void setBuriedDesignLength(String buriedDesignLength) {
        this.buriedDesignLength = buriedDesignLength;
    }

    public String getBuriedCompletionLength() {
        return buriedCompletionLength;
    }

    public void setBuriedCompletionLength(String buriedCompletionLength) {
        this.buriedCompletionLength = buriedCompletionLength;
    }

    public String getPushPipeId() {
        return pushPipeId;
    }

    public void setPushPipeId(String pushPipeId) {
        this.pushPipeId = pushPipeId;
    }

    public String getPushDesignLength() {
        return pushDesignLength;
    }

    public void setPushDesignLength(String pushDesignLength) {
        this.pushDesignLength = pushDesignLength;
    }

    public String getPushCompletionLength() {
        return pushCompletionLength;
    }

    public void setPushCompletionLength(String pushCompletionLength) {
        this.pushCompletionLength = pushCompletionLength;
    }

    public String getCableType() {
        return cableType;
    }

    public void setCableType(String cableType) {
        this.cableType = cableType;
    }

    public String getCableLengthDesignsId() {
        return cableLengthDesignsId;
    }

    public void setCableLengthDesignsId(String cableLengthDesignsId) {
        this.cableLengthDesignsId = cableLengthDesignsId;
    }

    public String getSuspendedId() {
        return suspendedId;
    }

    public void setSuspendedId(String suspendedId) {
        this.suspendedId = suspendedId;
    }

    public String getSuspendedDesignLength() {
        return suspendedDesignLength;
    }

    public void setSuspendedDesignLength(String suspendedDesignLength) {
        this.suspendedDesignLength = suspendedDesignLength;
    }

    public String getSuspendedLaidLength() {
        return suspendedLaidLength;
    }

    public void setSuspendedLaidLength(String suspendedLaidLength) {
        this.suspendedLaidLength = suspendedLaidLength;
    }

    public String getMessengerWireId() {
        return messengerWireId;
    }

    public void setMessengerWireId(String messengerWireId) {
        this.messengerWireId = messengerWireId;
    }

    public String getMessengerDesignLength() {
        return messengerDesignLength;
    }

    public void setMessengerDesignLength(String messengerDesignLength) {
        this.messengerDesignLength = messengerDesignLength;
    }

    public String getMessengerLaidLength() {
        return messengerLaidLength;
    }

    public void setMessengerLaidLength(String messengerLaidLength) {
        this.messengerLaidLength = messengerLaidLength;
    }

    public String getGystaId() {
        return gystaId;
    }

    public void setGystaId(String gystaId) {
        this.gystaId = gystaId;
    }

    public String getGystaDesignLength() {
        return gystaDesignLength;
    }

    public void setGystaDesignLength(String gystaDesignLength) {
        this.gystaDesignLength = gystaDesignLength;
    }

    public String getGystaLaidLength() {
        return gystaLaidLength;
    }

    public void setGystaLaidLength(String gystaLaidLength) {
        this.gystaLaidLength = gystaLaidLength;
    }

    public String getBuriedServiceLightguideId() {
        return buriedServiceLightguideId;
    }

    public void setBuriedServiceLightguideId(String buriedServiceLightguideId) {
        this.buriedServiceLightguideId = buriedServiceLightguideId;
    }

    public String getLightguideDesignLength() {
        return lightguideDesignLength;
    }

    public void setLightguideDesignLength(String lightguideDesignLength) {
        this.lightguideDesignLength = lightguideDesignLength;
    }

    public String getLightguideLaidLength() {
        return lightguideLaidLength;
    }

    public void setLightguideLaidLength(String lightguideLaidLength) {
        this.lightguideLaidLength = lightguideLaidLength;
    }

    public String getWallCableId() {
        return wallCableId;
    }

    public void setWallCableId(String wallCableId) {
        this.wallCableId = wallCableId;
    }

    public String getWallDesignLength() {
        return wallDesignLength;
    }

    public void setWallDesignLength(String wallDesignLength) {
        this.wallDesignLength = wallDesignLength;
    }

    public String getWallLaidLength() {
        return wallLaidLength;
    }

    public void setWallLaidLength(String wallLaidLength) {
        this.wallLaidLength = wallLaidLength;
    }

    public String getBridgeCableId() {
        return bridgeCableId;
    }

    public void setBridgeCableId(String bridgeCableId) {
        this.bridgeCableId = bridgeCableId;
    }

    public String getBridgeDesignLength() {
        return bridgeDesignLength;
    }

    public void setBridgeDesignLength(String bridgeDesignLength) {
        this.bridgeDesignLength = bridgeDesignLength;
    }

    public String getBridgeLaidLength() {
        return bridgeLaidLength;
    }

    public void setBridgeLaidLength(String bridgeLaidLength) {
        this.bridgeLaidLength = bridgeLaidLength;
    }

    public String getGyfxtsId() {
        return gyfxtsId;
    }

    public void setGyfxtsId(String gyfxtsId) {
        this.gyfxtsId = gyfxtsId;
    }

    public String getGyfxtsDesignLength() {
        return gyfxtsDesignLength;
    }

    public void setGyfxtsDesignLength(String gyfxtsDesignLength) {
        this.gyfxtsDesignLength = gyfxtsDesignLength;
    }

    public String getGyfxtsLaidLength() {
        return gyfxtsLaidLength;
    }

    public void setGyfxtsLaidLength(String gyfxtsLaidLength) {
        this.gyfxtsLaidLength = gyfxtsLaidLength;
    }

    public String getNewModelOnuId() {
        return newModelOnuId;
    }

    public void setNewModelOnuId(String newModelOnuId) {
        this.newModelOnuId = newModelOnuId;
    }

    public String getNewOnuDesignStart() {
        return newOnuDesignStart;
    }

    public void setNewOnuDesignStart(String newOnuDesignStart) {
        this.newOnuDesignStart = newOnuDesignStart;
    }

    public String getNewModelOnuSize() {
        return newModelOnuSize;
    }

    public void setNewModelOnuSize(String newModelOnuSize) {
        this.newModelOnuSize = newModelOnuSize;
    }

    public String getNewOnuInstallationNumber() {
        return newOnuInstallationNumber;
    }

    public void setNewOnuInstallationNumber(String newOnuInstallationNumber) {
        this.newOnuInstallationNumber = newOnuInstallationNumber;
    }

    public String getWornModelOnuId() {
        return wornModelOnuId;
    }

    public void setWornModelOnuId(String wornModelOnuId) {
        this.wornModelOnuId = wornModelOnuId;
    }

    public String getWornOnuDesignStart() {
        return wornOnuDesignStart;
    }

    public void setWornOnuDesignStart(String wornOnuDesignStart) {
        this.wornOnuDesignStart = wornOnuDesignStart;
    }

    public String getWornModelOnuSize() {
        return wornModelOnuSize;
    }

    public void setWornModelOnuSize(String wornModelOnuSize) {
        this.wornModelOnuSize = wornModelOnuSize;
    }

    public String getWornOnuInstallationNumber() {
        return wornOnuInstallationNumber;
    }

    public void setWornOnuInstallationNumber(String wornOnuInstallationNumber) {
        this.wornOnuInstallationNumber = wornOnuInstallationNumber;
    }

    public String getNewWallTypeId() {
        return newWallTypeId;
    }

    public void setNewWallTypeId(String newWallTypeId) {
        this.newWallTypeId = newWallTypeId;
    }

    public String getNewWallDesignStart() {
        return newWallDesignStart;
    }

    public void setNewWallDesignStart(String newWallDesignStart) {
        this.newWallDesignStart = newWallDesignStart;
    }

    public String getNewWallOnuSize() {
        return newWallOnuSize;
    }

    public void setNewWallOnuSize(String newWallOnuSize) {
        this.newWallOnuSize = newWallOnuSize;
    }

    public String getNewWallInstallationNumber() {
        return newWallInstallationNumber;
    }

    public void setNewWallInstallationNumber(String newWallInstallationNumber) {
        this.newWallInstallationNumber = newWallInstallationNumber;
    }

    public String getWornWallTypeId() {
        return wornWallTypeId;
    }

    public void setWornWallTypeId(String wornWallTypeId) {
        this.wornWallTypeId = wornWallTypeId;
    }

    public String getWornWallDesignStart() {
        return wornWallDesignStart;
    }

    public void setWornWallDesignStart(String wornWallDesignStart) {
        this.wornWallDesignStart = wornWallDesignStart;
    }

    public String getWornWallOnuSize() {
        return wornWallOnuSize;
    }

    public void setWornWallOnuSize(String wornWallOnuSize) {
        this.wornWallOnuSize = wornWallOnuSize;
    }

    public String getWornWallInstallationNumber() {
        return wornWallInstallationNumber;
    }

    public void setWornWallInstallationNumber(String wornWallInstallationNumber) {
        this.wornWallInstallationNumber = wornWallInstallationNumber;
    }

    @Override
    public String toString() {
        return "LlCircuitProgress{" +
                "circuitProgressId='" + circuitProgressId + '\'' +
                ", operator='" + operator + '\'' +
                ", buildingProject='" + buildingProject + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", hopName='" + hopName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", area='" + area + '\'' +
                ", designInstituteId='" + designInstituteId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", designPersonnel='" + designPersonnel + '\'' +
                ", supervisionUnitId='" + supervisionUnitId + '\'' +
                ", siteLeader='" + siteLeader + '\'' +
                ", professionResponsiblePerson='" + professionResponsiblePerson + '\'' +
                ", districtHead='" + districtHead + '\'' +
                ", constructionUnitId='" + constructionUnitId + '\'' +
                ", corporateName='" + corporateName + '\'' +
                ", personInCharge='" + personInCharge + '\'' +
                ", newLineLengthsId='" + newLineLengthsId + '\'' +
                ", newPoleLineId='" + newPoleLineId + '\'' +
                ", poleDesignLength='" + poleDesignLength + '\'' +
                ", poleCompletionLength='" + poleCompletionLength + '\'' +
                ", newPipeLineId='" + newPipeLineId + '\'' +
                ", pipelineDesignLength='" + pipelineDesignLength + '\'' +
                ", pipelineCompletionLength='" + pipelineCompletionLength + '\'' +
                ", buriedLightguideId='" + buriedLightguideId + '\'' +
                ", buriedDesignLength='" + buriedDesignLength + '\'' +
                ", buriedCompletionLength='" + buriedCompletionLength + '\'' +
                ", pushPipeId='" + pushPipeId + '\'' +
                ", pushDesignLength='" + pushDesignLength + '\'' +
                ", pushCompletionLength='" + pushCompletionLength + '\'' +
                ", cableType='" + cableType + '\'' +
                ", cableLengthDesignsId='" + cableLengthDesignsId + '\'' +
                ", suspendedId='" + suspendedId + '\'' +
                ", suspendedDesignLength='" + suspendedDesignLength + '\'' +
                ", suspendedLaidLength='" + suspendedLaidLength + '\'' +
                ", messengerWireId='" + messengerWireId + '\'' +
                ", messengerDesignLength='" + messengerDesignLength + '\'' +
                ", messengerLaidLength='" + messengerLaidLength + '\'' +
                ", gystaId='" + gystaId + '\'' +
                ", gystaDesignLength='" + gystaDesignLength + '\'' +
                ", gystaLaidLength='" + gystaLaidLength + '\'' +
                ", buriedServiceLightguideId='" + buriedServiceLightguideId + '\'' +
                ", lightguideDesignLength='" + lightguideDesignLength + '\'' +
                ", lightguideLaidLength='" + lightguideLaidLength + '\'' +
                ", wallCableId='" + wallCableId + '\'' +
                ", wallDesignLength='" + wallDesignLength + '\'' +
                ", wallLaidLength='" + wallLaidLength + '\'' +
                ", bridgeCableId='" + bridgeCableId + '\'' +
                ", bridgeDesignLength='" + bridgeDesignLength + '\'' +
                ", bridgeLaidLength='" + bridgeLaidLength + '\'' +
                ", gyfxtsId='" + gyfxtsId + '\'' +
                ", gyfxtsDesignLength='" + gyfxtsDesignLength + '\'' +
                ", gyfxtsLaidLength='" + gyfxtsLaidLength + '\'' +
                ", newModelOnuId='" + newModelOnuId + '\'' +
                ", newOnuDesignStart='" + newOnuDesignStart + '\'' +
                ", newModelOnuSize='" + newModelOnuSize + '\'' +
                ", newOnuInstallationNumber='" + newOnuInstallationNumber + '\'' +
                ", wornModelOnuId='" + wornModelOnuId + '\'' +
                ", wornOnuDesignStart='" + wornOnuDesignStart + '\'' +
                ", wornModelOnuSize='" + wornModelOnuSize + '\'' +
                ", wornOnuInstallationNumber='" + wornOnuInstallationNumber + '\'' +
                ", newWallTypeId='" + newWallTypeId + '\'' +
                ", newWallDesignStart='" + newWallDesignStart + '\'' +
                ", newWallOnuSize='" + newWallOnuSize + '\'' +
                ", newWallInstallationNumber='" + newWallInstallationNumber + '\'' +
                ", wornWallTypeId='" + wornWallTypeId + '\'' +
                ", wornWallDesignStart='" + wornWallDesignStart + '\'' +
                ", wornWallOnuSize='" + wornWallOnuSize + '\'' +
                ", wornWallInstallationNumber='" + wornWallInstallationNumber + '\'' +
                '}';
    }
}
