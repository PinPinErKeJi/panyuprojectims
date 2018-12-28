package com.panyu.panyuprojectims.entity;

import java.util.List;

public class PowerSupplyProject {
    private String powerProjectId;
    private String powerProjectName;
    private String powerSubWorkId;
    private String powerCriterionName;
    private List<PowerPhotoResources> powerPhotoResourcesList;

    public PowerSupplyProject() {
        super();
    }

    public PowerSupplyProject(String powerProjectId, String powerProjectName, String powerSubWorkId, String powerCriterionName, List<PowerPhotoResources> powerPhotoResourcesList) {
        this.powerProjectId = powerProjectId;
        this.powerProjectName = powerProjectName;
        this.powerSubWorkId = powerSubWorkId;
        this.powerCriterionName = powerCriterionName;
        this.powerPhotoResourcesList = powerPhotoResourcesList;
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

    public String getPowerSubWorkId() {
        return powerSubWorkId;
    }

    public void setPowerSubWorkId(String powerSubWorkId) {
        this.powerSubWorkId = powerSubWorkId;
    }

    public String getPowerCriterionName() {
        return powerCriterionName;
    }

    public void setPowerCriterionName(String powerCriterionName) {
        this.powerCriterionName = powerCriterionName;
    }

    public List<PowerPhotoResources> getPowerPhotoResourcesList() {
        return powerPhotoResourcesList;
    }

    public void setPowerPhotoResourcesList(List<PowerPhotoResources> powerPhotoResourcesList) {
        this.powerPhotoResourcesList = powerPhotoResourcesList;
    }

    @Override
    public String toString() {
        return "PowerSupplyProject{" +
                "powerProjectId='" + powerProjectId + '\'' +
                ", powerProjectName='" + powerProjectName + '\'' +
                ", powerSubWorkId='" + powerSubWorkId + '\'' +
                ", powerCriterionName='" + powerCriterionName + '\'' +
                ", powerPhotoResourcesList=" + powerPhotoResourcesList +
                '}';
    }
}
