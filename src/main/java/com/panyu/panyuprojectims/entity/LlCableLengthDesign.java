package com.panyu.panyuprojectims.entity;
public class LlCableLengthDesign {
    private String cableLengthDesignId;
    private String gystsSuspended;
    private String gystsSuspensionWire;
    private String gysta;
    private String plowInOpticalCable;
    private String wallCable;
    private String inBridgeCable;
    private String gyfxts;

    public LlCableLengthDesign() {
        super();
    }
    public LlCableLengthDesign(String cableLengthDesignId,String gystsSuspended,String gystsSuspensionWire,String gysta,String plowInOpticalCable,String wallCable,String inBridgeCable,String gyfxts) {
        super();
        this.cableLengthDesignId = cableLengthDesignId;
        this.gystsSuspended = gystsSuspended;
        this.gystsSuspensionWire = gystsSuspensionWire;
        this.gysta = gysta;
        this.plowInOpticalCable = plowInOpticalCable;
        this.wallCable = wallCable;
        this.inBridgeCable = inBridgeCable;
        this.gyfxts = gyfxts;
    }
    public String getCableLengthDesignId() {
        return this.cableLengthDesignId;
    }

    public void setCableLengthDesignId(String cableLengthDesignId) {
        this.cableLengthDesignId = cableLengthDesignId;
    }

    public String getGystsSuspended() {
        return this.gystsSuspended;
    }

    public void setGystsSuspended(String gystsSuspended) {
        this.gystsSuspended = gystsSuspended;
    }

    public String getGystsSuspensionWire() {
        return this.gystsSuspensionWire;
    }

    public void setGystsSuspensionWire(String gystsSuspensionWire) {
        this.gystsSuspensionWire = gystsSuspensionWire;
    }

    public String getGysta() {
        return this.gysta;
    }

    public void setGysta(String gysta) {
        this.gysta = gysta;
    }

    public String getPlowInOpticalCable() {
        return this.plowInOpticalCable;
    }

    public void setPlowInOpticalCable(String plowInOpticalCable) {
        this.plowInOpticalCable = plowInOpticalCable;
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
        return "LlCableLengthDesign{" +
                "cableLengthDesignId='" + cableLengthDesignId + '\'' +
                ", gystsSuspended='" + gystsSuspended + '\'' +
                ", gystsSuspensionWire='" + gystsSuspensionWire + '\'' +
                ", gysta='" + gysta + '\'' +
                ", plowInOpticalCable='" + plowInOpticalCable + '\'' +
                ", wallCable='" + wallCable + '\'' +
                ", inBridgeCable='" + inBridgeCable + '\'' +
                ", gyfxts='" + gyfxts + '\'' +
                '}';
    }
}
