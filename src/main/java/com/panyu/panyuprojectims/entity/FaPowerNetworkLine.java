package com.panyu.panyuprojectims.entity;
public class FaPowerNetworkLine {
    private String powerNetworkLineId;
    private String powerNumber;
    private String cableType;
    private String specificationModel;
    private String numberOfBranches;
    private String singleLength;
    private String totalLength;
    private String froms;
    private String to1;
    private String powerSupplier;
    private String powerContacts;
    public FaPowerNetworkLine() {
        super();
    }

    public FaPowerNetworkLine(String powerNetworkLineId, String powerNumber, String cableType, String specificationModel, String numberOfBranches, String singleLength, String totalLength, String froms, String to1, String powerSupplier, String powerContacts) {
        this.powerNetworkLineId = powerNetworkLineId;
        this.powerNumber = powerNumber;
        this.cableType = cableType;
        this.specificationModel = specificationModel;
        this.numberOfBranches = numberOfBranches;
        this.singleLength = singleLength;
        this.totalLength = totalLength;
        this.froms = froms;
        this.to1 = to1;
        this.powerSupplier = powerSupplier;
        this.powerContacts = powerContacts;
    }

    public String getPowerNetworkLineId() {
        return powerNetworkLineId;
    }

    public void setPowerNetworkLineId(String powerNetworkLineId) {
        this.powerNetworkLineId = powerNetworkLineId;
    }

    public String getPowerNumber() {
        return powerNumber;
    }

    public void setPowerNumber(String powerNumber) {
        this.powerNumber = powerNumber;
    }

    public String getCableType() {
        return cableType;
    }

    public void setCableType(String cableType) {
        this.cableType = cableType;
    }

    public String getSpecificationModel() {
        return specificationModel;
    }

    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
    }

    public String getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(String numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public String getSingleLength() {
        return singleLength;
    }

    public void setSingleLength(String singleLength) {
        this.singleLength = singleLength;
    }

    public String getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(String totalLength) {
        this.totalLength = totalLength;
    }

    public String getFroms() {
        return froms;
    }

    public void setFroms(String froms) {
        this.froms = froms;
    }

    public String getTo1() {
        return to1;
    }

    public void setTo1(String to1) {
        this.to1 = to1;
    }

    public String getPowerSupplier() {
        return powerSupplier;
    }

    public void setPowerSupplier(String powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public String getPowerContacts() {
        return powerContacts;
    }

    public void setPowerContacts(String powerContacts) {
        this.powerContacts = powerContacts;
    }

    @Override
    public String toString() {
        return "FaPowerNetworkLine{" +
                "powerNetworkLineId='" + powerNetworkLineId + '\'' +
                ", powerNumber='" + powerNumber + '\'' +
                ", cableType='" + cableType + '\'' +
                ", specificationModel='" + specificationModel + '\'' +
                ", numberOfBranches='" + numberOfBranches + '\'' +
                ", singleLength='" + singleLength + '\'' +
                ", totalLength='" + totalLength + '\'' +
                ", froms='" + froms + '\'' +
                ", to1='" + to1 + '\'' +
                ", powerSupplier='" + powerSupplier + '\'' +
                ", powerContacts='" + powerContacts + '\'' +
                '}';
    }
}
