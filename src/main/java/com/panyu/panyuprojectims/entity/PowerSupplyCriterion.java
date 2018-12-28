package com.panyu.panyuprojectims.entity;
public class PowerSupplyCriterion {
    private String powerCriterionId;
    private String powerCriterionName;
    private String powerQualified;
    private String powerProblem;
    private String powerPhoto;
    private String powerProjectId;



    public PowerSupplyCriterion() {
        super();
    }
    public PowerSupplyCriterion(String powerCriterionId,String powerCriterionName,String powerQualified,String powerProblem,String powerPhoto,String powerProjectId) {
        super();
        this.powerCriterionId = powerCriterionId;
        this.powerCriterionName = powerCriterionName;
        this.powerQualified = powerQualified;
        this.powerProblem = powerProblem;
        this.powerPhoto = powerPhoto;
        this.powerProjectId = powerProjectId;
    }
    public String getPowerCriterionId() {
        return this.powerCriterionId;
    }

    public void setPowerCriterionId(String powerCriterionId) {
        this.powerCriterionId = powerCriterionId;
    }

    public String getPowerCriterionName() {
        return this.powerCriterionName;
    }

    public void setPowerCriterionName(String powerCriterionName) {
        this.powerCriterionName = powerCriterionName;
    }

    public String getPowerQualified() {
        return this.powerQualified;
    }

    public void setPowerQualified(String powerQualified) {
        this.powerQualified = powerQualified;
    }

    public String getPowerProblem() {
        return this.powerProblem;
    }

    public void setPowerProblem(String powerProblem) {
        this.powerProblem = powerProblem;
    }

    public String getPowerPhoto() {
        return this.powerPhoto;
    }

    public void setPowerPhoto(String powerPhoto) {
        this.powerPhoto = powerPhoto;
    }

    public String getPowerProjectId() {
        return this.powerProjectId;
    }

    public void setPowerProjectId(String powerProjectId) {
        this.powerProjectId = powerProjectId;
    }

    @Override
    public String toString() {
        return "PowerSupplyCriterion{" +
                "powerCriterionId='" + powerCriterionId + '\'' +
                ", powerCriterionName='" + powerCriterionName + '\'' +
                ", powerQualified='" + powerQualified + '\'' +
                ", powerProblem='" + powerProblem + '\'' +
                ", powerPhoto='" + powerPhoto + '\'' +
                ", powerProjectId='" + powerProjectId + '\'' +
                '}';
    }
}
