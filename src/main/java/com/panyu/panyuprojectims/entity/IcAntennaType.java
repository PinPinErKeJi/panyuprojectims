package com.panyu.panyuprojectims.entity;
public class IcAntennaType {
    private String antennaTypeId;
    private String antennaType;
    private String indoorAntenna;
    private String outdoorAntenna;
    private String elevatorAntenna;
    private String gpsAntenna;

    public IcAntennaType() {
        super();
    }
    public IcAntennaType(String antennaTypeId,String antennaType,String indoorAntenna,String outdoorAntenna,String elevatorAntenna,String gpsAntenna) {
        super();
        this.antennaTypeId = antennaTypeId;
        this.antennaType = antennaType;
        this.indoorAntenna = indoorAntenna;
        this.outdoorAntenna = outdoorAntenna;
        this.elevatorAntenna = elevatorAntenna;
        this.gpsAntenna = gpsAntenna;
    }
    public String getAntennaTypeId() {
        return this.antennaTypeId;
    }

    public void setAntennaTypeId(String antennaTypeId) {
        this.antennaTypeId = antennaTypeId;
    }

    public String getAntennaType() {
        return this.antennaType;
    }

    public void setAntennaType(String antennaType) {
        this.antennaType = antennaType;
    }

    public String getIndoorAntenna() {
        return this.indoorAntenna;
    }

    public void setIndoorAntenna(String indoorAntenna) {
        this.indoorAntenna = indoorAntenna;
    }

    public String getOutdoorAntenna() {
        return this.outdoorAntenna;
    }

    public void setOutdoorAntenna(String outdoorAntenna) {
        this.outdoorAntenna = outdoorAntenna;
    }

    public String getElevatorAntenna() {
        return this.elevatorAntenna;
    }

    public void setElevatorAntenna(String elevatorAntenna) {
        this.elevatorAntenna = elevatorAntenna;
    }

    public String getGpsAntenna() {
        return this.gpsAntenna;
    }

    public void setGpsAntenna(String gpsAntenna) {
        this.gpsAntenna = gpsAntenna;
    }

    @Override
    public String toString() {
        return "IcAntennaType{" +
                "antennaTypeId='" + antennaTypeId + '\'' +
                ", antennaType='" + antennaType + '\'' +
                ", indoorAntenna='" + indoorAntenna + '\'' +
                ", outdoorAntenna='" + outdoorAntenna + '\'' +
                ", elevatorAntenna='" + elevatorAntenna + '\'' +
                ", gpsAntenna='" + gpsAntenna + '\'' +
                '}';
    }
}
