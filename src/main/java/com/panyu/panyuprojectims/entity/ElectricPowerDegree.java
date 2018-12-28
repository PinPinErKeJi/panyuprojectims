package com.panyu.panyuprojectims.entity;
public class ElectricPowerDegree {
    private String electricPowerId;
    private String electricConstructionMode;
    private String electricType;
    private String electricUnitName;
    private String electricUnitContacts;
    private String electricProgress;
    private String electricCompletionDate;
    public ElectricPowerDegree() {
        super();
    }
    public ElectricPowerDegree(String electricPowerId,String electricConstructionMode,String electricType,String electricUnitName,String electricUnitContacts,String electricProgress,String electricCompletionDate) {
        super();
        this.electricPowerId = electricPowerId;
        this.electricConstructionMode = electricConstructionMode;
        this.electricType = electricType;
        this.electricUnitName = electricUnitName;
        this.electricUnitContacts = electricUnitContacts;
        this.electricProgress = electricProgress;
        this.electricCompletionDate = electricCompletionDate;
    }
    public String getElectricPowerId() {
        return this.electricPowerId;
    }

    public void setElectricPowerId(String electricPowerId) {
        this.electricPowerId = electricPowerId;
    }

    public String getElectricConstructionMode() {
        return this.electricConstructionMode;
    }

    public void setElectricConstructionMode(String electricConstructionMode) {
        this.electricConstructionMode = electricConstructionMode;
    }

    public String getElectricType() {
        return this.electricType;
    }

    public void setElectricType(String electricType) {
        this.electricType = electricType;
    }

    public String getElectricUnitName() {
        return this.electricUnitName;
    }

    public void setElectricUnitName(String electricUnitName) {
        this.electricUnitName = electricUnitName;
    }

    public String getElectricUnitContacts() {
        return this.electricUnitContacts;
    }

    public void setElectricUnitContacts(String electricUnitContacts) {
        this.electricUnitContacts = electricUnitContacts;
    }

    public String getElectricProgress() {
        return this.electricProgress;
    }

    public void setElectricProgress(String electricProgress) {
        this.electricProgress = electricProgress;
    }

    public String getElectricCompletionDate() {
        return this.electricCompletionDate;
    }

    public void setElectricCompletionDate(String electricCompletionDate) {
        this.electricCompletionDate = electricCompletionDate;
    }

}
