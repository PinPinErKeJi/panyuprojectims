package com.panyu.panyuprojectims.entity;
//室内覆盖施工单位
public class IcConstructionOrganization {
    private String icConstructionId;
    private String icCorporateName;
    private String personInCharge;

    public IcConstructionOrganization() {
        super();
    }
    public IcConstructionOrganization(String icConstructionId,String icCorporateName,String personInCharge) {
        super();
        this.icConstructionId = icConstructionId;
        this.icCorporateName = icCorporateName;
        this.personInCharge = personInCharge;
    }
    public String getIcConstructionId() {
        return this.icConstructionId;
    }

    public void setIcConstructionId(String icConstructionId) {
        this.icConstructionId = icConstructionId;
    }

    public String getIcCorporateName() {
        return this.icCorporateName;
    }

    public void setIcCorporateName(String icCorporateName) {
        this.icCorporateName = icCorporateName;
    }

    public String getPersonInCharge() {
        return this.personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    @Override
    public String toString() {
        return "IcConstructionOrganization{" +
                "icConstructionId='" + icConstructionId + '\'' +
                ", icCorporateName='" + icCorporateName + '\'' +
                ", personInCharge='" + personInCharge + '\'' +
                '}';
    }
}
