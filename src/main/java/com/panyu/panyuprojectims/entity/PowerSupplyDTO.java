package com.panyu.panyuprojectims.entity;

public class PowerSupplyDTO {
    private String powerModuleId;
    private String powerModuleName;
    private String powerSubWorkId;
    private String powerSubWorkName;
    private String powerProjectId;
    private String powerProjectName;
    private String powerCriterionId;
    private String powerCriterionName;
    private String powerQualified;
    private String powerProblem;
    private String powerPhoto;


    public PowerSupplyDTO() {
        super();
    }

    public PowerSupplyDTO(String powerModuleId, String powerModuleName, String powerSubWorkId, String powerSubWorkName, String powerProjectId, String powerProjectName, String powerCriterionId, String powerCriterionName, String powerQualified, String powerProblem, String powerPhoto) {
        this.powerModuleId = powerModuleId;
        this.powerModuleName = powerModuleName;
        this.powerSubWorkId = powerSubWorkId;
        this.powerSubWorkName = powerSubWorkName;
        this.powerProjectId = powerProjectId;
        this.powerProjectName = powerProjectName;
        this.powerCriterionId = powerCriterionId;
        this.powerCriterionName = powerCriterionName;
        this.powerQualified = powerQualified;
        this.powerProblem = powerProblem;
        this.powerPhoto = powerPhoto;
    }

    public String getPowerModuleId() {
        return powerModuleId;
    }

    public void setPowerModuleId(String powerModuleId) {
        this.powerModuleId = powerModuleId;
    }

    public String getPowerModuleName() {
        return powerModuleName;
    }

    public void setPowerModuleName(String powerModuleName) {
        this.powerModuleName = powerModuleName;
    }

    public String getPowerSubWorkId() {
        return powerSubWorkId;
    }

    public void setPowerSubWorkId(String powerSubWorkId) {
        this.powerSubWorkId = powerSubWorkId;
    }

    public String getPowerSubWorkName() {
        return powerSubWorkName;
    }

    public void setPowerSubWorkName(String powerSubWorkName) {
        this.powerSubWorkName = powerSubWorkName;
    }

    public String getPowerProjectId() {
        return powerProjectId;
    }

    public void setPowerProjectId(String powerProjectId) {
        this.powerProjectId = powerProjectId;
    }

    public String getPowerProjectName() {
        return powerProjectName;
    }

    public void setPowerProjectName(String powerProjectName) {
        this.powerProjectName = powerProjectName;
    }

    public String getPowerCriterionId() {
        return powerCriterionId;
    }

    public void setPowerCriterionId(String powerCriterionId) {
        this.powerCriterionId = powerCriterionId;
    }

    public String getPowerCriterionName() {
        return powerCriterionName;
    }

    public void setPowerCriterionName(String powerCriterionName) {
        this.powerCriterionName = powerCriterionName;
    }

    public String getPowerQualified() {
        return powerQualified;
    }

    public void setPowerQualified(String powerQualified) {
        this.powerQualified = powerQualified;
    }

    public String getPowerProblem() {
        return powerProblem;
    }

    public void setPowerProblem(String powerProblem) {
        this.powerProblem = powerProblem;
    }

    public String getPowerPhoto() {
        return powerPhoto;
    }

    public void setPowerPhoto(String powerPhoto) {
        this.powerPhoto = powerPhoto;
    }

    @Override
    public String toString() {
        return "PowerSupplyDTO{" +
                "powerModuleId='" + powerModuleId + '\'' +
                ", powerModuleName='" + powerModuleName + '\'' +
                ", powerSubWorkId='" + powerSubWorkId + '\'' +
                ", powerSubWorkName='" + powerSubWorkName + '\'' +
                ", powerProjectId='" + powerProjectId + '\'' +
                ", powerProjectName='" + powerProjectName + '\'' +
                ", powerCriterionId='" + powerCriterionId + '\'' +
                ", powerCriterionName='" + powerCriterionName + '\'' +
                ", powerQualified='" + powerQualified + '\'' +
                ", powerProblem='" + powerProblem + '\'' +
                ", powerPhoto='" + powerPhoto + '\'' +
                '}';
    }
}
