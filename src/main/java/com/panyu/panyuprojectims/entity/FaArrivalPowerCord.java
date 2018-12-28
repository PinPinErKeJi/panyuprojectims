package com.panyu.panyuprojectims.entity;
public class FaArrivalPowerCord {
    private String arrivalPowerCordId;
    private String arrivalPowerCordNumber;
    private String arrivalCableType;
    private String arrivalSpecificationModel;
    private String arrivalDesignLength;
    private String arrivalLength;
    private String arrivalTime;
    private String powerCordVerifyingPhotos;

    public FaArrivalPowerCord() {
        super();
    }
    public FaArrivalPowerCord(String arrivalPowerCordId,String arrivalPowerCordNumber,String arrivalCableType,String arrivalSpecificationModel,String arrivalDesignLength,String arrivalLength,String arrivalTime,String powerCordVerifyingPhotos) {
        super();
        this.arrivalPowerCordId = arrivalPowerCordId;
        this.arrivalPowerCordNumber = arrivalPowerCordNumber;
        this.arrivalCableType = arrivalCableType;
        this.arrivalSpecificationModel = arrivalSpecificationModel;
        this.arrivalDesignLength = arrivalDesignLength;
        this.arrivalLength = arrivalLength;
        this.arrivalTime = arrivalTime;
        this.powerCordVerifyingPhotos = powerCordVerifyingPhotos;
    }
    public String getArrivalPowerCordId() {
        return this.arrivalPowerCordId;
    }

    public void setArrivalPowerCordId(String arrivalPowerCordId) {
        this.arrivalPowerCordId = arrivalPowerCordId;
    }

    public String getArrivalPowerCordNumber() {
        return this.arrivalPowerCordNumber;
    }

    public void setArrivalPowerCordNumber(String arrivalPowerCordNumber) {
        this.arrivalPowerCordNumber = arrivalPowerCordNumber;
    }

    public String getArrivalCableType() {
        return this.arrivalCableType;
    }

    public void setArrivalCableType(String arrivalCableType) {
        this.arrivalCableType = arrivalCableType;
    }

    public String getArrivalSpecificationModel() {
        return this.arrivalSpecificationModel;
    }

    public void setArrivalSpecificationModel(String arrivalSpecificationModel) {
        this.arrivalSpecificationModel = arrivalSpecificationModel;
    }

    public String getArrivalDesignLength() {
        return this.arrivalDesignLength;
    }

    public void setArrivalDesignLength(String arrivalDesignLength) {
        this.arrivalDesignLength = arrivalDesignLength;
    }

    public String getArrivalLength() {
        return this.arrivalLength;
    }

    public void setArrivalLength(String arrivalLength) {
        this.arrivalLength = arrivalLength;
    }

    public String getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getPowerCordVerifyingPhotos() {
        return this.powerCordVerifyingPhotos;
    }

    public void setPowerCordVerifyingPhotos(String powerCordVerifyingPhotos) {
        this.powerCordVerifyingPhotos = powerCordVerifyingPhotos;
    }

    @Override
    public String toString() {
        return "FaArrivalPowerCord{" +
                "arrivalPowerCordId='" + arrivalPowerCordId + '\'' +
                ", arrivalPowerCordNumber='" + arrivalPowerCordNumber + '\'' +
                ", arrivalCableType='" + arrivalCableType + '\'' +
                ", arrivalSpecificationModel='" + arrivalSpecificationModel + '\'' +
                ", arrivalDesignLength='" + arrivalDesignLength + '\'' +
                ", arrivalLength='" + arrivalLength + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", powerCordVerifyingPhotos='" + powerCordVerifyingPhotos + '\'' +
                '}';
    }
}
