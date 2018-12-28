package com.panyu.panyuprojectims.entity;

import java.util.List;

public class FaEquipmentNode {
    private String equipmentNodeId;
    private String equipmentNodeName;
    private String parentId;
    private List<FaEquipmentNode> faEquipmentNodeList;

    public FaEquipmentNode() {
    }

    public FaEquipmentNode(String equipmentNodeId, String equipmentNodeName, String parentId, List<FaEquipmentNode> faEquipmentNodeList) {
        this.equipmentNodeId = equipmentNodeId;
        this.equipmentNodeName = equipmentNodeName;
        this.parentId = parentId;
        this.faEquipmentNodeList = faEquipmentNodeList;
    }

    public String getEquipmentNodeId() {
        return equipmentNodeId;
    }

    public void setEquipmentNodeId(String equipmentNodeId) {
        this.equipmentNodeId = equipmentNodeId;
    }

    public String getEquipmentNodeName() {
        return equipmentNodeName;
    }

    public void setEquipmentNodeName(String equipmentNodeName) {
        this.equipmentNodeName = equipmentNodeName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<FaEquipmentNode> getFaEquipmentNodeList() {
        return faEquipmentNodeList;
    }

    public void setFaEquipmentNodeList(List<FaEquipmentNode> faEquipmentNodeList) {
        this.faEquipmentNodeList = faEquipmentNodeList;
    }

    @Override
    public String toString() {
        return "FaEquipmentNode{" +
                "equipmentNodeId='" + equipmentNodeId + '\'' +
                ", equipmentNodeName='" + equipmentNodeName + '\'' +
                ", parentId='" + parentId + '\'' +
                ", faEquipmentNodeList=" + faEquipmentNodeList +
                '}';
    }
}
