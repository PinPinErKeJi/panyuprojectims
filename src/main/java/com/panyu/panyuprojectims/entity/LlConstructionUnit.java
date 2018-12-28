package com.panyu.panyuprojectims.entity;
public class LlConstructionUnit {
    private String constructionUnitId;
    private String corporateName;
    private String personInCharge;

    public LlConstructionUnit() {
        super();
    }
    public LlConstructionUnit(String constructionUnitId,String corporateName,String personInCharge) {
        super();
        this.constructionUnitId = constructionUnitId;
        this.corporateName = corporateName;
        this.personInCharge = personInCharge;
    }
    public String getConstructionUnitId() {
        return this.constructionUnitId;
    }

    public void setConstructionUnitId(String constructionUnitId) {
        this.constructionUnitId = constructionUnitId;
    }

    public String getCorporateName() {
        return this.corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getPersonInCharge() {
        return this.personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    @Override
    public String toString() {
        return "LlConstructionUnit{" +
                "constructionUnitId='" + constructionUnitId + '\'' +
                ", corporateName='" + corporateName + '\'' +
                ", personInCharge='" + personInCharge + '\'' +
                '}';
    }
}
