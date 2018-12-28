package com.panyu.panyuprojectims.entity;
public class LlCircuitNode {
    private String circuitNodeId;
    private String circuitNodeName;
    private String parentId;


    public LlCircuitNode() {
        super();
    }
    public LlCircuitNode(String circuitNodeId,String circuitNodeName,String parentId) {
        super();
        this.circuitNodeId = circuitNodeId;
        this.circuitNodeName = circuitNodeName;
        this.parentId = parentId;
    }
    public String getCircuitNodeId() {
        return this.circuitNodeId;
    }

    public void setCircuitNodeId(String circuitNodeId) {
        this.circuitNodeId = circuitNodeId;
    }

    public String getCircuitNodeName() {
        return this.circuitNodeName;
    }

    public void setCircuitNodeName(String circuitNodeName) {
        this.circuitNodeName = circuitNodeName;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "LlCircuitNode{" +
                "circuitNodeId='" + circuitNodeId + '\'' +
                ", circuitNodeName='" + circuitNodeName + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
