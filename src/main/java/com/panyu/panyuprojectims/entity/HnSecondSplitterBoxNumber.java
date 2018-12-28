package com.panyu.panyuprojectims.entity;
public class HnSecondSplitterBoxNumber {
    private String secondSplitterBoxId;
    private String secondAnchorearType;
    private String secondWallMounted;
    public HnSecondSplitterBoxNumber() {
        super();
    }
    public HnSecondSplitterBoxNumber(String secondSplitterBoxId,String secondAnchorearType,String secondWallMounted) {
        super();
        this.secondSplitterBoxId = secondSplitterBoxId;
        this.secondAnchorearType = secondAnchorearType;
        this.secondWallMounted = secondWallMounted;
    }
    public String getSecondSplitterBoxId() {
        return this.secondSplitterBoxId;
    }

    public void setSecondSplitterBoxId(String secondSplitterBoxId) {
        this.secondSplitterBoxId = secondSplitterBoxId;
    }

    public String getSecondAnchorearType() {
        return this.secondAnchorearType;
    }

    public void setSecondAnchorearType(String secondAnchorearType) {
        this.secondAnchorearType = secondAnchorearType;
    }

    public String getSecondWallMounted() {
        return this.secondWallMounted;
    }

    public void setSecondWallMounted(String secondWallMounted) {
        this.secondWallMounted = secondWallMounted;
    }

    @Override
    public String toString() {
        return "HnSecondSplitterBoxNumber{" +
                "secondSplitterBoxId='" + secondSplitterBoxId + '\'' +
                ", secondAnchorearType='" + secondAnchorearType + '\'' +
                ", secondWallMounted='" + secondWallMounted + '\'' +
                '}';
    }
}
