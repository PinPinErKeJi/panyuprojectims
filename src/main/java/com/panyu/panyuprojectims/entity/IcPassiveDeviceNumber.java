package com.panyu.panyuprojectims.entity;
//无源器件
public class IcPassiveDeviceNumber {
    private String passiveDeviceNumberId;
    private String powerDivider;
    private String coupler;
    private String roadConnector;
    private String loadNumber;



    public IcPassiveDeviceNumber() {
        super();
    }
    public IcPassiveDeviceNumber(String passiveDeviceNumberId,String powerDivider,String coupler,String roadConnector,String loadNumber) {
        super();
        this.passiveDeviceNumberId = passiveDeviceNumberId;
        this.powerDivider = powerDivider;
        this.coupler = coupler;
        this.roadConnector = roadConnector;
        this.loadNumber = loadNumber;
    }
    public String getPassiveDeviceNumberId() {
        return this.passiveDeviceNumberId;
    }

    public void setPassiveDeviceNumberId(String passiveDeviceNumberId) {
        this.passiveDeviceNumberId = passiveDeviceNumberId;
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
        return "IcPassiveDeviceNumber{" +
                "passiveDeviceNumberId='" + passiveDeviceNumberId + '\'' +
                ", powerDivider='" + powerDivider + '\'' +
                ", coupler='" + coupler + '\'' +
                ", roadConnector='" + roadConnector + '\'' +
                ", loadNumber='" + loadNumber + '\'' +
                '}';
    }
}
