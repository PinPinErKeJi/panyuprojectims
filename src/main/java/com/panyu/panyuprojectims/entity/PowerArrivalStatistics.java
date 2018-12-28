package com.panyu.panyuprojectims.entity;
public class PowerArrivalStatistics {
    private String powerStatisticsId;//到货统计表ID
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

    private String powerStatisticsEquipmentId;//新增设备ID
    private String powerArrivalCableId;//新增电力电缆ID
    private String powerArrivalRackId;//新增走线架ID

    private String powerStatisticsNumber;//编号
    private String powerStatisticsType;//类型
    private String powerStatisticsModel;//设备型号
    private String powerStatisticsSize;//机柜尺寸
    private String powerStatisticsTime;//到货时间
    private String powerEquipmentPhoto;//验证照片

    private String powerArrivalCableNumber;//编号
    private String powerArrivalCableModel;//型号
    private String powerArrivalCableLength;//长度
    private String powerArrivalCableTime;//到货时间
    private String powerArrivalCablePhoto;//验证照片

    private String powerArrivalRackNumber;//编号
    private String powerArrivalRackModel;//型号
    private String powerArrivalRackLength;//长度
    private String powerArrivalRackTime;//到货时间
    private String powerArrivalRackPhoto;//验证照片

    public PowerArrivalStatistics() {
        super();
    }

    public PowerArrivalStatistics(String powerStatisticsId, String operator, String buildYear, String buildingProject, String motorRoomName, String motorRoomLongitude, String motorRoomLatitude, String province, String city, String county, String siteSupervision, String projectLeader, String powerStatisticsEquipmentId, String powerArrivalCableId, String powerArrivalRackId, String powerStatisticsNumber, String powerStatisticsType, String powerStatisticsModel, String powerStatisticsSize, String powerStatisticsTime, String powerEquipmentPhoto, String powerArrivalCableNumber, String powerArrivalCableModel, String powerArrivalCableLength, String powerArrivalCableTime, String powerArrivalCablePhoto, String powerArrivalRackNumber, String powerArrivalRackModel, String powerArrivalRackLength, String powerArrivalRackTime, String powerArrivalRackPhoto) {
        this.powerStatisticsId = powerStatisticsId;
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
        this.powerStatisticsEquipmentId = powerStatisticsEquipmentId;
        this.powerArrivalCableId = powerArrivalCableId;
        this.powerArrivalRackId = powerArrivalRackId;
        this.powerStatisticsNumber = powerStatisticsNumber;
        this.powerStatisticsType = powerStatisticsType;
        this.powerStatisticsModel = powerStatisticsModel;
        this.powerStatisticsSize = powerStatisticsSize;
        this.powerStatisticsTime = powerStatisticsTime;
        this.powerEquipmentPhoto = powerEquipmentPhoto;
        this.powerArrivalCableNumber = powerArrivalCableNumber;
        this.powerArrivalCableModel = powerArrivalCableModel;
        this.powerArrivalCableLength = powerArrivalCableLength;
        this.powerArrivalCableTime = powerArrivalCableTime;
        this.powerArrivalCablePhoto = powerArrivalCablePhoto;
        this.powerArrivalRackNumber = powerArrivalRackNumber;
        this.powerArrivalRackModel = powerArrivalRackModel;
        this.powerArrivalRackLength = powerArrivalRackLength;
        this.powerArrivalRackTime = powerArrivalRackTime;
        this.powerArrivalRackPhoto = powerArrivalRackPhoto;
    }

    public String getPowerStatisticsId() {
        return powerStatisticsId;
    }

    public void setPowerStatisticsId(String powerStatisticsId) {
        this.powerStatisticsId = powerStatisticsId;
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

    public String getPowerStatisticsEquipmentId() {
        return powerStatisticsEquipmentId;
    }

    public void setPowerStatisticsEquipmentId(String powerStatisticsEquipmentId) {
        this.powerStatisticsEquipmentId = powerStatisticsEquipmentId;
    }

    public String getPowerArrivalCableId() {
        return powerArrivalCableId;
    }

    public void setPowerArrivalCableId(String powerArrivalCableId) {
        this.powerArrivalCableId = powerArrivalCableId;
    }

    public String getPowerArrivalRackId() {
        return powerArrivalRackId;
    }

    public void setPowerArrivalRackId(String powerArrivalRackId) {
        this.powerArrivalRackId = powerArrivalRackId;
    }

    public String getPowerStatisticsNumber() {
        return powerStatisticsNumber;
    }

    public void setPowerStatisticsNumber(String powerStatisticsNumber) {
        this.powerStatisticsNumber = powerStatisticsNumber;
    }

    public String getPowerStatisticsType() {
        return powerStatisticsType;
    }

    public void setPowerStatisticsType(String powerStatisticsType) {
        this.powerStatisticsType = powerStatisticsType;
    }

    public String getPowerStatisticsModel() {
        return powerStatisticsModel;
    }

    public void setPowerStatisticsModel(String powerStatisticsModel) {
        this.powerStatisticsModel = powerStatisticsModel;
    }

    public String getPowerStatisticsSize() {
        return powerStatisticsSize;
    }

    public void setPowerStatisticsSize(String powerStatisticsSize) {
        this.powerStatisticsSize = powerStatisticsSize;
    }

    public String getPowerStatisticsTime() {
        return powerStatisticsTime;
    }

    public void setPowerStatisticsTime(String powerStatisticsTime) {
        this.powerStatisticsTime = powerStatisticsTime;
    }

    public String getPowerEquipmentPhoto() {
        return powerEquipmentPhoto;
    }

    public void setPowerEquipmentPhoto(String powerEquipmentPhoto) {
        this.powerEquipmentPhoto = powerEquipmentPhoto;
    }

    public String getPowerArrivalCableNumber() {
        return powerArrivalCableNumber;
    }

    public void setPowerArrivalCableNumber(String powerArrivalCableNumber) {
        this.powerArrivalCableNumber = powerArrivalCableNumber;
    }

    public String getPowerArrivalCableModel() {
        return powerArrivalCableModel;
    }

    public void setPowerArrivalCableModel(String powerArrivalCableModel) {
        this.powerArrivalCableModel = powerArrivalCableModel;
    }

    public String getPowerArrivalCableLength() {
        return powerArrivalCableLength;
    }

    public void setPowerArrivalCableLength(String powerArrivalCableLength) {
        this.powerArrivalCableLength = powerArrivalCableLength;
    }

    public String getPowerArrivalCableTime() {
        return powerArrivalCableTime;
    }

    public void setPowerArrivalCableTime(String powerArrivalCableTime) {
        this.powerArrivalCableTime = powerArrivalCableTime;
    }

    public String getPowerArrivalCablePhoto() {
        return powerArrivalCablePhoto;
    }

    public void setPowerArrivalCablePhoto(String powerArrivalCablePhoto) {
        this.powerArrivalCablePhoto = powerArrivalCablePhoto;
    }

    public String getPowerArrivalRackNumber() {
        return powerArrivalRackNumber;
    }

    public void setPowerArrivalRackNumber(String powerArrivalRackNumber) {
        this.powerArrivalRackNumber = powerArrivalRackNumber;
    }

    public String getPowerArrivalRackModel() {
        return powerArrivalRackModel;
    }

    public void setPowerArrivalRackModel(String powerArrivalRackModel) {
        this.powerArrivalRackModel = powerArrivalRackModel;
    }

    public String getPowerArrivalRackLength() {
        return powerArrivalRackLength;
    }

    public void setPowerArrivalRackLength(String powerArrivalRackLength) {
        this.powerArrivalRackLength = powerArrivalRackLength;
    }

    public String getPowerArrivalRackTime() {
        return powerArrivalRackTime;
    }

    public void setPowerArrivalRackTime(String powerArrivalRackTime) {
        this.powerArrivalRackTime = powerArrivalRackTime;
    }

    public String getPowerArrivalRackPhoto() {
        return powerArrivalRackPhoto;
    }

    public void setPowerArrivalRackPhoto(String powerArrivalRackPhoto) {
        this.powerArrivalRackPhoto = powerArrivalRackPhoto;
    }

    @Override
    public String toString() {
        return "PowerArrivalStatistics{" +
                "powerStatisticsId='" + powerStatisticsId + '\'' +
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
                ", powerStatisticsEquipmentId='" + powerStatisticsEquipmentId + '\'' +
                ", powerArrivalCableId='" + powerArrivalCableId + '\'' +
                ", powerArrivalRackId='" + powerArrivalRackId + '\'' +
                ", powerStatisticsNumber='" + powerStatisticsNumber + '\'' +
                ", powerStatisticsType='" + powerStatisticsType + '\'' +
                ", powerStatisticsModel='" + powerStatisticsModel + '\'' +
                ", powerStatisticsSize='" + powerStatisticsSize + '\'' +
                ", powerStatisticsTime='" + powerStatisticsTime + '\'' +
                ", powerEquipmentPhoto='" + powerEquipmentPhoto + '\'' +
                ", powerArrivalCableNumber='" + powerArrivalCableNumber + '\'' +
                ", powerArrivalCableModel='" + powerArrivalCableModel + '\'' +
                ", powerArrivalCableLength='" + powerArrivalCableLength + '\'' +
                ", powerArrivalCableTime='" + powerArrivalCableTime + '\'' +
                ", powerArrivalCablePhoto='" + powerArrivalCablePhoto + '\'' +
                ", powerArrivalRackNumber='" + powerArrivalRackNumber + '\'' +
                ", powerArrivalRackModel='" + powerArrivalRackModel + '\'' +
                ", powerArrivalRackLength='" + powerArrivalRackLength + '\'' +
                ", powerArrivalRackTime='" + powerArrivalRackTime + '\'' +
                ", powerArrivalRackPhoto='" + powerArrivalRackPhoto + '\'' +
                '}';
    }
}
