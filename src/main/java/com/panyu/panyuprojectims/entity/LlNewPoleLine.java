package com.panyu.panyuprojectims.entity;
public class LlNewPoleLine {
    private String newPoleLineId;
    private String poleDesignLength;
    private String poleCompletionLength;
    public LlNewPoleLine() {
        super();
    }
    public LlNewPoleLine(String newPoleLineId,String poleDesignLength,String poleCompletionLength) {
        super();
        this.newPoleLineId = newPoleLineId;
        this.poleDesignLength = poleDesignLength;
        this.poleCompletionLength = poleCompletionLength;
    }
    public String getNewPoleLineId() {
        return this.newPoleLineId;
    }

    public void setNewPoleLineId(String newPoleLineId) {
        this.newPoleLineId = newPoleLineId;
    }

    public String getPoleDesignLength() {
        return this.poleDesignLength;
    }

    public void setPoleDesignLength(String poleDesignLength) {
        this.poleDesignLength = poleDesignLength;
    }

    public String getPoleCompletionLength() {
        return this.poleCompletionLength;
    }

    public void setPoleCompletionLength(String poleCompletionLength) {
        this.poleCompletionLength = poleCompletionLength;
    }

    @Override
    public String toString() {
        return "LlNewPoleLine{" +
                "newPoleLineId='" + newPoleLineId + '\'' +
                ", poleDesignLength='" + poleDesignLength + '\'' +
                ", poleCompletionLength='" + poleCompletionLength + '\'' +
                '}';
    }
}
