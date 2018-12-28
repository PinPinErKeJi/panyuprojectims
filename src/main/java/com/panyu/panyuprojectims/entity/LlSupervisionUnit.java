package com.panyu.panyuprojectims.entity;
public class LlSupervisionUnit {
    private String supervisionUnitId;
    private String siteLeader;
    private String professionResponsiblePerson;
    private String districtHead;
    public LlSupervisionUnit() {
        super();
    }
    public LlSupervisionUnit(String supervisionUnitId,String siteLeader,String professionResponsiblePerson,String districtHead) {
        super();
        this.supervisionUnitId = supervisionUnitId;
        this.siteLeader = siteLeader;
        this.professionResponsiblePerson = professionResponsiblePerson;
        this.districtHead = districtHead;
    }
    public String getSupervisionUnitId() {
        return this.supervisionUnitId;
    }

    public void setSupervisionUnitId(String supervisionUnitId) {
        this.supervisionUnitId = supervisionUnitId;
    }

    public String getSiteLeader() {
        return this.siteLeader;
    }

    public void setSiteLeader(String siteLeader) {
        this.siteLeader = siteLeader;
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
        return "LlSupervisionUnit{" +
                "supervisionUnitId='" + supervisionUnitId + '\'' +
                ", siteLeader='" + siteLeader + '\'' +
                ", professionResponsiblePerson='" + professionResponsiblePerson + '\'' +
                ", districtHead='" + districtHead + '\'' +
                '}';
    }
}
