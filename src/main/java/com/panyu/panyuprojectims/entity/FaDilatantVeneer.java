package com.panyu.panyuprojectims.entity;
public class FaDilatantVeneer {
    private String dilatantVeneerId;
    private String dilatantVeneerNumber;
    private String dilatantVeneerName;
    private String dilatantVeneerFunction;
    private String veneerPlaceEquipment;
    private String dilatantVeneerEsignQuantity;
    private String dilatantVeneerInstall;
    private String veneerCutAccessNetwork;
    public FaDilatantVeneer() {
        super();
    }

    public FaDilatantVeneer(String dilatantVeneerId, String dilatantVeneerNumber, String dilatantVeneerName, String dilatantVeneerFunction, String veneerPlaceEquipment, String dilatantVeneerEsignQuantity, String dilatantVeneerInstall, String veneerCutAccessNetwork) {
        this.dilatantVeneerId = dilatantVeneerId;
        this.dilatantVeneerNumber = dilatantVeneerNumber;
        this.dilatantVeneerName = dilatantVeneerName;
        this.dilatantVeneerFunction = dilatantVeneerFunction;
        this.veneerPlaceEquipment = veneerPlaceEquipment;
        this.dilatantVeneerEsignQuantity = dilatantVeneerEsignQuantity;
        this.dilatantVeneerInstall = dilatantVeneerInstall;
        this.veneerCutAccessNetwork = veneerCutAccessNetwork;
    }

    public String getDilatantVeneerId() {
        return dilatantVeneerId;
    }

    public void setDilatantVeneerId(String dilatantVeneerId) {
        this.dilatantVeneerId = dilatantVeneerId;
    }

    public String getDilatantVeneerNumber() {
        return dilatantVeneerNumber;
    }

    public void setDilatantVeneerNumber(String dilatantVeneerNumber) {
        this.dilatantVeneerNumber = dilatantVeneerNumber;
    }

    public String getDilatantVeneerName() {
        return dilatantVeneerName;
    }

    public void setDilatantVeneerName(String dilatantVeneerName) {
        this.dilatantVeneerName = dilatantVeneerName;
    }

    public String getDilatantVeneerFunction() {
        return dilatantVeneerFunction;
    }

    public void setDilatantVeneerFunction(String dilatantVeneerFunction) {
        this.dilatantVeneerFunction = dilatantVeneerFunction;
    }

    public String getVeneerPlaceEquipment() {
        return veneerPlaceEquipment;
    }

    public void setVeneerPlaceEquipment(String veneerPlaceEquipment) {
        this.veneerPlaceEquipment = veneerPlaceEquipment;
    }

    public String getDilatantVeneerEsignQuantity() {
        return dilatantVeneerEsignQuantity;
    }

    public void setDilatantVeneerEsignQuantity(String dilatantVeneerEsignQuantity) {
        this.dilatantVeneerEsignQuantity = dilatantVeneerEsignQuantity;
    }

    public String getDilatantVeneerInstall() {
        return dilatantVeneerInstall;
    }

    public void setDilatantVeneerInstall(String dilatantVeneerInstall) {
        this.dilatantVeneerInstall = dilatantVeneerInstall;
    }

    public String getVeneerCutAccessNetwork() {
        return veneerCutAccessNetwork;
    }

    public void setVeneerCutAccessNetwork(String veneerCutAccessNetwork) {
        this.veneerCutAccessNetwork = veneerCutAccessNetwork;
    }

    @Override
    public String toString() {
        return "FaDilatantVeneer{" +
                "dilatantVeneerId='" + dilatantVeneerId + '\'' +
                ", dilatantVeneerNumber='" + dilatantVeneerNumber + '\'' +
                ", dilatantVeneerName='" + dilatantVeneerName + '\'' +
                ", dilatantVeneerFunction='" + dilatantVeneerFunction + '\'' +
                ", veneerPlaceEquipment='" + veneerPlaceEquipment + '\'' +
                ", dilatantVeneerEsignQuantity='" + dilatantVeneerEsignQuantity + '\'' +
                ", dilatantVeneerInstall='" + dilatantVeneerInstall + '\'' +
                ", veneerCutAccessNetwork='" + veneerCutAccessNetwork + '\'' +
                '}';
    }
}
