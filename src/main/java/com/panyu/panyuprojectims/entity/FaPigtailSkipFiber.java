package com.panyu.panyuprojectims.entity;
public class FaPigtailSkipFiber {
    private String pigtailSkipFiberId;
    private String pigtailNumber;
    private String fiberCableType;
    private String fiberSpecificationModel;
    private String fiberNumberOfBranches;
    private String fiberSingleLength;
    private String forms;
    private String to2;
    private String fiberSupplier;
    private String fiberContacts;
    public FaPigtailSkipFiber() {
        super();
    }

    public FaPigtailSkipFiber(String pigtailSkipFiberId, String pigtailNumber, String fiberCableType, String fiberSpecificationModel, String fiberNumberOfBranches, String fiberSingleLength, String forms, String to2, String fiberSupplier, String fiberContacts) {
        this.pigtailSkipFiberId = pigtailSkipFiberId;
        this.pigtailNumber = pigtailNumber;
        this.fiberCableType = fiberCableType;
        this.fiberSpecificationModel = fiberSpecificationModel;
        this.fiberNumberOfBranches = fiberNumberOfBranches;
        this.fiberSingleLength = fiberSingleLength;
        this.forms = forms;
        this.to2 = to2;
        this.fiberSupplier = fiberSupplier;
        this.fiberContacts = fiberContacts;
    }

    public String getPigtailSkipFiberId() {
        return pigtailSkipFiberId;
    }

    public void setPigtailSkipFiberId(String pigtailSkipFiberId) {
        this.pigtailSkipFiberId = pigtailSkipFiberId;
    }

    public String getPigtailNumber() {
        return pigtailNumber;
    }

    public void setPigtailNumber(String pigtailNumber) {
        this.pigtailNumber = pigtailNumber;
    }

    public String getFiberCableType() {
        return fiberCableType;
    }

    public void setFiberCableType(String fiberCableType) {
        this.fiberCableType = fiberCableType;
    }

    public String getFiberSpecificationModel() {
        return fiberSpecificationModel;
    }

    public void setFiberSpecificationModel(String fiberSpecificationModel) {
        this.fiberSpecificationModel = fiberSpecificationModel;
    }

    public String getFiberNumberOfBranches() {
        return fiberNumberOfBranches;
    }

    public void setFiberNumberOfBranches(String fiberNumberOfBranches) {
        this.fiberNumberOfBranches = fiberNumberOfBranches;
    }

    public String getFiberSingleLength() {
        return fiberSingleLength;
    }

    public void setFiberSingleLength(String fiberSingleLength) {
        this.fiberSingleLength = fiberSingleLength;
    }

    public String getForms() {
        return forms;
    }

    public void setForms(String forms) {
        this.forms = forms;
    }

    public String getTo2() {
        return to2;
    }

    public void setTo2(String to2) {
        this.to2 = to2;
    }

    public String getFiberSupplier() {
        return fiberSupplier;
    }

    public void setFiberSupplier(String fiberSupplier) {
        this.fiberSupplier = fiberSupplier;
    }

    public String getFiberContacts() {
        return fiberContacts;
    }

    public void setFiberContacts(String fiberContacts) {
        this.fiberContacts = fiberContacts;
    }

    @Override
    public String toString() {
        return "FaPigtailSkipFiber{" +
                "pigtailSkipFiberId='" + pigtailSkipFiberId + '\'' +
                ", pigtailNumber='" + pigtailNumber + '\'' +
                ", fiberCableType='" + fiberCableType + '\'' +
                ", fiberSpecificationModel='" + fiberSpecificationModel + '\'' +
                ", fiberNumberOfBranches='" + fiberNumberOfBranches + '\'' +
                ", fiberSingleLength='" + fiberSingleLength + '\'' +
                ", forms='" + forms + '\'' +
                ", to2='" + to2 + '\'' +
                ", fiberSupplier='" + fiberSupplier + '\'' +
                ", fiberContacts='" + fiberContacts + '\'' +
                '}';
    }
}
