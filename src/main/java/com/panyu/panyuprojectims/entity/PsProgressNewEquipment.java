package com.panyu.panyuprojectims.entity;
public class PsProgressNewEquipment {
    private String progressEquipmentId;
    private String progressEquipmentNumber;
    private String progressEquipmentType;
    private String progressEquipmentModel;
    private String progressEquipmentSize;
    private String constructionProgress;
    private String equipmentArrivalTime;
    private String installationTime;
    private String chargingTime;


    public PsProgressNewEquipment() {
        super();
    }
    public PsProgressNewEquipment(String progressEquipmentId,String progressEquipmentNumber,String progressEquipmentType,String progressEquipmentModel,String progressEquipmentSize,String constructionProgress,String equipmentArrivalTime,String installationTime,String chargingTime) {
        super();
        this.progressEquipmentId = progressEquipmentId;
        this.progressEquipmentNumber = progressEquipmentNumber;
        this.progressEquipmentType = progressEquipmentType;
        this.progressEquipmentModel = progressEquipmentModel;
        this.progressEquipmentSize = progressEquipmentSize;
        this.constructionProgress = constructionProgress;
        this.equipmentArrivalTime = equipmentArrivalTime;
        this.installationTime = installationTime;
        this.chargingTime = chargingTime;
    }
    public String getProgressEquipmentId() {
        return this.progressEquipmentId;
    }

    public void setProgressEquipmentId(String progressEquipmentId) {
        this.progressEquipmentId = progressEquipmentId;
    }

    public String getProgressEquipmentNumber() {
        return this.progressEquipmentNumber;
    }

    public void setProgressEquipmentNumber(String progressEquipmentNumber) {
        this.progressEquipmentNumber = progressEquipmentNumber;
    }

    public String getProgressEquipmentType() {
        return this.progressEquipmentType;
    }

    public void setProgressEquipmentType(String progressEquipmentType) {
        this.progressEquipmentType = progressEquipmentType;
    }

    public String getProgressEquipmentModel() {
        return this.progressEquipmentModel;
    }

    public void setProgressEquipmentModel(String progressEquipmentModel) {
        this.progressEquipmentModel = progressEquipmentModel;
    }

    public String getProgressEquipmentSize() {
        return this.progressEquipmentSize;
    }

    public void setProgressEquipmentSize(String progressEquipmentSize) {
        this.progressEquipmentSize = progressEquipmentSize;
    }

    public String getConstructionProgress() {
        return this.constructionProgress;
    }

    public void setConstructionProgress(String constructionProgress) {
        this.constructionProgress = constructionProgress;
    }

    public String getEquipmentArrivalTime() {
        return this.equipmentArrivalTime;
    }

    public void setEquipmentArrivalTime(String equipmentArrivalTime) {
        this.equipmentArrivalTime = equipmentArrivalTime;
    }

    public String getInstallationTime() {
        return this.installationTime;
    }

    public void setInstallationTime(String installationTime) {
        this.installationTime = installationTime;
    }

    public String getChargingTime() {
        return this.chargingTime;
    }

    public void setChargingTime(String chargingTime) {
        this.chargingTime = chargingTime;
    }

    @Override
    public String toString() {
        return "PsProgressNewEquipment{" +
                "progressEquipmentId='" + progressEquipmentId + '\'' +
                ", progressEquipmentNumber='" + progressEquipmentNumber + '\'' +
                ", progressEquipmentType='" + progressEquipmentType + '\'' +
                ", progressEquipmentModel='" + progressEquipmentModel + '\'' +
                ", progressEquipmentSize='" + progressEquipmentSize + '\'' +
                ", constructionProgress='" + constructionProgress + '\'' +
                ", equipmentArrivalTime='" + equipmentArrivalTime + '\'' +
                ", installationTime='" + installationTime + '\'' +
                ", chargingTime='" + chargingTime + '\'' +
                '}';
    }
}
