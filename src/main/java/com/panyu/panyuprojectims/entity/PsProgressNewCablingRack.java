package com.panyu.panyuprojectims.entity;
public class PsProgressNewCablingRack {
    private String progressCablingRackId;
    private String progressCablingRackNumber;
    private String progressRackLength;
    private String rackConstructionProgress;
    private String cablingRackMakespan;


    public PsProgressNewCablingRack() {
        super();
    }
    public PsProgressNewCablingRack(String progressCablingRackId,String progressCablingRackNumber,String progressRackLength,String rackConstructionProgress,String cablingRackMakespan) {
        super();
        this.progressCablingRackId = progressCablingRackId;
        this.progressCablingRackNumber = progressCablingRackNumber;
        this.progressRackLength = progressRackLength;
        this.rackConstructionProgress = rackConstructionProgress;
        this.cablingRackMakespan = cablingRackMakespan;
    }
    public String getProgressCablingRackId() {
        return this.progressCablingRackId;
    }

    public void setProgressCablingRackId(String progressCablingRackId) {
        this.progressCablingRackId = progressCablingRackId;
    }

    public String getProgressCablingRackNumber() {
        return this.progressCablingRackNumber;
    }

    public void setProgressCablingRackNumber(String progressCablingRackNumber) {
        this.progressCablingRackNumber = progressCablingRackNumber;
    }

    public String getProgressRackLength() {
        return this.progressRackLength;
    }

    public void setProgressRackLength(String progressRackLength) {
        this.progressRackLength = progressRackLength;
    }

    public String getRackConstructionProgress() {
        return this.rackConstructionProgress;
    }

    public void setRackConstructionProgress(String rackConstructionProgress) {
        this.rackConstructionProgress = rackConstructionProgress;
    }

    public String getCablingRackMakespan() {
        return this.cablingRackMakespan;
    }

    public void setCablingRackMakespan(String cablingRackMakespan) {
        this.cablingRackMakespan = cablingRackMakespan;
    }

    @Override
    public String toString() {
        return "PsProgressNewCablingRack{" +
                "progressCablingRackId='" + progressCablingRackId + '\'' +
                ", progressCablingRackNumber='" + progressCablingRackNumber + '\'' +
                ", progressRackLength='" + progressRackLength + '\'' +
                ", rackConstructionProgress='" + rackConstructionProgress + '\'' +
                ", cablingRackMakespan='" + cablingRackMakespan + '\'' +
                '}';
    }
}
