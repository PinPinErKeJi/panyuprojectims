package com.panyu.panyuprojectims.entity;
//监理单位表
public class HnProgressSupervisorUnit {
    private String progressSupervisorUnitId;
    private String onSiteSupervision;
    private String professionResponsiblePerson;
    private String districtHead;
    public HnProgressSupervisorUnit() {
        super();
    }
    public HnProgressSupervisorUnit(String progressSupervisorUnitId,String onSiteSupervision,String professionResponsiblePerson,String districtHead) {
        super();
        this.progressSupervisorUnitId = progressSupervisorUnitId;
        this.onSiteSupervision = onSiteSupervision;
        this.professionResponsiblePerson = professionResponsiblePerson;
        this.districtHead = districtHead;
    }
    public String getProgressSupervisorUnitId() {
        return this.progressSupervisorUnitId;
    }

    public void setProgressSupervisorUnitId(String progressSupervisorUnitId) {
        this.progressSupervisorUnitId = progressSupervisorUnitId;
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
        return "HnProgressSupervisorUnit{" +
                "progressSupervisorUnitId='" + progressSupervisorUnitId + '\'' +
                ", onSiteSupervision='" + onSiteSupervision + '\'' +
                ", professionResponsiblePerson='" + professionResponsiblePerson + '\'' +
                ", districtHead='" + districtHead + '\'' +
                '}';
    }
}
