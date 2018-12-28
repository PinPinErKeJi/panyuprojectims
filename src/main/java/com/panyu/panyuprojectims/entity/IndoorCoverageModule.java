package com.panyu.panyuprojectims.entity;
public class IndoorCoverageModule {
    private String indoorCoverageId;
    private String indoorCoverageName;
    public IndoorCoverageModule() {
        super();
    }
    public IndoorCoverageModule(String indoorCoverageId,String indoorCoverageName) {
        super();
        this.indoorCoverageId = indoorCoverageId;
        this.indoorCoverageName = indoorCoverageName;
    }
    public String getIndoorCoverageId() {
        return this.indoorCoverageId;
    }

    public void setIndoorCoverageId(String indoorCoverageId) {
        this.indoorCoverageId = indoorCoverageId;
    }

    public String getIndoorCoverageName() {
        return this.indoorCoverageName;
    }

    public void setIndoorCoverageName(String indoorCoverageName) {
        this.indoorCoverageName = indoorCoverageName;
    }

    @Override
    public String toString() {
        return "IndoorCoverageModule{" +
                "indoorCoverageId='" + indoorCoverageId + '\'' +
                ", indoorCoverageName='" + indoorCoverageName + '\'' +
                '}';
    }
}
