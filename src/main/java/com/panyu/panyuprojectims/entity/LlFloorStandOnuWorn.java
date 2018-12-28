package com.panyu.panyuprojectims.entity;
public class LlFloorStandOnuWorn {
    private String wornFloorStandId;
    private String wornFloorStandNumber;
    private String wornFloorStandSize;
    public LlFloorStandOnuWorn() {
        super();
    }
    public LlFloorStandOnuWorn(String wornFloorStandId,String wornFloorStandNumber,String wornFloorStandSize) {
        super();
        this.wornFloorStandId = wornFloorStandId;
        this.wornFloorStandNumber = wornFloorStandNumber;
        this.wornFloorStandSize = wornFloorStandSize;
    }
    public String getWornFloorStandId() {
        return this.wornFloorStandId;
    }

    public void setWornFloorStandId(String wornFloorStandId) {
        this.wornFloorStandId = wornFloorStandId;
    }

    public String getWornFloorStandNumber() {
        return this.wornFloorStandNumber;
    }

    public void setWornFloorStandNumber(String wornFloorStandNumber) {
        this.wornFloorStandNumber = wornFloorStandNumber;
    }

    public String getWornFloorStandSize() {
        return this.wornFloorStandSize;
    }

    public void setWornFloorStandSize(String wornFloorStandSize) {
        this.wornFloorStandSize = wornFloorStandSize;
    }

    @Override
    public String toString() {
        return "LlFloorStandOnuWorn{" +
                "wornFloorStandId='" + wornFloorStandId + '\'' +
                ", wornFloorStandNumber='" + wornFloorStandNumber + '\'' +
                ", wornFloorStandSize='" + wornFloorStandSize + '\'' +
                '}';
    }
}
