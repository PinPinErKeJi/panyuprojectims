package com.panyu.panyuprojectims.entity;

import java.util.List;

public class IndoorCoverageProject {
    private String indoorProjectId;
    private String indoorProjectName;
    private String indoorSubWorkId;
    private String indoorSpecificationName;
    private List<IndoorCoveragePhoto> indoorCoveragePhotoList;
    public IndoorCoverageProject() {
        super();
    }

    public IndoorCoverageProject(String indoorProjectId, String indoorProjectName, String indoorSubWorkId, String indoorSpecificationName, List<IndoorCoveragePhoto> indoorCoveragePhotoList) {
        this.indoorProjectId = indoorProjectId;
        this.indoorProjectName = indoorProjectName;
        this.indoorSubWorkId = indoorSubWorkId;
        this.indoorSpecificationName = indoorSpecificationName;
        this.indoorCoveragePhotoList = indoorCoveragePhotoList;
    }

    public String getIndoorProjectId() {
        return indoorProjectId;
    }

    public void setIndoorProjectId(String indoorProjectId) {
        this.indoorProjectId = indoorProjectId;
    }

    public String getIndoorProjectName() {
        return indoorProjectName;
    }

    public void setIndoorProjectName(String indoorProjectName) {
        this.indoorProjectName = indoorProjectName;
    }

    public String getIndoorSubWorkId() {
        return indoorSubWorkId;
    }

    public void setIndoorSubWorkId(String indoorSubWorkId) {
        this.indoorSubWorkId = indoorSubWorkId;
    }

    public String getIndoorSpecificationName() {
        return indoorSpecificationName;
    }

    public void setIndoorSpecificationName(String indoorSpecificationName) {
        this.indoorSpecificationName = indoorSpecificationName;
    }

    public List<IndoorCoveragePhoto> getIndoorCoveragePhotoList() {
        return indoorCoveragePhotoList;
    }

    public void setIndoorCoveragePhotoList(List<IndoorCoveragePhoto> indoorCoveragePhotoList) {
        this.indoorCoveragePhotoList = indoorCoveragePhotoList;
    }

    @Override
    public String toString() {
        return "IndoorCoverageProject{" +
                "indoorProjectId='" + indoorProjectId + '\'' +
                ", indoorProjectName='" + indoorProjectName + '\'' +
                ", indoorSubWorkId='" + indoorSubWorkId + '\'' +
                ", indoorSpecificationName='" + indoorSpecificationName + '\'' +
                ", indoorCoveragePhotoList=" + indoorCoveragePhotoList +
                '}';
    }
}
