package com.panyu.panyuprojectims.entity;
public class HnGarrisonNode {
    private String garrisonNodeId;
    private String garrisonNodeName;
    private String parentId;


    public HnGarrisonNode() {
        super();
    }
    public HnGarrisonNode(String garrisonNodeId,String garrisonNodeName,String parentId) {
        super();
        this.garrisonNodeId = garrisonNodeId;
        this.garrisonNodeName = garrisonNodeName;
        this.parentId = parentId;
    }
    public String getGarrisonNodeId() {
        return this.garrisonNodeId;
    }

    public void setGarrisonNodeId(String garrisonNodeId) {
        this.garrisonNodeId = garrisonNodeId;
    }

    public String getGarrisonNodeName() {
        return this.garrisonNodeName;
    }

    public void setGarrisonNodeName(String garrisonNodeName) {
        this.garrisonNodeName = garrisonNodeName;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "HnGarrisonNode{" +
                "garrisonNodeId='" + garrisonNodeId + '\'' +
                ", garrisonNodeName='" + garrisonNodeName + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
