package com.panyu.panyuprojectims.entity;
public class PsNewCablingRack {
    private String newCablingRackId;
    private String newCablingRackNumber;
    private String rackDesignStart;
    private String rackEquipmentSupplier;
    private String rackEquipmentLinkman;



    public PsNewCablingRack() {
        super();
    }
    public PsNewCablingRack(String newCablingRackId,String newCablingRackNumber,String rackDesignStart,String rackEquipmentSupplier,String rackEquipmentLinkman) {
        super();
        this.newCablingRackId = newCablingRackId;
        this.newCablingRackNumber = newCablingRackNumber;
        this.rackDesignStart = rackDesignStart;
        this.rackEquipmentSupplier = rackEquipmentSupplier;
        this.rackEquipmentLinkman = rackEquipmentLinkman;
    }
    public String getNewCablingRackId() {
        return this.newCablingRackId;
    }

    public void setNewCablingRackId(String newCablingRackId) {
        this.newCablingRackId = newCablingRackId;
    }

    public String getNewCablingRackNumber() {
        return this.newCablingRackNumber;
    }

    public void setNewCablingRackNumber(String newCablingRackNumber) {
        this.newCablingRackNumber = newCablingRackNumber;
    }

    public String getRackDesignStart() {
        return this.rackDesignStart;
    }

    public void setRackDesignStart(String rackDesignStart) {
        this.rackDesignStart = rackDesignStart;
    }

    public String getRackEquipmentSupplier() {
        return this.rackEquipmentSupplier;
    }

    public void setRackEquipmentSupplier(String rackEquipmentSupplier) {
        this.rackEquipmentSupplier = rackEquipmentSupplier;
    }

    public String getRackEquipmentLinkman() {
        return this.rackEquipmentLinkman;
    }

    public void setRackEquipmentLinkman(String rackEquipmentLinkman) {
        this.rackEquipmentLinkman = rackEquipmentLinkman;
    }

    @Override
    public String toString() {
        return "PsNewCablingRack{" +
                "newCablingRackId='" + newCablingRackId + '\'' +
                ", newCablingRackNumber='" + newCablingRackNumber + '\'' +
                ", rackDesignStart='" + rackDesignStart + '\'' +
                ", rackEquipmentSupplier='" + rackEquipmentSupplier + '\'' +
                ", rackEquipmentLinkman='" + rackEquipmentLinkman + '\'' +
                '}';
    }
}
