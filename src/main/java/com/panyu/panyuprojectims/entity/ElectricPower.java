package com.panyu.panyuprojectims.entity;
public class ElectricPower {
    private String electricPowerId;
    private String electricConstructionMode;
    private String electricType;
    private String electricUnitName;
    private String electricUnitContacts;
    public ElectricPower() {
        super();
    }
    public ElectricPower(String electricPowerId,String electricConstructionMode,String electricType,String electricUnitName,String electricUnitContacts) {
        super();
        this.electricPowerId = electricPowerId;
        this.electricConstructionMode = electricConstructionMode;
        this.electricType = electricType;
        this.electricUnitName = electricUnitName;
        this.electricUnitContacts = electricUnitContacts;
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

    @Override
    public String toString() {
        return "ElectricPower{" +
                "electricPowerId='" + electricPowerId + '\'' +
                ", electricConstructionMode='" + electricConstructionMode + '\'' +
                ", electricType='" + electricType + '\'' +
                ", electricUnitName='" + electricUnitName + '\'' +
                ", electricUnitContacts='" + electricUnitContacts + '\'' +
                '}';
    }
}
