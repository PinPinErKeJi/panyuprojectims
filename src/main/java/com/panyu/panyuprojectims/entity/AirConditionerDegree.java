package com.panyu.panyuprojectims.entity;
public class AirConditionerDegree {
    private String airConditionerId;
    private String airConstructionMode;
    private String conditioningBrandName;
    private String specificationTypeName;
    private String airUnitName;
    private String airConstructionContacts;
    private String airProgress;
    private String airCompletionDate;
    public AirConditionerDegree() {
        super();
    }
    public AirConditionerDegree(String airConditionerId,String airConstructionMode,String conditioningBrandName,String specificationTypeName,String airUnitName,String airConstructionContacts,String airProgress,String airCompletionDate) {
        super();
        this.airConditionerId = airConditionerId;
        this.airConstructionMode = airConstructionMode;
        this.conditioningBrandName = conditioningBrandName;
        this.specificationTypeName = specificationTypeName;
        this.airUnitName = airUnitName;
        this.airConstructionContacts = airConstructionContacts;
        this.airProgress = airProgress;
        this.airCompletionDate = airCompletionDate;
    }
    public String getAirConditionerId() {
        return this.airConditionerId;
    }

    public void setAirConditionerId(String airConditionerId) {
        this.airConditionerId = airConditionerId;
    }

    public String getAirConstructionMode() {
        return this.airConstructionMode;
    }

    public void setAirConstructionMode(String airConstructionMode) {
        this.airConstructionMode = airConstructionMode;
    }

    public String getConditioningBrandName() {
        return this.conditioningBrandName;
    }

    public void setConditioningBrandName(String conditioningBrandName) {
        this.conditioningBrandName = conditioningBrandName;
    }

    public String getSpecificationTypeName() {
        return this.specificationTypeName;
    }

    public void setSpecificationTypeName(String specificationTypeName) {
        this.specificationTypeName = specificationTypeName;
    }

    public String getAirUnitName() {
        return this.airUnitName;
    }

    public void setAirUnitName(String airUnitName) {
        this.airUnitName = airUnitName;
    }

    public String getAirConstructionContacts() {
        return this.airConstructionContacts;
    }

    public void setAirConstructionContacts(String airConstructionContacts) {
        this.airConstructionContacts = airConstructionContacts;
    }

    public String getAirProgress() {
        return this.airProgress;
    }

    public void setAirProgress(String airProgress) {
        this.airProgress = airProgress;
    }

    public String getAirCompletionDate() {
        return this.airCompletionDate;
    }

    public void setAirCompletionDate(String airCompletionDate) {
        this.airCompletionDate = airCompletionDate;
    }

}
