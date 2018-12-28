package com.panyu.panyuprojectims.entity;
public class PowerPhotoResources {
    private String powerPhotoId;
    private String powerPhotoName;
    private String photoUploadPeople;
    private String qualified;
    private String problemDescription;
    private String powerModuleId;
    private String powerSubWorkId;
    private String powerProjectId;
    private String powerInformationId;

    public PowerPhotoResources() {
        super();
    }
    public PowerPhotoResources(String powerPhotoId,String powerPhotoName,String photoUploadPeople,String qualified,String problemDescription,String powerModuleId,String powerSubWorkId,String powerProjectId,String powerInformationId) {
        super();
        this.powerPhotoId = powerPhotoId;
        this.powerPhotoName = powerPhotoName;
        this.photoUploadPeople = photoUploadPeople;
        this.qualified = qualified;
        this.problemDescription = problemDescription;
        this.powerModuleId = powerModuleId;
        this.powerSubWorkId = powerSubWorkId;
        this.powerProjectId = powerProjectId;
        this.powerInformationId = powerInformationId;
    }
    public String getPowerPhotoId() {
        return this.powerPhotoId;
    }

    public void setPowerPhotoId(String powerPhotoId) {
        this.powerPhotoId = powerPhotoId;
    }

    public String getPowerPhotoName() {
        return this.powerPhotoName;
    }

    public void setPowerPhotoName(String powerPhotoName) {
        this.powerPhotoName = powerPhotoName;
    }

    public String getPhotoUploadPeople() {
        return this.photoUploadPeople;
    }

    public void setPhotoUploadPeople(String photoUploadPeople) {
        this.photoUploadPeople = photoUploadPeople;
    }

    public String getQualified() {
        return this.qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getProblemDescription() {
        return this.problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getPowerModuleId() {
        return this.powerModuleId;
    }

    public void setPowerModuleId(String powerModuleId) {
        this.powerModuleId = powerModuleId;
    }

    public String getPowerSubWorkId() {
        return this.powerSubWorkId;
    }

    public void setPowerSubWorkId(String powerSubWorkId) {
        this.powerSubWorkId = powerSubWorkId;
    }

    public String getPowerProjectId() {
        return this.powerProjectId;
    }

    public void setPowerProjectId(String powerProjectId) {
        this.powerProjectId = powerProjectId;
    }

    public String getPowerInformationId() {
        return this.powerInformationId;
    }

    public void setPowerInformationId(String powerInformationId) {
        this.powerInformationId = powerInformationId;
    }

    @Override
    public String toString() {
        return "PowerPhotoResources{" +
                "powerPhotoId='" + powerPhotoId + '\'' +
                ", powerPhotoName='" + powerPhotoName + '\'' +
                ", photoUploadPeople='" + photoUploadPeople + '\'' +
                ", qualified='" + qualified + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", powerModuleId='" + powerModuleId + '\'' +
                ", powerSubWorkId='" + powerSubWorkId + '\'' +
                ", powerProjectId='" + powerProjectId + '\'' +
                ", powerInformationId='" + powerInformationId + '\'' +
                '}';
    }
}
