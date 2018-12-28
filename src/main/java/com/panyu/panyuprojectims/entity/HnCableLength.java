package com.panyu.panyuprojectims.entity;
public class HnCableLength {
    private String cableLengthId;
    private String gysts;
    private String gysta;
    private String buriedServiceLightguide;
    private String wallCable;
    private String inBridgeCable;
    private String gyfxts;
    public HnCableLength() {
        super();
    }
    public HnCableLength(String cableLengthId,String gysts,String gysta,String buriedServiceLightguide,String wallCable,String inBridgeCable,String gyfxts) {
        super();
        this.cableLengthId = cableLengthId;
        this.gysts = gysts;
        this.gysta = gysta;
        this.buriedServiceLightguide = buriedServiceLightguide;
        this.wallCable = wallCable;
        this.inBridgeCable = inBridgeCable;
        this.gyfxts = gyfxts;
    }
    public String getCableLengthId() {
        return this.cableLengthId;
    }

    public void setCableLengthId(String cableLengthId) {
        this.cableLengthId = cableLengthId;
    }

    public String getGysts() {
        return this.gysts;
    }

    public void setGysts(String gysts) {
        this.gysts = gysts;
    }

    public String getGysta() {
        return this.gysta;
    }

    public void setGysta(String gysta) {
        this.gysta = gysta;
    }

    public String getBuriedServiceLightguide() {
        return this.buriedServiceLightguide;
    }

    public void setBuriedServiceLightguide(String buriedServiceLightguide) {
        this.buriedServiceLightguide = buriedServiceLightguide;
    }

    public String getWallCable() {
        return this.wallCable;
    }

    public void setWallCable(String wallCable) {
        this.wallCable = wallCable;
    }

    public String getInBridgeCable() {
        return this.inBridgeCable;
    }

    public void setInBridgeCable(String inBridgeCable) {
        this.inBridgeCable = inBridgeCable;
    }

    public String getGyfxts() {
        return this.gyfxts;
    }

    public void setGyfxts(String gyfxts) {
        this.gyfxts = gyfxts;
    }

    @Override
    public String toString() {
        return "HnCableLength{" +
                "cableLengthId='" + cableLengthId + '\'' +
                ", gysts='" + gysts + '\'' +
                ", gysta='" + gysta + '\'' +
                ", buriedServiceLightguide='" + buriedServiceLightguide + '\'' +
                ", wallCable='" + wallCable + '\'' +
                ", inBridgeCable='" + inBridgeCable + '\'' +
                ", gyfxts='" + gyfxts + '\'' +
                '}';
    }
}
