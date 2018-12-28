package com.panyu.panyuprojectims.entity;
public class FaArrivalStatistics {
    private String arrivalStatisticsId;
    private String operator;
    private String buildYear;
    private String buildingProject;
    private String motorRoomName;
    private String motorRoomLongitude;
    private String motorRoomLatitude;
    private String province;
    private String city;
    private String county;
    private String onSiteSupervision;
    private String projectLeader;
    private String statisticsNewEquipmentId;
    private String statisticsVeneerExpansionId;
    private String arrivalPowerCordId;
    private String arrivalPigtailId;
    //1.新增设备到货统计
    private String statisticsEquipmentNumber;
    private String statisticsEquipmentType;
    private String statisticsEquipmentModel;
    private String equipmentCabinetSize;
    private String equipmentArrivalTime;
    private String equipmentVerifyingPhotos;
    //2.单板扩容到货统计
    private String veneerExpansionNumber;
    private String veneerExpansionName;
    private String veneerDesignQuantity;
    private String veneerArrivalNumber;
    private String veneerArrivalTime;
    private String veneerVerifyingPhotos;
    //3.电缆类型到货统计
    private String arrivalPowerCordNumber;
    private String arrivalCableType;
    private String arrivalSpecificationModel;
    private String arrivalDesignLength;
    private String arrivalLength;
    private String arrivalTime;
    private String powerCordVerifyingPhotos;
    //4.尾纤、跳纤到货统计
    private String arrivalPigtailNumber;
    private String pigtailCableType;
    private String pigtailSpecificationModel;
    private String pigtailDesignBars;
    private String designSingleLength;
    private String pigtailArrivalsNumber;
    private String arrivalSingleLength;
    private String pigtailArrivalTime;
    private String pigtailVerifyingPhotos;
    public FaArrivalStatistics() {
        super();
    }

    public FaArrivalStatistics(String arrivalStatisticsId, String operator, String buildYear, String buildingProject, String motorRoomName, String motorRoomLongitude, String motorRoomLatitude, String province, String city, String county, String onSiteSupervision, String projectLeader, String statisticsNewEquipmentId, String statisticsVeneerExpansionId, String arrivalPowerCordId, String arrivalPigtailId, String statisticsEquipmentNumber, String statisticsEquipmentType, String statisticsEquipmentModel, String equipmentCabinetSize, String equipmentArrivalTime, String equipmentVerifyingPhotos, String veneerExpansionNumber, String veneerExpansionName, String veneerDesignQuantity, String veneerArrivalNumber, String veneerArrivalTime, String veneerVerifyingPhotos, String arrivalPowerCordNumber, String arrivalCableType, String arrivalSpecificationModel, String arrivalDesignLength, String arrivalLength, String arrivalTime, String powerCordVerifyingPhotos, String arrivalPigtailNumber, String pigtailCableType, String pigtailSpecificationModel, String pigtailDesignBars, String designSingleLength, String pigtailArrivalsNumber, String arrivalSingleLength, String pigtailArrivalTime, String pigtailVerifyingPhotos) {
        this.arrivalStatisticsId = arrivalStatisticsId;
        this.operator = operator;
        this.buildYear = buildYear;
        this.buildingProject = buildingProject;
        this.motorRoomName = motorRoomName;
        this.motorRoomLongitude = motorRoomLongitude;
        this.motorRoomLatitude = motorRoomLatitude;
        this.province = province;
        this.city = city;
        this.county = county;
        this.onSiteSupervision = onSiteSupervision;
        this.projectLeader = projectLeader;
        this.statisticsNewEquipmentId = statisticsNewEquipmentId;
        this.statisticsVeneerExpansionId = statisticsVeneerExpansionId;
        this.arrivalPowerCordId = arrivalPowerCordId;
        this.arrivalPigtailId = arrivalPigtailId;
        this.statisticsEquipmentNumber = statisticsEquipmentNumber;
        this.statisticsEquipmentType = statisticsEquipmentType;
        this.statisticsEquipmentModel = statisticsEquipmentModel;
        this.equipmentCabinetSize = equipmentCabinetSize;
        this.equipmentArrivalTime = equipmentArrivalTime;
        this.equipmentVerifyingPhotos = equipmentVerifyingPhotos;
        this.veneerExpansionNumber = veneerExpansionNumber;
        this.veneerExpansionName = veneerExpansionName;
        this.veneerDesignQuantity = veneerDesignQuantity;
        this.veneerArrivalNumber = veneerArrivalNumber;
        this.veneerArrivalTime = veneerArrivalTime;
        this.veneerVerifyingPhotos = veneerVerifyingPhotos;
        this.arrivalPowerCordNumber = arrivalPowerCordNumber;
        this.arrivalCableType = arrivalCableType;
        this.arrivalSpecificationModel = arrivalSpecificationModel;
        this.arrivalDesignLength = arrivalDesignLength;
        this.arrivalLength = arrivalLength;
        this.arrivalTime = arrivalTime;
        this.powerCordVerifyingPhotos = powerCordVerifyingPhotos;
        this.arrivalPigtailNumber = arrivalPigtailNumber;
        this.pigtailCableType = pigtailCableType;
        this.pigtailSpecificationModel = pigtailSpecificationModel;
        this.pigtailDesignBars = pigtailDesignBars;
        this.designSingleLength = designSingleLength;
        this.pigtailArrivalsNumber = pigtailArrivalsNumber;
        this.arrivalSingleLength = arrivalSingleLength;
        this.pigtailArrivalTime = pigtailArrivalTime;
        this.pigtailVerifyingPhotos = pigtailVerifyingPhotos;
    }

    public String getArrivalStatisticsId() {
        return arrivalStatisticsId;
    }

    public void setArrivalStatisticsId(String arrivalStatisticsId) {
        this.arrivalStatisticsId = arrivalStatisticsId;
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

    public String getOnSiteSupervision() {
        return onSiteSupervision;
    }

    public void setOnSiteSupervision(String onSiteSupervision) {
        this.onSiteSupervision = onSiteSupervision;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getStatisticsNewEquipmentId() {
        return statisticsNewEquipmentId;
    }

    public void setStatisticsNewEquipmentId(String statisticsNewEquipmentId) {
        this.statisticsNewEquipmentId = statisticsNewEquipmentId;
    }

    public String getStatisticsVeneerExpansionId() {
        return statisticsVeneerExpansionId;
    }

    public void setStatisticsVeneerExpansionId(String statisticsVeneerExpansionId) {
        this.statisticsVeneerExpansionId = statisticsVeneerExpansionId;
    }

    public String getArrivalPowerCordId() {
        return arrivalPowerCordId;
    }

    public void setArrivalPowerCordId(String arrivalPowerCordId) {
        this.arrivalPowerCordId = arrivalPowerCordId;
    }

    public String getArrivalPigtailId() {
        return arrivalPigtailId;
    }

    public void setArrivalPigtailId(String arrivalPigtailId) {
        this.arrivalPigtailId = arrivalPigtailId;
    }

    public String getStatisticsEquipmentNumber() {
        return statisticsEquipmentNumber;
    }

    public void setStatisticsEquipmentNumber(String statisticsEquipmentNumber) {
        this.statisticsEquipmentNumber = statisticsEquipmentNumber;
    }

    public String getStatisticsEquipmentType() {
        return statisticsEquipmentType;
    }

    public void setStatisticsEquipmentType(String statisticsEquipmentType) {
        this.statisticsEquipmentType = statisticsEquipmentType;
    }

    public String getStatisticsEquipmentModel() {
        return statisticsEquipmentModel;
    }

    public void setStatisticsEquipmentModel(String statisticsEquipmentModel) {
        this.statisticsEquipmentModel = statisticsEquipmentModel;
    }

    public String getEquipmentCabinetSize() {
        return equipmentCabinetSize;
    }

    public void setEquipmentCabinetSize(String equipmentCabinetSize) {
        this.equipmentCabinetSize = equipmentCabinetSize;
    }

    public String getEquipmentArrivalTime() {
        return equipmentArrivalTime;
    }

    public void setEquipmentArrivalTime(String equipmentArrivalTime) {
        this.equipmentArrivalTime = equipmentArrivalTime;
    }

    public String getEquipmentVerifyingPhotos() {
        return equipmentVerifyingPhotos;
    }

    public void setEquipmentVerifyingPhotos(String equipmentVerifyingPhotos) {
        this.equipmentVerifyingPhotos = equipmentVerifyingPhotos;
    }

    public String getVeneerExpansionNumber() {
        return veneerExpansionNumber;
    }

    public void setVeneerExpansionNumber(String veneerExpansionNumber) {
        this.veneerExpansionNumber = veneerExpansionNumber;
    }

    public String getVeneerExpansionName() {
        return veneerExpansionName;
    }

    public void setVeneerExpansionName(String veneerExpansionName) {
        this.veneerExpansionName = veneerExpansionName;
    }

    public String getVeneerDesignQuantity() {
        return veneerDesignQuantity;
    }

    public void setVeneerDesignQuantity(String veneerDesignQuantity) {
        this.veneerDesignQuantity = veneerDesignQuantity;
    }

    public String getVeneerArrivalNumber() {
        return veneerArrivalNumber;
    }

    public void setVeneerArrivalNumber(String veneerArrivalNumber) {
        this.veneerArrivalNumber = veneerArrivalNumber;
    }

    public String getVeneerArrivalTime() {
        return veneerArrivalTime;
    }

    public void setVeneerArrivalTime(String veneerArrivalTime) {
        this.veneerArrivalTime = veneerArrivalTime;
    }

    public String getVeneerVerifyingPhotos() {
        return veneerVerifyingPhotos;
    }

    public void setVeneerVerifyingPhotos(String veneerVerifyingPhotos) {
        this.veneerVerifyingPhotos = veneerVerifyingPhotos;
    }

    public String getArrivalPowerCordNumber() {
        return arrivalPowerCordNumber;
    }

    public void setArrivalPowerCordNumber(String arrivalPowerCordNumber) {
        this.arrivalPowerCordNumber = arrivalPowerCordNumber;
    }

    public String getArrivalCableType() {
        return arrivalCableType;
    }

    public void setArrivalCableType(String arrivalCableType) {
        this.arrivalCableType = arrivalCableType;
    }

    public String getArrivalSpecificationModel() {
        return arrivalSpecificationModel;
    }

    public void setArrivalSpecificationModel(String arrivalSpecificationModel) {
        this.arrivalSpecificationModel = arrivalSpecificationModel;
    }

    public String getArrivalDesignLength() {
        return arrivalDesignLength;
    }

    public void setArrivalDesignLength(String arrivalDesignLength) {
        this.arrivalDesignLength = arrivalDesignLength;
    }

    public String getArrivalLength() {
        return arrivalLength;
    }

    public void setArrivalLength(String arrivalLength) {
        this.arrivalLength = arrivalLength;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getPowerCordVerifyingPhotos() {
        return powerCordVerifyingPhotos;
    }

    public void setPowerCordVerifyingPhotos(String powerCordVerifyingPhotos) {
        this.powerCordVerifyingPhotos = powerCordVerifyingPhotos;
    }

    public String getArrivalPigtailNumber() {
        return arrivalPigtailNumber;
    }

    public void setArrivalPigtailNumber(String arrivalPigtailNumber) {
        this.arrivalPigtailNumber = arrivalPigtailNumber;
    }

    public String getPigtailCableType() {
        return pigtailCableType;
    }

    public void setPigtailCableType(String pigtailCableType) {
        this.pigtailCableType = pigtailCableType;
    }

    public String getPigtailSpecificationModel() {
        return pigtailSpecificationModel;
    }

    public void setPigtailSpecificationModel(String pigtailSpecificationModel) {
        this.pigtailSpecificationModel = pigtailSpecificationModel;
    }

    public String getPigtailDesignBars() {
        return pigtailDesignBars;
    }

    public void setPigtailDesignBars(String pigtailDesignBars) {
        this.pigtailDesignBars = pigtailDesignBars;
    }

    public String getDesignSingleLength() {
        return designSingleLength;
    }

    public void setDesignSingleLength(String designSingleLength) {
        this.designSingleLength = designSingleLength;
    }

    public String getPigtailArrivalsNumber() {
        return pigtailArrivalsNumber;
    }

    public void setPigtailArrivalsNumber(String pigtailArrivalsNumber) {
        this.pigtailArrivalsNumber = pigtailArrivalsNumber;
    }

    public String getArrivalSingleLength() {
        return arrivalSingleLength;
    }

    public void setArrivalSingleLength(String arrivalSingleLength) {
        this.arrivalSingleLength = arrivalSingleLength;
    }

    public String getPigtailArrivalTime() {
        return pigtailArrivalTime;
    }

    public void setPigtailArrivalTime(String pigtailArrivalTime) {
        this.pigtailArrivalTime = pigtailArrivalTime;
    }

    public String getPigtailVerifyingPhotos() {
        return pigtailVerifyingPhotos;
    }

    public void setPigtailVerifyingPhotos(String pigtailVerifyingPhotos) {
        this.pigtailVerifyingPhotos = pigtailVerifyingPhotos;
    }

    @Override
    public String toString() {
        return "FaArrivalStatistics{" +
                "arrivalStatisticsId='" + arrivalStatisticsId + '\'' +
                ", operator='" + operator + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", buildingProject='" + buildingProject + '\'' +
                ", motorRoomName='" + motorRoomName + '\'' +
                ", motorRoomLongitude='" + motorRoomLongitude + '\'' +
                ", motorRoomLatitude='" + motorRoomLatitude + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", onSiteSupervision='" + onSiteSupervision + '\'' +
                ", projectLeader='" + projectLeader + '\'' +
                ", statisticsNewEquipmentId='" + statisticsNewEquipmentId + '\'' +
                ", statisticsVeneerExpansionId='" + statisticsVeneerExpansionId + '\'' +
                ", arrivalPowerCordId='" + arrivalPowerCordId + '\'' +
                ", arrivalPigtailId='" + arrivalPigtailId + '\'' +
                ", statisticsEquipmentNumber='" + statisticsEquipmentNumber + '\'' +
                ", statisticsEquipmentType='" + statisticsEquipmentType + '\'' +
                ", statisticsEquipmentModel='" + statisticsEquipmentModel + '\'' +
                ", equipmentCabinetSize='" + equipmentCabinetSize + '\'' +
                ", equipmentArrivalTime='" + equipmentArrivalTime + '\'' +
                ", equipmentVerifyingPhotos='" + equipmentVerifyingPhotos + '\'' +
                ", veneerExpansionNumber='" + veneerExpansionNumber + '\'' +
                ", veneerExpansionName='" + veneerExpansionName + '\'' +
                ", veneerDesignQuantity='" + veneerDesignQuantity + '\'' +
                ", veneerArrivalNumber='" + veneerArrivalNumber + '\'' +
                ", veneerArrivalTime='" + veneerArrivalTime + '\'' +
                ", veneerVerifyingPhotos='" + veneerVerifyingPhotos + '\'' +
                ", arrivalPowerCordNumber='" + arrivalPowerCordNumber + '\'' +
                ", arrivalCableType='" + arrivalCableType + '\'' +
                ", arrivalSpecificationModel='" + arrivalSpecificationModel + '\'' +
                ", arrivalDesignLength='" + arrivalDesignLength + '\'' +
                ", arrivalLength='" + arrivalLength + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", powerCordVerifyingPhotos='" + powerCordVerifyingPhotos + '\'' +
                ", arrivalPigtailNumber='" + arrivalPigtailNumber + '\'' +
                ", pigtailCableType='" + pigtailCableType + '\'' +
                ", pigtailSpecificationModel='" + pigtailSpecificationModel + '\'' +
                ", pigtailDesignBars='" + pigtailDesignBars + '\'' +
                ", designSingleLength='" + designSingleLength + '\'' +
                ", pigtailArrivalsNumber='" + pigtailArrivalsNumber + '\'' +
                ", arrivalSingleLength='" + arrivalSingleLength + '\'' +
                ", pigtailArrivalTime='" + pigtailArrivalTime + '\'' +
                ", pigtailVerifyingPhotos='" + pigtailVerifyingPhotos + '\'' +
                '}';
    }
}
