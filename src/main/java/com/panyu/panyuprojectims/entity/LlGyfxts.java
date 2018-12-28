package com.panyu.panyuprojectims.entity;
public class LlGyfxts {
    private String gyfxtsId;
    private String gyfxtsDesignLength;
    private String gyfxtsLaidLength;
    public LlGyfxts() {
        super();
    }
    public LlGyfxts(String gyfxtsId,String gyfxtsDesignLength,String gyfxtsLaidLength) {
        super();
        this.gyfxtsId = gyfxtsId;
        this.gyfxtsDesignLength = gyfxtsDesignLength;
        this.gyfxtsLaidLength = gyfxtsLaidLength;
    }
    public String getGyfxtsId() {
        return this.gyfxtsId;
    }

    public void setGyfxtsId(String gyfxtsId) {
        this.gyfxtsId = gyfxtsId;
    }

    public String getGyfxtsDesignLength() {
        return this.gyfxtsDesignLength;
    }

    public void setGyfxtsDesignLength(String gyfxtsDesignLength) {
        this.gyfxtsDesignLength = gyfxtsDesignLength;
    }

    public String getGyfxtsLaidLength() {
        return this.gyfxtsLaidLength;
    }

    public void setGyfxtsLaidLength(String gyfxtsLaidLength) {
        this.gyfxtsLaidLength = gyfxtsLaidLength;
    }

    @Override
    public String toString() {
        return "LlGyfxts{" +
                "gyfxtsId='" + gyfxtsId + '\'' +
                ", gyfxtsDesignLength='" + gyfxtsDesignLength + '\'' +
                ", gyfxtsLaidLength='" + gyfxtsLaidLength + '\'' +
                '}';
    }
}
