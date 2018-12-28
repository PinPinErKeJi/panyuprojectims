package com.panyu.panyuprojectims.entity;
public class LlBuriedServiceLightguide {
    private String buriedServiceLightguideId;
    private String lightguideDesignLength;
    private String lightguideLaidLength;
    public LlBuriedServiceLightguide() {
        super();
    }
    public LlBuriedServiceLightguide(String buriedServiceLightguideId,String lightguideDesignLength,String lightguideLaidLength) {
        super();
        this.buriedServiceLightguideId = buriedServiceLightguideId;
        this.lightguideDesignLength = lightguideDesignLength;
        this.lightguideLaidLength = lightguideLaidLength;
    }
    public String getBuriedServiceLightguideId() {
        return this.buriedServiceLightguideId;
    }

    public void setBuriedServiceLightguideId(String buriedServiceLightguideId) {
        this.buriedServiceLightguideId = buriedServiceLightguideId;
    }

    public String getLightguideDesignLength() {
        return this.lightguideDesignLength;
    }

    public void setLightguideDesignLength(String lightguideDesignLength) {
        this.lightguideDesignLength = lightguideDesignLength;
    }

    public String getLightguideLaidLength() {
        return this.lightguideLaidLength;
    }

    public void setLightguideLaidLength(String lightguideLaidLength) {
        this.lightguideLaidLength = lightguideLaidLength;
    }

    @Override
    public String toString() {
        return "LlBuriedServiceLightguide{" +
                "buriedServiceLightguideId='" + buriedServiceLightguideId + '\'' +
                ", lightguideDesignLength='" + lightguideDesignLength + '\'' +
                ", lightguideLaidLength='" + lightguideLaidLength + '\'' +
                '}';
    }
}
