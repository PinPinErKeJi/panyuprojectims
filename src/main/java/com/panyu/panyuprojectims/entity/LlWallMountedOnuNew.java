package com.panyu.panyuprojectims.entity;
public class LlWallMountedOnuNew {
    private String newWallMountedOnuId;
    private String newWallMountedOnuNumber;
    private String newWallMountedOnuSize;
    public LlWallMountedOnuNew() {
        super();
    }
    public LlWallMountedOnuNew(String newWallMountedOnuId,String newWallMountedOnuNumber,String newWallMountedOnuSize) {
        super();
        this.newWallMountedOnuId = newWallMountedOnuId;
        this.newWallMountedOnuNumber = newWallMountedOnuNumber;
        this.newWallMountedOnuSize = newWallMountedOnuSize;
    }
    public String getNewWallMountedOnuId() {
        return this.newWallMountedOnuId;
    }

    public void setNewWallMountedOnuId(String newWallMountedOnuId) {
        this.newWallMountedOnuId = newWallMountedOnuId;
    }

    public String getNewWallMountedOnuNumber() {
        return this.newWallMountedOnuNumber;
    }

    public void setNewWallMountedOnuNumber(String newWallMountedOnuNumber) {
        this.newWallMountedOnuNumber = newWallMountedOnuNumber;
    }

    public String getNewWallMountedOnuSize() {
        return this.newWallMountedOnuSize;
    }

    public void setNewWallMountedOnuSize(String newWallMountedOnuSize) {
        this.newWallMountedOnuSize = newWallMountedOnuSize;
    }

    @Override
    public String toString() {
        return "LlWallMountedOnuNew{" +
                "newWallMountedOnuId='" + newWallMountedOnuId + '\'' +
                ", newWallMountedOnuNumber='" + newWallMountedOnuNumber + '\'' +
                ", newWallMountedOnuSize='" + newWallMountedOnuSize + '\'' +
                '}';
    }
}
