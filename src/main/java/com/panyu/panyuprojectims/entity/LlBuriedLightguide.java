package com.panyu.panyuprojectims.entity;
public class LlBuriedLightguide {
    private String buriedLightguideId;
    private String buriedDesignLength;
    private String buriedCompletionLength;
    public LlBuriedLightguide() {
        super();
    }
    public LlBuriedLightguide(String buriedLightguideId,String buriedDesignLength,String buriedCompletionLength) {
        super();
        this.buriedLightguideId = buriedLightguideId;
        this.buriedDesignLength = buriedDesignLength;
        this.buriedCompletionLength = buriedCompletionLength;
    }
    public String getBuriedLightguideId() {
        return this.buriedLightguideId;
    }

    public void setBuriedLightguideId(String buriedLightguideId) {
        this.buriedLightguideId = buriedLightguideId;
    }

    public String getBuriedDesignLength() {
        return this.buriedDesignLength;
    }

    public void setBuriedDesignLength(String buriedDesignLength) {
        this.buriedDesignLength = buriedDesignLength;
    }

    public String getBuriedCompletionLength() {
        return this.buriedCompletionLength;
    }

    public void setBuriedCompletionLength(String buriedCompletionLength) {
        this.buriedCompletionLength = buriedCompletionLength;
    }

    @Override
    public String toString() {
        return "LlBuriedLightguide{" +
                "buriedLightguideId='" + buriedLightguideId + '\'' +
                ", buriedDesignLength='" + buriedDesignLength + '\'' +
                ", buriedCompletionLength='" + buriedCompletionLength + '\'' +
                '}';
    }
}
