package com.panyu.panyuprojectims.entity;
//施工单位表
public class HnProgressConstructionUnit {
    private String progressConstructionId;
    private String progressCompanyName;
    private String progressLeader;
    public HnProgressConstructionUnit() {
        super();
    }
    public HnProgressConstructionUnit(String progressConstructionId,String progressCompanyName,String progressLeader) {
        super();
        this.progressConstructionId = progressConstructionId;
        this.progressCompanyName = progressCompanyName;
        this.progressLeader = progressLeader;
    }
    public String getProgressConstructionId() {
        return this.progressConstructionId;
    }

    public void setProgressConstructionId(String progressConstructionId) {
        this.progressConstructionId = progressConstructionId;
    }

    public String getProgressCompanyName() {
        return this.progressCompanyName;
    }

    public void setProgressCompanyName(String progressCompanyName) {
        this.progressCompanyName = progressCompanyName;
    }

    public String getProgressLeader() {
        return this.progressLeader;
    }

    public void setProgressLeader(String progressLeader) {
        this.progressLeader = progressLeader;
    }

    @Override
    public String toString() {
        return "HnProgressConstructionUnit{" +
                "progressConstructionId='" + progressConstructionId + '\'' +
                ", progressCompanyName='" + progressCompanyName + '\'' +
                ", progressLeader='" + progressLeader + '\'' +
                '}';
    }
}
