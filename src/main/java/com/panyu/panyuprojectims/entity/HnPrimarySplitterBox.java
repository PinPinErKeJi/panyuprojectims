package com.panyu.panyuprojectims.entity;
//一级分光器箱
public class HnPrimarySplitterBox {
    private String primarySplitterBoxId;
    private String primarySplitterBoxType;
    private String primaryAnchorearType;
    private String primaryWallMounted;
    public HnPrimarySplitterBox() {
        super();
    }
    public HnPrimarySplitterBox(String primarySplitterBoxId,String primarySplitterBoxType,String primaryAnchorearType,String primaryWallMounted) {
        super();
        this.primarySplitterBoxId = primarySplitterBoxId;
        this.primarySplitterBoxType = primarySplitterBoxType;
        this.primaryAnchorearType = primaryAnchorearType;
        this.primaryWallMounted = primaryWallMounted;
    }
    public String getPrimarySplitterBoxId() {
        return this.primarySplitterBoxId;
    }

    public void setPrimarySplitterBoxId(String primarySplitterBoxId) {
        this.primarySplitterBoxId = primarySplitterBoxId;
    }

    public String getPrimarySplitterBoxType() {
        return this.primarySplitterBoxType;
    }

    public void setPrimarySplitterBoxType(String primarySplitterBoxType) {
        this.primarySplitterBoxType = primarySplitterBoxType;
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
        return "HnPrimarySplitterBox{" +
                "primarySplitterBoxId='" + primarySplitterBoxId + '\'' +
                ", primarySplitterBoxType='" + primarySplitterBoxType + '\'' +
                ", primaryAnchorearType='" + primaryAnchorearType + '\'' +
                ", primaryWallMounted='" + primaryWallMounted + '\'' +
                '}';
    }
}
