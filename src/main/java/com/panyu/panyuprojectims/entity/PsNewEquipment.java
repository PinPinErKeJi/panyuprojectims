package com.panyu.panyuprojectims.entity;
public class PsNewEquipment {
    private String powerEquipmentId;
    private String powerEquipmentNumber;
    private String powerEquipmentType;
    private String powerEquipmentModel;
    private String equipmentDesignStart;
    private String powerEquipmentSize;
    private String powerEquipmentSupplier;
    private String powerEquipmentLinkman;


    public PsNewEquipment() {
        super();
    }
    public PsNewEquipment(String powerEquipmentId,String powerEquipmentNumber,String powerEquipmentType,String powerEquipmentModel,String equipmentDesignStart,String powerEquipmentSize,String powerEquipmentSupplier,String powerEquipmentLinkman) {
        super();
        this.powerEquipmentId = powerEquipmentId;
        this.powerEquipmentNumber = powerEquipmentNumber;
        this.powerEquipmentType = powerEquipmentType;
        this.powerEquipmentModel = powerEquipmentModel;
        this.equipmentDesignStart = equipmentDesignStart;
        this.powerEquipmentSize = powerEquipmentSize;
        this.powerEquipmentSupplier = powerEquipmentSupplier;
        this.powerEquipmentLinkman = powerEquipmentLinkman;
    }
    public String getPowerEquipmentId() {
        return this.powerEquipmentId;
    }

    public void setPowerEquipmentId(String powerEquipmentId) {
        this.powerEquipmentId = powerEquipmentId;
    }

    public String getPowerEquipmentNumber() {
        return this.powerEquipmentNumber;
    }

    public void setPowerEquipmentNumber(String powerEquipmentNumber) {
        this.powerEquipmentNumber = powerEquipmentNumber;
    }

    public String getPowerEquipmentType() {
        return this.powerEquipmentType;
    }

    public void setPowerEquipmentType(String powerEquipmentType) {
        this.powerEquipmentType = powerEquipmentType;
    }

    public String getPowerEquipmentModel() {
        return this.powerEquipmentModel;
    }

    public void setPowerEquipmentModel(String powerEquipmentModel) {
        this.powerEquipmentModel = powerEquipmentModel;
    }

    public String getEquipmentDesignStart() {
        return this.equipmentDesignStart;
    }

    public void setEquipmentDesignStart(String equipmentDesignStart) {
        this.equipmentDesignStart = equipmentDesignStart;
    }

    public String getPowerEquipmentSize() {
        return this.powerEquipmentSize;
    }

    public void setPowerEquipmentSize(String powerEquipmentSize) {
        this.powerEquipmentSize = powerEquipmentSize;
    }

    public String getPowerEquipmentSupplier() {
        return this.powerEquipmentSupplier;
    }

    public void setPowerEquipmentSupplier(String powerEquipmentSupplier) {
        this.powerEquipmentSupplier = powerEquipmentSupplier;
    }

    public String getPowerEquipmentLinkman() {
        return this.powerEquipmentLinkman;
    }

    public void setPowerEquipmentLinkman(String powerEquipmentLinkman) {
        this.powerEquipmentLinkman = powerEquipmentLinkman;
    }

    @Override
    public String toString() {
        return "PsNewEquipment{" +
                "powerEquipmentId='" + powerEquipmentId + '\'' +
                ", powerEquipmentNumber='" + powerEquipmentNumber + '\'' +
                ", powerEquipmentType='" + powerEquipmentType + '\'' +
                ", powerEquipmentModel='" + powerEquipmentModel + '\'' +
                ", equipmentDesignStart='" + equipmentDesignStart + '\'' +
                ", powerEquipmentSize='" + powerEquipmentSize + '\'' +
                ", powerEquipmentSupplier='" + powerEquipmentSupplier + '\'' +
                ", powerEquipmentLinkman='" + powerEquipmentLinkman + '\'' +
                '}';
    }
}
