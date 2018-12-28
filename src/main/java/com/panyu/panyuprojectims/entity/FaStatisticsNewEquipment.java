package com.panyu.panyuprojectims.entity;
public class FaStatisticsNewEquipment {
    private String statisticsNewEquipmentId;
    private String statisticsEquipmentNumber;
    private String statisticsEquipmentType;
    private String statisticsEquipmentModel;
    private String equipmentCabinetSize;
    private String equipmentArrivalTime;
    private String equipmentVerifyingPhotos;
    public FaStatisticsNewEquipment() {
        super();
    }
    public FaStatisticsNewEquipment(String statisticsNewEquipmentId,String statisticsEquipmentNumber,String statisticsEquipmentType,String statisticsEquipmentModel,String equipmentCabinetSize,String equipmentArrivalTime,String equipmentVerifyingPhotos) {
        super();
        this.statisticsNewEquipmentId = statisticsNewEquipmentId;
        this.statisticsEquipmentNumber = statisticsEquipmentNumber;
        this.statisticsEquipmentType = statisticsEquipmentType;
        this.statisticsEquipmentModel = statisticsEquipmentModel;
        this.equipmentCabinetSize = equipmentCabinetSize;
        this.equipmentArrivalTime = equipmentArrivalTime;
        this.equipmentVerifyingPhotos = equipmentVerifyingPhotos;
    }
    public String getStatisticsNewEquipmentId() {
        return this.statisticsNewEquipmentId;
    }

    public void setStatisticsNewEquipmentId(String statisticsNewEquipmentId) {
        this.statisticsNewEquipmentId = statisticsNewEquipmentId;
    }

    public String getStatisticsEquipmentNumber() {
        return this.statisticsEquipmentNumber;
    }

    public void setStatisticsEquipmentNumber(String statisticsEquipmentNumber) {
        this.statisticsEquipmentNumber = statisticsEquipmentNumber;
    }

    public String getStatisticsEquipmentType() {
        return this.statisticsEquipmentType;
    }

    public void setStatisticsEquipmentType(String statisticsEquipmentType) {
        this.statisticsEquipmentType = statisticsEquipmentType;
    }

    public String getStatisticsEquipmentModel() {
        return this.statisticsEquipmentModel;
    }

    public void setStatisticsEquipmentModel(String statisticsEquipmentModel) {
        this.statisticsEquipmentModel = statisticsEquipmentModel;
    }

    public String getEquipmentCabinetSize() {
        return this.equipmentCabinetSize;
    }

    public void setEquipmentCabinetSize(String equipmentCabinetSize) {
        this.equipmentCabinetSize = equipmentCabinetSize;
    }

    public String getEquipmentArrivalTime() {
        return this.equipmentArrivalTime;
    }

    public void setEquipmentArrivalTime(String equipmentArrivalTime) {
        this.equipmentArrivalTime = equipmentArrivalTime;
    }

    public String getEquipmentVerifyingPhotos() {
        return this.equipmentVerifyingPhotos;
    }

    public void setEquipmentVerifyingPhotos(String equipmentVerifyingPhotos) {
        this.equipmentVerifyingPhotos = equipmentVerifyingPhotos;
    }

    @Override
    public String toString() {
        return "FaStatisticsNewEquipment{" +
                "statisticsNewEquipmentId='" + statisticsNewEquipmentId + '\'' +
                ", statisticsEquipmentNumber='" + statisticsEquipmentNumber + '\'' +
                ", statisticsEquipmentType='" + statisticsEquipmentType + '\'' +
                ", statisticsEquipmentModel='" + statisticsEquipmentModel + '\'' +
                ", equipmentCabinetSize='" + equipmentCabinetSize + '\'' +
                ", equipmentArrivalTime='" + equipmentArrivalTime + '\'' +
                ", equipmentVerifyingPhotos='" + equipmentVerifyingPhotos + '\'' +
                '}';
    }
}
