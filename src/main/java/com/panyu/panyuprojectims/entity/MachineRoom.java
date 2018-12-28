package com.panyu.panyuprojectims.entity;
public class MachineRoom {
    private String machineRoomId;
    private String machineRoomConstructionMode;
    private String machineRoomTypeName;
    private String machineRoomConstructionName;
    private String civilEngineeringContacts;
    private String machineRoomDecorateName;
    private String decorationUnitContacts;
    public MachineRoom() {
        super();
    }
    public MachineRoom(String machineRoomId,String machineRoomConstructionMode,String machineRoomTypeName,String machineRoomConstructionName,String civilEngineeringContacts,String machineRoomDecorateName,String decorationUnitContacts) {
        super();
        this.machineRoomId = machineRoomId;
        this.machineRoomConstructionMode = machineRoomConstructionMode;
        this.machineRoomTypeName = machineRoomTypeName;
        this.machineRoomConstructionName = machineRoomConstructionName;
        this.civilEngineeringContacts = civilEngineeringContacts;
        this.machineRoomDecorateName = machineRoomDecorateName;
        this.decorationUnitContacts = decorationUnitContacts;
    }
    public String getMachineRoomId() {
        return this.machineRoomId;
    }

    public void setMachineRoomId(String machineRoomId) {
        this.machineRoomId = machineRoomId;
    }

    public String getMachineRoomConstructionMode() {
        return this.machineRoomConstructionMode;
    }

    public void setMachineRoomConstructionMode(String machineRoomConstructionMode) {
        this.machineRoomConstructionMode = machineRoomConstructionMode;
    }

    public String getMachineRoomTypeName() {
        return this.machineRoomTypeName;
    }

    public void setMachineRoomTypeName(String machineRoomTypeName) {
        this.machineRoomTypeName = machineRoomTypeName;
    }

    public String getMachineRoomConstructionName() {
        return this.machineRoomConstructionName;
    }

    public void setMachineRoomConstructionName(String machineRoomConstructionName) {
        this.machineRoomConstructionName = machineRoomConstructionName;
    }

    public String getCivilEngineeringContacts() {
        return this.civilEngineeringContacts;
    }

    public void setCivilEngineeringContacts(String civilEngineeringContacts) {
        this.civilEngineeringContacts = civilEngineeringContacts;
    }

    public String getMachineRoomDecorateName() {
        return this.machineRoomDecorateName;
    }

    public void setMachineRoomDecorateName(String machineRoomDecorateName) {
        this.machineRoomDecorateName = machineRoomDecorateName;
    }

    public String getDecorationUnitContacts() {
        return this.decorationUnitContacts;
    }

    public void setDecorationUnitContacts(String decorationUnitContacts) {
        this.decorationUnitContacts = decorationUnitContacts;
    }

    @Override
    public String toString() {
        return "MachineRoom{" +
                "machineRoomId='" + machineRoomId + '\'' +
                ", machineRoomConstructionMode='" + machineRoomConstructionMode + '\'' +
                ", machineRoomTypeName='" + machineRoomTypeName + '\'' +
                ", machineRoomConstructionName='" + machineRoomConstructionName + '\'' +
                ", civilEngineeringContacts='" + civilEngineeringContacts + '\'' +
                ", machineRoomDecorateName='" + machineRoomDecorateName + '\'' +
                ", decorationUnitContacts='" + decorationUnitContacts + '\'' +
                '}';
    }
}
