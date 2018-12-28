package com.panyu.panyuprojectims.entity;
//设计单位表
public class HnProgressDesignUnit {
    private String progressDesignUnitId;
    private String designCompanyName;
    private String designLeader;
    public HnProgressDesignUnit() {
        super();
    }
    public HnProgressDesignUnit(String progressDesignUnitId,String designCompanyName,String designLeader) {
        super();
        this.progressDesignUnitId = progressDesignUnitId;
        this.designCompanyName = designCompanyName;
        this.designLeader = designLeader;
    }
    public String getProgressDesignUnitId() {
        return this.progressDesignUnitId;
    }

    public void setProgressDesignUnitId(String progressDesignUnitId) {
        this.progressDesignUnitId = progressDesignUnitId;
    }

    public String getDesignCompanyName() {
        return this.designCompanyName;
    }

    public void setDesignCompanyName(String designCompanyName) {
        this.designCompanyName = designCompanyName;
    }

    public String getDesignLeader() {
        return this.designLeader;
    }

    public void setDesignLeader(String designLeader) {
        this.designLeader = designLeader;
    }

    @Override
    public String toString() {
        return "HnProgressDesignUnit{" +
                "progressDesignUnitId='" + progressDesignUnitId + '\'' +
                ", designCompanyName='" + designCompanyName + '\'' +
                ", designLeader='" + designLeader + '\'' +
                '}';
    }
}
