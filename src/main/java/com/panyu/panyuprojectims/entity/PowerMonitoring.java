package com.panyu.panyuprojectims.entity;
public class PowerMonitoring {
    private String powerMonitoringId;
    private String powerConstructionMode;
    private String powerSupplierName;
    private String powerSupplierContacts;
    private String powerUnitName;
    private String powerUnitContacts;
    public PowerMonitoring() {
        super();
    }
    public PowerMonitoring(String powerMonitoringId,String powerConstructionMode,String powerSupplierName,String powerSupplierContacts,String powerUnitName,String powerUnitContacts) {
        super();
        this.powerMonitoringId = powerMonitoringId;
        this.powerConstructionMode = powerConstructionMode;
        this.powerSupplierName = powerSupplierName;
        this.powerSupplierContacts = powerSupplierContacts;
        this.powerUnitName = powerUnitName;
        this.powerUnitContacts = powerUnitContacts;
    }
    public String getPowerMonitoringId() {
        return this.powerMonitoringId;
    }

    public void setPowerMonitoringId(String powerMonitoringId) {
        this.powerMonitoringId = powerMonitoringId;
    }

    public String getPowerConstructionMode() {
        return this.powerConstructionMode;
    }

    public void setPowerConstructionMode(String powerConstructionMode) {
        this.powerConstructionMode = powerConstructionMode;
    }

    public String getPowerSupplierName() {
        return this.powerSupplierName;
    }

    public void setPowerSupplierName(String powerSupplierName) {
        this.powerSupplierName = powerSupplierName;
    }

    public String getPowerSupplierContacts() {
        return this.powerSupplierContacts;
    }

    public void setPowerSupplierContacts(String powerSupplierContacts) {
        this.powerSupplierContacts = powerSupplierContacts;
    }

    public String getPowerUnitName() {
        return this.powerUnitName;
    }

    public void setPowerUnitName(String powerUnitName) {
        this.powerUnitName = powerUnitName;
    }

    public String getPowerUnitContacts() {
        return this.powerUnitContacts;
    }

    public void setPowerUnitContacts(String powerUnitContacts) {
        this.powerUnitContacts = powerUnitContacts;
    }

    @Override
    public String toString() {
        return "PowerMonitoring{" +
                "powerMonitoringId='" + powerMonitoringId + '\'' +
                ", powerConstructionMode='" + powerConstructionMode + '\'' +
                ", powerSupplierName='" + powerSupplierName + '\'' +
                ", powerSupplierContacts='" + powerSupplierContacts + '\'' +
                ", powerUnitName='" + powerUnitName + '\'' +
                ", powerUnitContacts='" + powerUnitContacts + '\'' +
                '}';
    }
}
