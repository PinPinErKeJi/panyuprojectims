package com.panyu.panyuprojectims.entity;
public class FaCabinetPowerFrame {
    private String equipmentId;
    private String equipmentNumber;
    private String equipmentType;
    private String equipmentName;
    private String equipmentModel;
    private String equipmentDesignQuantity;
    private String equipmentSize;
    private String equipmentSupplier;
    private String equipmentContacts;

    public FaCabinetPowerFrame() {
        super();
    }
    public FaCabinetPowerFrame(String equipmentId,String equipmentNumber,String equipmentType,String equipmentName,String equipmentModel,String equipmentDesignQuantity,String equipmentSize,String equipmentSupplier,String equipmentContacts) {
        super();
        this.equipmentId = equipmentId;
        this.equipmentNumber = equipmentNumber;
        this.equipmentType = equipmentType;
        this.equipmentName = equipmentName;
        this.equipmentModel = equipmentModel;
        this.equipmentDesignQuantity = equipmentDesignQuantity;
        this.equipmentSize = equipmentSize;
        this.equipmentSupplier = equipmentSupplier;
        this.equipmentContacts = equipmentContacts;
    }
    public String getEquipmentId() {
        return this.equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentNumber() {
        return this.equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public String getEquipmentType() {
        return this.equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentName() {
        return this.equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentModel() {
        return this.equipmentModel;
    }

    public void setEquipmentModel(String equipmentModel) {
        this.equipmentModel = equipmentModel;
    }

    public String getEquipmentDesignQuantity() {
        return this.equipmentDesignQuantity;
    }

    public void setEquipmentDesignQuantity(String equipmentDesignQuantity) {
        this.equipmentDesignQuantity = equipmentDesignQuantity;
    }

    public String getEquipmentSize() {
        return this.equipmentSize;
    }

    public void setEquipmentSize(String equipmentSize) {
        this.equipmentSize = equipmentSize;
    }

    public String getEquipmentSupplier() {
        return this.equipmentSupplier;
    }

    public void setEquipmentSupplier(String equipmentSupplier) {
        this.equipmentSupplier = equipmentSupplier;
    }

    public String getEquipmentContacts() {
        return this.equipmentContacts;
    }

    public void setEquipmentContacts(String equipmentContacts) {
        this.equipmentContacts = equipmentContacts;
    }

    @Override
    public String toString() {
        return "FaCabinetPowerFrame{" +
                "equipmentId='" + equipmentId + '\'' +
                ", equipmentNumber='" + equipmentNumber + '\'' +
                ", equipmentType='" + equipmentType + '\'' +
                ", equipmentName='" + equipmentName + '\'' +
                ", equipmentModel='" + equipmentModel + '\'' +
                ", equipmentDesignQuantity='" + equipmentDesignQuantity + '\'' +
                ", equipmentSize='" + equipmentSize + '\'' +
                ", equipmentSupplier='" + equipmentSupplier + '\'' +
                ", equipmentContacts='" + equipmentContacts + '\'' +
                '}';
    }
}
