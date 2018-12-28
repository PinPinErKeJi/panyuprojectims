package com.panyu.panyuprojectims.entity;
public class PsProgressNewPowerCable {
    private String progressPowerCableId;
    private String progressPowerCableNumber;
    private String progressPowerCableModel;
    private String progressPowerLength;
    private String beFrom;
    private String beTo;
    private String constructionSchedule;
    private String powerCableMakespan;


    public PsProgressNewPowerCable() {
        super();
    }
    public PsProgressNewPowerCable(String progressPowerCableId,String progressPowerCableNumber,String progressPowerCableModel,String progressPowerLength,String beFrom,String beTo,String constructionSchedule,String powerCableMakespan) {
        super();
        this.progressPowerCableId = progressPowerCableId;
        this.progressPowerCableNumber = progressPowerCableNumber;
        this.progressPowerCableModel = progressPowerCableModel;
        this.progressPowerLength = progressPowerLength;
        this.beFrom = beFrom;
        this.beTo = beTo;
        this.constructionSchedule = constructionSchedule;
        this.powerCableMakespan = powerCableMakespan;
    }
    public String getProgressPowerCableId() {
        return this.progressPowerCableId;
    }

    public void setProgressPowerCableId(String progressPowerCableId) {
        this.progressPowerCableId = progressPowerCableId;
    }

    public String getProgressPowerCableNumber() {
        return this.progressPowerCableNumber;
    }

    public void setProgressPowerCableNumber(String progressPowerCableNumber) {
        this.progressPowerCableNumber = progressPowerCableNumber;
    }

    public String getProgressPowerCableModel() {
        return this.progressPowerCableModel;
    }

    public void setProgressPowerCableModel(String progressPowerCableModel) {
        this.progressPowerCableModel = progressPowerCableModel;
    }

    public String getProgressPowerLength() {
        return this.progressPowerLength;
    }

    public void setProgressPowerLength(String progressPowerLength) {
        this.progressPowerLength = progressPowerLength;
    }

    public String getBeFrom() {
        return this.beFrom;
    }

    public void setBeFrom(String beFrom) {
        this.beFrom = beFrom;
    }

    public String getBeTo() {
        return this.beTo;
    }

    public void setBeTo(String beTo) {
        this.beTo = beTo;
    }

    public String getConstructionSchedule() {
        return this.constructionSchedule;
    }

    public void setConstructionSchedule(String constructionSchedule) {
        this.constructionSchedule = constructionSchedule;
    }

    public String getPowerCableMakespan() {
        return this.powerCableMakespan;
    }

    public void setPowerCableMakespan(String powerCableMakespan) {
        this.powerCableMakespan = powerCableMakespan;
    }

    @Override
    public String toString() {
        return "PsProgressNewPowerCable{" +
                "progressPowerCableId='" + progressPowerCableId + '\'' +
                ", progressPowerCableNumber='" + progressPowerCableNumber + '\'' +
                ", progressPowerCableModel='" + progressPowerCableModel + '\'' +
                ", progressPowerLength='" + progressPowerLength + '\'' +
                ", beFrom='" + beFrom + '\'' +
                ", beTo='" + beTo + '\'' +
                ", constructionSchedule='" + constructionSchedule + '\'' +
                ", powerCableMakespan='" + powerCableMakespan + '\'' +
                '}';
    }
}
