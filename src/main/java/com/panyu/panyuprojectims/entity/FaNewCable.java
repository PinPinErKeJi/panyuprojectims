package com.panyu.panyuprojectims.entity;
public class FaNewCable {
    private String newCableId;
    private String newCableNumber;
    private String newCableType;
    private String newCableSpecificationModel;
    private String newCableLength;
    private String newCableForm;
    private String newCableTo;
    private String cableConstructionProgress;
    private String newCableMakespan;
    public FaNewCable() {
        super();
    }
    public FaNewCable(String newCableId,String newCableNumber,String newCableType,String newCableSpecificationModel,String newCableLength,String newCableForm,String newCableTo,String cableConstructionProgress,String newCableMakespan) {
        super();
        this.newCableId = newCableId;
        this.newCableNumber = newCableNumber;
        this.newCableType = newCableType;
        this.newCableSpecificationModel = newCableSpecificationModel;
        this.newCableLength = newCableLength;
        this.newCableForm = newCableForm;
        this.newCableTo = newCableTo;
        this.cableConstructionProgress = cableConstructionProgress;
        this.newCableMakespan = newCableMakespan;
    }
    public String getNewCableId() {
        return this.newCableId;
    }

    public void setNewCableId(String newCableId) {
        this.newCableId = newCableId;
    }

    public String getNewCableNumber() {
        return this.newCableNumber;
    }

    public void setNewCableNumber(String newCableNumber) {
        this.newCableNumber = newCableNumber;
    }

    public String getNewCableType() {
        return this.newCableType;
    }

    public void setNewCableType(String newCableType) {
        this.newCableType = newCableType;
    }

    public String getNewCableSpecificationModel() {
        return this.newCableSpecificationModel;
    }

    public void setNewCableSpecificationModel(String newCableSpecificationModel) {
        this.newCableSpecificationModel = newCableSpecificationModel;
    }

    public String getNewCableLength() {
        return this.newCableLength;
    }

    public void setNewCableLength(String newCableLength) {
        this.newCableLength = newCableLength;
    }

    public String getNewCableForm() {
        return this.newCableForm;
    }

    public void setNewCableForm(String newCableForm) {
        this.newCableForm = newCableForm;
    }

    public String getNewCableTo() {
        return this.newCableTo;
    }

    public void setNewCableTo(String newCableTo) {
        this.newCableTo = newCableTo;
    }

    public String getCableConstructionProgress() {
        return this.cableConstructionProgress;
    }

    public void setCableConstructionProgress(String cableConstructionProgress) {
        this.cableConstructionProgress = cableConstructionProgress;
    }

    public String getNewCableMakespan() {
        return this.newCableMakespan;
    }

    public void setNewCableMakespan(String newCableMakespan) {
        this.newCableMakespan = newCableMakespan;
    }

    @Override
    public String toString() {
        return "FaNewCable{" +
                "newCableId='" + newCableId + '\'' +
                ", newCableNumber='" + newCableNumber + '\'' +
                ", newCableType='" + newCableType + '\'' +
                ", newCableSpecificationModel='" + newCableSpecificationModel + '\'' +
                ", newCableLength='" + newCableLength + '\'' +
                ", newCableForm='" + newCableForm + '\'' +
                ", newCableTo='" + newCableTo + '\'' +
                ", cableConstructionProgress='" + cableConstructionProgress + '\'' +
                ", newCableMakespan='" + newCableMakespan + '\'' +
                '}';
    }
}
