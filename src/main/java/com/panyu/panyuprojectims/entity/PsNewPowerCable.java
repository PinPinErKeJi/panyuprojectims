package com.panyu.panyuprojectims.entity;
public class PsNewPowerCable {
    private String newPowerCableId;
    private String newPowerCableNumber;
    private String newPowerCableModel;
    private String newPowerCableRow;
    private String powerSingleLength;
    private String powerTotalLength;
    private String beFrom;
    private String beTo;
    private String cableEquipmentSupplier;
    private String cableEquipmentLinkman;



    public PsNewPowerCable() {
        super();
    }
    public PsNewPowerCable(String newPowerCableId,String newPowerCableNumber,String newPowerCableModel,String newPowerCableRow,String powerSingleLength,String powerTotalLength,String beFrom,String beTo,String cableEquipmentSupplier,String cableEquipmentLinkman) {
        super();
        this.newPowerCableId = newPowerCableId;
        this.newPowerCableNumber = newPowerCableNumber;
        this.newPowerCableModel = newPowerCableModel;
        this.newPowerCableRow = newPowerCableRow;
        this.powerSingleLength = powerSingleLength;
        this.powerTotalLength = powerTotalLength;
        this.beFrom = beFrom;
        this.beTo = beTo;
        this.cableEquipmentSupplier = cableEquipmentSupplier;
        this.cableEquipmentLinkman = cableEquipmentLinkman;
    }
    public String getNewPowerCableId() {
        return this.newPowerCableId;
    }

    public void setNewPowerCableId(String newPowerCableId) {
        this.newPowerCableId = newPowerCableId;
    }

    public String getNewPowerCableNumber() {
        return this.newPowerCableNumber;
    }

    public void setNewPowerCableNumber(String newPowerCableNumber) {
        this.newPowerCableNumber = newPowerCableNumber;
    }

    public String getNewPowerCableModel() {
        return this.newPowerCableModel;
    }

    public void setNewPowerCableModel(String newPowerCableModel) {
        this.newPowerCableModel = newPowerCableModel;
    }

    public String getNewPowerCableRow() {
        return this.newPowerCableRow;
    }

    public void setNewPowerCableRow(String newPowerCableRow) {
        this.newPowerCableRow = newPowerCableRow;
    }

    public String getPowerSingleLength() {
        return this.powerSingleLength;
    }

    public void setPowerSingleLength(String powerSingleLength) {
        this.powerSingleLength = powerSingleLength;
    }

    public String getPowerTotalLength() {
        return this.powerTotalLength;
    }

    public void setPowerTotalLength(String powerTotalLength) {
        this.powerTotalLength = powerTotalLength;
    }

    public String getBeFrom() {
        return this.beFrom;
    }

    public void setBeFrom(String beFrom) {
        this.beFrom = beFrom;
    }

    public String getBeTo() {
        return this.beTo;
    }

    public void setBeTo(String beTo) {
        this.beTo = beTo;
    }

    public String getCableEquipmentSupplier() {
        return this.cableEquipmentSupplier;
    }

    public void setCableEquipmentSupplier(String cableEquipmentSupplier) {
        this.cableEquipmentSupplier = cableEquipmentSupplier;
    }

    public String getCableEquipmentLinkman() {
        return this.cableEquipmentLinkman;
    }

    public void setCableEquipmentLinkman(String cableEquipmentLinkman) {
        this.cableEquipmentLinkman = cableEquipmentLinkman;
    }

    @Override
    public String toString() {
        return "PsNewPowerCable{" +
                "newPowerCableId='" + newPowerCableId + '\'' +
                ", newPowerCableNumber='" + newPowerCableNumber + '\'' +
                ", newPowerCableModel='" + newPowerCableModel + '\'' +
                ", newPowerCableRow='" + newPowerCableRow + '\'' +
                ", powerSingleLength='" + powerSingleLength + '\'' +
                ", powerTotalLength='" + powerTotalLength + '\'' +
                ", beFrom='" + beFrom + '\'' +
                ", beTo='" + beTo + '\'' +
                ", cableEquipmentSupplier='" + cableEquipmentSupplier + '\'' +
                ", cableEquipmentLinkman='" + cableEquipmentLinkman + '\'' +
                '}';
    }
}
