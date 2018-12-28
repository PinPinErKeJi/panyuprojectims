package com.panyu.panyuprojectims.entity;
public class LlWallMountedOnuWorn {
    private String wornWallMountedOnuId;
    private String wornWallMountedOnuNumber;
    private String wornWallMountedOnuSize;
    public LlWallMountedOnuWorn() {
        super();
    }
    public LlWallMountedOnuWorn(String wornWallMountedOnuId,String wornWallMountedOnuNumber,String wornWallMountedOnuSize) {
        super();
        this.wornWallMountedOnuId = wornWallMountedOnuId;
        this.wornWallMountedOnuNumber = wornWallMountedOnuNumber;
        this.wornWallMountedOnuSize = wornWallMountedOnuSize;
    }
    public String getWornWallMountedOnuId() {
        return this.wornWallMountedOnuId;
    }

    public void setWornWallMountedOnuId(String wornWallMountedOnuId) {
        this.wornWallMountedOnuId = wornWallMountedOnuId;
    }

    public String getWornWallMountedOnuNumber() {
        return this.wornWallMountedOnuNumber;
    }

    public void setWornWallMountedOnuNumber(String wornWallMountedOnuNumber) {
        this.wornWallMountedOnuNumber = wornWallMountedOnuNumber;
    }

    public String getWornWallMountedOnuSize() {
        return this.wornWallMountedOnuSize;
    }

    public void setWornWallMountedOnuSize(String wornWallMountedOnuSize) {
        this.wornWallMountedOnuSize = wornWallMountedOnuSize;
    }

    @Override
    public String toString() {
        return "LlWallMountedOnuWorn{" +
                "wornWallMountedOnuId='" + wornWallMountedOnuId + '\'' +
                ", wornWallMountedOnuNumber='" + wornWallMountedOnuNumber + '\'' +
                ", wornWallMountedOnuSize='" + wornWallMountedOnuSize + '\'' +
                '}';
    }
}
