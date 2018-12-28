package com.panyu.panyuprojectims.entity;
public class IcPassiveDeviceType {
    private String passiveDeviceTypeId;
    private String passiveDeviceType;
    private String powerDivider;
    private String coupler;
    private String roadConnector;
    private String loadNumber;

    public IcPassiveDeviceType() {
        super();
    }
    public IcPassiveDeviceType(String passiveDeviceTypeId,String passiveDeviceType,String powerDivider,String coupler,String roadConnector,String loadNumber) {
        super();
        this.passiveDeviceTypeId = passiveDeviceTypeId;
        this.passiveDeviceType = passiveDeviceType;
        this.powerDivider = powerDivider;
        this.coupler = coupler;
        this.roadConnector = roadConnector;
        this.loadNumber = loadNumber;
    }
    public String getPassiveDeviceTypeId() {
        return this.passiveDeviceTypeId;
    }

    public void setPassiveDeviceTypeId(String passiveDeviceTypeId) {
        this.passiveDeviceTypeId = passiveDeviceTypeId;
    }

    public String getPassiveDeviceType() {
        return this.passiveDeviceType;
    }

    public void setPassiveDeviceType(String passiveDeviceType) {
        this.passiveDeviceType = passiveDeviceType;
    }

    public String getPowerDivider() {
        return this.powerDivider;
    }

    public void setPowerDivider(String powerDivider) {
        this.powerDivider = powerDivider;
    }

    public String getCoupler() {
        return this.coupler;
    }

    public void setCoupler(String coupler) {
        this.coupler = coupler;
    }

    public String getRoadConnector() {
        return this.roadConnector;
    }

    public void setRoadConnector(String roadConnector) {
        this.roadConnector = roadConnector;
    }

    public String getLoadNumber() {
        return this.loadNumber;
    }

    public void setLoadNumber(String loadNumber) {
        this.loadNumber = loadNumber;
    }

    @Override
    public String toString() {
        return "IcPassiveDeviceType{" +
                "passiveDeviceTypeId='" + passiveDeviceTypeId + '\'' +
                ", passiveDeviceType='" + passiveDeviceType + '\'' +
                ", powerDivider='" + powerDivider + '\'' +
                ", coupler='" + coupler + '\'' +
                ", roadConnector='" + roadConnector + '\'' +
                ", loadNumber='" + loadNumber + '\'' +
                '}';
    }
}
