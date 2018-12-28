package com.panyu.panyuprojectims.entity;
public class IndoorCoverageSubWork {
    private String indoorSubWorkId;
    private String indoorSubWorkName;
    private String indoorCoverageId;
    public IndoorCoverageSubWork() {
        super();
    }
    public IndoorCoverageSubWork(String indoorSubWorkId,String indoorSubWorkName,String indoorCoverageId) {
        super();
        this.indoorSubWorkId = indoorSubWorkId;
        this.indoorSubWorkName = indoorSubWorkName;
        this.indoorCoverageId = indoorCoverageId;
    }
    public String getIndoorSubWorkId() {
        return this.indoorSubWorkId;
    }

    public void setIndoorSubWorkId(String indoorSubWorkId) {
        this.indoorSubWorkId = indoorSubWorkId;
    }

    public String getIndoorSubWorkName() {
        return this.indoorSubWorkName;
    }

    public void setIndoorSubWorkName(String indoorSubWorkName) {
        this.indoorSubWorkName = indoorSubWorkName;
    }

    public String getIndoorCoverageId() {
        return this.indoorCoverageId;
    }

    public void setIndoorCoverageId(String indoorCoverageId) {
        this.indoorCoverageId = indoorCoverageId;
    }

    @Override
    public String toString() {
        return "IndoorCoverageSubWork{" +
                "indoorSubWorkId='" + indoorSubWorkId + '\'' +
                ", indoorSubWorkName='" + indoorSubWorkName + '\'' +
                ", indoorCoverageId='" + indoorCoverageId + '\'' +
                '}';
    }
}
