package com.panyu.panyuprojectims.entity;
public class HnSupervisorUnit {
    private String supervisorUnitId;
    private String onSiteSupervision;
    private String professionResponsiblePerson;
    private String districtHead;


    public HnSupervisorUnit() {
        super();
    }
    public HnSupervisorUnit(String supervisorUnitId,String onSiteSupervision,String professionResponsiblePerson,String districtHead) {
        super();
        this.supervisorUnitId = supervisorUnitId;
        this.onSiteSupervision = onSiteSupervision;
        this.professionResponsiblePerson = professionResponsiblePerson;
        this.districtHead = districtHead;
    }
    public String getSupervisorUnitId() {
        return this.supervisorUnitId;
    }

    public void setSupervisorUnitId(String supervisorUnitId) {
        this.supervisorUnitId = supervisorUnitId;
    }

    public String getOnSiteSupervision() {
        return this.onSiteSupervision;
    }

    public void setOnSiteSupervision(String onSiteSupervision) {
        this.onSiteSupervision = onSiteSupervision;
    }

    public String getProfessionResponsiblePerson() {
        return this.professionResponsiblePerson;
    }

    public void setProfessionResponsiblePerson(String professionResponsiblePerson) {
        this.professionResponsiblePerson = professionResponsiblePerson;
    }

    public String getDistrictHead() {
        return this.districtHead;
    }

    public void setDistrictHead(String districtHead) {
        this.districtHead = districtHead;
    }

    @Override
    public String toString() {
        return "HnSupervisorUnit{" +
                "supervisorUnitId='" + supervisorUnitId + '\'' +
                ", onSiteSupervision='" + onSiteSupervision + '\'' +
                ", professionResponsiblePerson='" + professionResponsiblePerson + '\'' +
                ", districtHead='" + districtHead + '\'' +
                '}';
    }
}
