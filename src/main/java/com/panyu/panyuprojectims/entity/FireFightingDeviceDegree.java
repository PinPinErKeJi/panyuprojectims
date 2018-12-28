package com.panyu.panyuprojectims.entity;
public class FireFightingDeviceDegree {
    private String fireId;
    private String fireConstructionMode;
    private String handHeldNumber;
    private String sprayingMethodNumber;
    private String fireSupplierName;
    private String fireSupplierContacts;
    private String installationUnitName;
    private String installationUnitContacts;
    private String fireProgress;
    private String fireCompletionDate;
    public FireFightingDeviceDegree() {
        super();
    }
    public FireFightingDeviceDegree(String fireId,String fireConstructionMode,String handHeldNumber,String sprayingMethodNumber,String fireSupplierName,String fireSupplierContacts,String installationUnitName,String installationUnitContacts,String fireProgress,String fireCompletionDate) {
        super();
        this.fireId = fireId;
        this.fireConstructionMode = fireConstructionMode;
        this.handHeldNumber = handHeldNumber;
        this.sprayingMethodNumber = sprayingMethodNumber;
        this.fireSupplierName = fireSupplierName;
        this.fireSupplierContacts = fireSupplierContacts;
        this.installationUnitName = installationUnitName;
        this.installationUnitContacts = installationUnitContacts;
        this.fireProgress = fireProgress;
        this.fireCompletionDate = fireCompletionDate;
    }
    public String getFireId() {
        return this.fireId;
    }

    public void setFireId(String fireId) {
        this.fireId = fireId;
    }

    public String getFireConstructionMode() {
        return this.fireConstructionMode;
    }

    public void setFireConstructionMode(String fireConstructionMode) {
        this.fireConstructionMode = fireConstructionMode;
    }

    public String getHandHeldNumber() {
        return this.handHeldNumber;
    }

    public void setHandHeldNumber(String handHeldNumber) {
        this.handHeldNumber = handHeldNumber;
    }

    public String getSprayingMethodNumber() {
        return this.sprayingMethodNumber;
    }

    public void setSprayingMethodNumber(String sprayingMethodNumber) {
        this.sprayingMethodNumber = sprayingMethodNumber;
    }

    public String getFireSupplierName() {
        return this.fireSupplierName;
    }

    public void setFireSupplierName(String fireSupplierName) {
        this.fireSupplierName = fireSupplierName;
    }

    public String getFireSupplierContacts() {
        return this.fireSupplierContacts;
    }

    public void setFireSupplierContacts(String fireSupplierContacts) {
        this.fireSupplierContacts = fireSupplierContacts;
    }

    public String getInstallationUnitName() {
        return this.installationUnitName;
    }

    public void setInstallationUnitName(String installationUnitName) {
        this.installationUnitName = installationUnitName;
    }

    public String getInstallationUnitContacts() {
        return this.installationUnitContacts;
    }

    public void setInstallationUnitContacts(String installationUnitContacts) {
        this.installationUnitContacts = installationUnitContacts;
    }

    public String getFireProgress() {
        return this.fireProgress;
    }

    public void setFireProgress(String fireProgress) {
        this.fireProgress = fireProgress;
    }

    public String getFireCompletionDate() {
        return this.fireCompletionDate;
    }

    public void setFireCompletionDate(String fireCompletionDate) {
        this.fireCompletionDate = fireCompletionDate;
    }

}
