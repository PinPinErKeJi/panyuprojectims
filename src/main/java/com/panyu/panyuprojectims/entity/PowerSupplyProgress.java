package com.panyu.panyuprojectims.entity;
public class PowerSupplyProgress {
    private String powerProgressId;//进度ID
    private String operator;//运营商
    private String buildYear;//建设年份
    private String buildingProject;//建设项目名称
    private String motorRoomName;//机房名称
    private String motorRoomLongitude;//机房经度
    private String motorRoomLatitude;//机房纬度
    private String province;//省
    private String city;//市
    private String county;//区(县)
    private String siteSupervision;//现场监理
    private String projectLeader;//项目负责人

    private String progressEquipmentId;//新增设备ID
    private String progressPowerCableId;//新增电力电缆ID
    private String progressCablingRackId;//新增走线架ID

    private String progressEquipmentNumber;//编号
    private String progressEquipmentType;//类型
    private String progressEquipmentModel;//型号
    private String progressEquipmentSize;//尺寸
    private String constructionProgress;//施工进度
    private String equipmentArrivalTime;//到货时间
    private String installationTime;//安装时间
    private String chargingTime;//加电时间

    private String progressPowerCableNumber;//编号
    private String progressPowerCableModel;//型号
    private String progressPowerLength;//长度（m）
    private String beFrom;//From
    private String beTo;//To
    private String constructionSchedule;//施工进度
    private String powerCableMakespan;//完工时间

    private String progressCablingRackNumber;//编号
    private String progressRackLength;//长度
    private String rackConstructionProgress;//施工进度
    private String cablingRackMakespan;//完工时间

    public PowerSupplyProgress() {
        super();
    }

    public PowerSupplyProgress(String powerProgressId, String operator, String buildYear, String buildingProject, String motorRoomName, String motorRoomLongitude, String motorRoomLatitude, String province, String city, String county, String siteSupervision, String projectLeader, String progressEquipmentId, String progressPowerCableId, String progressCablingRackId, String progressEquipmentNumber, String progressEquipmentType, String progressEquipmentModel, String progressEquipmentSize, String constructionProgress, String equipmentArrivalTime, String installationTime, String chargingTime, String progressPowerCableNumber, String progressPowerCableModel, String progressPowerLength, String beFrom, String beTo, String constructionSchedule, String powerCableMakespan, String progressCablingRackNumber, String progressRackLength, String rackConstructionProgress, String cablingRackMakespan) {
        this.powerProgressId = powerProgressId;
        this.operator = operator;
        this.buildYear = buildYear;
        this.buildingProject = buildingProject;
        this.motorRoomName = motorRoomName;
        this.motorRoomLongitude = motorRoomLongitude;
        this.motorRoomLatitude = motorRoomLatitude;
        this.province = province;
        this.city = city;
        this.county = county;
        this.siteSupervision = siteSupervision;
        this.projectLeader = projectLeader;
        this.progressEquipmentId = progressEquipmentId;
        this.progressPowerCableId = progressPowerCableId;
        this.progressCablingRackId = progressCablingRackId;
        this.progressEquipmentNumber = progressEquipmentNumber;
        this.progressEquipmentType = progressEquipmentType;
        this.progressEquipmentModel = progressEquipmentModel;
        this.progressEquipmentSize = progressEquipmentSize;
        this.constructionProgress = constructionProgress;
        this.equipmentArrivalTime = equipmentArrivalTime;
        this.installationTime = installationTime;
        this.chargingTime = chargingTime;
        this.progressPowerCableNumber = progressPowerCableNumber;
        this.progressPowerCableModel = progressPowerCableModel;
        this.progressPowerLength = progressPowerLength;
        this.beFrom = beFrom;
        this.beTo = beTo;
        this.constructionSchedule = constructionSchedule;
        this.powerCableMakespan = powerCableMakespan;
        this.progressCablingRackNumber = progressCablingRackNumber;
        this.progressRackLength = progressRackLength;
        this.rackConstructionProgress = rackConstructionProgress;
        this.cablingRackMakespan = cablingRackMakespan;
    }

    public String getPowerProgressId() {
        return powerProgressId;
    }

    public void setPowerProgressId(String powerProgressId) {
        this.powerProgressId = powerProgressId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getBuildingProject() {
        return buildingProject;
    }

    public void setBuildingProject(String buildingProject) {
        this.buildingProject = buildingProject;
    }

    public String getMotorRoomName() {
        return motorRoomName;
    }

    public void setMotorRoomName(String motorRoomName) {
        this.motorRoomName = motorRoomName;
    }

    public String getMotorRoomLongitude() {
        return motorRoomLongitude;
    }

    public void setMotorRoomLongitude(String motorRoomLongitude) {
        this.motorRoomLongitude = motorRoomLongitude;
    }

    public String getMotorRoomLatitude() {
        return motorRoomLatitude;
    }

    public void setMotorRoomLatitude(String motorRoomLatitude) {
        this.motorRoomLatitude = motorRoomLatitude;
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

    public String getSiteSupervision() {
        return siteSupervision;
    }

    public void setSiteSupervision(String siteSupervision) {
        this.siteSupervision = siteSupervision;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getProgressEquipmentId() {
        return progressEquipmentId;
    }

    public void setProgressEquipmentId(String progressEquipmentId) {
        this.progressEquipmentId = progressEquipmentId;
    }

    public String getProgressPowerCableId() {
        return progressPowerCableId;
    }

    public void setProgressPowerCableId(String progressPowerCableId) {
        this.progressPowerCableId = progressPowerCableId;
    }

    public String getProgressCablingRackId() {
        return progressCablingRackId;
    }

    public void setProgressCablingRackId(String progressCablingRackId) {
        this.progressCablingRackId = progressCablingRackId;
    }

    public String getProgressEquipmentNumber() {
        return progressEquipmentNumber;
    }

    public void setProgressEquipmentNumber(String progressEquipmentNumber) {
        this.progressEquipmentNumber = progressEquipmentNumber;
    }

    public String getProgressEquipmentType() {
        return progressEquipmentType;
    }

    public void setProgressEquipmentType(String progressEquipmentType) {
        this.progressEquipmentType = progressEquipmentType;
    }

    public String getProgressEquipmentModel() {
        return progressEquipmentModel;
    }

    public void setProgressEquipmentModel(String progressEquipmentModel) {
        this.progressEquipmentModel = progressEquipmentModel;
    }

    public String getProgressEquipmentSize() {
        return progressEquipmentSize;
    }

    public void setProgressEquipmentSize(String progressEquipmentSize) {
        this.progressEquipmentSize = progressEquipmentSize;
    }

    public String getConstructionProgress() {
        return constructionProgress;
    }

    public void setConstructionProgress(String constructionProgress) {
        this.constructionProgress = constructionProgress;
    }

    public String getEquipmentArrivalTime() {
        return equipmentArrivalTime;
    }

    public void setEquipmentArrivalTime(String equipmentArrivalTime) {
        this.equipmentArrivalTime = equipmentArrivalTime;
    }

    public String getInstallationTime() {
        return installationTime;
    }

    public void setInstallationTime(String installationTime) {
        this.installationTime = installationTime;
    }

    public String getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(String chargingTime) {
        this.chargingTime = chargingTime;
    }

    public String getProgressPowerCableNumber() {
        return progressPowerCableNumber;
    }

    public void setProgressPowerCableNumber(String progressPowerCableNumber) {
        this.progressPowerCableNumber = progressPowerCableNumber;
    }

    public String getProgressPowerCableModel() {
        return progressPowerCableModel;
    }

    public void setProgressPowerCableModel(String progressPowerCableModel) {
        this.progressPowerCableModel = progressPowerCableModel;
    }

    public String getProgressPowerLength() {
        return progressPowerLength;
    }

    public void setProgressPowerLength(String progressPowerLength) {
        this.progressPowerLength = progressPowerLength;
    }

    public String getBeFrom() {
        return beFrom;
    }

    public void setBeFrom(String beFrom) {
        this.beFrom = beFrom;
    }

    public String getBeTo() {
        return beTo;
    }

    public void setBeTo(String beTo) {
        this.beTo = beTo;
    }

    public String getConstructionSchedule() {
        return constructionSchedule;
    }

    public void setConstructionSchedule(String constructionSchedule) {
        this.constructionSchedule = constructionSchedule;
    }

    public String getPowerCableMakespan() {
        return powerCableMakespan;
    }

    public void setPowerCableMakespan(String powerCableMakespan) {
        this.powerCableMakespan = powerCableMakespan;
    }

    public String getProgressCablingRackNumber() {
        return progressCablingRackNumber;
    }

    public void setProgressCablingRackNumber(String progressCablingRackNumber) {
        this.progressCablingRackNumber = progressCablingRackNumber;
    }

    public String getProgressRackLength() {
        return progressRackLength;
    }

    public void setProgressRackLength(String progressRackLength) {
        this.progressRackLength = progressRackLength;
    }

    public String getRackConstructionProgress() {
        return rackConstructionProgress;
    }

    public void setRackConstructionProgress(String rackConstructionProgress) {
        this.rackConstructionProgress = rackConstructionProgress;
    }

    public String getCablingRackMakespan() {
        return cablingRackMakespan;
    }

    public void setCablingRackMakespan(String cablingRackMakespan) {
        this.cablingRackMakespan = cablingRackMakespan;
    }

    @Override
    public String toString() {
        return "PowerSupplyProgress{" +
                "powerProgressId='" + powerProgressId + '\'' +
                ", operator='" + operator + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", buildingProject='" + buildingProject + '\'' +
                ", motorRoomName='" + motorRoomName + '\'' +
                ", motorRoomLongitude='" + motorRoomLongitude + '\'' +
                ", motorRoomLatitude='" + motorRoomLatitude + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", siteSupervision='" + siteSupervision + '\'' +
                ", projectLeader='" + projectLeader + '\'' +
                ", progressEquipmentId='" + progressEquipmentId + '\'' +
                ", progressPowerCableId='" + progressPowerCableId + '\'' +
                ", progressCablingRackId='" + progressCablingRackId + '\'' +
                ", progressEquipmentNumber='" + progressEquipmentNumber + '\'' +
                ", progressEquipmentType='" + progressEquipmentType + '\'' +
                ", progressEquipmentModel='" + progressEquipmentModel + '\'' +
                ", progressEquipmentSize='" + progressEquipmentSize + '\'' +
                ", constructionProgress='" + constructionProgress + '\'' +
                ", equipmentArrivalTime='" + equipmentArrivalTime + '\'' +
                ", installationTime='" + installationTime + '\'' +
                ", chargingTime='" + chargingTime + '\'' +
                ", progressPowerCableNumber='" + progressPowerCableNumber + '\'' +
                ", progressPowerCableModel='" + progressPowerCableModel + '\'' +
                ", progressPowerLength='" + progressPowerLength + '\'' +
                ", beFrom='" + beFrom + '\'' +
                ", beTo='" + beTo + '\'' +
                ", constructionSchedule='" + constructionSchedule + '\'' +
                ", powerCableMakespan='" + powerCableMakespan + '\'' +
                ", progressCablingRackNumber='" + progressCablingRackNumber + '\'' +
                ", progressRackLength='" + progressRackLength + '\'' +
                ", rackConstructionProgress='" + rackConstructionProgress + '\'' +
                ", cablingRackMakespan='" + cablingRackMakespan + '\'' +
                '}';
    }
}
