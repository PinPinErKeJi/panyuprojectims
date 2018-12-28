package com.panyu.panyuprojectims.entity;
public class IndoorCoverageSpecification {
    private String indoorSpecificationId;
    private String indoorSpecificationName;
    private String indoorQualified;
    private String indoorProblem;
    private String indoorPhoto;
    private String indoorProjectId;
    public IndoorCoverageSpecification() {
        super();
    }
    public IndoorCoverageSpecification(String indoorSpecificationId,String indoorSpecificationName,String indoorQualified,String indoorProblem,String indoorPhoto,String indoorProjectId) {
        super();
        this.indoorSpecificationId = indoorSpecificationId;
        this.indoorSpecificationName = indoorSpecificationName;
        this.indoorQualified = indoorQualified;
        this.indoorProblem = indoorProblem;
        this.indoorPhoto = indoorPhoto;
        this.indoorProjectId = indoorProjectId;
    }
    public String getIndoorSpecificationId() {
        return this.indoorSpecificationId;
    }

    public void setIndoorSpecificationId(String indoorSpecificationId) {
        this.indoorSpecificationId = indoorSpecificationId;
    }

    public String getIndoorSpecificationName() {
        return this.indoorSpecificationName;
    }

    public void setIndoorSpecificationName(String indoorSpecificationName) {
        this.indoorSpecificationName = indoorSpecificationName;
    }

    public String getIndoorQualified() {
        return this.indoorQualified;
    }

    public void setIndoorQualified(String indoorQualified) {
        this.indoorQualified = indoorQualified;
    }

    public String getIndoorProblem() {
        return this.indoorProblem;
    }

    public void setIndoorProblem(String indoorProblem) {
        this.indoorProblem = indoorProblem;
    }

    public String getIndoorPhoto() {
        return this.indoorPhoto;
    }

    public void setIndoorPhoto(String indoorPhoto) {
        this.indoorPhoto = indoorPhoto;
    }

    public String getIndoorProjectId() {
        return this.indoorProjectId;
    }

    public void setIndoorProjectId(String indoorProjectId) {
        this.indoorProjectId = indoorProjectId;
    }

    @Override
    public String
    toString() {
        return "IndoorCoverageSpecification{" +
                "indoorSpecificationId='" + indoorSpecificationId + '\'' +
                ", indoorSpecificationName='" + indoorSpecificationName + '\'' +
                ", indoorQualified='" + indoorQualified + '\'' +
                ", indoorProblem='" + indoorProblem + '\'' +
                ", indoorPhoto='" + indoorPhoto + '\'' +
                ", indoorProjectId='" + indoorProjectId + '\'' +
                '}';
    }
}
