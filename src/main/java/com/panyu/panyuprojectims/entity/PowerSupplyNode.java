package com.panyu.panyuprojectims.entity;
public class PowerSupplyNode {
    private String powerSupplyNodeId;
    private String powerSupplyNodeName;
    private String parentId;

    public PowerSupplyNode() {
        super();
    }
    public PowerSupplyNode(String powerSupplyNodeId,String powerSupplyNodeName,String parentId) {
        super();
        this.powerSupplyNodeId = powerSupplyNodeId;
        this.powerSupplyNodeName = powerSupplyNodeName;
        this.parentId = parentId;
    }
    public String getPowerSupplyNodeId() {
        return this.powerSupplyNodeId;
    }

    public void setPowerSupplyNodeId(String powerSupplyNodeId) {
        this.powerSupplyNodeId = powerSupplyNodeId;
    }

    public String getPowerSupplyNodeName() {
        return this.powerSupplyNodeName;
    }

    public void setPowerSupplyNodeName(String powerSupplyNodeName) {
        this.powerSupplyNodeName = powerSupplyNodeName;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "PowerSupplyNode{" +
                "powerSupplyNodeId='" + powerSupplyNodeId + '\'' +
                ", powerSupplyNodeName='" + powerSupplyNodeName + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
