package com.panyu.panyuprojectims.entity;
public class LlGysta {
    private String gystaId;
    private String gystaDesignLength;
    private String gystaLaidLength;
    public LlGysta() {
        super();
    }
    public LlGysta(String gystaId,String gystaDesignLength,String gystaLaidLength) {
        super();
        this.gystaId = gystaId;
        this.gystaDesignLength = gystaDesignLength;
        this.gystaLaidLength = gystaLaidLength;
    }
    public String getGystaId() {
        return this.gystaId;
    }

    public void setGystaId(String gystaId) {
        this.gystaId = gystaId;
    }

    public String getGystaDesignLength() {
        return this.gystaDesignLength;
    }

    public void setGystaDesignLength(String gystaDesignLength) {
        this.gystaDesignLength = gystaDesignLength;
    }

    public String getGystaLaidLength() {
        return this.gystaLaidLength;
    }

    public void setGystaLaidLength(String gystaLaidLength) {
        this.gystaLaidLength = gystaLaidLength;
    }

    @Override
    public String toString() {
        return "LlGysta{" +
                "gystaId='" + gystaId + '\'' +
                ", gystaDesignLength='" + gystaDesignLength + '\'' +
                ", gystaLaidLength='" + gystaLaidLength + '\'' +
                '}';
    }
}
