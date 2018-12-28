package com.panyu.panyuprojectims.entity;
public class LlCircuitInformation {
    private String circuitInformationId;//基本信息ID
    private String operator;//运营商
    private String buildingProject;//建设项目名称
    private String buildYear;//建设年份
    private String hopName;//中继段名称
    private String province;//省
    private String city;//市
    private String county;//区(县)
    private String area;//区域
    private String subordinateDepartment;//所属部门

    private String designInstituteId;//线路设计单位ID
    private String supervisionUnitId;//线路监理单位ID
    private String constructionUnitId;//线路施工单位ID
    private String newLineLengthId;//新建线路长度ID

    private String cableType;//光缆类型

    private String cableLengthDesignId;//光缆设计皮长公里ID
    private String newFloorStandId;//新建落地式光交箱ID
    private String wornFloorStandId;//利旧落地式光交箱ID
    private String newWallMountedOnuId;//新建壁挂式光交箱ID
    private String wornWallMountedOnuId;//利旧壁挂式光交箱ID

    private String companyName;//公司名称
    private String designPersonnel;//设计人员

    private String siteLeader;//现场监理
    private String professionResponsiblePerson;//专业负责人
    private String districtHead;//区域负责人

    private String corporateName;//公司名称
    private String personInCharge;//负责人

    private String newPoleLine;//新建杆路
    private String newPipe;//新建管道
    private String directBurialOpticalCable;//直埋光缆
    private String pushPipe;//顶管

    private String gystsSuspended;//架空光缆（附挂）
    private String gystsSuspensionWire;//架空光缆（加挂吊线）
    private String gysta;//管道光缆
    private String plowInOpticalCable;//直埋光缆
    private String wallCable;//墙壁光缆
    private String inBridgeCable;//桥架内光缆
    private String gyfxts;//路面微槽光缆

    private String newFloorStandNumber;//数量
    private String newFloorStandSize;//规格

    private String wornFloorStandNumber;//数量
    private String wornFloorStandSize;//规格

    private String newWallMountedOnuNumber;//数量
    private String newWallMountedOnuSize;//规格

    private String wornWallMountedOnuNumber;//数量
    private String wornWallMountedOnuSize;//规格

    public LlCircuitInformation() {
        super();
    }

    public LlCircuitInformation(String circuitInformationId, String operator, String buildingProject, String buildYear, String hopName, String province, String city, String county, String area, String subordinateDepartment, String designInstituteId, String supervisionUnitId, String constructionUnitId, String newLineLengthId, String cableType, String cableLengthDesignId, String newFloorStandId, String wornFloorStandId, String newWallMountedOnuId, String wornWallMountedOnuId, String companyName, String designPersonnel, String siteLeader, String professionResponsiblePerson, String districtHead, String corporateName, String personInCharge, String newPoleLine, String newPipe, String directBurialOpticalCable, String pushPipe, String gystsSuspended, String gystsSuspensionWire, String gysta, String plowInOpticalCable, String wallCable, String inBridgeCable, String gyfxts, String newFloorStandNumber, String newFloorStandSize, String wornFloorStandNumber, String wornFloorStandSize, String newWallMountedOnuNumber, String newWallMountedOnuSize, String wornWallMountedOnuNumber, String wornWallMountedOnuSize) {
        this.circuitInformationId = circuitInformationId;
        this.operator = operator;
        this.buildingProject = buildingProject;
        this.buildYear = buildYear;
        this.hopName = hopName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.area = area;
        this.subordinateDepartment = subordinateDepartment;
        this.designInstituteId = designInstituteId;
        this.supervisionUnitId = supervisionUnitId;
        this.constructionUnitId = constructionUnitId;
        this.newLineLengthId = newLineLengthId;
        this.cableType = cableType;
        this.cableLengthDesignId = cableLengthDesignId;
        this.newFloorStandId = newFloorStandId;
        this.wornFloorStandId = wornFloorStandId;
        this.newWallMountedOnuId = newWallMountedOnuId;
        this.wornWallMountedOnuId = wornWallMountedOnuId;
        this.companyName = companyName;
        this.designPersonnel = designPersonnel;
        this.siteLeader = siteLeader;
        this.professionResponsiblePerson = professionResponsiblePerson;
        this.districtHead = districtHead;
        this.corporateName = corporateName;
        this.personInCharge = personInCharge;
        this.newPoleLine = newPoleLine;
        this.newPipe = newPipe;
        this.directBurialOpticalCable = directBurialOpticalCable;
        this.pushPipe = pushPipe;
        this.gystsSuspended = gystsSuspended;
        this.gystsSuspensionWire = gystsSuspensionWire;
        this.gysta = gysta;
        this.plowInOpticalCable = plowInOpticalCable;
        this.wallCable = wallCable;
        this.inBridgeCable = inBridgeCable;
        this.gyfxts = gyfxts;
        this.newFloorStandNumber = newFloorStandNumber;
        this.newFloorStandSize = newFloorStandSize;
        this.wornFloorStandNumber = wornFloorStandNumber;
        this.wornFloorStandSize = wornFloorStandSize;
        this.newWallMountedOnuNumber = newWallMountedOnuNumber;
        this.newWallMountedOnuSize = newWallMountedOnuSize;
        this.wornWallMountedOnuNumber = wornWallMountedOnuNumber;
        this.wornWallMountedOnuSize = wornWallMountedOnuSize;
    }

    public String getCircuitInformationId() {
        return circuitInformationId;
    }

    public void setCircuitInformationId(String circuitInformationId) {
        this.circuitInformationId = circuitInformationId;
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

    public String getSubordinateDepartment() {
        return subordinateDepartment;
    }

    public void setSubordinateDepartment(String subordinateDepartment) {
        this.subordinateDepartment = subordinateDepartment;
    }

    public String getDesignInstituteId() {
        return designInstituteId;
    }

    public void setDesignInstituteId(String designInstituteId) {
        this.designInstituteId = designInstituteId;
    }

    public String getSupervisionUnitId() {
        return supervisionUnitId;
    }

    public void setSupervisionUnitId(String supervisionUnitId) {
        this.supervisionUnitId = supervisionUnitId;
    }

    public String getConstructionUnitId() {
        return constructionUnitId;
    }

    public void setConstructionUnitId(String constructionUnitId) {
        this.constructionUnitId = constructionUnitId;
    }

    public String getNewLineLengthId() {
        return newLineLengthId;
    }

    public void setNewLineLengthId(String newLineLengthId) {
        this.newLineLengthId = newLineLengthId;
    }

    public String getCableType() {
        return cableType;
    }

    public void setCableType(String cableType) {
        this.cableType = cableType;
    }

    public String getCableLengthDesignId() {
        return cableLengthDesignId;
    }

    public void setCableLengthDesignId(String cableLengthDesignId) {
        this.cableLengthDesignId = cableLengthDesignId;
    }

    public String getNewFloorStandId() {
        return newFloorStandId;
    }

    public void setNewFloorStandId(String newFloorStandId) {
        this.newFloorStandId = newFloorStandId;
    }

    public String getWornFloorStandId() {
        return wornFloorStandId;
    }

    public void setWornFloorStandId(String wornFloorStandId) {
        this.wornFloorStandId = wornFloorStandId;
    }

    public String getNewWallMountedOnuId() {
        return newWallMountedOnuId;
    }

    public void setNewWallMountedOnuId(String newWallMountedOnuId) {
        this.newWallMountedOnuId = newWallMountedOnuId;
    }

    public String getWornWallMountedOnuId() {
        return wornWallMountedOnuId;
    }

    public void setWornWallMountedOnuId(String wornWallMountedOnuId) {
        this.wornWallMountedOnuId = wornWallMountedOnuId;
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

    public String getNewPoleLine() {
        return newPoleLine;
    }

    public void setNewPoleLine(String newPoleLine) {
        this.newPoleLine = newPoleLine;
    }

    public String getNewPipe() {
        return newPipe;
    }

    public void setNewPipe(String newPipe) {
        this.newPipe = newPipe;
    }

    public String getDirectBurialOpticalCable() {
        return directBurialOpticalCable;
    }

    public void setDirectBurialOpticalCable(String directBurialOpticalCable) {
        this.directBurialOpticalCable = directBurialOpticalCable;
    }

    public String getPushPipe() {
        return pushPipe;
    }

    public void setPushPipe(String pushPipe) {
        this.pushPipe = pushPipe;
    }

    public String getGystsSuspended() {
        return gystsSuspended;
    }

    public void setGystsSuspended(String gystsSuspended) {
        this.gystsSuspended = gystsSuspended;
    }

    public String getGystsSuspensionWire() {
        return gystsSuspensionWire;
    }

    public void setGystsSuspensionWire(String gystsSuspensionWire) {
        this.gystsSuspensionWire = gystsSuspensionWire;
    }

    public String getGysta() {
        return gysta;
    }

    public void setGysta(String gysta) {
        this.gysta = gysta;
    }

    public String getPlowInOpticalCable() {
        return plowInOpticalCable;
    }

    public void setPlowInOpticalCable(String plowInOpticalCable) {
        this.plowInOpticalCable = plowInOpticalCable;
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

    public String getNewFloorStandNumber() {
        return newFloorStandNumber;
    }

    public void setNewFloorStandNumber(String newFloorStandNumber) {
        this.newFloorStandNumber = newFloorStandNumber;
    }

    public String getNewFloorStandSize() {
        return newFloorStandSize;
    }

    public void setNewFloorStandSize(String newFloorStandSize) {
        this.newFloorStandSize = newFloorStandSize;
    }

    public String getWornFloorStandNumber() {
        return wornFloorStandNumber;
    }

    public void setWornFloorStandNumber(String wornFloorStandNumber) {
        this.wornFloorStandNumber = wornFloorStandNumber;
    }

    public String getWornFloorStandSize() {
        return wornFloorStandSize;
    }

    public void setWornFloorStandSize(String wornFloorStandSize) {
        this.wornFloorStandSize = wornFloorStandSize;
    }

    public String getNewWallMountedOnuNumber() {
        return newWallMountedOnuNumber;
    }

    public void setNewWallMountedOnuNumber(String newWallMountedOnuNumber) {
        this.newWallMountedOnuNumber = newWallMountedOnuNumber;
    }

    public String getNewWallMountedOnuSize() {
        return newWallMountedOnuSize;
    }

    public void setNewWallMountedOnuSize(String newWallMountedOnuSize) {
        this.newWallMountedOnuSize = newWallMountedOnuSize;
    }

    public String getWornWallMountedOnuNumber() {
        return wornWallMountedOnuNumber;
    }

    public void setWornWallMountedOnuNumber(String wornWallMountedOnuNumber) {
        this.wornWallMountedOnuNumber = wornWallMountedOnuNumber;
    }

    public String getWornWallMountedOnuSize() {
        return wornWallMountedOnuSize;
    }

    public void setWornWallMountedOnuSize(String wornWallMountedOnuSize) {
        this.wornWallMountedOnuSize = wornWallMountedOnuSize;
    }

    @Override
    public String toString() {
        return "LlCircuitInformation{" +
                "circuitInformationId='" + circuitInformationId + '\'' +
                ", operator='" + operator + '\'' +
                ", buildingProject='" + buildingProject + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", hopName='" + hopName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", area='" + area + '\'' +
                ", subordinateDepartment='" + subordinateDepartment + '\'' +
                ", designInstituteId='" + designInstituteId + '\'' +
                ", supervisionUnitId='" + supervisionUnitId + '\'' +
                ", constructionUnitId='" + constructionUnitId + '\'' +
                ", newLineLengthId='" + newLineLengthId + '\'' +
                ", cableType='" + cableType + '\'' +
                ", cableLengthDesignId='" + cableLengthDesignId + '\'' +
                ", newFloorStandId='" + newFloorStandId + '\'' +
                ", wornFloorStandId='" + wornFloorStandId + '\'' +
                ", newWallMountedOnuId='" + newWallMountedOnuId + '\'' +
                ", wornWallMountedOnuId='" + wornWallMountedOnuId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", designPersonnel='" + designPersonnel + '\'' +
                ", siteLeader='" + siteLeader + '\'' +
                ", professionResponsiblePerson='" + professionResponsiblePerson + '\'' +
                ", districtHead='" + districtHead + '\'' +
                ", corporateName='" + corporateName + '\'' +
                ", personInCharge='" + personInCharge + '\'' +
                ", newPoleLine='" + newPoleLine + '\'' +
                ", newPipe='" + newPipe + '\'' +
                ", directBurialOpticalCable='" + directBurialOpticalCable + '\'' +
                ", pushPipe='" + pushPipe + '\'' +
                ", gystsSuspended='" + gystsSuspended + '\'' +
                ", gystsSuspensionWire='" + gystsSuspensionWire + '\'' +
                ", gysta='" + gysta + '\'' +
                ", plowInOpticalCable='" + plowInOpticalCable + '\'' +
                ", wallCable='" + wallCable + '\'' +
                ", inBridgeCable='" + inBridgeCable + '\'' +
                ", gyfxts='" + gyfxts + '\'' +
                ", newFloorStandNumber='" + newFloorStandNumber + '\'' +
                ", newFloorStandSize='" + newFloorStandSize + '\'' +
                ", wornFloorStandNumber='" + wornFloorStandNumber + '\'' +
                ", wornFloorStandSize='" + wornFloorStandSize + '\'' +
                ", newWallMountedOnuNumber='" + newWallMountedOnuNumber + '\'' +
                ", newWallMountedOnuSize='" + newWallMountedOnuSize + '\'' +
                ", wornWallMountedOnuNumber='" + wornWallMountedOnuNumber + '\'' +
                ", wornWallMountedOnuSize='" + wornWallMountedOnuSize + '\'' +
                '}';
    }
}
