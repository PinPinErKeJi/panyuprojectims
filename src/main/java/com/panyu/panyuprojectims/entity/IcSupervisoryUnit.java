package com.panyu.panyuprojectims.entity;
//室内覆盖监理单位
public class IcSupervisoryUnit {
    private String icSupervisoryUnitId;
    private String professionResponsiblePerson;
    private String districtHead;
    private String siteLeader;

    public IcSupervisoryUnit() {
        super();
    }
    public IcSupervisoryUnit(String icSupervisoryUnitId,String professionResponsiblePerson,String districtHead,String siteLeader) {
        super();
        this.icSupervisoryUnitId = icSupervisoryUnitId;
        this.professionResponsiblePerson = professionResponsiblePerson;
        this.districtHead = districtHead;
        this.siteLeader = siteLeader;
    }
    public String getIcSupervisoryUnitId() {
        return this.icSupervisoryUnitId;
    }

    public void setIcSupervisoryUnitId(String icSupervisoryUnitId) {
        this.icSupervisoryUnitId = icSupervisoryUnitId;
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

    public String getSiteLeader() {
        return this.siteLeader;
    }

    public void setSiteLeader(String siteLeader) {
        this.siteLeader = siteLeader;
    }

    @Override
    public String toString() {
        return "IcSupervisoryUnit{" +
                "icSupervisoryUnitId='" + icSupervisoryUnitId + '\'' +
                ", professionResponsiblePerson='" + professionResponsiblePerson + '\'' +
                ", districtHead='" + districtHead + '\'' +
                ", siteLeader='" + siteLeader + '\'' +
                '}';
    }
}
