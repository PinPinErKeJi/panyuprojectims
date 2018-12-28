package com.panyu.panyuprojectims.entity;
public class LlInBridgeCable {
    private String bridgeCableId;
    private String bridgeDesignLength;
    private String bridgeLaidLength;
    public LlInBridgeCable() {
        super();
    }
    public LlInBridgeCable(String bridgeCableId,String bridgeDesignLength,String bridgeLaidLength) {
        super();
        this.bridgeCableId = bridgeCableId;
        this.bridgeDesignLength = bridgeDesignLength;
        this.bridgeLaidLength = bridgeLaidLength;
    }
    public String getBridgeCableId() {
        return this.bridgeCableId;
    }

    public void setBridgeCableId(String bridgeCableId) {
        this.bridgeCableId = bridgeCableId;
    }

    public String getBridgeDesignLength() {
        return this.bridgeDesignLength;
    }

    public void setBridgeDesignLength(String bridgeDesignLength) {
        this.bridgeDesignLength = bridgeDesignLength;
    }

    public String getBridgeLaidLength() {
        return this.bridgeLaidLength;
    }

    public void setBridgeLaidLength(String bridgeLaidLength) {
        this.bridgeLaidLength = bridgeLaidLength;
    }

    @Override
    public String toString() {
        return "LlInBridgeCable{" +
                "bridgeCableId='" + bridgeCableId + '\'' +
                ", bridgeDesignLength='" + bridgeDesignLength + '\'' +
                ", bridgeLaidLength='" + bridgeLaidLength + '\'' +
                '}';
    }
}
