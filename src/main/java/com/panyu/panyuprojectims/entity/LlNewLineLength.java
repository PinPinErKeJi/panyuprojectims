package com.panyu.panyuprojectims.entity;
public class LlNewLineLength {
    private String newLineLengthId;
    private String newPoleLine;
    private String newPipe;
    private String directBurialOpticalCable;
    private String pushPipe;
    public LlNewLineLength() {
        super();
    }
    public LlNewLineLength(String newLineLengthId,String newPoleLine,String newPipe,String directBurialOpticalCable,String pushPipe) {
        super();
        this.newLineLengthId = newLineLengthId;
        this.newPoleLine = newPoleLine;
        this.newPipe = newPipe;
        this.directBurialOpticalCable = directBurialOpticalCable;
        this.pushPipe = pushPipe;
    }
    public String getNewLineLengthId() {
        return this.newLineLengthId;
    }

    public void setNewLineLengthId(String newLineLengthId) {
        this.newLineLengthId = newLineLengthId;
    }

    public String getNewPoleLine() {
        return this.newPoleLine;
    }

    public void setNewPoleLine(String newPoleLine) {
        this.newPoleLine = newPoleLine;
    }

    public String getNewPipe() {
        return this.newPipe;
    }

    public void setNewPipe(String newPipe) {
        this.newPipe = newPipe;
    }

    public String getDirectBurialOpticalCable() {
        return this.directBurialOpticalCable;
    }

    public void setDirectBurialOpticalCable(String directBurialOpticalCable) {
        this.directBurialOpticalCable = directBurialOpticalCable;
    }

    public String getPushPipe() {
        return this.pushPipe;
    }

    public void setPushPipe(String pushPipe) {
        this.pushPipe = pushPipe;
    }

    @Override
    public String toString() {
        return "LlNewLineLength{" +
                "newLineLengthId='" + newLineLengthId + '\'' +
                ", newPoleLine='" + newPoleLine + '\'' +
                ", newPipe='" + newPipe + '\'' +
                ", directBurialOpticalCable='" + directBurialOpticalCable + '\'' +
                ", pushPipe='" + pushPipe + '\'' +
                '}';
    }
}
