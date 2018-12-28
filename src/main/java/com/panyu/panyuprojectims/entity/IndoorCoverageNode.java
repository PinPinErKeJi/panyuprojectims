package com.panyu.panyuprojectims.entity;
public class IndoorCoverageNode {
    private String indoorNodeId;
    private String indoorNodeName;
    private String parentId;
    public IndoorCoverageNode() {
        super();
    }
    public IndoorCoverageNode(String indoorNodeId,String indoorNodeName,String parentId) {
        super();
        this.indoorNodeId = indoorNodeId;
        this.indoorNodeName = indoorNodeName;
        this.parentId = parentId;
    }
    public String getIndoorNodeId() {
        return this.indoorNodeId;
    }

    public void setIndoorNodeId(String indoorNodeId) {
        this.indoorNodeId = indoorNodeId;
    }

    public String getIndoorNodeName() {
        return this.indoorNodeName;
    }

    public void setIndoorNodeName(String indoorNodeName) {
        this.indoorNodeName = indoorNodeName;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "IndoorCoverageNode{" +
                "indoorNodeId='" + indoorNodeId + '\'' +
                ", indoorNodeName='" + indoorNodeName + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
