package com.panyu.panyuprojectims.entity;
//天线
public class IcAntennaNumber {
    private String antennaNumberId;
    private String indoorAntenna;
    private String outdoorAntenna;
    private String elevatorAntenna;
    private String gpsAntenna;



    public IcAntennaNumber() {
        super();
    }
    public IcAntennaNumber(String antennaNumberId,String indoorAntenna,String outdoorAntenna,String elevatorAntenna,String gpsAntenna) {
        super();
        this.antennaNumberId = antennaNumberId;
        this.indoorAntenna = indoorAntenna;
        this.outdoorAntenna = outdoorAntenna;
        this.elevatorAntenna = elevatorAntenna;
        this.gpsAntenna = gpsAntenna;
    }
    public String getAntennaNumberId() {
        return this.antennaNumberId;
    }

    public void setAntennaNumberId(String antennaNumberId) {
        this.antennaNumberId = antennaNumberId;
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
        return "IcAntennaNumber{" +
                "antennaNumberId='" + antennaNumberId + '\'' +
                ", indoorAntenna='" + indoorAntenna + '\'' +
                ", outdoorAntenna='" + outdoorAntenna + '\'' +
                ", elevatorAntenna='" + elevatorAntenna + '\'' +
                ", gpsAntenna='" + gpsAntenna + '\'' +
                '}';
    }
}
