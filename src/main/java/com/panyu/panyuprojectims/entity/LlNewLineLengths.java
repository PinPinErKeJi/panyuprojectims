package com.panyu.panyuprojectims.entity;
public class LlNewLineLengths {
    private String newLineLengthsId;
    private String newPoleLineId;
    private String newPipeLineId;
    private String buriedLightguideId;
    private String pushPipeId;
    public LlNewLineLengths() {
        super();
    }
    public LlNewLineLengths(String newLineLengthsId,String newPoleLineId,String newPipeLineId,String buriedLightguideId,String pushPipeId) {
        super();
        this.newLineLengthsId = newLineLengthsId;
        this.newPoleLineId = newPoleLineId;
        this.newPipeLineId = newPipeLineId;
        this.buriedLightguideId = buriedLightguideId;
        this.pushPipeId = pushPipeId;
    }
    public String getNewLineLengthsId() {
        return this.newLineLengthsId;
    }

    public void setNewLineLengthsId(String newLineLengthsId) {
        this.newLineLengthsId = newLineLengthsId;
    }

    public String getNewPoleLineId() {
        return this.newPoleLineId;
    }

    public void setNewPoleLineId(String newPoleLineId) {
        this.newPoleLineId = newPoleLineId;
    }

    public String getNewPipeLineId() {
        return this.newPipeLineId;
    }

    public void setNewPipeLineId(String newPipeLineId) {
        this.newPipeLineId = newPipeLineId;
    }

    public String getBuriedLightguideId() {
        return this.buriedLightguideId;
    }

    public void setBuriedLightguideId(String buriedLightguideId) {
        this.buriedLightguideId = buriedLightguideId;
    }

    public String getPushPipeId() {
        return this.pushPipeId;
    }

    public void setPushPipeId(String pushPipeId) {
        this.pushPipeId = pushPipeId;
    }

    @Override
    public String toString() {
        return "LlNewLineLengths{" +
                "newLineLengthsId='" + newLineLengthsId + '\'' +
                ", newPoleLineId='" + newPoleLineId + '\'' +
                ", newPipeLineId='" + newPipeLineId + '\'' +
                ", buriedLightguideId='" + buriedLightguideId + '\'' +
                ", pushPipeId='" + pushPipeId + '\'' +
                '}';
    }
}
