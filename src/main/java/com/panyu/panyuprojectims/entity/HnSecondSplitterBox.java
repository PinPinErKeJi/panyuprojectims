package com.panyu.panyuprojectims.entity;
//二级分光器箱
public class HnSecondSplitterBox {
    private String secondSplitterBoxId;
    private String secondSplitterBoxType;
    private String secondAnchorearType;
    private String secondWallMounted;
    public HnSecondSplitterBox() {
        super();
    }
    public HnSecondSplitterBox(String secondSplitterBoxId,String secondSplitterBoxType,String secondAnchorearType,String secondWallMounted) {
        super();
        this.secondSplitterBoxId = secondSplitterBoxId;
        this.secondSplitterBoxType = secondSplitterBoxType;
        this.secondAnchorearType = secondAnchorearType;
        this.secondWallMounted = secondWallMounted;
    }
    public String getSecondSplitterBoxId() {
        return this.secondSplitterBoxId;
    }

    public void setSecondSplitterBoxId(String secondSplitterBoxId) {
        this.secondSplitterBoxId = secondSplitterBoxId;
    }

    public String getSecondSplitterBoxType() {
        return this.secondSplitterBoxType;
    }

    public void setSecondSplitterBoxType(String secondSplitterBoxType) {
        this.secondSplitterBoxType = secondSplitterBoxType;
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
        return "HnSecondSplitterBox{" +
                "secondSplitterBoxId='" + secondSplitterBoxId + '\'' +
                ", secondSplitterBoxType='" + secondSplitterBoxType + '\'' +
                ", secondAnchorearType='" + secondAnchorearType + '\'' +
                ", secondWallMounted='" + secondWallMounted + '\'' +
                '}';
    }
}
