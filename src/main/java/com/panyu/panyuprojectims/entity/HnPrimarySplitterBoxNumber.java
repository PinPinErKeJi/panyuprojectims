package com.panyu.panyuprojectims.entity;
public class HnPrimarySplitterBoxNumber {
    private String primarySplitterBoxId;
    private String primaryAnchorearType;
    private String primaryWallMounted;
    public HnPrimarySplitterBoxNumber() {
        super();
    }
    public HnPrimarySplitterBoxNumber(String primarySplitterBoxId,String primaryAnchorearType,String primaryWallMounted) {
        super();
        this.primarySplitterBoxId = primarySplitterBoxId;
        this.primaryAnchorearType = primaryAnchorearType;
        this.primaryWallMounted = primaryWallMounted;
    }
    public String getPrimarySplitterBoxId() {
        return this.primarySplitterBoxId;
    }

    public void setPrimarySplitterBoxId(String primarySplitterBoxId) {
        this.primarySplitterBoxId = primarySplitterBoxId;
    }

    public String getPrimaryAnchorearType() {
        return this.primaryAnchorearType;
    }

    public void setPrimaryAnchorearType(String primaryAnchorearType) {
        this.primaryAnchorearType = primaryAnchorearType;
    }

    public String getPrimaryWallMounted() {
        return this.primaryWallMounted;
    }

    public void setPrimaryWallMounted(String primaryWallMounted) {
        this.primaryWallMounted = primaryWallMounted;
    }

    @Override
    public String toString() {
        return "HnPrimarySplitterBoxNumber{" +
                "primarySplitterBoxId='" + primarySplitterBoxId + '\'' +
                ", primaryAnchorearType='" + primaryAnchorearType + '\'' +
                ", primaryWallMounted='" + primaryWallMounted + '\'' +
                '}';
    }
}
