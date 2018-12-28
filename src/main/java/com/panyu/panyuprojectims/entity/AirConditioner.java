package com.panyu.panyuprojectims.entity;
public class AirConditioner {
    private String airConditionerId;
    private String airConstructionMode;
    private String conditioningBrandName;
    private String specificationTypeName;
    private String airUnitName;
    private String airConstructionContacts;
    public AirConditioner() {
        super();
    }
    public AirConditioner(String airConditionerId,String airConstructionMode,String conditioningBrandName,String specificationTypeName,String airUnitName,String airConstructionContacts) {
        super();
        this.airConditionerId = airConditionerId;
        this.airConstructionMode = airConstructionMode;
        this.conditioningBrandName = conditioningBrandName;
        this.specificationTypeName = specificationTypeName;
        this.airUnitName = airUnitName;
        this.airConstructionContacts = airConstructionContacts;
    }

    public String getAirConditionerId() {
        return airConditionerId;
    }

    public void setAirConditionerId(String airConditionerId) {
        this.airConditionerId = airConditionerId;
    }

    public String getAirConstructionMode() {
        return airConstructionMode;
    }

    public void setAirConstructionMode(String airConstructionMode) {
        this.airConstructionMode = airConstructionMode;
    }

    public String getConditioningBrandName() {
        return conditioningBrandName;
    }

    public void setConditioningBrandName(String conditioningBrandName) {
        this.conditioningBrandName = conditioningBrandName;
    }

    public String getSpecificationTypeName() {
        return specificationTypeName;
    }

    public void setSpecificationTypeName(String specificationTypeName) {
        this.specificationTypeName = specificationTypeName;
    }

    public String getAirUnitName() {
        return airUnitName;
    }

    public void setAirUnitName(String airUnitName) {
        this.airUnitName = airUnitName;
    }

    public String getAirConstructionContacts() {
        return airConstructionContacts;
    }

    public void setAirConstructionContacts(String airConstructionContacts) {
        this.airConstructionContacts = airConstructionContacts;
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "airConditionerId='" + airConditionerId + '\'' +
                ", airConstructionMode='" + airConstructionMode + '\'' +
                ", conditioningBrandName='" + conditioningBrandName + '\'' +
                ", specificationTypeName='" + specificationTypeName + '\'' +
                ", airUnitName='" + airUnitName + '\'' +
                ", airConstructionContacts='" + airConstructionContacts + '\'' +
                '}';
    }
}
