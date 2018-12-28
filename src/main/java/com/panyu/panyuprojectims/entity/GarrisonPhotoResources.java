package com.panyu.panyuprojectims.entity;
public class GarrisonPhotoResources {
    private String garrisonPhotoId;
    private String garrisonPhotoName;
    private String photoUploadPeople;
    private String qualified;
    private String problemDescription;
    private String garrisonId;
    private String garrisonSubWorkId;
    private String garrisonProjectId;
    private String garrisonInformationId;

    public GarrisonPhotoResources() {
        super();
    }

    public GarrisonPhotoResources(String garrisonPhotoId, String garrisonPhotoName, String photoUploadPeople, String qualified, String problemDescription, String garrisonId, String garrisonSubWorkId, String garrisonProjectId, String garrisonInformationId) {
        this.garrisonPhotoId = garrisonPhotoId;
        this.garrisonPhotoName = garrisonPhotoName;
        this.photoUploadPeople = photoUploadPeople;
        this.qualified = qualified;
        this.problemDescription = problemDescription;
        this.garrisonId = garrisonId;
        this.garrisonSubWorkId = garrisonSubWorkId;
        this.garrisonProjectId = garrisonProjectId;
        this.garrisonInformationId = garrisonInformationId;
    }

    public String getGarrisonPhotoId() {
        return garrisonPhotoId;
    }

    public void setGarrisonPhotoId(String garrisonPhotoId) {
        this.garrisonPhotoId = garrisonPhotoId;
    }

    public String getGarrisonPhotoName() {
        return garrisonPhotoName;
    }

    public void setGarrisonPhotoName(String garrisonPhotoName) {
        this.garrisonPhotoName = garrisonPhotoName;
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

    public String getGarrisonId() {
        return garrisonId;
    }

    public void setGarrisonId(String garrisonId) {
        this.garrisonId = garrisonId;
    }

    public String getGarrisonSubWorkId() {
        return garrisonSubWorkId;
    }

    public void setGarrisonSubWorkId(String garrisonSubWorkId) {
        this.garrisonSubWorkId = garrisonSubWorkId;
    }

    public String getGarrisonProjectId() {
        return garrisonProjectId;
    }

    public void setGarrisonProjectId(String garrisonProjectId) {
        this.garrisonProjectId = garrisonProjectId;
    }

    public String getGarrisonInformationId() {
        return garrisonInformationId;
    }

    public void setGarrisonInformationId(String garrisonInformationId) {
        this.garrisonInformationId = garrisonInformationId;
    }

    @Override
    public String toString() {
        return "GarrisonPhotoResources{" +
                "garrisonPhotoId='" + garrisonPhotoId + '\'' +
                ", garrisonPhotoName='" + garrisonPhotoName + '\'' +
                ", photoUploadPeople='" + photoUploadPeople + '\'' +
                ", qualified='" + qualified + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", garrisonId='" + garrisonId + '\'' +
                ", garrisonSubWorkId='" + garrisonSubWorkId + '\'' +
                ", garrisonProjectId='" + garrisonProjectId + '\'' +
                ", garrisonInformationId='" + garrisonInformationId + '\'' +
                '}';
    }
}
