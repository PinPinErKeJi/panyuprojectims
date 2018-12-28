package com.panyu.panyuprojectims.entity;
public class PowerArrivalRack {
    private String powerArrivalRackId;
    private String powerArrivalRackNumber;
    private String powerArrivalRackLength;
    private String powerArrivalRackTime;
    private String powerArrivalRackPhoto;

    public PowerArrivalRack() {
        super();
    }
    public PowerArrivalRack(String powerArrivalRackId,String powerArrivalRackNumber,String powerArrivalRackLength,String powerArrivalRackTime,String powerArrivalRackPhoto) {
        super();
        this.powerArrivalRackId = powerArrivalRackId;
        this.powerArrivalRackNumber = powerArrivalRackNumber;
        this.powerArrivalRackLength = powerArrivalRackLength;
        this.powerArrivalRackTime = powerArrivalRackTime;
        this.powerArrivalRackPhoto = powerArrivalRackPhoto;
    }
    public String getPowerArrivalRackId() {
        return this.powerArrivalRackId;
    }

    public void setPowerArrivalRackId(String powerArrivalRackId) {
        this.powerArrivalRackId = powerArrivalRackId;
    }

    public String getPowerArrivalRackNumber() {
        return this.powerArrivalRackNumber;
    }

    public void setPowerArrivalRackNumber(String powerArrivalRackNumber) {
        this.powerArrivalRackNumber = powerArrivalRackNumber;
    }

    public String getPowerArrivalRackLength() {
        return this.powerArrivalRackLength;
    }

    public void setPowerArrivalRackLength(String powerArrivalRackLength) {
        this.powerArrivalRackLength = powerArrivalRackLength;
    }

    public String getPowerArrivalRackTime() {
        return this.powerArrivalRackTime;
    }

    public void setPowerArrivalRackTime(String powerArrivalRackTime) {
        this.powerArrivalRackTime = powerArrivalRackTime;
    }

    public String getPowerArrivalRackPhoto() {
        return this.powerArrivalRackPhoto;
    }

    public void setPowerArrivalRackPhoto(String powerArrivalRackPhoto) {
        this.powerArrivalRackPhoto = powerArrivalRackPhoto;
    }

    @Override
    public String toString() {
        return "PowerArrivalRack{" +
                "powerArrivalRackId='" + powerArrivalRackId + '\'' +
                ", powerArrivalRackNumber='" + powerArrivalRackNumber + '\'' +
                ", powerArrivalRackLength='" + powerArrivalRackLength + '\'' +
                ", powerArrivalRackTime='" + powerArrivalRackTime + '\'' +
                ", powerArrivalRackPhoto='" + powerArrivalRackPhoto + '\'' +
                '}';
    }
}
