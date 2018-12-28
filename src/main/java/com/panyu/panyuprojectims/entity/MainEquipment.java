package com.panyu.panyuprojectims.entity;
public class MainEquipment {
    private String mainEquipmentId;
    private String equipmentConstructionMode;
    private String equipmentTypeName;
    private String equipmentSupplierName;
    private String equipmentSupplierContacts;
    private String equipmentUnitName;
    private String equipmentUnitContacts;
    public MainEquipment() {
        super();
    }
    public MainEquipment(String mainEquipmentId,String equipmentConstructionMode,String equipmentTypeName,String equipmentSupplierName,String equipmentSupplierContacts,String equipmentUnitName,String equipmentUnitContacts) {
        super();
        this.mainEquipmentId = mainEquipmentId;
        this.equipmentConstructionMode = equipmentConstructionMode;
        this.equipmentTypeName = equipmentTypeName;
        this.equipmentSupplierName = equipmentSupplierName;
        this.equipmentSupplierContacts = equipmentSupplierContacts;
        this.equipmentUnitName = equipmentUnitName;
        this.equipmentUnitContacts = equipmentUnitContacts;
    }
    public String getMainEquipmentId() {
        return this.mainEquipmentId;
    }

    public void setMainEquipmentId(String mainEquipmentId) {
        this.mainEquipmentId = mainEquipmentId;
    }

    public String getEquipmentConstructionMode() {
        return this.equipmentConstructionMode;
    }

    public void setEquipmentConstructionMode(String equipmentConstructionMode) {
        this.equipmentConstructionMode = equipmentConstructionMode;
    }

    public String getEquipmentTypeName() {
        return this.equipmentTypeName;
    }

    public void setEquipmentTypeName(String equipmentTypeName) {
        this.equipmentTypeName = equipmentTypeName;
    }

    public String getEquipmentSupplierName() {
        return this.equipmentSupplierName;
    }

    public void setEquipmentSupplierName(String equipmentSupplierName) {
        this.equipmentSupplierName = equipmentSupplierName;
    }

    public String getEquipmentSupplierContacts() {
        return this.equipmentSupplierContacts;
    }

    public void setEquipmentSupplierContacts(String equipmentSupplierContacts) {
        this.equipmentSupplierContacts = equipmentSupplierContacts;
    }

    public String getEquipmentUnitName() {
        return this.equipmentUnitName;
    }

    public void setEquipmentUnitName(String equipmentUnitName) {
        this.equipmentUnitName = equipmentUnitName;
    }

    public String getEquipmentUnitContacts() {
        return this.equipmentUnitContacts;
    }

    public void setEquipmentUnitContacts(String equipmentUnitContacts) {
        this.equipmentUnitContacts = equipmentUnitContacts;
    }

    @Override
    public String toString() {
        return "MainEquipment{" +
                "mainEquipmentId='" + mainEquipmentId + '\'' +
                ", equipmentConstructionMode='" + equipmentConstructionMode + '\'' +
                ", equipmentTypeName='" + equipmentTypeName + '\'' +
                ", equipmentSupplierName='" + equipmentSupplierName + '\'' +
                ", equipmentSupplierContacts='" + equipmentSupplierContacts + '\'' +
                ", equipmentUnitName='" + equipmentUnitName + '\'' +
                ", equipmentUnitContacts='" + equipmentUnitContacts + '\'' +
                '}';
    }
}
