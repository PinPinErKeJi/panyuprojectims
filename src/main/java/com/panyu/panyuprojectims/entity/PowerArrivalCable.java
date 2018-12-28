package com.panyu.panyuprojectims.entity;
public class PowerArrivalCable {
    private String powerArrivalCableId;
    private String powerArrivalCableNumber;
    private String powerArrivalCableModel;
    private String powerArrivalCableLength;
    private String powerArrivalCableTime;
    private String powerArrivalCablePhoto;

    public PowerArrivalCable() {
        super();
    }
    public PowerArrivalCable(String powerArrivalCableId,String powerArrivalCableNumber,String powerArrivalCableModel,String powerArrivalCableLength,String powerArrivalCableTime,String powerArrivalCablePhoto) {
        super();
        this.powerArrivalCableId = powerArrivalCableId;
        this.powerArrivalCableNumber = powerArrivalCableNumber;
        this.powerArrivalCableModel = powerArrivalCableModel;
        this.powerArrivalCableLength = powerArrivalCableLength;
        this.powerArrivalCableTime = powerArrivalCableTime;
        this.powerArrivalCablePhoto = powerArrivalCablePhoto;
    }
    public String getPowerArrivalCableId() {
        return this.powerArrivalCableId;
    }

    public void setPowerArrivalCableId(String powerArrivalCableId) {
        this.powerArrivalCableId = powerArrivalCableId;
    }

    public String getPowerArrivalCableNumber() {
        return this.powerArrivalCableNumber;
    }

    public void setPowerArrivalCableNumber(String powerArrivalCableNumber) {
        this.powerArrivalCableNumber = powerArrivalCableNumber;
    }

    public String getPowerArrivalCableModel() {
        return this.powerArrivalCableModel;
    }

    public void setPowerArrivalCableModel(String powerArrivalCableModel) {
        this.powerArrivalCableModel = powerArrivalCableModel;
    }

    public String getPowerArrivalCableLength() {
        return this.powerArrivalCableLength;
    }

    public void setPowerArrivalCableLength(String powerArrivalCableLength) {
        this.powerArrivalCableLength = powerArrivalCableLength;
    }

    public String getPowerArrivalCableTime() {
        return this.powerArrivalCableTime;
    }

    public void setPowerArrivalCableTime(String powerArrivalCableTime) {
        this.powerArrivalCableTime = powerArrivalCableTime;
    }

    public String getPowerArrivalCablePhoto() {
        return this.powerArrivalCablePhoto;
    }

    public void setPowerArrivalCablePhoto(String powerArrivalCablePhoto) {
        this.powerArrivalCablePhoto = powerArrivalCablePhoto;
    }

    @Override
    public String toString() {
        return "PowerArrivalCable{" +
                "powerArrivalCableId='" + powerArrivalCableId + '\'' +
                ", powerArrivalCableNumber='" + powerArrivalCableNumber + '\'' +
                ", powerArrivalCableModel='" + powerArrivalCableModel + '\'' +
                ", powerArrivalCableLength='" + powerArrivalCableLength + '\'' +
                ", powerArrivalCableTime='" + powerArrivalCableTime + '\'' +
                ", powerArrivalCablePhoto='" + powerArrivalCablePhoto + '\'' +
                '}';
    }
}
