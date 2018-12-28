package com.panyu.panyuprojectims.entity;
public class LlFloorStandOnuNew {
    private String newFloorStandId;
    private String newFloorStandNumber;
    private String newFloorStandSize;
    public LlFloorStandOnuNew() {
        super();
    }
    public LlFloorStandOnuNew(String newFloorStandId,String newFloorStandNumber,String newFloorStandSize) {
        super();
        this.newFloorStandId = newFloorStandId;
        this.newFloorStandNumber = newFloorStandNumber;
        this.newFloorStandSize = newFloorStandSize;
    }
    public String getNewFloorStandId() {
        return this.newFloorStandId;
    }

    public void setNewFloorStandId(String newFloorStandId) {
        this.newFloorStandId = newFloorStandId;
    }

    public String getNewFloorStandNumber() {
        return this.newFloorStandNumber;
    }

    public void setNewFloorStandNumber(String newFloorStandNumber) {
        this.newFloorStandNumber = newFloorStandNumber;
    }

    public String getNewFloorStandSize() {
        return this.newFloorStandSize;
    }

    public void setNewFloorStandSize(String newFloorStandSize) {
        this.newFloorStandSize = newFloorStandSize;
    }

    @Override
    public String toString() {
        return "LlFloorStandOnuNew{" +
                "newFloorStandId='" + newFloorStandId + '\'' +
                ", newFloorStandNumber='" + newFloorStandNumber + '\'' +
                ", newFloorStandSize='" + newFloorStandSize + '\'' +
                '}';
    }
}
