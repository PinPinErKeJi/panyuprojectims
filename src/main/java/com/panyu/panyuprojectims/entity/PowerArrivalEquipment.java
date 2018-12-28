package com.panyu.panyuprojectims.entity;
public class PowerArrivalEquipment {
    private String powerStatisticsEquipmentId;
    private String powerStatisticsNumber;
    private String powerStatisticsType;
    private String powerStatisticsModel;
    private String powerStatisticsSize;
    private String powerStatisticsTime;
    private String powerEquipmentPhoto;

    public PowerArrivalEquipment() {
        super();
    }
    public PowerArrivalEquipment(String powerStatisticsEquipmentId,String powerStatisticsNumber,String powerStatisticsType,String powerStatisticsModel,String powerStatisticsSize,String powerStatisticsTime,String powerEquipmentPhoto) {
        super();
        this.powerStatisticsEquipmentId = powerStatisticsEquipmentId;
        this.powerStatisticsNumber = powerStatisticsNumber;
        this.powerStatisticsType = powerStatisticsType;
        this.powerStatisticsModel = powerStatisticsModel;
        this.powerStatisticsSize = powerStatisticsSize;
        this.powerStatisticsTime = powerStatisticsTime;
        this.powerEquipmentPhoto = powerEquipmentPhoto;
    }
    public String getPowerStatisticsEquipmentId() {
        return this.powerStatisticsEquipmentId;
    }

    public void setPowerStatisticsEquipmentId(String powerStatisticsEquipmentId) {
        this.powerStatisticsEquipmentId = powerStatisticsEquipmentId;
    }

    public String getPowerStatisticsNumber() {
        return this.powerStatisticsNumber;
    }

    public void setPowerStatisticsNumber(String powerStatisticsNumber) {
        this.powerStatisticsNumber = powerStatisticsNumber;
    }

    public String getPowerStatisticsType() {
        return this.powerStatisticsType;
    }

    public void setPowerStatisticsType(String powerStatisticsType) {
        this.powerStatisticsType = powerStatisticsType;
    }

    public String getPowerStatisticsModel() {
        return this.powerStatisticsModel;
    }

    public void setPowerStatisticsModel(String powerStatisticsModel) {
        this.powerStatisticsModel = powerStatisticsModel;
    }

    public String getPowerStatisticsSize() {
        return this.powerStatisticsSize;
    }

    public void setPowerStatisticsSize(String powerStatisticsSize) {
        this.powerStatisticsSize = powerStatisticsSize;
    }

    public String getPowerStatisticsTime() {
        return this.powerStatisticsTime;
    }

    public void setPowerStatisticsTime(String powerStatisticsTime) {
        this.powerStatisticsTime = powerStatisticsTime;
    }

    public String getPowerEquipmentPhoto() {
        return this.powerEquipmentPhoto;
    }

    public void setPowerEquipmentPhoto(String powerEquipmentPhoto) {
        this.powerEquipmentPhoto = powerEquipmentPhoto;
    }

    @Override
    public String toString() {
        return "PowerArrivalEquipment{" +
                "powerStatisticsEquipmentId='" + powerStatisticsEquipmentId + '\'' +
                ", powerStatisticsNumber='" + powerStatisticsNumber + '\'' +
                ", powerStatisticsType='" + powerStatisticsType + '\'' +
                ", powerStatisticsModel='" + powerStatisticsModel + '\'' +
                ", powerStatisticsSize='" + powerStatisticsSize + '\'' +
                ", powerStatisticsTime='" + powerStatisticsTime + '\'' +
                ", powerEquipmentPhoto='" + powerEquipmentPhoto + '\'' +
                '}';
    }
}
