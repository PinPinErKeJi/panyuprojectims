package com.panyu.panyuprojectims.entity;
public class IndoorCoveragePhoto {
    private String indoorPhotoId;
    private String indoorName;
    private String photoUploadPeople;
    private String qualified;
    private String problemDescription;
    private String indoorCoverageId;
    private String indoorSubWorkId;
    private String indoorProjectId;
    private String indoorInformationId;


    public IndoorCoveragePhoto() {
        super();
    }

    public IndoorCoveragePhoto(String indoorPhotoId, String indoorName, String photoUploadPeople, String qualified, String problemDescription, String indoorCoverageId, String indoorSubWorkId, String indoorProjectId, String indoorInformationId) {
        this.indoorPhotoId = indoorPhotoId;
        this.indoorName = indoorName;
        this.photoUploadPeople = photoUploadPeople;
        this.qualified = qualified;
        this.problemDescription = problemDescription;
        this.indoorCoverageId = indoorCoverageId;
        this.indoorSubWorkId = indoorSubWorkId;
        this.indoorProjectId = indoorProjectId;
        this.indoorInformationId = indoorInformationId;
    }

    public String getIndoorPhotoId() {
        return indoorPhotoId;
    }

    public void setIndoorPhotoId(String indoorPhotoId) {
        this.indoorPhotoId = indoorPhotoId;
    }

    public String getIndoorName() {
        return indoorName;
    }

    public void setIndoorName(String indoorName) {
        this.indoorName = indoorName;
    }

    public String getPhotoUploadPeople() {
        return photoUploadPeople;
    }

    public void setPhotoUploadPeople(String photoUploadPeople) {
        this.photoUploadPeople = photoUploadPeople;
    }

    public String getQualified() {
        return qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getIndoorCoverageId() {
        return indoorCoverageId;
    }

    public void setIndoorCoverageId(String indoorCoverageId) {
        this.indoorCoverageId = indoorCoverageId;
    }

    public String getIndoorSubWorkId() {
        return indoorSubWorkId;
    }

    public void setIndoorSubWorkId(String indoorSubWorkId) {
        this.indoorSubWorkId = indoorSubWorkId;
    }

    public String getIndoorProjectId() {
        return indoorProjectId;
    }

    public void setIndoorProjectId(String indoorProjectId) {
        this.indoorProjectId = indoorProjectId;
    }

    public String getIndoorInformationId() {
        return indoorInformationId;
    }

    public void setIndoorInformationId(String indoorInformationId) {
        this.indoorInformationId = indoorInformationId;
    }

    @Override
    public String toString() {
        return "IndoorCoveragePhoto{" +
                "indoorPhotoId='" + indoorPhotoId + '\'' +
                ", indoorName='" + indoorName + '\'' +
                ", photoUploadPeople='" + photoUploadPeople + '\'' +
                ", qualified='" + qualified + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", indoorCoverageId='" + indoorCoverageId + '\'' +
                ", indoorSubWorkId='" + indoorSubWorkId + '\'' +
                ", indoorProjectId='" + indoorProjectId + '\'' +
                ", indoorInformationId='" + indoorInformationId + '\'' +
                '}';
    }
}
